package ru.kupryanov.client.application.home;

import javax.inject.Inject;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.AbstractCellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.RangeChangeEvent;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Pagination;
import org.gwtbootstrap3.client.ui.constants.ButtonType;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.gwt.ButtonCell;
import org.gwtbootstrap3.client.ui.gwt.CellTable;
import org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker;

import com.google.gwt.cell.client.FieldUpdater;
import ru.kupryanov.server.dao.TaskDAO;
import ru.kupryanov.shared.dto.Task;

import java.util.ArrayList;
import java.util.Date;

public class HomeView extends ViewWithUiHandlers<HomeUiHandlers> implements HomePresenter.MyView {

    @Override
    public void addTaskInTable(Task task) {

    }

    @Override
    public void updateTable(ArrayList<Task> tasks) {

    }

    interface Binder extends UiBinder<Widget, HomeView> {
    }
    @UiField(provided = true)
    CellTable<Task> cellTable = new CellTable<>(10);
    @UiField
    Pagination cellTablePagination;
    @UiField
    TextArea text;
    @UiField
    Button button11;
    @UiField
    DateTimePicker date;

    private SimplePager cellTablePager = new SimplePager();
    private ListDataProvider<Task> cellTableProvider = new ListDataProvider<>();

    @Inject
    HomeView(final Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        initTable(cellTable, cellTablePager, cellTablePagination, cellTableProvider);
        initMockData(cellTablePagination, cellTablePager, cellTableProvider);
    }

    private void initMockData(final Pagination pagination, final SimplePager simplePager, final ListDataProvider<Task> dataProvider) {
        dataProvider.flush();
        pagination.rebuild(simplePager);
    }

    private void initTable(final AbstractCellTable<Task> grid, final SimplePager pager, final Pagination pagination, final ListDataProvider<Task> dataProvider) {

        final TextColumn<Task> col1 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                return task.getTask();
            }
        };
        text.setValue("");
        grid.addColumn(col1, "Задача");

        final TextColumn<Task> col2 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                return task.getDue().toString();
            }
        };
        grid.addColumn(col2, "Дата");

        final Column<Task, Boolean> col0 = new Column<Task, Boolean>(new CheckboxCell()) {
            @Override
            public Boolean getValue(Task task) {
                return false;
            }
        };
        grid.addColumn(col0, "Выполненность");

        final Column<Task, String> col3 = new Column<Task, String>(new ButtonCell(ButtonType.PRIMARY, IconType.GITHUB)) {
            @Override
            public String getValue(Task object) {
                return "Удалить";
            }
        };
        col3.setFieldUpdater(new FieldUpdater<Task, String>() {
            @Override
            public void update(int index, Task object, String value) {
                dataProvider.getList().remove(index);
                Window.alert("Удалено!");
            }
        });
        grid.addColumn(col3, "");
        grid.addRangeChangeHandler(new RangeChangeEvent.Handler() {
            @Override
            public void onRangeChange(final RangeChangeEvent event) {
                pagination.rebuild(pager);
            }
        });
        pagination.clear();

    }

    @UiHandler("button11")
    public void saveTask(ClickEvent event){
        getUiHandlers().saveTask(this.text.getText(), this.date.getValue());
    }
}
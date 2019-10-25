package ru.kupryanov.client.application.home;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.RangeChangeEvent;
import com.google.inject.Inject;
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
    interface Binder extends UiBinder<Widget, HomeView> {
    }
    @UiField
    CellTable<Task> cellTable;
    @UiField
    TextArea text;
    @UiField
    Button button11;
    @UiField
    DateTimePicker date;

    private SimplePager cellTablePager = new SimplePager();
    private ListDataProvider<Task> cellTableProvider = new ListDataProvider<>();

    @Inject
    HomeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        this.text.setTitle("keklol");
        initTable();
    }


    private void initTable(){
        CheckboxCell checkboxCell = new CheckboxCell();

        final Column<Task, Boolean> col1 = new Column<Task, Boolean>(new CheckboxCell()) {
            @Override
            public Boolean getValue(Task task) {
                return false;
            }
        };
        col1.setFieldUpdater(new FieldUpdater<Task, Boolean>() {
            @Override
            public void update(int i, Task task, Boolean aBoolean) {
            }
        });
        cellTable.addColumn(col1, "Lolkek");

        final TextColumn<Task> col2 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                return task.getTask();
            }
        };
        cellTable.addColumn(col2, "Task");

        final TextColumn<Task> col3 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                //return new SimpleDateFormat("dd.MM.yyyy").format(task.getDue());
                return task.getDue().getDate() + "." + task.getDue().getMonth() + "." + (task.getDue().getYear() + 1900);
            }
        };
        cellTable.addColumn(col3, "Due");

        final Column<Task, String> col4 = new Column<Task, String>(new ButtonCell(ButtonType.PRIMARY, IconType.GITHUB)) {
            @Override
            public String getValue(Task object) {
                return "Удалить";
            }
        };
        col4.setFieldUpdater(new FieldUpdater<Task, String>() {
            @Override
            public void update(int index, Task object, String value) {

                Window.alert("Удалено!");
            }
        });
        cellTable.addColumn(col4, "");


    }

    @UiHandler("button11")
    public void saveTask(ClickEvent event){
        getUiHandlers().saveTask(this.text.getText(), this.date.getValue());
    }

    @Override
    public void addTaskInTable(Task task) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(task);
        this.cellTable.setRowData(tasks);
    }

    @Override
    public void updateTable(ArrayList<Task> tasks) {
        this.cellTable.setRowData(tasks);
    }
}

package ru.kupryanov.client.application.images;

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
import java.util.List;

public class ImagesView extends ViewWithUiHandlers<ImagesUiHandlers> implements ImagesPresenter.MyView {
    @Override
    public void UpdateTable(ArrayList<Task> list) {
        this.cellTable.setRowData(list);
    }

    @Override
    public void addTaskInTable(Task task) {

    }

    interface Binder extends UiBinder<Widget, ImagesView> {
    }
    @UiField
    CellTable<Task> cellTable;
    private SimplePager cellTablePager = new SimplePager();
    private ListDataProvider<Task> cellTableProvider = new ListDataProvider<>();

    @Inject
    ImagesView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
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
        cellTable.addColumn(col1, "Выполненность");

        final TextColumn<Task> col2 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                return task.getTask();
            }
        };
        cellTable.addColumn(col2, "Задача");

        final TextColumn<Task> col3 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                //return new SimpleDateFormat("dd.MM.yyyy").format(task.getDue());
                return task.getDue().getDate() + "." + task.getDue().getMonth() + "." + (task.getDue().getYear() + 1900);
            }
        };
        cellTable.addColumn(col3, "Дата");
        col1.setCellStyleNames("knopka1");
    }
}

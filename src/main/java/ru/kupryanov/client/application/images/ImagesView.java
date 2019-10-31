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
    interface Binder extends UiBinder<Widget, ImagesView> {

    }
    @UiField
    CellTable<Task> cellTable;
    private ArrayList<Task> tasks = new ArrayList<>();
    @Override
    public void UpdateTable(ArrayList<Task> list) {
        this.cellTable.setRowData(list);
        Window.alert(""+tasks.size());
    }
    @Override
    public void addTaskInTable(Task task) {
        this.tasks.add(task);
        UpdateTable(tasks);
    }


    @Inject
    ImagesView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        initTable();
    }

    private void initTable(){

        final TextColumn<Task> col1 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                return "'"+task.getTask()+"' was done";
            }
        };
        cellTable.addColumn(col1, "Дерево123");

        final TextColumn<Task> col2 = new TextColumn<Task>() {
            @Override
            public String getValue(Task task) {
                //return new SimpleDateFormat("dd.MM.yyyy").format(task.getDue());
                return task.getDue().getDate() + "." + task.getDue().getMonth() + "." + (task.getDue().getYear() + 1900);
            }
        };
        cellTable.addColumn(col2, "Собака");

    }
}

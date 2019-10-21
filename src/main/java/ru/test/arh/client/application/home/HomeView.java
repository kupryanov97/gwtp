package ru.test.arh.client.application.home;

import javax.inject.Inject;
import static com.googlecode.objectify.ObjectifyService.ofy;
import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.AbstractCellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.RangeChangeEvent;
import com.googlecode.objectify.ObjectifyService;
import com.gwtplatform.mvp.client.ViewImpl;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Pagination;
import org.gwtbootstrap3.client.ui.constants.ButtonType;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.gwt.ButtonCell;
import org.gwtbootstrap3.client.ui.gwt.CellTable;
import org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker;
import ru.test.arh.client.pojo.TableTestPojo;
import com.google.gwt.cell.client.FieldUpdater;

import java.util.Date;

public class HomeView extends ViewImpl implements HomePresenter.MyView {
    @UiField(provided = true)
    CellTable<TableTestPojo> cellTable = new CellTable<TableTestPojo>(10);
    @UiField
    Pagination cellTablePagination;
    @UiField
    TextArea text;
    @UiField
    Button button11;
    @UiField
    DateTimePicker date;


    interface Binder extends UiBinder<Widget, HomeView> {
    }
    private SimplePager cellTablePager = new SimplePager();
    private ListDataProvider<TableTestPojo> cellTableProvider = new ListDataProvider<TableTestPojo>();

    @Inject
    HomeView(final Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        initTable(cellTable, cellTablePager, cellTablePagination, cellTableProvider);
        initMockData(cellTablePagination, cellTablePager, cellTableProvider);
    }

    private void initMockData(final Pagination pagination, final SimplePager simplePager, final ListDataProvider<TableTestPojo> dataProvider) {
        dataProvider.flush();
        pagination.rebuild(simplePager);
    }

    private void initTable(final AbstractCellTable<TableTestPojo> grid, final SimplePager pager, final Pagination pagination, final ListDataProvider<TableTestPojo> dataProvider) {

        final TextColumn<TableTestPojo> col1 = new TextColumn<TableTestPojo>() {

            @Override
            public String getValue(final TableTestPojo object) {
                return text.getValue();
            }
        };
        text.setValue("");
        grid.addColumn(col1, "Задача");

        final TextColumn<TableTestPojo> col2 = new TextColumn<TableTestPojo>() {

            @Override
            public String getValue(final TableTestPojo object) {
                return String.valueOf(object.getField1());
            }
        };
        grid.addColumn(col2, "Дата");

        final Column<TableTestPojo, Boolean> col0 = new Column<TableTestPojo, Boolean>(new CheckboxCell()) {
            @Override
            public Boolean getValue(TableTestPojo task) {

                return false;
            }
        };
        grid.addColumn(col0, "Выполненность");
        final Column<TableTestPojo, String> col3 = new Column<TableTestPojo, String>(new ButtonCell(ButtonType.PRIMARY, IconType.GITHUB)) {
            @Override
            public String getValue(TableTestPojo object) {
                return "Удалить";
            }
        };
        col3.setFieldUpdater(new FieldUpdater<TableTestPojo, String>() {
            @Override
            public void update(int index, TableTestPojo object, String value) {

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
        this.button11.addClickHandler(new ClickHandler() {
            Date date1 = new Date();
            @Override
            public void onClick(ClickEvent clickEvent) {
                dataProvider.getList().add(new TableTestPojo(date.getValue(), "Test ", true));

                Window.alert("Добавлено!");
            }
        });

        pager.setDisplay(grid);
        pagination.clear();
        dataProvider.addDataDisplay(grid);
    }
}
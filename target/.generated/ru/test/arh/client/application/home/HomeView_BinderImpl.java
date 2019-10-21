// .ui.xml template last modified: 1571409536443
package ru.test.arh.client.application.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class HomeView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ru.test.arh.client.application.home.HomeView>, ru.test.arh.client.application.home.HomeView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<form action='/#images'> <button type='submit'>Кнопка-ссылка</button> </form> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span> <span id='{6}'></span> <span id='{7}'></span> <span id='{8}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ru.test.arh.client.application.home.HomeView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ru.test.arh.client.application.home.HomeView owner;


    public Widgets(final ru.test.arh.client.application.home.HomeView owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ru.test.arh.client.application.home.HomeView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ru.test.arh.client.application.home.HomeView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ru.test.arh.client.application.home.HomeView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ru.test.arh.client.application.home.HomeView_BinderImpl_GenBundle) GWT.create(ru.test.arh.client.application.home.HomeView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for res called 0 times. Type: IMPORTED. Build precedence: 1.
     */
    private ru.test.arh.client.resources.AppResources get_res() {
      return build_res();
    }
    private ru.test.arh.client.resources.AppResources build_res() {
      // Creation section.
      final ru.test.arh.client.resources.AppResources res = (ru.test.arh.client.resources.AppResources) GWT.create(ru.test.arh.client.resources.AppResources.class);
      // Setup section.

      return res;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();
        get_domId3Element().get();
        get_domId4Element().get();
        get_domId5Element().get();
        get_domId6Element().get();
        get_domId7Element().get();
        get_domId8Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_Lead2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_cellTable(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_cellTablePagination(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_PanelBody3(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Progress4(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Panel6(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_main(), get_domId6Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_dialogBox(), get_domId7Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Modal11(), get_domId8Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for f_Lead2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Lead get_f_Lead2() {
      return build_f_Lead2();
    }
    private org.gwtbootstrap3.client.ui.Lead build_f_Lead2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Lead f_Lead2 = (org.gwtbootstrap3.client.ui.Lead) GWT.create(org.gwtbootstrap3.client.ui.Lead.class);
      // Setup section.
      f_Lead2.setText("Я устал на:");

      return f_Lead2;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for cellTable called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.gwt.CellTable get_cellTable() {
      return build_cellTable();
    }
    private org.gwtbootstrap3.client.ui.gwt.CellTable build_cellTable() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.CellTable cellTable = owner.cellTable;
      assert cellTable != null : "UiField cellTable with 'provided = true' was null";
      // Setup section.
      cellTable.setStriped(true);
      cellTable.setHover(true);
      cellTable.setCondensed(true);
      cellTable.setBordered(true);

      return cellTable;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for cellTablePagination called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_cellTablePagination() {
      return build_cellTablePagination();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_cellTablePagination() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination cellTablePagination = (org.gwtbootstrap3.client.ui.Pagination) GWT.create(org.gwtbootstrap3.client.ui.Pagination.class);
      // Setup section.

      this.owner.cellTablePagination = cellTablePagination;

      return cellTablePagination;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for f_PanelBody3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody3() {
      return build_f_PanelBody3();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody3 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      f_PanelBody3.add(get_dataGrid());
      f_PanelBody3.add(get_dataGridPagination());

      return f_PanelBody3;
    }

    /**
     * Getter for dataGrid called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.gwt.DataGrid get_dataGrid() {
      return build_dataGrid();
    }
    private org.gwtbootstrap3.client.ui.gwt.DataGrid build_dataGrid() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.gwt.DataGrid dataGrid = owner.dataGrid;
      assert dataGrid != null : "UiField dataGrid with 'provided = true' was null";
      // Setup section.
      dataGrid.setStriped(true);
      dataGrid.setHover(true);
      dataGrid.setWidth("100%");
      dataGrid.setCondensed(true);
      dataGrid.setBordered(true);
      dataGrid.setHeight("300px");

      return dataGrid;
    }

    /**
     * Getter for dataGridPagination called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Pagination get_dataGridPagination() {
      return build_dataGridPagination();
    }
    private org.gwtbootstrap3.client.ui.Pagination build_dataGridPagination() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Pagination dataGridPagination = (org.gwtbootstrap3.client.ui.Pagination) GWT.create(org.gwtbootstrap3.client.ui.Pagination.class);
      // Setup section.

      this.owner.dataGridPagination = dataGridPagination;

      return dataGridPagination;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }

    /**
     * Getter for f_Progress4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress4() {
      return build_f_Progress4();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress4 = (org.gwtbootstrap3.client.ui.Progress) GWT.create(org.gwtbootstrap3.client.ui.Progress.class);
      // Setup section.
      f_Progress4.add(get_f_ProgressBar5());
      f_Progress4.setType(org.gwtbootstrap3.client.ui.constants.ProgressType.STRIPED);

      return f_Progress4;
    }

    /**
     * Getter for f_ProgressBar5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar5() {
      return build_f_ProgressBar5();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar5 = (org.gwtbootstrap3.client.ui.ProgressBar) GWT.create(org.gwtbootstrap3.client.ui.ProgressBar.class);
      // Setup section.
      f_ProgressBar5.setText("60%");
      f_ProgressBar5.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.DANGER);
      f_ProgressBar5.setPercent(60);

      return f_ProgressBar5;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.

      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId5;
    }

    /**
     * Getter for f_Panel6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel6() {
      return build_f_Panel6();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel6 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel6.add(get_f_PanelHeader7());
      f_Panel6.add(get_f_PanelFooter9());
      f_Panel6.setStyleName("pan");

      return f_Panel6;
    }

    /**
     * Getter for f_PanelHeader7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader7() {
      return build_f_PanelHeader7();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader7 = (org.gwtbootstrap3.client.ui.PanelHeader) GWT.create(org.gwtbootstrap3.client.ui.PanelHeader.class);
      // Setup section.
      f_PanelHeader7.add(get_f_Heading8());

      return f_PanelHeader7;
    }

    /**
     * Getter for f_Heading8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading8() {
      return build_f_Heading8();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading8 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading8.setText("Ваш список дел:");

      return f_Heading8;
    }

    /**
     * Getter for f_PanelFooter9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter9() {
      return build_f_PanelFooter9();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter9 = (org.gwtbootstrap3.client.ui.PanelFooter) GWT.create(org.gwtbootstrap3.client.ui.PanelFooter.class);
      // Setup section.
      f_PanelFooter9.add(get_f_Button10());

      return f_PanelFooter9;
    }

    /**
     * Getter for f_Button10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button10() {
      return build_f_Button10();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button10 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button10.setText("Тык сюда");
      f_Button10.setSize(org.gwtbootstrap3.client.ui.constants.ButtonSize.LARGE);
      f_Button10.setDataToggle(org.gwtbootstrap3.client.ui.constants.Toggle.MODAL);
      f_Button10.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);
      f_Button10.setDataTarget("#myModal");

      return f_Button10;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.

      return domId5Element;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId6;
    }

    /**
     * Getter for main called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_main() {
      return build_main();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_main() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel main = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.

      return main;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.

      return domId6Element;
    }

    /**
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId7;
    private java.lang.String get_domId7() {
      return domId7;
    }
    private java.lang.String build_domId7() {
      // Creation section.
      domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId7;
    }

    /**
     * Getter for dialogBox called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.DialogBox get_dialogBox() {
      return build_dialogBox();
    }
    private com.google.gwt.user.client.ui.DialogBox build_dialogBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.DialogBox dialogBox = new com.google.gwt.user.client.ui.DialogBox(false, true);
      // Setup section.

      return dialogBox;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId7Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId7Element() {
      return domId7Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId7Element() {
      // Creation section.
      domId7Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId7());
      // Setup section.

      return domId7Element;
    }

    /**
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId8;
    private java.lang.String get_domId8() {
      return domId8;
    }
    private java.lang.String build_domId8() {
      // Creation section.
      domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId8;
    }

    /**
     * Getter for f_Modal11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Modal get_f_Modal11() {
      return build_f_Modal11();
    }
    private org.gwtbootstrap3.client.ui.Modal build_f_Modal11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Modal f_Modal11 = (org.gwtbootstrap3.client.ui.Modal) GWT.create(org.gwtbootstrap3.client.ui.Modal.class);
      // Setup section.
      f_Modal11.add(get_f_ModalBody12());
      f_Modal11.add(get_f_ModalFooter13());
      f_Modal11.setFade(true);
      f_Modal11.setDataKeyboard(true);
      f_Modal11.setClosable(true);
      f_Modal11.setId("myModal");
      f_Modal11.setTitle("Добавьте что-то");
      f_Modal11.setDataBackdrop(org.gwtbootstrap3.client.ui.constants.ModalBackdrop.STATIC);

      return f_Modal11;
    }

    /**
     * Getter for f_ModalBody12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ModalBody get_f_ModalBody12() {
      return build_f_ModalBody12();
    }
    private org.gwtbootstrap3.client.ui.ModalBody build_f_ModalBody12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ModalBody f_ModalBody12 = (org.gwtbootstrap3.client.ui.ModalBody) GWT.create(org.gwtbootstrap3.client.ui.ModalBody.class);
      // Setup section.
      f_ModalBody12.add(get_text());
      f_ModalBody12.add(get_password());

      return f_ModalBody12;
    }

    /**
     * Getter for text called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextArea get_text() {
      return build_text();
    }
    private com.google.gwt.user.client.ui.TextArea build_text() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea text = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      text.setStyleName("inputsm");

      return text;
    }

    /**
     * Getter for password called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker get_password() {
      return build_password();
    }
    private org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker build_password() {
      // Creation section.
      final org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker password = (org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker) GWT.create(org.gwtbootstrap3.extras.datetimepicker.client.ui.DateTimePicker.class);
      // Setup section.
      password.setStyleName("date");
      password.setFormat("mm/dd/yyyy hh:mm");
      password.setLanguage(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerLanguage.RU);
      password.setMinView(org.gwtbootstrap3.extras.datetimepicker.client.ui.base.constants.DateTimePickerView.DAY);

      return password;
    }

    /**
     * Getter for f_ModalFooter13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ModalFooter get_f_ModalFooter13() {
      return build_f_ModalFooter13();
    }
    private org.gwtbootstrap3.client.ui.ModalFooter build_f_ModalFooter13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ModalFooter f_ModalFooter13 = (org.gwtbootstrap3.client.ui.ModalFooter) GWT.create(org.gwtbootstrap3.client.ui.ModalFooter.class);
      // Setup section.
      f_ModalFooter13.add(get_button11());
      f_ModalFooter13.add(get_f_Button14());

      return f_ModalFooter13;
    }

    /**
     * Getter for button11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Button get_button11() {
      return build_button11();
    }
    private org.gwtbootstrap3.client.ui.Button build_button11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button button11 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      button11.setText("Do something");
      button11.setDataDismiss(org.gwtbootstrap3.client.ui.constants.ButtonDismiss.MODAL);
      button11.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return button11;
    }

    /**
     * Getter for f_Button14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button14() {
      return build_f_Button14();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button14 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button14.setText("Close");
      f_Button14.setDataDismiss(org.gwtbootstrap3.client.ui.constants.ButtonDismiss.MODAL);
      f_Button14.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);

      return f_Button14;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId8Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId8Element() {
      return domId8Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId8Element() {
      // Creation section.
      domId8Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId8());
      // Setup section.

      return domId8Element;
    }
  }
}

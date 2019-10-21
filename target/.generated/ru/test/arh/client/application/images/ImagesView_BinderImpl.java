// .ui.xml template last modified: 1571318234252
package ru.test.arh.client.application.images;

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

public class ImagesView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, ru.test.arh.client.application.images.ImagesView>, ru.test.arh.client.application.images.ImagesView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final ru.test.arh.client.application.images.ImagesView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final ru.test.arh.client.application.images.ImagesView owner;


    public Widgets(final ru.test.arh.client.application.images.ImagesView owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private ru.test.arh.client.application.images.ImagesView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private ru.test.arh.client.application.images.ImagesView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final ru.test.arh.client.application.images.ImagesView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (ru.test.arh.client.application.images.ImagesView_BinderImpl_GenBundle) GWT.create(ru.test.arh.client.application.images.ImagesView_BinderImpl_GenBundle.class);
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

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_f_PanelBody2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Lead10(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Progress11(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Panel13(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_main(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Image20(), get_domId5Element().get());

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
     * Getter for f_PanelBody2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody2() {
      return build_f_PanelBody2();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody2() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody2 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      f_PanelBody2.add(get_f_Button3());
      f_PanelBody2.add(get_f_Button4());
      f_PanelBody2.add(get_f_Button5());
      f_PanelBody2.add(get_f_Button6());
      f_PanelBody2.add(get_f_Button7());
      f_PanelBody2.add(get_f_Button8());
      f_PanelBody2.add(get_f_Button9());
      f_PanelBody2.setStyleName("panel1");

      return f_PanelBody2;
    }

    /**
     * Getter for f_Button3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button3() {
      return build_f_Button3();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button3() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button3 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button3.setText("Default");

      return f_Button3;
    }

    /**
     * Getter for f_Button4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button4() {
      return build_f_Button4();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button4() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button4 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button4.setText("Primary");
      f_Button4.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.PRIMARY);

      return f_Button4;
    }

    /**
     * Getter for f_Button5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button5() {
      return build_f_Button5();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button5() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button5 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button5.setText("Success");
      f_Button5.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.SUCCESS);

      return f_Button5;
    }

    /**
     * Getter for f_Button6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button6() {
      return build_f_Button6();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button6() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button6 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button6.setText("Info");
      f_Button6.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.INFO);

      return f_Button6;
    }

    /**
     * Getter for f_Button7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button7() {
      return build_f_Button7();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button7() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button7 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button7.setText("Warning");
      f_Button7.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.WARNING);

      return f_Button7;
    }

    /**
     * Getter for f_Button8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button8() {
      return build_f_Button8();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button8() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button8 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button8.setText("Danger");
      f_Button8.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.DANGER);

      return f_Button8;
    }

    /**
     * Getter for f_Button9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.Button get_f_Button9() {
      return build_f_Button9();
    }
    private org.gwtbootstrap3.client.ui.Button build_f_Button9() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Button f_Button9 = (org.gwtbootstrap3.client.ui.Button) GWT.create(org.gwtbootstrap3.client.ui.Button.class);
      // Setup section.
      f_Button9.setText("Link");
      f_Button9.setType(org.gwtbootstrap3.client.ui.constants.ButtonType.LINK);

      return f_Button9;
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
     * Getter for f_Lead10 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Lead get_f_Lead10() {
      return build_f_Lead10();
    }
    private org.gwtbootstrap3.client.ui.Lead build_f_Lead10() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Lead f_Lead10 = (org.gwtbootstrap3.client.ui.Lead) GWT.create(org.gwtbootstrap3.client.ui.Lead.class);
      // Setup section.
      f_Lead10.setText("Я устал на:");

      return f_Lead10;
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
     * Getter for f_Progress11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Progress get_f_Progress11() {
      return build_f_Progress11();
    }
    private org.gwtbootstrap3.client.ui.Progress build_f_Progress11() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Progress f_Progress11 = (org.gwtbootstrap3.client.ui.Progress) GWT.create(org.gwtbootstrap3.client.ui.Progress.class);
      // Setup section.
      f_Progress11.add(get_f_ProgressBar12());
      f_Progress11.setType(org.gwtbootstrap3.client.ui.constants.ProgressType.STRIPED);

      return f_Progress11;
    }

    /**
     * Getter for f_ProgressBar12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.ProgressBar get_f_ProgressBar12() {
      return build_f_ProgressBar12();
    }
    private org.gwtbootstrap3.client.ui.ProgressBar build_f_ProgressBar12() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.ProgressBar f_ProgressBar12 = (org.gwtbootstrap3.client.ui.ProgressBar) GWT.create(org.gwtbootstrap3.client.ui.ProgressBar.class);
      // Setup section.
      f_ProgressBar12.setText("10%");
      f_ProgressBar12.setType(org.gwtbootstrap3.client.ui.constants.ProgressBarType.DANGER);
      f_ProgressBar12.setPercent(10);

      return f_ProgressBar12;
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
     * Getter for f_Panel13 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.gwtbootstrap3.client.ui.Panel get_f_Panel13() {
      return build_f_Panel13();
    }
    private org.gwtbootstrap3.client.ui.Panel build_f_Panel13() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Panel f_Panel13 = (org.gwtbootstrap3.client.ui.Panel) GWT.create(org.gwtbootstrap3.client.ui.Panel.class);
      // Setup section.
      f_Panel13.add(get_f_PanelHeader14());
      f_Panel13.add(get_f_PanelBody16());
      f_Panel13.add(get_f_PanelFooter18());
      f_Panel13.setStyleName("pan");

      return f_Panel13;
    }

    /**
     * Getter for f_PanelHeader14 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.PanelHeader get_f_PanelHeader14() {
      return build_f_PanelHeader14();
    }
    private org.gwtbootstrap3.client.ui.PanelHeader build_f_PanelHeader14() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelHeader f_PanelHeader14 = (org.gwtbootstrap3.client.ui.PanelHeader) GWT.create(org.gwtbootstrap3.client.ui.PanelHeader.class);
      // Setup section.
      f_PanelHeader14.add(get_f_Heading15());

      return f_PanelHeader14;
    }

    /**
     * Getter for f_Heading15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Heading get_f_Heading15() {
      return build_f_Heading15();
    }
    private org.gwtbootstrap3.client.ui.Heading build_f_Heading15() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Heading f_Heading15 = new org.gwtbootstrap3.client.ui.Heading(org.gwtbootstrap3.client.ui.constants.HeadingSize.H3);
      // Setup section.
      f_Heading15.setText("Вы ввели:");

      return f_Heading15;
    }

    /**
     * Getter for f_PanelBody16 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.PanelBody get_f_PanelBody16() {
      return build_f_PanelBody16();
    }
    private org.gwtbootstrap3.client.ui.PanelBody build_f_PanelBody16() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelBody f_PanelBody16 = (org.gwtbootstrap3.client.ui.PanelBody) GWT.create(org.gwtbootstrap3.client.ui.PanelBody.class);
      // Setup section.
      f_PanelBody16.add(get_f_Lead17());
      f_PanelBody16.setHeight("300px");

      return f_PanelBody16;
    }

    /**
     * Getter for f_Lead17 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Lead get_f_Lead17() {
      return build_f_Lead17();
    }
    private org.gwtbootstrap3.client.ui.Lead build_f_Lead17() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Lead f_Lead17 = (org.gwtbootstrap3.client.ui.Lead) GWT.create(org.gwtbootstrap3.client.ui.Lead.class);
      // Setup section.
      f_Lead17.setText("лул");

      return f_Lead17;
    }

    /**
     * Getter for f_PanelFooter18 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private org.gwtbootstrap3.client.ui.PanelFooter get_f_PanelFooter18() {
      return build_f_PanelFooter18();
    }
    private org.gwtbootstrap3.client.ui.PanelFooter build_f_PanelFooter18() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.PanelFooter f_PanelFooter18 = (org.gwtbootstrap3.client.ui.PanelFooter) GWT.create(org.gwtbootstrap3.client.ui.PanelFooter.class);
      // Setup section.
      f_PanelFooter18.add(get_f_Lead19());

      return f_PanelFooter18;
    }

    /**
     * Getter for f_Lead19 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private org.gwtbootstrap3.client.ui.Lead get_f_Lead19() {
      return build_f_Lead19();
    }
    private org.gwtbootstrap3.client.ui.Lead build_f_Lead19() {
      // Creation section.
      final org.gwtbootstrap3.client.ui.Lead f_Lead19 = (org.gwtbootstrap3.client.ui.Lead) GWT.create(org.gwtbootstrap3.client.ui.Lead.class);
      // Setup section.
      f_Lead19.setText("лол");

      return f_Lead19;
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
     * Getter for main called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.SimplePanel get_main() {
      return build_main();
    }
    private com.google.gwt.user.client.ui.SimplePanel build_main() {
      // Creation section.
      final com.google.gwt.user.client.ui.SimplePanel main = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
      // Setup section.

      this.owner.main = main;

      return main;
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
     * Getter for f_Image20 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Image get_f_Image20() {
      return build_f_Image20();
    }
    private com.google.gwt.user.client.ui.Image build_f_Image20() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image f_Image20 = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      f_Image20.setStyleName("kek");
      f_Image20.setUrl("https://gwtbootstrap3.github.io/gwtbootstrap3-demo/images/media_object.png");

      return f_Image20;
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
  }
}

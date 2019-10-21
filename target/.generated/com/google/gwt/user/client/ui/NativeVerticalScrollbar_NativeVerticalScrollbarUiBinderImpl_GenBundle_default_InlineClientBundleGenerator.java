package com.google.gwt.user.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.google.gwt.user.client.ui.NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenBundle {
  private static NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.google.gwt.user.client.ui.NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (".GI4BLCC-k-b{position:relative;overflow:hidden;direction:rtl}.GI4BLCC-k-a{position:absolute;top:0;left:0;height:100%;width:100px;overflow-y:scroll;overflow-x:hidden}") : (".GI4BLCC-k-b{position:relative;overflow:hidden;direction:ltr}.GI4BLCC-k-a{position:absolute;top:0;right:0;height:100%;width:100px;overflow-y:scroll;overflow-x:hidden}");
      }
      public java.lang.String scrollable() {
        return "GI4BLCC-k-a";
      }
      public java.lang.String viewport() {
        return "GI4BLCC-k-b";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.google.gwt.user.client.ui.NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.google.gwt.user.client.ui.NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.user.client.ui.NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.google.gwt.user.client.ui.NativeVerticalScrollbar_NativeVerticalScrollbarUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}

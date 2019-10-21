package ru.test.arh.client.resources;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$ru$test$arh$client$resources$AppResources$_annotation$$none$$(ru.test.arh.client.resources.AppResources injectee) {
    
  }
  
  public void memberInject_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$(ru.test.arh.client.resources.ResourceLoader injectee) {
    
  }
  
  
  /**
   * Binding for ru.test.arh.client.resources.AppResources declared at:
   *   Implicit GWT.create binding for ru.test.arh.client.resources.AppResources
   */
  public ru.test.arh.client.resources.AppResources get_Key$type$ru$test$arh$client$resources$AppResources$_annotation$$none$$() {
    Object created = GWT.create(ru.test.arh.client.resources.AppResources.class);
    assert created instanceof ru.test.arh.client.resources.AppResources;
    ru.test.arh.client.resources.AppResources result = (ru.test.arh.client.resources.AppResources) created;
    
    memberInject_Key$type$ru$test$arh$client$resources$AppResources$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private ru.test.arh.client.resources.ResourceLoader singleton_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$ = null;
  
  public ru.test.arh.client.resources.ResourceLoader get_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$() {
    
    if (singleton_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$ == null) {
    ru.test.arh.client.resources.ResourceLoader result = ru$test$arh$client$resources$ResourceLoader_ru$test$arh$client$resources$ResourceLoader_methodInjection(get_Key$type$ru$test$arh$client$resources$AppResources$_annotation$$none$$());
    memberInject_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$(result);
    
        singleton_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$ = result;
    }
    return singleton_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$;
    
  }
  
  public ru.test.arh.client.resources.ResourceLoader ru$test$arh$client$resources$ResourceLoader_ru$test$arh$client$resources$ResourceLoader_methodInjection(ru.test.arh.client.resources.AppResources _0) {
    return new ru.test.arh.client.resources.ResourceLoader(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit binding for ru.test.arh.client.resources.ResourceLoader
    get_Key$type$ru$test$arh$client$resources$ResourceLoader$_annotation$$none$$();
    
  }
  
}

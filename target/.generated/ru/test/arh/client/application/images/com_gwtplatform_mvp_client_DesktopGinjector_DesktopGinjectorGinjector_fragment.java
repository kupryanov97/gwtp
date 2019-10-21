package ru.test.arh.client.application.images;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$(ru.test.arh.client.application.images.ImagesPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$(ru.test.arh.client.application.images.ImagesPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$ru$test$arh$client$application$images$ImagesView$Binder$_annotation$$none$$(ru.test.arh.client.application.images.ImagesView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$(ru.test.arh.client.application.images.ImagesView injectee) {
    
  }
  
  
  /**
   * Binding for ru.test.arh.client.application.images.ImagesPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public ru.test.arh.client.application.images.ImagesPresenter.MyView get_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyView$_annotation$$none$$() {
    ru.test.arh.client.application.images.ImagesPresenter.MyView result = get_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$();
    return result;
    
  }
  
  private ru.test.arh.client.application.images.ImagesPresenter.MyProxy singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$ = null;
  
  public ru.test.arh.client.application.images.ImagesPresenter.MyProxy get_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(ru.test.arh.client.application.images.ImagesPresenter.MyProxy.class);
    assert created instanceof ru.test.arh.client.application.images.ImagesPresenter.MyProxy;
    ru.test.arh.client.application.images.ImagesPresenter.MyProxy result = (ru.test.arh.client.application.images.ImagesPresenter.MyProxy) created;
    
    memberInject_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private ru.test.arh.client.application.images.ImagesPresenter singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$ = null;
  
  public ru.test.arh.client.application.images.ImagesPresenter get_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$ == null) {
    ru.test.arh.client.application.images.ImagesPresenter result = ru$test$arh$client$application$images$ImagesPresenter_ru$test$arh$client$application$images$ImagesPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyView$_annotation$$none$$(), get_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$;
    
  }
  
  public ru.test.arh.client.application.images.ImagesPresenter ru$test$arh$client$application$images$ImagesPresenter_ru$test$arh$client$application$images$ImagesPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, ru.test.arh.client.application.images.ImagesPresenter.MyView _1, ru.test.arh.client.application.images.ImagesPresenter.MyProxy _2) {
    return new ru.test.arh.client.application.images.ImagesPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<ru.test.arh.client.application.images.ImagesPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<ru.test.arh.client.application.images.ImagesPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<ru.test.arh.client.application.images.ImagesPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$ru$test$arh$client$application$images$ImagesPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<ru.test.arh.client.application.images.ImagesPresenter> result = new com.google.gwt.inject.client.AsyncProvider<ru.test.arh.client.application.images.ImagesPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super ru.test.arh.client.application.images.ImagesPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(ru.test.arh.client.application.images.ImagesPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$ru$test$arh$client$application$images$ImagesPresenter$_annotation$$none$$());
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
    return result;
    
  }
  
  
  /**
   * Binding for ru.test.arh.client.application.images.ImagesView$Binder declared at:
   *   Implicit GWT.create binding for ru.test.arh.client.application.images.ImagesView$Binder
   */
  public ru.test.arh.client.application.images.ImagesView.Binder get_Key$type$ru$test$arh$client$application$images$ImagesView$Binder$_annotation$$none$$() {
    Object created = GWT.create(ru.test.arh.client.application.images.ImagesView.Binder.class);
    assert created instanceof ru.test.arh.client.application.images.ImagesView.Binder;
    ru.test.arh.client.application.images.ImagesView.Binder result = (ru.test.arh.client.application.images.ImagesView.Binder) created;
    
    memberInject_Key$type$ru$test$arh$client$application$images$ImagesView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private ru.test.arh.client.application.images.ImagesView singleton_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$ = null;
  
  public ru.test.arh.client.application.images.ImagesView get_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$() {
    
    if (singleton_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$ == null) {
    ru.test.arh.client.application.images.ImagesView result = ru$test$arh$client$application$images$ImagesView_ru$test$arh$client$application$images$ImagesView_methodInjection(get_Key$type$ru$test$arh$client$application$images$ImagesView$Binder$_annotation$$none$$());
    memberInject_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$(result);
    
        singleton_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$ru$test$arh$client$application$images$ImagesView$_annotation$$none$$;
    
  }
  
  public ru.test.arh.client.application.images.ImagesView ru$test$arh$client$application$images$ImagesView_ru$test$arh$client$application$images$ImagesView_methodInjection(ru.test.arh.client.application.images.ImagesView.Binder _0) {
    return new ru.test.arh.client.application.images.ImagesView(_0);
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
    //   Implicit GWT.create binding for ru.test.arh.client.application.images.ImagesPresenter$MyProxy
    get_Key$type$ru$test$arh$client$application$images$ImagesPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}

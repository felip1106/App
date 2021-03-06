package co.com.app.homerepair.component;

import android.support.v4.app.Fragment;

import co.com.app.homerepair.controller.AppController;
import co.com.app.homerepair.module.AppModule;
import co.com.app.homerepair.view.fragment.RegistroClienteFragment;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by jfmg9029 on 12/02/2018.
 */

@Component(modules = {AndroidInjectionModule.class, AppModule.class})
public interface AppComponent extends AndroidInjector<AppController> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<AppController> {
    }

}

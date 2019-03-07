package com.example.project1;

import android.app.Application;

import com.example.project1.di.components.ApplicationComponent;
import com.example.project1.di.components.DaggerApplicationComponent;
import com.example.project1.di.modules.ApplicationModule;


/**
 * Created by anujgupta on 22/01/18.
 */

public class MyApplication extends Application {

    private static ApplicationComponent applicationComponent;

      public MyApplication(){

      }
    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                                .builder()
                                .applicationModule(new ApplicationModule(this))
                                .build();
    }

    public ApplicationComponent getApplicationComponent(){
          return applicationComponent;
      }

}

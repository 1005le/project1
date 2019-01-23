package com.example.project1.interactor.impl;

import android.text.TextUtils;

import com.example.project1.interactor.LoginInteractor;
import com.example.project1.presenter.LoginPresenter;
import com.example.project1.presenter.OnLoginFinishedListener;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by Admin on 23/1/2019.
 */

public class LoginInteractorImpl implements LoginInteractor{
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
       // Handler handler =   new Handler().postDelayed(new Runnable() {
           // @Override
       // public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
//        }, 2000);
//    }
}

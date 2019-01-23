package com.example.project1.presenter.impl;

import com.example.project1.interactor.LoginInteractor;
import com.example.project1.interactor.impl.LoginInteractorImpl;
import com.example.project1.presenter.LoginPresenter;
import com.example.project1.presenter.OnLoginFinishedListener;
import com.example.project1.view.LoginView;

/**
 * Created by Admin on 23/1/2019.
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener{
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateCredentials(String username, String password) {

        loginView.showProgress();
        loginInteractor.login(username, password, this);
    }

    @Override
    public void onUsernameError() {

        loginView.setUsernameError();
        loginView.hideProgress();
    }

    @Override
    public void onPasswordError() {
        loginView.setPasswordError();
        loginView.hideProgress();
    }

    @Override
    public void onSuccess() {
        loginView.navigateToHome();
    }
}

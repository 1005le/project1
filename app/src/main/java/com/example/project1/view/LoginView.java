package com.example.project1.view;

/**
 * Created by Admin on 23/1/2019.
 */

public interface LoginView {
    public void showProgress();

    public void hideProgress();

    public void setUsernameError();

    public void setPasswordError();

    public void navigateToHome();
}

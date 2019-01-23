package com.example.project1.interactor;

import com.example.project1.presenter.OnLoginFinishedListener;

/**
 * Created by Admin on 23/1/2019.
 */

public interface LoginInteractor {
    public void login(String username, String password, OnLoginFinishedListener listener);
}

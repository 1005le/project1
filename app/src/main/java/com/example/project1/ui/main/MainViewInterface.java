package com.example.project1.ui.main;


import com.example.project1.models.MovieResponse;

/**
 * Created by anujgupta on 26/12/17.
 */

public interface MainViewInterface {

    void showToast(String s);
    void showProgressBar();
    void hideProgressBar();
    void displayMovies(MovieResponse movieResponse);
    void displayError(String s);

}

package com.example.project1.ui.search;

import com.example.project1.models.MovieResponse;

/**
 * Created by anujgupta on 27/12/17.
 */

public interface SearchViewInterface {

    void showToast(String str);
    void displayResult(MovieResponse movieResponse);
    void displayError(String s);
    void showProgressBar();
    void hideProgressBar();

}

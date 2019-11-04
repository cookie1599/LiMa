package com.example.lima.main;

/**
 * Responsible for handling action from the view and updating the UI as required
 */

public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view) {
        mView = view;
    }
}

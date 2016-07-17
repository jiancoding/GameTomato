package com.magic9.gametomato;

public interface MvpPresenter<V extends MvpView> {
    void setView(V view);

    void removeView(V view);
}

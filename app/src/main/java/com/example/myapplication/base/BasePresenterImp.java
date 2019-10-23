package com.example.myapplication.base;

public  class BasePresenterImp<V extends MvpView> implements BasePresenter<V> {
    private V mMvpView;

    @Override
    public void onAttach(MvpView mvpView) {
        this.mMvpView = (V) mvpView;
    }

    @Override
    public void onDetach() {
        this.mMvpView= null;
    }

    public void handleApiError() {

    }

    public boolean isViewAttached() {
        return this.mMvpView != null;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) {
            throw new MvpViewNoAttachedException();
        }
    }

    public static class MvpViewNoAttachedException extends RuntimeException {
        public MvpViewNoAttachedException() {
            super("Please call Presenter.onAttach(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }

    public V getmMvpView() {
        return this.mMvpView;
    }
}

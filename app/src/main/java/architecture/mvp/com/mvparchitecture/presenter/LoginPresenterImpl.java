package architecture.mvp.com.mvparchitecture.presenter;


import architecture.mvp.com.mvparchitecture.model.LoginInteractor;
import architecture.mvp.com.mvparchitecture.model.LoginInteractorImpl;
import architecture.mvp.com.mvparchitecture.view.LoginView;

/**
 * Created by kshitij on 16/04/17.
 */

public class LoginPresenterImpl implements LoginPresenter,LoginInteractor.onLoginFinishedListener {

    LoginView mLoginView;
    LoginInteractor mLoginInteractor;

    public LoginPresenterImpl(LoginView mLoginView) {
        this.mLoginView = mLoginView;
        mLoginInteractor=new LoginInteractorImpl();
    }


    /*Login Presenter*/             //---- Part One

    @Override
    public void validateCred(String username, String password) {
        if (mLoginView != null) {
            mLoginView.showProgress();
            mLoginInteractor.login(username,password,this);
        }

    }

    @Override
    public void onDestroy() {
        if (mLoginView != null) {
            mLoginView=null;
        }
    }



    /*Login Interactor Methods*/            //Part 2

    @Override
    public void onUserNameError() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.setUserNameError();
        }
    }

    @Override
    public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.setPasswordError();
        }
    }



    @Override
    public void onSuccess() {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.navigatetoMain();
        }
    }

    @Override
    public void onFailure(String message) {
        if (mLoginView != null) {
            mLoginView.hideProgress();
            mLoginView.showAlert(message);
        }
    }
}

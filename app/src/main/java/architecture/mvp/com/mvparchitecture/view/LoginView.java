package architecture.mvp.com.mvparchitecture.view;


public interface LoginView {

    void showProgress();
    void hideProgress();
    void setUserNameError();
    void setPasswordError();
    void navigatetoMain();
    void showAlert(String message);

}

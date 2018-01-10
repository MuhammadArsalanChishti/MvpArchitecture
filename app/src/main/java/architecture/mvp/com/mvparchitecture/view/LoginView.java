package architecture.mvp.com.mvparchitecture.view;

/**
 * Created by kshitij on 16/04/17.
 */

public interface LoginView {

    void showProgress();
    void hideProgress();
    void setUserNameError();
    void setPasswordError();
    void navigatetoMain();
    void showAlert(String message);

}

package architecture.mvp.com.mvparchitecture.presenter;


public interface LoginPresenter {

    void validateCred(String username, String password);
    void onDestroy();
}

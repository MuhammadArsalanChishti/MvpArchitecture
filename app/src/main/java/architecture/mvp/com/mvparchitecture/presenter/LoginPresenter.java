package architecture.mvp.com.mvparchitecture.presenter;

/**
 * Created by kshitij on 16/04/17.
 */

public interface LoginPresenter {

    void validateCred(String username, String password);
    void onDestroy();
}

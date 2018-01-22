package architecture.mvp.com.mvparchitecture.model;


public interface LoginInteractor {

    interface onLoginFinishedListener{

        void onUserNameError();
        void onPasswordError();
        void onSuccess();
        void onFailure(String message);

    }

    void login(String username, String password, onLoginFinishedListener listener);

}

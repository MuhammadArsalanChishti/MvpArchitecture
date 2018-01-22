package architecture.mvp.com.mvparchitecture.model;

import android.os.Handler;
import android.text.TextUtils;


public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(String username, String password, final onLoginFinishedListener listener) {

        if (TextUtils.isEmpty(username))
            listener.onUserNameError();
        else if (TextUtils.isEmpty(password))
            listener.onPasswordError();
        else if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    listener.onSuccess();
                }
            },3000);

        } else {
            listener.onFailure("Invalid credentials");
        }

    }
}

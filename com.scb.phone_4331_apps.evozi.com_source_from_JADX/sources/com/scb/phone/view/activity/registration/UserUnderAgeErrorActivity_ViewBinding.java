package com.scb.phone.view.activity.registration;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity_ViewBinding;
import p040o.onStart;

public final class UserUnderAgeErrorActivity_ViewBinding extends ReviewInfoResultActivity_ViewBinding {
    private UserUnderAgeErrorActivity write;

    public UserUnderAgeErrorActivity_ViewBinding(UserUnderAgeErrorActivity userUnderAgeErrorActivity, View view) {
        super(userUnderAgeErrorActivity, view);
        this.write = userUnderAgeErrorActivity;
        userUnderAgeErrorActivity.returnHomeButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_return_home, "field 'returnHomeButton'", Button.class);
    }

    public final void read() {
        UserUnderAgeErrorActivity userUnderAgeErrorActivity = this.write;
        if (userUnderAgeErrorActivity != null) {
            this.write = null;
            userUnderAgeErrorActivity.returnHomeButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

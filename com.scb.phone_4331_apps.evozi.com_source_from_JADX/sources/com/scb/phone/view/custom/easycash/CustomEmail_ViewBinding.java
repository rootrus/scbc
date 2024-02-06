package com.scb.phone.view.custom.easycash;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.onStart;

public class CustomEmail_ViewBinding implements Unbinder {
    private CustomEmail write;

    public CustomEmail_ViewBinding(CustomEmail customEmail, View view) {
        this.write = customEmail;
        customEmail.emailEditText = (CustomEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.email, "field 'emailEditText'", CustomEditText.class);
        customEmail.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'errorText'", TextView.class);
        customEmail.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'titleText'", TextView.class);
    }

    public final void read() {
        CustomEmail customEmail = this.write;
        if (customEmail != null) {
            this.write = null;
            customEmail.emailEditText = null;
            customEmail.errorText = null;
            customEmail.titleText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

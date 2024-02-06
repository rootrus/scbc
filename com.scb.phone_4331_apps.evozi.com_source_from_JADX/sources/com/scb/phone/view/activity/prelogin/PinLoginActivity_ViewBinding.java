package com.scb.phone.view.activity.prelogin;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class PinLoginActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PinLoginActivity write;

    public PinLoginActivity_ViewBinding(final PinLoginActivity pinLoginActivity, View view) {
        super(pinLoginActivity, view);
        this.write = pinLoginActivity;
        pinLoginActivity.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        pinLoginActivity.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        pinLoginActivity.imageAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_avatar, "field 'imageAvatar'", ImageView.class);
        pinLoginActivity.textSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'textSubtitle'", TextView.class);
        pinLoginActivity.textUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_user_name, "field 'textUserName'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_close, "field 'buttonClose' and method 'onCloseClick'");
        pinLoginActivity.buttonClose = (ImageView) onStart.write(IconCompatParcelizer2, R.id.button_close, "field 'buttonClose'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PinLoginActivity.this.onCloseClick();
            }
        });
        pinLoginActivity.textWelcome = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_welcome, "field 'textWelcome'", TextView.class);
        pinLoginActivity.bgLogin = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bg_login, "field 'bgLogin'", ImageView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.view_forgot_pin, "method 'onForgotPinClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PinLoginActivity.this.onForgotPinClick();
            }
        });
    }

    public final void read() {
        PinLoginActivity pinLoginActivity = this.write;
        if (pinLoginActivity != null) {
            this.write = null;
            pinLoginActivity.customPinInput = null;
            pinLoginActivity.customKeypad = null;
            pinLoginActivity.imageAvatar = null;
            pinLoginActivity.textSubtitle = null;
            pinLoginActivity.textUserName = null;
            pinLoginActivity.buttonClose = null;
            pinLoginActivity.textWelcome = null;
            pinLoginActivity.bgLogin = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

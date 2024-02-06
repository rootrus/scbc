package com.scb.phone.view.activity.partner;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class AbstractPartnerLoginActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private AbstractPartnerLoginActivity MediaBrowserCompat$ItemReceiver;

    public AbstractPartnerLoginActivity_ViewBinding(final AbstractPartnerLoginActivity abstractPartnerLoginActivity, View view) {
        super(abstractPartnerLoginActivity, view);
        this.MediaBrowserCompat$ItemReceiver = abstractPartnerLoginActivity;
        abstractPartnerLoginActivity.partnerCustomPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'partnerCustomPinInput'", CustomPinInput.class);
        abstractPartnerLoginActivity.partnerCustomKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'partnerCustomKeypad'", CustomKeypad.class);
        abstractPartnerLoginActivity.partnerImageAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_avatar, "field 'partnerImageAvatar'", ImageView.class);
        abstractPartnerLoginActivity.partnerTextSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'partnerTextSubtitle'", TextView.class);
        abstractPartnerLoginActivity.partnerTextUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_user_name, "field 'partnerTextUserName'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_close, "field 'partnerButtonClose' and method 'onCloseClick'");
        abstractPartnerLoginActivity.partnerButtonClose = (ImageView) onStart.write(IconCompatParcelizer2, R.id.button_close, "field 'partnerButtonClose'", ImageView.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AbstractPartnerLoginActivity.this.onCloseClick();
            }
        });
        abstractPartnerLoginActivity.partnerTextWelcome = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_welcome, "field 'partnerTextWelcome'", TextView.class);
        abstractPartnerLoginActivity.partnerBgLogin = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bg_login, "field 'partnerBgLogin'", ImageView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.view_forgot_pin, "method 'onForgotPinClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AbstractPartnerLoginActivity.this.onForgotPinClick();
            }
        });
    }

    public final void read() {
        AbstractPartnerLoginActivity abstractPartnerLoginActivity = this.MediaBrowserCompat$ItemReceiver;
        if (abstractPartnerLoginActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            abstractPartnerLoginActivity.partnerCustomPinInput = null;
            abstractPartnerLoginActivity.partnerCustomKeypad = null;
            abstractPartnerLoginActivity.partnerImageAvatar = null;
            abstractPartnerLoginActivity.partnerTextSubtitle = null;
            abstractPartnerLoginActivity.partnerTextUserName = null;
            abstractPartnerLoginActivity.partnerButtonClose = null;
            abstractPartnerLoginActivity.partnerTextWelcome = null;
            abstractPartnerLoginActivity.partnerBgLogin = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

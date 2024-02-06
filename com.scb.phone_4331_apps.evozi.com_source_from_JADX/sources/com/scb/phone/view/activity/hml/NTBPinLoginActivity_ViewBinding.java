package com.scb.phone.view.activity.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.onStart;

public class NTBPinLoginActivity_ViewBinding extends BaseActivity_ViewBinding {
    private NTBPinLoginActivity write;

    public NTBPinLoginActivity_ViewBinding(NTBPinLoginActivity nTBPinLoginActivity, View view) {
        super(nTBPinLoginActivity, view);
        this.write = nTBPinLoginActivity;
        nTBPinLoginActivity.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        nTBPinLoginActivity.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_keypad, "field 'customKeypad'", CustomKeypad.class);
        nTBPinLoginActivity.imageAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_avatar, "field 'imageAvatar'", ImageView.class);
        nTBPinLoginActivity.textSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'textSubtitle'", TextView.class);
        nTBPinLoginActivity.buttonClose = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_close, "field 'buttonClose'", ImageView.class);
        nTBPinLoginActivity.textWelcome = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_welcome, "field 'textWelcome'", TextView.class);
    }

    public final void read() {
        NTBPinLoginActivity nTBPinLoginActivity = this.write;
        if (nTBPinLoginActivity != null) {
            this.write = null;
            nTBPinLoginActivity.customPinInput = null;
            nTBPinLoginActivity.customKeypad = null;
            nTBPinLoginActivity.imageAvatar = null;
            nTBPinLoginActivity.textSubtitle = null;
            nTBPinLoginActivity.buttonClose = null;
            nTBPinLoginActivity.textWelcome = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

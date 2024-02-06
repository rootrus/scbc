package com.scb.phone.view.fragment.ntb.touchpoint;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class TouchPointPinFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TouchPointPinFragment MediaBrowserCompat$ItemReceiver;

    public TouchPointPinFragment_ViewBinding(TouchPointPinFragment touchPointPinFragment, View view) {
        super(touchPointPinFragment, view);
        this.MediaBrowserCompat$ItemReceiver = touchPointPinFragment;
        touchPointPinFragment.customPinInput = (CustomPinInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_input, "field 'customPinInput'", CustomPinInput.class);
        touchPointPinFragment.customKeypad = (CustomKeypad) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_pin_keypad, "field 'customKeypad'", CustomKeypad.class);
        touchPointPinFragment.pinTouchPointName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_pin_touchpoint_name, "field 'pinTouchPointName'", TextView.class);
        touchPointPinFragment.pinAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_pin_avatar, "field 'pinAvatar'", ImageView.class);
    }

    public final void read() {
        TouchPointPinFragment touchPointPinFragment = this.MediaBrowserCompat$ItemReceiver;
        if (touchPointPinFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            touchPointPinFragment.customPinInput = null;
            touchPointPinFragment.customKeypad = null;
            touchPointPinFragment.pinTouchPointName = null;
            touchPointPinFragment.pinAvatar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

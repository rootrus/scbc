package com.scb.phone.view.activity.forgotpin;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PinLockActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private PinLockActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public PinLockActivity_ViewBinding(final PinLockActivity pinLockActivity, View view) {
        super(pinLockActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = pinLockActivity;
        pinLockActivity.pinLockTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pin_lock_title, "field 'pinLockTitle'", TextView.class);
        pinLockActivity.pinLockDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pin_lock_description, "field 'pinLockDescription'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.unlock_pin_button, "field 'unlockPinButton' and method 'onUnlockPinClick'");
        pinLockActivity.unlockPinButton = (Button) onStart.write(IconCompatParcelizer2, R.id.unlock_pin_button, "field 'unlockPinButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PinLockActivity.this.onUnlockPinClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_personal_profile, "field 'buttonGoToPersonalProfile' and method 'onPersonalProfileClick'");
        pinLockActivity.buttonGoToPersonalProfile = (Button) onStart.write(IconCompatParcelizer3, R.id.button_personal_profile, "field 'buttonGoToPersonalProfile'", Button.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PinLockActivity.this.onPersonalProfileClick();
            }
        });
    }

    public final void read() {
        PinLockActivity pinLockActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pinLockActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            pinLockActivity.pinLockTitle = null;
            pinLockActivity.pinLockDescription = null;
            pinLockActivity.unlockPinButton = null;
            pinLockActivity.buttonGoToPersonalProfile = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.activity.prepaid.reset;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidResetPinSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PrepaidResetPinSuccessActivity MediaBrowserCompat$ItemReceiver;

    public PrepaidResetPinSuccessActivity_ViewBinding(final PrepaidResetPinSuccessActivity prepaidResetPinSuccessActivity, View view) {
        super(prepaidResetPinSuccessActivity, view);
        this.MediaBrowserCompat$ItemReceiver = prepaidResetPinSuccessActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.ok_button, "method 'onOkClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidResetPinSuccessActivity.this.onOkClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

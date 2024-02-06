package com.scb.phone.view.activity.pinchange;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PinChangeSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private PinChangeSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;

    public PinChangeSuccessActivity_ViewBinding(final PinChangeSuccessActivity pinChangeSuccessActivity, View view) {
        super(pinChangeSuccessActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = pinChangeSuccessActivity;
        pinChangeSuccessActivity.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pinchange_success_title, "field 'title'", TextView.class);
        pinChangeSuccessActivity.message = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pinchange_success_content, "field 'message'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.ok_button, "method 'onOkClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PinChangeSuccessActivity.this.onOkClick();
            }
        });
    }

    public final void read() {
        PinChangeSuccessActivity pinChangeSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pinChangeSuccessActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            pinChangeSuccessActivity.title = null;
            pinChangeSuccessActivity.message = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

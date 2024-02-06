package com.scb.phone.view.activity.forgotpin;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ReviewDeviceActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private ReviewDeviceActivity MediaBrowserCompat$CustomActionResultReceiver;

    public ReviewDeviceActivity_ViewBinding(final ReviewDeviceActivity reviewDeviceActivity, View view) {
        super(reviewDeviceActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = reviewDeviceActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_next, "method 'onButtonNextClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewDeviceActivity.this.onButtonNextClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

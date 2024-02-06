package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MwPinnedSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private MwPinnedSuccessActivity MediaBrowserCompat$ItemReceiver;

    public MwPinnedSuccessActivity_ViewBinding(final MwPinnedSuccessActivity mwPinnedSuccessActivity, View view) {
        super(mwPinnedSuccessActivity, view);
        this.MediaBrowserCompat$ItemReceiver = mwPinnedSuccessActivity;
        mwPinnedSuccessActivity.tvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'tvDateTime'", TextView.class);
        mwPinnedSuccessActivity.tvDroppedPin = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_dropped_pin, "field 'tvDroppedPin'", TextView.class);
        mwPinnedSuccessActivity.tvAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_address, "field 'tvAddress'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_done, "method 'onDoneClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwPinnedSuccessActivity.this.onDoneClick();
            }
        });
    }

    public final void read() {
        MwPinnedSuccessActivity mwPinnedSuccessActivity = this.MediaBrowserCompat$ItemReceiver;
        if (mwPinnedSuccessActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            mwPinnedSuccessActivity.tvDateTime = null;
            mwPinnedSuccessActivity.tvDroppedPin = null;
            mwPinnedSuccessActivity.tvAddress = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

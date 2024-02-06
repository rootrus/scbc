package com.scb.phone.view.activity.hml;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBPinDisabledActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlNTBPinDisabledActivity MediaBrowserCompat$ItemReceiver;

    public HmlNTBPinDisabledActivity_ViewBinding(final HmlNTBPinDisabledActivity hmlNTBPinDisabledActivity, View view) {
        super(hmlNTBPinDisabledActivity, view);
        this.MediaBrowserCompat$ItemReceiver = hmlNTBPinDisabledActivity;
        hmlNTBPinDisabledActivity.disabledPinTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ntb_pin_disabled_title_tv, "field 'disabledPinTitle'", TextView.class);
        hmlNTBPinDisabledActivity.disabledPinSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ntb_pin_disabled_subtitle_tv, "field 'disabledPinSubtitle'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_ntb_pin_disabled_button, "method 'onButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBPinDisabledActivity.this.onButtonClicked();
            }
        });
    }

    public final void read() {
        HmlNTBPinDisabledActivity hmlNTBPinDisabledActivity = this.MediaBrowserCompat$ItemReceiver;
        if (hmlNTBPinDisabledActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlNTBPinDisabledActivity.disabledPinTitle = null;
            hmlNTBPinDisabledActivity.disabledPinSubtitle = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

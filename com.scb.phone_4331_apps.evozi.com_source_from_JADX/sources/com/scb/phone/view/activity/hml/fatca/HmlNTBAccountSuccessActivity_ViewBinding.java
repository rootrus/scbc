package com.scb.phone.view.activity.hml.fatca;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.EkycSuccessActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBAccountSuccessActivity_ViewBinding extends EkycSuccessActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlNTBAccountSuccessActivity write;

    public HmlNTBAccountSuccessActivity_ViewBinding(final HmlNTBAccountSuccessActivity hmlNTBAccountSuccessActivity, View view) {
        super(hmlNTBAccountSuccessActivity, view);
        this.write = hmlNTBAccountSuccessActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBAccountSuccessActivity.this.onClick();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

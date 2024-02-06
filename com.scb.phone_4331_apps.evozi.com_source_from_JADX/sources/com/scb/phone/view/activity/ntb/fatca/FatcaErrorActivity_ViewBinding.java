package com.scb.phone.view.activity.ntb.fatca;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FatcaErrorActivity_ViewBinding extends BaseActivity_ViewBinding {
    private FatcaErrorActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public FatcaErrorActivity_ViewBinding(final FatcaErrorActivity fatcaErrorActivity, View view) {
        super(fatcaErrorActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fatcaErrorActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_find_us, "method 'openFindUs'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FatcaErrorActivity.this.openFindUs();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'openHome'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FatcaErrorActivity.this.openHome();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
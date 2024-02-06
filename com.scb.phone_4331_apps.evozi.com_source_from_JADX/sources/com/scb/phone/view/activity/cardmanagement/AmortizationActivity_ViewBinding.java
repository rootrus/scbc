package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class AmortizationActivity_ViewBinding extends BaseAmortizationActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private AmortizationActivity MediaBrowserCompat$ItemReceiver;

    public AmortizationActivity_ViewBinding(final AmortizationActivity amortizationActivity, View view) {
        super(amortizationActivity, view);
        this.MediaBrowserCompat$ItemReceiver = amortizationActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btnNext, "method 'onClickNextAction'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AmortizationActivity.this.onClickNextAction();
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

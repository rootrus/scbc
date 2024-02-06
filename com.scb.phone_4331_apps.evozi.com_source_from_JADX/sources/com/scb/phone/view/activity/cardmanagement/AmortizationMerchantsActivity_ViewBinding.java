package com.scb.phone.view.activity.cardmanagement;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class AmortizationMerchantsActivity_ViewBinding extends BaseAmortizationActivity_ViewBinding {
    private AmortizationMerchantsActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public AmortizationMerchantsActivity_ViewBinding(final AmortizationMerchantsActivity amortizationMerchantsActivity, View view) {
        super(amortizationMerchantsActivity, view);
        this.MediaBrowserCompat$ItemReceiver = amortizationMerchantsActivity;
        amortizationMerchantsActivity.spFilterOptions = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spFilterOptions, "field 'spFilterOptions'", Spinner.class);
        amortizationMerchantsActivity.layoutFilterOptions = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutFilterOptions, "field 'layoutFilterOptions'", LinearLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btnNext, "method 'onClickNextAction'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AmortizationMerchantsActivity.this.onClickNextAction();
            }
        });
    }

    public final void read() {
        AmortizationMerchantsActivity amortizationMerchantsActivity = this.MediaBrowserCompat$ItemReceiver;
        if (amortizationMerchantsActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            amortizationMerchantsActivity.spFilterOptions = null;
            amortizationMerchantsActivity.layoutFilterOptions = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashFeaturesCommercialLoanInformationFragment_ViewBinding extends C9174xb4f85216 {
    private EasycashFeaturesCommercialLoanInformationFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashFeaturesCommercialLoanInformationFragment_ViewBinding(final EasycashFeaturesCommercialLoanInformationFragment easycashFeaturesCommercialLoanInformationFragment, View view) {
        super(easycashFeaturesCommercialLoanInformationFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashFeaturesCommercialLoanInformationFragment;
        easycashFeaturesCommercialLoanInformationFragment.amountSlider = (CustomDeltaSlider) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_slider, "field 'amountSlider'", CustomDeltaSlider.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesCommercialLoanInformationFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        EasycashFeaturesCommercialLoanInformationFragment easycashFeaturesCommercialLoanInformationFragment = this.MediaBrowserCompat$ItemReceiver;
        if (easycashFeaturesCommercialLoanInformationFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashFeaturesCommercialLoanInformationFragment.amountSlider = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

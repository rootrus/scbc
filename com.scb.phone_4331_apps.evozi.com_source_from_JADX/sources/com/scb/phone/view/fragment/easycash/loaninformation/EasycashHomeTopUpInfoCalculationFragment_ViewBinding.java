package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashHomeTopUpInfoCalculationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private EasycashHomeTopUpInfoCalculationFragment MediaBrowserCompat$ItemReceiver;

    public EasycashHomeTopUpInfoCalculationFragment_ViewBinding(final EasycashHomeTopUpInfoCalculationFragment easycashHomeTopUpInfoCalculationFragment, View view) {
        super(easycashHomeTopUpInfoCalculationFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashHomeTopUpInfoCalculationFragment;
        easycashHomeTopUpInfoCalculationFragment.headerDetail = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cost_overview_header, "field 'headerDetail'", CustomEasyCashSectionLabel.class);
        easycashHomeTopUpInfoCalculationFragment.detail = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cost_overview, "field 'detail'", CustomSeparatedViews.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashHomeTopUpInfoCalculationFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        EasycashHomeTopUpInfoCalculationFragment easycashHomeTopUpInfoCalculationFragment = this.MediaBrowserCompat$ItemReceiver;
        if (easycashHomeTopUpInfoCalculationFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashHomeTopUpInfoCalculationFragment.headerDetail = null;
            easycashHomeTopUpInfoCalculationFragment.detail = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

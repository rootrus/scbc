package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashFeaturesRefillableInformationFragment_ViewBinding extends BaseFeaturesLoanInformationFragment_ViewBinding {
    private View IconCompatParcelizer;
    private EasycashFeaturesRefillableInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public EasycashFeaturesRefillableInformationFragment_ViewBinding(final EasycashFeaturesRefillableInformationFragment easycashFeaturesRefillableInformationFragment, View view) {
        super(easycashFeaturesRefillableInformationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashFeaturesRefillableInformationFragment;
        easycashFeaturesRefillableInformationFragment.accountSelector = (CustomAccountSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_selector, "field 'accountSelector'", CustomAccountSelector.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'nextButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesRefillableInformationFragment.this.nextButtonClick();
            }
        });
    }

    public final void read() {
        EasycashFeaturesRefillableInformationFragment easycashFeaturesRefillableInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (easycashFeaturesRefillableInformationFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            easycashFeaturesRefillableInformationFragment.accountSelector = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

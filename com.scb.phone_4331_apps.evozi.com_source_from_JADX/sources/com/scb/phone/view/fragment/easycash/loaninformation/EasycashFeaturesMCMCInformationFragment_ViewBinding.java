package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import p040o.onCreateDialog;
import p040o.onStart;

public final class EasycashFeaturesMCMCInformationFragment_ViewBinding extends BaseFeaturesLoanInformationFragment_ViewBinding {
    private EasycashFeaturesMCMCInformationFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public EasycashFeaturesMCMCInformationFragment_ViewBinding(final EasycashFeaturesMCMCInformationFragment easycashFeaturesMCMCInformationFragment, View view) {
        super(easycashFeaturesMCMCInformationFragment, view);
        this.IconCompatParcelizer = easycashFeaturesMCMCInformationFragment;
        easycashFeaturesMCMCInformationFragment.loanInformation = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_two, "field 'loanInformation'", CustomSeparatedViews.class);
        easycashFeaturesMCMCInformationFragment.headerLoanInformation = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_two, "field 'headerLoanInformation'", CustomEasyCashSectionLabel.class);
        easycashFeaturesMCMCInformationFragment.headerCostOverview = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_three, "field 'headerCostOverview'", CustomEasyCashSectionLabel.class);
        easycashFeaturesMCMCInformationFragment.costOverview = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_three, "field 'costOverview'", CustomSeparatedViews.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'nextButtonClick$app_prodRelease'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesMCMCInformationFragment.this.nextButtonClick$app_prodRelease();
            }
        });
    }

    public final void read() {
        EasycashFeaturesMCMCInformationFragment easycashFeaturesMCMCInformationFragment = this.IconCompatParcelizer;
        if (easycashFeaturesMCMCInformationFragment != null) {
            this.IconCompatParcelizer = null;
            easycashFeaturesMCMCInformationFragment.loanInformation = null;
            easycashFeaturesMCMCInformationFragment.headerLoanInformation = null;
            easycashFeaturesMCMCInformationFragment.headerCostOverview = null;
            easycashFeaturesMCMCInformationFragment.costOverview = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

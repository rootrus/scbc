package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.Button;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashFeaturesMHMCInformationFragment_ViewBinding extends BaseFeaturesLoanInformationFragment_ViewBinding {
    private EasycashFeaturesMHMCInformationFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashFeaturesMHMCInformationFragment_ViewBinding(final EasycashFeaturesMHMCInformationFragment easycashFeaturesMHMCInformationFragment, View view) {
        super(easycashFeaturesMHMCInformationFragment, view);
        this.IconCompatParcelizer = easycashFeaturesMHMCInformationFragment;
        easycashFeaturesMHMCInformationFragment.headerLoanInformation = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_two, "field 'headerLoanInformation'", CustomEasyCashSectionLabel.class);
        easycashFeaturesMHMCInformationFragment.loanInformation = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_two, "field 'loanInformation'", CustomSeparatedViews.class);
        easycashFeaturesMHMCInformationFragment.headerCostOverview = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_three, "field 'headerCostOverview'", CustomEasyCashSectionLabel.class);
        easycashFeaturesMHMCInformationFragment.costOverview = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.content_three, "field 'costOverview'", CustomSeparatedViews.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.recalculate_button, "field 'recalculateButton' and method 'recalculateButtonClick'");
        easycashFeaturesMHMCInformationFragment.recalculateButton = (Button) onStart.write(IconCompatParcelizer2, R.id.recalculate_button, "field 'recalculateButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesMHMCInformationFragment.this.recalculateButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'nextButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesMHMCInformationFragment.this.nextButtonClick();
            }
        });
    }

    public final void read() {
        EasycashFeaturesMHMCInformationFragment easycashFeaturesMHMCInformationFragment = this.IconCompatParcelizer;
        if (easycashFeaturesMHMCInformationFragment != null) {
            this.IconCompatParcelizer = null;
            easycashFeaturesMHMCInformationFragment.headerLoanInformation = null;
            easycashFeaturesMHMCInformationFragment.loanInformation = null;
            easycashFeaturesMHMCInformationFragment.headerCostOverview = null;
            easycashFeaturesMHMCInformationFragment.costOverview = null;
            easycashFeaturesMHMCInformationFragment.recalculateButton = null;
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

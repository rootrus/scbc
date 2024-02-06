package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.ntb.CustomInformationPanel;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundOnboardingReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FundOnboardingReviewFragment MediaBrowserCompat$CustomActionResultReceiver;

    public FundOnboardingReviewFragment_ViewBinding(final FundOnboardingReviewFragment fundOnboardingReviewFragment, View view) {
        super(fundOnboardingReviewFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fundOnboardingReviewFragment;
        fundOnboardingReviewFragment.personalPanel = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.panel_personal_info, "field 'personalPanel'", CustomInformationPanel.class);
        fundOnboardingReviewFragment.investmentPanel = (CustomInformationPanel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.panel_investment_info, "field 'investmentPanel'", CustomInformationPanel.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_confirm, "method 'onConfirmClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundOnboardingReviewFragment.this.onConfirmClick();
            }
        });
    }

    public final void read() {
        FundOnboardingReviewFragment fundOnboardingReviewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundOnboardingReviewFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fundOnboardingReviewFragment.personalPanel = null;
            fundOnboardingReviewFragment.investmentPanel = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

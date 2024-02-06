package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class OnboardingInvestmentInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private OnboardingInvestmentInformationFragment write;

    public OnboardingInvestmentInformationFragment_ViewBinding(final OnboardingInvestmentInformationFragment onboardingInvestmentInformationFragment, View view) {
        super(onboardingInvestmentInformationFragment, view);
        this.write = onboardingInvestmentInformationFragment;
        onboardingInvestmentInformationFragment.swtIncomeSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swt_income_spinner, "field 'swtIncomeSpinner'", CustomSpinnerWithTitle.class);
        onboardingInvestmentInformationFragment.rlFundSelector = onStart.IconCompatParcelizer(view, R.id.rl_fund_selector, "field 'rlFundSelector'");
        onboardingInvestmentInformationFragment.tvFundText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_fund_text, "field 'tvFundText'", TextView.class);
        onboardingInvestmentInformationFragment.tvFundTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_fund_title, "field 'tvFundTitle'", TextView.class);
        onboardingInvestmentInformationFragment.swtObjectivesSpinner = (CustomSpinnerWithTitle) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.swt_objectives_spinner, "field 'swtObjectivesSpinner'", CustomSpinnerWithTitle.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'btNext' and method 'onNextClick'");
        onboardingInvestmentInformationFragment.btNext = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_next, "field 'btNext'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnboardingInvestmentInformationFragment.this.onNextClick();
            }
        });
    }

    public final void read() {
        OnboardingInvestmentInformationFragment onboardingInvestmentInformationFragment = this.write;
        if (onboardingInvestmentInformationFragment != null) {
            this.write = null;
            onboardingInvestmentInformationFragment.swtIncomeSpinner = null;
            onboardingInvestmentInformationFragment.rlFundSelector = null;
            onboardingInvestmentInformationFragment.tvFundText = null;
            onboardingInvestmentInformationFragment.tvFundTitle = null;
            onboardingInvestmentInformationFragment.swtObjectivesSpinner = null;
            onboardingInvestmentInformationFragment.btNext = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

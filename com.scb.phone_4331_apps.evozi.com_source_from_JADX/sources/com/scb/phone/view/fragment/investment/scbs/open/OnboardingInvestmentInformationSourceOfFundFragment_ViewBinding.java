package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class OnboardingInvestmentInformationSourceOfFundFragment_ViewBinding extends BaseFragment_ViewBinding {
    private OnboardingInvestmentInformationSourceOfFundFragment write;

    public OnboardingInvestmentInformationSourceOfFundFragment_ViewBinding(OnboardingInvestmentInformationSourceOfFundFragment onboardingInvestmentInformationSourceOfFundFragment, View view) {
        super(onboardingInvestmentInformationSourceOfFundFragment, view);
        this.write = onboardingInvestmentInformationSourceOfFundFragment;
        onboardingInvestmentInformationSourceOfFundFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        OnboardingInvestmentInformationSourceOfFundFragment onboardingInvestmentInformationSourceOfFundFragment = this.write;
        if (onboardingInvestmentInformationSourceOfFundFragment != null) {
            this.write = null;
            onboardingInvestmentInformationSourceOfFundFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

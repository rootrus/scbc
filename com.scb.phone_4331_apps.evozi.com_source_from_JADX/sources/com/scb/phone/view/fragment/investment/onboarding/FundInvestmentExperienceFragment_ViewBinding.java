package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundInvestmentExperienceFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FundInvestmentExperienceFragment MediaBrowserCompat$ItemReceiver;

    public FundInvestmentExperienceFragment_ViewBinding(final FundInvestmentExperienceFragment fundInvestmentExperienceFragment, View view) {
        super(fundInvestmentExperienceFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fundInvestmentExperienceFragment;
        fundInvestmentExperienceFragment.recyclerViewExperience = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_experience, "field 'recyclerViewExperience'", RecyclerView.class);
        fundInvestmentExperienceFragment.recyclerViewHoldingTax = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_with_holiding_tax, "field 'recyclerViewHoldingTax'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        fundInvestmentExperienceFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundInvestmentExperienceFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        FundInvestmentExperienceFragment fundInvestmentExperienceFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fundInvestmentExperienceFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fundInvestmentExperienceFragment.recyclerViewExperience = null;
            fundInvestmentExperienceFragment.recyclerViewHoldingTax = null;
            fundInvestmentExperienceFragment.buttonNext = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

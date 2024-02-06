package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseFeaturesLoanInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseFeaturesLoanInformationFragment write;

    public BaseFeaturesLoanInformationFragment_ViewBinding(BaseFeaturesLoanInformationFragment baseFeaturesLoanInformationFragment, View view) {
        super(baseFeaturesLoanInformationFragment, view);
        this.write = baseFeaturesLoanInformationFragment;
        baseFeaturesLoanInformationFragment.amountSliderContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_slider_container, "field 'amountSliderContainer'", LinearLayout.class);
        baseFeaturesLoanInformationFragment.moreLoanLink = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.more_loan_link, "field 'moreLoanLink'", LinearLayout.class);
        baseFeaturesLoanInformationFragment.durationSection = (CustomEasyCashSectionLabel) onStart.IconCompatParcelizer(view, R.id.duration_section, "field 'durationSection'", CustomEasyCashSectionLabel.class);
        baseFeaturesLoanInformationFragment.durationRecyclerView = (RecyclerView) onStart.IconCompatParcelizer(view, R.id.loan_duration_recycler_view, "field 'durationRecyclerView'", RecyclerView.class);
        baseFeaturesLoanInformationFragment.headerDetail = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_one, "field 'headerDetail'", CustomEasyCashSectionLabel.class);
        baseFeaturesLoanInformationFragment.detailSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.detail_section, "field 'detailSection'", LinearLayout.class);
        baseFeaturesLoanInformationFragment.detail = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_overview, "field 'detail'", CustomSeparatedViews.class);
        baseFeaturesLoanInformationFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_button, "field 'nextButton'", Button.class);
    }

    public void read() {
        BaseFeaturesLoanInformationFragment baseFeaturesLoanInformationFragment = this.write;
        if (baseFeaturesLoanInformationFragment != null) {
            this.write = null;
            baseFeaturesLoanInformationFragment.amountSliderContainer = null;
            baseFeaturesLoanInformationFragment.moreLoanLink = null;
            baseFeaturesLoanInformationFragment.durationSection = null;
            baseFeaturesLoanInformationFragment.durationRecyclerView = null;
            baseFeaturesLoanInformationFragment.headerDetail = null;
            baseFeaturesLoanInformationFragment.detailSection = null;
            baseFeaturesLoanInformationFragment.detail = null;
            baseFeaturesLoanInformationFragment.nextButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

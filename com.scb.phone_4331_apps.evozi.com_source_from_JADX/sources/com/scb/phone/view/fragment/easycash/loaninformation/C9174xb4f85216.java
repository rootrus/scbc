package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomCreditCardPageSelector;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

/* renamed from: com.scb.phone.view.fragment.easycash.loaninformation.BasePurposefulCommercialFeaturesLoanInformationFragment_ViewBinding */
public class C9174xb4f85216 extends BaseFragment_ViewBinding {
    private BasePurposefulCommercialFeaturesLoanInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public C9174xb4f85216(BasePurposefulCommercialFeaturesLoanInformationFragment basePurposefulCommercialFeaturesLoanInformationFragment, View view) {
        super(basePurposefulCommercialFeaturesLoanInformationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = basePurposefulCommercialFeaturesLoanInformationFragment;
        basePurposefulCommercialFeaturesLoanInformationFragment.cardSelector = (CustomCreditCardPageSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_selector, "field 'cardSelector'", CustomCreditCardPageSelector.class);
        basePurposefulCommercialFeaturesLoanInformationFragment.durationSection = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.duration_section, "field 'durationSection'", CustomEasyCashSectionLabel.class);
        basePurposefulCommercialFeaturesLoanInformationFragment.durationRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_duration_recycler_view, "field 'durationRecyclerView'", RecyclerView.class);
        basePurposefulCommercialFeaturesLoanInformationFragment.detailSection = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.detail_section, "field 'detailSection'", LinearLayout.class);
        basePurposefulCommercialFeaturesLoanInformationFragment.detail = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_overview, "field 'detail'", CustomSeparatedViews.class);
        basePurposefulCommercialFeaturesLoanInformationFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_button, "field 'nextButton'", Button.class);
        basePurposefulCommercialFeaturesLoanInformationFragment.amountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'amountInputLayout'", TextInputLayout.class);
        basePurposefulCommercialFeaturesLoanInformationFragment.rateDisclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.disclaimer_top, "field 'rateDisclaimer'", TextView.class);
    }

    public void read() {
        BasePurposefulCommercialFeaturesLoanInformationFragment basePurposefulCommercialFeaturesLoanInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (basePurposefulCommercialFeaturesLoanInformationFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.cardSelector = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.durationSection = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.durationRecyclerView = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.detailSection = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.detail = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.nextButton = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.amountInputLayout = null;
            basePurposefulCommercialFeaturesLoanInformationFragment.rateDisclaimer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

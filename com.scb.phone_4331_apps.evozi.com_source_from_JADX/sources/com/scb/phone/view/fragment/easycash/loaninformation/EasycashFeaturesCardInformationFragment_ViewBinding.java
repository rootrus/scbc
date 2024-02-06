package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomCreditCardPageSelector;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashFeaturesCardInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private EasycashFeaturesCardInformationFragment write;

    public EasycashFeaturesCardInformationFragment_ViewBinding(final EasycashFeaturesCardInformationFragment easycashFeaturesCardInformationFragment, View view) {
        super(easycashFeaturesCardInformationFragment, view);
        this.write = easycashFeaturesCardInformationFragment;
        easycashFeaturesCardInformationFragment.cardSelector = (CustomCreditCardPageSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_selector, "field 'cardSelector'", CustomCreditCardPageSelector.class);
        easycashFeaturesCardInformationFragment.amountSliderContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_slider_container, "field 'amountSliderContainer'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.more_loan_link, "field 'moreLoanLink' and method 'onMoreOptionClick'");
        easycashFeaturesCardInformationFragment.moreLoanLink = (LinearLayout) onStart.write(IconCompatParcelizer2, R.id.more_loan_link, "field 'moreLoanLink'", LinearLayout.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesCardInformationFragment.this.onMoreOptionClick();
            }
        });
        easycashFeaturesCardInformationFragment.detail = (CustomSeparatedViews) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_overview, "field 'detail'", CustomSeparatedViews.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'nextButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesCardInformationFragment.this.nextButtonClick();
            }
        });
    }

    public final void read() {
        EasycashFeaturesCardInformationFragment easycashFeaturesCardInformationFragment = this.write;
        if (easycashFeaturesCardInformationFragment != null) {
            this.write = null;
            easycashFeaturesCardInformationFragment.cardSelector = null;
            easycashFeaturesCardInformationFragment.amountSliderContainer = null;
            easycashFeaturesCardInformationFragment.moreLoanLink = null;
            easycashFeaturesCardInformationFragment.detail = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TempLimitReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private TempLimitReviewFragment write;

    public TempLimitReviewFragment_ViewBinding(final TempLimitReviewFragment tempLimitReviewFragment, View view) {
        super(tempLimitReviewFragment, view);
        this.write = tempLimitReviewFragment;
        tempLimitReviewFragment.txvCardType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_type, "field 'txvCardType'", TextView.class);
        tempLimitReviewFragment.txvCardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_number, "field 'txvCardNumber'", TextView.class);
        tempLimitReviewFragment.txvAdditionalCreditAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_additional_credit_amount, "field 'txvAdditionalCreditAmount'", TextView.class);
        tempLimitReviewFragment.txvTotalCreditAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_credit_amount, "field 'txvTotalCreditAmount'", TextView.class);
        tempLimitReviewFragment.txvEffectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_effective_date, "field 'txvEffectiveDate'", TextView.class);
        tempLimitReviewFragment.txvEndDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_end_date, "field 'txvEndDate'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_confirm_redemption, "method 'onConfirmButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TempLimitReviewFragment.this.onConfirmButtonClick();
            }
        });
    }

    public final void read() {
        TempLimitReviewFragment tempLimitReviewFragment = this.write;
        if (tempLimitReviewFragment != null) {
            this.write = null;
            tempLimitReviewFragment.txvCardType = null;
            tempLimitReviewFragment.txvCardNumber = null;
            tempLimitReviewFragment.txvAdditionalCreditAmount = null;
            tempLimitReviewFragment.txvTotalCreditAmount = null;
            tempLimitReviewFragment.txvEffectiveDate = null;
            tempLimitReviewFragment.txvEndDate = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TempLimitConfirmationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TempLimitConfirmationFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public TempLimitConfirmationFragment_ViewBinding(final TempLimitConfirmationFragment tempLimitConfirmationFragment, View view) {
        super(tempLimitConfirmationFragment, view);
        this.MediaBrowserCompat$ItemReceiver = tempLimitConfirmationFragment;
        tempLimitConfirmationFragment.txvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'txvDateTime'", TextView.class);
        tempLimitConfirmationFragment.txvReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'txvReferenceId'", TextView.class);
        tempLimitConfirmationFragment.txvCardType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_type, "field 'txvCardType'", TextView.class);
        tempLimitConfirmationFragment.txvCardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_number, "field 'txvCardNumber'", TextView.class);
        tempLimitConfirmationFragment.txvAdditionalCreditAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_additional_credit_amount, "field 'txvAdditionalCreditAmount'", TextView.class);
        tempLimitConfirmationFragment.txvTotalCreditAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_total_credit_amount, "field 'txvTotalCreditAmount'", TextView.class);
        tempLimitConfirmationFragment.txvEffectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_effective_date, "field 'txvEffectiveDate'", TextView.class);
        tempLimitConfirmationFragment.txvEndDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_end_date, "field 'txvEndDate'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnToMyAccountsClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TempLimitConfirmationFragment.this.onReturnToMyAccountsClick();
            }
        });
    }

    public final void read() {
        TempLimitConfirmationFragment tempLimitConfirmationFragment = this.MediaBrowserCompat$ItemReceiver;
        if (tempLimitConfirmationFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            tempLimitConfirmationFragment.txvDateTime = null;
            tempLimitConfirmationFragment.txvReferenceId = null;
            tempLimitConfirmationFragment.txvCardType = null;
            tempLimitConfirmationFragment.txvCardNumber = null;
            tempLimitConfirmationFragment.txvAdditionalCreditAmount = null;
            tempLimitConfirmationFragment.txvTotalCreditAmount = null;
            tempLimitConfirmationFragment.txvEffectiveDate = null;
            tempLimitConfirmationFragment.txvEndDate = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

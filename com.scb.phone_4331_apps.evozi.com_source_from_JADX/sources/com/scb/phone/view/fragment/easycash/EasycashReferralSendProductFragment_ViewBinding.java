package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashReferralSendProductFragment_ViewBinding extends BaseEasycashReferralSendFragment_ViewBinding {
    private View IconCompatParcelizer;
    private EasycashReferralSendProductFragment MediaBrowserCompat$CustomActionResultReceiver;

    public EasycashReferralSendProductFragment_ViewBinding(final EasycashReferralSendProductFragment easycashReferralSendProductFragment, View view) {
        super(easycashReferralSendProductFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashReferralSendProductFragment;
        easycashReferralSendProductFragment.errorIncome = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_income_input_layout, "field 'errorIncome'", TextInputLayout.class);
        easycashReferralSendProductFragment.incomeAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount_income, "field 'incomeAmount'", AmountEditText.class);
        easycashReferralSendProductFragment.headerInfoReferral = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_info_referral, "field 'headerInfoReferral'", TextView.class);
        easycashReferralSendProductFragment.amountLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_label, "field 'amountLabel'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_send, "method 'onSendButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashReferralSendProductFragment.this.onSendButtonClick();
            }
        });
    }

    public final void read() {
        EasycashReferralSendProductFragment easycashReferralSendProductFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (easycashReferralSendProductFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            easycashReferralSendProductFragment.errorIncome = null;
            easycashReferralSendProductFragment.incomeAmount = null;
            easycashReferralSendProductFragment.headerInfoReferral = null;
            easycashReferralSendProductFragment.amountLabel = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

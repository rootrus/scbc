package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CreditCardDisplayFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CreditCardDisplayFragment MediaBrowserCompat$CustomActionResultReceiver;

    public CreditCardDisplayFragment_ViewBinding(CreditCardDisplayFragment creditCardDisplayFragment, View view) {
        super(creditCardDisplayFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = creditCardDisplayFragment;
        creditCardDisplayFragment.imvCreditCard = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_image_view, "field 'imvCreditCard'", ImageView.class);
        creditCardDisplayFragment.cardFirstFourDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'cardFirstFourDigit'", TextView.class);
        creditCardDisplayFragment.cardSecondTwoDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'cardSecondTwoDigit'", TextView.class);
        creditCardDisplayFragment.cardLastFourDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'cardLastFourDigit'", TextView.class);
        creditCardDisplayFragment.txvCardNickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_nick_name, "field 'txvCardNickName'", TextView.class);
    }

    public final void read() {
        CreditCardDisplayFragment creditCardDisplayFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (creditCardDisplayFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            creditCardDisplayFragment.imvCreditCard = null;
            creditCardDisplayFragment.cardFirstFourDigit = null;
            creditCardDisplayFragment.cardSecondTwoDigit = null;
            creditCardDisplayFragment.cardLastFourDigit = null;
            creditCardDisplayFragment.txvCardNickName = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

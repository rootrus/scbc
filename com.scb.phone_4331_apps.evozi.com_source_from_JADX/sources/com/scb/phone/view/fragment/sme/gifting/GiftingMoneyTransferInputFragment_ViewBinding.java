package com.scb.phone.view.fragment.sme.gifting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import p040o.onStart;

public class GiftingMoneyTransferInputFragment_ViewBinding extends BaseGiftTransferInputFragment_ViewBinding {
    private GiftingMoneyTransferInputFragment write;

    public GiftingMoneyTransferInputFragment_ViewBinding(GiftingMoneyTransferInputFragment giftingMoneyTransferInputFragment, View view) {
        super(giftingMoneyTransferInputFragment, view);
        this.write = giftingMoneyTransferInputFragment;
        giftingMoneyTransferInputFragment.mAmountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_amount_text_input, "field 'mAmountInputLayout'", TextInputLayout.class);
        giftingMoneyTransferInputFragment.mAmountValue = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_amount_value_edit_text, "field 'mAmountValue'", AmountEditText.class);
        giftingMoneyTransferInputFragment.mRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'mRemainingLimit'", TextView.class);
        giftingMoneyTransferInputFragment.giftLimitProgress = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.limit_view_group_progress, "field 'giftLimitProgress'", ViewGroup.class);
    }

    public final void read() {
        GiftingMoneyTransferInputFragment giftingMoneyTransferInputFragment = this.write;
        if (giftingMoneyTransferInputFragment != null) {
            this.write = null;
            giftingMoneyTransferInputFragment.mAmountInputLayout = null;
            giftingMoneyTransferInputFragment.mAmountValue = null;
            giftingMoneyTransferInputFragment.mRemainingLimit = null;
            giftingMoneyTransferInputFragment.giftLimitProgress = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

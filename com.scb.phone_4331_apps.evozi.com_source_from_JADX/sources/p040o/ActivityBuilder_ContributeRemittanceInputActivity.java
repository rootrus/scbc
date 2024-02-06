package p040o;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.view.fragment.sme.gifting.GiftingMoneyTransferInputFragment;

/* renamed from: o.ActivityBuilder_ContributeRemittanceInputActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRemittanceInputActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ GiftingMoneyTransferInputFragment write;

    public /* synthetic */ ActivityBuilder_ContributeRemittanceInputActivity(GiftingMoneyTransferInputFragment giftingMoneyTransferInputFragment) {
        this.write = giftingMoneyTransferInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        GiftingMoneyTransferInputFragment giftingMoneyTransferInputFragment = this.write;
        if (z) {
            TextInputLayout textInputLayout = giftingMoneyTransferInputFragment.mAmountInputLayout;
            if (textInputLayout != null) {
                textInputLayout.setHintEnabled(false);
            }
            giftingMoneyTransferInputFragment.mAmountInputLayout.setHint("");
        } else if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(giftingMoneyTransferInputFragment.mAmountValue.getText().toString())) {
            giftingMoneyTransferInputFragment.mAmountValue.setText("");
        }
    }
}

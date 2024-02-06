package com.scb.phone.view.fragment.remittance;

import android.text.Editable;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.C4997nB;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class RemittanceAmountFormFragment$MediaBrowserCompat$ItemReceiver extends FragmentBuilder_BindCreditLimitDisplayFragment {
    private /* synthetic */ RemittanceAmountFormFragment IconCompatParcelizer;

    RemittanceAmountFormFragment$MediaBrowserCompat$ItemReceiver(RemittanceAmountFormFragment remittanceAmountFormFragment) {
        this.IconCompatParcelizer = remittanceAmountFormFragment;
    }

    public final void afterTextChanged(Editable editable) {
        onGetStartedClick.write((Object) editable, "editable");
        CustomEditText customEditText = this.IconCompatParcelizer.etMobileInputField;
        if (customEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etMobileInputField");
        }
        if (customEditText.hasFocus()) {
            C4997nB nBVar = this.IconCompatParcelizer.presenter;
            if (nBVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nBVar.read(editable.toString());
            C4997nB nBVar2 = this.IconCompatParcelizer.presenter;
            if (nBVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AmountEditText amountEditText = this.IconCompatParcelizer.etFromAmountValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
            }
            double d = amountEditText.write;
            AmountEditText amountEditText2 = this.IconCompatParcelizer.etToAmountValue;
            if (amountEditText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
            }
            writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new C4997nB.MediaMetadataCompat(nBVar2, d, amountEditText2.write);
            if (nBVar2.RatingCompat != null) {
                mediaMetadataCompat.IconCompatParcelizer(nBVar2.RatingCompat);
            }
        }
    }
}

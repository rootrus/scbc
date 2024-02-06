package com.scb.phone.view.fragment.remittance;

import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.C4997nB;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class RemittanceAmountFormFragment$MediaBrowserCompat$MediaItem implements CustomSpinnerWithTitle.IconCompatParcelizer {
    private /* synthetic */ RemittanceAmountFormFragment MediaBrowserCompat$ItemReceiver;

    public final void write() {
    }

    RemittanceAmountFormFragment$MediaBrowserCompat$MediaItem(RemittanceAmountFormFragment remittanceAmountFormFragment) {
        this.MediaBrowserCompat$ItemReceiver = remittanceAmountFormFragment;
    }

    public final void IconCompatParcelizer() {
        C4997nB nBVar = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (nBVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomSpinnerWithTitle customSpinnerWithTitle = this.MediaBrowserCompat$ItemReceiver.swtPurpose;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("swtPurpose");
        }
        nBVar.MediaBrowserCompat$CustomActionResultReceiver(customSpinnerWithTitle.spinner.getSelectedItemPosition());
        C4997nB nBVar2 = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (nBVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        AmountEditText amountEditText = this.MediaBrowserCompat$ItemReceiver.etFromAmountValue;
        if (amountEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
        }
        double d = amountEditText.write;
        AmountEditText amountEditText2 = this.MediaBrowserCompat$ItemReceiver.etToAmountValue;
        if (amountEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
        }
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new C4997nB.MediaMetadataCompat(nBVar2, d, amountEditText2.write);
        if (nBVar2.RatingCompat != null) {
            mediaMetadataCompat.IconCompatParcelizer(nBVar2.RatingCompat);
        }
    }
}

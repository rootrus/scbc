package com.scb.phone.view.activity.prepaid.detail;

import android.view.View;
import com.scb.phone.view.custom.common.AmountEditText;
import p040o.ZHER2K;
import p040o.getAddress2FieldName;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.prepaid.detail.PrepaidTravelConversionLandingActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5696x8fc596d4 implements AmountEditText.read {
    private /* synthetic */ PrepaidTravelConversionLandingActivity IconCompatParcelizer;
    private /* synthetic */ View MediaBrowserCompat$ItemReceiver;

    C5696x8fc596d4(View view, PrepaidTravelConversionLandingActivity prepaidTravelConversionLandingActivity) {
        this.MediaBrowserCompat$ItemReceiver = view;
        this.IconCompatParcelizer = prepaidTravelConversionLandingActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        if (((AmountEditText) this.MediaBrowserCompat$ItemReceiver.findViewById(ZHER2K.write.edtAmountValue)).hasFocus()) {
            getAddress2FieldName getaddress2fieldname = this.IconCompatParcelizer.presenter;
            if (getaddress2fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String IconCompatParcelizer2 = getaddress2fieldname.IconCompatParcelizer(PrepaidTravelConversionLandingActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer).IconCompatParcelizer.get(0).write, d);
            View read = this.IconCompatParcelizer.read(ZHER2K.write.layoutFromAmount);
            onGetStartedClick.IconCompatParcelizer((Object) read, "layoutFromAmount");
            ((AmountEditText) read.findViewById(ZHER2K.write.edtAmountValue)).setText(IconCompatParcelizer2);
            getAddress2FieldName getaddress2fieldname2 = this.IconCompatParcelizer.presenter;
            if (getaddress2fieldname2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AmountEditText amountEditText = (AmountEditText) this.MediaBrowserCompat$ItemReceiver.findViewById(ZHER2K.write.edtAmountValue);
            onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "edtAmountValue");
            String valueOf = String.valueOf(amountEditText.getText());
            View read2 = this.IconCompatParcelizer.read(ZHER2K.write.layoutFromAmount);
            onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutFromAmount");
            AmountEditText amountEditText2 = (AmountEditText) read2.findViewById(ZHER2K.write.edtAmountValue);
            onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "layoutFromAmount.edtAmountValue");
            getaddress2fieldname2.IconCompatParcelizer(valueOf, String.valueOf(amountEditText2.getText()));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.PlaybackStateCompat$CustomAction();
    }
}

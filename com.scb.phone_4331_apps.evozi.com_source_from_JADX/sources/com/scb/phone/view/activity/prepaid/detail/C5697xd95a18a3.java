package com.scb.phone.view.activity.prepaid.detail;

import android.view.View;
import com.scb.phone.view.custom.common.AmountEditText;
import p040o.ZHER2K;
import p040o.getAddress2FieldName;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.prepaid.detail.PrepaidTravelConversionLandingActivity$MediaBrowserCompat$ItemReceiver */
public final class C5697xd95a18a3 implements AmountEditText.read {
    private /* synthetic */ View IconCompatParcelizer;
    private /* synthetic */ PrepaidTravelConversionLandingActivity write;

    C5697xd95a18a3(View view, PrepaidTravelConversionLandingActivity prepaidTravelConversionLandingActivity) {
        this.IconCompatParcelizer = view;
        this.write = prepaidTravelConversionLandingActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        if (((AmountEditText) this.IconCompatParcelizer.findViewById(ZHER2K.write.edtAmountValue)).hasFocus()) {
            getAddress2FieldName getaddress2fieldname = this.write.presenter;
            if (getaddress2fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String read = getaddress2fieldname.read(PrepaidTravelConversionLandingActivity.MediaBrowserCompat$ItemReceiver(this.write).IconCompatParcelizer.get(0).write, d);
            View read2 = this.write.read(ZHER2K.write.layoutToAmount);
            onGetStartedClick.IconCompatParcelizer((Object) read2, "layoutToAmount");
            ((AmountEditText) read2.findViewById(ZHER2K.write.edtAmountValue)).setText(read);
            getAddress2FieldName getaddress2fieldname2 = this.write.presenter;
            if (getaddress2fieldname2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AmountEditText amountEditText = (AmountEditText) this.IconCompatParcelizer.findViewById(ZHER2K.write.edtAmountValue);
            onGetStartedClick.IconCompatParcelizer((Object) amountEditText, "edtAmountValue");
            String valueOf = String.valueOf(amountEditText.getText());
            View read3 = this.write.read(ZHER2K.write.layoutToAmount);
            onGetStartedClick.IconCompatParcelizer((Object) read3, "layoutToAmount");
            AmountEditText amountEditText2 = (AmountEditText) read3.findViewById(ZHER2K.write.edtAmountValue);
            onGetStartedClick.IconCompatParcelizer((Object) amountEditText2, "layoutToAmount.edtAmountValue");
            getaddress2fieldname2.IconCompatParcelizer(valueOf, String.valueOf(amountEditText2.getText()));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.write.PlaybackStateCompat$CustomAction();
    }
}

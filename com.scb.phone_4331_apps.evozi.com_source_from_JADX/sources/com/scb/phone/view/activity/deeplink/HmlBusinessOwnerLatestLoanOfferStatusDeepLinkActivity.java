package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.hml.businessowner.C5624xf154595d;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerLoanSetupActivity;
import p040o.getIpAddress;
import p040o.onGetStartedClick;
import p040o.zzct;

public final class HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity extends HmlLoanOfferStatusDeepLinkBaseActivity {
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C5624xf154595d hmlBusinessOwnerLoanSetupActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOwnerLoanSetupActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "ctx");
        read(new Intent(context, HmlBusinessOwnerLoanSetupActivity.class));
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getIpAddress getipaddress = this.presenter;
        if (getipaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getIpAddress.IconCompatParcelizer(getipaddress, (String) null, zzct.zza.BUSINESS_OWNER, 1);
    }
}

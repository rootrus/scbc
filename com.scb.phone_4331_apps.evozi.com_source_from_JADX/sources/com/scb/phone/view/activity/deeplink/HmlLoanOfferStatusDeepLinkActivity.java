package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import p040o.LogFileManager;
import p040o.getIpAddress;
import p040o.onGetStartedClick;
import p040o.zzct;

public final class HmlLoanOfferStatusDeepLinkActivity extends HmlLoanOfferStatusDeepLinkBaseActivity {
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlETBLoanSetupActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "ctx");
        read(new Intent(context, HmlETBLoanSetupActivity.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        getIpAddress getipaddress = this.presenter;
        if (getipaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return !(getipaddress.write.write.read() != null);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getIpAddress getipaddress = this.presenter;
        if (getipaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getIpAddress.IconCompatParcelizer(getipaddress, str, (zzct.zza) null, 2);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper(LogFileManager.DirectoryProvider directoryProvider) {
        getIpAddress getipaddress = this.presenter;
        if (getipaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getIpAddress.IconCompatParcelizer(getipaddress, (String) null, (zzct.zza) null, 3);
    }
}

package p040o;

import p040o.zzge;

/* renamed from: o.getDeviceProtectedStorageContext */
public final /* synthetic */ class getDeviceProtectedStorageContext implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zzge.zzg MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getDeviceProtectedStorageContext(zzge.zzg zzg) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzg;
    }

    public final void IconCompatParcelizer(Object obj) {
        zzge.zzg zzg = this.MediaBrowserCompat$CustomActionResultReceiver;
        C7506tP tPVar = (C7506tP) obj;
        if (tPVar != null) {
            zzg.MediaSessionCompat$QueueItem.edit().putBoolean("com.scb.phone.pref.TERMS_AND_CONDITIONS_MUTUAL_FUND_REQUIRED", tPVar.f3180x50fd9e4a).apply();
        }
    }
}

package p040o;

import p040o.zzge;

/* renamed from: o.registerEvent */
public final /* synthetic */ class registerEvent implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zzge.zzg read;

    public /* synthetic */ registerEvent(zzge.zzg zzg) {
        this.read = zzg;
    }

    public final void IconCompatParcelizer(Object obj) {
        zzge.zzg zzg = this.read;
        C7506tP tPVar = (C7506tP) obj;
        if (tPVar != null) {
            zzg.MediaBrowserCompat$SearchResultReceiver.write.edit().putBoolean("com.scb.phone.pref.SHOW_PUSH_NOTIFICATIONS_POP_UP", tPVar.setHasDecor).apply();
        }
    }
}

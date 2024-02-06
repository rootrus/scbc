package p040o;

import p040o.ExperimentTokens;

/* renamed from: o.setOOBInline */
public final /* synthetic */ class setOOBInline implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ ExperimentTokens.zza read;
    private final /* synthetic */ String write;

    public /* synthetic */ setOOBInline(ExperimentTokens.zza zza, String str, String str2) {
        this.read = zza;
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final Object write(Object obj) {
        ExperimentTokens.zza zza = this.read;
        String str = this.IconCompatParcelizer;
        String str2 = this.write;
        String str3 = (String) obj;
        BScanCNotificationDeepLinkActivity<U> firstOrError = zza.read.MediaBrowserCompat$CustomActionResultReceiver(true).flatMapIterable(setKeepAlive.MediaBrowserCompat$ItemReceiver).filter(new setPerformancePreferences(str3)).firstOrError();
        setReuseAddress setreuseaddress = new setReuseAddress(str3, str, str2);
        HmlLatestPersonalInformationDeepLinkActivity.write(setreuseaddress, "mapper is null");
        return new onCopy(firstOrError, setreuseaddress);
    }
}

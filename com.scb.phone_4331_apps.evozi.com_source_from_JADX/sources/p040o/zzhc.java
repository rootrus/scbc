package p040o;

import p040o.zzfe;

/* renamed from: o.zzhc */
public final /* synthetic */ class zzhc implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzjv IconCompatParcelizer;

    public /* synthetic */ zzhc(zzjv zzjv) {
        this.IconCompatParcelizer = zzjv;
    }

    public final Object write(Object obj) {
        createPath createpath = (createPath) obj;
        onGetStartedClick.write((Object) createpath, "entity");
        return new zzfe.zzb(createpath.MediaBrowserCompat$ItemReceiver);
    }
}

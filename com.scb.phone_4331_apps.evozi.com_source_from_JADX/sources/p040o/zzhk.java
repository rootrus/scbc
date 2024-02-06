package p040o;

import p040o.zzjx;

/* renamed from: o.zzhk */
public final /* synthetic */ class zzhk implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzjv IconCompatParcelizer;

    public /* synthetic */ zzhk(zzjv zzjv) {
        this.IconCompatParcelizer = zzjv;
    }

    public final Object write(Object obj) {
        setVertex setvertex = (setVertex) obj;
        onGetStartedClick.write((Object) setvertex, "entity");
        return new zzjx.zzc(setvertex.MediaBrowserCompat$ItemReceiver, setvertex.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

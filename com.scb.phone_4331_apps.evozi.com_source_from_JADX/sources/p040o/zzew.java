package p040o;

import p040o.Api;
import p040o.LottieCompositionFactory;
import p040o.zzbt;

/* renamed from: o.zzew */
public final /* synthetic */ class zzew implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ Api.AnyClientKey MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzew(Api.AnyClientKey anyClientKey) {
        this.MediaBrowserCompat$CustomActionResultReceiver = anyClientKey;
    }

    public final Object write(Object obj) {
        Api.AnyClientKey anyClientKey = this.MediaBrowserCompat$CustomActionResultReceiver;
        LottieCompositionFactory.C360311 r4 = (LottieCompositionFactory.C360311) obj;
        if (r4 == null) {
            return null;
        }
        zzbt.zzf.zza.IconCompatParcelizer iconCompatParcelizer = new zzbt.zzf.zza.IconCompatParcelizer();
        iconCompatParcelizer.write = r4.MediaBrowserCompat$CustomActionResultReceiver;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = r4.read;
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = anyClientKey.MediaBrowserCompat$CustomActionResultReceiver(r4.IconCompatParcelizer);
        return iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
    }
}

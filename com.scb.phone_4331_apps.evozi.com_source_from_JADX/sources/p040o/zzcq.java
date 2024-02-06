package p040o;

import p040o.LottieCompositionFactory;
import p040o.zzbt;

/* renamed from: o.zzcq */
public final /* synthetic */ class zzcq implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzcq(getCredential getcredential) {
    }

    public final Object write(Object obj) {
        LottieCompositionFactory.C361110 r3 = (LottieCompositionFactory.C361110) obj;
        zzbt.zzc zzc = new zzbt.zzc();
        zzc.MediaBrowserCompat$ItemReceiver = r3.MediaBrowserCompat$CustomActionResultReceiver;
        zzc.MediaBrowserCompat$CustomActionResultReceiver = r3.write;
        return zzc;
    }
}

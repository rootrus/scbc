package p040o;

import p040o.LottieCompositionFactory;
import p040o.zzbt;

/* renamed from: o.lambdaFactory$$MediaBrowserCompat$ItemReceiver */
public final class lambdaFactory$$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private lambdaFactory$$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ lambdaFactory$$MediaBrowserCompat$ItemReceiver(getAccountTypesSet getaccounttypesset) {
    }

    public final Object IconCompatParcelizer(Object obj) {
        LottieCompositionFactory.C36021 r3 = (LottieCompositionFactory.C36021) obj;
        if (r3 == null) {
            return null;
        }
        zzbt.zzd.zzb.write write = new zzbt.zzd.zzb.write();
        write.MediaBrowserCompat$ItemReceiver = r3.MediaBrowserCompat$CustomActionResultReceiver;
        write.IconCompatParcelizer = r3.MediaBrowserCompat$ItemReceiver;
        write.write = r3.IconCompatParcelizer;
        write.read = r3.write;
        write.MediaBrowserCompat$CustomActionResultReceiver = r3.read;
        return new zzbt.zzd.zzb(write, (byte) 0);
    }
}

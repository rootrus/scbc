package p040o;

import p040o.LottieCompositionFactory;
import p040o.zzby;

/* renamed from: o.zzv */
public final class zzv extends FragmentBuilder_BindSummaryFragment {
    public static zzby.zza read(LottieCompositionFactory.C36086 r2) {
        zzby.zza.write write = new zzby.zza.write();
        write.MediaBrowserCompat$MediaItem = r2.MediaBrowserCompat$CustomActionResultReceiver;
        write.MediaBrowserCompat$CustomActionResultReceiver = r2.MediaBrowserCompat$ItemReceiver;
        write.MediaBrowserCompat$ItemReceiver = r2.write;
        write.IconCompatParcelizer = r2.IconCompatParcelizer;
        write.write = r2.read;
        return new zzby.zza(write, (byte) 0);
    }
}

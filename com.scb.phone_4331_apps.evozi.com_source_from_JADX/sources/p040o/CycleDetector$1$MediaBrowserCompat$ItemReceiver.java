package p040o;

import p040o.zzca;

/* renamed from: o.CycleDetector$1$MediaBrowserCompat$ItemReceiver */
public final class CycleDetector$1$MediaBrowserCompat$ItemReceiver implements findFragmentByWho {
    private CycleDetector$1$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ CycleDetector$1$MediaBrowserCompat$ItemReceiver(setSupported setsupported) {
    }

    public final Object IconCompatParcelizer(Object obj) {
        getName getname = (getName) obj;
        zzca.zzd.zza read = zzca.zzd.zza.read();
        read.RatingCompat = getname.write;
        read.MediaBrowserCompat$ItemReceiver = getname.MediaBrowserCompat$ItemReceiver;
        read.write = getname.read;
        read.MediaBrowserCompat$CustomActionResultReceiver = getname.MediaBrowserCompat$CustomActionResultReceiver;
        read.read = getname.IconCompatParcelizer;
        read.MediaDescriptionCompat = getname.MediaDescriptionCompat;
        read.MediaMetadataCompat = getname.MediaMetadataCompat;
        return read;
    }
}

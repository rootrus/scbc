package p040o;

import p040o.zzbt;
import p040o.zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.zzbt.zze.zza;
import p040o.zzby;

/* renamed from: o.zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver<T extends zzbt.zze.zza, B extends zzbt$zze$zza$MediaBrowserCompat$CustomActionResultReceiver<T, B>> {
    String IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver;
    isBuildingsEnabled MediaBrowserCompat$MediaItem;
    animateCamera MediaDescriptionCompat;
    zzby.zzb.zza read;
    String write;

    /* access modifiers changed from: protected */
    public abstract B IconCompatParcelizer();

    public abstract T write();

    public final B write(zzby.zzb.zza zza) {
        this.read = zza;
        return IconCompatParcelizer();
    }

    public final B MediaBrowserCompat$ItemReceiver(isBuildingsEnabled isbuildingsenabled) {
        this.MediaBrowserCompat$MediaItem = isbuildingsenabled;
        return IconCompatParcelizer();
    }

    public final B write(String str) {
        this.write = str;
        return IconCompatParcelizer();
    }

    public final B write(animateCamera animatecamera) {
        this.MediaDescriptionCompat = animatecamera;
        return IconCompatParcelizer();
    }

    public final B read(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
        return IconCompatParcelizer();
    }

    public final B MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.IconCompatParcelizer = str;
        return IconCompatParcelizer();
    }

    public final B MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        return IconCompatParcelizer();
    }
}

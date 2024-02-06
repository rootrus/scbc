package p040o;

import p040o.zzby;

/* renamed from: o.compareTo */
public final /* synthetic */ class compareTo implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzv write;

    public /* synthetic */ compareTo(zzv zzv) {
        this.write = zzv;
    }

    public final Object write(Object obj) {
        zzv zzv = this.write;
        zzby.zzb.read read = new zzby.zzb.read();
        read.IconCompatParcelizer = zzv.read(((LottieDrawable) obj).MediaBrowserCompat$ItemReceiver, new checkNotDeleted$MediaBrowserCompat$CustomActionResultReceiver(zzv), zzt.MediaBrowserCompat$ItemReceiver);
        return new zzby.zzb(read, (byte) 0);
    }
}

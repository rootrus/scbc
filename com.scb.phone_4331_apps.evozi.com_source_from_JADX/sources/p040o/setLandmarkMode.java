package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzfy;

/* renamed from: o.setLandmarkMode */
public final /* synthetic */ class setLandmarkMode implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzfy.zzb MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setLandmarkMode(zzfy.zzb zzb) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzb;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAddress5) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(0));
    }
}

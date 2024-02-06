package p040o;

import p040o.C7039x355e6121;
import p040o.getSteadyMessage;
import p040o.writeUInt64NoTag;
import p040o.zzxc;

/* renamed from: o.setHoldParallelMessage */
public final /* synthetic */ class setHoldParallelMessage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSteadyMessage.C46683 IconCompatParcelizer;
    private final /* synthetic */ C7039x355e6121.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ zzxc.zzd read;

    public /* synthetic */ setHoldParallelMessage(getSteadyMessage.C46683 r1, zzxc.zzd zzd, C7039x355e6121.read read2) {
        this.IconCompatParcelizer = r1;
        this.read = zzd;
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    public final void IconCompatParcelizer(Object obj) {
        getSteadyMessage.C46683 r0 = this.IconCompatParcelizer;
        zzxc.zzd zzd = this.read;
        ((getMicrAmount$MediaBrowserCompat$SearchResultReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(getSteadyMessage.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(zzd), this.MediaBrowserCompat$ItemReceiver);
    }
}

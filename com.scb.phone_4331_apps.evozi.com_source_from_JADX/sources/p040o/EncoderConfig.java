package p040o;

import p040o.C7039x355e6121;
import p040o.Publisher;
import p040o.RttiJsonCheck;
import p040o.writeUInt64NoTag;
import p040o.zzxc;

/* renamed from: o.EncoderConfig */
public final /* synthetic */ class EncoderConfig implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Publisher.C37443 IconCompatParcelizer;
    private final /* synthetic */ C7039x355e6121.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ zzxc.zzd write;

    public /* synthetic */ EncoderConfig(Publisher.C37443 r1, zzxc.zzd zzd, C7039x355e6121.read read) {
        this.IconCompatParcelizer = r1;
        this.write = zzd;
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        Publisher.C37443 r0 = this.IconCompatParcelizer;
        zzxc.zzd zzd = this.write;
        ((RttiJsonCheck.C1257a) obj).MediaBrowserCompat$CustomActionResultReceiver(Publisher.this.write.MediaBrowserCompat$ItemReceiver(zzd), this.MediaBrowserCompat$ItemReceiver);
    }
}

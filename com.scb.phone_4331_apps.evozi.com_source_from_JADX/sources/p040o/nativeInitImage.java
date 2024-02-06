package p040o;

import p040o.CreditCard;
import p040o.RegularImmutableMap;
import p040o.releaseFileBuffer;
import p040o.writeUInt64NoTag;
import p040o.zzca;

/* renamed from: o.nativeInitImage */
public final /* synthetic */ class nativeInitImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ releaseFileBuffer.read IconCompatParcelizer;
    private final /* synthetic */ zzca.zzd MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeInitImage(releaseFileBuffer.read read, zzca.zzd zzd) {
        this.IconCompatParcelizer = read;
        this.MediaBrowserCompat$ItemReceiver = zzd;
    }

    public final void IconCompatParcelizer(Object obj) {
        releaseFileBuffer.read read = this.IconCompatParcelizer;
        zzca.zzd zzd = this.MediaBrowserCompat$ItemReceiver;
        CreditCard.C11681 r3 = (CreditCard.C11681) obj;
        r3.MediaBrowserCompat$CustomActionResultReceiver();
        releaseFileBuffer releasefilebuffer = releaseFileBuffer.this;
        RegularImmutableMap.Values unused = releasefilebuffer.MediaBrowserCompat$ItemReceiver;
        finalizePreviousNativeSession unused2 = releasefilebuffer.read = RegularImmutableMap.Values.MediaBrowserCompat$ItemReceiver(zzd);
        r3.aj_();
    }
}

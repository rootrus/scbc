package p040o;

import p040o.RegularImmutableMap;
import p040o.nativeWriteJpegImage;
import p040o.writeUInt64NoTag;
import p040o.zzca;

/* renamed from: o.IpFileBuffer */
public final /* synthetic */ class IpFileBuffer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeWriteJpegImage.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ zzca.zzd write;

    public /* synthetic */ IpFileBuffer(nativeWriteJpegImage.IconCompatParcelizer iconCompatParcelizer, zzca.zzd zzd) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.write = zzd;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteJpegImage.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        zzca.zzd zzd = this.write;
        setExpirationMonth setexpirationmonth = (setExpirationMonth) obj;
        setexpirationmonth.aj_();
        RegularImmutableMap.Values unused = nativeWriteJpegImage.this.MediaBrowserCompat$ItemReceiver;
        setexpirationmonth.write(RegularImmutableMap.Values.MediaBrowserCompat$ItemReceiver(zzd));
    }
}

package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzqj;

/* renamed from: o.JsonIOException */
public final /* synthetic */ class JsonIOException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzqj.zza MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4501x89543781 read;

    public /* synthetic */ JsonIOException(C4501x89543781 getarraycomponenttype_mediabrowsercompat_customactionresultreceiver, zzqj.zza zza) {
        this.read = getarraycomponenttype_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4501x89543781 getarraycomponenttype_mediabrowsercompat_customactionresultreceiver = this.read;
        ((IdCaptureModule) obj).IconCompatParcelizer(getarraycomponenttype_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}

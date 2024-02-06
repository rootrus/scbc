package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzfy;

/* renamed from: o.setJobId$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$ItemReceiver */
final class C10148x89632a9f<V> implements writeUInt64NoTag.IconCompatParcelizer<C6980x2ace65f3> {
    private /* synthetic */ zzfy.zze MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ setJobId$MediaBrowserCompat$CustomActionResultReceiver write;

    C10148x89632a9f(setJobId$MediaBrowserCompat$CustomActionResultReceiver setjobid_mediabrowsercompat_customactionresultreceiver, zzfy.zze zze) {
        this.write = setjobid_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = zze;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        C6980x2ace65f3 passportCaptureModule_GetOnDeviceExceptionResponseDeserializerFactory = (C6980x2ace65f3) obj;
        String str = this.MediaBrowserCompat$ItemReceiver.write;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver.read;
        if (str3 != null) {
            str2 = str3;
        }
        passportCaptureModule_GetOnDeviceExceptionResponseDeserializerFactory.IconCompatParcelizer(str, str2, this.write.write.MediaBrowserCompat$SearchResultReceiver);
    }
}

package p040o;

import p040o.C10840getIndexFields;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIndexFields$read$MediaBrowserCompat$CustomActionResultReceiver */
final class C9974x87acabb2<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDetector> {
    private /* synthetic */ C10840getIndexFields.read MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ Throwable read;

    C9974x87acabb2(C10840getIndexFields.read read2, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
        this.read = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        proxyGetIPassportDetector proxygetipassportdetector = (proxyGetIPassportDetector) obj;
        access$2200 MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplayMapper.transform(e)");
        String str = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplayMapper.transform(e).message");
        proxygetipassportdetector.IconCompatParcelizer(str);
        proxygetipassportdetector.read();
    }
}

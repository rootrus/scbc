package p040o;

import p040o.IdWorkflowActivity;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeGetImage$MediaBrowserCompat$ItemReceiver */
final class nativeGetImage$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdWorkflowActivity.C1222a> {
    private /* synthetic */ nativeGetImage MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ Throwable read;

    nativeGetImage$MediaBrowserCompat$ItemReceiver(nativeGetImage nativegetimage, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = nativegetimage;
        this.read = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "errorDisplayMapper.transform(error)");
        ((IdWorkflowActivity.C1222a) obj).mo13730i_(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer);
    }
}

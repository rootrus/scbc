package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.JsonDataEncoderBuilder$$Lambda$4 */
public final /* synthetic */ class JsonDataEncoderBuilder$$Lambda$4 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ForwardingCheckedFuture MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ JsonDataEncoderBuilder$$Lambda$4(ForwardingCheckedFuture forwardingCheckedFuture) {
        this.MediaBrowserCompat$ItemReceiver = forwardingCheckedFuture;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiJsonCheck) obj).read(this.MediaBrowserCompat$ItemReceiver.read, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
    }
}

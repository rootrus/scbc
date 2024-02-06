package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.stopRecord */
public final /* synthetic */ class stopRecord implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C5219x51187542 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ stopRecord(C5219x51187542 removedatastoreinitializedlistener_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = removedatastoreinitializedlistener_mediabrowsercompat_customactionresultreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getEpc) obj).write(this.MediaBrowserCompat$ItemReceiver.write.MediaDescriptionCompat);
    }
}

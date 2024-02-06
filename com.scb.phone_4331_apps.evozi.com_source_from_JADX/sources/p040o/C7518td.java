package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.td */
public final /* synthetic */ class C7518td implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBoundsBias MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ sI$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ C7518td(sI$MediaBrowserCompat$CustomActionResultReceiver si_mediabrowsercompat_customactionresultreceiver, setBoundsBias setboundsbias) {
        this.write = si_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        sI$MediaBrowserCompat$CustomActionResultReceiver si_mediabrowsercompat_customactionresultreceiver = this.write;
        setBoundsBias setboundsbias = this.MediaBrowserCompat$ItemReceiver;
        getTopLeftCornerWidth.setExpandedFormat setexpandedformat = (getTopLeftCornerWidth.setExpandedFormat) obj;
        setexpandedformat.ay_();
        setexpandedformat.read(si_mediabrowsercompat_customactionresultreceiver.write.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(setboundsbias));
    }
}

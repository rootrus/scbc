package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nB$MediaBrowserCompat$CustomActionResultReceiver */
public final class nB$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceLeftPadding> {
    private /* synthetic */ double IconCompatParcelizer;
    private /* synthetic */ double MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C4997nB write;

    public nB$MediaBrowserCompat$CustomActionResultReceiver(C4997nB nBVar, double d, double d2) {
        this.write = nBVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.IconCompatParcelizer = d2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        setFaceLeftPadding setfaceleftpadding = (setFaceLeftPadding) obj;
        if (C4997nB.RatingCompat(this.write).RatingCompat) {
            setfaceleftpadding.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyEmailSuccessfulActivity(Double.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver), Double.valueOf(this.IconCompatParcelizer)), this.write.MediaMetadataCompat, this.write.read, this.write.MediaBrowserCompat$ItemReceiver);
        } else {
            setfaceleftpadding.MediaBrowserCompat$ItemReceiver(new HmlVerifyEmailSuccessfulActivity(Double.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver), Double.valueOf(this.IconCompatParcelizer)));
        }
    }
}

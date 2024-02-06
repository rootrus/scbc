package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.nB$MediaBrowserCompat$ItemReceiver */
public final class nB$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceLeftPadding> {
    private /* synthetic */ double IconCompatParcelizer;
    private /* synthetic */ C4997nB MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ double write;

    public nB$MediaBrowserCompat$ItemReceiver(C4997nB nBVar, double d, double d2) {
        this.MediaBrowserCompat$ItemReceiver = nBVar;
        this.write = d;
        this.IconCompatParcelizer = d2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        setFaceLeftPadding setfaceleftpadding = (setFaceLeftPadding) obj;
        String format = C4997nB.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver).format(this.write);
        onGetStartedClick.IconCompatParcelizer((Object) format, "formatter.format(result)");
        setfaceleftpadding.write(format);
        if (!C4997nB.RatingCompat(this.MediaBrowserCompat$ItemReceiver).RatingCompat) {
            return;
        }
        if (this.IconCompatParcelizer > ((double) C4997nB.RatingCompat(this.MediaBrowserCompat$ItemReceiver).MediaSessionCompat$ResultReceiverWrapper)) {
            setfaceleftpadding.read();
        } else {
            setfaceleftpadding.write();
        }
    }
}

package p040o;

import p040o.Image;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCenterPoint */
public final /* synthetic */ class getCenterPoint implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Image.FriendI write;

    public /* synthetic */ getCenterPoint(Image.FriendI friendI, Throwable th) {
        this.write = friendI;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        Image.FriendI friendI = this.write;
        ((C6395xeeeefe7) obj).write(friendI.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.NAVIGATE_BACK));
    }
}

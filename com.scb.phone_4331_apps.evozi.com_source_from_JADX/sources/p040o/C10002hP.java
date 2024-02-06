package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.hP */
public final /* synthetic */ class C10002hP implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setZoomInMsg MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10002hP(setZoomInMsg setzoominmsg, String str) {
        this.MediaBrowserCompat$ItemReceiver = setzoominmsg;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector$MediaBrowserCompat$MediaItem) obj).write("gift_share_moment_preview", new ZSYR2K("gift_type", this.MediaBrowserCompat$CustomActionResultReceiver), new ZSYR2K("gift_id", this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem));
    }
}

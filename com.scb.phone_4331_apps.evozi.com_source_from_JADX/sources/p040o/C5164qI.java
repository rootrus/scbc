package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.qI */
public final /* synthetic */ class C5164qI implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setZoomInMsg MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ C5164qI(setZoomInMsg setzoominmsg, String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setzoominmsg;
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        setZoomInMsg setzoominmsg = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((CheckParameters_MembersInjector$MediaBrowserCompat$MediaItem) obj).write("gift_share_moment_action", new ZSYR2K("gift_type", this.read), new ZSYR2K("gift_id", setzoominmsg.IconCompatParcelizer.MediaBrowserCompat$MediaItem), new ZSYR2K("background", this.MediaBrowserCompat$ItemReceiver));
    }
}

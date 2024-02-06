package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.hO */
public final /* synthetic */ class C4731hO implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ setZoomInMsg read;

    public /* synthetic */ C4731hO(setZoomInMsg setzoominmsg, String str) {
        this.read = setzoominmsg;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters_MembersInjector$MediaBrowserCompat$MediaItem) obj).write("gift_share_moment", new ZSYR2K("gift_type", this.IconCompatParcelizer), new ZSYR2K("gift_id", this.read.IconCompatParcelizer.MediaBrowserCompat$MediaItem));
    }
}

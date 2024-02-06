package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setTimeout */
public final /* synthetic */ class setTimeout implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getRequestPassword MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean write;

    public /* synthetic */ setTimeout(getRequestPassword getrequestpassword, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = getrequestpassword;
        this.write = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        getRequestPassword getrequestpassword = this.MediaBrowserCompat$ItemReceiver;
        ((getGrayLevelStreakCount) obj).write(getrequestpassword.write, this.write);
    }
}

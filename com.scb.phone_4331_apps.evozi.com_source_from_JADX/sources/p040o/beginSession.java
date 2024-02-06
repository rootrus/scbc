package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.beginSession */
public final /* synthetic */ class beginSession implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ removeAppStatsWriteFileListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ beginSession(removeAppStatsWriteFileListener removeappstatswritefilelistener, String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = removeappstatswritefilelistener;
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        removeAppStatsWriteFileListener removeappstatswritefilelistener = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((C10883getLar) obj).write(removeappstatswritefilelistener.MediaBrowserCompat$CustomActionResultReceiver.read(this.write, this.IconCompatParcelizer, access$2300.write.JUST_DISMISS));
    }
}

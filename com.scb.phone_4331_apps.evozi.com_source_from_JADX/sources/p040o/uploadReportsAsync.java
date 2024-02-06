package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.uploadReportsAsync */
public final /* synthetic */ class uploadReportsAsync implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ makeUninterruptible write;

    public /* synthetic */ uploadReportsAsync(makeUninterruptible makeuninterruptible) {
        this.write = makeuninterruptible;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaBrowserCompat$MediaItem) obj).read(this.write);
    }
}

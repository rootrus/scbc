package p040o;

import p040o.TreeTypeAdapter;
import p040o.writeUInt64NoTag;

/* renamed from: o.TreeTypeAdapter$SingleTypeFactory$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3875x6eb12ce8 implements Runnable {
    private /* synthetic */ TreeTypeAdapter.SingleTypeFactory MediaBrowserCompat$ItemReceiver;

    public C3875x6eb12ce8(TreeTypeAdapter.SingleTypeFactory singleTypeFactory) {
        this.MediaBrowserCompat$ItemReceiver = singleTypeFactory;
    }

    public final void run() {
        TreeTypeAdapter.SingleTypeFactory singleTypeFactory = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C38765.MediaBrowserCompat$ItemReceiver;
        if (singleTypeFactory.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(singleTypeFactory.RatingCompat);
        }
    }
}

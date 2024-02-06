package p040o;

import android.os.Parcel;
import p040o.forEachSrcAtop$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.forEachSrcAtop */
public final class forEachSrcAtop extends ZTBSV {
    public static final forEachSrcAtop$MediaBrowserCompat$ItemReceiver CREATOR = new forEachSrcAtop$MediaBrowserCompat$ItemReceiver((byte) 0);
    public static final forEachSrcAtop$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new forEachSrcAtop$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    public static final forEachSrcAtop$MediaBrowserCompat$ItemReceiver.write read = new forEachSrcAtop$MediaBrowserCompat$ItemReceiver.write();
    public static final C1313x659d68b7 write = new C1313x659d68b7();

    public forEachSrcAtop() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public forEachSrcAtop(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }
}

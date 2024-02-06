package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.ImmutableMultiset;

/* renamed from: o.equalTo */
public final class equalTo extends IndoorBuilding {
    public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver read;

    @HmlPinActivity
    public equalTo(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, String str, String str2) {
        write(this.read.write(str, str2, new ImmutableMultiset.EntrySet(z ? DiskLruCache.VERSION_1 : "0")));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        write(this.read.read(new ImmutableMultiset.EntrySet(z ? DiskLruCache.VERSION_1 : "0")));
    }
}

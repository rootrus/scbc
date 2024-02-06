package p040o;

import p040o.Collections2;
import p040o.Splitter;

/* renamed from: o.memoize */
public final class memoize extends IndoorBuilding {
    final setCvv MediaBrowserCompat$CustomActionResultReceiver;
    private final newOnDeviceIdExtractor read;
    private final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver write;

    @HmlPinActivity
    public memoize(getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, setCvv setcvv, newOnDeviceIdExtractor newondeviceidextractor, CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.write = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = setcvv;
        this.read = newondeviceidextractor;
    }

    public final void read(Collections2.C31781 r2, boolean z) {
        write(this.read.IconCompatParcelizer(z).map(new Splitter.Strategy(r2)).flatMap(new padEnd(this.write)).doOnNext(new Splitter.AbstractIterator.State(this)));
    }
}

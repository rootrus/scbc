package p040o;

import java.util.ListIterator;

/* renamed from: o.PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$SearchResultReceiver */
class C7000xf123db75 {
    private int IconCompatParcelizer;
    final PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem write;

    C7000xf123db75(PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem, int i) {
        this.write = prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem;
        this.IconCompatParcelizer = i;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$ItemReceiver(ListIterator<C7000xf123db75> listIterator) {
        if (!this.write.MediaBrowserCompat$CustomActionResultReceiver() || !listIterator.hasNext()) {
            return 0;
        }
        PrepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem = listIterator.next().write;
        listIterator.previous();
        if (prepaidCardAdapter$PrepaidHolder$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()) {
            return this.IconCompatParcelizer;
        }
        return 0;
    }
}

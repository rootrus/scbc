package p040o;

import p040o.onBtnSaveClicked;

/* renamed from: o.onBtnSaveClicked$MediaBrowserCompat$SearchResultReceiver */
final class onBtnSaveClicked$MediaBrowserCompat$SearchResultReceiver<T> implements onBtnSaveClicked.read<T> {
    private final int IconCompatParcelizer;

    onBtnSaveClicked$MediaBrowserCompat$SearchResultReceiver(int i) {
        this.IconCompatParcelizer = i;
    }

    public final onBtnSaveClicked$MediaBrowserCompat$MediaItem<T> read() {
        return new onBtnSaveClicked.ParcelableVolumeInfo(this.IconCompatParcelizer);
    }
}

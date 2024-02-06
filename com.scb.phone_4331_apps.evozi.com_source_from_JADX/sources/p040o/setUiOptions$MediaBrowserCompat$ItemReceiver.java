package p040o;

import android.database.DataSetObserver;

/* renamed from: o.setUiOptions$MediaBrowserCompat$ItemReceiver */
class setUiOptions$MediaBrowserCompat$ItemReceiver extends DataSetObserver {
    final /* synthetic */ setUiOptions write;

    setUiOptions$MediaBrowserCompat$ItemReceiver(setUiOptions setuioptions) {
        this.write = setuioptions;
    }

    public final void onChanged() {
        if (this.write.MediaBrowserCompat$CustomActionResultReceiver()) {
            this.write.MediaDescriptionCompat();
        }
    }

    public final void onInvalidated() {
        this.write.IconCompatParcelizer();
    }
}

package p040o;

import java.util.NoSuchElementException;

/* renamed from: o.onGetStartClicked */
public final class onGetStartClicked extends HmlNationalIdHelpActivity {
    private final int IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    private int read;

    public onGetStartClicked(int i, int i2, int i3) {
        this.MediaBrowserCompat$ItemReceiver = i3;
        this.IconCompatParcelizer = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.read = !z ? this.IconCompatParcelizer : i;
    }

    public final boolean hasNext() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int write() {
        int i = this.read;
        if (i != this.IconCompatParcelizer) {
            this.read = this.MediaBrowserCompat$ItemReceiver + i;
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }
}

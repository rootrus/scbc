package p040o;

import android.view.View;
import p040o.setDynamicHeightEnabled;

/* renamed from: o.setHeaderTextAppearance$MediaBrowserCompat$ItemReceiver */
final class setHeaderTextAppearance$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ setDynamicHeightEnabled.write MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ setRam MediaBrowserCompat$ItemReceiver;

    setHeaderTextAppearance$MediaBrowserCompat$ItemReceiver(setDynamicHeightEnabled.write write, setRam setram) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
        this.MediaBrowserCompat$ItemReceiver = setram;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$ItemReceiver);
    }
}

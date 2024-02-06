package p040o;

import android.graphics.Bitmap;

/* renamed from: o.getLastCustomNonConfigurationInstance */
public final class getLastCustomNonConfigurationInstance implements performOptionsMenuClosed<Bitmap>, performDestroy {
    private final CheckParameters_MembersInjector MediaBrowserCompat$ItemReceiver;
    private final Bitmap read;

    public getLastCustomNonConfigurationInstance(Bitmap bitmap, CheckParameters_MembersInjector checkParameters_MembersInjector) {
        if (bitmap != null) {
            this.read = bitmap;
            if (checkParameters_MembersInjector != null) {
                this.MediaBrowserCompat$ItemReceiver = checkParameters_MembersInjector;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public final Class<Bitmap> IconCompatParcelizer() {
        return Bitmap.class;
    }

    public final int read() {
        return LinearLayoutManager.IconCompatParcelizer(this.read);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver.write(this.read);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.read.prepareToDraw();
    }

    public final /* bridge */ /* synthetic */ Object write() {
        return this.read;
    }
}

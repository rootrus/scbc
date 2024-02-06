package p040o;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: o.DGEMV */
public final class DGEMV extends getSupportLoaderManager {
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;

    private DGEMV(CheckParameters_MembersInjector checkParameters_MembersInjector, int i, int i2) {
        super(checkParameters_MembersInjector);
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.IconCompatParcelizer = i2;
    }

    public final Bitmap IconCompatParcelizer(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap, int i, int i2) {
        Rect MediaBrowserCompat$CustomActionResultReceiver2 = CTRSV.MediaBrowserCompat$CustomActionResultReceiver(bitmap.getWidth(), bitmap.getHeight(), this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer);
        return Bitmap.createScaledBitmap(bitmap, MediaBrowserCompat$CustomActionResultReceiver2.width(), MediaBrowserCompat$CustomActionResultReceiver2.height(), true);
    }

    public static getSupportLoaderManager IconCompatParcelizer(CheckParameters_MembersInjector checkParameters_MembersInjector, int i, int i2) {
        return new DGEMV(checkParameters_MembersInjector, i, i2);
    }
}

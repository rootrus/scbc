package p040o;

import android.graphics.Bitmap;
import p040o.setPrinter;

/* renamed from: o.setRowOrderPreserved */
public final class setRowOrderPreserved extends validateRequestPermissionsRequestCode<setUseDefaultMargins> {
    public setRowOrderPreserved(setUseDefaultMargins setusedefaultmargins) {
        super(setusedefaultmargins);
    }

    public final Class<setUseDefaultMargins> IconCompatParcelizer() {
        return setUseDefaultMargins.class;
    }

    public final int read() {
        setPrinter setprinter = ((setUseDefaultMargins) this.IconCompatParcelizer).read.IconCompatParcelizer;
        return setprinter.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver() + setprinter.IconCompatParcelizer;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ((setUseDefaultMargins) this.IconCompatParcelizer).stop();
        setUseDefaultMargins setusedefaultmargins = (setUseDefaultMargins) this.IconCompatParcelizer;
        setusedefaultmargins.MediaBrowserCompat$CustomActionResultReceiver = true;
        setPrinter setprinter = setusedefaultmargins.read.IconCompatParcelizer;
        setprinter.read.clear();
        Bitmap bitmap = setprinter.MediaBrowserCompat$ItemReceiver;
        if (bitmap != null) {
            setprinter.MediaBrowserCompat$CustomActionResultReceiver.write(bitmap);
            setprinter.MediaBrowserCompat$ItemReceiver = null;
        }
        setprinter.MediaBrowserCompat$SearchResultReceiver = false;
        setPrinter.write write = setprinter.write;
        if (write != null) {
            hashCode hashcode = setprinter.MediaSessionCompat$Token;
            if (write != null) {
                hashcode.MediaBrowserCompat$CustomActionResultReceiver(write);
            }
            setprinter.write = null;
        }
        setPrinter.write write2 = setprinter.RatingCompat;
        if (write2 != null) {
            hashCode hashcode2 = setprinter.MediaSessionCompat$Token;
            if (write2 != null) {
                hashcode2.MediaBrowserCompat$CustomActionResultReceiver(write2);
            }
            setprinter.RatingCompat = null;
        }
        setPrinter.write write3 = setprinter.MediaSessionCompat$ResultReceiverWrapper;
        if (write3 != null) {
            hashCode hashcode3 = setprinter.MediaSessionCompat$Token;
            if (write3 != null) {
                hashcode3.MediaBrowserCompat$CustomActionResultReceiver(write3);
            }
            setprinter.MediaSessionCompat$ResultReceiverWrapper = null;
        }
        setprinter.MediaBrowserCompat$MediaItem.write();
        setprinter.MediaDescriptionCompat = true;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ((setUseDefaultMargins) this.IconCompatParcelizer).read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.prepareToDraw();
    }
}

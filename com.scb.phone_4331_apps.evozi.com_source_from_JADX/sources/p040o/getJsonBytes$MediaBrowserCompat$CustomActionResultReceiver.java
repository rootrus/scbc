package p040o;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import p040o.getJsonBytes;

/* renamed from: o.getJsonBytes$MediaBrowserCompat$CustomActionResultReceiver */
public final class getJsonBytes$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<setZoomControlsEnabled>> {
    private /* synthetic */ getJsonBytes read;

    private getJsonBytes$MediaBrowserCompat$CustomActionResultReceiver(getJsonBytes getjsonbytes) {
        this.read = getjsonbytes;
    }

    public /* synthetic */ getJsonBytes$MediaBrowserCompat$CustomActionResultReceiver(getJsonBytes getjsonbytes, byte b) {
        this(getjsonbytes);
    }

    /* access modifiers changed from: private */
    /* renamed from: write */
    public void onNext(List<setZoomControlsEnabled> list) {
        this.read.MediaBrowserCompat$ItemReceiver.write(new SimpleDateFormat("yyyy-MM-dd").format(this.read.write.getDate()), list);
        this.read.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getJsonBytes.read(this.read, (byte) 0));
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if (!this.read.MediaBrowserCompat$SearchResultReceiver(th)) {
            if (this.read.RatingCompat != null) {
                onNext(new ArrayList());
                return;
            }
        }
        getJsonBytes.MediaSessionCompat$Token(this.read);
        getJsonBytes getjsonbytes = this.read;
        getFingerprintHashForPackage getfingerprinthashforpackage = getFingerprintHashForPackage.IconCompatParcelizer;
        if (getjsonbytes.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getfingerprinthashforpackage.IconCompatParcelizer(getjsonbytes.RatingCompat);
        }
    }
}

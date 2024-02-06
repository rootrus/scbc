package p040o;

import java.util.List;
import p040o.BarCodeCaptureView;
import p040o.access$2300;

/* renamed from: o.onGlobalLayout$MediaBrowserCompat$ItemReceiver */
public class onGlobalLayout$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<isGpsUsable>> {
    final /* synthetic */ onGlobalLayout write;

    public onGlobalLayout$MediaBrowserCompat$ItemReceiver(onGlobalLayout ongloballayout) {
        this.write = ongloballayout;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        onGlobalLayout.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        if (list != null) {
            onGlobalLayout ongloballayout = this.write;
            containsMapping unused = ongloballayout.write;
            List unused2 = ongloballayout.IconCompatParcelizer = containsMapping.MediaBrowserCompat$ItemReceiver(list, new BarCodeCaptureView.C3108a(this.write.write));
            onGlobalLayout ongloballayout2 = this.write;
            getImagePreviewWidth getimagepreviewwidth = new getImagePreviewWidth(this);
            if (ongloballayout2.RatingCompat != null) {
                getimagepreviewwidth.IconCompatParcelizer(ongloballayout2.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        onGlobalLayout.MediaBrowserCompat$ItemReceiver(this.write);
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

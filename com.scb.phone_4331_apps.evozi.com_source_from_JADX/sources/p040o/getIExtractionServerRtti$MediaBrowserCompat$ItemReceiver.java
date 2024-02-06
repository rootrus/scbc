package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.getIExtractionServerRtti$MediaBrowserCompat$ItemReceiver */
final class getIExtractionServerRtti$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<setZoomControlsEnabled>> {
    private /* synthetic */ getIExtractionServerRtti MediaBrowserCompat$ItemReceiver;

    private getIExtractionServerRtti$MediaBrowserCompat$ItemReceiver(getIExtractionServerRtti getiextractionserverrtti) {
        this.MediaBrowserCompat$ItemReceiver = getiextractionserverrtti;
    }

    /* synthetic */ getIExtractionServerRtti$MediaBrowserCompat$ItemReceiver(getIExtractionServerRtti getiextractionserverrtti, byte b) {
        this(getiextractionserverrtti);
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        List unused = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = list;
        boolean z = true;
        if (!(this.MediaBrowserCompat$ItemReceiver.RatingCompat != null)) {
            return;
        }
        if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem != null) {
            parseEventSignal read = this.MediaBrowserCompat$ItemReceiver.write.read(list, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem);
            if (read != null) {
                getIExtractionServerRtti getiextractionserverrtti = this.MediaBrowserCompat$ItemReceiver;
                clearBitmap clearbitmap = new clearBitmap(read);
                if (getiextractionserverrtti.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    clearbitmap.IconCompatParcelizer(getiextractionserverrtti.RatingCompat);
                    return;
                }
                return;
            }
            getIExtractionServerRtti getiextractionserverrtti2 = this.MediaBrowserCompat$ItemReceiver;
            BillCaptureActivity billCaptureActivity = BillCaptureActivity.MediaBrowserCompat$ItemReceiver;
            if (getiextractionserverrtti2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                billCaptureActivity.IconCompatParcelizer(getiextractionserverrtti2.RatingCompat);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        getIExtractionServerRtti getiextractionserverrtti3 = this.MediaBrowserCompat$ItemReceiver;
        List unused2 = getiextractionserverrtti3.read = AbstractService.MediaBrowserCompat$ItemReceiver(list, new tryReleaseShared(getiextractionserverrtti3.write));
        new show(this.MediaBrowserCompat$ItemReceiver.read).read(new getIExceptionResponseDeserializerRtti(arrayList));
        getIExtractionServerRtti getiextractionserverrtti4 = this.MediaBrowserCompat$ItemReceiver;
        getCaptureActivityClass getcaptureactivityclass = new getCaptureActivityClass(arrayList);
        if (getiextractionserverrtti4.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getcaptureactivityclass.IconCompatParcelizer(getiextractionserverrtti4.RatingCompat);
        }
    }

    public final void onComplete() {
        getIExtractionServerRtti.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            getIExtractionServerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            getIExtractionServerRtti getiextractionserverrtti = this.MediaBrowserCompat$ItemReceiver;
            C7502tK tKVar = C7502tK.MediaBrowserCompat$CustomActionResultReceiver;
            if (getiextractionserverrtti.RatingCompat == null) {
                z = false;
            }
            if (z) {
                tKVar.IconCompatParcelizer(getiextractionserverrtti.RatingCompat);
            }
        }
    }
}

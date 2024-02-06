package p040o;

import com.scb.phone.domain.interactor.ReviewInfoCase;

/* renamed from: o.ce$MediaBrowserCompat$ItemReceiver */
public class ce$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<moveCamera> {
    final /* synthetic */ C4177ce MediaBrowserCompat$CustomActionResultReceiver;

    public final void onComplete() {
    }

    public ce$MediaBrowserCompat$ItemReceiver(C4177ce ceVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ceVar;
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4177ce.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        getFiles read = this.MediaBrowserCompat$CustomActionResultReceiver.write.read((moveCamera) obj);
        C4177ce ceVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        getIImageStorage getiimagestorage = new getIImageStorage(read);
        if (ceVar.RatingCompat != null) {
            getiimagestorage.IconCompatParcelizer(ceVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        C4177ce.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        if (th instanceof ReviewInfoCase.JobIncomeDangerousException) {
            C4177ce ceVar = this.MediaBrowserCompat$CustomActionResultReceiver;
            getDeviceCamera getdevicecamera = getDeviceCamera.IconCompatParcelizer;
            if (ceVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getdevicecamera.IconCompatParcelizer(ceVar.RatingCompat);
            }
        } else if (th instanceof ReviewInfoCase.FailUpdateRMException) {
            C4177ce ceVar2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            getIIdFieldNameConvention getiidfieldnameconvention = new getIIdFieldNameConvention(this, th);
            if (ceVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getiidfieldnameconvention.IconCompatParcelizer(ceVar2.RatingCompat);
            }
        } else {
            C4177ce ceVar3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            getIVideoResourceProvider getivideoresourceprovider = new getIVideoResourceProvider(this, th);
            if (ceVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getivideoresourceprovider.IconCompatParcelizer(ceVar3.RatingCompat);
            }
        }
    }
}

package p040o;

import p040o.access$2300;

/* renamed from: o.setRequest */
public class setRequest extends writeUInt64NoTag<getFrontRearHeightDifference> {
    public final StreetViewPanoramaLink MediaBrowserCompat$ItemReceiver;
    public String read;

    @HmlPinActivity
    public setRequest(StreetViewPanoramaLink streetViewPanoramaLink, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaLink;
    }

    static /* synthetic */ void IconCompatParcelizer(populateEventDeviceData populateeventdevicedata, getFrontRearHeightDifference getfrontrearheightdifference) {
        getfrontrearheightdifference.MediaBrowserCompat$CustomActionResultReceiver(populateeventdevicedata);
        getfrontrearheightdifference.IconCompatParcelizer();
    }

    /* renamed from: o.setRequest$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        public /* synthetic */ write(setRequest setrequest, byte b) {
            this();
        }

        public final void onComplete() {
            setRequest.IconCompatParcelizer(setRequest.this);
        }

        public final void onError(Throwable th) {
            setRequest.write(setRequest.this);
            if (!setRequest.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                setRequest.this.MediaBrowserCompat$ItemReceiver(setRequest.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            setRequest setrequest = setRequest.this;
            getNamespace getnamespace = getNamespace.MediaBrowserCompat$CustomActionResultReceiver;
            if (setrequest.RatingCompat != null) {
                getnamespace.IconCompatParcelizer(setrequest.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setRequest setrequest) {
        if (setrequest.RatingCompat != null) {
            setrequest.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(setRequest setrequest) {
        if (setrequest.RatingCompat != null) {
            setrequest.RatingCompat.aj_();
        }
    }
}

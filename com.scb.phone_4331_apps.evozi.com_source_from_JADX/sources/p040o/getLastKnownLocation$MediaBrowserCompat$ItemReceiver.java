package p040o;

import java.util.List;

/* renamed from: o.getLastKnownLocation$MediaBrowserCompat$ItemReceiver */
public final class getLastKnownLocation$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<onInfoWindowLongClick>> {
    final /* synthetic */ getLastKnownLocation MediaBrowserCompat$ItemReceiver;

    protected getLastKnownLocation$MediaBrowserCompat$ItemReceiver(getLastKnownLocation getlastknownlocation) {
        this.MediaBrowserCompat$ItemReceiver = getlastknownlocation;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List<onInfoWindowLongClick> list = (List) obj;
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            this.MediaBrowserCompat$ItemReceiver.write = list;
            if (list.size() > 0) {
                getLastKnownLocation getlastknownlocation = this.MediaBrowserCompat$ItemReceiver;
                getFaceRectThickness getfacerectthickness = new getFaceRectThickness(this, list);
                if (getlastknownlocation.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getfacerectthickness.IconCompatParcelizer(getlastknownlocation.RatingCompat);
                    return;
                }
                return;
            }
            getLastKnownLocation getlastknownlocation2 = this.MediaBrowserCompat$ItemReceiver;
            ICaptureMenuListener iCaptureMenuListener = ICaptureMenuListener.read;
            if (getlastknownlocation2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iCaptureMenuListener.IconCompatParcelizer(getlastknownlocation2.RatingCompat);
            }
        }
    }

    public final void onComplete() {
        getLastKnownLocation getlastknownlocation = this.MediaBrowserCompat$ItemReceiver;
        if (getlastknownlocation.RatingCompat != null) {
            getlastknownlocation.RatingCompat.ay_();
        }
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            getLastKnownLocation getlastknownlocation = this.MediaBrowserCompat$ItemReceiver;
            if (getlastknownlocation.RatingCompat != null) {
                getlastknownlocation.RatingCompat.ay_();
            }
            getLastKnownLocation getlastknownlocation2 = this.MediaBrowserCompat$ItemReceiver;
            setFaceRectColor setfacerectcolor = new setFaceRectColor(this, th);
            if (getlastknownlocation2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setfacerectcolor.IconCompatParcelizer(getlastknownlocation2.RatingCompat);
            }
        }
    }
}

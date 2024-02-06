package p040o;

import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import p040o.access$2300;

/* renamed from: o.getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver */
public final class getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PrepaidTravelServicesTabFragment.write> {
    final /* synthetic */ getEventAppSize IconCompatParcelizer;

    private getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver(getEventAppSize geteventappsize) {
        this.IconCompatParcelizer = geteventappsize;
    }

    public /* synthetic */ getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver(getEventAppSize geteventappsize, byte b) {
        this(geteventappsize);
    }

    public final /* synthetic */ void onNext(Object obj) {
        PrepaidTravelServicesTabFragment.write write = (PrepaidTravelServicesTabFragment.write) obj;
        getEventAppSize geteventappsize = this.IconCompatParcelizer;
        boolean z = true;
        if (geteventappsize.RatingCompat != null) {
            geteventappsize.RatingCompat.aj_();
        }
        if (this.IconCompatParcelizer.RatingCompat != null) {
            getEventAppSize geteventappsize2 = this.IconCompatParcelizer;
            isHighPriorityEventFile ishighpriorityeventfile = new isHighPriorityEventFile(this, write);
            if (geteventappsize2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ishighpriorityeventfile.IconCompatParcelizer(geteventappsize2.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            getEventAppSize geteventappsize = this.IconCompatParcelizer;
            geteventappsize.MediaBrowserCompat$ItemReceiver(geteventappsize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}

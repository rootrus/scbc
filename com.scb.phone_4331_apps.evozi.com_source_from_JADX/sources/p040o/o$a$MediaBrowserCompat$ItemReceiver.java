package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C5082o;
import p040o.access$2300;

/* renamed from: o.o$a$MediaBrowserCompat$ItemReceiver */
final class o$a$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onStreetViewPanoramaLongClick> {
    final /* synthetic */ C5082o.C5084a write;

    private o$a$MediaBrowserCompat$ItemReceiver(C5082o.C5084a aVar) {
        this.write = aVar;
    }

    /* synthetic */ o$a$MediaBrowserCompat$ItemReceiver(C5082o.C5084a aVar, byte b) {
        this(aVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        onStreetViewPanoramaLongClick onstreetviewpanoramalongclick = (onStreetViewPanoramaLongClick) obj;
        boolean z = true;
        if (this.write.RatingCompat != null) {
            if ("E_DONATION_FUNCTION".equalsIgnoreCase(this.write.MediaBrowserCompat$SearchResultReceiver.setOverflowReserved)) {
                C5082o.C5084a aVar = this.write;
                C10125rs rsVar = new C10125rs(this, onstreetviewpanoramalongclick);
                if (aVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    rsVar.IconCompatParcelizer(aVar.RatingCompat);
                }
            } else {
                putInstance MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaDescriptionCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                if (this.write.MediaBrowserCompat$ItemReceiver.read.write() == null || this.write.MediaBrowserCompat$ItemReceiver.read.write().MediaBrowserCompat$ItemReceiver == null) {
                    str = null;
                } else {
                    str = this.write.MediaBrowserCompat$ItemReceiver.read.write().MediaBrowserCompat$ItemReceiver.write;
                }
                C5082o.C5084a aVar2 = this.write;
                C10136rt rtVar = new C10136rt(this, onstreetviewpanoramalongclick, MediaBrowserCompat$CustomActionResultReceiver, str);
                if (aVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    rtVar.IconCompatParcelizer(aVar2.RatingCompat);
                }
            }
        }
        boolean unused = this.write.IconCompatParcelizer = false;
    }

    public final void onError(Throwable th) {
        if (this.write.MediaBrowserCompat$SearchResultReceiver.setShortcut == null || !((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer.equalsIgnoreCase("3004")) {
            C5082o.C5084a aVar = this.write;
            aVar.MediaBrowserCompat$ItemReceiver(aVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        } else {
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
        boolean unused = this.write.IconCompatParcelizer = false;
        C5082o.C5084a aVar2 = this.write;
        C10165tw twVar = C10165tw.write;
        if (aVar2.RatingCompat != null) {
            twVar.IconCompatParcelizer(aVar2.RatingCompat);
        }
    }
}

package p040o;

import java.util.List;
import p040o.AppMeasurementSdk;
import p040o.getTopLeftCornerWidth;
import p040o.getTopLeftCornerWidth.PlaybackStateCompat.CustomAction;

/* renamed from: o.getLastKnownLocation */
public abstract class getLastKnownLocation<T extends getTopLeftCornerWidth.PlaybackStateCompat.CustomAction> extends writeUInt64NoTag<T> {
    final toShortArray IconCompatParcelizer;
    protected final AppMeasurementSdk.ConditionalUserProperty read;
    protected List<onInfoWindowLongClick> write;

    public getLastKnownLocation(toShortArray toshortarray, AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = toshortarray;
        this.read = conditionalUserProperty;
    }

    public static int MediaBrowserCompat$ItemReceiver(String str) {
        if ("BILLPAYMENT".equals(str)) {
            return Iterables$3$MediaBrowserCompat$MediaItem.favorite_add_suggestion_bill_payment;
        }
        if ("TOPUP".equals(str)) {
            return Iterables$3$MediaBrowserCompat$MediaItem.favorite_add_suggestion_top_up;
        }
        if ("REMITTANCE".equals(str)) {
            return Iterables$3$MediaBrowserCompat$MediaItem.favorite_add_suggestion_remittance;
        }
        return 0;
    }

    public void onDestroy() {
        super.onDestroy();
        this.read.read.setGroupDividerEnabled();
    }

    /* renamed from: o.getLastKnownLocation$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<onInfoWindowLongClick>> {
        protected read() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            List<onInfoWindowLongClick> list = (List) obj;
            boolean z = true;
            if (getLastKnownLocation.this.RatingCompat != null) {
                getLastKnownLocation.this.write = list;
                if (list.size() > 0) {
                    getLastKnownLocation getlastknownlocation = getLastKnownLocation.this;
                    setFaceRect setfacerect = new setFaceRect(this, list);
                    if (getlastknownlocation.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setfacerect.IconCompatParcelizer(getlastknownlocation.RatingCompat);
                        return;
                    }
                    return;
                }
                getLastKnownLocation getlastknownlocation2 = getLastKnownLocation.this;
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
            getLastKnownLocation getlastknownlocation = getLastKnownLocation.this;
            if (getlastknownlocation.RatingCompat != null) {
                getlastknownlocation.RatingCompat.ay_();
            }
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if ((getLastKnownLocation.this.RatingCompat != null) && !getLastKnownLocation.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getLastKnownLocation getlastknownlocation = getLastKnownLocation.this;
                if (getlastknownlocation.RatingCompat != null) {
                    getlastknownlocation.RatingCompat.ay_();
                }
                getLastKnownLocation getlastknownlocation2 = getLastKnownLocation.this;
                C4795ih ihVar = C4795ih.IconCompatParcelizer;
                if (getlastknownlocation2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ihVar.IconCompatParcelizer(getlastknownlocation2.RatingCompat);
                }
            }
        }
    }

    public void IconCompatParcelizer(String str, int i) {
        AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty = this.read;
        conditionalUserProperty.read.IconCompatParcelizer(str, this.write.get(i).Keep.intValue());
    }
}

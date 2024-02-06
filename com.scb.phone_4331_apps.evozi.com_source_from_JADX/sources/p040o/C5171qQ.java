package p040o;

import p040o.AppMeasurementSdk;
import p040o.C4316e;
import p040o.ImmutableList;
import p040o.access$2300;
import p040o.getLastKnownLocation;
import p040o.getTopLeftCornerWidth;
import p040o.orderKeysBy;

/* renamed from: o.qQ */
public class C5171qQ extends getLastKnownLocation<getTopLeftCornerWidth.Keep> {
    @HmlPinActivity
    public C5171qQ(toShortArray toshortarray, AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, RegularImmutableBiMap regularImmutableBiMap) {
        super(toshortarray, conditionalUserProperty, regularImmutableBiMap);
    }

    static /* synthetic */ void IconCompatParcelizer(String str, int i, getTopLeftCornerWidth.Keep keep) {
        if ("TRANSFER".equals(str) || "REMITTANCE".equals(str)) {
            keep.read(i);
        } else if ("BILLPAYMENT".equals(str)) {
            keep.MediaBrowserCompat$CustomActionResultReceiver(i);
        } else if ("TOPUP".equals(str)) {
            keep.MediaBrowserCompat$ItemReceiver(i);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i < this.write.size()) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            onInfoWindowLongClick oninfowindowlongclick = this.write.get(i);
            if (oninfowindowlongclick != null) {
                AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty = this.read;
                ImmutableList.ReverseImmutableList.C34991 write = ImmutableList.ReverseImmutableList.C34991.write();
                write.MediaBrowserCompat$CustomActionResultReceiver = String.valueOf(oninfowindowlongclick.Keep);
                conditionalUserProperty.IconCompatParcelizer(write);
                this.read.IconCompatParcelizer(new IconCompatParcelizer(this, (byte) 0));
            }
        }
    }

    public final void write(int i, String str) {
        if (i < this.write.size()) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            onInfoWindowLongClick oninfowindowlongclick = this.write.get(i);
            if (oninfowindowlongclick != null) {
                AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty = this.read;
                orderKeysBy.write read2 = orderKeysBy.read();
                read2.IconCompatParcelizer = str;
                conditionalUserProperty.MediaBrowserCompat$ItemReceiver(new orderKeysBy(read2, (byte) 0), String.valueOf(oninfowindowlongclick.Keep));
                this.read.IconCompatParcelizer(new read(this, (byte) 0));
            }
        }
    }

    /* renamed from: o.qQ$read */
    class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private read() {
        }

        /* synthetic */ read(C5171qQ qQVar, byte b) {
            this();
        }

        public final void onComplete() {
            C5171qQ.MediaBrowserCompat$CustomActionResultReceiver(C5171qQ.this);
        }

        public final void onError(Throwable th) {
            C5171qQ.IconCompatParcelizer(C5171qQ.this);
            C5171qQ qQVar = C5171qQ.this;
            C5206rX rXVar = new C5206rX(this, th);
            if (qQVar.RatingCompat != null) {
                rXVar.IconCompatParcelizer(qQVar.RatingCompat);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C5171qQ qQVar = C5171qQ.this;
            C4316e.C43192 r0 = C4316e.C43192.MediaBrowserCompat$ItemReceiver;
            if (qQVar.RatingCompat != null) {
                r0.IconCompatParcelizer(qQVar.RatingCompat);
            }
            C5171qQ.this.read.read.setPadding();
        }
    }

    /* renamed from: o.qQ$IconCompatParcelizer */
    class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(C5171qQ qQVar, byte b) {
            this();
        }

        public final void onComplete() {
            C5171qQ.MediaBrowserCompat$ItemReceiver(C5171qQ.this);
        }

        public final void onError(Throwable th) {
            C5171qQ.this.MediaBrowserCompat$ItemReceiver(C5171qQ.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C5171qQ qQVar = C5171qQ.this;
            C5194rJ rJVar = C5194rJ.IconCompatParcelizer;
            if (qQVar.RatingCompat != null) {
                rJVar.IconCompatParcelizer(qQVar.RatingCompat);
            }
            C5171qQ.this.read.read.setPadding();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(String str, getTopLeftCornerWidth.Keep keep) {
        if ("TRANSFER".equals(str)) {
            keep.MediaBrowserCompat$ItemReceiver();
        } else if ("BILLPAYMENT".equals(str)) {
            keep.write(Iterables$3$MediaBrowserCompat$MediaItem.favorite_add_suggestion_bill_payment);
        } else if ("TOPUP".equals(str)) {
            keep.write(Iterables$3$MediaBrowserCompat$MediaItem.favorite_add_suggestion_top_up);
        } else if ("REMITTANCE".equals(str)) {
            keep.write(Iterables$3$MediaBrowserCompat$MediaItem.favorite_add_suggestion_remittance);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5171qQ qQVar) {
        if (qQVar.RatingCompat != null) {
            qQVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C5171qQ qQVar) {
        if (qQVar.RatingCompat != null) {
            qQVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C5171qQ qQVar) {
        if (qQVar.RatingCompat != null) {
            qQVar.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        if (this.read == null) {
            return;
        }
        if ("TRANSFER".equals(str)) {
            this.read.IconCompatParcelizer();
            this.read.IconCompatParcelizer(new getLastKnownLocation$MediaBrowserCompat$ItemReceiver(this));
        } else if ("BILLPAYMENT".equals(str)) {
            this.read.MediaBrowserCompat$ItemReceiver();
            this.read.IconCompatParcelizer(new getLastKnownLocation.read());
        } else if ("TOPUP".equals(str)) {
            this.read.read();
            this.read.IconCompatParcelizer(new getLastKnownLocation.read());
        } else if ("REMITTANCE".equals(str)) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver();
            this.read.IconCompatParcelizer(new getLastKnownLocation$MediaBrowserCompat$ItemReceiver(this));
        }
    }
}

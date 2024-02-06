package p040o;

import java.util.List;
import p040o.CheckParameters;
import p040o.MapConstraints;

/* renamed from: o.getBitmapFromURI */
public class getBitmapFromURI extends writeUInt64NoTag<CheckParameters.CheckCountry.write> {
    /* access modifiers changed from: private */
    public List<chain> MediaBrowserCompat$ItemReceiver;
    public final transparency read;
    /* access modifiers changed from: private */
    public final MapConstraints.ConstrainedMultimap.C36361 write;

    @HmlPinActivity
    public getBitmapFromURI(transparency transparency, MapConstraints.ConstrainedMultimap.C36361 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.read = transparency;
        this.write = r2;
    }

    /* renamed from: o.getBitmapFromURI$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzsi> {
        private read() {
        }

        public /* synthetic */ read(getBitmapFromURI getbitmapfromuri, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzsi zzsi = (zzsi) obj;
            boolean z = true;
            if (getBitmapFromURI.this.RatingCompat != null) {
                getBitmapFromURI getbitmapfromuri = getBitmapFromURI.this;
                List unused = getbitmapfromuri.MediaBrowserCompat$ItemReceiver = getbitmapfromuri.write.MediaBrowserCompat$ItemReceiver(zzsi.read);
                getBitmapFromURI getbitmapfromuri2 = getBitmapFromURI.this;
                C4048at atVar = new C4048at(this);
                if (getbitmapfromuri2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    atVar.IconCompatParcelizer(getbitmapfromuri2.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            getBitmapFromURI.write(getBitmapFromURI.this);
            getBitmapFromURI.read(getBitmapFromURI.this);
        }

        public final void onError(Throwable th) {
            if (!getBitmapFromURI.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getBitmapFromURI.MediaBrowserCompat$CustomActionResultReceiver(getBitmapFromURI.this);
                getBitmapFromURI.MediaBrowserCompat$ItemReceiver(getBitmapFromURI.this);
                getBitmapFromURI getbitmapfromuri = getBitmapFromURI.this;
                onImageCaptured onimagecaptured = onImageCaptured.IconCompatParcelizer;
                if (getbitmapfromuri.RatingCompat != null) {
                    onimagecaptured.IconCompatParcelizer(getbitmapfromuri.RatingCompat);
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        transparency transparency = this.read;
        if (!transparency.MediaBrowserCompat$MediaItem.isDisposed()) {
            transparency.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void write(getBitmapFromURI getbitmapfromuri) {
        if (getbitmapfromuri.RatingCompat != null) {
            getbitmapfromuri.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(getBitmapFromURI getbitmapfromuri) {
        if (getbitmapfromuri.RatingCompat != null) {
            getbitmapfromuri.RatingCompat.az_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getBitmapFromURI getbitmapfromuri) {
        if (getbitmapfromuri.RatingCompat != null) {
            getbitmapfromuri.RatingCompat.az_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getBitmapFromURI getbitmapfromuri) {
        if (getbitmapfromuri.RatingCompat != null) {
            getbitmapfromuri.RatingCompat.ay_();
        }
    }
}

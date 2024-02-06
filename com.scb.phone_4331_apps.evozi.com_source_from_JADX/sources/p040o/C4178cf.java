package p040o;

import com.scb.phone.view.activity.partner.PartnerDiscoverWebViewActivity;
import p040o.KtaJsonCheck;

/* renamed from: o.cf */
public class C4178cf extends writeUInt64NoTag<KtaJsonCheck.write> {
    /* access modifiers changed from: private */
    public setDisplayVersion IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final ByteProcessor MediaBrowserCompat$MediaItem;
    public final PointOfInterest read;
    public String write;

    @HmlPinActivity
    public C4178cf(RegularImmutableBiMap regularImmutableBiMap, ByteProcessor byteProcessor, PointOfInterest pointOfInterest) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$MediaItem = byteProcessor;
        this.read = pointOfInterest;
    }

    public void onDestroy() {
        PointOfInterest pointOfInterest = this.read;
        if (!pointOfInterest.MediaBrowserCompat$MediaItem.isDisposed()) {
            pointOfInterest.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.cf$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PartnerDiscoverWebViewActivity.write> {
        public read() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            PartnerDiscoverWebViewActivity.write write = (PartnerDiscoverWebViewActivity.write) obj;
            C4178cf.IconCompatParcelizer(C4178cf.this);
            if (write != null) {
                C4178cf cfVar = C4178cf.this;
                setDisplayVersion unused = cfVar.IconCompatParcelizer = cfVar.MediaBrowserCompat$MediaItem.write(write);
                C4178cf cfVar2 = C4178cf.this;
                getIBase64ImageDecoder getibase64imagedecoder = new getIBase64ImageDecoder(this);
                if (cfVar2.RatingCompat != null) {
                    getibase64imagedecoder.IconCompatParcelizer(cfVar2.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            C4178cf.read(C4178cf.this);
        }
    }

    static /* synthetic */ void read(C4178cf cfVar) {
        if (cfVar.RatingCompat != null) {
            cfVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4178cf cfVar) {
        if (cfVar.RatingCompat != null) {
            cfVar.RatingCompat.aj_();
        }
    }
}

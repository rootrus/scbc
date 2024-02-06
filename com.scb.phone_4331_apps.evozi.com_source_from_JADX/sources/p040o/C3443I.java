package p040o;

import p040o.CrashlyticsReport;
import p040o.Ordering;
import p040o.zzap;

/* renamed from: o.I */
public class C3443I extends writeUInt64NoTag<C6388xf4a9b69e> {
    /* access modifiers changed from: private */
    public final Ordering.ArbitraryOrdering IconCompatParcelizer;
    public final title MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public C3443I(title title, Ordering.ArbitraryOrdering arbitraryOrdering, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = title;
        this.IconCompatParcelizer = arbitraryOrdering;
    }

    static /* synthetic */ void read(CrashlyticsReport.Session.Event.Application.Execution execution, C6388xf4a9b69e checkCaptureModule_RttiExceptionResponseDeserializer_Factory$MediaBrowserCompat$ItemReceiver) {
        checkCaptureModule_RttiExceptionResponseDeserializer_Factory$MediaBrowserCompat$ItemReceiver.write(execution);
        checkCaptureModule_RttiExceptionResponseDeserializer_Factory$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(execution);
    }

    /* renamed from: o.I$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzap.zzb> {
        private read() {
        }

        public /* synthetic */ read(C3443I i, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzap.zzb zzb = (zzap.zzb) obj;
            if (zzb.MediaBrowserCompat$CustomActionResultReceiver.size() > 0) {
                C3443I i = C3443I.this;
                setUseMRZPassportDetection setusemrzpassportdetection = new setUseMRZPassportDetection(this, zzb);
                if (i.RatingCompat != null) {
                    setusemrzpassportdetection.IconCompatParcelizer(i.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            C3443I.MediaBrowserCompat$CustomActionResultReceiver(C3443I.this);
        }

        public final void onError(Throwable th) {
            if (!C3443I.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C3443I.write(C3443I.this);
                C3443I i = C3443I.this;
                setUseDocumentDetectionBasedCrop setusedocumentdetectionbasedcrop = new setUseDocumentDetectionBasedCrop(this, th);
                if (i.RatingCompat != null) {
                    setusedocumentdetectionbasedcrop.IconCompatParcelizer(i.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C3443I i) {
        if (i.RatingCompat != null) {
            i.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void write(C3443I i) {
        if (i.RatingCompat != null) {
            i.RatingCompat.ay_();
        }
    }
}

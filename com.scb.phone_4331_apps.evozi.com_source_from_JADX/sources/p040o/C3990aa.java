package p040o;

import p040o.C4915ks;
import p040o.QuickExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.aa */
public final class C3990aa extends IndoorBuilding {
    private IIdImageProcessingListener write;

    @HmlPinActivity
    public C3990aa(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, IIdImageProcessingListener iIdImageProcessingListener) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.write = iIdImageProcessingListener;
    }

    public final void read() {
        write(this.write.MediaBrowserCompat$CustomActionResultReceiver());
    }

    /* renamed from: o.aa$a */
    public final /* synthetic */ class C3994a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ C4915ks.C49161 IconCompatParcelizer;

        public /* synthetic */ C3994a(C4915ks.C49161 r1) {
            this.IconCompatParcelizer = r1;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((QuickExtractor.C70184) obj).IconCompatParcelizer(C4915ks.this.MediaSessionCompat$Token);
        }
    }
}

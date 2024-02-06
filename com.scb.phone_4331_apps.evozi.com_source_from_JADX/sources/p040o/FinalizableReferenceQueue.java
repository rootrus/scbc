package p040o;

import com.google.common.base.Ascii;
import com.scb.phone.domain.entity.isprint.E2EEEncryptionException;
import java.util.List;
import java.util.concurrent.Callable;
import p040o.LocalProjectProvider;
import p040o.ServerProjectProvider;

/* renamed from: o.FinalizableReferenceQueue */
public final class FinalizableReferenceQueue extends IndoorBuilding {
    private final ServerProjectProvider.C70673 IconCompatParcelizer;

    /* renamed from: o.FinalizableReferenceQueue$DirectLoader */
    public final class DirectLoader extends IndoorBuilding {
        private LocalProjectProvider.C69386 MediaBrowserCompat$CustomActionResultReceiver;

        @HmlPinActivity
        public DirectLoader(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69386 r3) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.MediaBrowserCompat$CustomActionResultReceiver = r3;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat());
        }
    }

    /* renamed from: o.FinalizableReferenceQueue$DecoupledLoader */
    public final class DecoupledLoader extends IndoorBuilding {
        private final ServerProjectProvider.C706515 IconCompatParcelizer;

        @HmlPinActivity
        public DecoupledLoader(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C706515 r3) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.IconCompatParcelizer = r3;
        }

        public final DebitCardResetOtpActivity<List<EasycashHeaderAdapter$LoanHeaderViewHolder>> IconCompatParcelizer(rowMap rowmap) {
            return write(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(rowmap));
        }
    }

    public FinalizableReferenceQueue(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C70673 r3) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.IconCompatParcelizer = r3;
    }

    public final DebitCardResetOtpActivity read() {
        return write(this.IconCompatParcelizer.read());
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(String str) {
        return write(this.IconCompatParcelizer.IconCompatParcelizer(str));
    }

    /* renamed from: o.FinalizableReferenceQueue$SystemLoader */
    public final /* synthetic */ class SystemLoader implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ SystemLoader read = new SystemLoader();

        private /* synthetic */ SystemLoader() {
        }

        public final Object write(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* renamed from: o.FinalizableReferenceQueue$FinalizerLoader */
    public final /* synthetic */ class FinalizerLoader implements Callable {
        private final /* synthetic */ PlaceBuffer MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ compose read;
        private final /* synthetic */ String write;

        public /* synthetic */ FinalizerLoader(compose compose, String str, PlaceBuffer placeBuffer) {
            this.read = compose;
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = placeBuffer;
        }

        public final Object call() {
            byte b;
            compose compose = this.read;
            String str = this.write;
            PlaceBuffer placeBuffer = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = placeBuffer.write;
            if (str2 == null) {
                str2 = "";
            }
            String lowerCase = str2.toLowerCase();
            if (lowerCase.contains("sha224")) {
                b = 19;
            } else if (lowerCase.contains("sha256")) {
                b = Ascii.DC4;
            } else if (lowerCase.contains("sha384")) {
                b = Ascii.NAK;
            } else {
                b = lowerCase.contains("sha512") ? Ascii.SYN : Ascii.DC2;
            }
            String write2 = compose.read.write(b, placeBuffer.read, str, placeBuffer.MediaBrowserCompat$MediaItem, placeBuffer.MediaBrowserCompat$SearchResultReceiver);
            if (compose.read.write == 0) {
                return write2;
            }
            throw new E2EEEncryptionException();
        }
    }
}

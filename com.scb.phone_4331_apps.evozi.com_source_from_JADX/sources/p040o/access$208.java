package p040o;

import com.scb.phone.domain.entity.isprint.E2EEEncryptionException;
import p040o.LatLngBounds;

/* renamed from: o.access$208 */
public final class access$208 extends LatLngBounds.Builder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public access$208(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar) {
        super(tYVar, closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) tYVar, "iSprintRepositoryContractor");
    }

    public final String read(String str) {
        try {
            return write(str);
        } catch (E2EEEncryptionException unused) {
            return null;
        }
    }
}

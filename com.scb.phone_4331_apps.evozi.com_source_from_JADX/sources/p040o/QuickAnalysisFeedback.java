package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter$MediaBrowserCompat$ItemReceiver;
import p040o.Ordering;
import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.QuickAnalysisFeedback */
public final class QuickAnalysisFeedback implements OPRStatusRewardsLandingActivity_ViewBinding<PassportDetectionSettings> {
    public static PassportDetectionSettings IconCompatParcelizer(RegularImmutableBiMap regularImmutableBiMap, title title, Ordering.ArbitraryOrdering.C37211 r3) {
        return new PassportDetectionSettings(regularImmutableBiMap, title, r3);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return new PassportDetectionSettings((RegularImmutableBiMap) hmlReviewDocumentActivity.get(), (title) hmlReviewDocumentActivity.get(), (Ordering.ArbitraryOrdering.C37211) hmlReviewDocumentActivity.get());
    }

    /* renamed from: o.QuickAnalysisFeedback$FriendQAF */
    public final /* synthetic */ class FriendQAF implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ EmailOtpPresenter$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

        public /* synthetic */ FriendQAF(EmailOtpPresenter$MediaBrowserCompat$ItemReceiver emailOtpPresenter$MediaBrowserCompat$ItemReceiver) {
            this.IconCompatParcelizer = emailOtpPresenter$MediaBrowserCompat$ItemReceiver;
        }

        public final void IconCompatParcelizer(Object obj) {
            EmailOtpPresenter$MediaBrowserCompat$ItemReceiver emailOtpPresenter$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
            ((getUsable.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(emailOtpPresenter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.read, emailOtpPresenter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat, emailOtpPresenter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }
}

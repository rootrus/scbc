package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashFeatureAccountCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zztq */
public final class zztq implements OPRStatusRewardsLandingActivity_ViewBinding<setActive> {
    private final EasycashFeatureAccountCaseModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> read;

    private zztq(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = easycashFeatureAccountCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zztq write(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> hmlReviewDocumentActivity3) {
        return new zztq(easycashFeatureAccountCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setActive MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

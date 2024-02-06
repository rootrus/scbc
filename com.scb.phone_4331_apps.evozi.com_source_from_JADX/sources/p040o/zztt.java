package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashFeatureAccountCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zztt */
public final class zztt implements OPRStatusRewardsLandingActivity_ViewBinding<onDone> {
    private final HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final EasycashFeatureAccountCaseModule read;

    private zztt(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> hmlReviewDocumentActivity3) {
        this.read = easycashFeatureAccountCaseModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
    }

    public static zztt write(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> hmlReviewDocumentActivity3) {
        return new zztt(easycashFeatureAccountCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        onDone write = this.read.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

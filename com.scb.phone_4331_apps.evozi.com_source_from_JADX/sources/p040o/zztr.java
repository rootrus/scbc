package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashFeatureAccountCaseModule;
import p040o.AbstractMultimap;

/* renamed from: o.zztr */
public final class zztr implements OPRStatusRewardsLandingActivity_ViewBinding<EngineManager> {
    private final EasycashFeatureAccountCaseModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> write;

    private zztr(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashFeatureAccountCaseModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static zztr IconCompatParcelizer(EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.SortedKeySet> hmlReviewDocumentActivity3) {
        return new zztr(easycashFeatureAccountCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        EngineManager IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

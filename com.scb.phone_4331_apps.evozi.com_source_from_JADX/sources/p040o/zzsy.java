package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import p040o.AbstractMapBasedMultiset;

/* renamed from: o.zzsy */
public final class zzsy implements OPRStatusRewardsLandingActivity_ViewBinding<skipNulls> {
    private final HmlReviewDocumentActivity<AbstractMapBasedMultiset.EntrySet.C30061> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$ItemReceiver;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindCloseAccountSelectionOwnFragment> write;

    private zzsy(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindCloseAccountSelectionOwnFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<AbstractMapBasedMultiset.EntrySet.C30061> hmlReviewDocumentActivity4) {
        this.read = useCaseModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
    }

    public static zzsy write(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindCloseAccountSelectionOwnFragment> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<AbstractMapBasedMultiset.EntrySet.C30061> hmlReviewDocumentActivity4) {
        return new zzsy(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        skipNulls write2 = this.read.write(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.IconCompatParcelizer.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

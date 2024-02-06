package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.hml.C5613x13cfb373;
import p040o.AbstractMultimap;

/* renamed from: o.checkLayoutParams */
public final class checkLayoutParams implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.MultisetEntryIterator> {
    private final HmlReviewDocumentActivity<ProductAction> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleOnceFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSlipFragment> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<C5613x13cfb373> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<setCheckoutOptions> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<setTransactionTax> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<zzam> RatingCompat;
    private final HmlReviewDocumentActivity<zzo> read;
    private final HmlReviewDocumentActivity<zzai> write;

    private checkLayoutParams(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5613x13cfb373> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ProductAction> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setCheckoutOptions> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setTransactionTax> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zzo> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<zzam> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<FragmentBuilder_BindSlipFragment> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zzai> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleOnceFragment> hmlReviewDocumentActivity9) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity3;
        this.MediaMetadataCompat = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.RatingCompat = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity7;
        this.write = hmlReviewDocumentActivity8;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity9;
    }

    public static checkLayoutParams IconCompatParcelizer(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C5613x13cfb373> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ProductAction> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setCheckoutOptions> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setTransactionTax> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zzo> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<zzam> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<FragmentBuilder_BindSlipFragment> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zzai> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<FragmentBuilder_BindSetupScheduleOnceFragment> hmlReviewDocumentActivity9) {
        return new checkLayoutParams(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.MultisetEntryIterator read2 = this.MediaBrowserCompat$ItemReceiver.read(this.MediaBrowserCompat$SearchResultReceiver.get(), this.IconCompatParcelizer.get(), this.MediaDescriptionCompat.get(), this.MediaMetadataCompat.get(), this.read.get(), this.RatingCompat.get(), this.MediaBrowserCompat$MediaItem.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

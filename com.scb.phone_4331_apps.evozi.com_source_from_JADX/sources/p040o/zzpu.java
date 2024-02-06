package p040o;

import com.scb.phone.domain.interactor.PinCase;
import com.scb.phone.domain.p036di.UseCaseModule;
import com.scb.phone.domain.repositories.ForgotPinRepositoryContractor;
import p040o.AbstractMultimap;

/* renamed from: o.zzpu */
public final class zzpu implements OPRStatusRewardsLandingActivity_ViewBinding<PinCase> {
    private final HmlReviewDocumentActivity<setCvv> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<ForgotPinRepositoryContractor> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<C7514tY> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<keys> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<AbstractMultimap.EntryIterator> MediaSessionCompat$QueueItem;
    private final HmlReviewDocumentActivity<C6548x820c5aab> RatingCompat;
    private final UseCaseModule read;
    private final HmlReviewDocumentActivity<C1189xa6547b7b> write;

    private zzpu(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.EntryIterator> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<C1189xa6547b7b> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<ForgotPinRepositoryContractor> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity10) {
        this.read = useCaseModule;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.MediaMetadataCompat = hmlReviewDocumentActivity5;
        this.MediaSessionCompat$QueueItem = hmlReviewDocumentActivity6;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity7;
        this.write = hmlReviewDocumentActivity8;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity9;
        this.RatingCompat = hmlReviewDocumentActivity10;
    }

    public static zzpu MediaBrowserCompat$ItemReceiver(UseCaseModule useCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setCvv> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<AbstractMultimap.EntryIterator> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<C1189xa6547b7b> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<ForgotPinRepositoryContractor> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<C6548x820c5aab> hmlReviewDocumentActivity10) {
        return new zzpu(useCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10);
    }

    public final /* synthetic */ Object get() {
        PinCase MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaMetadataCompat.get(), this.MediaSessionCompat$QueueItem.get(), this.MediaDescriptionCompat.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.RatingCompat.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

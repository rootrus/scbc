package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.C4773hl;

/* renamed from: o.getPathData */
public final class getPathData implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider> {
    private final HmlReviewDocumentActivity<retrieveData> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C4773hl.read> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPreregistrationLandingFragment> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<notifyCompletion> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<onFailure> MediaBrowserCompat$SearchResultReceiver;
    private final RepositoryModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<String> MediaSessionCompat$ResultReceiverWrapper;
    private final HmlReviewDocumentActivity<setHintPickerConfig> RatingCompat;
    private final HmlReviewDocumentActivity<getFrontException> read;
    private final HmlReviewDocumentActivity<clearListener> write;

    private getPathData(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4773hl.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPreregistrationLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<notifyCompletion> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<clearListener> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<retrieveData> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<onFailure> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<setHintPickerConfig> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity10) {
        this.MediaDescriptionCompat = repositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaMetadataCompat = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.IconCompatParcelizer = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity7;
        this.read = hmlReviewDocumentActivity8;
        this.RatingCompat = hmlReviewDocumentActivity9;
        this.MediaSessionCompat$ResultReceiverWrapper = hmlReviewDocumentActivity10;
    }

    public static getPathData write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<C4773hl.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPreregistrationLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<notifyCompletion> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<clearListener> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<retrieveData> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<onFailure> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<setHintPickerConfig> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity10) {
        return new getPathData(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10);
    }

    public final /* synthetic */ Object get() {
        LocalProjectProvider write2 = this.MediaDescriptionCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaMetadataCompat.get(), this.MediaBrowserCompat$MediaItem.get(), this.write.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.read.get(), this.RatingCompat.get(), this.MediaSessionCompat$ResultReceiverWrapper.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

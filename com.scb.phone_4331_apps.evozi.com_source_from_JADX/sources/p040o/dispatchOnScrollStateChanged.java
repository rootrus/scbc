package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.OnDeviceIdExtractor;
import p040o.zzk;

/* renamed from: o.dispatchOnScrollStateChanged */
public final class dispatchOnScrollStateChanged implements OPRStatusRewardsLandingActivity_ViewBinding<OnDeviceIdExtractor.C6966a.C69682> {
    private final HmlReviewDocumentActivity<zzak> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzaq> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<newTaskFor> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<zzk.zzc> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<getAccountName> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<zzk.zza> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<sz$MediaBrowserCompat$ItemReceiver> RatingCompat;
    private final HmlReviewDocumentActivity<zzav> read;
    private final HmlReviewDocumentActivity<zzap> write;

    private dispatchOnScrollStateChanged(RepositoryModule repositoryModule, HmlReviewDocumentActivity<sz$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zzak> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getAccountName> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<newTaskFor> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zzaq> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<zzav> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<zzk.zzc> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zzap> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<zzk.zza> hmlReviewDocumentActivity9) {
        this.MediaBrowserCompat$MediaItem = repositoryModule;
        this.RatingCompat = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.read = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity7;
        this.write = hmlReviewDocumentActivity8;
        this.MediaMetadataCompat = hmlReviewDocumentActivity9;
    }

    public static dispatchOnScrollStateChanged read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<sz$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zzak> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getAccountName> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<newTaskFor> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<zzaq> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<zzav> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<zzk.zzc> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zzap> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<zzk.zza> hmlReviewDocumentActivity9) {
        return new dispatchOnScrollStateChanged(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9);
    }

    public final /* synthetic */ Object get() {
        OnDeviceIdExtractor.C6966a.C69682 read2 = this.MediaBrowserCompat$MediaItem.read(this.RatingCompat.get(), this.IconCompatParcelizer.get(), this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.write.get(), this.MediaMetadataCompat.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

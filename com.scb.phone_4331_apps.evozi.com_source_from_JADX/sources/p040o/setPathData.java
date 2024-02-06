package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.zzge;

/* renamed from: o.setPathData */
public final class setPathData implements OPRStatusRewardsLandingActivity_ViewBinding<zzge.zzc.zza> {
    private final HmlReviewDocumentActivity<addConcreteTypeInternal> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getFieldValue> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<ho$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule RatingCompat;
    private final HmlReviewDocumentActivity<getMinAgeOfLockScreen> read;
    private final HmlReviewDocumentActivity<addConcreteTypeArrayInternal> write;

    private setPathData(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ho$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getMinAgeOfLockScreen> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getFieldValue> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<addConcreteTypeInternal> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<addConcreteTypeArrayInternal> hmlReviewDocumentActivity5) {
        this.RatingCompat = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
    }

    public static setPathData read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<ho$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getMinAgeOfLockScreen> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getFieldValue> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<addConcreteTypeInternal> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<addConcreteTypeArrayInternal> hmlReviewDocumentActivity5) {
        return new setPathData(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        zzge.zzc.zza write2 = this.RatingCompat.write(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

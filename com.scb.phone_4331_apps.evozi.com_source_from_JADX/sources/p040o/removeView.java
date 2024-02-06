package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;
import p040o.zzkq;

/* renamed from: o.removeView */
public final class removeView implements OPRStatusRewardsLandingActivity_ViewBinding<getDelegateListIterator> {
    private final PrepaidRepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzkq.zza> MediaBrowserCompat$CustomActionResultReceiver;

    private removeView(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkq.zza> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = prepaidRepositoryModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static removeView write(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkq.zza> hmlReviewDocumentActivity) {
        return new removeView(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        getDelegateListIterator MediaBrowserCompat$CustomActionResultReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

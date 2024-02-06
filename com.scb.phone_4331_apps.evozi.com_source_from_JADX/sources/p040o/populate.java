package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;

/* renamed from: o.populate */
public final class populate implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractSetMultimap> {
    private final PrepaidRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zzki> read;

    private populate(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzki> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidRepositoryModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static populate read(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzki> hmlReviewDocumentActivity) {
        return new populate(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractSetMultimap IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.read.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

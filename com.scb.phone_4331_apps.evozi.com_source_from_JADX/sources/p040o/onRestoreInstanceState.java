package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;

/* renamed from: o.onRestoreInstanceState */
public final class onRestoreInstanceState implements OPRStatusRewardsLandingActivity_ViewBinding<getListDelegate> {
    private final PrepaidRepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zzkl> read;

    private onRestoreInstanceState(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkl> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidRepositoryModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static onRestoreInstanceState write(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkl> hmlReviewDocumentActivity) {
        return new onRestoreInstanceState(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        getListDelegate read2 = this.MediaBrowserCompat$ItemReceiver.read(this.read.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

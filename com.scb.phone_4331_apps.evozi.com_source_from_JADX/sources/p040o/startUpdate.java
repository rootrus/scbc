package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.startUpdate */
public final class startUpdate implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.WrappedList> {
    private final HmlReviewDocumentActivity<zzkg> MediaBrowserCompat$ItemReceiver;
    private final RepositoryModule read;

    private startUpdate(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzkg> hmlReviewDocumentActivity) {
        this.read = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static startUpdate MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzkg> hmlReviewDocumentActivity) {
        return new startUpdate(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.WrappedList IconCompatParcelizer = this.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

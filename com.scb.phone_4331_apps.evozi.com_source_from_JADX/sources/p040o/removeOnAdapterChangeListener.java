package p040o;

import com.scb.phone.data.p033di.prepiad.PrepaidRepositoryModule;
import p040o.AbstractMultimap;

/* renamed from: o.removeOnAdapterChangeListener */
public final class removeOnAdapterChangeListener implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.WrappedList.WrappedListIterator> {
    private final HmlReviewDocumentActivity<zzkz> IconCompatParcelizer;
    private final PrepaidRepositoryModule write;

    private removeOnAdapterChangeListener(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkz> hmlReviewDocumentActivity) {
        this.write = prepaidRepositoryModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static removeOnAdapterChangeListener write(PrepaidRepositoryModule prepaidRepositoryModule, HmlReviewDocumentActivity<zzkz> hmlReviewDocumentActivity) {
        return new removeOnAdapterChangeListener(prepaidRepositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.WrappedList.WrappedListIterator MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

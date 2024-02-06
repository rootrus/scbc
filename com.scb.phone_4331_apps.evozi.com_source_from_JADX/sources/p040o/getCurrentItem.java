package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import p040o.AbstractMultimap;
import p040o.ListenerHolder;
import p040o.removeAllOccurrences;

/* renamed from: o.getCurrentItem */
public final class getCurrentItem implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.EntrySet> {
    private final HmlReviewDocumentActivity<LifecycleCallback> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<LifecycleFragment> MediaBrowserCompat$CustomActionResultReceiver;
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<removeAllOccurrences.write> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<FriendsLandingActivity.write> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final HmlReviewDocumentActivity<notifyListenerInternal> f2584x50fd9e4a;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindSettingTabFragment> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<isCreated> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<ListenerHolder.ListenerKey> RatingCompat;
    private final HmlReviewDocumentActivity<register> read;
    private final HmlReviewDocumentActivity<getLifecycleActivity> write;

    private getCurrentItem(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindSettingTabFragment> hmlReviewDocumentActivity, HmlReviewDocumentActivity<removeAllOccurrences.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FriendsLandingActivity.write> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LifecycleCallback> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<isCreated> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getLifecycleActivity> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<register> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<LifecycleFragment> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<ListenerHolder.ListenerKey> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<notifyListenerInternal> hmlReviewDocumentActivity10) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.MediaMetadataCompat = hmlReviewDocumentActivity5;
        this.write = hmlReviewDocumentActivity6;
        this.read = hmlReviewDocumentActivity7;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity8;
        this.RatingCompat = hmlReviewDocumentActivity9;
        this.f2584x50fd9e4a = hmlReviewDocumentActivity10;
    }

    public static getCurrentItem read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FragmentBuilder_BindSettingTabFragment> hmlReviewDocumentActivity, HmlReviewDocumentActivity<removeAllOccurrences.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FriendsLandingActivity.write> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<LifecycleCallback> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<isCreated> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getLifecycleActivity> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<register> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<LifecycleFragment> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<ListenerHolder.ListenerKey> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<notifyListenerInternal> hmlReviewDocumentActivity10) {
        return new getCurrentItem(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.EntrySet read2 = this.MediaBrowserCompat$ItemReceiver.read(this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.IconCompatParcelizer.get(), this.MediaMetadataCompat.get(), this.write.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.RatingCompat.get(), this.f2584x50fd9e4a.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

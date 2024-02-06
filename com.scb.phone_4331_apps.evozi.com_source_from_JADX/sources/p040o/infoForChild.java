package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import p040o.AbstractMultimap;
import p040o.ListenerHolder;

/* renamed from: o.infoForChild */
public final class infoForChild implements OPRStatusRewardsLandingActivity_ViewBinding<AbstractMultimap.KeySet.C11261> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<ListenerHolder.Notifier> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<createListenerKey> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<FriendsLandingActivity.read> read;
    private final HmlReviewDocumentActivity<ListenerHolder.zaa> write;

    private infoForChild(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FriendsLandingActivity.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ListenerHolder.zaa> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ListenerHolder.Notifier> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<createListenerKey> hmlReviewDocumentActivity4) {
        this.IconCompatParcelizer = repositoryModule;
        this.read = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
    }

    public static infoForChild write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<FriendsLandingActivity.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<ListenerHolder.zaa> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<ListenerHolder.Notifier> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<createListenerKey> hmlReviewDocumentActivity4) {
        return new infoForChild(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        AbstractMultimap.KeySet.C11261 IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.read.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.p033di.RepositoryModule;

/* renamed from: o.getAdapter */
public final class getAdapter implements OPRStatusRewardsLandingActivity_ViewBinding<AccountChangeEventsResponse> {
    private final RepositoryModule MediaBrowserCompat$ItemReceiver;

    private getAdapter(RepositoryModule repositoryModule) {
        this.MediaBrowserCompat$ItemReceiver = repositoryModule;
    }

    public static getAdapter MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule) {
        return new getAdapter(repositoryModule);
    }

    public final /* synthetic */ Object get() {
        AccountChangeEventsResponse MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

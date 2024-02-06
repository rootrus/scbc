package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.CallAdapter;

/* renamed from: o.parseSize */
public final class parseSize implements OPRStatusRewardsLandingActivity_ViewBinding<CallAdapter.Factory> {
    private final NetworkModule MediaBrowserCompat$ItemReceiver;

    private parseSize(NetworkModule networkModule) {
        this.MediaBrowserCompat$ItemReceiver = networkModule;
    }

    public static parseSize IconCompatParcelizer(NetworkModule networkModule) {
        return new parseSize(networkModule);
    }

    public final /* synthetic */ Object get() {
        CallAdapter.Factory MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem != null) {
            return MediaBrowserCompat$MediaItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

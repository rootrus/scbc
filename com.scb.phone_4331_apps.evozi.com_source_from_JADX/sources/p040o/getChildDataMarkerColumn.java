package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.getChildDataMarkerColumn */
public final class getChildDataMarkerColumn implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule write;

    private getChildDataMarkerColumn(NetworkModule networkModule) {
        this.write = networkModule;
    }

    public static getChildDataMarkerColumn MediaBrowserCompat$ItemReceiver(NetworkModule networkModule) {
        return new getChildDataMarkerColumn(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

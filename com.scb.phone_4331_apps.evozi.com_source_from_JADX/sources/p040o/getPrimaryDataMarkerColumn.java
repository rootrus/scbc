package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.getPrimaryDataMarkerColumn */
public final class getPrimaryDataMarkerColumn implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule MediaBrowserCompat$CustomActionResultReceiver;

    private getPrimaryDataMarkerColumn(NetworkModule networkModule) {
        this.MediaBrowserCompat$CustomActionResultReceiver = networkModule;
    }

    public static getPrimaryDataMarkerColumn MediaBrowserCompat$ItemReceiver(NetworkModule networkModule) {
        return new getPrimaryDataMarkerColumn(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.ApiExceptionUtil */
public final class ApiExceptionUtil implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule read;

    private ApiExceptionUtil(NetworkModule networkModule) {
        this.read = networkModule;
    }

    public static ApiExceptionUtil write(NetworkModule networkModule) {
        return new ApiExceptionUtil(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.read.mo13212x50fd9e4a();
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
            return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

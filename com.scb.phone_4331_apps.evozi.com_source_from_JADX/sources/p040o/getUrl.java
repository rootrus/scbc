package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.getUrl */
public final class getUrl implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule IconCompatParcelizer;

    private getUrl(NetworkModule networkModule) {
        this.IconCompatParcelizer = networkModule;
    }

    public static getUrl read(NetworkModule networkModule) {
        return new getUrl(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory MediaSessionCompat$Token = this.IconCompatParcelizer.MediaSessionCompat$Token();
        if (MediaSessionCompat$Token != null) {
            return MediaSessionCompat$Token;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

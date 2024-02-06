package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.loadImage */
public final class loadImage implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule IconCompatParcelizer;

    private loadImage(NetworkModule networkModule) {
        this.IconCompatParcelizer = networkModule;
    }

    public static loadImage write(NetworkModule networkModule) {
        return new loadImage(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.Size  reason: case insensitive filesystem */
public final class C10828Size implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule write;

    private C10828Size(NetworkModule networkModule) {
        this.write = networkModule;
    }

    public static C10828Size MediaBrowserCompat$ItemReceiver(NetworkModule networkModule) {
        return new C10828Size(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory MediaMetadataCompat = this.write.MediaMetadataCompat();
        if (MediaMetadataCompat != null) {
            return MediaMetadataCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

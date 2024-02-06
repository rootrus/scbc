package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.getEntry */
public final class getEntry implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule IconCompatParcelizer;

    private getEntry(NetworkModule networkModule) {
        this.IconCompatParcelizer = networkModule;
    }

    public static getEntry IconCompatParcelizer(NetworkModule networkModule) {
        return new getEntry(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

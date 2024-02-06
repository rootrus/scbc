package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import retrofit2.Converter;

/* renamed from: o.FreezableUtils */
public final class FreezableUtils implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
    private final NetworkModule IconCompatParcelizer;

    private FreezableUtils(NetworkModule networkModule) {
        this.IconCompatParcelizer = networkModule;
    }

    public static FreezableUtils write(NetworkModule networkModule) {
        return new FreezableUtils(networkModule);
    }

    public final /* synthetic */ Object get() {
        Converter.Factory read = this.IconCompatParcelizer.read();
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

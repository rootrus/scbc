package p040o;

import com.scb.phone.domain.p036di.UseCaseModule;
import okhttp3.OkHttpClient;

/* renamed from: o.zzpm */
public final class zzpm implements OPRStatusRewardsLandingActivity_ViewBinding<OkHttpClient> {
    private final UseCaseModule MediaBrowserCompat$CustomActionResultReceiver;

    private zzpm(UseCaseModule useCaseModule) {
        this.MediaBrowserCompat$CustomActionResultReceiver = useCaseModule;
    }

    public static zzpm MediaBrowserCompat$CustomActionResultReceiver(UseCaseModule useCaseModule) {
        return new zzpm(useCaseModule);
    }

    public final /* synthetic */ Object get() {
        OkHttpClient write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

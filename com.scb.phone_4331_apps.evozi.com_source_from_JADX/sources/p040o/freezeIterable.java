package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;

/* renamed from: o.freezeIterable */
public final class freezeIterable implements OPRStatusRewardsLandingActivity_ViewBinding<Interceptor> {
    private final NetworkModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$ItemReceiver;

    private freezeIterable(NetworkModule networkModule, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = networkModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static freezeIterable write(NetworkModule networkModule, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity) {
        return new freezeIterable(networkModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        Interceptor MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

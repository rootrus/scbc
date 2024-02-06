package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import okhttp3.Response;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.DataHolder */
public final class DataHolder implements OPRStatusRewardsLandingActivity_ViewBinding<Interceptor> {
    private final HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<SharedPreferences> read;
    private final NetworkModule write;

    /* renamed from: o.DataHolder$Builder */
    public final /* synthetic */ class Builder implements Interceptor {
        private final /* synthetic */ count$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ Builder(count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$ItemReceiver = count_mediabrowsercompat_customactionresultreceiver;
        }

        public final Response intercept(Interceptor.Chain chain) {
            return NetworkModule.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, chain);
        }
    }

    private DataHolder(NetworkModule networkModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity2) {
        this.write = networkModule;
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
    }

    public static DataHolder read(NetworkModule networkModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity, HmlReviewDocumentActivity<count$MediaBrowserCompat$CustomActionResultReceiver> hmlReviewDocumentActivity2) {
        return new DataHolder(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: o.DataHolder$zaa */
    public final class zaa implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
        private final HmlReviewDocumentActivity<hasObservers> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<onDataRangeInserted> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaBrowserCompat$MediaItem;
        private final NetworkModule MediaDescriptionCompat;
        private final HmlReviewDocumentActivity<getByteArray> MediaMetadataCompat;
        private final HmlReviewDocumentActivity<Interceptor> RatingCompat;
        private final HmlReviewDocumentActivity<String> read;
        private final HmlReviewDocumentActivity<Converter.Factory> write;

        private zaa(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            this.MediaDescriptionCompat = networkModule;
            this.read = hmlReviewDocumentActivity;
            this.RatingCompat = hmlReviewDocumentActivity2;
            this.MediaMetadataCompat = hmlReviewDocumentActivity3;
            this.IconCompatParcelizer = hmlReviewDocumentActivity4;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity5;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity6;
            this.write = hmlReviewDocumentActivity7;
            this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity8;
        }

        public static zaa MediaBrowserCompat$CustomActionResultReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            return new zaa(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
        }

        public final /* synthetic */ Object get() {
            zaaa MediaBrowserCompat$ItemReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.read.get(), this.RatingCompat.get(), this.MediaMetadataCompat.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$MediaItem.get());
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                return MediaBrowserCompat$ItemReceiver2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final /* synthetic */ Object get() {
        Interceptor MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

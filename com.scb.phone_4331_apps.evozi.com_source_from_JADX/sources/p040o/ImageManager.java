package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.ImageManager */
public final class ImageManager implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<removeObserver> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<onDataRangeInserted> MediaBrowserCompat$ItemReceiver;
    private final NetworkModule MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<String> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<getByteArray> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<hasObservers> read;
    private final HmlReviewDocumentActivity<Converter.Factory> write;

    /* renamed from: o.ImageManager$ImageReceiver */
    public final class ImageReceiver implements OPRStatusRewardsLandingActivity_ViewBinding<String> {
        private final NetworkModule read;

        private ImageReceiver(NetworkModule networkModule) {
            this.read = networkModule;
        }

        public static ImageReceiver read(NetworkModule networkModule) {
            return new ImageReceiver(networkModule);
        }

        public final /* synthetic */ Object get() {
            String RatingCompat = this.read.RatingCompat();
            if (RatingCompat != null) {
                return RatingCompat;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.ImageManager$zab */
    public final class zab implements OPRStatusRewardsLandingActivity_ViewBinding<Converter.Factory> {
        private final NetworkModule MediaBrowserCompat$CustomActionResultReceiver;

        private zab(NetworkModule networkModule) {
            this.MediaBrowserCompat$CustomActionResultReceiver = networkModule;
        }

        public static zab write(NetworkModule networkModule) {
            return new zab(networkModule);
        }

        public final /* synthetic */ Object get() {
            Converter.Factory MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
            if (MediaBrowserCompat$SearchResultReceiver != null) {
                return MediaBrowserCompat$SearchResultReceiver;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.ImageManager$OnImageLoadedListener */
    public final class OnImageLoadedListener implements OPRStatusRewardsLandingActivity_ViewBinding<Interceptor> {
        private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$CustomActionResultReceiver;
        private final NetworkModule read;

        private OnImageLoadedListener(NetworkModule networkModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
            this.read = networkModule;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        }

        public static OnImageLoadedListener IconCompatParcelizer(NetworkModule networkModule, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity) {
            return new OnImageLoadedListener(networkModule, hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            Interceptor read2 = this.read.read(this.MediaBrowserCompat$CustomActionResultReceiver.get());
            if (read2 != null) {
                return read2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.ImageManager$zaa */
    public final class zaa implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
        private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<onDataRangeInserted> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$ItemReceiver;
        private final NetworkModule MediaBrowserCompat$MediaItem;
        private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$SearchResultReceiver;
        private final HmlReviewDocumentActivity<Converter.Factory> MediaMetadataCompat;
        private final HmlReviewDocumentActivity<CallAdapter.Factory> RatingCompat;
        private final HmlReviewDocumentActivity<removeObserver> read;
        private final HmlReviewDocumentActivity<hasObservers> write;

        private zaa(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            this.MediaBrowserCompat$MediaItem = networkModule;
            this.IconCompatParcelizer = hmlReviewDocumentActivity;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
            this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity3;
            this.write = hmlReviewDocumentActivity4;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
            this.read = hmlReviewDocumentActivity6;
            this.MediaMetadataCompat = hmlReviewDocumentActivity7;
            this.RatingCompat = hmlReviewDocumentActivity8;
        }

        public static zaa IconCompatParcelizer(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            return new zaa(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
        }

        public final /* synthetic */ Object get() {
            zaaa MediaBrowserCompat$MediaItem2 = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.MediaMetadataCompat.get(), this.RatingCompat.get());
            if (MediaBrowserCompat$MediaItem2 != null) {
                return MediaBrowserCompat$MediaItem2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.ImageManager$zac */
    public final class zac implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
        private final HmlReviewDocumentActivity<Converter.Factory> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<hasObservers> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<onDataRangeInserted> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$SearchResultReceiver;
        private final HmlReviewDocumentActivity<Interceptor> MediaDescriptionCompat;
        private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaMetadataCompat;
        private final NetworkModule RatingCompat;
        private final HmlReviewDocumentActivity<removeObserver> read;
        private final HmlReviewDocumentActivity<String> write;

        private zac(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            this.RatingCompat = networkModule;
            this.write = hmlReviewDocumentActivity;
            this.MediaDescriptionCompat = hmlReviewDocumentActivity2;
            this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity3;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity5;
            this.read = hmlReviewDocumentActivity6;
            this.IconCompatParcelizer = hmlReviewDocumentActivity7;
            this.MediaMetadataCompat = hmlReviewDocumentActivity8;
        }

        public static zac IconCompatParcelizer(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            return new zac(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
        }

        public final /* synthetic */ Object get() {
            zaaa MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.RatingCompat.mo13211x50fd9e4a(this.write.get(), this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaMetadataCompat.get());
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
                return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.ImageManager$zad */
    public final class zad implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
        private final HmlReviewDocumentActivity<Interceptor> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<onDataRangeInserted> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$MediaItem;
        private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaBrowserCompat$SearchResultReceiver;
        private final HmlReviewDocumentActivity<Converter.Factory> MediaDescriptionCompat;
        private final NetworkModule MediaMetadataCompat;
        private final HmlReviewDocumentActivity<String> read;
        private final HmlReviewDocumentActivity<hasObservers> write;

        private zad(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            this.MediaMetadataCompat = networkModule;
            this.read = hmlReviewDocumentActivity;
            this.IconCompatParcelizer = hmlReviewDocumentActivity2;
            this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity3;
            this.write = hmlReviewDocumentActivity4;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity5;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity6;
            this.MediaDescriptionCompat = hmlReviewDocumentActivity7;
            this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity8;
        }

        public static zad write(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
            return new zad(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
        }

        public final /* synthetic */ Object get() {
            zaaa MediaSessionCompat$Token = this.MediaMetadataCompat.MediaSessionCompat$Token(this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$MediaItem.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
            if (MediaSessionCompat$Token != null) {
                return MediaSessionCompat$Token;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private ImageManager(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaBrowserCompat$MediaItem = networkModule;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaMetadataCompat = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity5;
        this.IconCompatParcelizer = hmlReviewDocumentActivity6;
        this.write = hmlReviewDocumentActivity7;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity8;
    }

    public static ImageManager write(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new ImageManager(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa RatingCompat = this.MediaBrowserCompat$MediaItem.RatingCompat(this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaMetadataCompat.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.write.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
        if (RatingCompat != null) {
            return RatingCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

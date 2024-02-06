package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.onImageLoaded */
public final class onImageLoaded implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<onDataRangeInserted> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<Converter.Factory> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$SearchResultReceiver;
    private final NetworkModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<getByteArray> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<getDouble> RatingCompat;
    private final HmlReviewDocumentActivity<hasObservers> read;
    private final HmlReviewDocumentActivity<removeObserver> write;

    private onImageLoaded(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<getDouble> hmlReviewDocumentActivity9) {
        this.MediaDescriptionCompat = networkModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity2;
        this.MediaMetadataCompat = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.write = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity7;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity8;
        this.RatingCompat = hmlReviewDocumentActivity9;
    }

    public static onImageLoaded IconCompatParcelizer(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<getDouble> hmlReviewDocumentActivity9) {
        return new onImageLoaded(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9);
    }

    public final /* synthetic */ Object get() {
        zaaa read2 = this.MediaDescriptionCompat.read(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaMetadataCompat.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$MediaItem.get(), this.RatingCompat.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

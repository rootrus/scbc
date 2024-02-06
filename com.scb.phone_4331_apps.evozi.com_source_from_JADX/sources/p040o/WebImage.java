package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.WebImage */
public final class WebImage implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<Converter.Factory> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<DataBufferRef> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$SearchResultReceiver;
    private final NetworkModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<getByteArray> RatingCompat;
    private final HmlReviewDocumentActivity<hasObservers> read;
    private final HmlReviewDocumentActivity<onDataRangeInserted> write;

    private WebImage(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<DataBufferRef> hmlReviewDocumentActivity9) {
        this.MediaDescriptionCompat = networkModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity2;
        this.RatingCompat = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity6;
        this.IconCompatParcelizer = hmlReviewDocumentActivity7;
        this.MediaMetadataCompat = hmlReviewDocumentActivity8;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity9;
    }

    public static WebImage write(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<DataBufferRef> hmlReviewDocumentActivity9) {
        return new WebImage(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9);
    }

    public final /* synthetic */ Object get() {
        zaaa MediaBrowserCompat$ItemReceiver2 = this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.RatingCompat.get(), this.read.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.MediaMetadataCompat.get(), this.MediaBrowserCompat$MediaItem.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

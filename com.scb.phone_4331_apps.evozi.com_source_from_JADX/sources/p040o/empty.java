package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.empty */
public final class empty implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<hasObservers> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Converter.Factory> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$SearchResultReceiver;
    private final NetworkModule MediaMetadataCompat;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> RatingCompat;
    private final HmlReviewDocumentActivity<onDataRangeInserted> read;
    private final HmlReviewDocumentActivity<removeObserver> write;

    private empty(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaMetadataCompat = networkModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.write = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity7;
        this.RatingCompat = hmlReviewDocumentActivity8;
    }

    public static empty MediaBrowserCompat$CustomActionResultReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new empty(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa IconCompatParcelizer2 = this.MediaMetadataCompat.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get(), this.write.get(), this.MediaBrowserCompat$MediaItem.get(), this.RatingCompat.get());
        if (IconCompatParcelizer2 != null) {
            return IconCompatParcelizer2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

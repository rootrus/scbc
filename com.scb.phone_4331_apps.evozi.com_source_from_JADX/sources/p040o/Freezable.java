package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.Freezable */
public final class Freezable implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<hasObservers> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$ItemReceiver;
    private final NetworkModule MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<getByteArray> RatingCompat;
    private final HmlReviewDocumentActivity<onDataRangeInserted> read;
    private final HmlReviewDocumentActivity<Converter.Factory> write;

    private Freezable(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaBrowserCompat$MediaItem = networkModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity2;
        this.RatingCompat = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity6;
        this.write = hmlReviewDocumentActivity7;
        this.MediaMetadataCompat = hmlReviewDocumentActivity8;
    }

    public static Freezable MediaBrowserCompat$CustomActionResultReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new Freezable(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa MediaBrowserCompat$SearchResultReceiver2 = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.RatingCompat.get(), this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaMetadataCompat.get());
        if (MediaBrowserCompat$SearchResultReceiver2 != null) {
            return MediaBrowserCompat$SearchResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

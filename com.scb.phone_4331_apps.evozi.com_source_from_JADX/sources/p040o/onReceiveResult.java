package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.onReceiveResult */
public final class onReceiveResult implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<Converter.Factory> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<Interceptor> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<getByteArray> MediaMetadataCompat;
    private final NetworkModule RatingCompat;
    private final HmlReviewDocumentActivity<onDataRangeInserted> read;
    private final HmlReviewDocumentActivity<hasObservers> write;

    private onReceiveResult(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity9) {
        this.RatingCompat = networkModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity2;
        this.MediaMetadataCompat = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
        this.IconCompatParcelizer = hmlReviewDocumentActivity7;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity8;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity9;
    }

    public static onReceiveResult MediaBrowserCompat$CustomActionResultReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity9) {
        return new onReceiveResult(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9);
    }

    public final /* synthetic */ Object get() {
        zaaa write2 = this.RatingCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaDescriptionCompat.get(), this.MediaMetadataCompat.get(), this.write.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

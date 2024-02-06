package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.getWindowIndex */
public final class getWindowIndex implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<Interceptor> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<onDataRangeInserted> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<hasObservers> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Converter.Factory> MediaBrowserCompat$MediaItem;
    private final NetworkModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<getByteArray> RatingCompat;
    private final HmlReviewDocumentActivity<String> read;
    private final HmlReviewDocumentActivity<removeObserver> write;

    private getWindowIndex(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaDescriptionCompat = networkModule;
        this.read = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.RatingCompat = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity5;
        this.write = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity7;
        this.MediaMetadataCompat = hmlReviewDocumentActivity8;
    }

    public static getWindowIndex MediaBrowserCompat$ItemReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new getWindowIndex(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa read2 = this.MediaDescriptionCompat.read(this.read.get(), this.IconCompatParcelizer.get(), this.RatingCompat.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaMetadataCompat.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

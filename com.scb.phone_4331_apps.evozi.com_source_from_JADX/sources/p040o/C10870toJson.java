package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.toJson  reason: case insensitive filesystem */
public final class C10870toJson implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<onDataRangeInserted> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$ItemReceiver;
    private final NetworkModule MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<Interceptor> RatingCompat;
    private final HmlReviewDocumentActivity<hasObservers> read;
    private final HmlReviewDocumentActivity<Converter.Factory> write;

    private C10870toJson(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaBrowserCompat$MediaItem = networkModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.RatingCompat = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity6;
        this.write = hmlReviewDocumentActivity7;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity8;
    }

    public static C10870toJson read(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new C10870toJson(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa MediaSessionCompat$ResultReceiverWrapper = this.MediaBrowserCompat$MediaItem.MediaSessionCompat$ResultReceiverWrapper(this.MediaBrowserCompat$ItemReceiver.get(), this.RatingCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.MediaDescriptionCompat.get());
        if (MediaSessionCompat$ResultReceiverWrapper != null) {
            return MediaSessionCompat$ResultReceiverWrapper;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.withRow */
public final class withRow implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<Converter.Factory> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<hasObservers> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$MediaItem;
    private final NetworkModule MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<Interceptor> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<removeObserver> read;
    private final HmlReviewDocumentActivity<onDataRangeInserted> write;

    private withRow(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaBrowserCompat$SearchResultReceiver = networkModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaMetadataCompat = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.read = hmlReviewDocumentActivity6;
        this.IconCompatParcelizer = hmlReviewDocumentActivity7;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity8;
    }

    public static withRow MediaBrowserCompat$ItemReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new withRow(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaMetadataCompat.get(), this.MediaBrowserCompat$MediaItem.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaDescriptionCompat.get());
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

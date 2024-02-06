package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.SingleRefDataBufferIterator */
public final class SingleRefDataBufferIterator implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<Converter.Factory> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$SearchResultReceiver;
    private final NetworkModule MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<Interceptor> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<hasObservers> read;
    private final HmlReviewDocumentActivity<onDataRangeInserted> write;

    private SingleRefDataBufferIterator(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaDescriptionCompat = networkModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.MediaMetadataCompat = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity3;
        this.read = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
        this.IconCompatParcelizer = hmlReviewDocumentActivity7;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity8;
    }

    public static SingleRefDataBufferIterator write(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new SingleRefDataBufferIterator(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa MediaMetadataCompat2 = this.MediaDescriptionCompat.MediaMetadataCompat(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaMetadataCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.read.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$MediaItem.get());
        if (MediaMetadataCompat2 != null) {
            return MediaMetadataCompat2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.AccountAccessor */
public final class AccountAccessor implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<String> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<Converter.Factory> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<removeObserver> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getByteArray> MediaBrowserCompat$MediaItem;
    private final NetworkModule MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<Interceptor> RatingCompat;
    private final HmlReviewDocumentActivity<onDataRangeInserted> read;
    private final HmlReviewDocumentActivity<hasObservers> write;

    private AccountAccessor(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaBrowserCompat$SearchResultReceiver = networkModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.RatingCompat = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity7;
        this.MediaMetadataCompat = hmlReviewDocumentActivity8;
    }

    public static AccountAccessor MediaBrowserCompat$CustomActionResultReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new AccountAccessor(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa MediaSessionCompat$QueueItem = this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem(this.IconCompatParcelizer.get(), this.RatingCompat.get(), this.MediaBrowserCompat$MediaItem.get(), this.write.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaMetadataCompat.get());
        if (MediaSessionCompat$QueueItem != null) {
            return MediaSessionCompat$QueueItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

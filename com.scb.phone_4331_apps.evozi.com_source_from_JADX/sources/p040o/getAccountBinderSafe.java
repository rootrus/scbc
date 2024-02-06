package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.getAccountBinderSafe */
public final class getAccountBinderSafe implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<onDataRangeInserted> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<hasObservers> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<Converter.Factory> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<getByteArray> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<Interceptor> MediaMetadataCompat;
    private final NetworkModule RatingCompat;
    private final HmlReviewDocumentActivity<removeObserver> read;
    private final HmlReviewDocumentActivity<String> write;

    private getAccountBinderSafe(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.RatingCompat = networkModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaMetadataCompat = hmlReviewDocumentActivity2;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity4;
        this.IconCompatParcelizer = hmlReviewDocumentActivity5;
        this.read = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity7;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity8;
    }

    public static getAccountBinderSafe MediaBrowserCompat$ItemReceiver(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new getAccountBinderSafe(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa ParcelableVolumeInfo = this.RatingCompat.ParcelableVolumeInfo(this.write.get(), this.MediaMetadataCompat.get(), this.MediaDescriptionCompat.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
        if (ParcelableVolumeInfo != null) {
            return ParcelableVolumeInfo;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

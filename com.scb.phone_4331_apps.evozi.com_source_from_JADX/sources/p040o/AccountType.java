package p040o;

import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: o.AccountType */
public final class AccountType implements OPRStatusRewardsLandingActivity_ViewBinding<zaaa> {
    private final HmlReviewDocumentActivity<removeObserver> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<Converter.Factory> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<hasObservers> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<Interceptor> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<CallAdapter.Factory> MediaDescriptionCompat;
    private final NetworkModule MediaMetadataCompat;
    private final HmlReviewDocumentActivity<getByteArray> RatingCompat;
    private final HmlReviewDocumentActivity<onDataRangeInserted> read;
    private final HmlReviewDocumentActivity<String> write;

    private AccountType(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        this.MediaMetadataCompat = networkModule;
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity2;
        this.RatingCompat = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
        this.IconCompatParcelizer = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity7;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity8;
    }

    public static AccountType read(NetworkModule networkModule, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Interceptor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getByteArray> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<hasObservers> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<onDataRangeInserted> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeObserver> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Converter.Factory> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<CallAdapter.Factory> hmlReviewDocumentActivity8) {
        return new AccountType(networkModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final /* synthetic */ Object get() {
        zaaa Keep = this.MediaMetadataCompat.Keep(this.write.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.RatingCompat.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaDescriptionCompat.get());
        if (Keep != null) {
            return Keep;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

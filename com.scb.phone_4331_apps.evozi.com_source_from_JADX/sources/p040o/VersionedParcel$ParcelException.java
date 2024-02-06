package p040o;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import com.scb.phone.data.p033di.RepositoryModule;
import p040o.getAddress4FieldName;

/* renamed from: o.VersionedParcel$ParcelException */
public final class VersionedParcel$ParcelException implements OPRStatusRewardsLandingActivity_ViewBinding<inject_cacheProvider> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<SharedPreferences> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<setSupported> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getAddress4FieldName.IconCompatParcelizer> read;
    private final HmlReviewDocumentActivity<AssetManager> write;

    private VersionedParcel$ParcelException(RepositoryModule repositoryModule, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getAddress4FieldName.IconCompatParcelizer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setSupported> hmlReviewDocumentActivity4) {
        this.IconCompatParcelizer = repositoryModule;
        this.write = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
    }

    public static VersionedParcel$ParcelException MediaBrowserCompat$ItemReceiver(RepositoryModule repositoryModule, HmlReviewDocumentActivity<AssetManager> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getAddress4FieldName.IconCompatParcelizer> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<setSupported> hmlReviewDocumentActivity4) {
        return new VersionedParcel$ParcelException(repositoryModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        inject_cacheProvider read2 = this.IconCompatParcelizer.read(this.write.get(), this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
        if (read2 != null) {
            return read2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

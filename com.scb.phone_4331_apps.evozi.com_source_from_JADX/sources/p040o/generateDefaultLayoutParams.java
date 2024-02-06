package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.zzge;

/* renamed from: o.generateDefaultLayoutParams */
public final class generateDefaultLayoutParams implements OPRStatusRewardsLandingActivity_ViewBinding<BiMap> {
    public static BiMap IconCompatParcelizer(RepositoryModule repositoryModule, zzge.zzm.zza zza) {
        BiMap MediaBrowserCompat$CustomActionResultReceiver = repositoryModule.MediaBrowserCompat$CustomActionResultReceiver(zza);
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.HmlReviewDocumentActivity, com.scb.phone.data.di.RepositoryModule] */
    public final /* synthetic */ Object get() {
        ? r0 = 0;
        BiMap MediaBrowserCompat$CustomActionResultReceiver = r0.MediaBrowserCompat$CustomActionResultReceiver((zzge.zzm.zza) r0.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

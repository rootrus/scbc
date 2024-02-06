package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.ServerProjectProvider;
import p040o.zzge;

/* renamed from: o.pageScrolled */
public final class pageScrolled implements OPRStatusRewardsLandingActivity_ViewBinding<ServerProjectProvider.C70684> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzge.zzg.zzb> MediaBrowserCompat$ItemReceiver;

    private pageScrolled(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzg.zzb> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static pageScrolled read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzg.zzb> hmlReviewDocumentActivity) {
        return new pageScrolled(repositoryModule, hmlReviewDocumentActivity);
    }

    public static ServerProjectProvider.C70684 IconCompatParcelizer(RepositoryModule repositoryModule, zzge.zzg.zzb zzb) {
        ServerProjectProvider.C70684 read = repositoryModule.read(zzb);
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ServerProjectProvider.C70684 read = this.IconCompatParcelizer.read(this.MediaBrowserCompat$ItemReceiver.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

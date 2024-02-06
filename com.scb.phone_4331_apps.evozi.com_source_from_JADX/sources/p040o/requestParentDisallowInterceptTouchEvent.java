package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.ServerProjectProvider;
import p040o.zzge;

/* renamed from: o.requestParentDisallowInterceptTouchEvent */
public final class requestParentDisallowInterceptTouchEvent implements OPRStatusRewardsLandingActivity_ViewBinding<ServerProjectProvider.C70729> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzge.zzh.zza> read;

    private requestParentDisallowInterceptTouchEvent(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzh.zza> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static requestParentDisallowInterceptTouchEvent write(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzh.zza> hmlReviewDocumentActivity) {
        return new requestParentDisallowInterceptTouchEvent(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ServerProjectProvider.C70729 write = this.IconCompatParcelizer.write(this.read.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

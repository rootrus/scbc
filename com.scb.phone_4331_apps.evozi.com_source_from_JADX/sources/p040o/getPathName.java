package p040o;

import com.scb.phone.data.p033di.RepositoryModule;
import p040o.zzge;

/* renamed from: o.getPathName */
public final class getPathName implements OPRStatusRewardsLandingActivity_ViewBinding<readVersion> {
    private final RepositoryModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zzge.zzc.zza> write;

    private getPathName(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzc.zza> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = repositoryModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static getPathName read(RepositoryModule repositoryModule, HmlReviewDocumentActivity<zzge.zzc.zza> hmlReviewDocumentActivity) {
        return new getPathName(repositoryModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        readVersion write2 = this.IconCompatParcelizer.write(this.write.get());
        if (write2 != null) {
            return write2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

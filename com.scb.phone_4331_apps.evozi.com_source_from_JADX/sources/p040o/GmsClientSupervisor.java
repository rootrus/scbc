package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashBusinessAndMaritalInfoService;
import com.scb.phone.data.network.service.easycash.EasycashLoanFeatureInformationService;

/* renamed from: o.GmsClientSupervisor */
public final class GmsClientSupervisor implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashBusinessAndMaritalInfoService> {
    private final HmlReviewDocumentActivity<zaaa> read;
    private final EasycashServiceModule write;

    /* renamed from: o.GmsClientSupervisor$zza */
    public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashLoanFeatureInformationService> {
        private final EasycashServiceModule IconCompatParcelizer;
        private final HmlReviewDocumentActivity<zaaa> write;

        private zza(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            this.IconCompatParcelizer = easycashServiceModule;
            this.write = hmlReviewDocumentActivity;
        }

        public static zza read(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            return new zza(easycashServiceModule, hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            EasycashLoanFeatureInformationService MediaBrowserCompat$SearchResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(this.write.get());
            if (MediaBrowserCompat$SearchResultReceiver != null) {
                return MediaBrowserCompat$SearchResultReceiver;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private GmsClientSupervisor(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = easycashServiceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static GmsClientSupervisor read(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new GmsClientSupervisor(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashBusinessAndMaritalInfoService MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(this.read.get());
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

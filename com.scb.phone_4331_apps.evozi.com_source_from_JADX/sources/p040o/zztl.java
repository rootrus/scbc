package p040o;

import com.scb.phone.domain.p036di.easycash.EasycashCardInfoCaseModule;
import com.scb.phone.domain.p036di.easycash.EasycashCommercialInfoCaseModule;
import com.scb.phone.domain.p036di.easycash.EasycashDFWYNCaseModule;
import p040o.CameraSource;

/* renamed from: o.zztl */
public final class zztl implements OPRStatusRewardsLandingActivity_ViewBinding<setFacing> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final EasycashCardInfoCaseModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<comparator> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    /* renamed from: o.zztl$zza */
    public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<CameraSource.zzb> {
        private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
        private final EasycashDFWYNCaseModule MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<C7513tX> write;

        private zza(EasycashDFWYNCaseModule easycashDFWYNCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7513tX> hmlReviewDocumentActivity3) {
            this.MediaBrowserCompat$ItemReceiver = easycashDFWYNCaseModule;
            this.IconCompatParcelizer = hmlReviewDocumentActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
            this.write = hmlReviewDocumentActivity3;
        }

        public static zza read(EasycashDFWYNCaseModule easycashDFWYNCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7513tX> hmlReviewDocumentActivity3) {
            return new zza(easycashDFWYNCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
        }

        public final /* synthetic */ Object get() {
            CameraSource.zzb read = this.MediaBrowserCompat$ItemReceiver.read(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get());
            if (read != null) {
                return read;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.zztl$zzb */
    public final class zzb implements OPRStatusRewardsLandingActivity_ViewBinding<CameraSource.Builder> {
        private final EasycashCommercialInfoCaseModule IconCompatParcelizer;
        private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<tailMap> read;
        private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

        private zzb(EasycashCommercialInfoCaseModule easycashCommercialInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<tailMap> hmlReviewDocumentActivity3) {
            this.IconCompatParcelizer = easycashCommercialInfoCaseModule;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
            this.write = hmlReviewDocumentActivity2;
            this.read = hmlReviewDocumentActivity3;
        }

        public static zzb MediaBrowserCompat$ItemReceiver(EasycashCommercialInfoCaseModule easycashCommercialInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<tailMap> hmlReviewDocumentActivity3) {
            return new zzb(easycashCommercialInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
        }

        public final /* synthetic */ Object get() {
            CameraSource.Builder read2 = this.IconCompatParcelizer.read(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.read.get());
            if (read2 != null) {
                return read2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private zztl(EasycashCardInfoCaseModule easycashCardInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<comparator> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$ItemReceiver = easycashCardInfoCaseModule;
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zztl IconCompatParcelizer(EasycashCardInfoCaseModule easycashCardInfoCaseModule, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<comparator> hmlReviewDocumentActivity3) {
        return new zztl(easycashCardInfoCaseModule, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        setFacing MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write.get(), this.IconCompatParcelizer.get(), this.read.get());
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

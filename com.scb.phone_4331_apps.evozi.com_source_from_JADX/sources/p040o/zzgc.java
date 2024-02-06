package p040o;

import com.scb.phone.data.network.service.AddressService;
import com.scb.phone.view.custom.common.CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.zzgc */
public final /* synthetic */ class zzgc implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSetupScheduleMonthlyFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ zzgc(FragmentBuilder_BindSetupScheduleMonthlyFragment fragmentBuilder_BindSetupScheduleMonthlyFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSetupScheduleMonthlyFragment;
    }

    /* renamed from: o.zzgc$zza */
    public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver> {
        private final HmlReviewDocumentActivity<AddressService> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<setAppOptOut> read;

        private zza(HmlReviewDocumentActivity<AddressService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setAppOptOut> hmlReviewDocumentActivity2) {
            this.IconCompatParcelizer = hmlReviewDocumentActivity;
            this.read = hmlReviewDocumentActivity2;
        }

        public static zza write(HmlReviewDocumentActivity<AddressService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setAppOptOut> hmlReviewDocumentActivity2) {
            return new zza(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
        }

        public final /* synthetic */ Object get() {
            return new CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get(), this.read.get());
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = (animateCameraWithDurationAndCallback) obj;
    }
}

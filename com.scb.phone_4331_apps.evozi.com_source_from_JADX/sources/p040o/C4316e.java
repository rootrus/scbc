package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashMHMCDetailService;
import com.scb.phone.view.activity.deeplink.OpenAccountEtbNoActiveCasaDeepLinkActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.e */
public final class C4316e implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashMHMCDetailService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final EasycashServiceModule MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.e$a */
    public final /* synthetic */ class C4322a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C4322a(String str, String str2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((QuickExtractorAgent) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
        }
    }

    private C4316e(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = easycashServiceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static C4316e write(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new C4316e(easycashServiceModule, hmlReviewDocumentActivity);
    }

    /* renamed from: o.e$b */
    public final class C4321b implements MileageQuantitySelectionActivity<OpenAccountEtbNoActiveCasaDeepLinkActivity> {
        public static void MediaBrowserCompat$ItemReceiver(OpenAccountEtbNoActiveCasaDeepLinkActivity openAccountEtbNoActiveCasaDeepLinkActivity, isAspectRatioWithinLimits isaspectratiowithinlimits) {
            openAccountEtbNoActiveCasaDeepLinkActivity.presenter = isaspectratiowithinlimits;
        }
    }

    public final /* synthetic */ Object get() {
        EasycashMHMCDetailService ParcelableVolumeInfo = this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (ParcelableVolumeInfo != null) {
            return ParcelableVolumeInfo;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

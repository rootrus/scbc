package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.CreditCardService;
import com.scb.phone.data.network.service.FundSummaryService;
import com.scb.phone.data.network.service.registration.RegistrationWithApiAuthService;

/* renamed from: o.ClientSettings */
public final class ClientSettings implements OPRStatusRewardsLandingActivity_ViewBinding<RegistrationWithApiAuthService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    /* renamed from: o.ClientSettings$Builder */
    public final class Builder implements OPRStatusRewardsLandingActivity_ViewBinding<CreditCardService> {
        private final ServiceModule MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<zaaa> write;

        private Builder(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            this.MediaBrowserCompat$ItemReceiver = serviceModule;
            this.write = hmlReviewDocumentActivity;
        }

        public static Builder IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            return new Builder(serviceModule, hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            CreditCardService actionBarHideOffset = this.MediaBrowserCompat$ItemReceiver.setActionBarHideOffset(this.write.get());
            if (actionBarHideOffset != null) {
                return actionBarHideOffset;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: o.ClientSettings$OptionalApiSettings */
    public final class OptionalApiSettings implements OPRStatusRewardsLandingActivity_ViewBinding<FundSummaryService> {
        private final ServiceModule IconCompatParcelizer;
        private final HmlReviewDocumentActivity<zaaa> write;

        private OptionalApiSettings(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            this.IconCompatParcelizer = serviceModule;
            this.write = hmlReviewDocumentActivity;
        }

        public static OptionalApiSettings MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            return new OptionalApiSettings(serviceModule, hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            FundSummaryService menuPrepared = this.IconCompatParcelizer.setMenuPrepared(this.write.get());
            if (menuPrepared != null) {
                return menuPrepared;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private ClientSettings(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static ClientSettings MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new ClientSettings(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        RegistrationWithApiAuthService tabContainer = this.MediaBrowserCompat$ItemReceiver.setTabContainer(this.read.get());
        if (tabContainer != null) {
            return tabContainer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

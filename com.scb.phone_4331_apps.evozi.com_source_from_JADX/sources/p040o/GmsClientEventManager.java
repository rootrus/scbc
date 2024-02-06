package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.TileService;
import com.scb.phone.data.network.service.easycash.EasycashCommercialInfoService;

/* renamed from: o.GmsClientEventManager */
public final class GmsClientEventManager implements OPRStatusRewardsLandingActivity_ViewBinding<TileService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule read;

    /* renamed from: o.GmsClientEventManager$GmsClientEventState */
    public final class GmsClientEventState implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashCommercialInfoService> {
        private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
        private final EasycashServiceModule read;

        private GmsClientEventState(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            this.read = easycashServiceModule;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        }

        public static GmsClientEventState MediaBrowserCompat$ItemReceiver(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
            return new GmsClientEventState(easycashServiceModule, hmlReviewDocumentActivity);
        }

        public final /* synthetic */ Object get() {
            EasycashCommercialInfoService read2 = this.read.read(this.MediaBrowserCompat$CustomActionResultReceiver.get());
            if (read2 != null) {
                return read2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private GmsClientEventManager(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static GmsClientEventManager read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new GmsClientEventManager(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        TileService AppCompatAutoCompleteTextView = this.read.AppCompatAutoCompleteTextView(this.MediaBrowserCompat$ItemReceiver.get());
        if (AppCompatAutoCompleteTextView != null) {
            return AppCompatAutoCompleteTextView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

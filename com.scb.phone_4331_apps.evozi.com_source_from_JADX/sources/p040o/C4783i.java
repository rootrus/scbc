package p040o;

import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.easycash.EasycashTermAndConditionsService;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;

/* renamed from: o.i */
public final class C4783i implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashTermAndConditionsService> {
    private final EasycashServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> write;

    /* renamed from: o.i$a */
    public final /* synthetic */ class C4787a implements EasycashDeepLinkActivity {
        public static final /* synthetic */ C4787a MediaBrowserCompat$ItemReceiver = new C4787a();

        private /* synthetic */ C4787a() {
        }

        public final Object write(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            return MwBusinessDetailsActivity.IconCompatParcelizer((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, (Boolean) obj7);
        }
    }

    private C4783i(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = easycashServiceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static C4783i MediaBrowserCompat$ItemReceiver(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new C4783i(easycashServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EasycashTermAndConditionsService PlaybackStateCompat = this.IconCompatParcelizer.PlaybackStateCompat(this.write.get());
        if (PlaybackStateCompat != null) {
            return PlaybackStateCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package p040o;

import androidx.fragment.app.Fragment;
import com.scb.phone.data.network.p034di.easycash.EasycashServiceModule;
import com.scb.phone.data.network.service.EasycashService;
import com.scb.phone.view.activity.bscanc.MyQRCoachMarkActivity;
import com.scb.phone.view.activity.investment.onboarding.FundAppFormActivity;
import p040o.C7475st;
import p040o.writeUInt64NoTag;

/* renamed from: o.d */
public final class C4224d implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashService> {
    private final EasycashServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.d$b */
    public final /* synthetic */ class C4228b implements FundAppFormActivity.write {
        private final /* synthetic */ FundAppFormActivity MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ C4228b(FundAppFormActivity fundAppFormActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fundAppFormActivity;
        }

        public final Fragment MediaBrowserCompat$ItemReceiver() {
            return FundAppFormActivity.MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    /* renamed from: o.d$c */
    public final /* synthetic */ class C4229c implements FundAppFormActivity.write {
        private final /* synthetic */ FundAppFormActivity write;

        public /* synthetic */ C4229c(FundAppFormActivity fundAppFormActivity) {
            this.write = fundAppFormActivity;
        }

        public final Fragment MediaBrowserCompat$ItemReceiver() {
            return FundAppFormActivity.m2943x50fd9e4a();
        }
    }

    /* renamed from: o.d$d */
    public final /* synthetic */ class C4230d implements FundAppFormActivity.write {
        public /* synthetic */ C4230d(FundAppFormActivity fundAppFormActivity) {
        }

        public final Fragment MediaBrowserCompat$ItemReceiver() {
            return FundAppFormActivity.setMenu();
        }
    }

    /* renamed from: o.d$e */
    public final /* synthetic */ class C4231e implements FundAppFormActivity.write {
        private final /* synthetic */ FundAppFormActivity MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C4231e(FundAppFormActivity fundAppFormActivity) {
            this.MediaBrowserCompat$ItemReceiver = fundAppFormActivity;
        }

        public final Fragment MediaBrowserCompat$ItemReceiver() {
            return FundAppFormActivity.MediaSessionCompat$QueueItem();
        }
    }

    private C4224d(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashServiceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static C4224d write(EasycashServiceModule easycashServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new C4224d(easycashServiceModule, hmlReviewDocumentActivity);
    }

    /* renamed from: o.d$2 */
    public final class C42272 implements MileageQuantitySelectionActivity<MyQRCoachMarkActivity> {
        public static void MediaBrowserCompat$CustomActionResultReceiver(MyQRCoachMarkActivity myQRCoachMarkActivity, FirebaseInstanceId firebaseInstanceId) {
            myQRCoachMarkActivity.presenter = firebaseInstanceId;
        }
    }

    public final /* synthetic */ Object get() {
        EasycashService MediaSessionCompat$QueueItem = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaSessionCompat$QueueItem != null) {
            return MediaSessionCompat$QueueItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: o.d$a */
    public final /* synthetic */ class C4226a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ C7475st.write MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C4226a(C7475st.write write) {
            this.MediaBrowserCompat$ItemReceiver = write;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver) obj).write(C7475st.this.write.MediaBrowserCompat$MediaItem);
        }
    }
}

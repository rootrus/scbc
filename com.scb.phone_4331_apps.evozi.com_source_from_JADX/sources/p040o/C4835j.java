package p040o;

import com.scb.phone.view.activity.bulktransfer.BulkTransferActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferInputActivity;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.j */
public final /* synthetic */ class C4835j implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CrashlyticsBackgroundWorker.C32131 IconCompatParcelizer;

    public /* synthetic */ C4835j(CrashlyticsBackgroundWorker.C32131 r1) {
        this.IconCompatParcelizer = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.Keep) obj).IconCompatParcelizer(this.IconCompatParcelizer);
    }

    /* renamed from: o.j$a */
    public final class C4840a implements MileageQuantitySelectionActivity<BulkTransferActivity> {
        public static void IconCompatParcelizer(BulkTransferActivity bulkTransferActivity, withFisError withfiserror) {
            bulkTransferActivity.bulkTransferPresenter = withfiserror;
        }
    }

    /* renamed from: o.j$6 */
    public final class C48396 implements MileageQuantitySelectionActivity<BulkTransferInputActivity> {
        public static void MediaBrowserCompat$CustomActionResultReceiver(BulkTransferInputActivity bulkTransferInputActivity, withRegisteredFid withregisteredfid) {
            bulkTransferInputActivity.bulkTransferInputPresenter = withregisteredfid;
        }
    }
}

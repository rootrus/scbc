package p040o;

import com.scb.phone.view.activity.deeplink.RemittanceRetryDeepLinkActivity;
import com.scb.phone.view.activity.deeplink.RemittanceTransactionsDeepLinkActivity;
import p040o.setDomain;
import p040o.writeUInt64NoTag;
import p040o.zzcz;

/* renamed from: o.af */
public final /* synthetic */ class C4017af implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzcz.zzg read;
    private final /* synthetic */ setDomain.write write;

    public /* synthetic */ C4017af(setDomain.write write2, zzcz.zzg zzg) {
        this.write = write2;
        this.read = zzg;
    }

    /* renamed from: o.af$a */
    public final class C4018a implements MileageQuantitySelectionActivity<RemittanceTransactionsDeepLinkActivity> {
        public static void IconCompatParcelizer(RemittanceTransactionsDeepLinkActivity remittanceTransactionsDeepLinkActivity, IsEdgeConfident isEdgeConfident) {
            remittanceTransactionsDeepLinkActivity.presenter = isEdgeConfident;
        }
    }

    /* renamed from: o.af$b */
    public final class C4019b implements MileageQuantitySelectionActivity<RemittanceRetryDeepLinkActivity> {
        public static void read(RemittanceRetryDeepLinkActivity remittanceRetryDeepLinkActivity, isTargetRectangleFilled istargetrectanglefilled) {
            remittanceRetryDeepLinkActivity.presenter = istargetrectanglefilled;
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        setDomain.write write2 = this.write;
        ((ExtractionParameters_Factory) obj).MediaBrowserCompat$ItemReceiver(setDomain.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read));
    }
}

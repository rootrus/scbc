package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.PerformanceTracker;
import p040o.zzbc;

/* renamed from: o.isAtLeastHoneycombMR1 */
public final /* synthetic */ class isAtLeastHoneycombMR1 implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write IconCompatParcelizer;

    public /* synthetic */ isAtLeastHoneycombMR1(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.IconCompatParcelizer = write;
    }

    public final Object write(Object obj) {
        PerformanceTracker.C37281 r8 = (PerformanceTracker.C37281) ((SingleDataEntity) obj).getData();
        return DebitCardResetOtpActivity.just(new zzbc.zzf(r8.IconCompatParcelizer, r8.MediaBrowserCompat$ItemReceiver, r8.read, r8.MediaBrowserCompat$CustomActionResultReceiver, r8.write));
    }
}

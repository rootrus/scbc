package p040o;

import android.database.sqlite.SQLiteDatabase;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindSMELandingFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6754x1472f97a extends CheckEligibilityActivity implements FundActionsSuccessActivity<Boolean> {
    private /* synthetic */ long MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FragmentBuilder_BindSMELandingFragment read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6754x1472f97a(FragmentBuilder_BindSMELandingFragment fragmentBuilder_BindSMELandingFragment, long j) {
        super(0);
        this.read = fragmentBuilder_BindSMELandingFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
    }

    public final /* synthetic */ Object invoke() {
        SQLiteDatabase write = this.read.MediaBrowserCompat$ItemReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("_id = ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        int delete = write.delete("offline_requests", sb.toString(), (String[]) null);
        if (delete == 0) {
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Offline interaction not found for delete. ID: ");
            sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
        }
        return Boolean.valueOf(delete != 0);
    }
}

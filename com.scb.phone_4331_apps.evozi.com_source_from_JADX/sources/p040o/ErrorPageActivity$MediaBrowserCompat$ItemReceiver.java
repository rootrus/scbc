package p040o;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: o.ErrorPageActivity$MediaBrowserCompat$ItemReceiver */
final class ErrorPageActivity$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<Boolean> {
    private /* synthetic */ SQLiteDatabase MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ ErrorPageActivity MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ErrorPageActivity$MediaBrowserCompat$ItemReceiver(SQLiteDatabase sQLiteDatabase, ErrorPageActivity errorPageActivity) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = sQLiteDatabase;
        this.MediaBrowserCompat$ItemReceiver = errorPageActivity;
    }

    public final /* synthetic */ Object invoke() {
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_START, 2, 3);
        ErrorPageActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
        ErrorPageActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver);
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_STOP, 2, 3);
        return Boolean.TRUE;
    }
}

package p040o;

import android.database.Cursor;

/* renamed from: o.closeTutorial$MediaBrowserCompat$ItemReceiver */
public final class closeTutorial$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<Cursor> {
    private /* synthetic */ Cursor write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public closeTutorial$MediaBrowserCompat$ItemReceiver(Cursor cursor) {
        super(0);
        this.write = cursor;
    }

    public final /* synthetic */ Object invoke() {
        if (this.write.moveToNext()) {
            return this.write;
        }
        return null;
    }
}

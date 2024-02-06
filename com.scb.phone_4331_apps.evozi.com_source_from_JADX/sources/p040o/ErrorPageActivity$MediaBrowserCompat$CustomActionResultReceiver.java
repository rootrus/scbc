package p040o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.util.Map;

/* renamed from: o.ErrorPageActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class ErrorPageActivity$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<SQLiteDatabase, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ Map IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ErrorPageActivity$MediaBrowserCompat$CustomActionResultReceiver(Map map) {
        super(1);
        this.IconCompatParcelizer = map;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        onGetStartedClick.write((Object) sQLiteDatabase, "transaction");
        for (Map.Entry entry : this.IconCompatParcelizer.entrySet()) {
            sQLiteDatabase.update("offline_requests", (ContentValues) entry.getValue(), "_id = ?", new String[]{String.valueOf(((Number) entry.getKey()).intValue())});
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}

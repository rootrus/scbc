package p040o;

import android.database.Cursor;
import com.thunderhead.android.infrastructure.server.requests.BaseRequest;

/* renamed from: o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$MediaItem */
final class ErrorPageActivity_ViewBinding$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundActionsSuccessActivity<BaseRequest> {
    private /* synthetic */ Cursor read;
    private /* synthetic */ ErrorPageActivity_ViewBinding write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ErrorPageActivity_ViewBinding$MediaBrowserCompat$MediaItem(ErrorPageActivity_ViewBinding errorPageActivity_ViewBinding, Cursor cursor) {
        super(0);
        this.write = errorPageActivity_ViewBinding;
        this.read = cursor;
    }

    public final /* synthetic */ Object invoke() {
        Cursor cursor = this.read;
        String string = cursor.getString(cursor.getColumnIndex("request"));
        CharSequence charSequence = string;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return (BaseRequest) this.write.MediaBrowserCompat$ItemReceiver.fromJson(string, BaseRequest.class);
    }
}

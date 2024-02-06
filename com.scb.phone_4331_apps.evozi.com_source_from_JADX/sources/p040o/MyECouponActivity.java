package p040o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.MyECouponActivity */
public final class MyECouponActivity extends ECouponDetailActivity_ViewBinding implements EditRecipientActivity {
    public MyECouponActivity(Context context) {
        super(context);
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) {
        String str2 = (String) write(new DeejungTransferLandingActivity_ViewBinding(str));
        return str2 == null ? "" : str2;
    }

    static /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(String str, SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return "";
        }
    }

    public final boolean read(String str) {
        Boolean bool = (Boolean) write(new TempLimitReviewActivity(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    static /* synthetic */ Boolean IconCompatParcelizer(String str, SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return Boolean.FALSE;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        MediaBrowserCompat$CustomActionResultReceiver(str2, str);
    }

    public final void read(String str, boolean z) {
        write(z, str);
    }
}

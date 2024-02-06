package p040o;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: o.BaseReviewActivity */
public final class BaseReviewActivity implements BasePartialSearchActivity_ViewBinding {
    private final SharedPreferences write;

    public BaseReviewActivity(Context context) {
        this.write = context != null ? context.getSharedPreferences("thunderhead_sdk", 0) : null;
    }

    public final Object write(String str, boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        try {
            SharedPreferences sharedPreferences = this.write;
            if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putBoolean = edit.putBoolean(str, z)) == null || Boolean.valueOf(putBoolean.commit()) == null) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final Object MediaBrowserCompat$ItemReceiver(String str, boolean z) {
        SharedPreferences sharedPreferences = this.write;
        if (sharedPreferences != null) {
            z = sharedPreferences.getBoolean(str, false);
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_QUERY);
        }
        return Boolean.valueOf(z);
    }

    public final Object read(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        try {
            SharedPreferences sharedPreferences = this.write;
            if (sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString(str, str2)) == null || Boolean.valueOf(putString.commit()) == null) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final Object MediaBrowserCompat$ItemReceiver(String str, String str2) {
        SharedPreferences sharedPreferences = this.write;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, str2);
            if (string != null) {
                return string;
            }
            return str2;
        }
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_QUERY);
        return str2;
    }
}

package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import java.util.List;
import p040o.SupportStreetViewPanoramaFragment;

/* renamed from: o.FragmentBuilder_BindNdidInstructionFragment */
public final class FragmentBuilder_BindNdidInstructionFragment implements FragmentBuilder_BindNdidSelectIdpFragment {

    /* renamed from: o.FragmentBuilder_BindNdidInstructionFragment$write */
    public static final class write extends TypeToken<List<? extends ClientCredentials>> {
    }

    public final Object IconCompatParcelizer(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("thunderhead", 0);
        if (sharedPreferences.contains("one-credentials-list-preference")) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressReviewFragment.VERSION_5_CREDENTIALS_FOUND, new Object[0]);
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("thunderhead_sdk", 0);
            onGetStartedClick.IconCompatParcelizer((Object) sharedPreferences, "version5Preferences");
            Object obj = null;
            try {
                obj = onClearClick.IconCompatParcelizer.fromJson(sharedPreferences.getString("one-credentials-list-preference", (String) null), new write().getType());
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
            List list = (List) obj;
            onGetStartedClick.IconCompatParcelizer((Object) sharedPreferences2, "version6Preferences");
            try {
                SharedPreferences.Editor edit = sharedPreferences2.edit();
                edit.putString("credentials-list", onClearClick.IconCompatParcelizer.toJson((Object) list));
                edit.commit();
            } catch (Exception e2) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e2);
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressReviewFragment.VERSION_5_CREDENTIALS_MIGRATED, new Object[0]);
            sharedPreferences.edit().remove("one-credentials-list-preference").apply();
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressReviewFragment.VERSION_5_CREDENTIALS_REMOVED, new Object[0]);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.FragmentBuilder_BindNdidInstructionFragment$read */
    public static final class read implements HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver {
        private FragmentBuilder_BindTransferInputAmountFragment write;

        private read() {
        }

        @HmlPinActivity
        public read(FragmentBuilder_BindTransferInputAmountFragment fragmentBuilder_BindTransferInputAmountFragment) {
            this.write = fragmentBuilder_BindTransferInputAmountFragment;
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
            DeepLinkSpec deepLinkSpec = (DeepLinkSpec) new Gson().fromJson(str, DeepLinkSpec.class);
            SupportStreetViewPanoramaFragment.zza write2 = SupportStreetViewPanoramaFragment.zza.write();
            write2.MediaBrowserCompat$MediaItem = deepLinkSpec.MediaDescriptionCompat;
            write2.MediaBrowserCompat$CustomActionResultReceiver = deepLinkSpec.IconCompatParcelizer;
            write2.write = deepLinkSpec.MediaBrowserCompat$CustomActionResultReceiver;
            write2.read = deepLinkSpec.write;
            write2.MediaBrowserCompat$ItemReceiver = deepLinkSpec.read;
            write2.IconCompatParcelizer = deepLinkSpec.MediaBrowserCompat$ItemReceiver;
            return DebitCardResetOtpActivity.just(write2);
        }
    }
}

package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5618xd52f00f9;
import com.scb.phone.view.activity.hml.HmlNTBManageEmailVerificationActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setTapText;

public class HmlNTBVerifyEmailFragment extends HmlVerifyEmailFragment {
    public static HmlNTBVerifyEmailFragment IconCompatParcelizer() {
        return new HmlNTBVerifyEmailFragment();
    }

    public final void IconCompatParcelizer(String str, String str2, String str3) {
        MediaBrowserCompat$ItemReceiver(getString(R.string.hml_manage_email_verification_sent));
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "ntb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_email_verify_OTP", zsyr2kArr);
        }
        C5618xd52f00f9 hmlNTBManageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBManageEmailVerificationActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) str, "uuid");
        onGetStartedClick.write((Object) str2, "refId");
        onGetStartedClick.write((Object) str3, Scopes.EMAIL);
        Intent intent = new Intent(requireContext, HmlNTBManageEmailVerificationActivity.class);
        intent.putExtra("EXTRA_UUID", str);
        intent.putExtra("EXTRA_REFID", str2);
        intent.putExtra("EXTRA_EMAIL", str3);
        intent.putExtra("EXTRA_FLOW", true);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

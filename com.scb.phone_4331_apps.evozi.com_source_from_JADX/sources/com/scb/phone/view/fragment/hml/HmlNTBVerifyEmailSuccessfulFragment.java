package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzct;

public class HmlNTBVerifyEmailSuccessfulFragment extends HmlVerifyEmailSuccessfulFragment {
    /* access modifiers changed from: protected */
    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return "ntb";
    }

    public static HmlNTBVerifyEmailSuccessfulFragment read(String str) {
        HmlNTBVerifyEmailSuccessfulFragment hmlNTBVerifyEmailSuccessfulFragment = new HmlNTBVerifyEmailSuccessfulFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EMAIL", str);
        hmlNTBVerifyEmailSuccessfulFragment.setArguments(bundle);
        return hmlNTBVerifyEmailSuccessfulFragment;
    }

    public final void IconCompatParcelizer(zzct.zza zza) {
        if (getContext() != null) {
            HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlNTBLoanSetupActivity.MediaBrowserCompat$SearchResultReceiver;
            Context context = getContext();
            onGetStartedClick.write((Object) context, "ctx");
            Intent intent = new Intent(context, HmlNTBLoanSetupActivity.class);
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
}

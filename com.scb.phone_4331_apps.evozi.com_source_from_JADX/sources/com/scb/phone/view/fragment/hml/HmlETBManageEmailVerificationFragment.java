package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlVerifyEmailSuccessfulActivity;
import com.scb.phone.view.fragment.emailverification.ManageEmailVerificationFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlETBManageEmailVerificationFragment extends ManageEmailVerificationFragment {
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.enterOtpMessage.setText(getString(R.string.hml_manage_email_verification_input));
        MediaBrowserCompat$SearchResultReceiver(getString(R.string.hml_manage_email_verification_didnt_receive));
        return onCreateView;
    }

    public final void read(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        onGetStartedClick.write((Object) str2, "uuid");
        onGetStartedClick.write((Object) str3, "refCode");
        this.refCodeTextView.setText(getString(R.string.hml_manage_email_veriication_ref, str3));
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(getString(R.string.hml_manage_email_verification_sent));
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        Intent write = HmlVerifyEmailSuccessfulActivity.write(getContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

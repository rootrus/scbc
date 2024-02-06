package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlNTBVerifyEmailSuccessfulActivity;
import com.scb.phone.view.fragment.emailverification.ManageEmailVerificationFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBManageEmailVerificationFragment extends ManageEmailVerificationFragment {
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

    public final void read(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(getString(R.string.hml_manage_email_verification_sent));
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        Intent IconCompatParcelizer = HmlNTBVerifyEmailSuccessfulActivity.IconCompatParcelizer(getContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

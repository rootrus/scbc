package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.businessowner.C5624xf154595d;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerLoanSetupActivity;
import com.scb.phone.view.fragment.hml.HmlOutcomeApproveFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlBusinessOwnerOutcomeApproveFragment extends HmlOutcomeApproveFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ImageView imageView = this.amountIcon;
        onGetStartedClick.IconCompatParcelizer((Object) imageView, "amountIcon");
        imageView.setVisibility(8);
        return onCreateView;
    }

    public final void read() {
        Context context = getContext();
        if (context != null) {
            C5624xf154595d hmlBusinessOwnerLoanSetupActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOwnerLoanSetupActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "ctx");
            Intent intent = new Intent(context, HmlBusinessOwnerLoanSetupActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

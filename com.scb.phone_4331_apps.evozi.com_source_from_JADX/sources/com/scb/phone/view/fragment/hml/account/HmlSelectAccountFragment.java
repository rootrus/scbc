package com.scb.phone.view.fragment.hml.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.view.activity.hml.C5612xf9bffa7e;
import com.scb.phone.view.activity.hml.HmlNTBAccountConsentActivity;
import com.scb.phone.view.fragment.ntb.selectaccount.SelectAccountFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setDisplayVersion;
import p040o.setTapText;

public final class HmlSelectAccountFragment extends SelectAccountFragment {
    public static final C6011xf9bd9c67 IconCompatParcelizer = new C6011xf9bd9c67((byte) 0);
    @BindView
    public TextView remark2Label;
    @BindView
    public TextView remark3Label;

    public final String AbsActionBarView() {
        return "your_loan";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        TextView textView = this.remark2Label;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark2Label");
        }
        textView.setVisibility(8);
        TextView textView2 = this.remark3Label;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark3Label");
        }
        textView2.setVisibility(8);
        return onCreateView;
    }

    public final void write(setDisplayVersion setdisplayversion, int i, String str) {
        onGetStartedClick.write((Object) setdisplayversion, "display");
        onGetStartedClick.write((Object) str, "objectiveCode");
        C5612xf9bffa7e hmlNTBAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBAccountConsentActivity.MediaDescriptionCompat;
        Context requireContext = requireContext();
        String str2 = setdisplayversion.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) str2, "display.code");
        onGetStartedClick.write((Object) str2, "depositProductCode");
        onGetStartedClick.write((Object) str, "objectiveCode");
        Intent putExtra = new Intent(requireContext, HmlNTBAccountConsentActivity.class).putExtra("BUNDLE_OBJECTIVE_ID", str).putExtra("BUNDLE_PRODUCT_CODE", str2);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(ctx, HmlNTBAccoun…CODE, depositProductCode)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        setSplitBackground();
    }
}

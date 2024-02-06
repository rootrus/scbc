package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.businessowner.C5627xaa70db4c;
import com.scb.phone.view.activity.hml.businessowner.HmlNTBBusinessOwnerGuidelinesActivity;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBBusinessURLInfoFragment extends HmlBusinessURLInfoFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void read() {
        C5627xaa70db4c hmlNTBBusinessOwnerGuidelinesActivity$MediaBrowserCompat$ItemReceiver = HmlNTBBusinessOwnerGuidelinesActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "this.requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBBusinessOwnerGuidelinesActivity.class);
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

    public final void write() {
        ProgressStateBar progressStateBar = this.breadcrumbs;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar.setVisibility(0);
        ProgressStateBar progressStateBar2 = this.breadcrumbs;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        String[] stringArray = getResources().getStringArray(R.array.f64692130903048);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…mbs_business_profile_ntb)");
        progressStateBar2.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
        ProgressStateBar progressStateBar3 = this.breadcrumbs;
        if (progressStateBar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar3.setCurrentState(2);
    }
}

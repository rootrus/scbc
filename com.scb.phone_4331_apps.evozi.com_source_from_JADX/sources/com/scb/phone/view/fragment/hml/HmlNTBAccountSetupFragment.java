package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanReviewActivity;
import com.scb.phone.view.activity.hml.HmlNTBRepaymentMethodAboutActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CrashlyticsController;
import p040o.KloVersion;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBAccountSetupFragment extends HmlBaseAccountSetupFragment<KloVersion> {
    public static final C5992x12914c22 MediaBrowserCompat$CustomActionResultReceiver = new C5992x12914c22((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final String write() {
        return "ntb";
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.C322317 r5) {
        onGetStartedClick.write((Object) r5, "display");
        HmlNTBLoanReviewActivity.write write = HmlNTBLoanReviewActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) r5, "detailsDisplay");
        Intent putExtra = new Intent(requireContext, HmlNTBLoanReviewActivity.class).putExtra("EXTRA_DISPLAY_INFO", r5);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(\n                …LAY_INFO, detailsDisplay)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$ItemReceiver = HmlNTBRepaymentMethodAboutActivity.MediaBrowserCompat$ItemReceiver(context);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

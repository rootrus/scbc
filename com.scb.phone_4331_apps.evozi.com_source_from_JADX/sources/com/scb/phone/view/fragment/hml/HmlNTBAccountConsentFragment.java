package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlVerifyPhoneTermsConditionsActivity;
import com.scb.phone.view.activity.hml.fatca.HmlNTBAccountSuccessActivity;
import com.scb.phone.view.fragment.ntb.selectaccount.ProductTermConditionFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getFiles;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBAccountConsentFragment extends ProductTermConditionFragment {
    public static final read IconCompatParcelizer = new read((byte) 0);

    public final String MediaBrowserCompat$ItemReceiver() {
        return "your_loan";
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "ntb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_consent", zsyr2kArr);
        }
        Intent IconCompatParcelizer2 = HmlVerifyPhoneTermsConditionsActivity.IconCompatParcelizer(requireContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer2, 1234);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1234 && i2 == -1) {
            this.productTermConditionPresenter.read(intent != null ? (getFiles) intent.getParcelableExtra("com.scb.phone.EXTRA_DISPLAY") : null);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getFiles getfiles) {
        onGetStartedClick.write((Object) getfiles, "display");
        HmlNTBAccountSuccessActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBAccountSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) getfiles, "display");
        Intent intent = new Intent(requireContext, HmlNTBAccountSuccessActivity.class);
        intent.putExtra("com.scb.phone.view.activity.ntb.EkycSuccessActivity.EXTRA_CONFIRMATION_DISPLAY", getfiles);
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

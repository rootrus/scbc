package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerAccountSetupActivity;
import com.scb.phone.view.fragment.hml.HmlETBLoanSetupFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlBusinessOwnerLoanSetupFragment extends HmlETBLoanSetupFragment {
    public static final read IconCompatParcelizer = new read((byte) 0);

    public final int MediaBrowserCompat$SearchResultReceiver() {
        return R.string.hml_business_owner_loan_setup_step_3;
    }

    public final int RatingCompat() {
        return R.string.hml_business_owner_loan_setup_step_2;
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

    public final void write() {
        HmlBusinessOwnerAccountSetupActivity.read read2 = HmlBusinessOwnerAccountSetupActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlBusinessOwnerAccountSetupActivity.class);
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

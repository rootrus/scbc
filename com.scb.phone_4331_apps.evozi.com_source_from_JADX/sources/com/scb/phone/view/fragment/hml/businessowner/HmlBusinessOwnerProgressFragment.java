package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.hml.HmlBaseOfflineSuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.finalizeSessions;
import p040o.generatePropertyInfo;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlBusinessOwnerProgressFragment extends HmlBaseOfflineSuccessFragment {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);

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

    public final void MediaBrowserCompat$ItemReceiver(finalizeSessions finalizesessions) {
        onGetStartedClick.write((Object) finalizesessions, "display");
        super.MediaBrowserCompat$ItemReceiver(finalizesessions);
        TextView textView = this.successTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("successTitle");
        }
        textView.setText(getString(R.string.hml_business_owner_progress_success_title));
        TextView textView2 = this.loanInfo;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfo");
        }
        textView2.setText(getString(R.string.hml_business_owner_progress_loan_info));
        TextView textView3 = this.remarkInfo;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkInfo");
        }
        textView3.setText(getString(R.string.hml_business_owner_progress_remark_info));
        TextView textView4 = this.registerRemarks;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("registerRemarks");
        }
        textView4.setVisibility(8);
        Button button = this.registerBtn;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("registerBtn");
        }
        button.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer(getContext());
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

    @OnClick
    public final void onHomeClick() {
        generatePropertyInfo generatepropertyinfo = this.presenter;
        if (generatepropertyinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = generatePropertyInfo.write.write;
        if (generatepropertyinfo.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(generatepropertyinfo.RatingCompat);
        }
    }
}

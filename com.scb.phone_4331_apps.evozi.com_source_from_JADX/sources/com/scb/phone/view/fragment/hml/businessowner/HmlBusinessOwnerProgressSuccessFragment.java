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

public final class HmlBusinessOwnerProgressSuccessFragment extends HmlBaseOfflineSuccessFragment {
    public static final C6017xfbbdecc7 IconCompatParcelizer = new C6017xfbbdecc7((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$ItemReceiver(finalizeSessions finalizesessions) {
        onGetStartedClick.write((Object) finalizesessions, "display");
        super.MediaBrowserCompat$ItemReceiver(finalizesessions);
        TextView textView = this.remarkInfo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkInfo");
        }
        textView.setText(getString(R.string.auto_bo_downtime_desc_1));
        TextView textView2 = this.registerRemarks;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("registerRemarks");
        }
        textView2.setVisibility(8);
        Button button = this.registerBtn;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("registerBtn");
        }
        button.setVisibility(8);
        TextView textView3 = this.loanInfo;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInfo");
        }
        textView3.setText(getString(R.string.auto_bo_downtime_transfer_header));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
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

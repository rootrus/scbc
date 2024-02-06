package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.registration.RegistrationTermsAndConsActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.finalizeSessions;
import p040o.generatePropertyInfo;
import p040o.mB$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlNTBOfflineSuccessFragment extends HmlBaseOfflineSuccessFragment {
    public static final C5999xad3eef32 IconCompatParcelizer = new C5999xad3eef32((byte) 0);

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
        textView.setText(getString(R.string.hml_offline_success_remark_ntb));
        Button button = this.homeBtn;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("homeBtn");
        }
        button.setVisibility(8);
    }

    public final void read() {
        RegistrationTermsAndConsActivity.write write = RegistrationTermsAndConsActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent read = RegistrationTermsAndConsActivity.write.read(requireContext, mB$MediaBrowserCompat$ItemReceiver.EASYAPP);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        setSplitBackground();
    }

    @OnClick
    public final void onRegisterClick() {
        generatePropertyInfo generatepropertyinfo = this.presenter;
        if (generatepropertyinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new generatePropertyInfo.IconCompatParcelizer(generatepropertyinfo);
        if (generatepropertyinfo.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(generatepropertyinfo.RatingCompat);
        }
    }
}

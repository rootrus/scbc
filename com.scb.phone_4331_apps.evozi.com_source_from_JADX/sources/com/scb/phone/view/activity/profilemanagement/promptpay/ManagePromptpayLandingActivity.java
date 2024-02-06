package com.scb.phone.view.activity.profilemanagement.promptpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.profilemanagement.promptpay.ManagePromptpayLandingFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C3948x247a92ae;
import p040o.MyECouponActivity_ViewBinding;
import p040o.VideoPlayerCameraPlayer;
import p040o.getKernelIDDstIn;
import p040o.setTapText;

public class ManagePromptpayLandingActivity extends BaseActivityWithFragment {
    private ManagePromptpayLandingFragment MediaBrowserCompat$SearchResultReceiver;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent addFlags = new Intent(context, ManagePromptpayLandingActivity.class).addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, addFlags).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context) {
        Intent intent = new Intent(context, ManagePromptpayLandingActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new getKernelIDDstIn().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "managepromptpay_landing");
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        super.onResume();
        ManagePromptpayLandingFragment managePromptpayLandingFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (managePromptpayLandingFragment != null) {
            VideoPlayerCameraPlayer.C3947c cVar = managePromptpayLandingFragment.managePromptpayLandingPresenter;
            if (cVar.RatingCompat != null) {
                cVar.RatingCompat.AlertController$RecycleListView();
            }
            cVar.IconCompatParcelizer.read();
            cVar.IconCompatParcelizer.IconCompatParcelizer(new C3948x247a92ae(cVar, (byte) 0));
        }
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof ManagePromptpayLandingFragment) {
            this.MediaBrowserCompat$SearchResultReceiver = (ManagePromptpayLandingFragment) fragment;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return ManagePromptpayLandingFragment.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final String au_() {
        return getString(R.string.manage_scb_promptpay_landing_title);
    }
}

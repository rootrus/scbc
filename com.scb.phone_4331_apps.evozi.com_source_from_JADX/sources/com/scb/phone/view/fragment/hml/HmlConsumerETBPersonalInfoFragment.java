package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.HmlConsumerEmailAboutActivity;
import com.scb.phone.view.activity.hml.HmlConsumerEmailAboutActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlOccupationInfoActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CustomAdvertisingIdClient;
import p040o.HmlPinActivity;
import p040o.LookAndFeelParameters_Factory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlConsumerETBPersonalInfoFragment extends HmlETBPersonalInfoFragment {
    @HmlPinActivity
    public CustomAdvertisingIdClient<LookAndFeelParameters_Factory> consumerPresenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        CustomAdvertisingIdClient<LookAndFeelParameters_Factory> customAdvertisingIdClient = this.consumerPresenter;
        if (customAdvertisingIdClient == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consumerPresenter");
        }
        customAdvertisingIdClient.MediaBrowserCompat$ItemReceiver(this);
        CustomAdvertisingIdClient<LookAndFeelParameters_Factory> customAdvertisingIdClient2 = this.consumerPresenter;
        if (customAdvertisingIdClient2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consumerPresenter");
        }
        MediaBrowserCompat$CustomActionResultReceiver(customAdvertisingIdClient2);
        this.tvETBExpiryDateTitle.setVisibility(0);
        this.baseExpiredDate.setVisibility(0);
        this.laserIdInput.setLaserIdButtonVisibility(false);
        CustomAdvertisingIdClient<LookAndFeelParameters_Factory> customAdvertisingIdClient3 = this.consumerPresenter;
        if (customAdvertisingIdClient3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consumerPresenter");
        }
        customAdvertisingIdClient3.MediaBrowserCompat$CustomActionResultReceiver();
        return onCreateView;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Context context = getContext();
        if (context != null) {
            Intent read = HmlOccupationInfoActivity.read(context);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setChecked() {
        Intent intent;
        Context context = getContext();
        if (context != null) {
            HmlConsumerEmailAboutActivity$MediaBrowserCompat$ItemReceiver hmlConsumerEmailAboutActivity$MediaBrowserCompat$ItemReceiver = HmlConsumerEmailAboutActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            intent = new Intent(context, HmlConsumerEmailAboutActivity.class);
        } else {
            intent = null;
        }
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

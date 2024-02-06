package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.activity.hml.HmlNTBLandingActivity;
import com.scb.phone.view.fragment.ntb.NtbUserInfoFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$lambda$0;
import p040o.setTapText;
import p040o.zzjx;

public class HmlUserInfoFragment extends NtbUserInfoFragment {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;

    public static HmlUserInfoFragment MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        HmlUserInfoFragment hmlUserInfoFragment = new HmlUserInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("COMES_FROM_DEMO", z);
        hmlUserInfoFragment.setArguments(bundle);
        return hmlUserInfoFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getArguments() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getArguments().getBoolean("COMES_FROM_DEMO", false);
        }
        return onCreateView;
    }

    public final void MediaBrowserCompat$ItemReceiver(List<access$lambda$0> list) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            Intent putParcelableArrayListExtra = new Intent(getContext(), NTBLandingActivity.class).putParcelableArrayListExtra("INTRODUCTION_LIST", new ArrayList(list));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    putParcelableArrayListExtra = setTapText.write(activity, putParcelableArrayListExtra).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(putParcelableArrayListExtra.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(putParcelableArrayListExtra);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            HmlNTBLandingActivity.write write2 = HmlNTBLandingActivity.MediaDescriptionCompat;
            Intent write3 = HmlNTBLandingActivity.write.write(getContext(), zzjx.zza.zzb.GENERAL);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    write3 = setTapText.write(activity2, write3).read();
                }
                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb2.append(write3.getData());
                sb2.append("\n with context ");
                sb2.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb2.toString());
                startActivity(write3);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}

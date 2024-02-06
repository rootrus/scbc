package com.scb.phone.view.fragment.wifisettings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindBaseBillersFragment;
import p040o.FragmentBuilder_BindBaseCardFragment;
import p040o.HmlETBLandingActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDDstOver;
import p040o.setTapText;

public class WifiSettingsFragment extends BaseFragment {
    private BulkTransferDeepLinkActivity IconCompatParcelizer;
    private getKernelIDDstOver MediaBrowserCompat$CustomActionResultReceiver = new getKernelIDDstOver();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90362131494263, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.wifi_title));
        getKernelIDDstOver getkerneliddstover = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_wifialert");
        }
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.wifi_title));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onWifiSettingsClick() {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
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

    public void onDestroy() {
        ay_();
        super.onDestroy();
    }

    public void onStart() {
        super.onStart();
        this.IconCompatParcelizer = DebitCardResetOtpActivity.interval(1, TimeUnit.SECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new FragmentBuilder_BindBaseBillersFragment(this), FragmentBuilder_BindBaseCardFragment.read);
    }

    public void onStop() {
        super.onStop();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.IconCompatParcelizer;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.IconCompatParcelizer.dispose();
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(WifiSettingsFragment wifiSettingsFragment) {
        if (wifiSettingsFragment.getContext() != null && AlertController$RecycleListView.RatingCompat(wifiSettingsFragment.getContext()) == 0) {
            wifiSettingsFragment.Keep();
            Intent intent = new Intent(wifiSettingsFragment.getActivity(), SplashActivity.class);
            intent.addFlags(268468224);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = wifiSettingsFragment.getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                wifiSettingsFragment.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

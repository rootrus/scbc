package com.scb.phone.view.fragment.transferandpay.transfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AppMeasurementSdk;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.KtaJsonBill;
import p040o.KtaJsonBill$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.ZSYR2K;
import p040o.access$2300;
import p040o.getAddressLine2;
import p040o.getICheckDeserializerRtti;
import p040o.getRequestInfoIncome;
import p040o.getTopLeftCornerWidth;
import p040o.onInfoWindowLongClick;

public class TransferTargetTabFragment extends BaseFragment implements getTopLeftCornerWidth.setGroupDividerEnabled {
    public getRequestInfoIncome IconCompatParcelizer;
    @BindView
    TabLayout mTabLayout;
    @BindView
    public FragmentWrapContentViewPager mTabPager;
    @HmlPinActivity
    public KtaJsonBill transferTargetTabPresenter;

    public static TransferTargetTabFragment write(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("account_extra", str);
        TransferTargetTabFragment transferTargetTabFragment = new TransferTargetTabFragment();
        transferTargetTabFragment.setArguments(bundle);
        return transferTargetTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.f90182131494245, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        this.transferTargetTabPresenter.MediaBrowserCompat$ItemReceiver(this);
        KtaJsonBill ktaJsonBill = this.transferTargetTabPresenter;
        onInfoWindowLongClick oninfowindowlongclick = ktaJsonBill.IconCompatParcelizer;
        if (oninfowindowlongclick != null) {
            str = oninfowindowlongclick.ActionMenuItemView;
        } else {
            str = "";
        }
        if (ktaJsonBill.IconCompatParcelizer != null) {
            boolean z = true;
            if (!(IGoogleMapDelegate.OWN.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(str)) || IGoogleMapDelegate.SCB.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(str)) || IGoogleMapDelegate.OTHER.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(str)))) {
                if (IGoogleMapDelegate.PROMPTPAY.equals(getICheckDeserializerRtti.MediaSessionCompat$Token(str))) {
                    ktaJsonBill.MediaBrowserCompat$CustomActionResultReceiver(1);
                } else {
                    getAddressLine2 getaddressline2 = getAddressLine2.MediaBrowserCompat$CustomActionResultReceiver;
                    if (ktaJsonBill.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getaddressline2.IconCompatParcelizer(ktaJsonBill.RatingCompat);
                    }
                }
                KtaJsonBill ktaJsonBill2 = this.transferTargetTabPresenter;
                String stackedBackground = setStackedBackground();
                ktaJsonBill2.read.read.MediaMetadataCompat();
                AppMeasurementSdk.OnEventListener onEventListener = ktaJsonBill2.read;
                onEventListener.write(onEventListener.read.MediaBrowserCompat$ItemReceiver(stackedBackground), new KtaJsonBill$MediaBrowserCompat$CustomActionResultReceiver(ktaJsonBill2, (byte) 0));
                return inflate;
            }
        }
        ktaJsonBill.MediaBrowserCompat$CustomActionResultReceiver(0);
        KtaJsonBill ktaJsonBill22 = this.transferTargetTabPresenter;
        String stackedBackground2 = setStackedBackground();
        ktaJsonBill22.read.read.MediaMetadataCompat();
        AppMeasurementSdk.OnEventListener onEventListener2 = ktaJsonBill22.read;
        onEventListener2.write(onEventListener2.read.MediaBrowserCompat$ItemReceiver(stackedBackground2), new KtaJsonBill$MediaBrowserCompat$CustomActionResultReceiver(ktaJsonBill22, (byte) 0));
        return inflate;
    }

    public final void IconCompatParcelizer(int i) {
        if (getArguments() != null) {
            getRequestInfoIncome getrequestinfoincome = new getRequestInfoIncome(getChildFragmentManager(), getContext());
            this.IconCompatParcelizer = getrequestinfoincome;
            this.mTabPager.setAdapter(getrequestinfoincome);
            this.mTabPager.setOffscreenPageLimit(2);
            this.mTabLayout.setupWithViewPager(this.mTabPager);
            this.mTabPager.setCurrentItem(i);
            this.mTabPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    if (i == 2) {
                        TransferTargetTabFragment transferTargetTabFragment = TransferTargetTabFragment.this;
                        ZSYR2K[] zsyr2kArr = {new ZSYR2K("tab_name", "History")};
                        if (transferTargetTabFragment.getActivity() != null) {
                            ((BaseActivity) transferTargetTabFragment.getActivity()).scbAnalytics.write("transfer_tab", zsyr2kArr);
                        }
                    }
                }
            });
        }
    }

    public final void write(int i) {
        this.mTabPager.setVisibility(4);
        this.mTabLayout.setVisibility(4);
        IconCompatParcelizer(i);
    }

    public final void write() {
        Context context = getContext();
        if (context != null) {
            context.sendBroadcast(new Intent("com.scb.phone/BROADCAST_BANK_RECEIVED"));
        }
    }

    public final void IconCompatParcelizer() {
        this.transferTargetTabPresenter.MediaBrowserCompat$ItemReceiver(R.string.operation_not_found, access$2300.write.NAVIGATE_BACK);
    }
}

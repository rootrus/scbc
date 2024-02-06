package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOtpActivity;
import com.scb.phone.view.custom.ntb.CustomInformationPanel;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.CharMatcher;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addStabilityDelayListener;
import p040o.getFlash;
import p040o.injectRttiCheckDeserializer$MediaBrowserCompat$MediaItem;
import p040o.sessionDismiss;
import p040o.setDeviceDeclinationRoll;
import p040o.setFiles;
import p040o.setTapText;
import p040o.surfaceDestroyed;

public class FundOnboardingReviewFragment extends BaseFragment implements injectRttiCheckDeserializer$MediaBrowserCompat$MediaItem {
    @BindView
    CustomInformationPanel investmentPanel;
    @BindView
    CustomInformationPanel personalPanel;
    @HmlPinActivity
    public surfaceDestroyed presenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88532131494080, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.personalPanel.setTitleBackground(R.color.f66132131099768);
        this.investmentPanel.setTitleBackground(R.color.f66132131099768);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfonboard_review");
        }
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        surfaceDestroyed surfacedestroyed = this.presenter;
        sessionDismiss sessiondismiss = sessionDismiss.read;
        if (surfacedestroyed.RatingCompat != null) {
            sessiondismiss.IconCompatParcelizer(surfacedestroyed.RatingCompat);
        }
        CharMatcher.C315914 r1 = surfacedestroyed.IconCompatParcelizer;
        r1.read(r1.write(), new addStabilityDelayListener(surfacedestroyed), new getFlash(surfacedestroyed));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onConfirmClick() {
        surfaceDestroyed surfacedestroyed = this.presenter;
        setDeviceDeclinationRoll setdevicedeclinationroll = setDeviceDeclinationRoll.MediaBrowserCompat$CustomActionResultReceiver;
        if (surfacedestroyed.RatingCompat != null) {
            setdevicedeclinationroll.IconCompatParcelizer(surfacedestroyed.RatingCompat);
        }
    }

    public final void read(List<setFiles> list) {
        this.personalPanel.setTitle(getString(R.string.mf_onboarding_review_header_personal_info));
        this.personalPanel.setInformationItemList(list);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<setFiles> list) {
        this.investmentPanel.setTitle(getString(R.string.mf_onboarding_review_header_investment_info_label));
        this.investmentPanel.setInformationItemList(list);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent MediaBrowserCompat$ItemReceiver = FundOtpActivity.MediaBrowserCompat$ItemReceiver(getActivity());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 8564);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

package com.scb.phone.view.fragment.investment.select;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bond.BondLandingActivity;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingLandingActivity;
import com.scb.phone.view.activity.investment.roboadvisor.RoboAdvisorLandingActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsLandingActivity;
import com.scb.phone.view.activity.p038tc.MutualFundTermsAndConditionsActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C7039x355e6121;
import p040o.DocumentBaseCaptureExperience_MembersInjector;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceFilter;
import p040o.Service;
import p040o.ZTPSV;
import p040o.forEachDst;
import p040o.getMicrAmount$MediaBrowserCompat$SearchResultReceiver;
import p040o.getSteadyMessage;
import p040o.inject_overlayViewInternal;
import p040o.isPageDetectionEnabled;
import p040o.onCheckBoxClick;
import p040o.setPageDetectionEnabled;
import p040o.setTapText;
import p040o.zzwi;

public class SelectInvestmentFragment extends BaseFragment implements getMicrAmount$MediaBrowserCompat$SearchResultReceiver {
    private ZTPSV IconCompatParcelizer = new ZTPSV();
    private forEachDst MediaBrowserCompat$CustomActionResultReceiver = new forEachDst();
    @BindView
    RelativeLayout debentureLayout;
    @BindView
    RelativeLayout purchaseBondDltLayout;
    @BindView
    RelativeLayout purchaseBondScbLayout;
    @HmlPinActivity
    public getSteadyMessage selectInvestmentPresenter;

    public static SelectInvestmentFragment MediaSessionCompat$QueueItem() {
        return new SelectInvestmentFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89782131494205, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.selectInvestmentPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        PlaceFilter.zzb zzb;
        PlaceFilter.zzb zzb2;
        PlaceFilter.zzb zzb3;
        super.onViewCreated(view, bundle);
        getSteadyMessage getsteadymessage = this.selectInvestmentPresenter;
        zzwi write = getsteadymessage.read.MediaBrowserCompat$ItemReceiver.write();
        boolean z3 = false;
        if (write == null || (zzb3 = write.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z = false;
        } else {
            z = zzb3.write;
        }
        getsteadymessage.write(z, setPageDetectionEnabled.read);
        zzwi write2 = getsteadymessage.MediaBrowserCompat$ItemReceiver.write.write.write();
        if (write2 == null || (zzb2 = write2.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z2 = false;
        } else {
            z2 = zzb2.Keep;
        }
        getsteadymessage.write(z2, isPageDetectionEnabled.IconCompatParcelizer);
        zzwi write3 = getsteadymessage.MediaBrowserCompat$ItemReceiver.write.write.write();
        if (!(write3 == null || (zzb = write3.MediaSessionCompat$ResultReceiverWrapper) == null)) {
            z3 = zzb.setHasDecor;
        }
        getsteadymessage.write(z3, DocumentBaseCaptureExperience_MembersInjector.MediaBrowserCompat$ItemReceiver);
    }

    public final void RatingCompat() {
        this.debentureLayout.setVisibility(0);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo38486x50fd9e4a() {
        this.purchaseBondScbLayout.setVisibility(0);
    }

    public final void MediaMetadataCompat() {
        this.purchaseBondDltLayout.setVisibility(0);
    }

    public void onDestroy() {
        super.onDestroy();
        this.selectInvestmentPresenter.onDestroy();
    }

    public final void write() {
        Intent intent = new Intent(getContext(), InvestmentDetailsActivity.class);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MutualFundTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver(getContext());
    }

    public final void read() {
        Intent intent = new Intent(getContext(), FundOnboardingLandingActivity.class);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver(Service service, C7039x355e6121.read read) {
        if (getContext() != null) {
            Intent IconCompatParcelizer2 = BondLandingActivity.IconCompatParcelizer(getContext(), service, read);
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
    }

    public final void write(String str) {
        try {
            ZTPSV ztpsv = this.IconCompatParcelizer;
            if (getActivity() != null) {
                ztpsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "debenture_web_loaded");
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("IS_NEED_HISTORY_STACK", true);
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
        } catch (ActivityNotFoundException | NullPointerException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = RoboAdvisorLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaDescriptionCompat() {
        AddAccountInfoActivity.write(getContext());
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent read = ScbsLandingActivity.read(getContext());
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

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.selectInvestmentPresenter.write((int) R.string.error_generic_resource);
    }

    public final void IconCompatParcelizer() {
        boolean z;
        if (getContext() instanceof BaseActivity) {
            if (((BaseActivity) getContext()).setGroupDividerEnabled()) {
                if (getActivity() == null || !(getActivity() instanceof BaseActivity)) {
                    z = false;
                } else {
                    z = ((BaseActivity) getActivity()).mo13022E_();
                }
                if (!z) {
                    this.selectInvestmentPresenter.MediaBrowserCompat$ItemReceiver();
                    return;
                }
            }
            Intent intent = new Intent(getContext(), PinLoginActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(intent, 1111);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            ((BaseActivity) getContext()).setSubtitle();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1111 && i2 == -1) {
            this.selectInvestmentPresenter.MediaBrowserCompat$ItemReceiver();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @OnClick
    public void onClickDebenture() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", "debenture");
        forEachDst foreachdst = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "investment_landing_bs");
        }
        getSteadyMessage getsteadymessage = this.selectInvestmentPresenter;
        getsteadymessage.write = getSteadyMessage.IconCompatParcelizer.DEBENTURE;
        inject_overlayViewInternal inject_overlayviewinternal = inject_overlayViewInternal.MediaBrowserCompat$ItemReceiver;
        if (getsteadymessage.RatingCompat != null) {
            inject_overlayviewinternal.IconCompatParcelizer(getsteadymessage.RatingCompat);
        }
    }

    @OnClick
    public void onClickMutualFund() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", "fund");
        forEachDst foreachdst = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "investment_landing_bs");
        }
        getSteadyMessage getsteadymessage = this.selectInvestmentPresenter;
        getsteadymessage.write = getSteadyMessage.IconCompatParcelizer.MUTUAL_FUND;
        inject_overlayViewInternal inject_overlayviewinternal = inject_overlayViewInternal.MediaBrowserCompat$ItemReceiver;
        if (getsteadymessage.RatingCompat != null) {
            inject_overlayviewinternal.IconCompatParcelizer(getsteadymessage.RatingCompat);
        }
    }

    @OnClick
    public void onClickPurchaseBondDlt() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", "bond");
        forEachDst foreachdst = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "investment_landing_bs");
        }
        this.selectInvestmentPresenter.read(C7039x355e6121.read.DLT);
    }

    @OnClick
    public void onClickPurchaseBondScb() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", "bond");
        forEachDst foreachdst = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "investment_landing_bs");
        }
        this.selectInvestmentPresenter.read(C7039x355e6121.read.SCB);
    }

    @OnClick
    public void onClickRoboAdvisor() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", "roboadvisor");
        forEachDst foreachdst = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "investment_landing_bs");
        }
        getSteadyMessage getsteadymessage = this.selectInvestmentPresenter;
        getsteadymessage.write = getSteadyMessage.IconCompatParcelizer.ROBO_ADVISOR;
        inject_overlayViewInternal inject_overlayviewinternal = inject_overlayViewInternal.MediaBrowserCompat$ItemReceiver;
        if (getsteadymessage.RatingCompat != null) {
            inject_overlayviewinternal.IconCompatParcelizer(getsteadymessage.RatingCompat);
        }
    }

    @OnClick
    public void onClickScbsInvestment() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read("feature", "scbsinvestment");
        forEachDst foreachdst = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "investment_landing_bs");
        }
        getSteadyMessage getsteadymessage = this.selectInvestmentPresenter;
        getsteadymessage.write = getSteadyMessage.IconCompatParcelizer.SCBS_INVESTMENT;
        inject_overlayViewInternal inject_overlayviewinternal = inject_overlayViewInternal.MediaBrowserCompat$ItemReceiver;
        if (getsteadymessage.RatingCompat != null) {
            inject_overlayviewinternal.IconCompatParcelizer(getsteadymessage.RatingCompat);
        }
    }
}

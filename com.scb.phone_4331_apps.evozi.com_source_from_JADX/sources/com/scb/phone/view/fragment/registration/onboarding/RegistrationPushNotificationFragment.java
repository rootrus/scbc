package com.scb.phone.view.fragment.registration.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeNdidNationalIdInputActivity;
import p040o.ActivityBuilder_ContributeNsipPartnerPaymentSuccessActivity;
import p040o.ActivityBuilder_ContributeNtbUserInfoActivity;
import p040o.C10046mF;
import p040o.C10048mH;
import p040o.FragmentBuilder_BindContactInfoFragment;
import p040o.HmlPinActivity;
import p040o.OnDeviceExtractionServer;
import p040o.getFaceTopPadding;
import p040o.getKernelIDDstOver;
import p040o.onCheckBoxClick;
import p040o.progressJsonDocuments;

public class RegistrationPushNotificationFragment extends BaseFragment implements getFaceTopPadding {
    private FragmentBuilder_BindContactInfoFragment IconCompatParcelizer;
    public getKernelIDDstOver MediaBrowserCompat$CustomActionResultReceiver = new getKernelIDDstOver();
    @BindView
    Button btnCancel;
    @BindView
    Button btnOk;
    @HmlPinActivity
    public OnDeviceExtractionServer.C37093 registrationPushNotificationPresenter;

    public static RegistrationPushNotificationFragment write() {
        return new RegistrationPushNotificationFragment();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNotNow() {
        OnDeviceExtractionServer.C37093 r0 = this.registrationPushNotificationPresenter;
        C10048mH mHVar = C10048mH.write;
        boolean z = true;
        if (r0.RatingCompat != null) {
            mHVar.IconCompatParcelizer(r0.RatingCompat);
        }
        OnDeviceExtractionServer onDeviceExtractionServer = OnDeviceExtractionServer.read;
        if (r0.RatingCompat == null) {
            z = false;
        }
        if (z) {
            onDeviceExtractionServer.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNotify() {
        OnDeviceExtractionServer.C37093 r0 = this.registrationPushNotificationPresenter;
        C10046mF mFVar = C10046mF.IconCompatParcelizer;
        if (r0.RatingCompat != null) {
            mFVar.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindContactInfoFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindContactInfoFragment) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89352131494162, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.registrationPushNotificationPresenter.MediaBrowserCompat$ItemReceiver(this);
        getKernelIDDstOver getkerneliddstover = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_allow_notification");
        }
        return inflate;
    }

    public void onResume() {
        super.onResume();
        OnDeviceExtractionServer.C37093 r0 = this.registrationPushNotificationPresenter;
        progressJsonDocuments progressjsondocuments = progressJsonDocuments.write;
        if (r0.RatingCompat != null) {
            progressjsondocuments.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public void onDestroy() {
        this.registrationPushNotificationPresenter.onDestroy();
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributeNtbUserInfoActivity.IconCompatParcelizer(this, i, iArr);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ActivityBuilder_ContributeNtbUserInfoActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void IconCompatParcelizer(boolean z, boolean z2) {
        this.btnCancel.setEnabled(z);
        this.btnOk.setEnabled(z2);
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public final void IconCompatParcelizer() {
        FragmentBuilder_BindContactInfoFragment fragmentBuilder_BindContactInfoFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindContactInfoFragment != null) {
            fragmentBuilder_BindContactInfoFragment.IconCompatParcelizer("RegistrationPushNotificationFragment");
        }
    }

    public final void read() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.onboarding_registration_title_push_permission).IconCompatParcelizer((int) R.string.onboarding_registration_sub_title_push_permission);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.onboarding_registration_allow_permission), new ActivityBuilder_ContributeNdidNationalIdInputActivity(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.onboarding_registration_dont_allow_permission), new ActivityBuilder_ContributeNsipPartnerPaymentSuccessActivity(this)).show();
    }
}

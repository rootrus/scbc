package com.scb.phone.view.fragment.registration.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeNationalIdCameraActivity;
import p040o.ActivityBuilder_ContributeNdidLandingActivity;
import p040o.C10050mM;
import p040o.C10051mN;
import p040o.FragmentBuilder_BindContactInfoFragment;
import p040o.HmlPinActivity;
import p040o.OnDeviceExtractionServer;
import p040o.getFaceLeftPadding;
import p040o.getKernelIDDstOver;
import p040o.getRegistrationsAddresses;

public class RegistrationEmailSetupFragment extends BaseFragment implements getFaceLeftPadding {
    public getKernelIDDstOver IconCompatParcelizer = new getKernelIDDstOver();
    public CustomInputDialog MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindContactInfoFragment MediaDescriptionCompat;
    @HmlPinActivity
    public OnDeviceExtractionServer.C37061 registrationEmailSetupPresenter;

    public static RegistrationEmailSetupFragment write() {
        return new RegistrationEmailSetupFragment();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNotNow() {
        OnDeviceExtractionServer.C37061 r0 = this.registrationEmailSetupPresenter;
        C10051mN mNVar = C10051mN.MediaBrowserCompat$ItemReceiver;
        if (r0.RatingCompat != null) {
            mNVar.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSetupEmail() {
        OnDeviceExtractionServer.C37061 r0 = this.registrationEmailSetupPresenter;
        C10050mM mMVar = C10050mM.write;
        if (r0.RatingCompat != null) {
            mMVar.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindContactInfoFragment) {
            this.MediaDescriptionCompat = (FragmentBuilder_BindContactInfoFragment) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89312131494158, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.registrationEmailSetupPresenter.MediaBrowserCompat$ItemReceiver(this);
        getKernelIDDstOver getkerneliddstover = this.IconCompatParcelizer;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_set_email");
        }
        return inflate;
    }

    public void onDestroy() {
        this.registrationEmailSetupPresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        String str;
        if (i == 1) {
            str = getString(R.string.onboarding_registration_email_mailinator_error);
        } else if (i != 2) {
            str = getString(R.string.onboarding_registration_email_error);
        } else {
            str = getString(R.string.onboarding_registration_email_net_error);
        }
        mo13677k_(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                RegistrationEmailSetupFragment.this.MediaBrowserCompat$CustomActionResultReceiver.mErrorTextView.setVisibility(8);
            }
        });
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        CustomInputDialog customInputDialog2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string = getString(R.string.onboarding_registration_email_dialog_title);
        if (string != null) {
            customInputDialog2.mTitleTextView.setVisibility(0);
            customInputDialog2.mTitleTextView.setText(string);
        }
        CustomInputDialog customInputDialog3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string2 = getString(R.string.onboarding_registration_email_dialog_sub_title);
        if (string2 != null) {
            customInputDialog3.mTextTextView.setVisibility(0);
            customInputDialog3.mTextTextView.setText(string2);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.setCanceledOnTouchOutside(false);
        CustomInputDialog customInputDialog4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog4.mEditTextView.setHint(getString(R.string.onboarding_registration_email_dialog_hint));
        this.MediaBrowserCompat$CustomActionResultReceiver.mEditTextView.setVisibility(0);
        CustomInputDialog customInputDialog5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        customInputDialog5.write(customInputDialog5.MediaBrowserCompat$ItemReceiver.getString(R.string.onboarding_registration_button_cancel), ActivityBuilder_ContributeNationalIdCameraActivity.MediaBrowserCompat$CustomActionResultReceiver);
        CustomInputDialog customInputDialog6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String string3 = getString(R.string.ok);
        ActivityBuilder_ContributeNdidLandingActivity activityBuilder_ContributeNdidLandingActivity = new ActivityBuilder_ContributeNdidLandingActivity(this);
        if (string3 != null) {
            customInputDialog6.mPositiveButton.setText(string3);
            customInputDialog6.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog6, activityBuilder_ContributeNdidLandingActivity, true));
        }
        customInputDialog6.show();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindContactInfoFragment fragmentBuilder_BindContactInfoFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindContactInfoFragment != null) {
            fragmentBuilder_BindContactInfoFragment.IconCompatParcelizer("RegistrationEmailSetupFragment");
        }
    }
}

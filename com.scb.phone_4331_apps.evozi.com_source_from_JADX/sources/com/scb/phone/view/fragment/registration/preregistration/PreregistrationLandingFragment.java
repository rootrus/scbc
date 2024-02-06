package com.scb.phone.view.fragment.registration.preregistration;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.registration.preregistration.PreregistrationInformationActivity;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.Locale;
import p040o.C10054mR;
import p040o.C4017af;
import p040o.C5074nv;
import p040o.HmlPinActivity;
import p040o.getKernelIDDstOver;
import p040o.onGetLayoutInflater;
import p040o.setFaceTopPadding;
import p040o.setOnCloseListener;

public class PreregistrationLandingFragment extends BaseFragment implements setFaceTopPadding {
    private setOnCloseListener IconCompatParcelizer;
    private getKernelIDDstOver MediaBrowserCompat$CustomActionResultReceiver = new getKernelIDDstOver();
    @HmlPinActivity
    public C5074nv presenter;
    @HmlPinActivity
    public SharedPreferences sharedPreferences;

    public static PreregistrationLandingFragment MediaBrowserCompat$ItemReceiver() {
        Bundle bundle = new Bundle();
        PreregistrationLandingFragment preregistrationLandingFragment = new PreregistrationLandingFragment();
        preregistrationLandingFragment.setArguments(bundle);
        return preregistrationLandingFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89002131494127, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = new setOnCloseListener(getActivity());
        getKernelIDDstOver getkerneliddstover = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_welcome");
        }
        return inflate;
    }

    @OnClick
    public void onThaiButtonClick() {
        C5074nv nvVar = this.presenter;
        C4017af.C40212 r1 = C4017af.C40212.MediaBrowserCompat$ItemReceiver;
        if (nvVar.RatingCompat != null) {
            r1.IconCompatParcelizer(nvVar.RatingCompat);
        }
    }

    @OnClick
    public void onEnglishButtonClick() {
        C5074nv nvVar = this.presenter;
        C10054mR mRVar = C10054mR.MediaBrowserCompat$ItemReceiver;
        if (nvVar.RatingCompat != null) {
            mRVar.IconCompatParcelizer(nvVar.RatingCompat);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    public final void write(String str) {
        Locale locale = new Locale(setStackedBackground());
        Locale locale2 = new Locale(str);
        if (!locale.equals(locale2)) {
            if (!str.trim().isEmpty()) {
                this.sharedPreferences.edit().putString("com.scb.phone.pref.key.LANGUAGE", str).apply();
            }
            this.IconCompatParcelizer.read(locale2);
            onGetLayoutInflater.MediaBrowserCompat$CustomActionResultReceiver(locale2.getLanguage());
        }
    }

    public final void write() {
        PreregistrationInformationActivity.write(getContext());
    }
}

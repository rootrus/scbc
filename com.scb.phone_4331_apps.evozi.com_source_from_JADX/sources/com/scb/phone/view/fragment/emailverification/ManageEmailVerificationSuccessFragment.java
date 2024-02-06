package com.scb.phone.view.fragment.emailverification;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.HmlPinActivity;
import p040o.ScriptIntrinsicBLAS;
import p040o.SelfieDetectionSettings;
import p040o.getUsable;
import p040o.setIsShadowed;

public class ManageEmailVerificationSuccessFragment extends BaseFragment implements getUsable.read {
    private C1118xc9fd465d MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public SelfieDetectionSettings emailSuccessPresenter;
    @BindView
    TextView textDateTime;
    @BindView
    TextView textSuccessTitle;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87292131493956, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setTransitioning();
        this.emailSuccessPresenter.MediaBrowserCompat$ItemReceiver(this);
        ScriptIntrinsicBLAS.Uplo uplo = new ScriptIntrinsicBLAS.Uplo();
        if (getActivity() != null) {
            uplo.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "emailverification_success");
        }
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            String string = arguments.getString("BUNDLE_EMAIL");
            String string2 = arguments.getString("BUNDLE_TRANSACTION_DATETIME");
            SelfieDetectionSettings selfieDetectionSettings = this.emailSuccessPresenter;
            setIsShadowed setisshadowed = new setIsShadowed(string, string2);
            if (selfieDetectionSettings.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setisshadowed.IconCompatParcelizer(selfieDetectionSettings.RatingCompat);
            }
        }
        return inflate;
    }

    public void onDestroy() {
        this.emailSuccessPresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        this.textSuccessTitle.setText(getString(R.string.manage_email_success_verified, str));
        this.textDateTime.setText(str2);
    }

    @OnClick
    public void onReturnHomeClick() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null && getArguments() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(getArguments().getString("BUNDLE_EMAIL"));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1118xc9fd465d) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (C1118xc9fd465d) context;
        }
    }
}

package com.scb.phone.view.fragment.easycash.landing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.getAppProcessInfo;
import p040o.getOutputDPI;
import p040o.setBoundingBox;

public class EasycashLandingEmptyFragment extends EasycashBaseLandingFragment implements CheckExtractActivity_MembersInjector.AppCompatActivity {
    @HmlPinActivity
    public getOutputDPI easycashLandingEmptyPresenter;
    @BindView
    TextView errorDescription;
    @BindView
    TextView errorText;

    public static EasycashLandingEmptyFragment MediaBrowserCompat$CustomActionResultReceiver(getAppProcessInfo getappprocessinfo, boolean z) {
        EasycashLandingEmptyFragment easycashLandingEmptyFragment = new EasycashLandingEmptyFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_EMPTY", getappprocessinfo);
        bundle.putBoolean("com.scb.phone.EXTRA_IS_BANK_CLIENT", z);
        easycashLandingEmptyFragment.setArguments(bundle);
        return easycashLandingEmptyFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.easycashLandingEmptyPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = this.easycashLandingEmptyPresenter;
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.EXTRA_EMPTY") == null)) {
            getOutputDPI getoutputdpi = this.easycashLandingEmptyPresenter;
            getAppProcessInfo getappprocessinfo = (getAppProcessInfo) getArguments().getParcelable("com.scb.phone.EXTRA_EMPTY");
            getoutputdpi.read = getArguments().getBoolean("com.scb.phone.EXTRA_IS_BANK_CLIENT");
            setBoundingBox setboundingbox = new setBoundingBox(getappprocessinfo);
            if (getoutputdpi.RatingCompat != null) {
                setboundingbox.IconCompatParcelizer(getoutputdpi.RatingCompat);
            }
            getoutputdpi.MediaBrowserCompat$CustomActionResultReceiver(getappprocessinfo.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return onCreateView;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        this.errorText.setText(str);
        this.errorDescription.setText(str2);
    }

    public void onDestroy() {
        super.onDestroy();
        this.easycashLandingEmptyPresenter.onDestroy();
    }
}

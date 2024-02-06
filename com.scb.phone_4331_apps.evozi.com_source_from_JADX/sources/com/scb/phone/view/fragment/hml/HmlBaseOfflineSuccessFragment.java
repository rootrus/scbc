package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ContactCallCenterFragment;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.PassportCaptureModule;
import p040o.finalizeSessions;
import p040o.generatePropertyInfo;
import p040o.onGetStartedClick;
import p040o.zzjx;

public abstract class HmlBaseOfflineSuccessFragment extends ContactCallCenterFragment implements PassportCaptureModule.PassportOnDeviceExtractionServer {
    @BindView
    public TextView confirmDateTime;
    @BindView
    public Button homeBtn;
    @BindView
    public TextView loanInfo;
    @HmlPinActivity
    public generatePropertyInfo presenter;
    @BindView
    public Button registerBtn;
    @BindView
    public TextView registerRemarks;
    @BindView
    public TextView remarkInfo;
    @BindView
    public TextView successTitle;

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public void read() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87972131494024, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        generatePropertyInfo generatepropertyinfo = this.presenter;
        if (generatepropertyinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        generatepropertyinfo.MediaBrowserCompat$ItemReceiver(this);
        generatePropertyInfo generatepropertyinfo2 = this.presenter;
        if (generatepropertyinfo2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        DebitCardResetOtpActivity<zzjx.zze> MediaBrowserCompat$CustomActionResultReceiver = generatepropertyinfo2.read.MediaBrowserCompat$CustomActionResultReceiver();
        if (generatepropertyinfo2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            generatepropertyinfo2.RatingCompat.AlertController$RecycleListView();
        }
        generatepropertyinfo2.read.write(MediaBrowserCompat$CustomActionResultReceiver, new generatePropertyInfo.read(generatepropertyinfo2));
        return inflate;
    }

    public void MediaBrowserCompat$ItemReceiver(finalizeSessions finalizesessions) {
        onGetStartedClick.write((Object) finalizesessions, "display");
        TextView textView = this.confirmDateTime;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmDateTime");
        }
        textView.setText(finalizesessions.MediaBrowserCompat$ItemReceiver);
    }

    @OnClick
    public final void onContactCallClick() {
        aK_();
    }

    public void onDestroyView() {
        generatePropertyInfo generatepropertyinfo = this.presenter;
        if (generatepropertyinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        generatepropertyinfo.onDestroy();
        super.onDestroyView();
    }
}

package com.scb.phone.view.activity.investment.assessment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.CrashlyticsCore;
import p040o.DeviceService;
import p040o.GetIndexFields;
import p040o.HmlPinActivity;
import p040o.KofaxWebServiceCallBase;
import p040o.buildReportData;
import p040o.getMethodName;
import p040o.getProfile;
import p040o.getProfile$MediaBrowserCompat$ItemReceiver;
import p040o.setMinimumDpi;
import p040o.updateDeviceInfo;

public class AssessmentPopupActivity extends BaseActivity implements CheckCaptureModule_GetIJsonExactionHelperKtaFactory {
    private View.OnClickListener MediaBrowserCompat$SearchResultReceiver = new setMinimumDpi(this);
    @BindView
    Button buttonNegative;
    @BindView
    Button buttonPositive;
    @BindView
    TextView firstText;
    @BindView
    TextView firstTitle;
    @HmlPinActivity
    public getProfile presenter;
    @BindView
    TextView secondText;
    @BindView
    TextView secondTitle;
    @BindView
    TextView titleText;

    public /* synthetic */ void lambda$new$0$AssessmentPopupActivity(View view) {
        int id = view.getId();
        boolean z = true;
        if (id == R.id.button_negative) {
            getProfile getprofile = this.presenter;
            if (getprofile.IconCompatParcelizer == 0) {
                DeviceService deviceService = DeviceService.MediaBrowserCompat$ItemReceiver;
                if (getprofile.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    deviceService.IconCompatParcelizer(getprofile.RatingCompat);
                    return;
                }
                return;
            }
            KofaxWebServiceCallBase kofaxWebServiceCallBase = KofaxWebServiceCallBase.MediaBrowserCompat$CustomActionResultReceiver;
            if (getprofile.RatingCompat == null) {
                z = false;
            }
            if (z) {
                kofaxWebServiceCallBase.IconCompatParcelizer(getprofile.RatingCompat);
            }
        } else if (id == R.id.button_positive) {
            getProfile getprofile2 = this.presenter;
            if (getprofile2.IconCompatParcelizer == 0) {
                updateDeviceInfo updatedeviceinfo = updateDeviceInfo.write;
                if (getprofile2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    updatedeviceinfo.IconCompatParcelizer(getprofile2.RatingCompat);
                    return;
                }
                return;
            }
            getMethodName getmethodname = getMethodName.write;
            if (getprofile2.RatingCompat != null) {
                getmethodname.IconCompatParcelizer(getprofile2.RatingCompat);
            }
            if (getprofile2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getprofile2.RatingCompat.AlertController$RecycleListView();
            }
            getprofile2.MediaBrowserCompat$ItemReceiver.write();
            getprofile2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getProfile$MediaBrowserCompat$ItemReceiver(getprofile2, (byte) 0));
        } else if (id == R.id.item_back_icon_relative_layout) {
            setResult(0, new Intent());
            finish();
        }
    }

    @OnClick
    public void onCloseClicked() {
        onBackPressed();
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, CrashlyticsCore.C32441 r3) {
        Intent intent = new Intent(context, AssessmentPopupActivity.class);
        intent.putExtra("profileExtra", r3);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76702131492895);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.titleText.setText(R.string.assessment_dialog_title);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getProfile getprofile = this.presenter;
        CrashlyticsCore.C32441 r0 = (CrashlyticsCore.C32441) getIntent().getParcelableExtra("profileExtra");
        boolean z = true;
        if (r0 != null) {
            getprofile.IconCompatParcelizer = Integer.valueOf(r0.MediaDescriptionCompat).intValue();
            GetIndexFields getIndexFields = new GetIndexFields(getprofile, r0);
            if (getprofile.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getIndexFields.IconCompatParcelizer(getprofile.RatingCompat);
            }
        } else {
            DeviceService deviceService = DeviceService.MediaBrowserCompat$ItemReceiver;
            if (getprofile.RatingCompat == null) {
                z = false;
            }
            if (z) {
                deviceService.IconCompatParcelizer(getprofile.RatingCompat);
            }
        }
        this.buttonPositive.setOnClickListener(this.MediaBrowserCompat$SearchResultReceiver);
        this.buttonNegative.setOnClickListener(this.MediaBrowserCompat$SearchResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(buildReportData buildreportdata) {
        this.firstTitle.setText(buildreportdata.MediaBrowserCompat$ItemReceiver);
        this.firstText.setText(buildreportdata.write);
        this.secondTitle.setText(buildreportdata.MediaBrowserCompat$SearchResultReceiver);
        this.secondText.setText(buildreportdata.IconCompatParcelizer);
        this.buttonPositive.setText(buildreportdata.MediaBrowserCompat$CustomActionResultReceiver);
        this.buttonNegative.setText(buildreportdata.read);
    }

    public final void read() {
        setResult(0, new Intent());
        finish();
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent();
        intent.putExtra("riskPopupResult", "selectLevel");
        setResult(-1, intent);
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent();
        intent.putExtra("riskPopupResult", "refreshInvestments");
        setResult(-1, intent);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}

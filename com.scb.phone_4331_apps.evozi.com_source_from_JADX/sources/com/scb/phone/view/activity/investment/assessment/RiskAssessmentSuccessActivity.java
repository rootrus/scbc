package com.scb.phone.view.activity.investment.assessment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.investment.assessment.BasicAssetAllocationAdapter;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindEBillAmountFragment;
import p040o.FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.ProfileService;
import p040o.dumpStringToFile;
import p040o.getGrayLevelStreakCount;
import p040o.getInvestmentSummary;
import p040o.getOversizeImage;
import p040o.getRequestPassword;
import p040o.onCheckBoxClick;
import p040o.populateEventDeviceData;
import p040o.setCertificateValidatorListener;
import p040o.setOnStateChangedListener;
import p040o.setPanEnabled;
import p040o.setQuickScaleEnabled;
import p040o.setTimeout;
import p040o.setkfsUsername;

public class RiskAssessmentSuccessActivity extends BaseActivity implements getGrayLevelStreakCount {
    @BindView
    protected RecyclerView baaRecyclerView;
    @BindView
    protected TextView dateText;
    @BindView
    protected TextView investorTypeText;
    @BindView
    protected TextView nameText;
    @HmlPinActivity
    public getRequestPassword presenter;
    @BindView
    protected TextView scoreText;
    @BindView
    protected DefaultButton slipButton;
    @HmlPinActivity
    public FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment successScreenshotHelper;

    public static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    @OnClick
    public void onCloseClicked() {
        getRequestPassword getrequestpassword = this.presenter;
        dumpStringToFile dumpstringtofile = dumpStringToFile.MediaBrowserCompat$CustomActionResultReceiver;
        if (getrequestpassword.RatingCompat != null) {
            dumpstringtofile.IconCompatParcelizer(getrequestpassword.RatingCompat);
        }
    }

    @OnClick
    public void onSaveSlipClicked() {
        getRequestPassword getrequestpassword = this.presenter;
        boolean z = true;
        setTimeout settimeout = new setTimeout(getrequestpassword, true);
        if (getrequestpassword.RatingCompat == null) {
            z = false;
        }
        if (z) {
            settimeout.IconCompatParcelizer(getrequestpassword.RatingCompat);
        }
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79742131493199);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getRequestPassword getrequestpassword = this.presenter;
        populateEventDeviceData populateeventdevicedata = (populateEventDeviceData) getIntent().getParcelableExtra("displayExtra");
        getrequestpassword.write = populateeventdevicedata;
        getrequestpassword.read = getrequestpassword.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.setShortcut();
        setkfsUsername setkfsusername = new setkfsUsername(populateeventdevicedata);
        boolean z = true;
        if (getrequestpassword.RatingCompat != null) {
            setkfsusername.IconCompatParcelizer(getrequestpassword.RatingCompat);
        }
        if (getrequestpassword.read) {
            setTimeout settimeout = new setTimeout(getrequestpassword, false);
            if (getrequestpassword.RatingCompat == null) {
                z = false;
            }
            if (z) {
                settimeout.IconCompatParcelizer(getrequestpassword.RatingCompat);
            }
        } else {
            ProfileService profileService = ProfileService.MediaBrowserCompat$CustomActionResultReceiver;
            if (getrequestpassword.RatingCompat == null) {
                z = false;
            }
            if (z) {
                profileService.IconCompatParcelizer(getrequestpassword.RatingCompat);
            }
        }
        mo13676d_("mfsuit_successful");
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    public final void IconCompatParcelizer(populateEventDeviceData populateeventdevicedata) {
        this.nameText.setText(populateeventdevicedata.read);
        this.scoreText.setText(populateeventdevicedata.MediaDescriptionCompat);
        this.investorTypeText.setText(populateeventdevicedata.IconCompatParcelizer);
        this.dateText.setText(populateeventdevicedata.MediaBrowserCompat$ItemReceiver);
        this.baaRecyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new getInvestmentSummary(this, 12), -1);
        this.baaRecyclerView.setNestedScrollingEnabled(false);
        this.baaRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.baaRecyclerView.setAdapter(new BasicAssetAllocationAdapter(this, populateeventdevicedata.write));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        setResult(-1, new Intent());
        finish();
    }

    public final void read() {
        this.slipButton.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        write(this, R.id.root_view, getString(z ? R.string.auto_saved_slip : R.string.saved_slip), getOversizeImage.SUCCESS);
    }

    public final void write(populateEventDeviceData populateeventdevicedata, boolean z) {
        setOnStateChangedListener.IconCompatParcelizer(this, populateeventdevicedata, z);
    }

    public final void IconCompatParcelizer(populateEventDeviceData populateeventdevicedata, boolean z) {
        FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment = this.successScreenshotHelper;
        fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment.MediaBrowserCompat$ItemReceiver = R.layout.f91512131494378;
        DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindEBillAmountFragment(fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment, populateeventdevicedata, z, this, false, true)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new setQuickScaleEnabled(this), new setPanEnabled(this));
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, populateEventDeviceData populateeventdevicedata) {
        Intent intent = new Intent(context, RiskAssessmentSuccessActivity.class);
        intent.putExtra("displayExtra", populateeventdevicedata);
        return intent;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static void m2938x50fd9e4a() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static /* synthetic */ void IconCompatParcelizer(RiskAssessmentSuccessActivity riskAssessmentSuccessActivity) {
        getRequestPassword getrequestpassword = riskAssessmentSuccessActivity.presenter;
        setCertificateValidatorListener setcertificatevalidatorlistener = new setCertificateValidatorListener(getrequestpassword);
        if (getrequestpassword.RatingCompat != null) {
            setcertificatevalidatorlistener.IconCompatParcelizer(getrequestpassword.RatingCompat);
        }
    }

    public void onBackPressed() {
        setResult(-1, new Intent());
        finish();
    }
}

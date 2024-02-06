package com.scb.phone.view.activity.investment.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.BaseActivity$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.BankingServicesDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.PaFaceConstants;
import p040o.access$302;
import p040o.getDeviceDeclinationPitch;
import p040o.getDeviceDeclinationRoll;
import p040o.getInstallerPackageName;
import p040o.getLuminanceThreshold;
import p040o.getOversizeImage;
import p040o.injectRttiCheckDeserializer$MediaSessionCompat$Token;
import p040o.onStart;
import p040o.sessionCreate;
import p040o.setUseVideoFrame;

public class FundOnboardingSuccessActivity extends BaseActivity implements injectRttiCheckDeserializer$MediaSessionCompat$Token {
    @HmlPinActivity
    public setUseVideoFrame presenter;
    @BindView
    Button saveButton;
    @BindView
    TextView textDateTime;
    @BindView
    TextView tvMfosAccountNameValue;
    @BindView
    TextView tvMfosAccountNoValue;
    @BindView
    TextView tvMfosBranchValue;
    @BindView
    TextView tvMfosClientNoValue;
    @BindView
    TextView tvMfosNameValue;

    public void onBackPressed() {
    }

    public class FundScreenshot_ViewBinding implements Unbinder {
        private FundScreenshot write;

        public FundScreenshot_ViewBinding(FundScreenshot fundScreenshot, View view) {
            this.write = fundScreenshot;
            fundScreenshot.textDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textDateTime'", TextView.class);
            fundScreenshot.tvMfosNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_name_value, "field 'tvMfosNameValue'", TextView.class);
            fundScreenshot.tvMfosClientNoValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_client_no_value, "field 'tvMfosClientNoValue'", TextView.class);
            fundScreenshot.tvMfosBranchValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_branch_value, "field 'tvMfosBranchValue'", TextView.class);
            fundScreenshot.tvMfosAccountNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_account_name_value, "field 'tvMfosAccountNameValue'", TextView.class);
            fundScreenshot.tvMfosAccountNoValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_account_no_value, "field 'tvMfosAccountNoValue'", TextView.class);
        }

        public final void read() {
            FundScreenshot fundScreenshot = this.write;
            if (fundScreenshot != null) {
                this.write = null;
                fundScreenshot.textDateTime = null;
                fundScreenshot.tvMfosNameValue = null;
                fundScreenshot.tvMfosClientNoValue = null;
                fundScreenshot.tvMfosBranchValue = null;
                fundScreenshot.tvMfosAccountNameValue = null;
                fundScreenshot.tvMfosAccountNoValue = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, getInstallerPackageName getinstallerpackagename) {
        return new Intent(context, FundOnboardingSuccessActivity.class).putExtra("EXTRA_FUND_OTP", getinstallerpackagename);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78032131493028);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getInstallerPackageName getinstallerpackagename = (getInstallerPackageName) getIntent().getParcelableExtra("EXTRA_FUND_OTP");
        this.textDateTime.setText(getinstallerpackagename.MediaDescriptionCompat);
        this.tvMfosNameValue.setText(getinstallerpackagename.MediaMetadataCompat);
        this.tvMfosClientNoValue.setText(getinstallerpackagename.RatingCompat);
        this.tvMfosBranchValue.setText(getinstallerpackagename.MediaBrowserCompat$CustomActionResultReceiver);
        this.tvMfosAccountNameValue.setText(getinstallerpackagename.read);
        this.tvMfosAccountNoValue.setText(getinstallerpackagename.MediaBrowserCompat$ItemReceiver);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setUseVideoFrame setusevideoframe = this.presenter;
        boolean z = true;
        if (setusevideoframe.read.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
            getLuminanceThreshold getluminancethreshold = getLuminanceThreshold.write;
            if (setusevideoframe.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getluminancethreshold.IconCompatParcelizer(setusevideoframe.RatingCompat);
            }
        } else {
            getDeviceDeclinationRoll getdevicedeclinationroll = getDeviceDeclinationRoll.MediaBrowserCompat$CustomActionResultReceiver;
            if (setusevideoframe.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getdevicedeclinationroll.IconCompatParcelizer(setusevideoframe.RatingCompat);
            }
        }
        mo13676d_("mfonboard_success");
    }

    @OnClick
    public void onSaveButtonClicked() {
        setUseVideoFrame setusevideoframe = this.presenter;
        getDeviceDeclinationPitch getdevicedeclinationpitch = getDeviceDeclinationPitch.read;
        if (setusevideoframe.RatingCompat != null) {
            getdevicedeclinationpitch.IconCompatParcelizer(setusevideoframe.RatingCompat);
        }
    }

    @OnClick
    public void onReturnButtonClicked() {
        setUseVideoFrame setusevideoframe = this.presenter;
        sessionCreate sessioncreate = sessionCreate.IconCompatParcelizer;
        if (setusevideoframe.RatingCompat != null) {
            sessioncreate.IconCompatParcelizer(setusevideoframe.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.saveButton.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        write(this, R.id.root_view, getString(R.string.mf_onboarding_success_saved_slip_snack_label), getOversizeImage.SUCCESS);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        write(this, R.id.root_view, getString(R.string.mf_onboarding_success_auto_saved_slip_snack_label), getOversizeImage.SUCCESS);
    }

    public final void IconCompatParcelizer() {
        write((BaseActivity$MediaBrowserCompat$CustomActionResultReceiver) new access$302(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        getInstallerPackageName getinstallerpackagename = (getInstallerPackageName) getIntent().getParcelableExtra("EXTRA_FUND_OTP");
        read read2 = new read();
        String str = getinstallerpackagename.MediaDescriptionCompat;
        DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(read2, new FundScreenshot(String.format(getString(R.string.mf_onboarding_slip), new Object[]{str}), getinstallerpackagename, z), this)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new PaFaceConstants.MotionType(this), new PaFaceConstants.EnvironmentalTips(this));
    }

    public static class FundScreenshot extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        getInstallerPackageName read;
        @BindView
        TextView textDateTime;
        @BindView
        TextView tvMfosAccountNameValue;
        @BindView
        TextView tvMfosAccountNoValue;
        @BindView
        TextView tvMfosBranchValue;
        @BindView
        TextView tvMfosClientNoValue;
        @BindView
        TextView tvMfosNameValue;

        public FundScreenshot(String str, getInstallerPackageName getinstallerpackagename, boolean z) {
            super(R.layout.f91482131494375, str, false, z);
            this.read = getinstallerpackagename;
        }
    }

    public static class read extends FragmentBuilder_BindEBillSelectedFragment<FundScreenshot> {
        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            FundScreenshot fundScreenshot = (FundScreenshot) simpleForwardingListenableFuture;
            ButterKnife.IconCompatParcelizer(fundScreenshot, view);
            fundScreenshot.textDateTime.setText(fundScreenshot.read.MediaDescriptionCompat);
            fundScreenshot.tvMfosNameValue.setText(fundScreenshot.read.MediaMetadataCompat);
            fundScreenshot.tvMfosClientNoValue.setText(fundScreenshot.read.RatingCompat);
            fundScreenshot.tvMfosBranchValue.setText(fundScreenshot.read.MediaBrowserCompat$CustomActionResultReceiver);
            fundScreenshot.tvMfosAccountNameValue.setText(fundScreenshot.read.read);
            fundScreenshot.tvMfosAccountNoValue.setText(fundScreenshot.read.MediaBrowserCompat$ItemReceiver);
        }
    }
}

package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.PassportCaptureModule_GetLookAndFeelParametersFactory;
import p040o.ScrimInsetsFrameLayout;
import p040o.getCorrectCaseUserName;
import p040o.getCorrectCaseUserName$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

public final class HmlNTBPinDisabledActivity extends BaseActivity implements PassportCaptureModule_GetLookAndFeelParametersFactory {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    @BindView
    public TextView disabledPinSubtitle;
    @BindView
    public TextView disabledPinTitle;
    @HmlPinActivity
    public getCorrectCaseUserName presenter;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f87932131494020);
        mo13676d_("ntb_pin_disabled");
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getBooleanExtra("PIN_EXPIRED_FLAG", false)) {
            TextView textView = this.disabledPinTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("disabledPinTitle");
            }
            textView.setText(getText(R.string.hml_ntb_pin_expired_title));
            TextView textView2 = this.disabledPinSubtitle;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("disabledPinSubtitle");
            }
            textView2.setText(getText(R.string.hml_ntb_pin_expired_description));
        }
        getCorrectCaseUserName getcorrectcaseusername = this.presenter;
        if (getcorrectcaseusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getcorrectcaseusername.MediaBrowserCompat$ItemReceiver(this);
    }

    @OnClick
    public final void onButtonClicked() {
        getCorrectCaseUserName getcorrectcaseusername = this.presenter;
        if (getcorrectcaseusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getcorrectcaseusername.RatingCompat != null) {
            getcorrectcaseusername.RatingCompat.AlertController$RecycleListView();
        }
        ScrimInsetsFrameLayout scrimInsetsFrameLayout = getcorrectcaseusername.read;
        scrimInsetsFrameLayout.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        DebitCardResetOtpActivity just = DebitCardResetOtpActivity.just(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) just, "Observable.just(pinRepository.disablePin())");
        scrimInsetsFrameLayout.write(just, new getCorrectCaseUserName$MediaBrowserCompat$ItemReceiver(getcorrectcaseusername));
    }

    public final void read() {
        SplashActivity.IconCompatParcelizer(this);
    }
}

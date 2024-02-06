package com.scb.phone.view.activity.investment.scbs.open;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CaptureMessage;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blurThreshold;
import p040o.getDocumentDetectionGuidanceList;
import p040o.getImageCapturedEvent;
import p040o.getImageProcessingListener;
import p040o.getPageAreaThreshold;
import p040o.getSilentLivingThr;
import p040o.getYawThr;
import p040o.immediateFailedCheckedFuture;
import p040o.immediateFailedFuture;
import p040o.setTapText;

public class ScbsOnboardingTcActivity extends BaseActivityWithFragment implements getImageProcessingListener, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public CaptureMessage.KUIMessageOrientation presenter;

    public static void read(Context context) {
        Intent intent = new Intent(context, ScbsOnboardingTcActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        return getString(R.string.onboarding_tc_scbs_title);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("addaccount_consent");
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = this.presenter;
        kUIMessageOrientation.read = "SCBS_TC";
        getDocumentDetectionGuidanceList getdocumentdetectionguidancelist = new getDocumentDetectionGuidanceList(kUIMessageOrientation);
        if (kUIMessageOrientation.RatingCompat != null) {
            getdocumentdetectionguidancelist.IconCompatParcelizer(kUIMessageOrientation.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        immediateFailedCheckedFuture.read IconCompatParcelizer = immediateFailedCheckedFuture.IconCompatParcelizer();
        IconCompatParcelizer.read = getString(R.string.onboarding_tc_scbs_accept_title);
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.onboarding_tc_scbs_accept_body);
        IconCompatParcelizer.IconCompatParcelizer = getString(R.string.onboarding_tc_scbs_accept_ok);
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = getString(R.string.onboarding_tc_scbs_accept_cancel);
        write(new immediateFailedCheckedFuture(IconCompatParcelizer, (byte) 0), new getSilentLivingThr(this));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        immediateFailedCheckedFuture.read IconCompatParcelizer = immediateFailedCheckedFuture.IconCompatParcelizer();
        IconCompatParcelizer.read = getString(R.string.onboarding_tc_scbs_decline_title);
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.onboarding_tc_scbs_decline_body);
        IconCompatParcelizer.IconCompatParcelizer = getString(R.string.onboarding_tc_scbs_declince_ok);
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = getString(R.string.onboarding_tc_scbs_decline_cancel);
        write(new immediateFailedCheckedFuture(IconCompatParcelizer, (byte) 0), new blurThreshold(this));
    }

    public final void read() {
        onBackPressed();
    }

    public final void IconCompatParcelizer() {
        Intent IconCompatParcelizer = OnboardingTcScbsOtpActivity.IconCompatParcelizer((Activity) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void write(immediateFailedCheckedFuture immediatefailedcheckedfuture, DialogInterface.OnClickListener onClickListener) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String str = immediatefailedcheckedfuture.IconCompatParcelizer;
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(str);
        }
        String str2 = immediatefailedcheckedfuture.MediaBrowserCompat$CustomActionResultReceiver;
        if (true ^ (str2 == null || str2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(str2);
        }
        IconCompatParcelizer.IconCompatParcelizer(immediatefailedcheckedfuture.read, onClickListener).MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture.MediaBrowserCompat$ItemReceiver, getYawThr.read).show();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = this.presenter;
        getImageCapturedEvent getimagecapturedevent = getImageCapturedEvent.MediaBrowserCompat$CustomActionResultReceiver;
        if (kUIMessageOrientation.RatingCompat != null) {
            getimagecapturedevent.IconCompatParcelizer(kUIMessageOrientation.RatingCompat);
        }
    }

    public final void write(String str) {
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = this.presenter;
        getPageAreaThreshold getpageareathreshold = getPageAreaThreshold.MediaBrowserCompat$ItemReceiver;
        if (kUIMessageOrientation.RatingCompat != null) {
            getpageareathreshold.IconCompatParcelizer(kUIMessageOrientation.RatingCompat);
        }
    }

    public final void setContentView() {
        finish();
    }
}

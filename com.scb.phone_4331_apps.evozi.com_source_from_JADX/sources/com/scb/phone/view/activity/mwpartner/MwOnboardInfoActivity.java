package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.activity.privacypolicy.ScbPrivacyPolicyActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Arrays;
import java.util.List;
import p040o.CharMatcher;
import p040o.DebitCardResetOtpActivity;
import p040o.EventInstanceDao;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PrepaidActivationService;
import p040o.TaskRunner;
import p040o.ZSYR2K;
import p040o.getDay;
import p040o.getICheckDeserializerRtti;
import p040o.onCheckBoxClick;
import p040o.onFrontImageProcessed;
import p040o.setErrorCode;
import p040o.setErrorDescription;
import p040o.setErrorTime;
import p040o.setSDKVersion;
import p040o.setTapText;

public class MwOnboardInfoActivity extends BaseActivity implements onFrontImageProcessed.IconCompatParcelizer {
    @BindView
    LinearLayout llQualification;
    @HmlPinActivity
    public TaskRunner.TaskCompletedEvent presenter;
    @BindView
    TextView tvPrivacyConsent;
    @BindView
    TextView tvQualificationList;

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, MwOnboardInfoActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78882131493113);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.mw_boarding_title);
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onStart() {
        super.onStart();
        TaskRunner.TaskCompletedEvent taskCompletedEvent = this.presenter;
        String MediaBrowserCompat$CustomActionResultReceiver = taskCompletedEvent.read.MediaBrowserCompat$CustomActionResultReceiver();
        boolean z = true;
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            EventInstanceDao eventInstanceDao = new EventInstanceDao(MediaBrowserCompat$CustomActionResultReceiver);
            if (taskCompletedEvent.RatingCompat != null) {
                eventInstanceDao.IconCompatParcelizer(taskCompletedEvent.RatingCompat);
            }
        }
        MarketingCSentWebViewActivity.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = taskCompletedEvent.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        if (taskCompletedEvent.IconCompatParcelizer.MediaBrowserCompat$MediaItem() && MediaBrowserCompat$ItemReceiver != null && MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            setSDKVersion setsdkversion = new setSDKVersion(MediaBrowserCompat$ItemReceiver);
            if (taskCompletedEvent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setsdkversion.IconCompatParcelizer(taskCompletedEvent.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void read(String str) {
        mo13676d_("merchant_registration_webview");
        Intent intent = new Intent(SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver(this, str, getString(R.string.mw_onboarding_webview)));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final void IconCompatParcelizer(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
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
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            this.presenter.write();
        }
    }

    public final void write() {
        Intent MediaBrowserCompat$ItemReceiver = MwTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public final void IconCompatParcelizer() {
        Intent IconCompatParcelizer = MwBusinessDetailsActivity.IconCompatParcelizer((Context) this);
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

    public final void RatingCompat(String str) {
        TextView textView = this.tvPrivacyConsent;
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(str, 0));
        } else {
            textView.setText(Html.fromHtml(str));
        }
        this.tvPrivacyConsent.setMovementMethod(new PrepaidActivationService(new getDay(this)));
    }

    public final void write(String str) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = ScbPrivacyPolicyActivity.MediaBrowserCompat$CustomActionResultReceiver(this, str, getString(R.string.auto_gmb_privacy_title));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public final void MediaMetadataCompat(String str) {
        this.llQualification.setVisibility(0);
        this.tvQualificationList.setText(getICheckDeserializerRtti.read((int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics()), (List<String>) Arrays.asList(new String[]{getString(R.string.mw_qualification_first_rule), getString(R.string.mw_qualification_second_rule, new Object[]{str})})));
    }

    @OnClick
    public void onBoardingInAppClick() {
        DebitCardResetOtpActivity<R> debitCardResetOtpActivity;
        boolean z = true;
        this.scbAnalytics.write("merchant_preonboard_landing", new ZSYR2K("button", "use_via_easy"));
        try {
            TaskRunner.TaskCompletedEvent taskCompletedEvent = this.presenter;
            if (taskCompletedEvent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                taskCompletedEvent.RatingCompat.AlertController$RecycleListView();
            }
            CharMatcher.LookupTable lookupTable = taskCompletedEvent.IconCompatParcelizer;
            if (lookupTable.MediaBrowserCompat$MediaItem()) {
                debitCardResetOtpActivity = lookupTable.IconCompatParcelizer.MediaMetadataCompat().map(CharMatcher.C31684.IconCompatParcelizer);
            } else {
                debitCardResetOtpActivity = lookupTable.IconCompatParcelizer.read().map(CharMatcher.C31698.MediaBrowserCompat$CustomActionResultReceiver);
            }
            lookupTable.read(debitCardResetOtpActivity, new setErrorTime(taskCompletedEvent), new setErrorCode(taskCompletedEvent));
        } catch (NullPointerException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    @OnClick
    public void onDownloadClick() {
        boolean z = true;
        this.scbAnalytics.write("merchant_preonboard_landing", new ZSYR2K("button", "download_app"));
        try {
            TaskRunner.TaskCompletedEvent taskCompletedEvent = this.presenter;
            setErrorDescription seterrordescription = new setErrorDescription(taskCompletedEvent.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver);
            if (taskCompletedEvent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                seterrordescription.IconCompatParcelizer(taskCompletedEvent.RatingCompat);
            }
        } catch (NullPointerException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }
}

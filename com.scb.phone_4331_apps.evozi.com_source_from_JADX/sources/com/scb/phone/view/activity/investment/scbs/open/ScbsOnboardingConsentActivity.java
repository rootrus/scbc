package com.scb.phone.view.activity.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportExtractor_MembersInjector;
import p040o.ZSYR2K;
import p040o.getCaptureCriteria;
import p040o.getCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.immediateFailedCheckedFuture;
import p040o.immediateFailedFuture;
import p040o.isGravitySwitch;
import p040o.setFaceCloseThr;
import p040o.setFocusEnabled;
import p040o.setPitchThreshold;
import p040o.setTapText;

public class ScbsOnboardingConsentActivity extends BaseActivityWithFragment implements PassportExtractor_MembersInjector, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public getCaptureCriteria presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static void read(Context context) {
        Intent intent = new Intent(context, ScbsOnboardingConsentActivity.class);
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
        return getString(R.string.consent_title);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("addaccount_consent");
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getCaptureCriteria getcapturecriteria = this.presenter;
        getcapturecriteria.MediaBrowserCompat$ItemReceiver = "SCBS_ONBOARD";
        setFocusEnabled setfocusenabled = new setFocusEnabled(getcapturecriteria);
        if (getcapturecriteria.RatingCompat != null) {
            setfocusenabled.IconCompatParcelizer(getcapturecriteria.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    public final void IconCompatParcelizer() {
        immediateFailedCheckedFuture.read IconCompatParcelizer = immediateFailedCheckedFuture.IconCompatParcelizer();
        IconCompatParcelizer.read = getString(R.string.deny_consent_dialog_title);
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.consent_scbs_message);
        IconCompatParcelizer.IconCompatParcelizer = getString(R.string.partner_consent_deny_button);
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = getString(R.string.debit_card_terms_alert_negative_button);
        immediateFailedCheckedFuture immediatefailedcheckedfuture = new immediateFailedCheckedFuture(IconCompatParcelizer, (byte) 0);
        isGravitySwitch isgravityswitch = new isGravitySwitch(this);
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String str = immediatefailedcheckedfuture.IconCompatParcelizer;
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(str);
        }
        String str2 = immediatefailedcheckedfuture.MediaBrowserCompat$CustomActionResultReceiver;
        if (true ^ (str2 == null || str2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(str2);
        }
        IconCompatParcelizer2.IconCompatParcelizer(immediatefailedcheckedfuture.read, isgravityswitch).MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture.MediaBrowserCompat$ItemReceiver, setFaceCloseThr.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.scbAnalytics.write("scbsonboard_consent_allow", new ZSYR2K("button", "allow"));
        ScbsOnboardingProductCatalogActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void read() {
        this.scbAnalytics.write("scbsonboard_consent_deny", new ZSYR2K("button", "deny"));
        onBackPressed();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        getCaptureCriteria getcapturecriteria = this.presenter;
        if (getcapturecriteria.RatingCompat != null) {
            getcapturecriteria.RatingCompat.AlertController$RecycleListView();
        }
        getcapturecriteria.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        getcapturecriteria.IconCompatParcelizer.IconCompatParcelizer(new getCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver(getcapturecriteria, (byte) 0));
    }

    public final void write(String str) {
        getCaptureCriteria getcapturecriteria = this.presenter;
        setPitchThreshold setpitchthreshold = setPitchThreshold.write;
        if (getcapturecriteria.RatingCompat != null) {
            setpitchthreshold.IconCompatParcelizer(getcapturecriteria.RatingCompat);
        }
    }

    public final void setContentView() {
        finish();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }
}

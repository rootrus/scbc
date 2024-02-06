package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AppStatsPropertyType;
import p040o.CalendarPager;
import p040o.CalendarPagerAdapter;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.canScrollVertically;
import p040o.getAltClassificationResult;
import p040o.getErrCause;
import p040o.getEventTypeDescription;
import p040o.getInstTypeDescrip;
import p040o.getLatestCachedModelDataBuildInfo;
import p040o.immediateFailedFuture;
import p040o.invalidateSelectedDates;
import p040o.isPagingEnabled;
import p040o.setPagingEnabled;
import p040o.setTapText;

public class MwTermsAndConditionsActivity extends BaseActivityWithFragment implements getLatestCachedModelDataBuildInfo, FragmentBuilder_BindCustomizeYourPageFragment {
    @HmlPinActivity
    public getErrCause merchantTermsAndConditionsPresenter;

    public static /* synthetic */ void AppCompatActivity() {
    }

    public static /* synthetic */ void AppCompatDelegateImpl$ListMenuDecorView() {
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return new Intent(context, MwTermsAndConditionsActivity.class);
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((MwTermsAndConditionsActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ void read(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((MwTermsAndConditionsActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.merchantTermsAndConditionsPresenter.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("merchant_registration_termsconditions");
        getErrCause geterrcause = this.merchantTermsAndConditionsPresenter;
        if ("ONBOARD".equals(geterrcause.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().read)) {
            geterrcause.MediaBrowserCompat$ItemReceiver = "ONBOARD";
        } else {
            geterrcause.MediaBrowserCompat$ItemReceiver = "LANDING";
        }
        geterrcause.MediaBrowserCompat$ItemReceiver = geterrcause.MediaBrowserCompat$ItemReceiver;
        getAltClassificationResult getaltclassificationresult = new getAltClassificationResult(geterrcause);
        if (geterrcause.RatingCompat != null) {
            getaltclassificationresult.IconCompatParcelizer(geterrcause.RatingCompat);
        }
        super.setStackedBackground();
        setTitle(R.string.mr_terms_and_conditions_nev_title);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.mr_terms_and_conditions_nev_title);
        setTabContainer();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        setItemInvoker();
        return true;
    }

    public void onBackPressed() {
        setItemInvoker();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        return getString(R.string.tc_action_bar_title);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        getErrCause geterrcause = this.merchantTermsAndConditionsPresenter;
        boolean z = true;
        if ("ONBOARD".equalsIgnoreCase(geterrcause.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().read)) {
            getEventTypeDescription geteventtypedescription = getEventTypeDescription.MediaBrowserCompat$CustomActionResultReceiver;
            if (geterrcause.RatingCompat == null) {
                z = false;
            }
            if (z) {
                geteventtypedescription.IconCompatParcelizer(geterrcause.RatingCompat);
                return;
            }
            return;
        }
        AppStatsPropertyType appStatsPropertyType = AppStatsPropertyType.MediaBrowserCompat$ItemReceiver;
        if (geterrcause.RatingCompat == null) {
            z = false;
        }
        if (z) {
            appStatsPropertyType.IconCompatParcelizer(geterrcause.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_accept_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_accept_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_accept_dialog_btn_cancel), CalendarPagerAdapter.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mr_terms_and_conditions_accept_dialog_btn_accept), new setPagingEnabled(this)).show();
    }

    public final void write(String str) {
        getErrCause geterrcause = this.merchantTermsAndConditionsPresenter;
        getInstTypeDescrip getinsttypedescrip = getInstTypeDescrip.IconCompatParcelizer;
        if (geterrcause.RatingCompat != null) {
            getinsttypedescrip.IconCompatParcelizer(geterrcause.RatingCompat);
        }
    }

    public final void setContentView() {
        finish();
    }

    private void setItemInvoker() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_exit_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_exit_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_exit_dialog_btn_cancel), canScrollVertically.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mr_terms_and_conditions_exit_dialog_btn_accept), new isPagingEnabled(this)).show();
    }

    public final void IconCompatParcelizer() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_decline_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_decline_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mr_terms_and_conditions_decline_dialog_btn_cancel), CalendarPager.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mr_terms_and_conditions_decline_dialog_btn_decline), new invalidateSelectedDates(this)).show();
    }

    public final void read() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
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
        finish();
    }

    public final void write() {
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
        finish();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }
}

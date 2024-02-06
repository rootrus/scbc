package com.scb.phone.view.activity.investment.onboarding;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.investment.onboarding.FundAddressDetailFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundAddressMainFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundInvestmentExperienceFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundMaritalStatusFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundOnboardingReviewFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundOnboardingTermsAndConditionsFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundPersonalInfoFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundSelectAccountFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundSourceFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040o.ActivityBuilder_BindOPRStatusRewardsLandingActivity;
import p040o.ActivityBuilder_BindPayerReviewActivity;
import p040o.AlertController$RecycleListView;
import p040o.C4224d;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.LiveFaceConfig;
import p040o.PaFaceConstants;
import p040o.addTorchLuminanceListener;
import p040o.injectRttiCheckDeserializer;
import p040o.setTitleMarginStart;
import p040o.surfaceCreated;

public class FundAppFormActivity extends BaseActivity implements setTitleMarginStart.IconCompatParcelizer, injectRttiCheckDeserializer.ParcelableVolumeInfo, FragmentBuilder_BindCalendarDialogFragment, FragmentBuilder_BindCalendarDialogFragment.write, FragmentBuilder_BindChangeChannelStatementReviewFragment.write {
    public List<C5651x86e48d5c> MediaBrowserCompat$SearchResultReceiver = new ArrayList();
    private int MediaMetadataCompat = 0;
    @HmlPinActivity
    public surfaceCreated fundOnboardingPresenter;
    @BindView
    public ProgressStateBar progressStateBar;

    public interface write {
        Fragment MediaBrowserCompat$ItemReceiver();
    }

    public final void am_() {
    }

    public final void write(Fragment fragment) {
    }

    public final void write(String str) {
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78782131493103);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.progressStateBar.setStates(Arrays.asList(getResources().getStringArray(R.array.f64842130903063)));
        setIcon();
        this.fundOnboardingPresenter.MediaBrowserCompat$ItemReceiver(this);
        surfaceCreated surfacecreated = this.fundOnboardingPresenter;
        addTorchLuminanceListener addtorchluminancelistener = addTorchLuminanceListener.MediaBrowserCompat$ItemReceiver;
        if (surfacecreated.RatingCompat != null) {
            addtorchluminancelistener.IconCompatParcelizer(surfacecreated.RatingCompat);
        }
        getSupportFragmentManager().MediaBrowserCompat$ItemReceiver((setTitleMarginStart.IconCompatParcelizer) this);
    }

    /* access modifiers changed from: protected */
    public void setIcon() {
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(0, getString(R.string.mf_onboarding_page_personal_information), true, new C4224d.C4230d(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(0, getString(R.string.mf_onboarding_page_address), true, new LiveFaceConfig(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(0, getString(R.string.mf_onboarding_page_marital_status), true, new PaFaceConstants.InterruptType(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.mf_onboarding_page_source_of_investment_fund), true, new PaFaceConstants.DetectComplete(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.mf_onboarding_page_investment_experience), true, new C4224d.C4228b(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(2, getString(R.string.mf_onboarding_page_select_account), true, new C4224d.C4229c(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(2, getString(R.string.mf_onboarding_page_terms_and_condition), false, new PaFaceConstants(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(3, getString(R.string.mf_onboarding_review_top_nav_label), true, new C4224d.C4231e(this)));
    }

    public static Fragment setMenu() {
        return new FundPersonalInfoFragment();
    }

    public static Fragment setItemInvoker() {
        return new FundAddressMainFragment();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver() | 16);
        this.read.MediaBrowserCompat$MediaItem();
    }

    public final void setOverlayMode() {
        int i;
        List<C5651x86e48d5c> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null && list.size() - 1 >= (i = this.MediaMetadataCompat + 1)) {
            this.MediaMetadataCompat = i;
            setUiOptions();
        }
    }

    public void onBackPressed() {
        setWindowTitle();
    }

    public final void write(FundAddressDetailFragment fundAddressDetailFragment) {
        read(fundAddressDetailFragment);
    }

    public final void read(Fragment fragment) {
        getSupportFragmentManager().read().write(R.id.container, fragment, fragment.getClass().getName()).MediaBrowserCompat$CustomActionResultReceiver(fragment.getClass().getName()).write();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        setWindowTitle();
        return true;
    }

    public final void write() {
        int write2 = getSupportFragmentManager().write();
        if (write2 == 0) {
            finish();
            return;
        }
        List<C5651x86e48d5c> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null && write2 > 0 && this.MediaMetadataCompat + 1 >= write2) {
            int i = write2 - 1;
            this.MediaMetadataCompat = i;
            C5651x86e48d5c fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver = list.get(i);
            MediaSessionCompat$QueueItem(fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver.write);
            this.progressStateBar.setCurrentState(fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver.read.intValue());
            if (fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
                this.progressStateBar.setVisibility(0);
            } else {
                this.progressStateBar.setVisibility(8);
            }
        }
    }

    private void setUiOptions() {
        C5651x86e48d5c fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$SearchResultReceiver.get(this.MediaMetadataCompat);
        MediaSessionCompat$QueueItem(fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver.write);
        this.progressStateBar.setCurrentState(fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver.read.intValue());
        read(fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        if (fundAppFormActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
            this.progressStateBar.setVisibility(0);
        } else {
            this.progressStateBar.setVisibility(8);
        }
    }

    private void setWindowTitle() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof FundPersonalInfoFragment) {
            FundPersonalInfoFragment fundPersonalInfoFragment = (FundPersonalInfoFragment) findFragmentById;
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(fundPersonalInfoFragment.getContext());
            String string = IconCompatParcelizer.read.getString(R.string.mf_personal_info_exit_title);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer.mTitleTextView.setVisibility(0);
                IconCompatParcelizer.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer.read.getString(R.string.mf_personal_info_exit_message);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer.mTextTextView.setVisibility(0);
                IconCompatParcelizer.mTextTextView.setText(string2);
            }
            CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mf_personal_info_not_now), ActivityBuilder_BindOPRStatusRewardsLandingActivity.MediaBrowserCompat$CustomActionResultReceiver);
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mf_personal_info_exit), new ActivityBuilder_BindPayerReviewActivity(fundPersonalInfoFragment)).show();
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static /* synthetic */ Fragment m2943x50fd9e4a() {
        return new FundSelectAccountFragment();
    }

    public static /* synthetic */ Fragment MediaSessionCompat$ResultReceiverWrapper() {
        return new FundInvestmentExperienceFragment();
    }

    public static /* synthetic */ Fragment MediaSessionCompat$QueueItem() {
        return new FundOnboardingReviewFragment();
    }

    public static /* synthetic */ Fragment AppCompatDelegateImpl$ListMenuDecorView() {
        return new FundSourceFragment();
    }

    public static /* synthetic */ Fragment setContentView() {
        return new FundOnboardingTermsAndConditionsFragment();
    }

    public static /* synthetic */ Fragment AppCompatActivity() {
        return new FundMaritalStatusFragment();
    }

    public final void IconCompatParcelizer() {
        setUiOptions();
    }
}

package com.scb.phone.view.fragment.investment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.FundActionsSuccessActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.ActivityBuilder_BindHomeActivity;
import p040o.ActivityBuilder_BindHowToAddFavouriteTopUpActivity;
import p040o.ActivityBuilder_BindLoanPaymentReviewActivity;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CrashlyticsFileMarker;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindEBillSubscriptionBillerListFragment;
import p040o.FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.WscProfileRequest;
import p040o.WscRetrieveScanSettingsRequest;
import p040o.WscSubmitRequest;
import p040o.checkForPreviousCrash;
import p040o.getOversizeImage;
import p040o.injectKtaCheckDeserializer;
import p040o.onCheckBoxClick;
import p040o.setBatchClassIndexField;

public class FundActionsSuccessFragment extends BaseInvestmentSuccessFragment implements injectKtaCheckDeserializer.read {
    private checkForPreviousCrash IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    @BindView
    TextView remainingBalanceTextView;
    @BindView
    TextView returnButton;
    @BindView
    DefaultButton saveSlipButton;
    @BindView
    TextView scheduleNote;
    @BindView
    ImageView successIcon;
    @HmlPinActivity
    public WscSubmitRequest successPresenter;
    @BindView
    ImageView successScheduleIcon;
    @HmlPinActivity
    public FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment successScreenshotHelper;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89172131494144, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            checkForPreviousCrash checkforpreviouscrash = (checkForPreviousCrash) getActivity().getIntent().getParcelableExtra("com.scb.phone.ARGS_SUCCESS_DATA");
            this.IconCompatParcelizer = checkforpreviouscrash;
            IconCompatParcelizer(checkforpreviouscrash, inflate, getContext(), "ACCOUNT_MASKING_SUCCESS");
            this.successPresenter.MediaBrowserCompat$ItemReceiver(this);
            String str = this.IconCompatParcelizer.IconCompatParcelizer.ParcelableVolumeInfo;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1575706677) {
                if (hashCode != -1530290845) {
                    if (hashCode == 97916784 && str.equals("FUND_ACTION_PURCHASE")) {
                        c = 0;
                    }
                } else if (str.equals("FUND_ACTION_SWITCH")) {
                    c = 2;
                }
            } else if (str.equals("FUND_ACTION_REDEEM")) {
                c = 1;
            }
            if (c == 0) {
                this.remainingBalanceTextView.setVisibility(0);
                this.remainingBalanceTextView.setText(this.IconCompatParcelizer.write);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("mfschedule_purchasesuccess");
                }
            } else if (c == 1) {
                this.remainingBalanceTextView.setVisibility(8);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("mfschedule_redeemsuccess");
                }
            } else if (c == 2) {
                this.transferDate.setVisibility(8);
                this.customFees.setVisibility(8);
                this.switchFee.setVisibility(0);
                this.remainingBalanceTextView.setVisibility(8);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("mfschedule_redeemsuccess");
                }
            }
            if (!(this.IconCompatParcelizer.IconCompatParcelizer == null || this.IconCompatParcelizer.IconCompatParcelizer.setHasDecor == null)) {
                this.scheduleNote.setVisibility(0);
            }
            WscSubmitRequest wscSubmitRequest = this.successPresenter;
            checkForPreviousCrash checkforpreviouscrash2 = this.IconCompatParcelizer;
            if (checkforpreviouscrash2.IconCompatParcelizer.setHasDecor != null) {
                WscProfileRequest wscProfileRequest = new WscProfileRequest(wscSubmitRequest, checkforpreviouscrash2);
                if (wscSubmitRequest.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    wscProfileRequest.IconCompatParcelizer(wscSubmitRequest.RatingCompat);
                }
            } else if (wscSubmitRequest.read.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
                WscRetrieveScanSettingsRequest.FIELD_INDEXES field_indexes = WscRetrieveScanSettingsRequest.FIELD_INDEXES.read;
                if (wscSubmitRequest.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    field_indexes.IconCompatParcelizer(wscSubmitRequest.RatingCompat);
                }
            } else {
                setBatchClassIndexField setbatchclassindexfield = setBatchClassIndexField.MediaBrowserCompat$ItemReceiver;
                if (wscSubmitRequest.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setbatchclassindexfield.IconCompatParcelizer(wscSubmitRequest.RatingCompat);
                }
            }
        }
        return inflate;
    }

    public void onDestroy() {
        this.successPresenter.onDestroy();
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_BindLoanPaymentReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
    }

    public final void read(boolean z) {
        Context context = getContext();
        if (!isDetached() && context != null) {
            FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment = this.successScreenshotHelper;
            checkForPreviousCrash checkforpreviouscrash = this.IconCompatParcelizer;
            fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment.MediaBrowserCompat$ItemReceiver = R.layout.f91512131494378;
            DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindEBillSubscriptionBillerListFragment(fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment, checkforpreviouscrash, z, context, "ACCOUNT_MASKING_SLIP", true)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new ActivityBuilder_BindHowToAddFavouriteTopUpActivity(this), new ActivityBuilder_BindHomeActivity(this));
        }
    }

    public static void MediaMetadataCompat() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaBrowserCompat$SearchResultReceiver() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onReturnHomeClick() {
        if (getActivity() != null && (getActivity() instanceof FundActionsSuccessActivity)) {
            setTabContainer();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onSaveSlipButton() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        ActivityBuilder_BindLoanPaymentReviewActivity.IconCompatParcelizer(this, true);
    }

    public final void write() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.saveSlipButton.setVisibility(8);
        ActivityBuilder_BindLoanPaymentReviewActivity.IconCompatParcelizer(this, false);
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.saveSlipButton.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.successScheduleIcon.setImageResource(R.drawable.ic_scheduled_successful);
        this.successIcon.setVisibility(8);
        this.successScheduleIcon.setVisibility(0);
    }

    public final void read() {
        this.saveSlipButton.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.remainingBalanceTextView.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsFileMarker crashlyticsFileMarker) {
        this.switchDate.setVisibility(8);
        read(crashlyticsFileMarker);
    }

    public static /* synthetic */ void write(FundActionsSuccessFragment fundActionsSuccessFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = fundActionsSuccessFragment.getActivity();
        if (!fundActionsSuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = fundActionsSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = fundActionsSuccessFragment.getString(R.string.saved_slip_error);
                if (fundActionsSuccessFragment.getActivity() != null) {
                    ((BaseActivity) fundActionsSuccessFragment.getActivity()).write(activity2, R.id.investment_success_container, string, getoversizeimage);
                }
            }
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(FundActionsSuccessFragment fundActionsSuccessFragment, Uri uri) {
        FragmentActivity activity = fundActionsSuccessFragment.getActivity();
        if (!uri.toString().isEmpty() && fundActionsSuccessFragment.getUserVisibleHint() && activity != null && fundActionsSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = fundActionsSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = fundActionsSuccessFragment.getString(R.string.saved_slip);
                if (fundActionsSuccessFragment.getActivity() != null) {
                    ((BaseActivity) fundActionsSuccessFragment.getActivity()).write(activity2, R.id.investment_success_container, string, getoversizeimage);
                }
            }
            fundActionsSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver = false;
        }
    }
}

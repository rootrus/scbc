package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.transferandpay.CustomCardlessWithdrawCodeItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_OnScbsInputActivity;
import p040o.ActivityBuilder_OnboardingFatcaQuestionsActivity;
import p040o.ActivityBuilder_PhotoTakingDetailsActivity;
import p040o.ActivityBuilder_ProductDetailActivitySCBS;
import p040o.ActivityBuilder_QrPaymentCoachMarkActivity;
import p040o.ActivityBuilder_ScbsAccountDetailActivity;
import p040o.ActivityBuilder_ScbsOnboardingTcActivity;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CaptureActivity_MembersInjector;
import p040o.ContextImageStorage;
import p040o.CrashlyticsReport;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.getCompressedFrontImageSize;
import p040o.getUuidUtf8Bytes;
import p040o.inject_buttonsBarView;
import p040o.onCheckBoxClick;
import p040o.parseEventExecution;
import p040o.setExtract;
import p040o.setOnTabSelectListener;
import p040o.setTabTitleTextAppearance;
import p040o.setUuidFromUtf8Bytes;
import p040o.setup;
import p040o.setupCameraView;

public class CardlessSuccessfulRequestFragment extends BaseFragment implements getCompressedFrontImageSize {
    @HmlPinActivity
    public setExtract cardlessATMSuccesfulRequestPresenter;
    @HmlPinActivity
    public setTabTitleTextAppearance cardlessScreenshotHelper;
    @BindView
    CustomTransferAndPayItem customAmount;
    @BindView
    CustomTransferAndPaySource customSource;
    @BindView
    CustomCardlessWithdrawCodeItem customWithdrawCode;
    @BindView
    protected Button mCancelRequestButton;
    @BindView
    protected Button mFindAtmButton;
    @BindView
    protected Button mSaveRequestButton;
    @BindView
    CustomTransferAndPayItem mobileNo;
    @BindView
    TextView requestTimeTextView;
    @BindView
    TextView returnTextView;
    @BindView
    TextView withdrawCodeTextView;

    public static CardlessSuccessfulRequestFragment MediaBrowserCompat$CustomActionResultReceiver(parseEventExecution parseeventexecution) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_CARDLESS_ATM_SUCCESFUL_REQUEST", parseeventexecution);
        CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment = new CardlessSuccessfulRequestFragment();
        cardlessSuccessfulRequestFragment.setArguments(bundle);
        return cardlessSuccessfulRequestFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86002131493827, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.cardlessATMSuccesfulRequestPresenter.MediaBrowserCompat$ItemReceiver(this);
        setExtract setextract = this.cardlessATMSuccesfulRequestPresenter;
        parseEventExecution parseeventexecution = (parseEventExecution) getArguments().getParcelable("com.scb.phone.EXTRA_CARDLESS_ATM_SUCCESFUL_REQUEST");
        setextract.MediaBrowserCompat$ItemReceiver = parseeventexecution;
        setupCameraView setupcameraview = new setupCameraView(parseeventexecution);
        if (setextract.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setupcameraview.IconCompatParcelizer(setextract.RatingCompat);
        }
        return inflate;
    }

    public final void IconCompatParcelizer(parseEventExecution parseeventexecution) {
        this.requestTimeTextView.setText(parseeventexecution.ParcelableVolumeInfo);
        this.mobileNo.setText(getString(R.string.mobile_no).toUpperCase());
        this.mobileNo.setValue(parseeventexecution.MediaDescriptionCompat);
        this.customSource.setSourceName(parseeventexecution.MediaBrowserCompat$CustomActionResultReceiver);
        this.customSource.setAccountNumber(parseeventexecution.MediaBrowserCompat$ItemReceiver);
        this.customSource.setAvatar(parseeventexecution.read, R.drawable.logo_scb_new);
        this.customSource.setAccountBalance(parseeventexecution.MediaBrowserCompat$MediaItem);
        this.customAmount.setText(getString(R.string.cardless_atm_amount).toUpperCase());
        this.customAmount.setValue(parseeventexecution.write);
        if (parseeventexecution.IconCompatParcelizer != null) {
            CustomTransferAndPayItem customTransferAndPayItem = this.customAmount;
            CrashlyticsReport.Session.Application application = parseeventexecution.IconCompatParcelizer;
            customTransferAndPayItem.amountInfo.setVisibility(0);
            customTransferAndPayItem.amountInfo.setValuesAligned(application, true);
            this.customAmount.mBottomSpace.setVisibility(8);
        }
        this.customAmount.mDividerView.setVisibility(8);
        this.customWithdrawCode.setText(getString(R.string.cardless_atm_withdraw_code).toUpperCase());
        this.customWithdrawCode.setWithdrawCode(parseeventexecution.RatingCompat);
        CustomCardlessWithdrawCodeItem customCardlessWithdrawCodeItem = this.customWithdrawCode;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.cardless_atm_withdraw_expire));
        sb.append(parseeventexecution.MediaMetadataCompat);
        customCardlessWithdrawCodeItem.setDateExpire(sb.toString());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ScbsOnboardingTcActivity.read(this, i, iArr);
    }

    public final void MediaBrowserCompat$ItemReceiver(parseEventExecution parseeventexecution) {
        ActivityBuilder_ScbsOnboardingTcActivity.read(this, parseeventexecution);
    }

    public final void write(parseEventExecution parseeventexecution) {
        Context context = getContext();
        if (!isDetached() && context != null) {
            setTabTitleTextAppearance settabtitletextappearance = this.cardlessScreenshotHelper;
            getUuidUtf8Bytes getuuidutf8bytes = new getUuidUtf8Bytes();
            getuuidutf8bytes.MediaBrowserCompat$SearchResultReceiver = parseeventexecution;
            getuuidutf8bytes.PlaybackStateCompat = setUuidFromUtf8Bytes.RatingCompat().MediaMetadataCompat("com.scb.phone.CARDLESS_REQESTER_FUNCTION");
            DebitCardResetOtpActivity.create(new setOnTabSelectListener(settabtitletextappearance, getuuidutf8bytes, true, context, true)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new ActivityBuilder_PhotoTakingDetailsActivity(this), new ActivityBuilder_ProductDetailActivitySCBS(this));
        }
    }

    public static void MediaBrowserCompat$MediaItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaDescriptionCompat() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public final void read() {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.confirm_cancel)).MediaBrowserCompat$ItemReceiver(getString(R.string.confirm_cancel_cardless_withdraw));
        CustomDialog IconCompatParcelizer = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm), new ActivityBuilder_OnboardingFatcaQuestionsActivity(this));
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), ActivityBuilder_ScbsAccountDetailActivity.write).show();
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null) {
            getActivity().sendBroadcast(new Intent("com.scb.phone/BROADCAST_SHOW_CANCEL_CARDLESS_CONFIRMATION_SNACK_BAR"));
            getActivity().finish();
        }
    }

    public final void write() {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.confirm_exit)).MediaBrowserCompat$ItemReceiver(getString(R.string.confirm_exit_cardless_withdraw));
        CustomDialog IconCompatParcelizer = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm), new ActivityBuilder_OnScbsInputActivity(this));
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.cancel), ActivityBuilder_QrPaymentCoachMarkActivity.IconCompatParcelizer).show();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ActionBarContainer();
        if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView() && getActivity() != null) {
            getActivity().finishAffinity();
        }
    }

    @OnClick
    public void onSaveRequestButtonClick() {
        setExtract setextract = this.cardlessATMSuccesfulRequestPresenter;
        setup setup = new setup(setextract);
        if (setextract.RatingCompat != null) {
            setup.IconCompatParcelizer(setextract.RatingCompat);
        }
    }

    @OnClick
    public void onCancelRequestButtonClick() {
        setExtract setextract = this.cardlessATMSuccesfulRequestPresenter;
        ContextImageStorage contextImageStorage = ContextImageStorage.IconCompatParcelizer;
        if (setextract.RatingCompat != null) {
            contextImageStorage.IconCompatParcelizer(setextract.RatingCompat);
        }
    }

    @OnClick
    public void onFindAtmButtonClick() {
        FindUsActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), true);
    }

    @OnClick
    public void onReturnHomeClick() {
        setExtract setextract = this.cardlessATMSuccesfulRequestPresenter;
        boolean z = true;
        if (setextract.read) {
            inject_buttonsBarView inject_buttonsbarview = inject_buttonsBarView.MediaBrowserCompat$CustomActionResultReceiver;
            if (setextract.RatingCompat == null) {
                z = false;
            }
            if (z) {
                inject_buttonsbarview.IconCompatParcelizer(setextract.RatingCompat);
                return;
            }
            return;
        }
        CaptureActivity_MembersInjector captureActivity_MembersInjector = CaptureActivity_MembersInjector.write;
        if (setextract.RatingCompat == null) {
            z = false;
        }
        if (z) {
            captureActivity_MembersInjector.IconCompatParcelizer(setextract.RatingCompat);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, Uri uri) {
        FragmentActivity activity = cardlessSuccessfulRequestFragment.getActivity();
        if (!uri.toString().isEmpty() && cardlessSuccessfulRequestFragment.getUserVisibleHint() && activity != null) {
            cardlessSuccessfulRequestFragment.cardlessATMSuccesfulRequestPresenter.read = true;
            AlertController$RecycleListView.write((Activity) activity, (int) R.id.root_view, (int) R.drawable.ic_check_circle_white_24dp, cardlessSuccessfulRequestFragment.getString(R.string.saved_cardless_request), (int) R.color.f67402131099896);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = cardlessSuccessfulRequestFragment.getActivity();
        if (!cardlessSuccessfulRequestFragment.isDetached() && activity != null) {
            AlertController$RecycleListView.write((Activity) activity, (int) R.id.root_view, (int) R.drawable.ic_error_white_24dp, cardlessSuccessfulRequestFragment.getString(R.string.saved_slip_error), (int) R.color.f66062131099761);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ActionBarContainer();
        if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView() && getActivity() != null) {
            getActivity().finishAffinity();
        }
    }
}

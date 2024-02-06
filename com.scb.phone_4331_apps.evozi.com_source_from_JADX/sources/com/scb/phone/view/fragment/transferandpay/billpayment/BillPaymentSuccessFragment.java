package com.scb.phone.view.fragment.transferandpay.billpayment;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.donations.SharingMomentsPreviewActivity;
import com.scb.phone.view.custom.accountsummary.ImageAdBannerView;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomMovieTicket;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.transferandpay.BaseSuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.jmrtd.lds.ImageInfo;
import p040o.ActivityBuilder_ContributesHmlNTBRepaymentAboutActivity;
import p040o.ActivityBuilder_ContributesHmlPromptPayVerificationActivity;
import p040o.ActivityBuilder_ContributesHmlUserInfoActivity;
import p040o.ActivityBuilder_ContributesNTBHmlBusinessURLInformationActivity;
import p040o.ActivityBuilder_ContributesPartnerDiscoverWebViewActivity;
import p040o.ActivityBuilder_ContributesPrivacyConsentActivity;
import p040o.ActivityBuilder_ContributesPullSlipActivity;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.execute;
import p040o.getDeviceFile;
import p040o.getICheckDeserializerRtti;
import p040o.getOversizeImage;
import p040o.getRegistrationsAddresses;
import p040o.getUuidUtf8Bytes;
import p040o.onCheckBoxClick;
import p040o.setImageOutListener;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class BillPaymentSuccessFragment extends BaseSuccessFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer, ViewTreeObserver.OnGlobalLayoutListener, FragmentBuilder_BindBaseFragment {
    public CustomInputDialog IconCompatParcelizer;
    private Uri MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat = false;
    private boolean MediaMetadataCompat = false;
    private boolean MediaSessionCompat$QueueItem = false;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    public getUuidUtf8Bytes RatingCompat;
    @BindView
    RecyclerView additionalRecyclerView;
    @BindView
    DefaultButton autoSaveOffDonationsSaveButton;
    @BindView
    DefaultButton autoSaveOffSaveButton;
    @BindView
    DefaultButton autoSaveOffShareButton;
    @BindView
    LinearLayout billLinearLayout;
    @BindView
    RelativeLayout billPaymentRelativeLayout;
    @BindView
    TextView coachmarkQRCodeSectionDescription;
    @BindView
    TextView coachmarkQRCodeSectionHeader;
    @BindView
    ImageView endSlipImage;
    @BindView
    ImageView expandIcon;
    @BindView
    ImageAdBannerView imageAdBannerView;
    @BindView
    View lineBlackView;
    @BindView
    View lineView;
    @BindView
    ImageView mOverlayQRCodeSectionCoachmarkImageView;
    @BindView
    RelativeLayout mQRCodeSectionCoachmarkContainer;
    @BindView
    TextView mRemainingBalanceTextView;
    @BindView
    RelativeLayout mRootView;
    @BindView
    CustomMovieTicket movieTicket;
    @BindView
    public TextView qrCodeDescriptionTextView;
    @BindView
    public ImageView qrCodeImageView;
    @BindView
    LinearLayout qrCodeLayout;
    @BindView
    public TextView qrCodeSectionHeaderTextView;
    @BindView
    LinearLayout qrCodeSectionView;
    @BindView
    public TextView refIdTextView;
    @BindView
    TextView returnTextView;
    @BindView
    TextView scheduleNote;
    @BindView
    DefaultButton shareButton;
    @BindView
    DefaultButton shareMomentButton;
    @BindView
    RelativeLayout slipRelativeLayout;
    @HmlPinActivity
    public setImageOutListener successPresenter;
    @HmlPinActivity
    public FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment successScreenshotHelper;
    @BindView
    ViewGroup ticketDivider;

    public static BillPaymentSuccessFragment read(getUuidUtf8Bytes getuuidutf8bytes) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        BillPaymentSuccessFragment billPaymentSuccessFragment = new BillPaymentSuccessFragment();
        billPaymentSuccessFragment.setArguments(bundle);
        return billPaymentSuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85802131493807, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            getUuidUtf8Bytes getuuidutf8bytes = (getUuidUtf8Bytes) arguments.getParcelable("com.scb.phone.EXTRA_SUCCESS");
            this.RatingCompat = getuuidutf8bytes;
            this.MediaBrowserCompat$CustomActionResultReceiver = getuuidutf8bytes.PlaybackStateCompat;
            read(this.RatingCompat, inflate, getContext());
            this.successPresenter.MediaBrowserCompat$ItemReceiver(this);
            this.MediaBrowserCompat$SearchResultReceiver = TextUtils.isEmpty(this.RatingCompat.MediaSessionCompat$ResultReceiverWrapper) && this.RatingCompat.RatingCompat != null && this.RatingCompat.RatingCompat.MediaBrowserCompat$ItemReceiver != null && !this.RatingCompat.RatingCompat.MediaBrowserCompat$ItemReceiver.isEmpty();
            this.MediaDescriptionCompat = MediaBrowserCompat$ItemReceiver(this.RatingCompat);
            TextView textView = this.mRemainingBalanceTextView;
            String string = getString(R.string.remaining_balance);
            Object[] objArr = new Object[2];
            objArr[0] = "BILLPAYMENT".equals(this.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat()) ? getString(R.string.bill_payment_remaining_limit).toLowerCase() : "";
            objArr[1] = this.RatingCompat.MediaSessionCompat$QueueItem;
            textView.setText(String.format(string, objArr));
            if (this.RatingCompat.PlaybackStateCompat.setShortcut != null) {
                this.customTarget.setAddFavoriteButtonVisible(false);
                this.userNote.divider.setVisibility(8);
                this.userNote.bottomSpace.setVisibility(8);
                this.movieTicket.setVisibility(0);
                this.ticketDivider.setVisibility(0);
                CrashlyticsReport.Session.Event.Device device = this.RatingCompat.PlaybackStateCompat.setShortcut;
                this.movieTicket.setQrCode(this.RatingCompat.MediaSessionCompat$ResultReceiverWrapper);
                this.movieTicket.setPoster(device.RatingCompat);
                this.movieTicket.setTitle(device.MediaSessionCompat$ResultReceiverWrapper);
                this.movieTicket.setCinemaLocation(device.MediaBrowserCompat$ItemReceiver);
                this.movieTicket.setShowtime(device.write);
                this.movieTicket.setCinemaNumber(device.IconCompatParcelizer);
                this.movieTicket.setSeat(device.MediaSessionCompat$QueueItem);
                this.movieTicket.setBookingId(this.RatingCompat.MediaMetadataCompat);
            } else if (this.RatingCompat.MediaSessionCompat$ResultReceiverWrapper != null && !this.RatingCompat.MediaSessionCompat$ResultReceiverWrapper.isEmpty()) {
                this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
                this.qrCodeLayout.setVisibility(0);
                this.refIdTextView.setText(this.RatingCompat.ParcelableVolumeInfo);
                AlertController$RecycleListView();
                getICheckDeserializerRtti.write(this.RatingCompat.MediaSessionCompat$ResultReceiverWrapper, 500, 500, execute.M).subscribe(new ActivityBuilder_ContributesHmlNTBRepaymentAboutActivity(this), new ActivityBuilder_ContributesPrivacyConsentActivity(this));
            }
            if (this.MediaBrowserCompat$SearchResultReceiver) {
                this.userNote.divider.setVisibility(this.MediaDescriptionCompat ^ true ? 0 : 8);
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(getContext(), this.additionalRecyclerView, this.RatingCompat.RatingCompat.MediaBrowserCompat$ItemReceiver, (FragmentBuilder_BindBaseFragment) this, true);
            }
            if (this.RatingCompat.PlaybackStateCompat.setShowingForActionMode == null) {
                String str = this.MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource;
                if (!(str == null || str.length() == 0)) {
                    this.customTarget.setFavoriteName(str);
                } else {
                    String str2 = this.RatingCompat.MediaBrowserCompat$MediaItem;
                    if (!(str2 == null || str2.length() == 0)) {
                        CustomTransferAndPayTarget customTransferAndPayTarget = this.customTarget;
                        customTransferAndPayTarget.mFavouriteIcon.setVisibility(8);
                        customTransferAndPayTarget.mFavouriteName.setVisibility(8);
                    } else if (this.RatingCompat.PlaybackStateCompat.setShortcut != null) {
                        this.customTarget.setAddFavoriteButtonVisible(false);
                    } else {
                        this.customTarget.setAddFavoriteButtonVisible(true);
                    }
                }
                if (!this.MediaBrowserCompat$SearchResultReceiver) {
                    this.successPresenter.write();
                }
            } else {
                CustomTransferAndPayTarget customTransferAndPayTarget2 = this.customTarget;
                customTransferAndPayTarget2.mFavouriteIcon.setVisibility(8);
                customTransferAndPayTarget2.mFavouriteName.setVisibility(8);
                this.customTarget.setAddFavoriteButtonVisible(false);
                this.mRemainingBalanceTextView.setVisibility(8);
                this.scheduleNote.setVisibility(0);
            }
            if ("BSCANC_SUCCESS_FUNCTION".equalsIgnoreCase(this.RatingCompat.PlaybackStateCompat.MediaDescriptionCompat())) {
                this.customTarget.setAddFavoriteButtonVisible(false);
                this.mRemainingBalanceTextView.setVisibility(8);
                this.scheduleNote.setVisibility(8);
            }
            if ("E_DONATION_FUNCTION".equalsIgnoreCase(this.RatingCompat.PlaybackStateCompat.setOverflowReserved) && !this.RatingCompat.MediaBrowserCompat$ItemReceiver.booleanValue()) {
                this.customTarget.setAddFavoriteButtonVisible(false);
            }
            if (this.MediaDescriptionCompat && getActivity() != null) {
                this.endSlipImage.setBackgroundColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f71012131100257));
            }
            this.successPresenter.read(this.RatingCompat);
        }
        return inflate;
    }

    public final void MediaDescriptionCompat() {
        CustomTransferAndPayTarget customTransferAndPayTarget = this.customTarget;
        customTransferAndPayTarget.mFavouriteIcon.setVisibility(8);
        customTransferAndPayTarget.mFavouriteName.setVisibility(8);
        this.customTarget.setAddFavoriteButtonVisible(false);
    }

    /* renamed from: J_ */
    public final void mo18708J_() {
        this.customTarget.setAddFavoriteButtonVisible(true);
    }

    /* renamed from: j_ */
    public final void mo18712j_(String str) {
        this.customTarget.setFavoriteName(str);
    }

    public void onDestroy() {
        setImageOutListener setimageoutlistener = this.successPresenter;
        if (setimageoutlistener != null) {
            setimageoutlistener.onDestroy();
        }
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_ContributesPartnerDiscoverWebViewActivity.read(this, i, iArr);
    }

    public final void IconCompatParcelizer(boolean z) {
        Context context = getContext();
        if (!isDetached() && context != null && !this.MediaSessionCompat$ResultReceiverWrapper && this.RatingCompat.PlaybackStateCompat.setShowingForActionMode == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = !z;
            this.successScreenshotHelper.read(this.RatingCompat, context, true, z).subscribe(new ActivityBuilder_ContributesPullSlipActivity(this), new ActivityBuilder_ContributesNTBHmlBusinessURLInformationActivity(this));
        }
    }

    public static void MediaBrowserCompat$MediaItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void RatingCompat() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onShareButtonClick() {
        Uri uri = this.MediaBrowserCompat$MediaItem;
        if (uri == null || uri.toString().isEmpty()) {
            MediaBrowserCompat$ItemReceiver(R.string.share_error, getOversizeImage.ERROR);
            return;
        }
        if (getActivity() instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) getActivity();
            if (MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat)) {
                baseActivity.scbAnalytics.write("share_slip_action", new ZSYR2K("source", "movie"));
            } else if (write()) {
                baseActivity.scbAnalytics.write("billpay_slip", new ZSYR2K("source", AbsActionBarView()), new ZSYR2K("subtype", setVisibility()), new ZSYR2K("button", "share_slip"));
            } else {
                baseActivity.mo13676d_("share_slip_action");
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", this.MediaBrowserCompat$MediaItem);
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                createChooser = setTapText.write(activity, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @OnClick
    @Optional
    public void onReturnHomeClick() {
        try {
            Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse("scbeasy://accountsummary")).addFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    addFlags = setTapText.write(activity, addFlags).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(addFlags.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(addFlags);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (getActivity() != null) {
                getActivity().finish();
            }
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onAddFavoriteClick() {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
        String string = getString(R.string.favourite_name);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        customInputDialog.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                BillPaymentSuccessFragment.this.IconCompatParcelizer.mErrorTextView.setVisibility(8);
            }
        });
        CustomInputDialog customInputDialog2 = this.IconCompatParcelizer;
        customInputDialog2.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        this.IconCompatParcelizer.setCanceledOnTouchOutside(false);
        this.IconCompatParcelizer.mEditTextView.setVisibility(0);
        CustomInputDialog customInputDialog3 = this.IconCompatParcelizer;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), ActivityBuilder_ContributesHmlUserInfoActivity.write);
        CustomInputDialog customInputDialog4 = this.IconCompatParcelizer;
        String string2 = getString(R.string.add_favourite);
        ActivityBuilder_ContributesHmlPromptPayVerificationActivity activityBuilder_ContributesHmlPromptPayVerificationActivity = new ActivityBuilder_ContributesHmlPromptPayVerificationActivity(this);
        if (string2 != null) {
            customInputDialog4.mPositiveButton.setText(string2);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, activityBuilder_ContributesHmlPromptPayVerificationActivity, false));
        }
        if (isAdded() && getContext() != null) {
            this.IconCompatParcelizer.show();
        }
    }

    /* renamed from: e_ */
    public final void mo18711e_(String str) {
        MediaBrowserCompat$ItemReceiver(R.string.favourite_added_successfully, getOversizeImage.SUCCESS);
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        if (customInputDialog != null) {
            customInputDialog.dismiss();
        }
        this.customTarget.setFavoriteName(str);
        this.customTarget.setAddFavoriteButtonVisible(false);
    }

    /* renamed from: I_ */
    public final void mo18706I_() {
        this.MediaMetadataCompat = true;
        this.MediaSessionCompat$QueueItem = true;
        if (!this.RatingCompat.f2601x50fd9e4a) {
            this.shareButton.setVisibility(0);
            this.autoSaveOffSaveButton.setVisibility(8);
            this.autoSaveOffShareButton.setVisibility(8);
        } else {
            this.shareButton.setVisibility(8);
            this.shareMomentButton.setVisibility(0);
            this.autoSaveOffShareButton.setVisibility(0);
        }
        ActivityBuilder_ContributesPartnerDiscoverWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver(this, false);
    }

    /* renamed from: a_ */
    public final void mo18710a_(access$2200 access_2200) {
        write(access_2200);
    }

    public final void IconCompatParcelizer(getDeviceFile getdevicefile) {
        SharingMomentsPreviewActivity.read(getContext(), getdevicefile);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaSessionCompat$QueueItem = true;
        ActivityBuilder_ContributesPartnerDiscoverWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipDonationsButton() {
        this.MediaSessionCompat$QueueItem = true;
        ActivityBuilder_ContributesPartnerDiscoverWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void setShareMomentButton() {
        this.successPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
    }

    /* renamed from: G_ */
    public final void mo18704G_() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", AbsActionBarView()), new ZSYR2K("subtype", setVisibility()), new ZSYR2K("button", "share_moment")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("billpay_slip", zsyr2kArr);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void shareSlipButton() {
        onShareButtonClick();
    }

    private void MediaBrowserCompat$ItemReceiver(int i, getOversizeImage getoversizeimage) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(i);
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.success_view_container, string, getoversizeimage);
            }
        }
    }

    @OnClick
    public void onClickQRCodeLayout() {
        if (this.qrCodeSectionView.getVisibility() == 8) {
            FragmentBuilder_BindDeejungPlansFragment.write(this.qrCodeSectionView);
        } else {
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.qrCodeSectionView);
        }
        FragmentBuilder_BindDeejungPlansFragment.read(this.expandIcon);
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @OnClick
    public void closeTutorial() {
        this.mRootView.removeView(this.mQRCodeSectionCoachmarkContainer);
        this.mRootView.removeView(this.mOverlayQRCodeSectionCoachmarkImageView);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (getContext() != null) {
            this.successPresenter.write();
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(BillPaymentSuccessFragment billPaymentSuccessFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = billPaymentSuccessFragment.getActivity();
        if (!billPaymentSuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = billPaymentSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = billPaymentSuccessFragment.getString(R.string.saved_slip_error);
                if (billPaymentSuccessFragment.getActivity() != null) {
                    ((BaseActivity) billPaymentSuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
        }
    }

    public static /* synthetic */ void write(BillPaymentSuccessFragment billPaymentSuccessFragment, Uri uri) {
        billPaymentSuccessFragment.MediaBrowserCompat$MediaItem = uri;
        FragmentActivity activity = billPaymentSuccessFragment.getActivity();
        if (!uri.toString().isEmpty() && billPaymentSuccessFragment.getUserVisibleHint() && activity != null && billPaymentSuccessFragment.MediaSessionCompat$QueueItem) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = billPaymentSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = billPaymentSuccessFragment.getString(R.string.saved_slip);
                if (billPaymentSuccessFragment.getActivity() != null) {
                    ((BaseActivity) billPaymentSuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
            billPaymentSuccessFragment.MediaSessionCompat$QueueItem = false;
        }
    }

    /* renamed from: H_ */
    public final void mo18705H_() {
        Context context = getContext();
        if (!isDetached() && context != null) {
            this.successScreenshotHelper.read(this.RatingCompat, context, this.MediaMetadataCompat, false).subscribe(new ActivityBuilder_ContributesPullSlipActivity(this), new ActivityBuilder_ContributesNTBHmlBusinessURLInformationActivity(this));
        }
        this.MediaMetadataCompat = false;
        this.MediaSessionCompat$QueueItem = false;
        if (!this.RatingCompat.f2601x50fd9e4a) {
            this.autoSaveOffSaveButton.setVisibility(0);
            this.autoSaveOffShareButton.setVisibility(0);
            this.shareButton.setVisibility(8);
            return;
        }
        this.shareButton.setVisibility(8);
        this.shareMomentButton.setVisibility(0);
        this.autoSaveOffShareButton.setVisibility(0);
        this.autoSaveOffDonationsSaveButton.setVisibility(0);
    }
}

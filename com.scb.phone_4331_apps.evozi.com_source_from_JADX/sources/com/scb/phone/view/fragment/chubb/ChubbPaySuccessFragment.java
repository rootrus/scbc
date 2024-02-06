package com.scb.phone.view.fragment.chubb;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.donations.SharingMomentsPreviewActivity;
import com.scb.phone.view.activity.prelogin.QuickOperationSuccessActivity;
import com.scb.phone.view.adapter.chubb.PaymentInfoAdapter;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.transferandpay.BaseSuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Iterator;
import java.util.List;
import org.jmrtd.lds.ImageInfo;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.CrashlyticsReport;
import p040o.CycleDetector;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SwitchCompat;
import p040o.ThemesService;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.downloadTheme;
import p040o.getAllTilesList;
import p040o.getDeviceFile;
import p040o.getICheckDeserializerRtti;
import p040o.getMerchantAppTermsAndConditions;
import p040o.getOversizeImage;
import p040o.getUuidUtf8Bytes;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setExitButtonEnabled;
import p040o.setImageOutListener;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class ChubbPaySuccessFragment extends BaseSuccessFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer, ViewTreeObserver.OnGlobalLayoutListener, FragmentBuilder_BindBaseFragment {
    private Uri IconCompatParcelizer;
    private boolean MediaBrowserCompat$MediaItem = false;
    private boolean MediaDescriptionCompat;
    private CycleDetector.C33061 RatingCompat;
    @BindView
    Button autoSaveOffDonationsSaveButton;
    @BindView
    Button autoSaveOffSaveButton;
    @BindView
    Button autoSaveOffShareButton;
    @BindView
    LinearLayout billLinearLayout;
    @BindView
    RelativeLayout billPaymentRelativeLayout;
    @BindView
    TextView coachmarkQRCodeSectionDescription;
    @BindView
    TextView coachmarkQRCodeSectionHeader;
    @BindView
    protected LinearLayout deeplinkCallbackButtonLayout;
    @BindView
    ImageView endSlipImage;
    @BindView
    ImageView expandIcon;
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
    TextView qrCodeDescriptionTextView;
    @BindView
    ImageView qrCodeImageView;
    @BindView
    LinearLayout qrCodeLayout;
    @BindView
    TextView qrCodeSectionHeaderTextView;
    @BindView
    LinearLayout qrCodeSectionView;
    @BindView
    RecyclerView recyclerViewChubb;
    @BindView
    TextView refIdTextView;
    @BindView
    TextView returnTextView;
    @BindView
    Button shareButton;
    @BindView
    Button shareMomentButton;
    @BindView
    RelativeLayout slipRelativeLayout;
    @HmlPinActivity
    public setImageOutListener successPresenter;
    @HmlPinActivity
    public setExitButtonEnabled themesSlipPresenter;

    /* renamed from: a_ */
    public final void mo18710a_(access$2200 access_2200) {
    }

    /* renamed from: e_ */
    public final void mo18711e_(String str) {
    }

    public class ChubbScreenshot_ViewBinding implements Unbinder {
        private ChubbScreenshot MediaBrowserCompat$ItemReceiver;

        public ChubbScreenshot_ViewBinding(ChubbScreenshot chubbScreenshot, View view) {
            this.MediaBrowserCompat$ItemReceiver = chubbScreenshot;
            chubbScreenshot.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            chubbScreenshot.textDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textDateTime'", TextView.class);
            chubbScreenshot.textReferenceId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'textReferenceId'", TextView.class);
            chubbScreenshot.successIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_icon, "field 'successIcon'", ImageView.class);
            chubbScreenshot.customSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_source, "field 'customSource'", CustomTransferAndPaySource.class);
            chubbScreenshot.customTarget = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_target, "field 'customTarget'", CustomTransferAndPayTarget.class);
            chubbScreenshot.customAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_amount, "field 'customAmount'", CustomTransferAndPayItem.class);
            chubbScreenshot.customFees = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_fees, "field 'customFees'", CustomTransferAndPayItem.class);
            chubbScreenshot.billerNote = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_biller_note, "field 'billerNote'", CustomNoteItem.class);
            chubbScreenshot.userNote = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_user_note, "field 'userNote'", CustomNoteItem.class);
            chubbScreenshot.fullDivider = onStart.IconCompatParcelizer(view, R.id.full_divider, "field 'fullDivider'");
            chubbScreenshot.recyclerViewChubb = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_chubb, "field 'recyclerViewChubb'", RecyclerView.class);
        }

        public final void read() {
            ChubbScreenshot chubbScreenshot = this.MediaBrowserCompat$ItemReceiver;
            if (chubbScreenshot != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                chubbScreenshot.textTitle = null;
                chubbScreenshot.textDateTime = null;
                chubbScreenshot.textReferenceId = null;
                chubbScreenshot.successIcon = null;
                chubbScreenshot.customSource = null;
                chubbScreenshot.customTarget = null;
                chubbScreenshot.customAmount = null;
                chubbScreenshot.customFees = null;
                chubbScreenshot.billerNote = null;
                chubbScreenshot.userNote = null;
                chubbScreenshot.fullDivider = null;
                chubbScreenshot.recyclerViewChubb = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((ChubbPaySuccessFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static ChubbPaySuccessFragment MediaBrowserCompat$ItemReceiver(CycleDetector.C33061 r2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS", r2);
        ChubbPaySuccessFragment chubbPaySuccessFragment = new ChubbPaySuccessFragment();
        chubbPaySuccessFragment.setArguments(bundle);
        return chubbPaySuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86192131493846, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.RatingCompat = (CycleDetector.C33061) arguments.getParcelable("com.scb.phone.EXTRA_SUCCESS");
            this.successPresenter.MediaBrowserCompat$ItemReceiver(this);
            CycleDetector.C33061 r9 = this.RatingCompat;
            super.read(r9, inflate, getContext());
            this.successPresenter.read((getUuidUtf8Bytes) r9);
            CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (builder == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentPartnerReviewDisplay");
            }
            CustomTransferAndPayTarget customTransferAndPayTarget = this.customTarget;
            customTransferAndPayTarget.mFavouriteIcon.setVisibility(8);
            customTransferAndPayTarget.mFavouriteName.setVisibility(8);
            Context context = getContext();
            RecyclerView recyclerView = this.recyclerViewChubb;
            List<CrashlyticsReport.Session.OperatingSystem.Builder> list = builder.RatingCompat;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("paymentInfoDisplay");
            }
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(context, recyclerView, list, (FragmentBuilder_BindBaseFragment) this, true);
            this.mRemainingBalanceTextView.setText(String.format(getString(R.string.remaining_balance), new Object[]{getString(R.string.bill_payment_remaining_limit).toLowerCase(), this.RatingCompat.MediaSessionCompat$QueueItem}));
            if (this.RatingCompat.read != null && this.RatingCompat.read.size() > 0) {
                for (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage next : this.RatingCompat.read) {
                    Button button = (Button) getLayoutInflater().inflate(R.layout.f81152131493341, (ViewGroup) null);
                    button.setText(next.MediaBrowserCompat$CustomActionResultReceiver);
                    button.setOnClickListener(new ThemesService(this, next));
                    this.deeplinkCallbackButtonLayout.addView(button);
                }
            }
            if (getActivity() != null) {
                List<CrashlyticsReport.Session.OperatingSystem.Builder> list2 = builder.RatingCompat;
                if (list2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("paymentInfoDisplay");
                }
                if (list2 != null) {
                    Iterator<CrashlyticsReport.Session.OperatingSystem.Builder> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!TextUtils.isEmpty(it.next().read)) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    this.endSlipImage.setBackgroundColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f71012131100257));
                }
            }
        }
        return inflate;
    }

    public final void read(getUuidUtf8Bytes getuuidutf8bytes, View view, Context context) {
        super.read(getuuidutf8bytes, view, context);
        this.successPresenter.read(getuuidutf8bytes);
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
        getAllTilesList.MediaBrowserCompat$ItemReceiver(this, i, iArr);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Context context = getContext();
        if (!isDetached() && context != null && !this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = true;
            DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new write(this), new ChubbScreenshot(String.format("TXN_%s", new Object[]{this.RatingCompat.MediaSessionCompat$Token}), this.RatingCompat, this, z, false), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new getMerchantAppTermsAndConditions(this), new downloadTheme(this));
        }
    }

    public static void MediaMetadataCompat() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaBrowserCompat$MediaItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onShareButtonClick() {
        Uri uri = this.IconCompatParcelizer;
        if (uri == null || uri.toString().isEmpty()) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.share_error);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.success_view_container, string, getoversizeimage);
                    return;
                }
                return;
            }
            return;
        }
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).mo13676d_("share_slip_action");
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", this.IconCompatParcelizer);
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                createChooser = setTapText.write(activity2, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(createChooser);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @OnClick
    @Optional
    public void onReturnHomeClick() {
        if (getActivity() != null) {
            getActivity().finishAffinity();
        }
        HomeActivity.write(getContext(), true);
    }

    /* renamed from: I_ */
    public final void mo18706I_() {
        this.MediaBrowserCompat$MediaItem = true;
        if (!this.RatingCompat.f2601x50fd9e4a) {
            this.shareButton.setVisibility(0);
            this.autoSaveOffSaveButton.setVisibility(8);
            this.autoSaveOffShareButton.setVisibility(8);
        } else {
            this.shareButton.setVisibility(8);
            this.shareMomentButton.setVisibility(0);
            this.autoSaveOffShareButton.setVisibility(0);
        }
        getAllTilesList.MediaBrowserCompat$ItemReceiver(this, false);
    }

    public final void IconCompatParcelizer(getDeviceFile getdevicefile) {
        SharingMomentsPreviewActivity.read(getContext(), getdevicefile);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaBrowserCompat$MediaItem = true;
        getAllTilesList.MediaBrowserCompat$ItemReceiver(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipDonationsButton() {
        this.MediaBrowserCompat$MediaItem = true;
        getAllTilesList.MediaBrowserCompat$ItemReceiver(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void setShareMomentButton() {
        this.successPresenter.MediaBrowserCompat$CustomActionResultReceiver((getUuidUtf8Bytes) this.RatingCompat);
    }

    /* renamed from: G_ */
    public final void mo18704G_() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("button", "share_moment")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("billpay_slip", zsyr2kArr);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void shareSlipButton() {
        onShareButtonClick();
    }

    public void onGlobalLayout() {
        this.mRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (getContext() != null) {
            this.successPresenter.write();
        }
    }

    @OnClick
    public void closeTutorial() {
        this.mRootView.removeView(this.mQRCodeSectionCoachmarkContainer);
        this.mRootView.removeView(this.mOverlayQRCodeSectionCoachmarkImageView);
    }

    public class ChubbScreenshot extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        CycleDetector.C33061 IconCompatParcelizer;
        @BindView
        CustomNoteItem billerNote;
        @BindView
        CustomTransferAndPayItem customAmount;
        @BindView
        CustomTransferAndPayItem customFees;
        @BindView
        CustomTransferAndPaySource customSource;
        @BindView
        CustomTransferAndPayTarget customTarget;
        @BindView
        View fullDivider;
        FragmentBuilder_BindBaseFragment read;
        @BindView
        RecyclerView recyclerViewChubb;
        @BindView
        ImageView successIcon;
        @BindView
        TextView textDateTime;
        @BindView
        TextView textReferenceId;
        @BindView
        TextView textTitle;
        @BindView
        CustomNoteItem userNote;

        public ChubbScreenshot(String str, CycleDetector.C33061 r3, FragmentBuilder_BindBaseFragment fragmentBuilder_BindBaseFragment, boolean z, boolean z2) {
            super(R.layout.f91212131494348, str, z2, z);
            this.IconCompatParcelizer = r3;
            this.read = fragmentBuilder_BindBaseFragment;
        }
    }

    public class write extends FragmentBuilder_BindEBillSelectedFragment<ChubbScreenshot> {
        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            ChubbScreenshot chubbScreenshot = (ChubbScreenshot) simpleForwardingListenableFuture;
            ButterKnife.IconCompatParcelizer(chubbScreenshot, view);
            chubbScreenshot.successIcon.getDrawable().mutate().setColorFilter(setLastBaselineToBottomHeight.read(ChubbPaySuccessFragment.this.getContext(), R.color.f66422131099798), PorterDuff.Mode.SRC_ATOP);
            chubbScreenshot.textTitle.setText(chubbScreenshot.IconCompatParcelizer.AlertController$RecycleListView);
            chubbScreenshot.textDateTime.setText(chubbScreenshot.IconCompatParcelizer.MediaDescriptionCompat);
            chubbScreenshot.textReferenceId.setText(chubbScreenshot.IconCompatParcelizer.MediaSessionCompat$Token);
            chubbScreenshot.customAmount.amountInfo.setVisibility(8);
            chubbScreenshot.fullDivider.setVisibility(8);
            CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = chubbScreenshot.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (builder == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("billPaymentPartnerReviewDisplay");
            }
            setUuidFromUtf8Bytes setuuidfromutf8bytes = chubbScreenshot.IconCompatParcelizer.PlaybackStateCompat;
            chubbScreenshot.customSource.setAvatar(setuuidfromutf8bytes.setGroupDividerEnabled.toString());
            chubbScreenshot.customSource.setSourceName(setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver());
            chubbScreenshot.customSource.setAccountNumber(setuuidfromutf8bytes.MediaBrowserCompat$CustomActionResultReceiver());
            chubbScreenshot.customSource.setDivider(false);
            chubbScreenshot.customTarget.setTargetName(setuuidfromutf8bytes.IconCompatParcelizer());
            chubbScreenshot.customTarget.setAvatar(getICheckDeserializerRtti.write(ChubbPaySuccessFragment.this.getContext(), (int) R.drawable.biller_place_holder).toString());
            if (!TextUtils.isEmpty(setuuidfromutf8bytes.setContentView)) {
                chubbScreenshot.customTarget.setBillerAvatar(setuuidfromutf8bytes.setContentView);
            } else {
                chubbScreenshot.customTarget.setBillerAvatar(setuuidfromutf8bytes.ParcelableVolumeInfo);
            }
            CustomTransferAndPayTarget customTransferAndPayTarget = chubbScreenshot.customTarget;
            customTransferAndPayTarget.mFavouriteIcon.setVisibility(8);
            customTransferAndPayTarget.mFavouriteName.setVisibility(8);
            chubbScreenshot.customTarget.setReferenceNumbers(setuuidfromutf8bytes.AlertController$RecycleListView);
            chubbScreenshot.customTarget.setFullDivider(true);
            chubbScreenshot.customAmount.setValue(setuuidfromutf8bytes.f2965x50fd9e4a.MediaBrowserCompat$ItemReceiver);
            CustomTransferAndPayItem customTransferAndPayItem = chubbScreenshot.customAmount;
            CrashlyticsReport.Session.Application application = setuuidfromutf8bytes.f2965x50fd9e4a;
            customTransferAndPayItem.amountInfo.setVisibility(0);
            customTransferAndPayItem.amountInfo.setValues(application);
            if (TextUtils.isEmpty(setuuidfromutf8bytes.MediaMetadataCompat()) || setuuidfromutf8bytes.MediaMetadataCompat().equals("0.00")) {
                chubbScreenshot.customFees.setVisibility(8);
                chubbScreenshot.customAmount.mDividerView.setVisibility(TextUtils.isEmpty(setuuidfromutf8bytes.setOnMenuItemClickListener) ^ true ? 0 : 8);
                chubbScreenshot.customAmount.mBottomSpace.setVisibility(8);
                chubbScreenshot.customAmount.setFullDivider(true);
            } else {
                chubbScreenshot.customFees.setValue(setuuidfromutf8bytes.MediaMetadataCompat());
                chubbScreenshot.customFees.mTopSpace.setVisibility(8);
                chubbScreenshot.customFees.setFullDivider(true);
            }
            Context context = ChubbPaySuccessFragment.this.getContext();
            if (TextUtils.isEmpty(setuuidfromutf8bytes.setForceShowIcon)) {
                chubbScreenshot.billerNote.setVisibility(8);
                if ((ChubbPaySuccessFragment.this.getActivity() instanceof QuickOperationSuccessActivity) || TextUtils.isEmpty(setuuidfromutf8bytes.setOnMenuItemClickListener)) {
                    chubbScreenshot.customFees.mDividerView.setVisibility(8);
                }
            } else {
                chubbScreenshot.billerNote.setTitle(context.getString(R.string.review_biller_note));
                chubbScreenshot.billerNote.setText(setuuidfromutf8bytes.setForceShowIcon);
                chubbScreenshot.billerNote.setVisibility(0);
                if ((ChubbPaySuccessFragment.this.getActivity() instanceof QuickOperationSuccessActivity) || TextUtils.isEmpty(setuuidfromutf8bytes.setOnMenuItemClickListener)) {
                    chubbScreenshot.billerNote.divider.setVisibility(8);
                }
            }
            Context context2 = ChubbPaySuccessFragment.this.getContext();
            if (!TextUtils.isEmpty(setuuidfromutf8bytes.setOnMenuItemClickListener)) {
                chubbScreenshot.userNote.setTitle(context2.getString(R.string.request_to_pay_incoming_note));
                chubbScreenshot.userNote.setText(setuuidfromutf8bytes.setOnMenuItemClickListener);
                chubbScreenshot.userNote.divider.setVisibility(8);
            } else {
                chubbScreenshot.userNote.setVisibility(8);
            }
            RecyclerView recyclerView = chubbScreenshot.recyclerViewChubb;
            ChubbPaySuccessFragment.this.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            SwitchCompat.IconCompatParcelizer((View) chubbScreenshot.recyclerViewChubb, false);
            PaymentInfoAdapter paymentInfoAdapter = new PaymentInfoAdapter(ChubbPaySuccessFragment.this.getContext(), chubbScreenshot.read, true);
            chubbScreenshot.recyclerViewChubb.setAdapter(paymentInfoAdapter);
            List<CrashlyticsReport.Session.OperatingSystem.Builder> list = builder.RatingCompat;
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("paymentInfoDisplay");
            }
            paymentInfoAdapter.read = true;
            paymentInfoAdapter.write = list;
            paymentInfoAdapter.IconCompatParcelizer.write();
        }

        public write(ChubbPaySuccessFragment chubbPaySuccessFragment) {
            super(chubbPaySuccessFragment.themesSlipPresenter);
        }
    }

    public static /* synthetic */ void write(ChubbPaySuccessFragment chubbPaySuccessFragment, Uri uri) {
        chubbPaySuccessFragment.IconCompatParcelizer = uri;
        FragmentActivity activity = chubbPaySuccessFragment.getActivity();
        if (!uri.toString().isEmpty() && chubbPaySuccessFragment.getUserVisibleHint() && activity != null && chubbPaySuccessFragment.MediaBrowserCompat$MediaItem) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = chubbPaySuccessFragment.getActivity();
            if (activity2 != null) {
                String string = chubbPaySuccessFragment.getString(R.string.saved_slip);
                if (chubbPaySuccessFragment.getActivity() != null) {
                    ((BaseActivity) chubbPaySuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
            chubbPaySuccessFragment.MediaBrowserCompat$MediaItem = false;
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ChubbPaySuccessFragment chubbPaySuccessFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = chubbPaySuccessFragment.getActivity();
        if (!chubbPaySuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = chubbPaySuccessFragment.getActivity();
            if (activity2 != null) {
                String string = chubbPaySuccessFragment.getString(R.string.saved_slip_error);
                if (chubbPaySuccessFragment.getActivity() != null) {
                    ((BaseActivity) chubbPaySuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
        }
    }

    /* renamed from: H_ */
    public final void mo18705H_() {
        Context context = getContext();
        if (!isDetached() && context != null) {
            DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new write(this), new ChubbScreenshot(String.format("TXN_%s", new Object[]{this.RatingCompat.MediaSessionCompat$Token}), this.RatingCompat, this, false, true), getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new getMerchantAppTermsAndConditions(this), new downloadTheme(this));
        }
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

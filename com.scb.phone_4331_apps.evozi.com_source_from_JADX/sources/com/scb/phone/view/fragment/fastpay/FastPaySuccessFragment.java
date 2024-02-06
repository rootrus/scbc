package com.scb.phone.view.fragment.fastpay;

import android.content.Context;
import android.content.Intent;
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
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.donations.SharingMomentsPreviewActivity;
import com.scb.phone.view.activity.fastpay.FastPaySuccessActivity;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.transferandpay.BaseSuccessFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.jmrtd.lds.ImageInfo;
import p040o.AlertController$RecycleListView;
import p040o.DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity;
import p040o.DeepLinkModule_ContributeRemittanceTransactionsDeepLinkActivity;
import p040o.DeepLinkModule_ContributeRoboAdvisorDeepLinkActivity;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.getDeviceFile;
import p040o.getOversizeImage;
import p040o.getTopLeftCornerWidth;
import p040o.getUuidUtf8Bytes;
import p040o.onCheckBoxClick;
import p040o.setImageOutListener;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class FastPaySuccessFragment extends BaseSuccessFragment implements getTopLeftCornerWidth.setForceShowIcon, ViewTreeObserver.OnGlobalLayoutListener, FragmentBuilder_BindBaseFragment {
    private boolean IconCompatParcelizer = false;
    private getUuidUtf8Bytes MediaBrowserCompat$MediaItem;
    private boolean MediaDescriptionCompat = false;
    private Uri MediaMetadataCompat;
    private boolean RatingCompat;
    @BindView
    RecyclerView additionalRecyclerView;
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
    public FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment successScreenshotHelper;

    /* renamed from: a_ */
    public final void mo18710a_(access$2200 access_2200) {
    }

    /* renamed from: e_ */
    public final void mo18711e_(String str) {
    }

    public static FastPaySuccessFragment write(getUuidUtf8Bytes getuuidutf8bytes) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        FastPaySuccessFragment fastPaySuccessFragment = new FastPaySuccessFragment();
        fastPaySuccessFragment.setArguments(bundle);
        return fastPaySuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87392131493966, viewGroup, false);
        Bundle arguments = getArguments();
        if (!(arguments == null || getContext() == null)) {
            this.MediaBrowserCompat$MediaItem = (getUuidUtf8Bytes) arguments.getParcelable("com.scb.phone.EXTRA_SUCCESS");
            this.successPresenter.MediaBrowserCompat$ItemReceiver(this);
            getUuidUtf8Bytes getuuidutf8bytes = this.MediaBrowserCompat$MediaItem;
            super.read(getuuidutf8bytes, inflate, getContext());
            this.successPresenter.read(getuuidutf8bytes);
            boolean z = TextUtils.isEmpty(this.MediaBrowserCompat$MediaItem.MediaSessionCompat$ResultReceiverWrapper) && this.MediaBrowserCompat$MediaItem.RatingCompat != null && !this.MediaBrowserCompat$MediaItem.RatingCompat.MediaBrowserCompat$ItemReceiver.isEmpty();
            if (this.MediaBrowserCompat$MediaItem.PlaybackStateCompat.setShowingForActionMode == null && !z) {
                this.successPresenter.write();
            }
            if (z) {
                if (!"TRANSFER".equalsIgnoreCase(this.MediaBrowserCompat$MediaItem.PlaybackStateCompat.MediaDescriptionCompat()) || !MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem)) {
                    this.customFees.mDividerView.setVisibility(0);
                    this.userNote.divider.setVisibility(0);
                    this.endSlipImage.setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f71012131100257));
                }
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(getContext(), this.additionalRecyclerView, this.MediaBrowserCompat$MediaItem.RatingCompat.MediaBrowserCompat$ItemReceiver, (FragmentBuilder_BindBaseFragment) this, true);
            }
        }
        return inflate;
    }

    public final void read(getUuidUtf8Bytes getuuidutf8bytes, View view, Context context) {
        super.read(getuuidutf8bytes, view, context);
        this.successPresenter.read(getuuidutf8bytes);
    }

    /* renamed from: j_ */
    public final void mo18712j_(String str) {
        this.customTarget.setFavoriteName(str);
    }

    /* renamed from: J_ */
    public final void mo18708J_() {
        this.customTarget.setAddFavoriteButtonVisible(true);
    }

    public final void MediaDescriptionCompat() {
        CustomTransferAndPayTarget customTransferAndPayTarget = this.customTarget;
        customTransferAndPayTarget.mFavouriteIcon.setVisibility(8);
        customTransferAndPayTarget.mFavouriteName.setVisibility(8);
        this.customTarget.setAddFavoriteButtonVisible(false);
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
        DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, i, iArr);
    }

    public final void read(boolean z) {
        Context context = getContext();
        if (!isDetached() && context != null && !this.RatingCompat && this.MediaBrowserCompat$MediaItem.PlaybackStateCompat.setShowingForActionMode == null) {
            this.RatingCompat = !z;
            this.successScreenshotHelper.read(this.MediaBrowserCompat$MediaItem, context, true, z).subscribe(new DeepLinkModule_ContributeRoboAdvisorDeepLinkActivity(this), new DeepLinkModule_ContributeRemittanceTransactionsDeepLinkActivity(this));
        }
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onShareButtonClick() {
        Uri uri = this.MediaMetadataCompat;
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
            BaseActivity baseActivity = (BaseActivity) getActivity();
            if (MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem)) {
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
        intent.putExtra("android.intent.extra.STREAM", this.MediaMetadataCompat);
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share_slip));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                createChooser = setTapText.write(activity2, createChooser).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(createChooser.getData());
            sb.append("\n with context ");
            sb.append(activity2.hashCode());
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
        if (getActivity() instanceof FastPaySuccessActivity) {
            if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
                getActivity().finishAffinity();
            }
            Intent intent = new Intent((FastPaySuccessActivity) getActivity(), HomeActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
            intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: I_ */
    public final void mo18706I_() {
        this.IconCompatParcelizer = true;
        this.MediaDescriptionCompat = true;
        if (!this.MediaBrowserCompat$MediaItem.f2601x50fd9e4a) {
            this.shareButton.setVisibility(0);
            this.autoSaveOffSaveButton.setVisibility(8);
            this.autoSaveOffShareButton.setVisibility(8);
        } else {
            this.shareButton.setVisibility(8);
            this.shareMomentButton.setVisibility(0);
            this.autoSaveOffShareButton.setVisibility(0);
        }
        DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, false);
    }

    public final void IconCompatParcelizer(getDeviceFile getdevicefile) {
        SharingMomentsPreviewActivity.read(getContext(), getdevicefile);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaDescriptionCompat = true;
        DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipDonationsButton() {
        this.MediaDescriptionCompat = true;
        DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, true);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void setShareMomentButton() {
        this.successPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem);
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

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(FastPaySuccessFragment fastPaySuccessFragment, Uri uri) {
        fastPaySuccessFragment.MediaMetadataCompat = uri;
        FragmentActivity activity = fastPaySuccessFragment.getActivity();
        if (!uri.toString().isEmpty() && fastPaySuccessFragment.getUserVisibleHint() && activity != null && fastPaySuccessFragment.MediaDescriptionCompat) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = fastPaySuccessFragment.getActivity();
            if (activity2 != null) {
                String string = fastPaySuccessFragment.getString(R.string.saved_slip);
                if (fastPaySuccessFragment.getActivity() != null) {
                    ((BaseActivity) fastPaySuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
            fastPaySuccessFragment.MediaDescriptionCompat = false;
        }
    }

    public static /* synthetic */ void write(FastPaySuccessFragment fastPaySuccessFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = fastPaySuccessFragment.getActivity();
        if (!fastPaySuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = fastPaySuccessFragment.getActivity();
            if (activity2 != null) {
                String string = fastPaySuccessFragment.getString(R.string.saved_slip_error);
                if (fastPaySuccessFragment.getActivity() != null) {
                    ((BaseActivity) fastPaySuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
        }
    }

    /* renamed from: H_ */
    public final void mo18705H_() {
        Context context = getContext();
        if (!isDetached() && context != null) {
            this.successScreenshotHelper.read(this.MediaBrowserCompat$MediaItem, context, this.IconCompatParcelizer, false).subscribe(new DeepLinkModule_ContributeRoboAdvisorDeepLinkActivity(this), new DeepLinkModule_ContributeRemittanceTransactionsDeepLinkActivity(this));
        }
        this.IconCompatParcelizer = false;
        this.MediaDescriptionCompat = false;
        if (!this.MediaBrowserCompat$MediaItem.f2601x50fd9e4a) {
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

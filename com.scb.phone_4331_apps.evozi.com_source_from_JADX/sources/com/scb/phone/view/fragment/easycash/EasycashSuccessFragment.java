package com.scb.phone.view.fragment.easycash;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.custom.easycash.CustomEasycashCommonSuccessView;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.GpuDocumentDetector;
import p040o.HmlPinActivity;
import p040o.IMrzDocumentDetector;
import p040o.dropBreadcrumb;
import p040o.getCornerX;
import p040o.getOversizeImage;
import p040o.getPrepaidActivationVerification;
import p040o.hmlSetupAccounts;
import p040o.hmlTermsConditionsOTP;
import p040o.onCheckBoxClick;
import p040o.setCrashlyticsOriginEventListener;
import p040o.setLastBaselineToBottomHeight;

public class EasycashSuccessFragment extends BaseFragment implements CheckExtractActivity_MembersInjector.setChecked {
    private boolean IconCompatParcelizer = false;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f3081x50fd9e4a;
    private String MediaDescriptionCompat;
    private List<dropBreadcrumb> MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token = false;
    private int ParcelableVolumeInfo;
    private CustomEasycashCommonSuccessView RatingCompat;
    @BindView
    Button autoSaveOffSaveButton;
    @BindView
    LinearLayout contentLayout;
    @HmlPinActivity
    public IMrzDocumentDetector presenter;
    @BindView
    View printerLineView;
    @BindView
    TextView returnButton;
    @BindView
    RelativeLayout slipLayout;
    @BindView
    FrameLayout successCommonView;
    @BindView
    TextView textViewLoanAppId;
    @BindView
    TextView textViewPageDescription;
    @BindView
    TextView textViewPageTitle;
    @BindView
    TextView textViewRemainingBalance;
    @BindView
    TextView textViewTransactionId;
    @BindView
    TextView textViewTransactionTime;
    @BindView
    ImageView zigzagimage;

    public static EasycashSuccessFragment MediaBrowserCompat$ItemReceiver(List<dropBreadcrumb> list, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.scb.phone.SUCCESS_EXTRA_DISPLAY", (ArrayList) list);
        bundle.putString("com.scb.phone.SUCCESS_PRODUCT_GROUP", str);
        bundle.putString("com.scb.phone.SUCCESS_PRODUCT_TYPE", str2);
        bundle.putString("com.scb.phone.SUCCESS_TRANSACTION_ID", str3);
        bundle.putString("com.scb.phone.SUCCESS_NCB_TRANSACTION_ID", str4);
        bundle.putString("com.scb.phone.SUCCESS_TRANSACTION_TIME", str5);
        bundle.putString("com.scb.phone.SUCCESS_REMAINING_BALANCE", str6);
        bundle.putString("com.scb.phone.SUCCESS_AMOUNT", str7);
        EasycashSuccessFragment easycashSuccessFragment = new EasycashSuccessFragment();
        easycashSuccessFragment.setArguments(bundle);
        return easycashSuccessFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87122131493939, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.RatingCompat = new CustomEasycashCommonSuccessView(getContext());
        if (!(getArguments() == null || getArguments().getParcelableArrayList("com.scb.phone.SUCCESS_EXTRA_DISPLAY") == null)) {
            this.MediaMetadataCompat = getArguments().getParcelableArrayList("com.scb.phone.SUCCESS_EXTRA_DISPLAY");
            this.MediaBrowserCompat$MediaItem = getArguments().getString("com.scb.phone.SUCCESS_PRODUCT_GROUP");
            this.MediaDescriptionCompat = getArguments().getString("com.scb.phone.SUCCESS_PRODUCT_TYPE");
            this.f3081x50fd9e4a = getArguments().getString("com.scb.phone.SUCCESS_TRANSACTION_ID");
            this.MediaBrowserCompat$SearchResultReceiver = getArguments().getString("com.scb.phone.SUCCESS_NCB_TRANSACTION_ID");
            this.MediaSessionCompat$QueueItem = getArguments().getString("com.scb.phone.SUCCESS_REMAINING_BALANCE");
            this.presenter.MediaBrowserCompat$ItemReceiver(this);
            this.contentLayout.bringToFront();
            if ("CARDS".equals(this.MediaBrowserCompat$MediaItem)) {
                this.ParcelableVolumeInfo = "CREDIT_CARD".equals(this.MediaDescriptionCompat) ? R.string.easycash_card_success_title : R.string.easycash_speedy_cash_success_title;
                if ("CREDIT_CARD".equals(this.MediaDescriptionCompat)) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = R.string.easycash_card_success_desc;
                }
                this.textViewRemainingBalance.setVisibility(8);
                this.printerLineView.setVisibility(8);
                this.slipLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.contentLayout.setBackgroundColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f70982131100254));
            } else {
                this.ParcelableVolumeInfo = R.string.easycash_loan_success_title;
                this.MediaBrowserCompat$CustomActionResultReceiver = "COMMERCIAL".equals(this.MediaBrowserCompat$MediaItem) ? R.string.easycash_commercial_loan_success_desc : R.string.easycash_loan_success_desc;
                this.zigzagimage.setVisibility(0);
                this.contentLayout.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.slip_bg));
                this.printerLineView.setVisibility(0);
                if (this.f3081x50fd9e4a != null) {
                    this.textViewTransactionId.setVisibility(0);
                    this.textViewTransactionId.setText(getString(R.string.reference_id, this.f3081x50fd9e4a));
                }
                String str = this.MediaSessionCompat$QueueItem;
                if (TextUtils.isEmpty(str)) {
                    this.textViewRemainingBalance.setVisibility(8);
                } else {
                    this.textViewRemainingBalance.setVisibility(0);
                    this.textViewRemainingBalance.setText(getString(R.string.easycash_success_available_amount, str));
                }
            }
            if (this.MediaBrowserCompat$SearchResultReceiver != null) {
                this.textViewLoanAppId.setVisibility(0);
                this.textViewLoanAppId.setText(getString(R.string.loan_app_id, this.MediaBrowserCompat$SearchResultReceiver));
            }
            this.textViewPageTitle.setText(this.ParcelableVolumeInfo);
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i != 0) {
                this.textViewPageDescription.setText(i);
                this.textViewPageDescription.setVisibility(0);
            }
            String string = getArguments().getString("com.scb.phone.SUCCESS_TRANSACTION_TIME");
            this.MediaSessionCompat$ResultReceiverWrapper = string;
            if (string != null) {
                this.textViewTransactionTime.setText(string);
            } else {
                this.textViewTransactionTime.setVisibility(8);
            }
            if ("COMMERCIAL".equals(this.MediaBrowserCompat$MediaItem)) {
                this.returnButton.setText(getString(R.string.easycash_commercial_success_return_button));
            }
            getArguments().getString("com.scb.phone.SUCCESS_AMOUNT");
            this.presenter.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat);
        }
        IMrzDocumentDetector iMrzDocumentDetector = this.presenter;
        if (iMrzDocumentDetector.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.setShortcut()) {
            GpuDocumentDetector gpuDocumentDetector = GpuDocumentDetector.IconCompatParcelizer;
            if (iMrzDocumentDetector.RatingCompat != null) {
                z = true;
            }
            if (z) {
                gpuDocumentDetector.IconCompatParcelizer(iMrzDocumentDetector.RatingCompat);
            }
        } else {
            getCornerX getcornerx = getCornerX.MediaBrowserCompat$ItemReceiver;
            if (iMrzDocumentDetector.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getcornerx.IconCompatParcelizer(iMrzDocumentDetector.RatingCompat);
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        String str;
        Context context = getContext();
        if (!isDetached() && context != null) {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = null;
            String string = i == 0 ? null : getString(i);
            List<dropBreadcrumb> list = this.MediaMetadataCompat;
            boolean z2 = false;
            setCrashlyticsOriginEventListener.read read = new setCrashlyticsOriginEventListener.read((byte) 0);
            read.MediaMetadataCompat = getString(this.ParcelableVolumeInfo);
            read.write = string;
            read.MediaBrowserCompat$ItemReceiver = this.f3081x50fd9e4a;
            String str3 = this.f3081x50fd9e4a;
            if (str3 == null) {
                str = null;
            } else {
                str = getString(R.string.reference_id, str3);
            }
            read.IconCompatParcelizer = str;
            String str4 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str4 != null) {
                str2 = getString(R.string.loan_app_id, str4);
            }
            read.read = str2;
            read.MediaBrowserCompat$CustomActionResultReceiver = this.MediaSessionCompat$ResultReceiverWrapper;
            setCrashlyticsOriginEventListener setcrashlyticsorigineventlistener = new setCrashlyticsOriginEventListener(read, (byte) 0);
            if ("LOANS".equals(this.MediaBrowserCompat$MediaItem) || "COMMERCIAL".equals(this.MediaBrowserCompat$MediaItem)) {
                z2 = true;
            }
            AlertController$RecycleListView.read.read(list, setcrashlyticsorigineventlistener, context, true, z2, true ^ "COMMERCIAL".equals(this.MediaBrowserCompat$MediaItem) ? 1 : 0, z).subscribe(new hmlTermsConditionsOTP(this), new hmlSetupAccounts(this));
        }
    }

    public void onDestroy() {
        IMrzDocumentDetector iMrzDocumentDetector = this.presenter;
        if (iMrzDocumentDetector != null) {
            iMrzDocumentDetector.onDestroy();
        }
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        getPrepaidActivationVerification.MediaBrowserCompat$ItemReceiver(this, i, iArr);
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void write() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(p040o.dropBreadcrumb r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = r5.MediaBrowserCompat$MediaItem
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 1
            r4 = 72606051(0x453e163, float:2.4906423E-36)
            if (r1 == r4) goto L_0x001c
            r4 = 1387439946(0x52b2a74a, float:3.83655412E11)
            if (r1 != r4) goto L_0x0026
            java.lang.String r1 = "COMMERCIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "LOANS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r2
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == 0) goto L_0x0037
            if (r0 == r3) goto L_0x0031
            com.scb.phone.view.custom.easycash.CustomEasycashCommonSuccessView r0 = r5.RatingCompat
            r0.IconCompatParcelizer(r6, r7, r2, r3)
            goto L_0x003c
        L_0x0031:
            com.scb.phone.view.custom.easycash.CustomEasycashCommonSuccessView r0 = r5.RatingCompat
            r0.IconCompatParcelizer(r6, r7, r3, r2)
            goto L_0x003c
        L_0x0037:
            com.scb.phone.view.custom.easycash.CustomEasycashCommonSuccessView r0 = r5.RatingCompat
            r0.IconCompatParcelizer(r6, r7, r3, r3)
        L_0x003c:
            android.widget.FrameLayout r6 = r5.successCommonView
            r6.removeAllViews()
            android.widget.FrameLayout r6 = r5.successCommonView
            com.scb.phone.view.custom.easycash.CustomEasycashCommonSuccessView r7 = r5.RatingCompat
            r6.addView(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.easycash.EasycashSuccessFragment.write(o.dropBreadcrumb, int):void");
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer = true;
        this.MediaSessionCompat$Token = true;
        this.autoSaveOffSaveButton.setVisibility(8);
        getPrepaidActivationVerification.MediaBrowserCompat$ItemReceiver(this, false);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaSessionCompat$Token = true;
        getPrepaidActivationVerification.MediaBrowserCompat$ItemReceiver(this, true);
    }

    @OnClick
    public void onReturnButtonClicked() {
        getActivity().finish();
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(EasycashSuccessFragment easycashSuccessFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = easycashSuccessFragment.getActivity();
        if (!easycashSuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = easycashSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = easycashSuccessFragment.getString(R.string.saved_slip_error);
                if (easycashSuccessFragment.getActivity() != null) {
                    ((BaseActivity) easycashSuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
        }
    }

    public static /* synthetic */ void write(EasycashSuccessFragment easycashSuccessFragment, Uri uri) {
        FragmentActivity activity = easycashSuccessFragment.getActivity();
        if (!uri.toString().isEmpty() && easycashSuccessFragment.getUserVisibleHint() && activity != null && easycashSuccessFragment.MediaSessionCompat$Token) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = easycashSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = easycashSuccessFragment.getString(R.string.saved_slip);
                if (easycashSuccessFragment.getActivity() != null) {
                    ((BaseActivity) easycashSuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
            easycashSuccessFragment.MediaSessionCompat$Token = false;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        String str;
        Context context = getContext();
        if (!isDetached() && context != null) {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = null;
            String string = i == 0 ? null : getString(i);
            List<dropBreadcrumb> list = this.MediaMetadataCompat;
            setCrashlyticsOriginEventListener.read read = new setCrashlyticsOriginEventListener.read((byte) 0);
            read.MediaMetadataCompat = getString(this.ParcelableVolumeInfo);
            read.write = string;
            read.MediaBrowserCompat$ItemReceiver = this.f3081x50fd9e4a;
            String str3 = this.f3081x50fd9e4a;
            if (str3 == null) {
                str = null;
            } else {
                str = getString(R.string.reference_id, str3);
            }
            read.IconCompatParcelizer = str;
            String str4 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str4 != null) {
                str2 = getString(R.string.loan_app_id, str4);
            }
            read.read = str2;
            read.MediaBrowserCompat$CustomActionResultReceiver = this.MediaSessionCompat$ResultReceiverWrapper;
            AlertController$RecycleListView.read.read(list, new setCrashlyticsOriginEventListener(read, (byte) 0), context, this.IconCompatParcelizer, "LOANS".equals(this.MediaBrowserCompat$MediaItem), true ^ "COMMERCIAL".equals(this.MediaBrowserCompat$MediaItem) ? 1 : 0, false).subscribe(new hmlTermsConditionsOTP(this), new hmlSetupAccounts(this));
        }
        this.IconCompatParcelizer = false;
        this.MediaSessionCompat$Token = false;
        this.autoSaveOffSaveButton.setVisibility(0);
    }
}

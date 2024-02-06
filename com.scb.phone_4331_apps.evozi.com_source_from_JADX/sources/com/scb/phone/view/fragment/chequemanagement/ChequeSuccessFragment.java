package com.scb.phone.view.fragment.chequemanagement;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.jmrtd.lds.ImageInfo;
import p040o.BankingServicesDeepLinkActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDonationsLandingFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SmeLoanService;
import p040o.getOversizeImage;
import p040o.getOwnerType;
import p040o.getUuidUtf8Bytes;
import p040o.onCheckBoxClick;
import p040o.registerInvestmentInfo;
import p040o.setCreditLimit;
import p040o.setTapText;
import p040o.submitFATCA;
import p040o.validateSuitabilityAssessment;

public class ChequeSuccessFragment extends BaseChequeReviewFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.write {
    private String IconCompatParcelizer;
    public Uri MediaBrowserCompat$CustomActionResultReceiver;
    private getUuidUtf8Bytes MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    @BindView
    DefaultButton autoSaveOffSaveButton;
    @BindView
    TextView dateTimeTextView;
    @HmlPinActivity
    public getOwnerType presenter;
    @BindView
    TextView refIdTextView;
    @BindView
    TextView remainingBalanceTextView;
    @BindView
    TextView returnButtonTextView;
    @BindView
    DefaultButton shareButton;
    @BindView
    Space spaceBetweenButton;
    @BindView
    TextView titleSuccessTextView;

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver() throws Exception {
    }

    public static ChequeSuccessFragment IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        ChequeSuccessFragment chequeSuccessFragment = new ChequeSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        chequeSuccessFragment.setArguments(bundle);
        return chequeSuccessFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r8 = 0
            r0 = 2131493845(0x7f0c03d5, float:1.8611182E38)
            android.view.View r6 = r6.inflate(r0, r7, r8)
            android.os.Bundle r7 = r5.getArguments()
            java.lang.String r0 = "com.scb.phone.EXTRA_SUCCESS"
            android.os.Parcelable r7 = r7.getParcelable(r0)
            o.getUuidUtf8Bytes r7 = (p040o.getUuidUtf8Bytes) r7
            r5.MediaBrowserCompat$MediaItem = r7
            o.getOwnerType r7 = r5.presenter
            r7.MediaBrowserCompat$ItemReceiver(r5)
            o.getUuidUtf8Bytes r7 = r5.MediaBrowserCompat$MediaItem
            if (r7 == 0) goto L_0x0149
            o.setUuidFromUtf8Bytes r7 = r7.PlaybackStateCompat
            android.content.Context r0 = r5.getContext()
            r5.MediaBrowserCompat$CustomActionResultReceiver(r7, r6, r0)
            o.getUuidUtf8Bytes r7 = r5.MediaBrowserCompat$MediaItem
            o.setUuidFromUtf8Bytes r0 = r7.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            r5.IconCompatParcelizer = r0
            int r1 = r0.hashCode()
            r2 = -1347299094(0xffffffffafb1d8ea, float:-3.235024E-10)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x005b
            r2 = -1174071815(0xffffffffba0515f9, float:-5.0768215E-4)
            if (r1 == r2) goto L_0x0051
            r2 = -829305563(0xffffffffce91cd25, float:-1.22307034E9)
            if (r1 != r2) goto L_0x0065
            java.lang.String r1 = "ORDER_CHEQUE_FUNCTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = r4
            goto L_0x0066
        L_0x0051:
            java.lang.String r1 = "STOP_CHEQUE_FUNCTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = r8
            goto L_0x0066
        L_0x005b:
            java.lang.String r1 = "ACTIVATE_CHEQUE_FUNCTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0065
            r0 = r3
            goto L_0x0066
        L_0x0065:
            r0 = -1
        L_0x0066:
            if (r0 == 0) goto L_0x0101
            r1 = 2131760618(0x7f1015ea, float:1.9152262E38)
            if (r0 == r4) goto L_0x00a9
            if (r0 != r3) goto L_0x013b
            java.lang.String r8 = r7.AlertController$RecycleListView
            android.content.res.Resources r0 = r5.getResources()
            java.lang.String r0 = r0.getString(r1)
            android.widget.TextView r1 = r5.titleSuccessTextView
            r1.setText(r8)
            android.widget.TextView r8 = r5.returnButtonTextView
            r8.setText(r0)
            o.getOwnerType r8 = r5.presenter
            r8.MediaBrowserCompat$ItemReceiver()
            androidx.fragment.app.FragmentActivity r8 = r5.getActivity()
            if (r8 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r8 = r5.getActivity()
            boolean r8 = r8 instanceof com.scb.phone.view.activity.chequemanagement.ChequeSuccessActivity
            if (r8 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r8 = r5.getActivity()
            if (r8 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r8 = r5.getActivity()
            com.scb.phone.view.activity.BaseActivity r8 = (com.scb.phone.view.activity.BaseActivity) r8
            java.lang.String r0 = "activatechq_success"
            r8.mo13676d_(r0)
            goto L_0x013b
        L_0x00a9:
            java.lang.String r0 = r7.AlertController$RecycleListView
            android.content.res.Resources r2 = r5.getResources()
            java.lang.String r1 = r2.getString(r1)
            android.widget.TextView r2 = r5.titleSuccessTextView
            r2.setText(r0)
            android.widget.TextView r0 = r5.returnButtonTextView
            r0.setText(r1)
            java.lang.String r0 = r7.MediaSessionCompat$QueueItem
            android.widget.TextView r1 = r5.remainingBalanceTextView
            r1.setVisibility(r8)
            android.widget.TextView r1 = r5.remainingBalanceTextView
            r1.setText(r0)
            o.getOwnerType r0 = r5.presenter
            r0.MediaBrowserCompat$ItemReceiver()
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            boolean r0 = r0 instanceof com.scb.phone.view.activity.chequemanagement.ChequeSuccessActivity
            if (r0 == 0) goto L_0x013b
            o.ZSYR2K[] r0 = new p040o.ZSYR2K[r4]
            o.ZSYR2K r1 = new o.ZSYR2K
            o.setUuidFromUtf8Bytes r2 = r7.PlaybackStateCompat
            o.ComponentRuntime$$Lambda$5 r2 = (p040o.ComponentRuntime$$Lambda$5) r2
            java.lang.String r2 = r2.IconCompatParcelizer
            java.lang.String r3 = "quantity"
            r1.<init>(r3, r2)
            r0[r8] = r1
            androidx.fragment.app.FragmentActivity r8 = r5.getActivity()
            if (r8 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r8 = r5.getActivity()
            com.scb.phone.view.activity.BaseActivity r8 = (com.scb.phone.view.activity.BaseActivity) r8
            o.getKernelIDDst r8 = r8.scbAnalytics
            java.lang.String r1 = "orderchq_success"
            r8.write(r1, r0)
            goto L_0x013b
        L_0x0101:
            java.lang.String r0 = r7.AlertController$RecycleListView
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131760624(0x7f1015f0, float:1.9152274E38)
            java.lang.String r1 = r1.getString(r2)
            android.widget.TextView r2 = r5.titleSuccessTextView
            r2.setText(r0)
            android.widget.TextView r0 = r5.returnButtonTextView
            r0.setText(r1)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            boolean r0 = r0 instanceof com.scb.phone.view.activity.chequemanagement.ChequeSuccessActivity
            if (r0 == 0) goto L_0x013b
            o.ZSYR2K[] r8 = new p040o.ZSYR2K[r8]
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x013b
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            com.scb.phone.view.activity.BaseActivity r0 = (com.scb.phone.view.activity.BaseActivity) r0
            o.getKernelIDDst r0 = r0.scbAnalytics
            java.lang.String r1 = "stopchq_success"
            r0.write(r1, r8)
        L_0x013b:
            android.widget.TextView r8 = r5.refIdTextView
            java.lang.String r0 = r7.MediaSessionCompat$Token
            r8.setText(r0)
            android.widget.TextView r8 = r5.dateTimeTextView
            java.lang.String r7 = r7.MediaDescriptionCompat
            r8.setText(r7)
        L_0x0149:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onStart() {
        super.onStart();
        Uri uri = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (uri == null || uri.toString().isEmpty()) {
            Context context = getContext();
            if (!isDetached() && context != null) {
                DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDonationsLandingFragment(this.MediaBrowserCompat$MediaItem, context, false)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new submitFATCA(this), setCreditLimit.read);
            }
        }
    }

    public final void write() {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        this.autoSaveOffSaveButton.setVisibility(8);
        if ("ORDER_CHEQUE_FUNCTION".equalsIgnoreCase(this.MediaBrowserCompat$MediaItem.PlaybackStateCompat.MediaDescriptionCompat())) {
            this.shareButton.setVisibility(0);
        }
        SmeLoanService.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver = false;
        if ("STOP_CHEQUE_FUNCTION".equals(this.IconCompatParcelizer)) {
            this.autoSaveOffSaveButton.setVisibility(8);
        } else {
            this.autoSaveOffSaveButton.setVisibility(0);
        }
        if ("ORDER_CHEQUE_FUNCTION".equalsIgnoreCase(this.MediaBrowserCompat$MediaItem.PlaybackStateCompat.MediaDescriptionCompat())) {
            this.shareButton.setVisibility(0);
            this.spaceBetweenButton.setVisibility(0);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        SmeLoanService.IconCompatParcelizer(this, i, iArr);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Context context = getContext();
        if (!isDetached() && context != null) {
            DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDonationsLandingFragment(this.MediaBrowserCompat$MediaItem, context, true)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new validateSuitabilityAssessment(this), new registerInvestmentInfo(this));
        }
    }

    public static void MediaBrowserCompat$MediaItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void IconCompatParcelizer() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void saveSlipButton() {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        SmeLoanService.MediaBrowserCompat$ItemReceiver(this);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    @Optional
    public void onShareButtonClick() {
        Uri uri = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (uri == null || uri.toString().isEmpty()) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getString(R.string.share_error);
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).write(activity, R.id.success_view_container, string, getoversizeimage);
                }
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", this.MediaBrowserCompat$CustomActionResultReceiver);
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

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReturnButtonIsClicked() {
        /*
            r5 = this;
            o.getUuidUtf8Bytes r0 = r5.MediaBrowserCompat$MediaItem
            o.setUuidFromUtf8Bytes r0 = r0.PlaybackStateCompat
            java.lang.String r0 = r0.MediaDescriptionCompat()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 2
            r4 = -1347299094(0xffffffffafb1d8ea, float:-3.235024E-10)
            if (r1 == r4) goto L_0x0031
            r4 = -1174071815(0xffffffffba0515f9, float:-5.0768215E-4)
            if (r1 == r4) goto L_0x0027
            r4 = -829305563(0xffffffffce91cd25, float:-1.22307034E9)
            if (r1 != r4) goto L_0x003b
            java.lang.String r1 = "ORDER_CHEQUE_FUNCTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = r2
            goto L_0x003c
        L_0x0027:
            java.lang.String r1 = "STOP_CHEQUE_FUNCTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = 0
            goto L_0x003c
        L_0x0031:
            java.lang.String r1 = "ACTIVATE_CHEQUE_FUNCTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003b
            r0 = r3
            goto L_0x003c
        L_0x003b:
            r0 = -1
        L_0x003c:
            if (r0 == 0) goto L_0x0054
            if (r0 == r2) goto L_0x0042
            if (r0 != r3) goto L_0x00aa
        L_0x0042:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x00aa
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            boolean r0 = r0 instanceof com.scb.phone.view.activity.chequemanagement.ChequeSuccessActivity
            if (r0 == 0) goto L_0x00aa
            r5.setTabContainer()
            return
        L_0x0054:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r5.getContext()
            java.lang.Class<com.scb.phone.view.activity.chequemanagement.stopcheque.StopChequeLandingActivity> r2 = com.scb.phone.view.activity.chequemanagement.stopcheque.StopChequeLandingActivity.class
            r0.<init>(r1, r2)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r1)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()     // Catch:{ all -> 0x009f }
            if (r1 == 0) goto L_0x0075
            o.ZoomDocumentActivity r0 = p040o.setTapText.write(r1, r0)     // Catch:{ all -> 0x009f }
            android.content.Intent r0 = r0.read()     // Catch:{ all -> 0x009f }
        L_0x0075:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "Uri intercepted on support Fragment.startActivity(Intent), modified: "
            r3.<init>(r4)     // Catch:{ all -> 0x009f }
            android.net.Uri r4 = r0.getData()     // Catch:{ all -> 0x009f }
            r3.append(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = "\n with context "
            r3.append(r4)     // Catch:{ all -> 0x009f }
            int r1 = r1.hashCode()     // Catch:{ all -> 0x009f }
            r3.append(r1)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x009f }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r1)     // Catch:{ all -> 0x009f }
            r1 = r5
            com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment r1 = (com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment) r1     // Catch:{ all -> 0x009f }
            r1.startActivity(r0)     // Catch:{ all -> 0x009f }
            goto L_0x00a3
        L_0x009f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00a3:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            r0.finish()
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment.onReturnButtonIsClicked():void");
    }

    public static /* synthetic */ void read(ChequeSuccessFragment chequeSuccessFragment, Throwable th) {
        onCheckBoxClick.read(th, "onSaveScreenshotError", new Object[0]);
        FragmentActivity activity = chequeSuccessFragment.getActivity();
        if (!chequeSuccessFragment.isDetached() && activity != null) {
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            FragmentActivity activity2 = chequeSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = chequeSuccessFragment.getString(R.string.saved_slip_error);
                if (chequeSuccessFragment.getActivity() != null) {
                    ((BaseActivity) chequeSuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
        }
    }

    public static /* synthetic */ void write(ChequeSuccessFragment chequeSuccessFragment, Uri uri) {
        chequeSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver = uri;
        FragmentActivity activity = chequeSuccessFragment.getActivity();
        if (!uri.toString().isEmpty() && chequeSuccessFragment.getUserVisibleHint() && activity != null && chequeSuccessFragment.MediaBrowserCompat$SearchResultReceiver) {
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            FragmentActivity activity2 = chequeSuccessFragment.getActivity();
            if (activity2 != null) {
                String string = chequeSuccessFragment.getString(R.string.saved_slip);
                if (chequeSuccessFragment.getActivity() != null) {
                    ((BaseActivity) chequeSuccessFragment.getActivity()).write(activity2, R.id.success_view_container, string, getoversizeimage);
                }
            }
            chequeSuccessFragment.MediaBrowserCompat$SearchResultReceiver = false;
        }
    }
}

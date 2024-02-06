package com.scb.phone.view.activity.bscanc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.CustomDeltaInput;
import com.scb.phone.view.custom.common.CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.C7507tQ;
import p040o.ComputingConcurrentHashMap;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.GoodToKnowActivity;
import p040o.HeartBeatInfo;
import p040o.HeartBeatInfo$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.HeartBeatInfo$MediaBrowserCompat$MediaItem;
import p040o.HeartBeatInfo$MediaBrowserCompat$SearchResultReceiver;
import p040o.HeartBeatInfo$MediaSessionCompat$ResultReceiverWrapper;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getICheckDeserializerRtti;
import p040o.getKeepAlive;
import p040o.getOversizeImage;
import p040o.isShutdown;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ManageQrToPayActivity extends BaseActivity implements C7507tQ.read, AccountSourceSelectFragment.write, CustomDeltaInput.read, CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private String MediaMetadataCompat;
    @BindView
    public Button btnAction;
    @HmlPinActivity
    public HeartBeatInfo presenter;
    @BindView
    public CustomDeltaInputPressed qrLimitAmount;
    @BindView
    public TextView tvQrLimit;

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(context, (String) null, true);
    }

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, boolean z) {
            onGetStartedClick.write((Object) context, "context");
            Intent putExtra = new Intent(context, ManageQrToPayActivity.class).putExtra("FUNCTION", str).putExtra("KEY_IS_SETTING_PAGE", z);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, ManageQr…TING_PAGE, isSettingPage)");
            return putExtra;
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.f78682131493093);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            this.MediaMetadataCompat = extras.getString("FUNCTION");
            this.MediaBrowserCompat$SearchResultReceiver = extras.getBoolean("KEY_IS_SETTING_PAGE");
        }
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.myqr_manage_qr_for_payment_title);
        HeartBeatInfo heartBeatInfo = this.presenter;
        if (heartBeatInfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        heartBeatInfo.MediaBrowserCompat$ItemReceiver(this);
        HeartBeatInfo heartBeatInfo2 = this.presenter;
        if (heartBeatInfo2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (heartBeatInfo2.RatingCompat != null) {
            heartBeatInfo2.RatingCompat.AlertController$RecycleListView();
        }
        getKeepAlive getkeepalive = heartBeatInfo2.MediaBrowserCompat$ItemReceiver;
        getkeepalive.read(getkeepalive.IconCompatParcelizer.IconCompatParcelizer(), new HeartBeatInfo$MediaBrowserCompat$MediaItem(heartBeatInfo2), new HeartBeatInfo.MediaDescriptionCompat(heartBeatInfo2));
    }

    static final class read implements AmountEditText$MediaBrowserCompat$CustomActionResultReceiver {
        private /* synthetic */ ManageQrToPayActivity MediaBrowserCompat$ItemReceiver;

        read(ManageQrToPayActivity manageQrToPayActivity) {
            this.MediaBrowserCompat$ItemReceiver = manageQrToPayActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean read(com.scb.phone.view.custom.common.AmountEditText r6, java.lang.String r7) {
            /*
                r5 = this;
                java.lang.String r6 = "text"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r6)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                o.LifestyleCustomizationActivity r6 = new o.LifestyleCustomizationActivity
                java.lang.String r0 = "[^.0-9]"
                r6.<init>((java.lang.String) r0)
                java.lang.String r0 = ""
                r6.read(r7, r0)
                com.scb.phone.view.activity.bscanc.ManageQrToPayActivity r6 = r5.MediaBrowserCompat$ItemReceiver
                com.scb.phone.view.custom.common.CustomDeltaInputPressed r6 = r6.qrLimitAmount
                if (r6 != 0) goto L_0x001e
                java.lang.String r0 = "qrLimitAmount"
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
            L_0x001e:
                o.LifestyleCustomizationActivity r0 = new o.LifestyleCustomizationActivity
                java.lang.String r1 = "\\."
                r0.<init>((java.lang.String) r1)
                java.lang.String r1 = "input"
                p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r1)
                java.util.regex.Pattern r0 = r0.write
                java.util.regex.Matcher r0 = r0.matcher(r7)
                boolean r1 = r0.find()
                r2 = 0
                if (r1 == 0) goto L_0x006a
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 10
                r1.<init>(r3)
                r3 = r2
            L_0x003f:
                int r4 = r0.start()
                java.lang.CharSequence r3 = r7.subSequence(r3, r4)
                java.lang.String r3 = r3.toString()
                r1.add(r3)
                int r3 = r0.end()
                boolean r4 = r0.find()
                if (r4 != 0) goto L_0x003f
                int r0 = r7.length()
                java.lang.CharSequence r7 = r7.subSequence(r3, r0)
                java.lang.String r7 = r7.toString()
                r1.add(r7)
                java.util.List r1 = (java.util.List) r1
                goto L_0x0077
            L_0x006a:
                java.lang.String r7 = r7.toString()
                java.util.List r1 = java.util.Collections.singletonList(r7)
                java.lang.String r7 = "java.util.Collections.singletonList(element)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r7)
            L_0x0077:
                boolean r7 = r1.isEmpty()
                r0 = 1
                if (r7 != 0) goto L_0x00ab
                int r7 = r1.size()
                java.util.ListIterator r7 = r1.listIterator(r7)
            L_0x0086:
                boolean r3 = r7.hasPrevious()
                if (r3 == 0) goto L_0x00ab
                java.lang.Object r3 = r7.previous()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                int r3 = r3.length()
                if (r3 != 0) goto L_0x009c
                r3 = r0
                goto L_0x009d
            L_0x009c:
                r3 = r2
            L_0x009d:
                if (r3 != 0) goto L_0x0086
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                int r7 = r7.nextIndex()
                int r7 = r7 + r0
                java.util.List r7 = p040o.HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(r1, (int) r7)
                goto L_0x00af
            L_0x00ab:
                o.HmlNationalIdActivity r7 = p040o.HmlNationalIdActivity.IconCompatParcelizer
                java.util.List r7 = (java.util.List) r7
            L_0x00af:
                java.util.Collection r7 = (java.util.Collection) r7
                java.lang.String[] r1 = new java.lang.String[r2]
                java.lang.Object[] r7 = r7.toArray(r1)
                if (r7 == 0) goto L_0x00ce
                java.lang.String[] r7 = (java.lang.String[]) r7
                r7 = r7[r2]
                java.lang.Double r7 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r7)
                java.lang.String r1 = "Utilities.amountStringTo…dArray()[0]\n            )"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r1)
                double r1 = r7.doubleValue()
                r6.setActualValue(r1)
                return r0
            L_0x00ce:
                kotlin.TypeCastException r6 = new kotlin.TypeCastException
                java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<T>"
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.bscanc.ManageQrToPayActivity.read.read(com.scb.phone.view.custom.common.AmountEditText, java.lang.String):boolean");
        }
    }

    public final void IconCompatParcelizer(isShutdown isshutdown) {
        onGetStartedClick.write((Object) isshutdown, "display");
        CustomDeltaInputPressed customDeltaInputPressed = this.qrLimitAmount;
        if (customDeltaInputPressed == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed.inputValue.setOnPasteListener(new read(this));
        CustomDeltaInputPressed customDeltaInputPressed2 = this.qrLimitAmount;
        if (customDeltaInputPressed2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed2.setOnValueChangedListener(this);
        CustomDeltaInputPressed customDeltaInputPressed3 = this.qrLimitAmount;
        if (customDeltaInputPressed3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed3.setOnIncrementChangeListener(this);
        CustomDeltaInputPressed customDeltaInputPressed4 = this.qrLimitAmount;
        if (customDeltaInputPressed4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed4.inputValue.setOnEditorActionListener(new ManageQrToPayActivity$MediaBrowserCompat$ItemReceiver(this));
        CustomDeltaInputPressed customDeltaInputPressed5 = this.qrLimitAmount;
        if (customDeltaInputPressed5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed5.setErrorMessage(getString(R.string.fastpay_setting_range_limit_error_message));
        CustomDeltaInputPressed customDeltaInputPressed6 = this.qrLimitAmount;
        if (customDeltaInputPressed6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed6.inputValue.setOnFocusChangeListener(new C5563xcda4f383(this));
        CustomDeltaInputPressed customDeltaInputPressed7 = this.qrLimitAmount;
        if (customDeltaInputPressed7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed7.setDelta(isshutdown.read);
        CustomDeltaInputPressed customDeltaInputPressed8 = this.qrLimitAmount;
        if (customDeltaInputPressed8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed8.setMinValue(isshutdown.MediaBrowserCompat$ItemReceiver);
        CustomDeltaInputPressed customDeltaInputPressed9 = this.qrLimitAmount;
        if (customDeltaInputPressed9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed9.setMaxValue(isshutdown.MediaBrowserCompat$CustomActionResultReceiver);
        if (isshutdown.IconCompatParcelizer > 0.0d) {
            CustomDeltaInputPressed customDeltaInputPressed10 = this.qrLimitAmount;
            if (customDeltaInputPressed10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
            }
            customDeltaInputPressed10.setActualValue(isshutdown.IconCompatParcelizer);
        }
        HeartBeatInfo heartBeatInfo = this.presenter;
        if (heartBeatInfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (isshutdown != null) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new HeartBeatInfo.IconCompatParcelizer(heartBeatInfo, isshutdown);
            if (heartBeatInfo.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(heartBeatInfo.RatingCompat);
            }
        }
        CustomDeltaInputPressed customDeltaInputPressed11 = this.qrLimitAmount;
        if (customDeltaInputPressed11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed11.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d, double d2) {
        String MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
        String MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d2);
        TextView textView = this.tvQrLimit;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvQrLimit");
        }
        textView.setText(getString(R.string.fastpay_setting_range_limit_text, new Object[]{MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2}));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            CustomDeltaInputPressed customDeltaInputPressed = this.qrLimitAmount;
            if (customDeltaInputPressed == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
            }
            customDeltaInputPressed.errorMessage.setVisibility(0);
            return;
        }
        CustomDeltaInputPressed customDeltaInputPressed2 = this.qrLimitAmount;
        if (customDeltaInputPressed2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed2.errorMessage.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "limit");
        onGetStartedClick.write((Object) str2, "accountNumber");
        QrToPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver qrToPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver = QrToPayOtpActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        String str3 = this.MediaMetadataCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "limit");
        onGetStartedClick.write((Object) str2, "accountNumber");
        Intent putExtra = new Intent(context, QrToPayOtpActivity.class).putExtra("QR_LIMIT", str).putExtra("ACCOUNT_NUMBER", str2).putExtra("FUNCTION", str3);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, QrToPayO…a(KEY_FUNCTION, function)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 1999);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        write(this, R.id.view_group_root, getString(R.string.myqr_input_not_change), getOversizeImage.SUCCESS);
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ ManageQrToPayActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(ManageQrToPayActivity manageQrToPayActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = manageQrToPayActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            HeartBeatInfo heartBeatInfo = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (heartBeatInfo == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer heartBeatInfo$MediaBrowserCompat$CustomActionResultReceiver = new HeartBeatInfo$MediaBrowserCompat$CustomActionResultReceiver(heartBeatInfo);
            if (heartBeatInfo.RatingCompat != null) {
                heartBeatInfo$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(heartBeatInfo.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.myqr_setting_qr_confirm_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.myqr_setting_qr_confirm_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.confirm), new write(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cancel), ManageQrToPayActivity$MediaBrowserCompat$MediaItem.write).show();
    }

    public final void read(isShutdown isshutdown) {
        onGetStartedClick.write((Object) isshutdown, "display");
        CrashlyticsReport.FilesPayload.File.write write2 = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.BSCANC_SOURCE_FUNCTION);
        write2.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.from);
        write2.RatingCompat = true;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.layout_account_selector, AccountSourceSelectFragment.MediaBrowserCompat$CustomActionResultReceiver(new CrashlyticsReport.FilesPayload.File(write2, (byte) 0), isshutdown.write, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.WARNING_ERROR)).IconCompatParcelizer();
    }

    public final void read(boolean z) {
        Button button = this.btnAction;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnAction");
        }
        button.setEnabled(z);
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 1999(0x7cf, float:2.801E-42)
            if (r6 != r0) goto L_0x00dc
            r6 = -1
            if (r7 != r6) goto L_0x00dc
            r7 = 0
            if (r8 == 0) goto L_0x0014
            java.lang.String r0 = "KEY_RESPONSE_CODE"
            java.lang.String r0 = r8.getStringExtra(r0)
            goto L_0x0015
        L_0x0014:
            r0 = r7
        L_0x0015:
            if (r0 == 0) goto L_0x00dc
            java.lang.String r1 = "3005"
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r0)
            r1 = 2131759411(0x7f101133, float:1.9149813E38)
            r2 = 1
            if (r0 == 0) goto L_0x0089
            boolean r0 = r5.MediaBrowserCompat$SearchResultReceiver
            if (r0 != 0) goto L_0x0089
            java.lang.String r7 = r5.MediaMetadataCompat
            java.lang.String r8 = "ONBOARDING"
            boolean r7 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r7, (java.lang.Object) r8)
            if (r7 == 0) goto L_0x0078
            com.scb.phone.view.activity.bscanc.BScanCEntryPointActivity$write r6 = com.scb.phone.view.activity.bscanc.BScanCEntryPointActivity.MediaDescriptionCompat
            r6 = r5
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r7 = r5.getString(r1)
            android.content.Intent r6 = com.scb.phone.view.activity.bscanc.BScanCEntryPointActivity.write.read(r6, r7)
            com.thunderhead.android.aspects.IntentTidInjectionContextAspect.aspectOf()
            o.ZoomDocumentActivity r6 = p040o.setTapText.write(r5, r6)     // Catch:{ all -> 0x0073 }
            android.content.Intent r6 = r6.read()     // Catch:{ all -> 0x0073 }
            o.MyECouponActivity_ViewBinding$write r7 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "Uri intercepted on Context.startActivity(Intent), modified: "
            r8.<init>(r0)     // Catch:{ all -> 0x0073 }
            android.net.Uri r0 = r6.getData()     // Catch:{ all -> 0x0073 }
            r8.append(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "\n with context "
            r8.append(r0)     // Catch:{ all -> 0x0073 }
            int r0 = r5.hashCode()     // Catch:{ all -> 0x0073 }
            r8.append(r0)     // Catch:{ all -> 0x0073 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0073 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0073 }
            r7 = r5
            com.scb.phone.view.activity.bscanc.ManageQrToPayActivity r7 = (com.scb.phone.view.activity.bscanc.ManageQrToPayActivity) r7     // Catch:{ all -> 0x0073 }
            r7.startActivity(r6)     // Catch:{ all -> 0x0073 }
            goto L_0x0085
        L_0x0073:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x0085
        L_0x0078:
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "EXTRAS_DISPLAY_SUCCESS"
            r7.putExtra(r8, r2)
            r5.setResult(r6, r7)
        L_0x0085:
            r5.finish()
            return
        L_0x0089:
            com.scb.phone.view.activity.bscanc.QrToPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver r6 = com.scb.phone.view.activity.bscanc.QrToPayOtpActivity.MediaBrowserCompat$SearchResultReceiver
            if (r8 == 0) goto L_0x009c
            android.os.Bundle r6 = r8.getExtras()
            if (r6 == 0) goto L_0x009c
            java.lang.String r7 = "QR_BSCANC"
            android.os.Parcelable r6 = r6.getParcelable(r7)
            r7 = r6
            o.isShutdown r7 = (p040o.isShutdown) r7
        L_0x009c:
            if (r7 == 0) goto L_0x00cd
            o.HeartBeatInfo r6 = r5.presenter
            java.lang.String r8 = "presenter"
            if (r6 != 0) goto L_0x00a7
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00a7:
            double r3 = r7.IconCompatParcelizer
            r6.MediaBrowserCompat$SearchResultReceiver = r3
            o.HeartBeatInfo r6 = r5.presenter
            if (r6 != 0) goto L_0x00b2
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r8)
        L_0x00b2:
            double r3 = r7.IconCompatParcelizer
            r6.write = r3
            o.HeartBeatInfo$RatingCompat r8 = new o.HeartBeatInfo$RatingCompat
            r8.<init>(r6)
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r0 = r6.RatingCompat
            if (r0 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            if (r2 == 0) goto L_0x00ca
            T r6 = r6.RatingCompat
            r8.IconCompatParcelizer(r6)
        L_0x00ca:
            r5.IconCompatParcelizer(r7)
        L_0x00cd:
            r6 = r5
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.String r7 = r5.getString(r1)
            o.getOversizeImage r8 = p040o.getOversizeImage.SUCCESS
            r0 = 2131302195(0x7f091733, float:1.822247E38)
            r5.write(r6, r0, r7, r8)
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.bscanc.ManageQrToPayActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        onGetStartedClick.write((Object) builder, "accountSourceDisplay");
        HeartBeatInfo heartBeatInfo = this.presenter;
        if (heartBeatInfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) builder, "accountSelected");
        heartBeatInfo.read = builder;
        HeartBeatInfo heartBeatInfo2 = this.presenter;
        if (heartBeatInfo2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (heartBeatInfo2.IconCompatParcelizer == null) {
            HeartBeatInfo heartBeatInfo3 = this.presenter;
            if (heartBeatInfo3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            heartBeatInfo3.IconCompatParcelizer = builder;
        }
        HeartBeatInfo heartBeatInfo4 = this.presenter;
        if (heartBeatInfo4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new HeartBeatInfo.read(heartBeatInfo4);
        if (heartBeatInfo4.RatingCompat != null) {
            read2.IconCompatParcelizer(heartBeatInfo4.RatingCompat);
        }
    }

    public final void write(double d, boolean z) {
        HeartBeatInfo heartBeatInfo = this.presenter;
        if (heartBeatInfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        heartBeatInfo.write = d;
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new HeartBeatInfo.RatingCompat(heartBeatInfo);
        if (heartBeatInfo.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(heartBeatInfo.RatingCompat);
        }
    }

    public final void MediaSessionCompat$Token() {
        MediaSessionCompat$QueueItem();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13975x50fd9e4a() {
        MediaSessionCompat$QueueItem();
    }

    /* access modifiers changed from: private */
    public final void MediaSessionCompat$QueueItem() {
        HeartBeatInfo heartBeatInfo = this.presenter;
        if (heartBeatInfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomDeltaInputPressed customDeltaInputPressed = this.qrLimitAmount;
        if (customDeltaInputPressed == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        writeUInt64NoTag.IconCompatParcelizer heartBeatInfo$MediaSessionCompat$ResultReceiverWrapper = new HeartBeatInfo$MediaSessionCompat$ResultReceiverWrapper(heartBeatInfo, customDeltaInputPressed.IconCompatParcelizer);
        if (heartBeatInfo.RatingCompat != null) {
            heartBeatInfo$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(heartBeatInfo.RatingCompat);
        }
    }

    @OnClick
    public final void onSaveClick() {
        String str;
        String str2;
        String str3;
        CustomDeltaInputPressed customDeltaInputPressed = this.qrLimitAmount;
        if (customDeltaInputPressed == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrLimitAmount");
        }
        customDeltaInputPressed.clearFocus();
        HeartBeatInfo heartBeatInfo = this.presenter;
        if (heartBeatInfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str4 = this.MediaMetadataCompat;
        boolean z = false;
        if (heartBeatInfo.MediaBrowserCompat$CustomActionResultReceiver()) {
            CrashlyticsReport.FilesPayload.File.Builder builder = heartBeatInfo.IconCompatParcelizer;
            if (builder != null) {
                str = builder.f2695x50fd9e4a;
            } else {
                str = null;
            }
            CrashlyticsReport.FilesPayload.File.Builder builder2 = heartBeatInfo.read;
            if (builder2 != null) {
                str2 = builder2.f2695x50fd9e4a;
            } else {
                str2 = null;
            }
            if (!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, str2, true) || heartBeatInfo.MediaBrowserCompat$SearchResultReceiver != heartBeatInfo.write) {
                if (heartBeatInfo.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    heartBeatInfo.RatingCompat.AlertController$RecycleListView();
                }
                CrashlyticsReport.FilesPayload.File.Builder builder3 = heartBeatInfo.read;
                if (builder3 != null) {
                    str3 = builder3.f2695x50fd9e4a;
                } else {
                    str3 = null;
                }
                ComputingConcurrentHashMap.ComputationExceptionReference computationExceptionReference = new ComputingConcurrentHashMap.ComputationExceptionReference(str3, String.valueOf(heartBeatInfo.write), str4);
                getKeepAlive getkeepalive = heartBeatInfo.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) computationExceptionReference, "request");
                getkeepalive.read(getkeepalive.IconCompatParcelizer.write((String) null, (String) null, computationExceptionReference), new HeartBeatInfo.write(heartBeatInfo), new HeartBeatInfo$MediaBrowserCompat$SearchResultReceiver(heartBeatInfo));
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = HeartBeatInfo.MediaMetadataCompat.read;
            if (heartBeatInfo.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(heartBeatInfo.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer heartBeatInfo$MediaSessionCompat$ResultReceiverWrapper = new HeartBeatInfo$MediaSessionCompat$ResultReceiverWrapper(heartBeatInfo, heartBeatInfo.write);
        if (heartBeatInfo.RatingCompat != null) {
            z = true;
        }
        if (z) {
            heartBeatInfo$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(heartBeatInfo.RatingCompat);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onBackPressed() {
        setResult(-1);
        finish();
    }
}

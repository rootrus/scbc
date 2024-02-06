package com.scb.phone.view.fragment.directdebit;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.view.activity.directdebit.DirectDebitReviewActivity;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.scb.phone.view.fragment.transferandpay.BaseDuplicatedTransferFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10827Iterators;
import p040o.CrashlyticsReport;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.FragmentBuilder_BindBillPaymentTabFragment;
import p040o.FundFactSheetActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.MissingNativeComponent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver;
import p040o.XVrsAutoOrientation;
import p040o.getOsFile;
import p040o.inject_base64Decoder;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.whenAllComplete;

public final class DirectDebitInputSelectedFragment extends BaseDuplicatedTransferFragment implements FragmentBuilder_BindBillPaymentTabFragment, inject_base64Decoder.write, AccountSourceSelectFragment.write {
    public static final C5909xd3cfe85f MediaBrowserCompat$CustomActionResultReceiver = new C5909xd3cfe85f((byte) 0);
    private String IconCompatParcelizer;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver MediaMetadataCompat;
    @BindView
    public Button mButton;
    @BindView
    public CustomTransferAndPayBiller mCustomTransferAndPayBiller;
    @BindView
    public ScbEditText mReferenceEditText1;
    @BindView
    public ScbEditText mReferenceEditText2;
    @BindView
    public TextView mReferenceTextView1;
    @BindView
    public TextView mReferenceTextView2;
    @HmlPinActivity
    public XVrsAutoOrientation presenter;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            onCheckBoxClick.write((Throwable) obj);
        }
    }

    /* JADX WARNING: type inference failed for: r7v16, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r0 = "inflater"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            super.onCreateView(r6, r7, r8)
            r8 = 0
            r0 = 2131493899(0x7f0c040b, float:1.8611291E38)
            android.view.View r6 = r6.inflate(r0, r7, r8)
            butterknife.ButterKnife.IconCompatParcelizer(r5, r6)
            o.XVrsAutoOrientation r7 = r5.presenter
            java.lang.String r0 = "presenter"
            if (r7 != 0) goto L_0x001c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x001c:
            r1 = r5
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r1 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r1
            r7.MediaBrowserCompat$ItemReceiver(r1)
            o.XVrsAutoOrientation r7 = r5.presenter
            if (r7 != 0) goto L_0x0029
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0029:
            android.os.Bundle r0 = r5.getArguments()
            r1 = 0
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = "com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            o.CrashlyticsReport$Session$Event$Application$Execution r0 = (p040o.CrashlyticsReport.Session.Event.Application.Execution) r0
            goto L_0x003a
        L_0x0039:
            r0 = r1
        L_0x003a:
            android.os.Bundle r2 = r5.getArguments()
            r3 = 1
            if (r2 == 0) goto L_0x0048
            java.lang.String r4 = "EXTRA_IS_FROM_SCAN"
            boolean r2 = r2.getBoolean(r4)
            goto L_0x0049
        L_0x0048:
            r2 = r3
        L_0x0049:
            r7.MediaBrowserCompat$ItemReceiver = r0
            r0 = r2 ^ 1
            r7.write = r0
            T r0 = r7.RatingCompat
            if (r0 == 0) goto L_0x0055
            r0 = r3
            goto L_0x0056
        L_0x0055:
            r0 = r8
        L_0x0056:
            if (r0 == 0) goto L_0x00a7
            o.XVrsAutoOrientation$IconCompatParcelizer r0 = new o.XVrsAutoOrientation$IconCompatParcelizer
            r0.<init>(r7)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x0065
            r2 = r3
            goto L_0x0066
        L_0x0065:
            r2 = r8
        L_0x0066:
            if (r2 == 0) goto L_0x006d
            T r2 = r7.RatingCompat
            r0.IconCompatParcelizer(r2)
        L_0x006d:
            o.CrashlyticsReport$Session$Event$Application$Execution r0 = r7.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r0.setForceShowIcon
            goto L_0x0075
        L_0x0074:
            r0 = r1
        L_0x0075:
            java.lang.String r2 = "02"
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0092
            o.XVrsAutoOrientation$read r0 = new o.XVrsAutoOrientation$read
            r0.<init>(r7)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x008a
            r2 = r3
            goto L_0x008b
        L_0x008a:
            r2 = r8
        L_0x008b:
            if (r2 == 0) goto L_0x0092
            T r2 = r7.RatingCompat
            r0.IconCompatParcelizer(r2)
        L_0x0092:
            o.XVrsAutoOrientation$MediaBrowserCompat$ItemReceiver r0 = new o.XVrsAutoOrientation$MediaBrowserCompat$ItemReceiver
            r0.<init>(r7)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r7.RatingCompat
            if (r2 == 0) goto L_0x009f
            r2 = r3
            goto L_0x00a0
        L_0x009f:
            r2 = r8
        L_0x00a0:
            if (r2 == 0) goto L_0x00a7
            T r7 = r7.RatingCompat
            r0.IconCompatParcelizer(r7)
        L_0x00a7:
            android.os.Bundle r7 = r5.getArguments()
            if (r7 == 0) goto L_0x00c8
            java.lang.String r0 = "com.scb.phone.EXTRA_ACCOUNT_SELECTED"
            boolean r7 = r7.containsKey(r0)
            if (r7 != r3) goto L_0x00c8
            android.os.Bundle r7 = r5.getArguments()
            if (r7 == 0) goto L_0x00c2
            android.os.Parcelable r7 = r7.getParcelable(r0)
            r1 = r7
            o.CrashlyticsReport$FilesPayload$File$Builder r1 = (p040o.CrashlyticsReport.FilesPayload.File.Builder) r1
        L_0x00c2:
            if (r1 == 0) goto L_0x00c8
            java.lang.String r7 = r1.MediaSessionCompat$Token
            r5.IconCompatParcelizer = r7
        L_0x00c8:
            android.text.InputFilter[] r7 = new android.text.InputFilter[r3]
            o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment r0 = new o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment
            java.lang.String r1 = "^[a-zA-Z0-9]+$"
            r0.<init>((java.lang.String) r1)
            android.text.InputFilter r0 = (android.text.InputFilter) r0
            r7[r8] = r0
            com.scb.phone.view.custom.ScbEditText r0 = r5.mReferenceEditText1
            java.lang.String r1 = "mReferenceEditText1"
            if (r0 != 0) goto L_0x00de
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00de:
            r0.setFilters(r7)
            com.scb.phone.view.custom.ScbEditText r0 = r5.mReferenceEditText2
            java.lang.String r2 = "mReferenceEditText2"
            if (r0 != 0) goto L_0x00ea
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x00ea:
            r0.setFilters(r7)
            com.scb.phone.view.custom.ScbEditText r7 = r5.mReferenceEditText1
            if (r7 != 0) goto L_0x00f4
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00f4:
            com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment$read r0 = new com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment$read
            r0.<init>()
            com.scb.phone.view.custom.ScbEditText$write r0 = (com.scb.phone.view.custom.ScbEditText.write) r0
            r7.setOnPasteListener(r0)
            com.scb.phone.view.custom.ScbEditText r7 = r5.mReferenceEditText2
            if (r7 != 0) goto L_0x0105
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0105:
            com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment$read r0 = new com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment$read
            r0.<init>()
            com.scb.phone.view.custom.ScbEditText$write r0 = (com.scb.phone.view.custom.ScbEditText.write) r0
            r7.setOnPasteListener(r0)
            r0 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            o.DebitCardResetOtpActivity r7 = p040o.DebitCardResetOtpActivity.interval(r0, r7)
            o.BankingAgentDeepLinkActivity r0 = p040o.HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()
            o.DebitCardResetOtpActivity r7 = r7.subscribeOn(r0)
            o.BankingAgentDeepLinkActivity r0 = p040o.BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()
            o.DebitCardResetOtpActivity r7 = r7.observeOn(r0)
            com.scb.phone.view.fragment.directdebit.DirectDebitInputSelectedFragment$MediaBrowserCompat$ItemReceiver r0 = new com.scb.phone.view.fragment.directdebit.DirectDebitInputSelectedFragment$MediaBrowserCompat$ItemReceiver
            r0.<init>(r5)
            o.DebitCardMarketConductDeepLinkActivity r0 = (p040o.DebitCardMarketConductDeepLinkActivity) r0
            com.scb.phone.view.fragment.directdebit.DirectDebitInputSelectedFragment$read r1 = com.scb.phone.view.fragment.directdebit.DirectDebitInputSelectedFragment.read.IconCompatParcelizer
            o.DebitCardMarketConductDeepLinkActivity r1 = (p040o.DebitCardMarketConductDeepLinkActivity) r1
            o.BulkTransferDeepLinkActivity r7 = r7.subscribe(r0, r1)
            java.lang.String r0 = "Observable.interval(TRAN…ed() }, { Timber.w(it) })"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r0)
            r5.MediaDescriptionCompat = r7
            android.widget.Button r7 = r5.mButton
            if (r7 != 0) goto L_0x0146
            java.lang.String r0 = "mButton"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0146:
            r7.setEnabled(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.directdebit.DirectDebitInputSelectedFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        XVrsAutoOrientation xVrsAutoOrientation = this.presenter;
        if (xVrsAutoOrientation == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        xVrsAutoOrientation.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewButtonSubscription");
        }
        if (!bulkTransferDeepLinkActivity.isDisposed()) {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity2 = this.MediaDescriptionCompat;
            if (bulkTransferDeepLinkActivity2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewButtonSubscription");
            }
            bulkTransferDeepLinkActivity2.dispose();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        if (execution != null) {
            CustomTransferAndPayBiller customTransferAndPayBiller = this.mCustomTransferAndPayBiller;
            if (customTransferAndPayBiller == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCustomTransferAndPayBiller");
            }
            customTransferAndPayBiller.setDescription(execution.MediaDescriptionCompat);
            customTransferAndPayBiller.setTitle(execution.read());
            customTransferAndPayBiller.setAvatar(execution.MediaBrowserCompat$CustomActionResultReceiver());
            customTransferAndPayBiller.setOnCustomTransferAndPayItemListener(this);
        }
    }

    public final void read(getOsFile getosfile) {
        onGetStartedClick.write((Object) getosfile, "directDebitTextDisplay");
        TextView textView = this.mReferenceTextView1;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceTextView1");
        }
        textView.setText(getosfile.write);
        TextView textView2 = this.mReferenceTextView1;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceTextView1");
        }
        View view = textView2;
        boolean z = getosfile.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        int i = 0;
        view.setVisibility(z ? 0 : 8);
        ScbEditText scbEditText = this.mReferenceEditText1;
        if (scbEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText1");
        }
        View view2 = scbEditText;
        boolean z2 = getosfile.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        if (!z2) {
            i = 8;
        }
        view2.setVisibility(i);
        ScbEditText scbEditText2 = this.mReferenceEditText1;
        if (scbEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText1");
        }
        scbEditText2.setEnabled(getosfile.IconCompatParcelizer);
        ScbEditText scbEditText3 = this.mReferenceEditText1;
        if (scbEditText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText1");
        }
        scbEditText3.setHint(getosfile.read);
        ScbEditText scbEditText4 = this.mReferenceEditText1;
        if (scbEditText4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText1");
        }
        scbEditText4.setText(getosfile.MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getOsFile getosfile) {
        onGetStartedClick.write((Object) getosfile, "directDebitTextDisplay");
        TextView textView = this.mReferenceTextView2;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceTextView2");
        }
        textView.setText(getosfile.write);
        TextView textView2 = this.mReferenceTextView2;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceTextView2");
        }
        View view = textView2;
        boolean z = getosfile.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        int i = 0;
        view.setVisibility(z ? 0 : 8);
        ScbEditText scbEditText = this.mReferenceEditText2;
        if (scbEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText2");
        }
        View view2 = scbEditText;
        boolean z2 = getosfile.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        if (!z2) {
            i = 8;
        }
        view2.setVisibility(i);
        ScbEditText scbEditText2 = this.mReferenceEditText2;
        if (scbEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText2");
        }
        scbEditText2.setEnabled(getosfile.IconCompatParcelizer);
        ScbEditText scbEditText3 = this.mReferenceEditText2;
        if (scbEditText3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText2");
        }
        scbEditText3.setHint(getosfile.read);
        ScbEditText scbEditText4 = this.mReferenceEditText2;
        if (scbEditText4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText2");
        }
        scbEditText4.setText(getosfile.MediaBrowserCompat$ItemReceiver);
    }

    public final void write(MissingNativeComponent.MissingNativeSessionFileProvider missingNativeSessionFileProvider) {
        onGetStartedClick.write((Object) missingNativeSessionFileProvider, "inputDisplay");
        DirectDebitReviewActivity.write write = DirectDebitReviewActivity.MediaDescriptionCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) missingNativeSessionFileProvider, "display");
        Intent intent = new Intent(requireContext, DirectDebitReviewActivity.class);
        intent.putExtra("EXTRA_DIRECT_DEBIT_INPUT_DISPLAY", missingNativeSessionFileProvider);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public final void onContinueButtonClicked() {
        String str;
        Boolean bool;
        XVrsAutoOrientation xVrsAutoOrientation = this.presenter;
        if (xVrsAutoOrientation == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str2 = this.IconCompatParcelizer;
        ScbEditText scbEditText = this.mReferenceEditText1;
        if (scbEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText1");
        }
        String valueOf = String.valueOf(scbEditText.getText());
        ScbEditText scbEditText2 = this.mReferenceEditText2;
        if (scbEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText2");
        }
        String valueOf2 = String.valueOf(scbEditText2.getText());
        CrashlyticsReport.Session.Event.Application.Execution execution = xVrsAutoOrientation.MediaBrowserCompat$ItemReceiver;
        Boolean bool2 = null;
        if (execution != null) {
            str = execution.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = null;
        }
        boolean z = true;
        if (str2 != null) {
            bool = Boolean.valueOf(str2.length() > 0);
        } else {
            bool = null;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
            if (str != null) {
                bool2 = Boolean.valueOf(str.length() > 0);
            }
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool2, (Object) Boolean.TRUE) && execution != null) {
                if (xVrsAutoOrientation.RatingCompat != null) {
                    if (xVrsAutoOrientation.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        xVrsAutoOrientation.RatingCompat.AlertController$RecycleListView();
                    }
                    C10827Iterators.C35412 r11 = xVrsAutoOrientation.read;
                    FundFactSheetActivity write = new XVrsAutoOrientation.write(xVrsAutoOrientation, execution, valueOf, valueOf2, str2);
                    FundFactSheetActivity mediaMetadataCompat = new XVrsAutoOrientation.MediaMetadataCompat(xVrsAutoOrientation);
                    CustomConcurrentHashMap.EntryFactory.C328811 r1 = new Object(str2, str, valueOf, valueOf2) {
                        @SerializedName("refNo2")
                        private final String MediaBrowserCompat$CustomActionResultReceiver;
                        @SerializedName("billerAccountNumber")
                        private final String MediaBrowserCompat$ItemReceiver;
                        @SerializedName("accountNumber")
                        private final String read;
                        @SerializedName("refNo1")
                        private final String write;

                        {
                            onGetStartedClick.write((Object) r2, "accountNumber");
                            onGetStartedClick.write((Object) r3, "billerAccountNumber");
                            this.read = r2;
                            this.MediaBrowserCompat$ItemReceiver = r3;
                            this.write = r4;
                            this.MediaBrowserCompat$CustomActionResultReceiver = r5;
                        }
                    };
                    onGetStartedClick.write((Object) write, "onSuccess");
                    onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
                    onGetStartedClick.write((Object) r1, "request");
                    r11.IconCompatParcelizer(r11.IconCompatParcelizer, write, mediaMetadataCompat, new whenAllComplete.read(r1));
                }
            }
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver)) {
            this.MediaMetadataCompat = (ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver) parentFragment;
        }
    }

    public final void aD_() {
        if (this.MediaMetadataCompat != null) {
            ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver serverProjectProvider$5$MediaBrowserCompat$ItemReceiver = this.MediaMetadataCompat;
            if (serverProjectProvider$5$MediaBrowserCompat$ItemReceiver == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("billerSelectedOnClosedListener");
            }
            serverProjectProvider$5$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }
    }

    public final void write(boolean z) {
        if (z) {
            CustomTransferAndPayBiller customTransferAndPayBiller = this.mCustomTransferAndPayBiller;
            if (customTransferAndPayBiller == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCustomTransferAndPayBiller");
            }
            customTransferAndPayBiller.mBackButton.setVisibility(0);
            return;
        }
        CustomTransferAndPayBiller customTransferAndPayBiller2 = this.mCustomTransferAndPayBiller;
        if (customTransferAndPayBiller2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCustomTransferAndPayBiller");
        }
        customTransferAndPayBiller2.mBackButton.setVisibility(8);
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(DirectDebitInputSelectedFragment directDebitInputSelectedFragment) {
        String str;
        XVrsAutoOrientation xVrsAutoOrientation = directDebitInputSelectedFragment.presenter;
        if (xVrsAutoOrientation == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str2 = directDebitInputSelectedFragment.IconCompatParcelizer;
        ScbEditText scbEditText = directDebitInputSelectedFragment.mReferenceEditText1;
        if (scbEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText1");
        }
        String valueOf = String.valueOf(scbEditText.getText());
        ScbEditText scbEditText2 = directDebitInputSelectedFragment.mReferenceEditText2;
        if (scbEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mReferenceEditText2");
        }
        String valueOf2 = String.valueOf(scbEditText2.getText());
        onGetStartedClick.write((Object) valueOf, "ref1");
        onGetStartedClick.write((Object) valueOf2, "ref2");
        CharSequence charSequence = str2;
        boolean z = true;
        if (!(charSequence == null || GoodToKnowActivity.read(charSequence))) {
            CrashlyticsReport.Session.Event.Application.Execution execution = xVrsAutoOrientation.MediaBrowserCompat$ItemReceiver;
            String str3 = null;
            if (execution != null) {
                str = execution.setForceShowIcon;
            } else {
                str = null;
            }
            CharSequence charSequence2 = str;
            if (!(charSequence2 == null || GoodToKnowActivity.read(charSequence2))) {
                CrashlyticsReport.Session.Event.Application.Execution execution2 = xVrsAutoOrientation.MediaBrowserCompat$ItemReceiver;
                if (execution2 != null) {
                    str3 = execution2.setForceShowIcon;
                }
                if (str3 != null) {
                    if ((r1 = str3.hashCode()) == 1537) {
                    }
                }
            }
        }
        z = false;
        Button button = directDebitInputSelectedFragment.mButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mButton");
        }
        if (button.isEnabled() != z) {
            Button button2 = directDebitInputSelectedFragment.mButton;
            if (button2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mButton");
            }
            button2.setEnabled(z);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.IconCompatParcelizer = builder.MediaSessionCompat$Token;
        }
    }
}

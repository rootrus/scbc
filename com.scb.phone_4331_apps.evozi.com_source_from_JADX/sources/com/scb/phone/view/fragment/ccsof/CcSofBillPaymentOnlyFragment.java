package com.scb.phone.view.fragment.ccsof;

import android.os.Bundle;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.ccsof.CcSofBillPaymentInputFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import p040o.C4577xa9b053c3;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.HmlPinActivity;
import p040o.IdCaptureBackActivity_MembersInjector;
import p040o.StreetViewPanoramaFragment;
import p040o.getGenericComponentType;
import p040o.jsonFromMapEntryString;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class CcSofBillPaymentOnlyFragment extends BaseFragment implements IdCaptureBackActivity_MembersInjector.IconCompatParcelizer, AccountSourceSelectFragment.write {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private AccountSourceSelectFragment MediaBrowserCompat$CustomActionResultReceiver;
    private CcSofBillPaymentInputFragment MediaMetadataCompat;
    @BindView
    public FrameLayout inputContainer;
    @HmlPinActivity
    public getGenericComponentType presenter;
    @BindView
    public FrameLayout sourceOfFundContainer;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            java.lang.String r12 = "inflater"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r12)
            r12 = 0
            r0 = 2131493833(0x7f0c03c9, float:1.8611157E38)
            android.view.View r10 = r10.inflate(r0, r11, r12)
            r9.MediaBrowserCompat$CustomActionResultReceiver(r9, r10)
            o.getGenericComponentType r11 = r9.presenter
            java.lang.String r0 = "presenter"
            if (r11 != 0) goto L_0x0019
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0019:
            r1 = r9
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r1 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r1
            r11.MediaBrowserCompat$ItemReceiver(r1)
            android.os.Bundle r11 = r9.getArguments()
            r1 = 0
            if (r11 == 0) goto L_0x0030
            java.lang.String r2 = "EXTRA_PURCHASE_SOURCE_FUND_DISPLAY"
            android.os.Parcelable r11 = r11.getParcelable(r2)
            o.lambda$processSetComponents$1 r11 = (p040o.lambda$processSetComponents$1) r11
            r4 = r11
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            android.os.Bundle r11 = r9.getArguments()
            if (r11 == 0) goto L_0x003f
            java.lang.String r2 = "EXTRA_CALLBACK_URL"
            java.lang.String r11 = r11.getString(r2)
            r5 = r11
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            android.os.Bundle r11 = r9.getArguments()
            java.lang.String r2 = ""
            if (r11 == 0) goto L_0x0053
            java.lang.String r3 = "EXTRA_BILL_PAYMENT_SUBTYPE"
            java.lang.String r11 = r11.getString(r3)
            if (r11 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r7 = r11
            goto L_0x0054
        L_0x0053:
            r7 = r2
        L_0x0054:
            java.lang.String r11 = "arguments?.getString(EXT…LL_PAYMENT_SUBTYPE) ?: \"\""
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r11)
            android.os.Bundle r11 = r9.getArguments()
            if (r11 == 0) goto L_0x0075
            r3 = -1
            java.lang.String r6 = "com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE"
            int r11 = r11.getInt(r6, r3)
            if (r11 < 0) goto L_0x006e
            o.jsonFromMapEntryString[] r1 = p040o.jsonFromMapEntryString.values()
            r1 = r1[r11]
        L_0x006e:
            o.jsonFromMapEntryString r1 = (p040o.jsonFromMapEntryString) r1
            if (r1 != 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r8 = r1
            goto L_0x0078
        L_0x0075:
            o.jsonFromMapEntryString r11 = p040o.jsonFromMapEntryString.NORMAL
            r8 = r11
        L_0x0078:
            if (r4 == 0) goto L_0x00f5
            o.getGenericComponentType r11 = r9.presenter
            if (r11 != 0) goto L_0x0081
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0081:
            java.lang.String r0 = "purchaseSourceOfFundDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = "firebaseSubType"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            java.lang.String r0 = "paymentFlowType"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            o.onNotNowClick$read r6 = new o.onNotNowClick$read
            r6.<init>()
            java.lang.String r0 = "partner_api"
            r6.MediaBrowserCompat$ItemReceiver = r0
            o.jsonFromMapEntryString r0 = p040o.jsonFromMapEntryString.INSURANCE_PORT
            if (r0 != r8) goto L_0x009f
            r6.MediaBrowserCompat$ItemReceiver = r2
        L_0x009f:
            o.getProvider r0 = r4.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x00ec
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x00ec
            T r1 = r11.RatingCompat
            if (r1 == 0) goto L_0x00ac
            r12 = 1
        L_0x00ac:
            if (r12 == 0) goto L_0x00b3
            T r12 = r11.RatingCompat
            r12.AlertController$RecycleListView()
        L_0x00b3:
            o.emptyModifiableIterator r12 = r11.write
            o.getGenericComponentType$write r1 = new o.getGenericComponentType$write
            r2 = r1
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
            o.getGenericComponentType$MediaBrowserCompat$ItemReceiver r2 = new o.getGenericComponentType$MediaBrowserCompat$ItemReceiver
            r2.<init>(r11)
            o.FundFactSheetActivity r2 = (p040o.FundFactSheetActivity) r2
            java.lang.String r11 = "onSuccess"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r11)
            java.lang.String r11 = "onError"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r11)
            java.lang.String r11 = "accountNumber"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r11)
            o.include r11 = r12.write
            o.DebitCardResetOtpActivity r12 = r11.MediaBrowserCompat$ItemReceiver((java.lang.String) r0)
            o.peekingIterator r0 = new o.peekingIterator
            r0.<init>(r1)
            o.DebitCardMarketConductDeepLinkActivity r0 = (p040o.DebitCardMarketConductDeepLinkActivity) r0
            o.peekingIterator r1 = new o.peekingIterator
            r1.<init>(r2)
            o.DebitCardMarketConductDeepLinkActivity r1 = (p040o.DebitCardMarketConductDeepLinkActivity) r1
            r11.read(r12, r0, r1)
            goto L_0x00f5
        L_0x00ec:
            o.getGenericComponentType r11 = (p040o.getGenericComponentType) r11
            int r12 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource
            o.access$2300$write r0 = p040o.access$2300.write.NAVIGATE_BACK
            r11.MediaBrowserCompat$ItemReceiver(r12, r0)
        L_0x00f5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ccsof.CcSofBillPaymentOnlyFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        getGenericComponentType getgenericcomponenttype = this.presenter;
        if (getgenericcomponenttype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getgenericcomponenttype.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TRANSFER_FUNCTION);
            write.RatingCompat = false;
            write.MediaDescriptionCompat = false;
            AccountSourceSelectFragment read = AccountSourceSelectFragment.read(new CrashlyticsReport.FilesPayload.File(write, (byte) 0));
            onGetStartedClick.IconCompatParcelizer((Object) read, "AccountSourceSelectFragment.newInstance(display)");
            this.MediaBrowserCompat$CustomActionResultReceiver = read;
        }
        CardView read2 = getChildFragmentManager().read();
        AccountSourceSelectFragment accountSourceSelectFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountSourceSelectFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSourceSelectFragment");
        }
        read2.MediaBrowserCompat$ItemReceiver(R.id.source_of_fund_container, accountSourceSelectFragment).write();
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution, StreetViewPanoramaFragment.zzb zzb, String str, String str2, jsonFromMapEntryString jsonfrommapentrystring) {
        onGetStartedClick.write((Object) execution, "billPaymentBillDisplay");
        onGetStartedClick.write((Object) zzb, "billPayMethod");
        onGetStartedClick.write((Object) str, "fireBaseSourceTag");
        onGetStartedClick.write((Object) str2, "firebaseSubType");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        if (this.MediaMetadataCompat == null) {
            CcSofBillPaymentInputFragment.IconCompatParcelizer iconCompatParcelizer = CcSofBillPaymentInputFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) execution, "billPaymentBillDisplay");
            onGetStartedClick.write((Object) zzb, "billPayMethod");
            onGetStartedClick.write((Object) str, "fireBaseSourceTag");
            onGetStartedClick.write((Object) str2, "firebaseSubTypeTag");
            onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
            CcSofBillPaymentInputFragment ccSofBillPaymentInputFragment = new CcSofBillPaymentInputFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
            bundle.putSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
            bundle.putString("source", str);
            bundle.putString("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE", str2);
            bundle.putSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring);
            ccSofBillPaymentInputFragment.setArguments(bundle);
            this.MediaMetadataCompat = ccSofBillPaymentInputFragment;
        }
        CardView read = getChildFragmentManager().read();
        CcSofBillPaymentInputFragment ccSofBillPaymentInputFragment2 = this.MediaMetadataCompat;
        if (ccSofBillPaymentInputFragment2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ccSofBillPaymentInputFragment");
        }
        read.MediaBrowserCompat$ItemReceiver(R.id.input_container, ccSofBillPaymentInputFragment2).write();
    }

    public final void read(CrashlyticsReport.FilesPayload.File.Builder builder) {
        onGetStartedClick.write((Object) builder, "accountSourceDisplay");
        CcSofBillPaymentInputFragment ccSofBillPaymentInputFragment = this.MediaMetadataCompat;
        if (ccSofBillPaymentInputFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ccSofBillPaymentInputFragment");
        }
        ccSofBillPaymentInputFragment.MediaBrowserCompat$CustomActionResultReceiver(builder);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        getGenericComponentType getgenericcomponenttype = this.presenter;
        if (getgenericcomponenttype == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (builder != null) {
            writeUInt64NoTag.IconCompatParcelizer getgenericcomponenttype_mediabrowsercompat_customactionresultreceiver = new C4577xa9b053c3(builder);
            if (getgenericcomponenttype.RatingCompat != null) {
                getgenericcomponenttype_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getgenericcomponenttype.RatingCompat);
            }
        }
    }
}

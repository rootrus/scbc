package com.scb.phone.view.fragment.transferandpay;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.SecondaryTabsFragment;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillSelectedFragment;
import p040o.ActivityBuilder_ContributeServiceAtBankingAgentCoachMarkActivity;
import p040o.ActivityBuilder_ContributeSetupNewPinActivity;
import p040o.C7085x54efaba5;
import p040o.C7428sC;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.ServerProjectProvider;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver;
import p040o.ServerProjectProvider$5$MediaBrowserCompat$MediaItem;
import p040o.StreetViewPanoramaFragment;
import p040o.ZSYR2K;
import p040o.getTopLeftCornerWidth$MediaBrowserCompat$MediaItem;
import p040o.jsonFromMapEntryString;

public class BillPaymentTabFragment extends BaseReplaceableFragment implements getTopLeftCornerWidth$MediaBrowserCompat$MediaItem, AccountSourceSelectFragment.write, ServerProjectProvider.C70695.MediaMetadataCompat, ServerProjectProvider$5$MediaBrowserCompat$ItemReceiver, ServerProjectProvider.C70695.read, ServerProjectProvider.C70695.IconCompatParcelizer, C7085x54efaba5, ServerProjectProvider$5$MediaBrowserCompat$MediaItem {
    private AccountSourceSelectFragment IconCompatParcelizer;
    public long MediaBrowserCompat$CustomActionResultReceiver;
    private ServerProjectProvider.C70695.RatingCompat MediaBrowserCompat$MediaItem;
    private CrashlyticsReport.FilesPayload.File.Builder MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f3098x50fd9e4a;
    private ServerProjectProvider.C70695.RatingCompat MediaDescriptionCompat;
    private BillPaymentBillerSelectedFragment MediaMetadataCompat;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private EBillSelectedFragment MediaSessionCompat$Token;
    private ServerProjectProvider.C70695.RatingCompat RatingCompat;
    @BindView
    TextView banner;
    @BindView
    public NestedScrollView billPaymentTabNestedScrollView;
    @BindView
    FrameLayout fragmentContainer;
    @HmlPinActivity
    public C7428sC presenter;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    public final ServerProjectProvider$5$MediaBrowserCompat$MediaItem write() {
        return this;
    }

    public static BillPaymentTabFragment write(StreetViewPanoramaFragment.zzb zzb, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        bundle.putString("source", str);
        BillPaymentTabFragment billPaymentTabFragment = new BillPaymentTabFragment();
        billPaymentTabFragment.setArguments(bundle);
        return billPaymentTabFragment;
    }

    public static BillPaymentTabFragment IconCompatParcelizer(StreetViewPanoramaFragment.zzb zzb, CrashlyticsReport.Session.Event.Application.Execution execution, LogFileManager.C35981 r4, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_HISTORY", r4);
        bundle.putBoolean("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE", z);
        bundle.putString("source", str);
        BillPaymentTabFragment billPaymentTabFragment = new BillPaymentTabFragment();
        billPaymentTabFragment.setArguments(bundle);
        return billPaymentTabFragment;
    }

    public static BillPaymentTabFragment MediaBrowserCompat$ItemReceiver(StreetViewPanoramaFragment.zzb zzb, CrashlyticsReport.Session.Event.Application.Execution execution, String str, String str2, String str3, String str4, jsonFromMapEntryString jsonfrommapentrystring) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_HISTORY", (Parcelable) null);
        bundle.putBoolean("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE", false);
        bundle.putString("com.scb.phone.analytics.KEY_EVENT_NAME", str);
        bundle.putString("source", str2);
        bundle.putString("subtype", str3);
        bundle.putString("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_CALLBACK", str4);
        bundle.putSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring);
        BillPaymentTabFragment billPaymentTabFragment = new BillPaymentTabFragment();
        billPaymentTabFragment.setArguments(bundle);
        return billPaymentTabFragment;
    }

    public static BillPaymentTabFragment MediaBrowserCompat$CustomActionResultReceiver(StreetViewPanoramaFragment.zzb zzb, String str) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        bundle.putBoolean("com.scb.phone.FAVOURITE", true);
        bundle.putString("source", str);
        BillPaymentTabFragment billPaymentTabFragment = new BillPaymentTabFragment();
        billPaymentTabFragment.setArguments(bundle);
        return billPaymentTabFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r8 = (p040o.CrashlyticsReport.Session.Event.Application.Execution) getArguments().getParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r9 = 0
            r0 = 2131493804(0x7f0c03ac, float:1.8611098E38)
            android.view.View r7 = r7.inflate(r0, r8, r9)
            r6.MediaBrowserCompat$CustomActionResultReceiver(r6, r7)
            android.os.Bundle r8 = r6.getArguments()
            java.lang.String r0 = "com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY"
            r1 = 1
            if (r8 == 0) goto L_0x0036
            android.os.Bundle r8 = r6.getArguments()
            boolean r8 = r8.containsKey(r0)
            if (r8 == 0) goto L_0x0036
            android.os.Bundle r8 = r6.getArguments()
            android.os.Parcelable r8 = r8.getParcelable(r0)
            o.CrashlyticsReport$Session$Event$Application$Execution r8 = (p040o.CrashlyticsReport.Session.Event.Application.Execution) r8
            if (r8 == 0) goto L_0x0036
            java.lang.String r8 = r8.setTitle
            java.lang.String r2 = "EDONATION"
            boolean r8 = r2.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0036
            r8 = r1
            goto L_0x0037
        L_0x0036:
            r8 = r9
        L_0x0037:
            if (r8 == 0) goto L_0x003c
            o.CrashlyticsReportJsonTransform$$Lambda$4 r8 = p040o.CrashlyticsReportJsonTransform$$Lambda$4.E_DONATION_FUNCTION
            goto L_0x003e
        L_0x003c:
            o.CrashlyticsReportJsonTransform$$Lambda$4 r8 = p040o.CrashlyticsReportJsonTransform$$Lambda$4.BILL_PAYMENT_FUNCTION
        L_0x003e:
            o.CrashlyticsReport$FilesPayload$File$write r2 = new o.CrashlyticsReport$FilesPayload$File$write
            r2.<init>(r8)
            r2.MediaBrowserCompat$ItemReceiver = r9
            r2.IconCompatParcelizer = r1
            r2.MediaDescriptionCompat = r1
            r2.RatingCompat = r1
            o.CrashlyticsReport$FilesPayload$File r8 = new o.CrashlyticsReport$FilesPayload$File
            r8.<init>(r2, r9)
            com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment r8 = com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment.read((p040o.CrashlyticsReport.FilesPayload.File) r8)
            r6.IconCompatParcelizer = r8
            o.setTitleMarginStart r8 = r6.getChildFragmentManager()
            o.CardView r8 = r8.read()
            r2 = 2131297806(0x7f09060e, float:1.8213567E38)
            com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment r3 = r6.IconCompatParcelizer
            r8.MediaBrowserCompat$ItemReceiver(r2, r3)
            r8.write()
            android.os.Bundle r8 = r6.getArguments()
            java.lang.String r2 = ""
            if (r8 == 0) goto L_0x007b
            android.os.Bundle r8 = r6.getArguments()
            java.lang.String r3 = "com.scb.phone.analytics.KEY_EVENT_NAME"
            java.lang.String r2 = r8.getString(r3, r2)
        L_0x007b:
            java.lang.String r8 = r6.AbsActionBarView()
            r6.MediaSessionCompat$ResultReceiverWrapper = r8
            java.lang.String r8 = r6.setVisibility()
            r6.f3098x50fd9e4a = r8
            o.sC r8 = r6.presenter
            r8.MediaBrowserCompat$ItemReceiver(r6)
            o.sC r8 = r6.presenter
            java.lang.String r3 = r6.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r4 = r6.f3098x50fd9e4a
            boolean r5 = p040o.ModifyQuickTopUpReviewActivity.write(r2)
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x00b5
            java.lang.String r5 = "partner_api"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x00b5
            o.rA r5 = new o.rA
            r5.<init>(r2, r3, r4)
            T r2 = r8.RatingCompat
            if (r2 == 0) goto L_0x00ac
            r2 = r1
            goto L_0x00ad
        L_0x00ac:
            r2 = r9
        L_0x00ad:
            if (r2 == 0) goto L_0x00d8
            T r8 = r8.RatingCompat
            r5.IconCompatParcelizer(r8)
            goto L_0x00d8
        L_0x00b5:
            boolean r2 = p040o.ModifyQuickTopUpReviewActivity.write(r2)
            if (r2 == 0) goto L_0x00d8
            java.lang.String r2 = "gifting_input"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00c5
            java.lang.String r3 = "input"
        L_0x00c5:
            o.rB r2 = new o.rB
            r2.<init>(r3, r4)
            T r3 = r8.RatingCompat
            if (r3 == 0) goto L_0x00d0
            r3 = r1
            goto L_0x00d1
        L_0x00d0:
            r3 = r9
        L_0x00d1:
            if (r3 == 0) goto L_0x00d8
            T r8 = r8.RatingCompat
            r2.IconCompatParcelizer(r8)
        L_0x00d8:
            android.os.Bundle r8 = r6.getArguments()
            if (r8 == 0) goto L_0x0124
            android.os.Bundle r8 = r6.getArguments()
            android.os.Parcelable r8 = r8.getParcelable(r0)
            if (r8 == 0) goto L_0x0124
            o.sC r8 = r6.presenter
            android.os.Bundle r2 = r6.getArguments()
            android.os.Parcelable r0 = r2.getParcelable(r0)
            o.CrashlyticsReport$Session$Event$Application$Execution r0 = (p040o.CrashlyticsReport.Session.Event.Application.Execution) r0
            android.os.Bundle r2 = r6.getArguments()
            java.lang.String r3 = "com.scb.phone.EXTRA_BILL_PAYMENT_HISTORY"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            o.LogFileManager$1 r2 = (p040o.LogFileManager.C35981) r2
            if (r2 == 0) goto L_0x0112
            java.lang.String r3 = r2.read
            r0.MediaBrowserCompat$MediaItem = r3
            java.lang.String r3 = r2.RatingCompat
            r0.setPopupCallback = r3
            java.lang.String r3 = r2.MediaDescriptionCompat
            r0.setGroupDividerEnabled = r3
            java.lang.String r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r0.MediaBrowserCompat$SearchResultReceiver = r2
        L_0x0112:
            o.rx r2 = new o.rx
            r2.<init>(r0)
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x011c
            r9 = r1
        L_0x011c:
            if (r9 == 0) goto L_0x0174
            T r8 = r8.RatingCompat
            r2.IconCompatParcelizer(r8)
            goto L_0x0174
        L_0x0124:
            android.os.Bundle r8 = r6.getArguments()
            if (r8 == 0) goto L_0x0167
            android.os.Bundle r8 = r6.getArguments()
            java.lang.String r0 = "com.scb.phone.FAVOURITE"
            boolean r8 = r8.getBoolean(r0)
            if (r8 == 0) goto L_0x0167
            o.sC r8 = r6.presenter
            o.include r0 = r8.read
            o.classificationConfidence r0 = r0.MediaBrowserCompat$ItemReceiver
            o.onInfoWindowLongClick r0 = r0.write()
            if (r0 == 0) goto L_0x0159
            o.StreetViewPanoramaView$zzb r2 = r0.setHasDecor
            if (r2 == 0) goto L_0x0159
            o.rz r2 = new o.rz
            r2.<init>(r8, r0)
            T r0 = r8.RatingCompat
            if (r0 == 0) goto L_0x0151
            r0 = r1
            goto L_0x0152
        L_0x0151:
            r0 = r9
        L_0x0152:
            if (r0 == 0) goto L_0x0159
            T r0 = r8.RatingCompat
            r2.IconCompatParcelizer(r0)
        L_0x0159:
            o.sr r0 = p040o.C7473sr.MediaBrowserCompat$CustomActionResultReceiver
            T r2 = r8.RatingCompat
            if (r2 == 0) goto L_0x0160
            r9 = r1
        L_0x0160:
            if (r9 == 0) goto L_0x0167
            T r8 = r8.RatingCompat
            r0.IconCompatParcelizer(r8)
        L_0x0167:
            com.scb.phone.view.fragment.transferandpay.billpaymenttab.SecondaryTabsFragment r8 = new com.scb.phone.view.fragment.transferandpay.billpaymenttab.SecondaryTabsFragment
            r8.<init>()
            r9 = 2131297825(0x7f090621, float:1.8213606E38)
            java.lang.String r0 = "BILLER_PAYMENT_SECONDARY_TABS_TAG"
            r6.read(r8, r9, r0, r1)
        L_0x0174:
            androidx.core.widget.NestedScrollView r8 = r6.billPaymentTabNestedScrollView
            if (r8 == 0) goto L_0x0180
            o.ActivityBuilder_ContributeStaticTileCustomizationActivity r9 = new o.ActivityBuilder_ContributeStaticTileCustomizationActivity
            r9.<init>(r6)
            r8.setOnScrollChangeListener(r9)
        L_0x0180:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CardView read = getFragmentManager().read();
        read.MediaBrowserCompat$ItemReceiver(getChildFragmentManager().findFragmentById(R.id.fragment_favourite_bill_payment_target));
        read.write();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", str2), new ZSYR2K("subtype", str3)};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write(str, zsyr2kArr);
        }
    }

    public final void write(String str) {
        this.banner.setVisibility(0);
        this.banner.setText(str);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.StreetViewPanoramaFragment.zzb MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r3 = this;
            o.StreetViewPanoramaFragment$zzb r0 = p040o.StreetViewPanoramaFragment.zzb.PROFILE
            android.os.Bundle r1 = r3.getArguments()
            if (r1 == 0) goto L_0x000f
            java.lang.String r2 = "com.scb.phone.EXTRA_BILL_PAY_METHOD"
            java.io.Serializable r1 = r1.getSerializable(r2)
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            boolean r2 = r1 instanceof p040o.StreetViewPanoramaFragment.zzb
            if (r2 == 0) goto L_0x0017
            r0 = r1
            o.StreetViewPanoramaFragment$zzb r0 = (p040o.StreetViewPanoramaFragment.zzb) r0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment.MediaBrowserCompat$CustomActionResultReceiver():o.StreetViewPanoramaFragment$zzb");
    }

    /* access modifiers changed from: protected */
    public final void aA_() {
        super.aA_();
        this.MediaMetadataCompat = null;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        jsonFromMapEntryString jsonfrommapentrystring;
        StreetViewPanoramaFragment.zzb MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        super.aA_();
        String str = null;
        this.MediaMetadataCompat = null;
        String str2 = this.MediaSessionCompat$ResultReceiverWrapper;
        boolean z = (getArguments() == null || !getArguments().containsKey("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE")) ? true : getArguments().getBoolean("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE", true);
        CrashlyticsReport.FilesPayload.File.Builder builder = this.MediaBrowserCompat$SearchResultReceiver;
        String str3 = this.f3098x50fd9e4a;
        if (getArguments() != null && getArguments().containsKey("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_CALLBACK")) {
            str = getArguments().getString("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_CALLBACK");
        }
        String str4 = str;
        if (getArguments() == null || getArguments().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE") == null) {
            jsonfrommapentrystring = jsonFromMapEntryString.NORMAL;
        } else {
            jsonfrommapentrystring = (jsonFromMapEntryString) getArguments().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE");
        }
        BillPaymentBillerSelectedFragment read = BillPaymentBillerSelectedFragment.read(execution, MediaBrowserCompat$CustomActionResultReceiver2, str2, z, builder, str3, str4, jsonfrommapentrystring);
        this.MediaMetadataCompat = read;
        read(read, R.id.fragment_container_bill_payment_tabs, "BILLER_PAYMENT_SELECTED_FRAGMENT_TAG", true, true);
    }

    public final void aw_() {
        super.aw_();
        ServerProjectProvider.C70695.RatingCompat ratingCompat = this.MediaBrowserCompat$MediaItem;
        if (ratingCompat != null) {
            ratingCompat.MediaBrowserCompat$ItemReceiver();
        }
        ServerProjectProvider.C70695.RatingCompat ratingCompat2 = this.RatingCompat;
        if (ratingCompat2 != null) {
            ratingCompat2.MediaBrowserCompat$ItemReceiver();
        }
        ServerProjectProvider.C70695.RatingCompat ratingCompat3 = this.MediaDescriptionCompat;
        if (ratingCompat3 != null) {
            ratingCompat3.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.MediaBrowserCompat$SearchResultReceiver = builder;
        EBillSelectedFragment eBillSelectedFragment = this.MediaSessionCompat$Token;
        if (!(eBillSelectedFragment == null || builder == null)) {
            eBillSelectedFragment.IconCompatParcelizer = builder.MediaSessionCompat$Token;
            eBillSelectedFragment.eBillPaymentSelectedPresenter.read = eBillSelectedFragment.MediaBrowserCompat$CustomActionResultReceiver();
        }
        BillPaymentBillerSelectedFragment billPaymentBillerSelectedFragment = this.MediaMetadataCompat;
        if (billPaymentBillerSelectedFragment != null) {
            billPaymentBillerSelectedFragment.MediaBrowserCompat$CustomActionResultReceiver(builder);
        }
    }

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
        LogFileManager.C35981 r0 = getArguments() != null ? (LogFileManager.C35981) getArguments().getParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_HISTORY") : null;
        if (z && r0 != null && !TextUtils.isEmpty(r0.MediaBrowserCompat$ItemReceiver)) {
            this.IconCompatParcelizer.read(r0.MediaBrowserCompat$ItemReceiver);
        }
        BillPaymentBillerSelectedFragment billPaymentBillerSelectedFragment = this.MediaMetadataCompat;
        if (billPaymentBillerSelectedFragment != null) {
            billPaymentBillerSelectedFragment.mo13978c_(z);
        }
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution execution) {
        MediaBrowserCompat$CustomActionResultReceiver(execution);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        MediaBrowserCompat$CustomActionResultReceiver(execution);
    }

    public final void MediaMetadataCompat() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.billPaymentTabNestedScrollView.getScrollY(), 0});
        ofInt.setDuration(400);
        ofInt.addUpdateListener(new ActivityBuilder_ContributeSetupNewPinActivity(this));
        ofInt.start();
    }

    public final void read(int i) {
        this.billPaymentTabNestedScrollView.post(new ActivityBuilder_ContributeServiceAtBankingAgentCoachMarkActivity(this, i));
    }

    public final void read(ServerProjectProvider.C70695.RatingCompat ratingCompat) {
        this.MediaBrowserCompat$MediaItem = ratingCompat;
    }

    public final void write(ServerProjectProvider.C70695.RatingCompat ratingCompat) {
        this.RatingCompat = ratingCompat;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ServerProjectProvider.C70695.RatingCompat ratingCompat) {
        this.MediaDescriptionCompat = ratingCompat;
    }

    public final void IconCompatParcelizer() {
        super.aA_();
        this.MediaMetadataCompat = null;
        ZSYR2K[] zsyr2kArr = new ZSYR2K[1];
        zsyr2kArr[0] = new ZSYR2K("source", "gifting_input".equals(this.MediaSessionCompat$ResultReceiverWrapper) ? "input" : this.MediaSessionCompat$ResultReceiverWrapper);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("billpay_landing", zsyr2kArr);
        }
        read(new SecondaryTabsFragment(), R.id.fragment_container_bill_payment_tabs, "BILLER_PAYMENT_SECONDARY_TABS_TAG", true);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        StreetViewPanoramaFragment.zzb MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        super.aA_();
        CrashlyticsReport.FilesPayload.File.Builder builder2 = null;
        this.MediaMetadataCompat = null;
        AccountSourceSelectFragment accountSourceSelectFragment = this.IconCompatParcelizer;
        AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
        if (accountSourceAdapter != null) {
            builder2 = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem());
        }
        EBillSelectedFragment MediaBrowserCompat$CustomActionResultReceiver3 = EBillSelectedFragment.MediaBrowserCompat$CustomActionResultReceiver(builder, MediaBrowserCompat$CustomActionResultReceiver2, builder2, this.MediaSessionCompat$ResultReceiverWrapper);
        this.MediaSessionCompat$Token = MediaBrowserCompat$CustomActionResultReceiver3;
        read(MediaBrowserCompat$CustomActionResultReceiver3, R.id.fragment_container_bill_payment_tabs, "EBILL_SELECTED_FRAGMENT_TAG", true, true);
    }
}

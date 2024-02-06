package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.C3450xdd340b75;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundOnboardingSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IJsonExactionHelper;
import p040o.ZHER2K;
import p040o.getCustomAttributes;
import p040o.getFixedDetails;
import p040o.getKernelIDDstAtop;
import p040o.inject_cacheProvider$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelTopupLandingActivity extends BaseActivity implements inject_cacheProvider$MediaBrowserCompat$ItemReceiver {
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private HashMap MediaMetadataCompat;
    @HmlPinActivity
    public IJsonExactionHelper presenter;

    private View MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new HashMap();
        }
        View view = (View) this.MediaMetadataCompat.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaMetadataCompat.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public PrepaidTravelTopupLandingActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r8 = r8.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 2131493166(0x7f0c012e, float:1.8609804E38)
            r7.setContentView(r8)
            r8 = r7
            android.app.Activity r8 = (android.app.Activity) r8
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r8)
            r7.setStackedBackground()
            r8 = 2131761308(0x7f10189c, float:1.9153661E38)
            r7.setTitle(r8)
            r7.setTabContainer()
            android.content.Intent r8 = r7.getIntent()
            if (r8 == 0) goto L_0x0030
            android.os.Bundle r8 = r8.getExtras()
            if (r8 == 0) goto L_0x0030
            java.lang.String r0 = "KEY_PREPAID_TRAVEL_WALLET_SUMMARY"
            android.os.Parcelable r8 = r8.getParcelable(r0)
            o.getCustomAttributes r8 = (p040o.getCustomAttributes) r8
            goto L_0x0031
        L_0x0030:
            r8 = 0
        L_0x0031:
            if (r8 == 0) goto L_0x00b0
            java.util.List<o.AutoValue_CrashlyticsReport_Session_Event_Application> r0 = r8.read
            if (r0 == 0) goto L_0x00b0
            o.IJsonExactionHelper r0 = r7.presenter
            java.lang.String r1 = "presenter"
            if (r0 != 0) goto L_0x0040
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0040:
            r2 = r7
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r2 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r2
            r0.MediaBrowserCompat$ItemReceiver(r2)
            o.IJsonExactionHelper r0 = r7.presenter
            if (r0 != 0) goto L_0x004d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x004d:
            java.lang.String r1 = "walletSummaryDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r1)
            o.AutoValue_CrashlyticsReport_Session_Event r1 = r8.IconCompatParcelizer
            java.util.List<java.lang.String> r1 = r1.IconCompatParcelizer
            o.IJsonExactionHelper$read r2 = new o.IJsonExactionHelper$read
            r2.<init>(r0, r1)
            o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
            T r1 = r0.RatingCompat
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0065
            r1 = r4
            goto L_0x0066
        L_0x0065:
            r1 = r3
        L_0x0066:
            if (r1 == 0) goto L_0x006d
            T r1 = r0.RatingCompat
            r2.IconCompatParcelizer(r1)
        L_0x006d:
            java.util.List<o.AutoValue_CrashlyticsReport_Session_Event_Application> r1 = r8.read
            java.lang.String r2 = "walletList"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x009b
            java.lang.Object r5 = r1.next()
            r6 = r5
            o.AutoValue_CrashlyticsReport_Session_Event_Application r6 = (p040o.AutoValue_CrashlyticsReport_Session_Event_Application) r6
            int r6 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r6 == r4) goto L_0x0094
            r6 = r3
            goto L_0x0095
        L_0x0094:
            r6 = r4
        L_0x0095:
            if (r6 == 0) goto L_0x0081
            r2.add(r5)
            goto L_0x0081
        L_0x009b:
            java.util.List r2 = (java.util.List) r2
            o.IJsonExactionHelper$IconCompatParcelizer r1 = new o.IJsonExactionHelper$IconCompatParcelizer
            r1.<init>(r8, r2)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r8 = r0.RatingCompat
            if (r8 == 0) goto L_0x00a9
            r3 = r4
        L_0x00a9:
            if (r3 == 0) goto L_0x00b0
            T r8 = r0.RatingCompat
            r1.IconCompatParcelizer(r8)
        L_0x00b0:
            int r8 = p040o.ZHER2K.write.btPrepaidWalletTopup
            android.view.View r8 = r7.MediaBrowserCompat$ItemReceiver(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            com.scb.phone.view.activity.prepaid.PrepaidTravelTopupLandingActivity$write r0 = new com.scb.phone.view.activity.prepaid.PrepaidTravelTopupLandingActivity$write
            r0.<init>(r7)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r8.setOnClickListener(r0)
            o.HmlVerifyEmailActivity r8 = r7.MediaBrowserCompat$SearchResultReceiver
            java.lang.Object r8 = r8.MediaBrowserCompat$CustomActionResultReceiver()
            o.getKernelIDDstAtop r8 = (p040o.getKernelIDDstAtop) r8
            o.ZTBSV r8 = (p040o.ZTBSV) r8
            o.getKernelIDDst r0 = r7.scbAnalytics
            java.lang.String r1 = "planetscb_topup_landing_screen"
            r8.MediaBrowserCompat$ItemReceiver(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.prepaid.PrepaidTravelTopupLandingActivity.onCreate(android.os.Bundle):void");
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ PrepaidTravelTopupLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(PrepaidTravelTopupLandingActivity prepaidTravelTopupLandingActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = prepaidTravelTopupLandingActivity;
        }

        public final void onClick(View view) {
            PrepaidTravelTopupLandingActivity prepaidTravelTopupLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            PrepaidTravelTopupLandingActivity.write(prepaidTravelTopupLandingActivity).MediaBrowserCompat$ItemReceiver(prepaidTravelTopupLandingActivity.scbAnalytics, "planetscb_travelcard_topup");
            IJsonExactionHelper iJsonExactionHelper = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (iJsonExactionHelper == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3450xdd340b75.MediaBrowserCompat$CustomActionResultReceiver;
            if (iJsonExactionHelper.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(iJsonExactionHelper.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(getCustomAttributes getcustomattributes, List<AutoValue_CrashlyticsReport_Session_Event_Application> list) {
        onGetStartedClick.write((Object) getcustomattributes, "walletSummaryDisplay");
        onGetStartedClick.write((Object) list, "walletList");
        getFixedDetails getfixeddetails = new getFixedDetails(this);
        RecyclerView recyclerView = (RecyclerView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.rvPrepaidTopupTravelWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvPrepaidTopupTravelWallet");
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.rvPrepaidTopupTravelWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView2, "rvPrepaidTopupTravelWallet");
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = (RecyclerView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.rvPrepaidTopupTravelWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView3, "rvPrepaidTopupTravelWallet");
        recyclerView3.setAdapter(getfixeddetails);
        onGetStartedClick.write((Object) list, "walletTravelList");
        getfixeddetails.write = list;
        getfixeddetails.MediaBrowserCompat$ItemReceiver = list.size();
        getfixeddetails.IconCompatParcelizer.write();
        AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = getcustomattributes.IconCompatParcelizer;
        TextView textView = (TextView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.tvprepaidTravelThbEquivalentAmount);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvprepaidTravelThbEquivalentAmount");
        textView.setText(autoValue_CrashlyticsReport_Session_Event.MediaBrowserCompat$ItemReceiver);
        String str = list.isEmpty() ? "THB" : list.get(0).IconCompatParcelizer;
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = getString(R.string.prepaid_travel_topup_limit_available);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…el_topup_limit_available)");
        String format = String.format(string, Arrays.copyOf(new Object[]{autoValue_CrashlyticsReport_Session_Event.read, str}, 2));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        TextView textView2 = (TextView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.tvPrepaidWalletDetailRemainingConversionLimit);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvPrepaidWalletDetailRemainingConversionLimit");
        textView2.setText(format);
    }

    public final void write() {
        setResult(-1);
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = (Button) MediaBrowserCompat$ItemReceiver(ZHER2K.write.btPrepaidWalletTopup);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btPrepaidWalletTopup");
        button.setEnabled(z);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    public final void onDestroy() {
        IJsonExactionHelper iJsonExactionHelper = this.presenter;
        if (iJsonExactionHelper == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iJsonExactionHelper.onDestroy();
        super.onDestroy();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<getKernelIDDstAtop> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new getKernelIDDstAtop();
        }
    }

    public static final /* synthetic */ getKernelIDDstAtop write(PrepaidTravelTopupLandingActivity prepaidTravelTopupLandingActivity) {
        return (getKernelIDDstAtop) prepaidTravelTopupLandingActivity.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, getCustomAttributes getcustomattributes) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) getcustomattributes, "display");
        Intent putExtra = new Intent(context, PrepaidTravelTopupLandingActivity.class).putExtra("KEY_PREPAID_TRAVEL_WALLET_SUMMARY", getcustomattributes);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidT…_WALLET_SUMMARY, display)");
        return putExtra;
    }
}

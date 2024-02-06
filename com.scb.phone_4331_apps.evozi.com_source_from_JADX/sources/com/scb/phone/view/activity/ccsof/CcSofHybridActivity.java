package com.scb.phone.view.activity.ccsof;

import android.content.Intent;
import butterknife.BindView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import java.util.Arrays;
import java.util.List;
import p040o.HmlPinActivity;
import p040o.getIIdExtractionServerKta$MediaBrowserCompat$ItemReceiver;
import p040o.jsonFromMapEntryString;
import p040o.lambda$processSetComponents$1;
import p040o.onGetStartedClick;
import p040o.promptPayConfirmation;
import p040o.setTitleMarginStart;
import p040o.supertypeOf;

public final class CcSofHybridActivity extends BaseActivity implements getIIdExtractionServerKta$MediaBrowserCompat$ItemReceiver {
    public static final read MediaMetadataCompat = new read((byte) 0);
    private promptPayConfirmation MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public supertypeOf presenter;
    @BindView
    public FragmentWrapContentViewPager sourceOfFundViewPager;
    @BindView
    public TabLayout tabLayout;

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r2 == null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 2131492928(0x7f0c0040, float:1.8609322E38)
            r7.setContentView(r8)
            r8 = r7
            android.app.Activity r8 = (android.app.Activity) r8
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r8)
            r7.setStackedBackground()
            r8 = 2131755834(0x7f10033a, float:1.9142558E38)
            r7.setTitle(r8)
            r7.setTabContainer()
            com.scb.phone.view.custom.common.FragmentWrapContentViewPager r8 = r7.sourceOfFundViewPager
            if (r8 != 0) goto L_0x0024
            java.lang.String r0 = "sourceOfFundViewPager"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0024:
            r0 = 1
            r8.setDisableSwiping(r0)
            o.supertypeOf r8 = r7.presenter
            java.lang.String r1 = "presenter"
            if (r8 != 0) goto L_0x0031
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0031:
            r2 = r7
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r2 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r2
            r8.MediaBrowserCompat$ItemReceiver(r2)
            android.content.Intent r8 = r7.getIntent()
            r2 = 0
            if (r8 == 0) goto L_0x0047
            java.lang.String r3 = "EXTRA_PURCHASE_SOURCE_FUND_DISPLAY"
            android.os.Parcelable r8 = r8.getParcelableExtra(r3)
            o.lambda$processSetComponents$1 r8 = (p040o.lambda$processSetComponents$1) r8
            goto L_0x0048
        L_0x0047:
            r8 = r2
        L_0x0048:
            android.content.Intent r3 = r7.getIntent()
            if (r3 == 0) goto L_0x0055
            java.lang.String r4 = "EXTRA_CALLBACK_URL"
            java.lang.String r3 = r3.getStringExtra(r4)
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            android.content.Intent r4 = r7.getIntent()
            if (r4 == 0) goto L_0x006d
            r5 = -1
            java.lang.String r6 = "com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE"
            int r4 = r4.getIntExtra(r6, r5)
            if (r4 < 0) goto L_0x006b
            o.jsonFromMapEntryString[] r2 = p040o.jsonFromMapEntryString.values()
            r2 = r2[r4]
        L_0x006b:
            if (r2 != 0) goto L_0x006f
        L_0x006d:
            o.jsonFromMapEntryString r2 = p040o.jsonFromMapEntryString.NORMAL
        L_0x006f:
            if (r8 == 0) goto L_0x009a
            o.supertypeOf r4 = r7.presenter
            if (r4 != 0) goto L_0x0078
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0078:
            java.lang.String r1 = "purchaseSourceOfFundDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r1)
            java.lang.String r1 = "paymentFlowType"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r1)
            r4.MediaBrowserCompat$ItemReceiver = r8
            r4.read = r3
            o.supertypeOf$read r8 = new o.supertypeOf$read
            r8.<init>(r4, r2)
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r1 = r4.RatingCompat
            if (r1 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r0 = 0
        L_0x0093:
            if (r0 == 0) goto L_0x009a
            T r0 = r4.RatingCompat
            r8.IconCompatParcelizer(r0)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ccsof.CcSofHybridActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        supertypeOf supertypeof = this.presenter;
        if (supertypeof == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        supertypeof.onDestroy();
        super.onDestroy();
    }

    public final void write(lambda$processSetComponents$1 lambda_processsetcomponents_1, String str, int i, jsonFromMapEntryString jsonfrommapentrystring) {
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("EXTRA_BILL_PAYMENT_SUBTYPE") : null;
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        String[] strArr = {getString(R.string.auto_ccsof_tab_deposits), getString(R.string.auto_ccsof_tab_cards)};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        this.MediaBrowserCompat$SearchResultReceiver = new promptPayConfirmation(supportFragmentManager, asList, lambda_processsetcomponents_1, str, stringExtra, jsonfrommapentrystring);
        FragmentWrapContentViewPager fragmentWrapContentViewPager = this.sourceOfFundViewPager;
        if (fragmentWrapContentViewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sourceOfFundViewPager");
        }
        promptPayConfirmation promptpayconfirmation = this.MediaBrowserCompat$SearchResultReceiver;
        if (promptpayconfirmation == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tabAdapter");
        }
        fragmentWrapContentViewPager.setAdapter(promptpayconfirmation);
        fragmentWrapContentViewPager.setOffscreenPageLimit(2);
        FragmentWrapContentViewPager fragmentWrapContentViewPager2 = this.sourceOfFundViewPager;
        if (fragmentWrapContentViewPager2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sourceOfFundViewPager");
        }
        fragmentWrapContentViewPager2.setEnableDrawDynamicViewHeight(true);
        TabLayout tabLayout2 = this.tabLayout;
        if (tabLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tabLayout");
        }
        FragmentWrapContentViewPager fragmentWrapContentViewPager3 = this.sourceOfFundViewPager;
        if (fragmentWrapContentViewPager3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sourceOfFundViewPager");
        }
        tabLayout2.setupWithViewPager(fragmentWrapContentViewPager3);
        FragmentWrapContentViewPager fragmentWrapContentViewPager4 = this.sourceOfFundViewPager;
        if (fragmentWrapContentViewPager4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sourceOfFundViewPager");
        }
        fragmentWrapContentViewPager4.setCurrentItem(i);
    }
}

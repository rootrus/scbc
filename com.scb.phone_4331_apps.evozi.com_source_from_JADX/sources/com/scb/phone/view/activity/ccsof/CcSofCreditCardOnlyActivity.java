package com.scb.phone.view.activity.ccsof;

import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment;

public final class CcSofCreditCardOnlyActivity extends BaseActivity {
    public static final CcSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new CcSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private CcSofCreditCardOnlyFragment MediaBrowserCompat$MediaItem;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r0 == null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r6 = 2131492927(0x7f0c003f, float:1.860932E38)
            r5.setContentView(r6)
            r6 = r5
            android.app.Activity r6 = (android.app.Activity) r6
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r6)
            r5.setStackedBackground()
            r6 = 2131755834(0x7f10033a, float:1.9142558E38)
            r5.setTitle(r6)
            r5.setTabContainer()
            android.content.Intent r6 = r5.getIntent()
            r0 = 0
            if (r6 == 0) goto L_0x002b
            java.lang.String r1 = "EXTRA_PURCHASE_SOURCE_FUND_DISPLAY"
            android.os.Parcelable r6 = r6.getParcelableExtra(r1)
            o.lambda$processSetComponents$1 r6 = (p040o.lambda$processSetComponents$1) r6
            goto L_0x002c
        L_0x002b:
            r6 = r0
        L_0x002c:
            android.content.Intent r1 = r5.getIntent()
            if (r1 == 0) goto L_0x0039
            java.lang.String r2 = "EXTRA_CALLBACK_URL"
            java.lang.String r1 = r1.getStringExtra(r2)
            goto L_0x003a
        L_0x0039:
            r1 = r0
        L_0x003a:
            android.content.Intent r2 = r5.getIntent()
            if (r2 == 0) goto L_0x0059
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x0059
            r3 = -1
            java.lang.String r4 = "com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE"
            int r2 = r2.getInt(r4, r3)
            if (r2 < 0) goto L_0x0055
            o.jsonFromMapEntryString[] r0 = p040o.jsonFromMapEntryString.values()
            r0 = r0[r2]
        L_0x0055:
            o.jsonFromMapEntryString r0 = (p040o.jsonFromMapEntryString) r0
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            o.jsonFromMapEntryString r0 = p040o.jsonFromMapEntryString.NORMAL
        L_0x005b:
            if (r6 == 0) goto L_0x0089
            r2 = r5
            com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity r2 = (com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity) r2
            com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment r2 = r2.MediaBrowserCompat$MediaItem
            if (r2 != 0) goto L_0x006c
            com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment$write r2 = com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment.IconCompatParcelizer
            com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment r6 = com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment.write.IconCompatParcelizer(r6, r1, r0)
            r5.MediaBrowserCompat$MediaItem = r6
        L_0x006c:
            o.setTitleMarginStart r6 = r5.getSupportFragmentManager()
            o.CardView r6 = r6.read()
            com.scb.phone.view.fragment.ccsof.CcSofCreditCardOnlyFragment r0 = r5.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x007d
            java.lang.String r1 = "mCcSofCreditCardOnlyFragment"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x007d:
            r1 = 2131297116(0x7f09035c, float:1.8212168E38)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            o.CardView r6 = r6.MediaBrowserCompat$ItemReceiver(r1, r0)
            r6.write()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity.onCreate(android.os.Bundle):void");
    }
}

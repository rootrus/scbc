package com.scb.phone.view.activity.ccsof;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.C1337x357be685;
import p040o.C3080xc2f5febc;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;
import p040o.subtypeOf;
import p040o.writeUInt64NoTag;

public final class CcSofReviewActivity extends BaseActivity implements C1337x357be685 {
    public static final CcSofReviewActivity$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new CcSofReviewActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public subtypeOf ccSofReviewActivityPresenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77042131492929);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.billpayment_review_title);
        setTabContainer();
        subtypeOf subtypeof = this.ccSofReviewActivityPresenter;
        if (subtypeof == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ccSofReviewActivityPresenter");
        }
        subtypeof.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        C3080xc2f5febc.C30811 r3 = intent != null ? (C3080xc2f5febc.C30811) intent.getParcelableExtra("EXTRA_CCSOF_INPUT_DISPLAY") : null;
        if (r3 != null) {
            subtypeOf subtypeof2 = this.ccSofReviewActivityPresenter;
            if (subtypeof2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ccSofReviewActivityPresenter");
            }
            onGetStartedClick.write((Object) r3, "purchaseCcSInputDisplay");
            writeUInt64NoTag.IconCompatParcelizer read = new subtypeOf.read(r3);
            if (subtypeof2.RatingCompat != null) {
                read.IconCompatParcelizer(subtypeof2.RatingCompat);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(p040o.C3080xc2f5febc.C30811 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "purchaseCcSInputDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r2 = "com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE"
            if (r1 == 0) goto L_0x001e
            r3 = -1
            int r1 = r1.getIntExtra(r2, r3)
            if (r1 < 0) goto L_0x001b
            o.jsonFromMapEntryString[] r3 = p040o.jsonFromMapEntryString.values()
            r1 = r3[r1]
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r1 != 0) goto L_0x0020
        L_0x001e:
            o.jsonFromMapEntryString r1 = p040o.jsonFromMapEntryString.NORMAL
        L_0x0020:
            com.scb.phone.view.fragment.ccsof.CcSofReviewFragment$MediaBrowserCompat$ItemReceiver r3 = com.scb.phone.view.fragment.ccsof.CcSofReviewFragment.MediaBrowserCompat$CustomActionResultReceiver
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r0 = "paymentFlowType"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r0)
            com.scb.phone.view.fragment.ccsof.CcSofReviewFragment r0 = new com.scb.phone.view.fragment.ccsof.CcSofReviewFragment
            r0.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            java.lang.String r4 = "EXTRA_CCSOF_INPUT_DISPLAY"
            r3.putParcelable(r4, r6)
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r6 = r1.ordinal()
            r3.putInt(r2, r6)
            r0.setArguments(r3)
            o.setTitleMarginStart r6 = r5.getSupportFragmentManager()
            o.CardView r6 = r6.read()
            r1 = 2131297116(0x7f09035c, float:1.8212168E38)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            o.CardView r6 = r6.MediaBrowserCompat$ItemReceiver(r1, r0)
            r6.write()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.ccsof.CcSofReviewActivity.write(o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$1):void");
    }
}

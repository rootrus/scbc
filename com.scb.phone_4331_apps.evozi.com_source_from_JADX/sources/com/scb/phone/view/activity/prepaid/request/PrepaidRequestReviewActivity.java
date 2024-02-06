package com.scb.phone.view.activity.prepaid.request;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.location.places.Place;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewCommonActivity;
import com.scb.phone.view.activity.prepaid.PrepaidOtpActivity;
import com.scb.phone.view.activity.prepaid.PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.ForwardingService;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IExtractionServer;
import p040o.IExtractionServer$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnDeviceIdExtractor;
import p040o.getKernelIDDstAtop;
import p040o.getLog;
import p040o.getTimestamp;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidRequestReviewActivity extends ReviewCommonActivity implements OnDeviceIdExtractor.C6966a.C69682.write {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    private getTimestamp MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private getLog MediaMetadataCompat;
    @HmlPinActivity
    public IExtractionServer presenter;

    public PrepaidRequestReviewActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = PrepaidRequestReviewActivity$MediaBrowserCompat$ItemReceiver.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRAS_PREPAID_REQUEST_VERIFICATION_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…EST_VERIFICATION_DISPLAY)");
        this.MediaBrowserCompat$MediaItem = (getTimestamp) parcelableExtra;
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra("EXTRAS_PREPAID_REQUEST_LANDING_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra2, "intent.getParcelableExtr…LANDING_DISPLAY\n        )");
        this.MediaMetadataCompat = (getLog) parcelableExtra2;
        IExtractionServer iExtractionServer = this.presenter;
        if (iExtractionServer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iExtractionServer.MediaBrowserCompat$ItemReceiver(this);
        IExtractionServer iExtractionServer2 = this.presenter;
        if (iExtractionServer2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getTimestamp gettimestamp = this.MediaBrowserCompat$MediaItem;
        if (gettimestamp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidRequestVerificationDisplay");
        }
        getLog getlog = this.MediaMetadataCompat;
        if (getlog == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidRequestLandingDisplay");
        }
        onGetStartedClick.write((Object) gettimestamp, "prepaidRequestVerificationDisplay");
        onGetStartedClick.write((Object) getlog, "prepaidRequestLandingDisplay");
        boolean z = true;
        writeUInt64NoTag.IconCompatParcelizer write = new IExtractionServer.write(iExtractionServer2.read.MediaBrowserCompat$CustomActionResultReceiver(gettimestamp, getlog, iExtractionServer2.MediaBrowserCompat$ItemReceiver.setItemInvoker(), true));
        if (iExtractionServer2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write.IconCompatParcelizer(iExtractionServer2.RatingCompat);
        }
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_request_review_screen");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13826x50fd9e4a() {
        String string = getString(R.string.prepaid_request_review_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepaid_request_review_title)");
        return string;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        IExtractionServer iExtractionServer = this.presenter;
        if (iExtractionServer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getTimestamp gettimestamp = this.MediaBrowserCompat$MediaItem;
        if (gettimestamp == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidRequestVerificationDisplay");
        }
        getTimestamp gettimestamp2 = this.MediaBrowserCompat$MediaItem;
        if (gettimestamp2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidRequestVerificationDisplay");
        }
        getLog getlog = this.MediaMetadataCompat;
        if (getlog == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidRequestLandingDisplay");
        }
        onGetStartedClick.write((Object) gettimestamp, "verificationDisplay");
        onGetStartedClick.write((Object) gettimestamp2, "prepaidRequestVerificationDisplay");
        onGetStartedClick.write((Object) getlog, "prepaidRequestLandingDisplay");
        boolean z = false;
        writeUInt64NoTag.IconCompatParcelizer iExtractionServer$MediaBrowserCompat$ItemReceiver = new IExtractionServer$MediaBrowserCompat$ItemReceiver(gettimestamp, iExtractionServer.read.MediaBrowserCompat$CustomActionResultReceiver(gettimestamp2, getlog, true, false));
        if (iExtractionServer.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iExtractionServer$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(iExtractionServer.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        PrepaidRequestSuccessActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidRequestSuccessActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        Intent intent = new Intent(context, PrepaidRequestSuccessActivity.class);
        intent.putExtra("com.scb.phone.view.activity.prepaid.request.PrepaidRequestSuccessActivity.KEY_SUCCESS", standardstartandwait);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C5698xe7b26873 prepaidRequestLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = PrepaidRequestLandingActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PrepaidRequestLandingActivity.class);
        intent.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r4 = r6.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            r0 = 1010(0x3f2, float:1.415E-42)
            if (r4 != r0) goto L_0x005f
            r4 = -1
            r0 = 1
            r1 = 0
            java.lang.String r2 = "presenter"
            if (r5 != r4) goto L_0x0045
            if (r6 == 0) goto L_0x0013
            r6.getExtras()
        L_0x0013:
            com.scb.phone.view.activity.prepaid.PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver r4 = com.scb.phone.view.activity.prepaid.PrepaidOtpActivity.MediaBrowserCompat$MediaItem
            if (r6 == 0) goto L_0x0026
            android.os.Bundle r4 = r6.getExtras()
            if (r4 == 0) goto L_0x0026
            java.lang.String r5 = "EXTRA_PREPAID_SUCCESS"
            android.os.Parcelable r4 = r4.getParcelable(r5)
            o.standardStartAndWait r4 = (p040o.standardStartAndWait) r4
            goto L_0x0027
        L_0x0026:
            r4 = 0
        L_0x0027:
            o.IExtractionServer r5 = r3.presenter
            if (r5 != 0) goto L_0x002e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x002e:
            if (r4 == 0) goto L_0x0044
            o.IExtractionServer$MediaBrowserCompat$CustomActionResultReceiver r6 = new o.IExtractionServer$MediaBrowserCompat$CustomActionResultReceiver
            r6.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r6 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r6
            T r4 = r5.RatingCompat
            if (r4 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            if (r0 == 0) goto L_0x0044
            T r4 = r5.RatingCompat
            r6.IconCompatParcelizer(r4)
        L_0x0044:
            return
        L_0x0045:
            if (r5 != 0) goto L_0x005f
            o.IExtractionServer r4 = r3.presenter
            if (r4 != 0) goto L_0x004e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x004e:
            o.IExtractionServer$read r5 = p040o.IExtractionServer.read.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r6 = r4.RatingCompat
            if (r6 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = r1
        L_0x0058:
            if (r0 == 0) goto L_0x005f
            T r4 = r4.RatingCompat
            r5.IconCompatParcelizer(r4)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.prepaid.request.PrepaidRequestReviewActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onDestroy() {
        IExtractionServer iExtractionServer = this.presenter;
        if (iExtractionServer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iExtractionServer.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str, ForwardingService forwardingService) {
        onGetStartedClick.write((Object) str, "transactionToken");
        onGetStartedClick.write((Object) forwardingService, "reviewDisplay");
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_request_prepaid_review");
        PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver prepaidOtpActivity$MediaBrowserCompat$ItemReceiver = PrepaidOtpActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "transactionToken");
        onGetStartedClick.write((Object) forwardingService, "reviewDisplay");
        Intent putExtra = new Intent(context, PrepaidOtpActivity.class).putExtra("EXTRA_PREPAID_TRANSACTION_TOKEN", str).putExtra("EXTRA_PREPAID_REVIEW", forwardingService);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidO…ID_REVIEW, reviewDisplay)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, Place.TYPE_NATURAL_FEATURE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

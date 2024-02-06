package com.scb.phone.view.activity.partner.nsip;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.ReviewCommonActivity;
import com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentOtpActivity;
import com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4334eD;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HashMultimap;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.eD$MediaBrowserCompat$ItemReceiver;
import p040o.forEachSrcOver;
import p040o.onGetStartedClick;
import p040o.readVersion;
import p040o.setStartedAt;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class NsipPartnerPaymentReviewActivity extends ReviewCommonActivity implements readVersion.read {
    public static final C5685xaae390fe MediaDescriptionCompat = new C5685xaae390fe((byte) 0);
    private setStartedAt MediaBrowserCompat$SearchResultReceiver;
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @HmlPinActivity
    public C4334eD presenter;

    public NsipPartnerPaymentReviewActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_NSIP_VERIFICATION");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(EXTRA_NSIP_VERIFICATION)");
        this.MediaBrowserCompat$SearchResultReceiver = (setStartedAt) parcelableExtra;
        C4334eD eDVar = this.presenter;
        if (eDVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eDVar.MediaBrowserCompat$ItemReceiver(this);
        C4334eD eDVar2 = this.presenter;
        if (eDVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setStartedAt setstartedat = this.MediaBrowserCompat$SearchResultReceiver;
        if (setstartedat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verificationDisplay");
        }
        onGetStartedClick.write((Object) setstartedat, "verificationDisplay");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C4334eD.IconCompatParcelizer(eDVar2, setstartedat);
        if (eDVar2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(eDVar2.RatingCompat);
        }
        ((forEachSrcOver) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).read(forEachSrcOver.read.write);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            str = extras.getString("NSIP_TRACKER_FROM", forEachSrcOver.read.IconCompatParcelizer);
        } else {
            str = null;
        }
        ((forEachSrcOver) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).read(str);
        ((forEachSrcOver) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcOver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13826x50fd9e4a() {
        String string = getString(R.string.review);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.review)");
        return string;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        C4334eD eDVar = this.presenter;
        if (eDVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setStartedAt setstartedat = this.MediaBrowserCompat$SearchResultReceiver;
        if (setstartedat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verificationDisplay");
        }
        onGetStartedClick.write((Object) setstartedat, "nsipPartnerReviewDisplay");
        if (eDVar.RatingCompat != null) {
            eDVar.RatingCompat.AlertController$RecycleListView();
        }
        eDVar.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new C4334eD.write(eDVar, setstartedat), new eD$MediaBrowserCompat$ItemReceiver(eDVar, setstartedat), new HashMultimap(setstartedat.PlaybackStateCompat$CustomAction), (String) null, (String) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        NsipPartnerPaymentSuccessActivity.read read = NsipPartnerPaymentSuccessActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        Intent putExtra = new Intent(context, NsipPartnerPaymentSuccessActivity.class).putExtra("EXTRA_NSIP_SUCCESS", standardstartandwait);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, NsipPart…CCESS, successfulDisplay)");
        putExtra.putExtras(getIntent());
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver(setStartedAt setstartedat) {
        onGetStartedClick.write((Object) setstartedat, "nsipPartnerReviewDisplay");
        NsipPartnerPaymentOtpActivity.write write = NsipPartnerPaymentOtpActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) setstartedat, "nsipPaymentReviewDisplay");
        Intent intent = new Intent(context, NsipPartnerPaymentOtpActivity.class);
        intent.putExtra("EXTRA_NSIP_VERIFICATION", setstartedat);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 1892);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = r4.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
        /*
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            r0 = 1892(0x764, float:2.651E-42)
            if (r2 != r0) goto L_0x0049
            r2 = -1
            if (r3 != r2) goto L_0x0044
            com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentOtpActivity$write r2 = com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentOtpActivity.MediaBrowserCompat$MediaItem
            if (r4 == 0) goto L_0x001d
            android.os.Bundle r2 = r4.getExtras()
            if (r2 == 0) goto L_0x001d
            java.lang.String r3 = "EXTRA_NSIP_SUCCESS"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            o.standardStartAndWait r2 = (p040o.standardStartAndWait) r2
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 == 0) goto L_0x0049
            o.eD r3 = r1.presenter
            if (r3 != 0) goto L_0x0029
            java.lang.String r4 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0029:
            java.lang.String r4 = "successfulDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r4)
            o.eD$MediaBrowserCompat$CustomActionResultReceiver r4 = new o.eD$MediaBrowserCompat$CustomActionResultReceiver
            r4.<init>(r2)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r2 = r3.RatingCompat
            if (r2 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0043
            T r2 = r3.RatingCompat
            r4.IconCompatParcelizer(r2)
        L_0x0043:
            return
        L_0x0044:
            if (r3 != 0) goto L_0x0049
            r1.finish()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentReviewActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void IconCompatParcelizer() {
        onBackPressed();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer2).read();
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
    }

    public final void onDestroy() {
        super.onDestroy();
        C4334eD eDVar = this.presenter;
        if (eDVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eDVar.onDestroy();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachSrcOver> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachSrcOver();
        }
    }
}

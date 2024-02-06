package com.scb.phone.view.activity.transferandpay.billpayment;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C7474ss;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.StreetViewPanoramaFragment;
import p040o.setTapText;

public class BillPaymentActivity extends BaseActivity implements ServerProjectProvider.C70695.write {
    private String MediaDescriptionCompat;
    @HmlPinActivity
    public C7474ss billPaymentParentPresenter;

    public static void read(Context context, CrashlyticsReport.Session.Event.Application.Execution execution, LogFileManager.C35981 r4, String str) {
        Intent intent = new Intent(context, BillPaymentActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_HISTORY", r4);
        intent.putExtra("EXTRA_BILL_PAYMENT_IS_PREDICTIVE", "predictive".equals(str));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, StreetViewPanoramaFragment.zzb zzb, CrashlyticsReport.Session.Event.Application.Execution execution, String str, boolean z) {
        Intent intent = new Intent(context, BillPaymentActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE", z);
        if (zzb != null) {
            intent.putExtra("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Intent write(Context context, String str) {
        Intent intent = new Intent(context, BillPaymentActivity.class);
        intent.putExtra("source", str);
        return intent;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [o.sw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.app.Activity) r5)
            super.onCreate(r6)
            r6 = 2131492903(0x7f0c0027, float:1.8609271E38)
            r5.setContentView(r6)
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r5)
            java.lang.String r6 = "source"
            java.lang.String r0 = ""
            java.lang.String r6 = r5.read(r6, r0)
            r5.MediaDescriptionCompat = r6
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY"
            android.os.Parcelable r6 = r6.getParcelableExtra(r0)
            r1 = 1
            if (r6 == 0) goto L_0x0065
            o.StreetViewPanoramaFragment$zzb r6 = p040o.StreetViewPanoramaFragment.zzb.PROFILE
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r3 = "com.scb.phone.EXTRA_BILL_PAY_METHOD"
            boolean r2 = r2.hasExtra(r3)
            if (r2 == 0) goto L_0x003e
            android.content.Intent r6 = r5.getIntent()
            java.io.Serializable r6 = r6.getSerializableExtra(r3)
            o.StreetViewPanoramaFragment$zzb r6 = (p040o.StreetViewPanoramaFragment.zzb) r6
        L_0x003e:
            android.content.Intent r2 = r5.getIntent()
            java.lang.String r3 = "com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE"
            boolean r2 = r2.getBooleanExtra(r3, r1)
            android.content.Intent r3 = r5.getIntent()
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            o.CrashlyticsReport$Session$Event$Application$Execution r0 = (p040o.CrashlyticsReport.Session.Event.Application.Execution) r0
            android.content.Intent r3 = r5.getIntent()
            java.lang.String r4 = "com.scb.phone.EXTRA_BILL_PAYMENT_HISTORY"
            android.os.Parcelable r3 = r3.getParcelableExtra(r4)
            o.LogFileManager$1 r3 = (p040o.LogFileManager.C35981) r3
            java.lang.String r4 = r5.MediaDescriptionCompat
            com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment r6 = com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment.IconCompatParcelizer(r6, r0, r3, r4, r2)
            goto L_0x006d
        L_0x0065:
            o.StreetViewPanoramaFragment$zzb r6 = p040o.StreetViewPanoramaFragment.zzb.PROFILE
            java.lang.String r0 = r5.MediaDescriptionCompat
            com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment r6 = com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment.write(r6, r0)
        L_0x006d:
            o.setTitleMarginStart r0 = r5.getSupportFragmentManager()
            o.CardView r0 = r0.read()
            r2 = 2131297822(0x7f09061e, float:1.82136E38)
            o.CardView r6 = r0.MediaBrowserCompat$CustomActionResultReceiver(r2, r6)
            r6.write()
            super.setStackedBackground()
            r6 = 2131756304(0x7f100510, float:1.9143512E38)
            r5.setTitle(r6)
            r5.setTabContainer()
            o.ss r6 = r5.billPaymentParentPresenter
            r6.MediaBrowserCompat$ItemReceiver(r5)
            o.ss r6 = r5.billPaymentParentPresenter
            o.sz r0 = r6.MediaBrowserCompat$ItemReceiver
            java.util.List r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x00ba
            o.ss$read r0 = p040o.C7474ss.read.write
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x00ab
            o.sw r2 = new o.sw
            r2.<init>(r0)
            r0 = r2
        L_0x00ab:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r6.RatingCompat
            if (r2 == 0) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            if (r1 == 0) goto L_0x00ba
            T r6 = r6.RatingCompat
            r0.IconCompatParcelizer(r6)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity.onCreate(android.os.Bundle):void");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.bill_payment_tab);
        setTabContainer();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$ItemReceiver = BillPaymentSearchCoachMarkActivity.MediaBrowserCompat$ItemReceiver(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public static void read(Context context, String str) {
        Intent intent = new Intent(context, BillPaymentActivity.class);
        intent.putExtra("source", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

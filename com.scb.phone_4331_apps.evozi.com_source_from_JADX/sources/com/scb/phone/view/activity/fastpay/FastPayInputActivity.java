package com.scb.phone.view.activity.fastpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.fragment.fastpay.FastPayInputFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.StreetViewPanoramaFragment;
import p040o.setTapText;

public class FastPayInputActivity extends BaseActivity implements FastPayInputFragment.write {
    private CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder MediaBrowserCompat$MediaItem;

    public static void IconCompatParcelizer(Context context, CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder, boolean z) {
        Intent intent = new Intent(context, FastPayInputActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_FASTPAY_DISPLAY", builder);
        intent.putExtra("com.scb.phone.EXTRA_FASTPAY_FROM_SCAN_DEEP_LINK", z);
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

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77882131493013);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(MediaSessionCompat$QueueItem());
        CardView read = getSupportFragmentManager().read();
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = this.MediaBrowserCompat$MediaItem;
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("com.scb.phone.EXTRA_FASTPAY_FROM_SCAN_DEEP_LINK", false)) {
            z = true;
        }
        read.MediaBrowserCompat$ItemReceiver(R.id.container, FastPayInputFragment.IconCompatParcelizer(builder, z)).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(MediaSessionCompat$QueueItem());
    }

    private String MediaSessionCompat$QueueItem() {
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = getIntent() != null ? (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) getIntent().getParcelableExtra("com.scb.phone.EXTRA_FASTPAY_DISPLAY") : null;
        this.MediaBrowserCompat$MediaItem = builder;
        if (builder == null) {
            return "";
        }
        String str = builder.MediaBrowserCompat$SearchResultReceiver;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 2066624938) {
            if (hashCode == 2066625372 && str.equals("FASTPP")) {
                c = 1;
            }
        } else if (str.equals("FASTBP")) {
            c = 0;
        }
        if (c == 0) {
            return getString(R.string.fastpay_billpayment_title);
        }
        if (c != 1) {
            return "";
        }
        return getString(R.string.fastpay_transfer_title);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution, StreetViewPanoramaFragment.zzb zzb, String str, LogFileManager.C35981 r6) {
        Intent intent = new Intent(this, BillPaymentActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_HISTORY", r6);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_ENABLE_SCHEDULE", false);
        if (zzb != null) {
            intent.putExtra("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        }
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }

    public final void read(StreetViewPanoramaFragment.zzb zzb, String str) {
        Intent intent = new Intent(this, FavouriteSelectedActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAY_METHOD", zzb);
        intent.putExtra("source", str);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (setGroupDividerEnabled() && !mo13022E_()) {
            finish();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            finish();
        }
    }
}

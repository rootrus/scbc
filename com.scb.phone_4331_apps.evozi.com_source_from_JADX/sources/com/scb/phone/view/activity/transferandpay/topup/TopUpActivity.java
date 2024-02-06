package com.scb.phone.view.activity.transferandpay.topup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.fragment.transferandpay.TopUpTabFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C1347xfa428d71;
import p040o.CrashlyticsReport;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getIBillDeserializerRtti;
import p040o.getIBillDeserializerRtti$MediaBrowserCompat$ItemReceiver;
import p040o.parseEventSignal;
import p040o.setBadgeCount;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class TopUpActivity extends BaseActivity implements C1347xfa428d71 {
    public boolean MediaBrowserCompat$SearchResultReceiver = false;
    @BindView
    public ImageView historyCoachmark;
    @HmlPinActivity
    public getIBillDeserializerRtti topUpActivityPresenter;

    public static Intent write(Context context, String str) {
        Intent intent = new Intent(context, TopUpActivity.class);
        intent.putExtra("source", str);
        return intent;
    }

    public static void read(Context context, parseEventSignal parseeventsignal, LogFileManager.C35981 r3, String str, String str2, CrashlyticsReport.FilesPayload.File file, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        Intent MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, parseeventsignal, r3, str, true);
        MediaBrowserCompat$ItemReceiver.putExtra("EXTRA_ACCOUNT_SOURCE_DISPLAY", file);
        MediaBrowserCompat$ItemReceiver.putExtra("subtype", str2);
        MediaBrowserCompat$ItemReceiver.putExtra("EXTRA_ERROR_TYPE", errorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
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

    private static Intent MediaBrowserCompat$ItemReceiver(Context context, parseEventSignal parseeventsignal, LogFileManager.C35981 r4, String str, boolean z) {
        Intent intent = new Intent(context, TopUpActivity.class);
        intent.putExtra("com.scb.phone.TOP_SHORTCUT", parseeventsignal);
        intent.putExtra("com.scb.phone.TOP_HISTORY", r4);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_TOPUP_FROM_DETAIL_PAGE", z);
        intent.putExtra("EXTRA_BILL_PAYMENT_IS_PREDICTIVE", "predictive".equals(str));
        return intent;
    }

    public void onCreate(Bundle bundle) {
        TopUpTabFragment topUpTabFragment;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f80102131493235);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.top_up_tab);
        setTabContainer();
        boolean z = false;
        this.MediaBrowserCompat$SearchResultReceiver = getIntent().getBooleanExtra("com.scb.phone.EXTRA_TOPUP_FROM_DETAIL_PAGE", false);
        if (getIntent().getParcelableExtra("com.scb.phone.TOP_SHORTCUT") != null) {
            topUpTabFragment = TopUpTabFragment.write((parseEventSignal) getIntent().getParcelableExtra("com.scb.phone.TOP_SHORTCUT"), (LogFileManager.C35981) getIntent().getParcelableExtra("com.scb.phone.TOP_HISTORY"), getIntent().getStringExtra("source"), getIntent().getStringExtra("subtype"), (CrashlyticsReport.FilesPayload.File) getIntent().getParcelableExtra("EXTRA_ACCOUNT_SOURCE_DISPLAY"), (ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) getIntent().getSerializableExtra("EXTRA_ERROR_TYPE"));
        } else {
            topUpTabFragment = new TopUpTabFragment();
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.top_up_frame, topUpTabFragment).write();
        this.topUpActivityPresenter.MediaBrowserCompat$ItemReceiver(this);
        getIBillDeserializerRtti getibilldeserializerrtti = this.topUpActivityPresenter;
        if (!getibilldeserializerrtti.write.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo()) {
            getibilldeserializerrtti.write.MediaBrowserCompat$ItemReceiver.setItemInvoker();
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getIBillDeserializerRtti$MediaBrowserCompat$ItemReceiver.read;
            if (getibilldeserializerrtti.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getibilldeserializerrtti.RatingCompat);
            }
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.top_up_tab);
        setTabContainer();
    }

    public final void IconCompatParcelizer() {
        this.historyCoachmark.setVisibility(0);
        getWindow().addFlags(1024);
        this.historyCoachmark.setOnTouchListener(new setBadgeCount(this));
    }

    public static void write(Context context, parseEventSignal parseeventsignal, LogFileManager.C35981 r3, String str) {
        Intent MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, parseeventsignal, r3, str, false);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
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

    public static void MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, TopUpActivity.class);
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

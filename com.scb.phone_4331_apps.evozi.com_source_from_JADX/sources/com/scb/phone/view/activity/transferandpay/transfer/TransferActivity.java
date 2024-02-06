package com.scb.phone.view.activity.transferandpay.transfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.BottomBarTab;
import p040o.C1347xfa428d71;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getRawData;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class TransferActivity extends BaseActivity implements C1347xfa428d71 {
    @BindView
    public ImageView historyCoachmark;
    @HmlPinActivity
    public getRawData transferActivityPresenter;

    private static final /* synthetic */ void IconCompatParcelizer(Context context, Intent intent) {
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
        setContentView(R.layout.f80172131493242);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.transfer_tab);
        setTabContainer();
        this.transferActivityPresenter.MediaBrowserCompat$ItemReceiver(this);
        getRawData getrawdata = this.transferActivityPresenter;
        if (!getrawdata.read.MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView()) {
            getrawdata.read.MediaBrowserCompat$ItemReceiver.setIcon();
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getRawData.read.read;
            if (getrawdata.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getrawdata.RatingCompat);
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && intent.hasExtra("com.scb.phone.EXTRA_CONTINUE_TO_TRANSFER") && intent.getBooleanExtra("com.scb.phone.EXTRA_CONTINUE_TO_TRANSFER", false)) {
            Intent intent2 = new Intent(this, TransferActivity.class);
            intent2.putExtra("source", "");
            intent2.putExtra("com.scb.phone.EXTRA_TRANSFER_DEFAULT_ACCOUNT_NUMBER", intent.getStringExtra("com.scb.phone.EXTRA_ACCOUNT_NUMBER"));
            intent2.putExtra("com.scb.phone.view.activity.transferandpay.transfer.TransferActivity.EXTRA_IS_NAVIGATE_BACK_SUCCESS_PAGE", true);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent2).read();
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
    }

    public void onBackPressed() {
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("com.scb.phone.view.activity.transferandpay.transfer.TransferActivity.EXTRA_IS_NAVIGATE_BACK_SUCCESS_PAGE", false)) {
            super.onBackPressed();
            return;
        }
        Intent intent2 = new Intent(this, HomeActivity.class);
        intent2.addFlags(603979776);
        intent2.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent2.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent2).read();
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

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.transfer_tab);
        setTabContainer();
    }

    public final void IconCompatParcelizer() {
        this.historyCoachmark.setVisibility(0);
        getWindow().addFlags(1024);
        this.historyCoachmark.setOnTouchListener(new BottomBarTab(this));
    }

    public static Intent IconCompatParcelizer(Context context, String str) {
        Intent intent = new Intent(context, TransferActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_DEFAULT_ACCOUNT_NUMBER", (String) null);
        return intent;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        Intent intent = new Intent(context, TransferActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_DEFAULT_ACCOUNT_NUMBER", (String) null);
        IntentTidInjectionContextAspect.aspectOf();
        IconCompatParcelizer(context, intent);
    }

    public static void write(Context context, String str, String str2) {
        Intent intent = new Intent(context, TransferActivity.class);
        intent.putExtra("source", str);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_DEFAULT_ACCOUNT_NUMBER", str2);
        IntentTidInjectionContextAspect.aspectOf();
        IconCompatParcelizer(context, intent);
    }
}

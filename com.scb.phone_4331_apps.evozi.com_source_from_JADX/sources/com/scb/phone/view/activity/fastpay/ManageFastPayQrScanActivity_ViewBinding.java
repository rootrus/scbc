package com.scb.phone.view.activity.fastpay;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ManageFastPayQrScanActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ManageFastPayQrScanActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public ManageFastPayQrScanActivity_ViewBinding(final ManageFastPayQrScanActivity manageFastPayQrScanActivity, View view) {
        super(manageFastPayQrScanActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = manageFastPayQrScanActivity;
        manageFastPayQrScanActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        manageFastPayQrScanActivity.layoutFastPaySetup = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_fast_pay_setup, "field 'layoutFastPaySetup'", LinearLayout.class);
        manageFastPayQrScanActivity.textFastPaySettingTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_fast_pay_setting_title, "field 'textFastPaySettingTitle'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.layout_fast_pay_setup_fastpay_detail, "field 'layoutFastPaySetupFastPayDetail' and method 'onClickDetailLayout'");
        manageFastPayQrScanActivity.layoutFastPaySetupFastPayDetail = (RelativeLayout) onStart.write(IconCompatParcelizer, R.id.layout_fast_pay_setup_fastpay_detail, "field 'layoutFastPaySetupFastPayDetail'", RelativeLayout.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageFastPayQrScanActivity.this.onClickDetailLayout(view);
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.layout_fast_pay_setup_fastpay_init_state, "field 'layoutFastPaySetupFastPayInitState' and method 'onClickInitStateLayout'");
        manageFastPayQrScanActivity.layoutFastPaySetupFastPayInitState = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.layout_fast_pay_setup_fastpay_init_state, "field 'layoutFastPaySetupFastPayInitState'", RelativeLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ManageFastPayQrScanActivity.this.onClickInitStateLayout(view);
            }
        });
        manageFastPayQrScanActivity.textFastPayAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_fast_pay_account_name, "field 'textFastPayAccountName'", TextView.class);
        manageFastPayQrScanActivity.textFastPayLimitAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_fast_pay_maximum_limit_per_day_amount, "field 'textFastPayLimitAmount'", TextView.class);
    }

    public final void read() {
        ManageFastPayQrScanActivity manageFastPayQrScanActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageFastPayQrScanActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageFastPayQrScanActivity.recyclerView = null;
            manageFastPayQrScanActivity.layoutFastPaySetup = null;
            manageFastPayQrScanActivity.textFastPaySettingTitle = null;
            manageFastPayQrScanActivity.layoutFastPaySetupFastPayDetail = null;
            manageFastPayQrScanActivity.layoutFastPaySetupFastPayInitState = null;
            manageFastPayQrScanActivity.textFastPayAccountName = null;
            manageFastPayQrScanActivity.textFastPayLimitAmount = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.activity.transferandpay.billpayment;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.RtpEBillPaymentDetailFragment;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsReport;

public class RtpEBillPaymentDetailActivity extends BaseActivity {
    private RtpEBillPaymentDetailFragment MediaBrowserCompat$SearchResultReceiver;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76782131492903);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getParcelableExtra("com.scb.phone.EXTRA_EBILL_PAYMENT_DISPLAY") != null) {
            this.MediaBrowserCompat$SearchResultReceiver = RtpEBillPaymentDetailFragment.IconCompatParcelizer((CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder) getIntent().getParcelableExtra("com.scb.phone.EXTRA_EBILL_PAYMENT_DISPLAY"));
        } else {
            finish();
        }
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_container, this.MediaBrowserCompat$SearchResultReceiver).write();
        super.setStackedBackground();
        setTitle(R.string.bill_payment_tab);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.bill_payment_tab);
        setTabContainer();
    }
}

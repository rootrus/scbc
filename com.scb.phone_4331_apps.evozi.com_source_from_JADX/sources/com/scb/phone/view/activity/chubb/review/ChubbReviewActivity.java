package com.scb.phone.view.activity.chubb.review;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chubb.review.ChubbReviewFragment;
import p040o.CrashlyticsReport;
import p040o.ZSYR2K;
import p040o.jsonFromMapEntryString;

public class ChubbReviewActivity extends BaseActivity {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder, String str, jsonFromMapEntryString jsonfrommapentrystring) {
        return new Intent(context, ChubbReviewActivity.class).putExtra("KEY_GET_BILL_PAYMENT_PARTNER_DATA", builder).putExtra("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE", str).putExtra("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring);
    }

    public void onCreate(Bundle bundle) {
        jsonFromMapEntryString jsonfrommapentrystring;
        super.onCreate(bundle);
        setContentView(R.layout.f79672131493192);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE");
        if (stringExtra == null) {
            stringExtra = "chubb_travel_tile";
        }
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.chubb_review_title);
        this.scbAnalytics.write("billpay_review", new ZSYR2K("source", "partner_api"), new ZSYR2K("subtype", stringExtra));
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder = (CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder) getIntent().getExtras().getParcelable("KEY_GET_BILL_PAYMENT_PARTNER_DATA");
        if (builder != null) {
            if (getIntent() == null || getIntent().getExtras() == null || getIntent().getExtras().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE") == null) {
                jsonfrommapentrystring = jsonFromMapEntryString.NORMAL;
            } else {
                jsonfrommapentrystring = (jsonFromMapEntryString) getIntent().getExtras().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE");
            }
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, ChubbReviewFragment.write(builder, jsonfrommapentrystring)).write();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.chubb_review_title);
    }
}

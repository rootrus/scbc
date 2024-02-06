package com.scb.phone.view.activity.partner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.jsonFromMapEntryString;

public class PartnerBillPaymentInputActivity extends BaseActivity {
    public static Intent read(Context context, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, String str, String str2) {
        return new Intent(context, PartnerBillPaymentInputActivity.class).putExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_DISPLAY", exception).putExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_CALLBACK", str).putExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE", str2);
    }

    public static Intent write(Context context, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, String str, jsonFromMapEntryString jsonfrommapentrystring) {
        return new Intent(context, PartnerBillPaymentInputActivity.class).putExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_DISPLAY", exception).putExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE", str).putExtra("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring);
    }

    public void onCreate(Bundle bundle) {
        jsonFromMapEntryString jsonfrommapentrystring;
        super.onCreate(bundle);
        setContentView(R.layout.f79172131493142);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.bill_payment_tab);
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) getIntent().getParcelableExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_DISPLAY");
        String stringExtra = getIntent().getStringExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_CALLBACK");
        String stringExtra2 = getIntent().getStringExtra("com.scb.phone.view.activity.partner.EXTRA_BILL_PAYMENT_PARTNER_SUBTYPE");
        if (stringExtra2 == null) {
            stringExtra2 = "chubb_travel_tile";
        }
        String str = stringExtra2;
        StreetViewPanoramaFragment.zzb zzb = StreetViewPanoramaFragment.zzb.PROFILE;
        if (getIntent() == null || getIntent().getExtras() == null || getIntent().getExtras().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE") == null) {
            jsonfrommapentrystring = jsonFromMapEntryString.NORMAL;
        } else {
            jsonfrommapentrystring = (jsonFromMapEntryString) getIntent().getExtras().getSerializable("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE");
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, BillPaymentTabFragment.MediaBrowserCompat$ItemReceiver(zzb, exception, "billpay_input", "partner_api", str, stringExtra, jsonfrommapentrystring)).write();
    }
}

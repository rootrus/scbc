package com.scb.phone.view.activity.directdebit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.directdebit.DirectDebitInputMainFragment;
import com.scb.phone.view.fragment.directdebit.DirectDebitInputMainFragment$MediaBrowserCompat$ItemReceiver;
import p040o.CrashlyticsReport;
import p040o.onGetStartedClick;

public final class DirectDebitInputActivity extends BaseActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77382131492963);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) getIntent().getParcelableExtra("EXTRA_BILL_PAYMENT_DISPLAY");
        DirectDebitInputMainFragment$MediaBrowserCompat$ItemReceiver directDebitInputMainFragment$MediaBrowserCompat$ItemReceiver = DirectDebitInputMainFragment.MediaBrowserCompat$CustomActionResultReceiver;
        String read = read("source", "");
        onGetStartedClick.IconCompatParcelizer((Object) read, "firebaseSourceParam");
        boolean z = execution != null;
        onGetStartedClick.write((Object) read, "source");
        DirectDebitInputMainFragment directDebitInputMainFragment = new DirectDebitInputMainFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", read);
        bundle2.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        bundle2.putBoolean("EXTRA_IS_FROM_SCAN", z);
        directDebitInputMainFragment.setArguments(bundle2);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_container, directDebitInputMainFragment).write();
        setStackedBackground();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.auto_direct_debit_apply_direct_debit);
        setTabContainer();
    }

    public final void onBackPressed() {
        if (isTaskRoot()) {
            RatingCompat(true);
        } else {
            super.onBackPressed();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || 16908332 != menuItem.getItemId() || !isTaskRoot()) {
            return super.onOptionsItemSelected(menuItem);
        }
        RatingCompat(true);
        return true;
    }

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, CrashlyticsReport.Session.Event.Application.Execution execution, String str) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) execution, "display");
        onGetStartedClick.write((Object) str, "source");
        Intent putExtra = new Intent(context, DirectDebitInputActivity.class).putExtra("source", str).putExtra("EXTRA_BILL_PAYMENT_DISPLAY", execution);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, DirectDe…PAYMENT_DISPLAY, display)");
        return putExtra;
    }
}

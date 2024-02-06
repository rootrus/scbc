package com.scb.phone.view.activity.deposit.exportstatement;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.deposit.exportstatement.ExportStatementSuccessfulFragment;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsNativeComponent;

public class ExportStatementSuccessfulActivity extends BaseActivity {
    private ExportStatementSuccessfulFragment MediaBrowserCompat$MediaItem;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77852131493010);
        if (getIntent().getParcelableExtra("com.scb.phone.EXTRA_DEPOSIT_EXPORT_STATEMENT_DISPLAY") != null) {
            this.MediaBrowserCompat$MediaItem = ExportStatementSuccessfulFragment.IconCompatParcelizer((CrashlyticsNativeComponent) getIntent().getParcelableExtra("com.scb.phone.EXTRA_DEPOSIT_EXPORT_STATEMENT_DISPLAY"));
        } else {
            finish();
        }
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_export_statement_success_layout, this.MediaBrowserCompat$MediaItem).write();
    }
}

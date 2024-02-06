package com.scb.phone.view.activity.chequemanagement;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment;
import p040o.getUuidUtf8Bytes;

public class ChequeSuccessActivity extends BaseActivity {
    private ChequeSuccessFragment MediaBrowserCompat$MediaItem;

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77122131492937);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getUuidUtf8Bytes getuuidutf8bytes = (getUuidUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_SUCCESS");
        if (getuuidutf8bytes != null) {
            this.MediaBrowserCompat$MediaItem = ChequeSuccessFragment.IconCompatParcelizer(getuuidutf8bytes);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaBrowserCompat$MediaItem).write();
            return;
        }
        finish();
    }
}

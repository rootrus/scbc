package com.scb.phone.view.activity.debitatm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.debitatm.DebitWithdrawalLimitFragment;
import p040o.nonNull;

public class DebitWithdrawalLimitActivity extends BaseActivity {
    public static Intent IconCompatParcelizer(Context context, nonNull nonnull) {
        return new Intent(context, DebitWithdrawalLimitActivity.class).putExtra("DEBIT_LIMIT_DISPLAY", nonnull);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77242131492949);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.withdrawal_page_header));
        setTabContainer();
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, DebitWithdrawalLimitFragment.read((nonNull) getIntent().getExtras().getParcelable("DEBIT_LIMIT_DISPLAY"))).write();
    }
}

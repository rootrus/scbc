package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;
import com.scb.phone.view.fragment.cardmanagement.TempLimitPreApprovedBottomFragment;
import p040o.chain;
import p040o.ensureBackgroundStateListenerRegistered;

public class TempLimitHomeActivity extends CCRBaseActivity {
    public static Intent MediaBrowserCompat$ItemReceiver(Context context, chain chain, ensureBackgroundStateListenerRegistered ensurebackgroundstatelistenerregistered) {
        Intent intent = new Intent(context, TempLimitHomeActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.TempLimitHomeActivity.KEY_CREDIT_CARD_DISPLAY", chain);
        intent.putExtra("com.scb.phone.view.activity.card_management.TempLimitHomeActivity.KEY_TEMP_LIMIT_CRITERIA", ensurebackgroundstatelistenerregistered);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80042131493229);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.temporary_limit_increase);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
        if (((ensureBackgroundStateListenerRegistered) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.TempLimitHomeActivity.KEY_TEMP_LIMIT_CRITERIA")).read) {
            getSupportFragmentManager().read().write(R.id.temp_limit_bottom_part_container, new TempLimitPreApprovedBottomFragment(), TempLimitPreApprovedBottomFragment.class.getName()).write();
        }
    }

    public final void setStackedBackground() {
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.temporary_limit_increase);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}

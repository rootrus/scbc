package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFragment;
import p040o.AlertController$RecycleListView;
import p040o.CardView;

public class GiftRecipientActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79582131493183);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gift_input_select_recipient));
        CardView read = getSupportFragmentManager().read();
        read.write(R.id.fragment_container, GiftRecipientFragment.read(getIntent().getStringExtra("RECIPIENT_TYPE")), "present");
        read.write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gift_input_select_recipient));
    }
}

package com.scb.phone.view.activity.bulktransfer;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.bulktransfer.CreateGroupFragment;
import p040o.AlertController$RecycleListView;

public class CreateRecipientGroupActivity extends BaseActivity {
    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77182131492943);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.fragment_create_recipient_group_container, CreateGroupFragment.write()).write();
        super.setStackedBackground();
        setTitle(R.string.create_recipient_group);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.create_recipient_group);
        setTabContainer();
    }
}

package com.scb.phone.view.activity.requesttopay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.requesttopay.EnterProxyFragment;
import p040o.AlertController$RecycleListView;
import p040o.CardView;

public class EnterProxyActivity extends BaseActivity {
    private boolean MediaBrowserCompat$MediaItem;
    private EnterProxyFragment MediaDescriptionCompat;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79772131493202);
        this.MediaDescriptionCompat = EnterProxyFragment.RatingCompat(read("source", ""));
        CardView read = getSupportFragmentManager().read();
        read.MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaDescriptionCompat);
        read.write();
    }

    public void onNewIntent(Intent intent) {
        String stringExtra;
        super.onNewIntent(intent);
        if (intent != null && (stringExtra = intent.getStringExtra("com.scb.phone.Constants.RequestToPay.EXTRA_REQUESTER_REQ_STATUS")) != null) {
            if (stringExtra.equals("COMPLETED")) {
                setResult(-1);
                finish();
            } else if (stringExtra.equals("ANOTHER")) {
                this.MediaBrowserCompat$MediaItem = true;
                EnterProxyFragment enterProxyFragment = this.MediaDescriptionCompat;
                if (enterProxyFragment != null) {
                    enterProxyFragment.MediaMetadataCompat();
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (16908332 == menuItem.getItemId()) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onBackPressed() {
        if (this.MediaBrowserCompat$MediaItem) {
            setResult(-1);
        }
        super.onBackPressed();
    }
}

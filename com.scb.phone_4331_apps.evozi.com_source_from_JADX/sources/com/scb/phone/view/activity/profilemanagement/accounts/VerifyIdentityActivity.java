package com.scb.phone.view.activity.profilemanagement.accounts;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.profilemanagement.accounts.VerifyIdentityFragment;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;

public class VerifyIdentityActivity extends BaseActivityWithFragment {
    private VerifyIdentityFragment MediaMetadataCompat;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        VerifyIdentityFragment MediaSessionCompat$QueueItem = VerifyIdentityFragment.MediaSessionCompat$QueueItem();
        this.MediaMetadataCompat = MediaSessionCompat$QueueItem;
        return MediaSessionCompat$QueueItem;
    }

    public final String au_() {
        return getString(R.string.verify_identity);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f92992131558401, menu);
        Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(menu.findItem(R.id.menu_action_bulk_transfer_help).getIcon());
        setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, setLastBaselineToBottomHeight.read(this, R.color.f67252131099881));
        menu.findItem(R.id.menu_action_bulk_transfer_help).setIcon(MediaBrowserCompat$MediaItem);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.MediaMetadataCompat.onOptionsItemSelected(menuItem);
    }
}

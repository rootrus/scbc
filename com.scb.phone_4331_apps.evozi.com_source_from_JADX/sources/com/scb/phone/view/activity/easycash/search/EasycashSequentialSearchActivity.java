package com.scb.phone.view.activity.easycash.search;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.search.SequentialSearchActivity;
import java.util.Map;
import p040o.onGetStartedClick;

public final class EasycashSequentialSearchActivity extends SequentialSearchActivity {
    public static final EasycashSequentialSearchActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new EasycashSequentialSearchActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final void MediaSessionCompat$Token() {
        super.MediaSessionCompat$Token();
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Map MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
            String string = extras.getString("EXTRA_PRODUCT_TYPE");
            if (string == null) {
                string = "";
            }
            MediaSessionCompat$QueueItem.put("PRODUCT_TYPE", string);
        }
    }
}

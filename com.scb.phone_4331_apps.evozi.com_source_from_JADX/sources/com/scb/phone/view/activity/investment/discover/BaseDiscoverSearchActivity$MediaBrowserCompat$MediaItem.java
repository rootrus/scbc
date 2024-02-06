package com.scb.phone.view.activity.investment.discover;

import android.view.View;
import android.widget.EditText;
import p040o.onGetStartedClick;

final class BaseDiscoverSearchActivity$MediaBrowserCompat$MediaItem implements View.OnClickListener {
    private /* synthetic */ BaseDiscoverSearchActivity MediaBrowserCompat$ItemReceiver;

    BaseDiscoverSearchActivity$MediaBrowserCompat$MediaItem(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        this.MediaBrowserCompat$ItemReceiver = baseDiscoverSearchActivity;
    }

    public final void onClick(View view) {
        EditText editText = this.MediaBrowserCompat$ItemReceiver.etSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etSearch");
        }
        editText.setText((CharSequence) null);
    }
}

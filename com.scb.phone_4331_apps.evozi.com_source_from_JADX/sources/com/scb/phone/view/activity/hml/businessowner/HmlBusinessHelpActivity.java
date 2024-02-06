package com.scb.phone.view.activity.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.view.activity.BaseActivity;
import org.bouncycastle.i18n.MessageBundle;
import p040o.onGetStartedClick;

public final class HmlBusinessHelpActivity extends BaseActivity {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, int i) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
            Intent intent = new Intent(context, HmlBusinessHelpActivity.class);
            intent.putExtra("LAYOUT_ID", i);
            intent.putExtra("TITLE", str);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView(intent.getIntExtra("LAYOUT_ID", 0));
        }
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        if (getIntent() != null) {
            MediaSessionCompat$QueueItem(getIntent().getStringExtra("TITLE"));
        }
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        if (getIntent() != null) {
            MediaSessionCompat$QueueItem(getIntent().getStringExtra("TITLE"));
        }
        setTabContainer();
    }
}

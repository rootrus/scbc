package com.scb.phone.view.activity.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.cardmanagement.C5872x4f5c74fa;
import com.scb.phone.view.fragment.cardmanagement.StatementChannelSuccessfulFragment;
import p040o.onGetStartedClick;
import p040o.onMessageTriggered;

public final class StatementChannelSuccessfulActivity extends BaseActivity {
    public static final C5568x677a96a MediaBrowserCompat$MediaItem = new C5568x677a96a((byte) 0);
    private onMessageTriggered MediaDescriptionCompat;

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79992131493224);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_CHANGE_CHANNEL_SUCCESS_DISPLAY_KEY");
            onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "it.getParcelableExtra(EX…NNEL_SUCCESS_DISPLAY_KEY)");
            this.MediaDescriptionCompat = (onMessageTriggered) parcelableExtra;
        }
        super.setStackedBackground();
        setTabContainer();
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setVisibility(8);
        }
        C5872x4f5c74fa statementChannelSuccessfulFragment$MediaBrowserCompat$ItemReceiver = StatementChannelSuccessfulFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onMessageTriggered onmessagetriggered = this.MediaDescriptionCompat;
        if (onmessagetriggered == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("changeChannelSuccessDisplay");
        }
        onGetStartedClick.write((Object) onmessagetriggered, "display");
        StatementChannelSuccessfulFragment statementChannelSuccessfulFragment = new StatementChannelSuccessfulFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("EXTRA_CHANGE_CHANNEL_SUCCESS_DISPLAY_KEY", onmessagetriggered);
        statementChannelSuccessfulFragment.setArguments(bundle2);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, statementChannelSuccessfulFragment).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }
}

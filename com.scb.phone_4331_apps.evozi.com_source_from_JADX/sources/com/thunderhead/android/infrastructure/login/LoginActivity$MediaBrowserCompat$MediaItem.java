package com.thunderhead.android.infrastructure.login;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

final class LoginActivity$MediaBrowserCompat$MediaItem implements View.OnClickListener {
    private /* synthetic */ LoginActivity write;

    LoginActivity$MediaBrowserCompat$MediaItem(LoginActivity loginActivity) {
        this.write = loginActivity;
    }

    public final void onClick(View view) {
        SwitchCompat MediaBrowserCompat$ItemReceiver = this.write.MediaDescriptionCompat;
        if (MediaBrowserCompat$ItemReceiver != null) {
            MediaBrowserCompat$ItemReceiver.setChecked(!MediaBrowserCompat$ItemReceiver.isChecked());
        }
        this.write.RatingCompat = true;
    }
}

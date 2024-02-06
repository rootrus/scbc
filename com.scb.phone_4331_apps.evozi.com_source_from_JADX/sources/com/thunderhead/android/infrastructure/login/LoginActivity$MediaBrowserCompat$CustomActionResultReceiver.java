package com.thunderhead.android.infrastructure.login;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.textfield.TextInputEditText;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_MutualFundAddressMainFragment;

final class LoginActivity$MediaBrowserCompat$CustomActionResultReceiver implements View.OnClickListener {
    private /* synthetic */ LoginActivity write;

    LoginActivity$MediaBrowserCompat$CustomActionResultReceiver(LoginActivity loginActivity) {
        this.write = loginActivity;
    }

    public final void onClick(View view) {
        FragmentBuilder_MutualFundAddressMainFragment MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaMetadataCompat;
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            TextInputEditText MediaMetadataCompat = this.write.MediaSessionCompat$Token;
            String str = null;
            String MediaBrowserCompat$CustomActionResultReceiver2 = MediaMetadataCompat != null ? AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(MediaMetadataCompat) : null;
            TextInputEditText IconCompatParcelizer = this.write.MediaBrowserCompat$ItemReceiver;
            if (IconCompatParcelizer != null) {
                str = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
            }
            SwitchCompat MediaBrowserCompat$ItemReceiver = this.write.MediaDescriptionCompat;
            MediaBrowserCompat$CustomActionResultReceiver.login(MediaBrowserCompat$CustomActionResultReceiver2, str, MediaBrowserCompat$ItemReceiver != null ? MediaBrowserCompat$ItemReceiver.isChecked() : false);
        }
    }
}

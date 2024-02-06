package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import org.bouncycastle.i18n.MessageBundle;
import p040o.onGetStartedClick;

public final class RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver {
    private RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ RegistrationNoDataActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static Intent IconCompatParcelizer(Context context, int i, String str, String str2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "description");
        Intent putExtra = new Intent(context, RegistrationNoDataActivity.class).putExtra(RegistrationNoDataActivity.MediaDescriptionCompat, R.drawable.ic_notice).putExtra(RegistrationNoDataActivity.MediaBrowserCompat$SearchResultReceiver, str).putExtra(RegistrationNoDataActivity.MediaBrowserCompat$MediaItem, str2);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, Registra…DESCRIPTION, description)");
        return putExtra;
    }
}

package com.thunderhead.android.infrastructure.login;

import p040o.AbstractMultimap;
import p040o.HmlPinActivity;
import p040o.readObjectNoData$MediaBrowserCompat$ItemReceiver;
import p040o.removeIfFromRandomAccessList;

public final class LoginActivity$MediaBrowserCompat$ItemReceiver implements AbstractMultimap.C30091 {
    private final readObjectNoData$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

    private LoginActivity$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public LoginActivity$MediaBrowserCompat$ItemReceiver(readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver) {
        this.IconCompatParcelizer = readobjectnodata_mediabrowsercompat_itemreceiver;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer.IconCompatParcelizer.getString("randomDeviceId", "");
    }

    public final long read() {
        return this.IconCompatParcelizer.IconCompatParcelizer.getLong("com.scb.phone.pref.key.LAST_ACTIVE_TIME", removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver());
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer.getBoolean("com.scb.phone.pref.key.USER_LOGGED_IN", false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.IconCompatParcelizer.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.key.USER_LOGGED_IN", false).apply();
    }

    public final void write() {
        this.IconCompatParcelizer.IconCompatParcelizer.edit().putLong("com.scb.phone.pref.key.LAST_ACTIVE_TIME", removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver()).apply();
    }
}

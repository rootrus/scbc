package androidx.drawerlayout.widget;

import android.view.View;
import p040o.setIconifiedByDefault;
import p040o.setTextOn;

final class DrawerLayout$MediaBrowserCompat$CustomActionResultReceiver extends setIconifiedByDefault {
    DrawerLayout$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final void IconCompatParcelizer(View view, setTextOn settexton) {
        super.IconCompatParcelizer(view, settexton);
        if (!DrawerLayout.read(view)) {
            settexton.MediaBrowserCompat$ItemReceiver((View) null);
        }
    }
}

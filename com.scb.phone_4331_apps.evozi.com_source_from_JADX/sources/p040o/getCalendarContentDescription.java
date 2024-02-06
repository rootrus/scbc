package p040o;

import com.scb.phone.view.activity.personalize.ShortcutRouterActivity;

/* renamed from: o.getCalendarContentDescription */
public final class getCalendarContentDescription {
    private static final String[] read = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    static void MediaBrowserCompat$ItemReceiver(ShortcutRouterActivity shortcutRouterActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(shortcutRouterActivity, read)) {
            C4382er erVar = shortcutRouterActivity.presenter;
            discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = shortcutRouterActivity.MediaMetadataCompat;
            erVar.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver(true);
            erVar.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            return;
        }
        AppCompatRatingBar.write(shortcutRouterActivity, read, 60);
    }

    public static void read(ShortcutRouterActivity shortcutRouterActivity, int i, int[] iArr) {
        if (i != 60) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            C4382er erVar = shortcutRouterActivity.presenter;
            discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = shortcutRouterActivity.MediaMetadataCompat;
            erVar.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver(true);
            erVar.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        } else if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(shortcutRouterActivity, read)) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
            shortcutRouterActivity.finish();
        } else {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
            shortcutRouterActivity.finish();
        }
    }
}

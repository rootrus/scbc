package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.personalize.ShortcutRouterActivity;

/* renamed from: o.canGoForward */
public final /* synthetic */ class canGoForward implements DialogInterface.OnClickListener {
    private final /* synthetic */ ShortcutRouterActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ canGoForward(ShortcutRouterActivity shortcutRouterActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = shortcutRouterActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ShortcutRouterActivity shortcutRouterActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        dialogInterface.dismiss();
        shortcutRouterActivity.finish();
    }
}

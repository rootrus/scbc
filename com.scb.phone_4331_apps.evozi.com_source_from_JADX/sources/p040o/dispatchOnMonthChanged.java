package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.personalize.ShortcutRouterActivity;

/* renamed from: o.dispatchOnMonthChanged */
public final /* synthetic */ class dispatchOnMonthChanged implements DialogInterface.OnClickListener {
    private final /* synthetic */ ShortcutRouterActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ dispatchOnMonthChanged(ShortcutRouterActivity shortcutRouterActivity) {
        this.MediaBrowserCompat$ItemReceiver = shortcutRouterActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ShortcutRouterActivity shortcutRouterActivity = this.MediaBrowserCompat$ItemReceiver;
        shortcutRouterActivity.MediaDescriptionCompat = false;
        getCalendarContentDescription.MediaBrowserCompat$ItemReceiver(shortcutRouterActivity);
        dialogInterface.dismiss();
    }
}

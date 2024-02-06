package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.personalize.ShortcutRouterActivity;

/* renamed from: o.getCurrentDate */
public final /* synthetic */ class getCurrentDate implements DialogInterface.OnDismissListener {
    private final /* synthetic */ ShortcutRouterActivity read;

    public /* synthetic */ getCurrentDate(ShortcutRouterActivity shortcutRouterActivity) {
        this.read = shortcutRouterActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ShortcutRouterActivity shortcutRouterActivity = this.read;
        if (shortcutRouterActivity.MediaDescriptionCompat) {
            shortcutRouterActivity.finish();
        }
    }
}

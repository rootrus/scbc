package p040o;

import android.database.Cursor;
import p040o.nAllocationGetStride;

/* renamed from: o.ZHEMM$MediaBrowserCompat$CustomActionResultReceiver */
public final class ZHEMM$MediaBrowserCompat$CustomActionResultReceiver implements nAllocationGetStride.write {
    public static final ZHEMM$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new ZHEMM$MediaBrowserCompat$CustomActionResultReceiver();
    public static final int abc_action_bar_embed_tabs = 2131034112;
    public static final int abc_allow_stacked_button_bar = 2131034113;
    public static final int abc_config_actionMenuItemAllCaps = 2131034114;
    public static final int bb_bottom_bar_is_portrait_mode = 2131034115;
    public static final int bb_bottom_bar_is_tablet_mode = 2131034116;

    private ZHEMM$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final Object read(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }
}

package p040o;

import android.os.Build;
import android.view.ViewGroup;
import p040o.AppCompatSeekBar;

/* renamed from: o.setSplitTrack */
public final class setSplitTrack {
    public static int read(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(AppCompatSeekBar.IconCompatParcelizer.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && SwitchCompat.Keep(viewGroup) == null) ? false : true;
    }
}

package p040o;

import android.view.View;
import android.view.ViewGroup;
import com.roughike.bottombar.BadgeContainer;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;

/* renamed from: o.ZHBMV */
public final class ZHBMV {
    private final BottomBar MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.ZHBMV$write */
    public interface write {
        void IconCompatParcelizer(BottomBarTab bottomBarTab);
    }

    public ZHBMV(BottomBar bottomBar) {
        this.MediaBrowserCompat$ItemReceiver = bottomBar;
    }

    public final void MediaBrowserCompat$ItemReceiver(write write2) {
        BottomBarTab bottomBarTab;
        int childCount = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getChildCount();
        if (childCount > 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getChildAt(i);
                if (childAt instanceof BadgeContainer) {
                    bottomBarTab = BottomBar.MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) (BadgeContainer) childAt);
                } else {
                    bottomBarTab = (BottomBarTab) childAt;
                }
                write2.IconCompatParcelizer(bottomBarTab);
            }
        }
    }
}

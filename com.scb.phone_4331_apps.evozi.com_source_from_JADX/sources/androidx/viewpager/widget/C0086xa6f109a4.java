package androidx.viewpager.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Comparator;

/* renamed from: androidx.viewpager.widget.ViewPager$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
class C0086xa6f109a4 implements Comparator<View> {
    C0086xa6f109a4() {
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        ViewPager.write write = (ViewPager.write) ((View) obj).getLayoutParams();
        ViewPager.write write2 = (ViewPager.write) ((View) obj2).getLayoutParams();
        if (write.MediaBrowserCompat$CustomActionResultReceiver != write2.MediaBrowserCompat$CustomActionResultReceiver) {
            return write.MediaBrowserCompat$CustomActionResultReceiver ? 1 : -1;
        }
        return write.IconCompatParcelizer - write2.IconCompatParcelizer;
    }
}

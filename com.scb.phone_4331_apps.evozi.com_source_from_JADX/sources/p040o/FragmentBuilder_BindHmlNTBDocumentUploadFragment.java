package p040o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.Map;

/* renamed from: o.FragmentBuilder_BindHmlNTBDocumentUploadFragment */
public final class FragmentBuilder_BindHmlNTBDocumentUploadFragment {
    /* access modifiers changed from: package-private */
    public final void write(View view, Map<String, View> map) {
        String MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            map.put(MediaBrowserCompat$CustomActionResultReceiver, view);
        }
        int i = 0;
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            if (viewPager.getChildCount() != 0) {
                Rect rect = new Rect();
                viewPager.getDrawingRect(rect);
                while (i < viewPager.getChildCount()) {
                    View childAt = viewPager.getChildAt(i);
                    Rect rect2 = new Rect();
                    childAt.getHitRect(rect2);
                    if (rect.contains(rect2)) {
                        String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(childAt);
                        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                            map.put(MediaBrowserCompat$CustomActionResultReceiver2, childAt);
                        }
                        write(childAt, map);
                    }
                    i++;
                }
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (i < viewGroup.getChildCount()) {
                write(viewGroup.getChildAt(i), map);
                i++;
            }
        }
    }
}

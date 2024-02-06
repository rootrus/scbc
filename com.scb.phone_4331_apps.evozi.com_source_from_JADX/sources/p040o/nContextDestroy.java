package p040o;

import android.util.Property;
import android.view.ViewGroup;
import p040o.nAllocationSetSurface;

/* renamed from: o.nContextDestroy */
public final class nContextDestroy extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> MediaBrowserCompat$ItemReceiver = new nContextDestroy("childrenAlpha");

    public final /* synthetic */ Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(nAllocationSetSurface.MediaDescriptionCompat.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(nAllocationSetSurface.MediaDescriptionCompat.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }

    private nContextDestroy(String str) {
        super(Float.class, str);
    }
}

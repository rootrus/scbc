package p040o;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.setChildrenDrawingOrderEnabledCompat */
public final class setChildrenDrawingOrderEnabledCompat {
    final ArrayList<BetterViewPager> IconCompatParcelizer = new ArrayList<>();
    public View MediaBrowserCompat$CustomActionResultReceiver;
    public final Map<String, Object> MediaBrowserCompat$ItemReceiver = new HashMap();

    public final boolean equals(Object obj) {
        if (!(obj instanceof setChildrenDrawingOrderEnabledCompat)) {
            return false;
        }
        setChildrenDrawingOrderEnabledCompat setchildrendrawingorderenabledcompat = (setChildrenDrawingOrderEnabledCompat) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == setchildrendrawingorderenabledcompat.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver.equals(setchildrendrawingorderenabledcompat.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        return (this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("    view = ");
        sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb2.append("\n");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append("    values:");
        String obj3 = sb3.toString();
        for (String next : this.MediaBrowserCompat$ItemReceiver.keySet()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj3);
            sb4.append("    ");
            sb4.append(next);
            sb4.append(": ");
            sb4.append(this.MediaBrowserCompat$ItemReceiver.get(next));
            sb4.append("\n");
            obj3 = sb4.toString();
        }
        return obj3;
    }
}

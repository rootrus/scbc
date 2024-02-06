package p040o;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: o.onRedeemAnotherRewardClick */
public final class onRedeemAnotherRewardClick {
    public View read;

    public onRedeemAnotherRewardClick(View view) {
        this.read = view;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(View view, View view2) {
        if (view == null || view2 == null || !(view2 instanceof ViewGroup) || view2 == view) {
            return false;
        }
        while (view.getParent() instanceof ViewGroup) {
            if (view.getParent() == view2) {
                return true;
            }
            view = (ViewGroup) view.getParent();
        }
        return false;
    }

    public final boolean read(View view) {
        HashMap hashMap = new HashMap();
        View view2 = this.read;
        if (view2 != null && view != null) {
            while (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) view2.getParent();
                hashMap.put(viewGroup, view2);
                view2 = viewGroup;
            }
            if (!(view instanceof ViewGroup) || hashMap.get(view) == null) {
                while (true) {
                    if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
                        break;
                    }
                    ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                    View view3 = (View) hashMap.get(viewGroup2);
                    if (view3 == null) {
                        view = viewGroup2;
                    } else if (viewGroup2.indexOfChild(view3) > viewGroup2.indexOfChild(view)) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}

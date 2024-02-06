package p040o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: o.setContentPadding */
public abstract class setContentPadding {
    public abstract Object IconCompatParcelizer(Object obj, Object obj2, Object obj3);

    public abstract void IconCompatParcelizer(Object obj, ArrayList<View> arrayList);

    public abstract Object MediaBrowserCompat$CustomActionResultReceiver(Object obj);

    public abstract Object MediaBrowserCompat$ItemReceiver(Object obj, Object obj2, Object obj3);

    public abstract void MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, Object obj);

    public abstract void MediaBrowserCompat$ItemReceiver(Object obj, View view);

    public abstract void MediaBrowserCompat$ItemReceiver(Object obj, View view, ArrayList<View> arrayList);

    public abstract void MediaBrowserCompat$ItemReceiver(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract boolean MediaBrowserCompat$ItemReceiver(Object obj);

    public abstract void read(Object obj, Rect rect);

    public abstract void read(Object obj, View view);

    public abstract void read(Object obj, View view, ArrayList<View> arrayList);

    public abstract void read(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object write(Object obj);

    public abstract void write(Object obj, View view);

    public abstract void write(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* access modifiers changed from: protected */
    public void write(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> write(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(SwitchCompat.Keep(view));
            SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String Keep = SwitchCompat.Keep(view2);
            arrayList4.add(Keep);
            if (Keep != null) {
                SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view2, (String) null);
                String str = map.get(Keep);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(arrayList2.get(i2), Keep);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C1454x8d0f0ffb setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver = new C1454x8d0f0ffb(view, new Runnable() {
            public final void run() {
                for (int i = 0; i < size; i++) {
                    SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver((View) arrayList5.get(i), (String) arrayList6.get(i));
                    SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
        view.getViewTreeObserver().addOnPreDrawListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
        view.addOnAttachStateChangeListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
    }

    /* access modifiers changed from: package-private */
    public void read(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (setSplitTrack.MediaBrowserCompat$CustomActionResultReceiver(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                read(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String Keep = SwitchCompat.Keep(view);
            if (Keep != null) {
                map.put(Keep, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    MediaBrowserCompat$ItemReceiver(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void write(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C1454x8d0f0ffb setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver = new C1454x8d0f0ffb(view, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String Keep = SwitchCompat.Keep(view);
                    if (Keep != null) {
                        SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view, setContentPadding.MediaBrowserCompat$ItemReceiver((Map<String, String>) map, Keep));
                    }
                }
            }
        });
        view.getViewTreeObserver().addOnPreDrawListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
        view.addOnAttachStateChangeListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C1454x8d0f0ffb setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver = new C1454x8d0f0ffb(viewGroup, new Runnable() {
            public final void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view, (String) map.get(SwitchCompat.Keep(view)));
                }
            }
        });
        viewGroup.getViewTreeObserver().addOnPreDrawListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
        viewGroup.addOnAttachStateChangeListener(setbackgrounddrawable_mediabrowsercompat_customactionresultreceiver);
    }

    protected static void write(List<View> list, View view) {
        int size = list.size();
        if (!IconCompatParcelizer(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!IconCompatParcelizer(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean IconCompatParcelizer(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean IconCompatParcelizer(List list) {
        return list == null || list.isEmpty();
    }

    static String MediaBrowserCompat$ItemReceiver(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }
}

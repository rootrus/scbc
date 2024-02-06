package p040o;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setThumbTintList */
public class setThumbTintList {
    private final Object write;

    public List<setTextOn> IconCompatParcelizer(String str, int i) {
        return null;
    }

    public setTextOn MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return null;
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, Bundle bundle) {
        return false;
    }

    public setTextOn MediaBrowserCompat$ItemReceiver(int i) {
        return null;
    }

    /* renamed from: o.setThumbTintList$write */
    static class write extends AccessibilityNodeProvider {
        final setThumbTintList IconCompatParcelizer;

        write(setThumbTintList setthumbtintlist) {
            this.IconCompatParcelizer = setthumbtintlist;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            setTextOn MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            return MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<setTextOn> IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(str, i);
            if (IconCompatParcelizer2 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = IconCompatParcelizer2.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(IconCompatParcelizer2.get(i2).AppCompatDelegateImpl$ListMenuDecorView());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i, i2, bundle);
        }
    }

    /* renamed from: o.setThumbTintList$read */
    static class read extends write {
        read(setThumbTintList setthumbtintlist) {
            super(setthumbtintlist);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            setTextOn MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i);
            if (MediaBrowserCompat$ItemReceiver == null) {
                return null;
            }
            return MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    public setThumbTintList() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.write = new read(this);
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.write = new write(this);
        } else {
            this.write = null;
        }
    }

    public setThumbTintList(Object obj) {
        this.write = obj;
    }

    public Object MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }
}

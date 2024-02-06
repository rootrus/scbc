package p040o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import androidx.recyclerview.widget.RecyclerView$MediaSessionCompat$ResultReceiverWrapper;
import p040o.setTextOn;

/* renamed from: o.setGuidelinePercent */
public class setGuidelinePercent extends setIconifiedByDefault {
    public final setIconifiedByDefault MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer(this);
    final RecyclerView read;

    public setGuidelinePercent(RecyclerView recyclerView) {
        this.read = recyclerView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean MediaBrowserCompat$ItemReceiver(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.MediaBrowserCompat$ItemReceiver(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L_0x0008
            return r6
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r4 = r3.read
            boolean r4 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            r0 = 0
            if (r4 != 0) goto L_0x008d
            androidx.recyclerview.widget.RecyclerView r4 = r3.read
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r4 = r4.AppCompatActivity
            if (r4 == 0) goto L_0x008d
            androidx.recyclerview.widget.RecyclerView r4 = r3.read
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r4 = r4.AppCompatActivity
            androidx.recyclerview.widget.RecyclerView r1 = r4.setHasDecor
            if (r1 != 0) goto L_0x0020
            return r0
        L_0x0020:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L_0x0057
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L_0x002b
            r5 = r0
            r1 = r5
            goto L_0x0082
        L_0x002b:
            r5 = -1
            boolean r1 = r1.canScrollVertically(r5)
            if (r1 == 0) goto L_0x0040
            int r1 = r4.ParcelableVolumeInfo
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r1 = -r1
            goto L_0x0041
        L_0x0040:
            r1 = r0
        L_0x0041:
            androidx.recyclerview.widget.RecyclerView r2 = r4.setHasDecor
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L_0x0081
            int r5 = r4.setBackgroundResource
            int r2 = r4.getPaddingLeft()
            int r5 = r5 - r2
            int r2 = r4.getPaddingRight()
            int r5 = r5 - r2
            int r5 = -r5
            goto L_0x0082
        L_0x0057:
            boolean r5 = r1.canScrollVertically(r6)
            if (r5 == 0) goto L_0x006b
            int r5 = r4.ParcelableVolumeInfo
            int r1 = r4.getPaddingTop()
            int r5 = r5 - r1
            int r1 = r4.getPaddingBottom()
            int r5 = r5 - r1
            r1 = r5
            goto L_0x006c
        L_0x006b:
            r1 = r0
        L_0x006c:
            androidx.recyclerview.widget.RecyclerView r5 = r4.setHasDecor
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L_0x0081
            int r5 = r4.setBackgroundResource
            int r2 = r4.getPaddingLeft()
            int r5 = r5 - r2
            int r2 = r4.getPaddingRight()
            int r5 = r5 - r2
            goto L_0x0082
        L_0x0081:
            r5 = r0
        L_0x0082:
            if (r1 != 0) goto L_0x0087
            if (r5 != 0) goto L_0x0087
            return r0
        L_0x0087:
            androidx.recyclerview.widget.RecyclerView r4 = r4.setHasDecor
            r4.MediaBrowserCompat$ItemReceiver((int) r5, (int) r1)
            return r6
        L_0x008d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setGuidelinePercent.MediaBrowserCompat$ItemReceiver(android.view.View, int, android.os.Bundle):boolean");
    }

    public void IconCompatParcelizer(View view, setTextOn settexton) {
        super.IconCompatParcelizer(view, settexton);
        settexton.write((CharSequence) RecyclerView.class.getName());
        if (!this.read.MediaBrowserCompat$CustomActionResultReceiver() && this.read.AppCompatActivity != null) {
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.read.AppCompatActivity;
            RecyclerView$MediaSessionCompat$ResultReceiverWrapper recyclerView$MediaSessionCompat$ResultReceiverWrapper = recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor.setPadding;
            RecyclerView.Keep keep = recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor.ExpandedMenuView;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor.canScrollVertically(-1) || recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor.canScrollHorizontally(-1)) {
                settexton.read(8192);
                settexton.MediaSessionCompat$ResultReceiverWrapper(true);
            }
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor.canScrollVertically(1) || recyclerView$MediaBrowserCompat$SearchResultReceiver.setHasDecor.canScrollHorizontally(1)) {
                settexton.read(4096);
                settexton.MediaSessionCompat$ResultReceiverWrapper(true);
            }
            settexton.read((Object) setTextOn.read.MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep), recyclerView$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(recyclerView$MediaSessionCompat$ResultReceiverWrapper, keep), false, 0));
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(View view, AccessibilityEvent accessibilityEvent) {
        super.MediaBrowserCompat$CustomActionResultReceiver(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.read.MediaBrowserCompat$CustomActionResultReceiver()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.AppCompatActivity != null) {
                recyclerView.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(accessibilityEvent);
            }
        }
    }

    /* renamed from: o.setGuidelinePercent$IconCompatParcelizer */
    public static class IconCompatParcelizer extends setIconifiedByDefault {
        final setGuidelinePercent IconCompatParcelizer;

        public IconCompatParcelizer(setGuidelinePercent setguidelinepercent) {
            this.IconCompatParcelizer = setguidelinepercent;
        }

        public final void IconCompatParcelizer(View view, setTextOn settexton) {
            super.IconCompatParcelizer(view, settexton);
            if (!this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver() && this.IconCompatParcelizer.read.AppCompatActivity != null) {
                this.IconCompatParcelizer.read.AppCompatActivity.read(view, settexton);
            }
        }

        public final boolean MediaBrowserCompat$ItemReceiver(View view, int i, Bundle bundle) {
            if (super.MediaBrowserCompat$ItemReceiver(view, i, bundle)) {
                return true;
            }
            if (this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver() || this.IconCompatParcelizer.read.AppCompatActivity != null) {
            }
            return false;
        }
    }
}

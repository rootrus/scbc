package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.SwitchCompat;
import p040o.setTitleMargin;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<V> {
    public float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    public int MediaBrowserCompat$CustomActionResultReceiver = 2;
    float MediaBrowserCompat$ItemReceiver = 0.5f;
    public setTitleMargin MediaBrowserCompat$MediaItem;
    private final setTitleMargin.read MediaBrowserCompat$SearchResultReceiver = new setTitleMargin.read() {
        private int MediaBrowserCompat$ItemReceiver = -1;
        private int read;

        public final boolean IconCompatParcelizer(View view, int i) {
            return this.MediaBrowserCompat$ItemReceiver == -1 && SwipeDismissBehavior.this.MediaBrowserCompat$ItemReceiver(view);
        }

        public final void write(View view, int i) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.read = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            if (SwipeDismissBehavior.this.read != null) {
                SwipeDismissBehavior.this.read.write(i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.read) >= java.lang.Math.round(((float) r8.getWidth()) * r7.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver)) goto L_0x001e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void write(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.MediaBrowserCompat$ItemReceiver = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0042
                int r4 = p040o.SwitchCompat.m3079x50fd9e4a(r8)
                if (r4 != r3) goto L_0x0016
                r4 = r3
                goto L_0x0017
            L_0x0016:
                r4 = r2
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
                r6 = 2
                if (r5 != r6) goto L_0x0020
            L_0x001e:
                r9 = r3
                goto L_0x005e
            L_0x0020:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
                if (r5 != 0) goto L_0x0032
                if (r4 == 0) goto L_0x002d
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0030
                goto L_0x002f
            L_0x002d:
                if (r1 <= 0) goto L_0x0030
            L_0x002f:
                goto L_0x001e
            L_0x0030:
                r9 = r2
                goto L_0x005e
            L_0x0032:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
                if (r5 != r3) goto L_0x0030
                if (r4 == 0) goto L_0x003d
                if (r1 <= 0) goto L_0x0030
                goto L_0x0041
            L_0x003d:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0030
            L_0x0041:
                goto L_0x001e
            L_0x0042:
                int r9 = r8.getLeft()
                int r0 = r7.read
                int r1 = r8.getWidth()
                float r1 = (float) r1
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r4 = r4.MediaBrowserCompat$ItemReceiver
                float r1 = r1 * r4
                int r1 = java.lang.Math.round(r1)
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r1) goto L_0x0030
                goto L_0x001e
            L_0x005e:
                if (r9 == 0) goto L_0x006d
                int r9 = r8.getLeft()
                int r0 = r7.read
                if (r9 >= r0) goto L_0x006a
                int r0 = r0 - r10
                goto L_0x006b
            L_0x006a:
                int r0 = r0 + r10
            L_0x006b:
                r2 = r3
                goto L_0x006f
            L_0x006d:
                int r0 = r7.read
            L_0x006f:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                o.setTitleMargin r9 = r9.MediaBrowserCompat$MediaItem
                int r10 = r8.getTop()
                boolean r9 = r9.IconCompatParcelizer(r0, r10)
                if (r9 == 0) goto L_0x0088
                com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver r9 = new com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r10, r8, r2)
                p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r8, (java.lang.Runnable) r9)
                return
            L_0x0088:
                if (r2 == 0) goto L_0x0097
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$write r9 = r9.read
                if (r9 == 0) goto L_0x0097
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$write r9 = r9.read
                r9.read(r8)
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C01595.write(android.view.View, float, float):void");
        }

        public final int write(View view) {
            return view.getWidth();
        }

        public final int MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
            int i2;
            int i3;
            boolean z = SwitchCompat.m3079x50fd9e4a(view) == 1;
            if (SwipeDismissBehavior.this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
                if (SwipeDismissBehavior.this.MediaBrowserCompat$CustomActionResultReceiver != 1) {
                    i3 = this.read - view.getWidth();
                    i2 = view.getWidth() + this.read;
                } else if (!z) {
                    i3 = this.read - view.getWidth();
                    i2 = this.read;
                }
                return Math.min(Math.max(i3, i), i2);
            } else if (z) {
                i3 = this.read - view.getWidth();
                i2 = this.read;
                return Math.min(Math.max(i3, i), i2);
            }
            i3 = this.read;
            i2 = view.getWidth() + i3;
            return Math.min(Math.max(i3, i), i2);
        }

        public final int read(View view, int i) {
            return view.getTop();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view, int i, int i2) {
            float width = ((float) this.read) + (((float) view.getWidth()) * SwipeDismissBehavior.this.IconCompatParcelizer);
            float width2 = ((float) this.read) + (((float) view.getWidth()) * SwipeDismissBehavior.this.write);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setAlpha(Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }
    };
    private boolean MediaMetadataCompat;
    public write read;
    public float write = 0.5f;

    public interface write {
        void read(View view);

        void write(int i);
    }

    public boolean MediaBrowserCompat$ItemReceiver(View view) {
        return true;
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.MediaMetadataCompat;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.MediaBrowserCompat$ItemReceiver(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.MediaMetadataCompat = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.MediaMetadataCompat = false;
        }
        if (!z) {
            return false;
        }
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = setTitleMargin.write((ViewGroup) coordinatorLayout, this.MediaBrowserCompat$SearchResultReceiver);
        }
        return this.MediaBrowserCompat$MediaItem.write(motionEvent);
    }

    public final boolean write(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        setTitleMargin settitlemargin = this.MediaBrowserCompat$MediaItem;
        if (settitlemargin == null) {
            return false;
        }
        settitlemargin.MediaBrowserCompat$CustomActionResultReceiver(motionEvent);
        return true;
    }
}

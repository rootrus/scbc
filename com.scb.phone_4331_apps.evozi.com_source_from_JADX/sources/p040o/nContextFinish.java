package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: o.nContextFinish */
public abstract class nContextFinish<V extends View> extends nContextGetErrorMessage<V> {
    private int IconCompatParcelizer;
    private Runnable MediaBrowserCompat$CustomActionResultReceiver;
    OverScroller MediaBrowserCompat$ItemReceiver;
    private VelocityTracker MediaBrowserCompat$SearchResultReceiver;
    private int RatingCompat = -1;
    private boolean read;
    private int write = -1;

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: protected */
    public boolean IconCompatParcelizer(V v) {
        return false;
    }

    public nContextFinish() {
    }

    public nContextFinish(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.RatingCompat
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.RatingCompat = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.read
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x005e
            r5 = -1
            if (r0 == r2) goto L_0x004f
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x004f
            goto L_0x0088
        L_0x002f:
            int r6 = r4.write
            if (r6 == r5) goto L_0x0088
            int r6 = r7.findPointerIndex(r6)
            if (r6 == r5) goto L_0x0088
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.IconCompatParcelizer
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.RatingCompat
            if (r6 <= r0) goto L_0x0088
            r4.read = r2
            r4.IconCompatParcelizer = r5
            goto L_0x0088
        L_0x004f:
            r4.read = r3
            r4.write = r5
            android.view.VelocityTracker r5 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r5 == 0) goto L_0x0088
            r5.recycle()
            r5 = 0
            r4.MediaBrowserCompat$SearchResultReceiver = r5
            goto L_0x0088
        L_0x005e:
            r4.read = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.IconCompatParcelizer(r6)
            if (r2 == 0) goto L_0x0088
            boolean r5 = r5.MediaBrowserCompat$ItemReceiver(r6, r0, r1)
            if (r5 == 0) goto L_0x0088
            r4.IconCompatParcelizer = r1
            int r5 = r7.getPointerId(r3)
            r4.write = r5
            android.view.VelocityTracker r5 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r5 != 0) goto L_0x0088
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.MediaBrowserCompat$SearchResultReceiver = r5
        L_0x0088:
            android.view.VelocityTracker r5 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r5 == 0) goto L_0x008f
            r5.addMovement(r7)
        L_0x008f:
            boolean r5 = r4.read
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nContextFinish.MediaBrowserCompat$CustomActionResultReceiver(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 != 3) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean write(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            r19 = this;
            r6 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            int r0 = r6.RatingCompat
            if (r0 >= 0) goto L_0x001a
            android.content.Context r0 = r20.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.RatingCompat = r0
        L_0x001a:
            int r0 = r22.getActionMasked()
            r8 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00db
            r4 = 0
            r5 = -1
            if (r0 == r8) goto L_0x006e
            r9 = 2
            if (r0 == r9) goto L_0x002e
            r1 = 3
            if (r0 == r1) goto L_0x00cd
            goto L_0x0103
        L_0x002e:
            int r0 = r6.write
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r5) goto L_0x0037
            return r3
        L_0x0037:
            float r0 = r7.getY(r0)
            int r0 = (int) r0
            int r3 = r6.IconCompatParcelizer
            int r3 = r3 - r0
            boolean r4 = r6.read
            if (r4 != 0) goto L_0x0052
            int r4 = java.lang.Math.abs(r3)
            int r5 = r6.RatingCompat
            if (r4 <= r5) goto L_0x0052
            r6.read = r8
            if (r3 <= 0) goto L_0x0051
            int r3 = r3 - r5
            goto L_0x0052
        L_0x0051:
            int r3 = r3 + r5
        L_0x0052:
            boolean r4 = r6.read
            if (r4 == 0) goto L_0x0103
            r6.IconCompatParcelizer = r0
            int r4 = r6.MediaBrowserCompat$CustomActionResultReceiver(r2)
            int r0 = r19.IconCompatParcelizer()
            int r3 = r0 - r3
            r5 = 0
            r0 = r19
            r1 = r20
            r2 = r21
            r0.IconCompatParcelizer(r1, r2, r3, r4, r5)
            goto L_0x0103
        L_0x006e:
            android.view.VelocityTracker r0 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x00cd
            r0.addMovement(r7)
            android.view.VelocityTracker r0 = r6.MediaBrowserCompat$SearchResultReceiver
            r9 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r9)
            android.view.VelocityTracker r0 = r6.MediaBrowserCompat$SearchResultReceiver
            int r9 = r6.write
            float r0 = r0.getYVelocity(r9)
            int r9 = r6.read(r2)
            int r9 = -r9
            java.lang.Runnable r10 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r10 == 0) goto L_0x0092
            r2.removeCallbacks(r10)
            r6.MediaBrowserCompat$CustomActionResultReceiver = r4
        L_0x0092:
            android.widget.OverScroller r10 = r6.MediaBrowserCompat$ItemReceiver
            if (r10 != 0) goto L_0x00a1
            android.widget.OverScroller r10 = new android.widget.OverScroller
            android.content.Context r11 = r21.getContext()
            r10.<init>(r11)
            r6.MediaBrowserCompat$ItemReceiver = r10
        L_0x00a1:
            android.widget.OverScroller r10 = r6.MediaBrowserCompat$ItemReceiver
            int r12 = r19.read()
            int r14 = java.lang.Math.round(r0)
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r17 = r9
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r6.MediaBrowserCompat$ItemReceiver
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00ca
            o.nContextFinish$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.nContextFinish$MediaBrowserCompat$CustomActionResultReceiver
            r0.<init>(r6, r1, r2)
            r6.MediaBrowserCompat$CustomActionResultReceiver = r0
            p040o.SwitchCompat.MediaBrowserCompat$ItemReceiver((android.view.View) r2, (java.lang.Runnable) r0)
            goto L_0x00cd
        L_0x00ca:
            r19.IconCompatParcelizer(r20, r21)
        L_0x00cd:
            r6.read = r3
            r6.write = r5
            android.view.VelocityTracker r0 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x0103
            r0.recycle()
            r6.MediaBrowserCompat$SearchResultReceiver = r4
            goto L_0x0103
        L_0x00db:
            float r0 = r22.getX()
            int r0 = (int) r0
            float r4 = r22.getY()
            int r4 = (int) r4
            boolean r0 = r1.MediaBrowserCompat$ItemReceiver(r2, r0, r4)
            if (r0 == 0) goto L_0x010b
            boolean r0 = r6.IconCompatParcelizer(r2)
            if (r0 == 0) goto L_0x010b
            r6.IconCompatParcelizer = r4
            int r0 = r7.getPointerId(r3)
            r6.write = r0
            android.view.VelocityTracker r0 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r0 != 0) goto L_0x0103
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.MediaBrowserCompat$SearchResultReceiver = r0
        L_0x0103:
            android.view.VelocityTracker r0 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x010a
            r0.addMovement(r7)
        L_0x010a:
            return r8
        L_0x010b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nContextFinish.write(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public int IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int read2 = read();
        if (i2 != 0 && read2 >= i2 && read2 <= i3) {
            if (i < i2) {
                i = i2;
            } else if (i > i3) {
                i = i3;
            }
            if (read2 != i) {
                MediaBrowserCompat$CustomActionResultReceiver(i);
                return read2 - i;
            }
        }
        return 0;
    }

    public int IconCompatParcelizer() {
        return read();
    }

    /* access modifiers changed from: protected */
    public int MediaBrowserCompat$CustomActionResultReceiver(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: protected */
    public int read(V v) {
        return v.getHeight();
    }
}

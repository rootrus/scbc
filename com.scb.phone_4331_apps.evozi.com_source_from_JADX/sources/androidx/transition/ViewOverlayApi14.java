package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p040o.SwitchCompat;
import p040o.setSmoothScrollingEnabled;

public class ViewOverlayApi14 {
    public OverlayViewGroup write;

    public ViewOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        this.write = new OverlayViewGroup(context, viewGroup, view, this);
    }

    static ViewGroup write(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    public static ViewOverlayApi14 MediaBrowserCompat$ItemReceiver(View view) {
        ViewGroup write2 = write(view);
        if (write2 == null) {
            return null;
        }
        int childCount = write2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = write2.getChildAt(i);
            if (childAt instanceof OverlayViewGroup) {
                return ((OverlayViewGroup) childAt).write;
            }
        }
        return new setSmoothScrollingEnabled(write2.getContext(), write2, view);
    }

    public static class OverlayViewGroup extends ViewGroup {
        static Method IconCompatParcelizer;
        ViewGroup MediaBrowserCompat$CustomActionResultReceiver;
        ArrayList<Drawable> MediaBrowserCompat$ItemReceiver = null;
        View read;
        ViewOverlayApi14 write;

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        static {
            try {
                IconCompatParcelizer = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
            super(context);
            this.MediaBrowserCompat$CustomActionResultReceiver = viewGroup;
            this.read = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.write = viewOverlayApi14;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.MediaBrowserCompat$ItemReceiver;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x0010
                boolean r2 = r0.contains(r2)
                if (r2 != 0) goto L_0x0012
            L_0x0010:
                r2 = 0
                goto L_0x0013
            L_0x0012:
                r2 = 1
            L_0x0013:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ViewOverlayApi14.OverlayViewGroup.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }

        public void IconCompatParcelizer(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.MediaBrowserCompat$CustomActionResultReceiver || viewGroup.getParent() == null || !SwitchCompat.setExpandedFormat(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.MediaBrowserCompat$CustomActionResultReceiver.getLocationOnScreen(iArr2);
                    SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(view, iArr[0] - iArr2[0]);
                    SwitchCompat.MediaBrowserCompat$ItemReceiver(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view, getChildCount() - 1);
        }

        public void write(View view) {
            super.removeView(view);
            if (read()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.removeView(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.MediaBrowserCompat$ItemReceiver;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean read() {
            /*
                r1 = this;
                int r0 = r1.getChildCount()
                if (r0 != 0) goto L_0x0012
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.MediaBrowserCompat$ItemReceiver
                if (r0 == 0) goto L_0x0010
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ViewOverlayApi14.OverlayViewGroup.read():boolean");
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.MediaBrowserCompat$CustomActionResultReceiver.getLocationOnScreen(iArr);
            this.read.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.read.getWidth(), this.read.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.MediaBrowserCompat$ItemReceiver;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompat$ItemReceiver.get(i).draw(canvas);
            }
        }

        private void write(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.MediaBrowserCompat$CustomActionResultReceiver.getLocationOnScreen(iArr2);
            this.read.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.MediaBrowserCompat$CustomActionResultReceiver instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                write(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }
    }
}

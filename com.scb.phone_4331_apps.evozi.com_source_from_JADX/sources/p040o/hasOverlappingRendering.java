package p040o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: o.hasOverlappingRendering */
public final class hasOverlappingRendering {
    private static final ThreadLocal<RectF> MediaBrowserCompat$ItemReceiver = new ThreadLocal<>();
    private static final ThreadLocal<Matrix> write = new ThreadLocal<>();

    public static void MediaBrowserCompat$CustomActionResultReceiver(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = write.get();
        if (matrix == null) {
            matrix = new Matrix();
            write.set(matrix);
        } else {
            matrix.reset();
        }
        IconCompatParcelizer(viewGroup, view, matrix);
        RectF rectF = MediaBrowserCompat$ItemReceiver.get();
        if (rectF == null) {
            rectF = new RectF();
            MediaBrowserCompat$ItemReceiver.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    private static void IconCompatParcelizer(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            IconCompatParcelizer(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}

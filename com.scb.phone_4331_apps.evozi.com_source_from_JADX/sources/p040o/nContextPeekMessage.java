package p040o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.nContextPeekMessage */
public abstract class nContextPeekMessage extends nContextGetErrorMessage<View> {
    public int IconCompatParcelizer;
    private Rect MediaBrowserCompat$CustomActionResultReceiver = new Rect();
    private int MediaBrowserCompat$ItemReceiver = 0;
    public final Rect read = new Rect();

    /* access modifiers changed from: protected */
    public abstract View IconCompatParcelizer(List<View> list);

    /* access modifiers changed from: protected */
    public float write(View view) {
        return 1.0f;
    }

    public nContextPeekMessage() {
    }

    public nContextPeekMessage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View IconCompatParcelizer2;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (IconCompatParcelizer2 = IconCompatParcelizer(coordinatorLayout.write(view))) == null) {
            return false;
        }
        if (!SwitchCompat.RatingCompat(IconCompatParcelizer2) || SwitchCompat.RatingCompat(view)) {
            View view2 = view;
        } else {
            View view3 = view;
            SwitchCompat.read(view, true);
            if (SwitchCompat.RatingCompat(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        int measuredHeight = IconCompatParcelizer2.getMeasuredHeight();
        coordinatorLayout.read(view, i, i2, View.MeasureSpec.makeMeasureSpec((size - measuredHeight) + read(IconCompatParcelizer2), i5 == -1 ? 1073741824 : PKIFailureInfo.systemUnavail), i4);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, View view, int i) {
        View IconCompatParcelizer2 = IconCompatParcelizer(coordinatorLayout.write(view));
        if (IconCompatParcelizer2 != null) {
            CoordinatorLayout.read read2 = (CoordinatorLayout.read) view.getLayoutParams();
            Rect rect = this.read;
            int paddingLeft = coordinatorLayout.getPaddingLeft();
            int i2 = read2.leftMargin;
            int bottom = IconCompatParcelizer2.getBottom();
            int i3 = read2.topMargin;
            int width = coordinatorLayout.getWidth();
            int paddingRight = coordinatorLayout.getPaddingRight();
            rect.set(paddingLeft + i2, bottom + i3, (width - paddingRight) - read2.rightMargin, ((coordinatorLayout.getHeight() + IconCompatParcelizer2.getBottom()) - coordinatorLayout.getPaddingBottom()) - read2.bottomMargin);
            setTextOff settextoff = coordinatorLayout.MediaBrowserCompat$ItemReceiver;
            if (settextoff != null && SwitchCompat.RatingCompat(coordinatorLayout) && !SwitchCompat.RatingCompat(view)) {
                rect.left += settextoff.MediaBrowserCompat$CustomActionResultReceiver();
                rect.right -= settextoff.write();
            }
            Rect rect2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i4 = read2.MediaBrowserCompat$CustomActionResultReceiver;
            if (i4 == 0) {
                i4 = 8388659;
            }
            setOnQueryTextListener.MediaBrowserCompat$ItemReceiver(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            view.layout(rect2.left, rect2.top - MediaBrowserCompat$CustomActionResultReceiver2, rect2.right, rect2.bottom - MediaBrowserCompat$CustomActionResultReceiver2);
            this.MediaBrowserCompat$ItemReceiver = rect2.top - IconCompatParcelizer2.getBottom();
            return;
        }
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        View view2 = view;
        super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, view, i);
        this.MediaBrowserCompat$ItemReceiver = 0;
    }

    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$CustomActionResultReceiver(View view) {
        if (this.IconCompatParcelizer == 0) {
            return 0;
        }
        float write = write(view);
        int i = this.IconCompatParcelizer;
        int i2 = (int) (write * ((float) i));
        if (i2 < 0) {
            return 0;
        }
        return i2 > i ? i : i2;
    }

    public int read(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}

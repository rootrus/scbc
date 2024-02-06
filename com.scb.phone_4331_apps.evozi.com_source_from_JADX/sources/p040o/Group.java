package p040o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.Group */
public final class Group extends RecyclerView.RatingCompat {
    private static final int[] write = {16843284};
    private final Rect IconCompatParcelizer = new Rect();
    public Drawable MediaBrowserCompat$CustomActionResultReceiver;
    private int read;

    public Group(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(write);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.read = 1;
    }

    public final void read(Rect rect, View view, RecyclerView recyclerView, RecyclerView.Keep keep) {
        Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.read == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public final void read(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.AppCompatActivity != null && this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            int i5 = 0;
            if (this.read == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i4 = recyclerView.getPaddingLeft();
                    i3 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i4, recyclerView.getPaddingTop(), i3, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i3 = recyclerView.getWidth();
                    i4 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.IconCompatParcelizer(childAt, this.IconCompatParcelizer);
                    int round = this.IconCompatParcelizer.bottom + Math.round(childAt.getTranslationY());
                    this.MediaBrowserCompat$CustomActionResultReceiver.setBounds(i4, round - this.MediaBrowserCompat$CustomActionResultReceiver.getIntrinsicHeight(), i3, round);
                    this.MediaBrowserCompat$CustomActionResultReceiver.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingTop();
                i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
            } else {
                i = recyclerView.getHeight();
                i2 = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(childAt2, this.IconCompatParcelizer);
                int round2 = this.IconCompatParcelizer.right + Math.round(childAt2.getTranslationX());
                this.MediaBrowserCompat$CustomActionResultReceiver.setBounds(round2 - this.MediaBrowserCompat$CustomActionResultReceiver.getIntrinsicWidth(), i2, round2, i);
                this.MediaBrowserCompat$CustomActionResultReceiver.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }
}

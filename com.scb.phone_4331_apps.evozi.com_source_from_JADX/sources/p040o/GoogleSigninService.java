package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;

/* renamed from: o.GoogleSigninService */
public final class GoogleSigninService extends RecyclerView.RatingCompat {
    private Drawable write;

    public final void read(Rect rect, View view, RecyclerView recyclerView, RecyclerView.Keep keep) {
        super.read(rect, view, recyclerView, keep);
        int read = RecyclerView.read(view);
        if (read != -1 && read != 0) {
            Context context = view.getContext();
            if (this.write == null) {
                this.write = ContentFrameLayout.read(context.getResources(), R.drawable.divider_line, (Resources.Theme) null);
            }
            rect.top = this.write.getIntrinsicHeight();
        }
    }

    public final void read(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        Context context = recyclerView.getContext();
        if (this.write == null) {
            this.write = ContentFrameLayout.read(context.getResources(), R.drawable.divider_line, (Resources.Theme) null);
        }
        Drawable drawable = this.write;
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.f72472131165407);
        int width = recyclerView.getWidth();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.MediaDescriptionCompat) childAt.getLayoutParams()).bottomMargin;
            drawable.setBounds(dimensionPixelSize, bottom, width, drawable.getIntrinsicHeight() + bottom);
            drawable.draw(canvas);
        }
        canvas.restore();
    }
}

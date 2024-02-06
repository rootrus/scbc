package p040o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.preauthenticate */
public final class preauthenticate extends RecyclerView.RatingCompat {
    private int IconCompatParcelizer = 0;

    public preauthenticate() {
    }

    public preauthenticate(int i) {
        this.IconCompatParcelizer = i;
    }

    public final void read(Rect rect, View view, RecyclerView recyclerView, RecyclerView.Keep keep) {
        int read = RecyclerView.read(view);
        int IconCompatParcelizer2 = recyclerView.MediaDescriptionCompat.IconCompatParcelizer();
        int i = 0;
        if (IconCompatParcelizer2 == -1 || IconCompatParcelizer2 - 1 != read) {
            if ((recyclerView.MediaDescriptionCompat instanceof TabParser$TabParserException) && ((TabParser$TabParserException) recyclerView.MediaDescriptionCompat).read != null) {
                i = 1;
            }
            if ((i != 0 && read > 1) || (i == 0 && read > 0)) {
                rect.top = this.IconCompatParcelizer;
                return;
            }
            return;
        }
        if (recyclerView.MediaDescriptionCompat instanceof getRecommendedBiller ? ((getRecommendedBiller) recyclerView.MediaDescriptionCompat).MediaBrowserCompat$ItemReceiver() : true) {
            int height = (recyclerView.getHeight() - recyclerView.getPaddingTop()) - recyclerView.getPaddingBottom();
            int min = Math.min(recyclerView.getChildCount(), IconCompatParcelizer2);
            int i2 = 0;
            for (int i3 = 0; i3 < min - 1; i3++) {
                RecyclerView.MediaDescriptionCompat mediaDescriptionCompat = (RecyclerView.MediaDescriptionCompat) recyclerView.getChildAt(i3).getLayoutParams();
                i2 += recyclerView.getChildAt(i3).getHeight() + mediaDescriptionCompat.topMargin + mediaDescriptionCompat.bottomMargin;
            }
            int height2 = view.getHeight();
            if (height2 == 0) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view.getLayoutParams().height));
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                height2 = view.getHeight();
            }
            int paddingBottom = height - (i2 + ((height2 + view.getPaddingBottom()) + view.getPaddingTop()));
            if (paddingBottom >= 0) {
                i = paddingBottom;
            }
            rect.top = i;
        }
    }
}

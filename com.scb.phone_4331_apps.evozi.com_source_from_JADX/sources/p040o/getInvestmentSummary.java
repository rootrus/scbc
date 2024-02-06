package p040o;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o.getInvestmentSummary */
public final class getInvestmentSummary extends RecyclerView.RatingCompat {
    private final int MediaBrowserCompat$ItemReceiver;

    public getInvestmentSummary(Context context, int i) {
        this.MediaBrowserCompat$ItemReceiver = (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public final void read(Rect rect, View view, RecyclerView recyclerView, RecyclerView.Keep keep) {
        if (RecyclerView.read(view) != recyclerView.MediaDescriptionCompat.IconCompatParcelizer() - 1) {
            rect.bottom = this.MediaBrowserCompat$ItemReceiver;
        }
    }
}

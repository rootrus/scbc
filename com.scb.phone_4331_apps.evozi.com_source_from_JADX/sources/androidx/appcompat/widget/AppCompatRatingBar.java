package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p040o.AlertController$RecycleListView;
import p040o.setShowingForActionMode;

public class AppCompatRatingBar extends RatingBar {
    private final setShowingForActionMode IconCompatParcelizer;

    public AppCompatRatingBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setShowingForActionMode setshowingforactionmode = new setShowingForActionMode(this);
        this.IconCompatParcelizer = setshowingforactionmode;
        setshowingforactionmode.IconCompatParcelizer(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i, i2);
            Bitmap IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer();
            if (IconCompatParcelizer2 != null) {
                setMeasuredDimension(View.resolveSizeAndState(IconCompatParcelizer2.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
            }
        }
    }
}

package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Guideline extends View {
    public void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) getLayoutParams();
        constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = i;
        setLayoutParams(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) getLayoutParams();
        constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatDialogFragment = i;
        setLayoutParams(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver constraintLayout$MediaBrowserCompat$CustomActionResultReceiver = (ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) getLayoutParams();
        constraintLayout$MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = f;
        setLayoutParams(constraintLayout$MediaBrowserCompat$CustomActionResultReceiver);
    }
}

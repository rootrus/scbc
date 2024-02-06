package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import p040o.getSupportImageTintList;

public class Placeholder extends View {
    int IconCompatParcelizer = -1;
    int MediaBrowserCompat$ItemReceiver = 4;
    View read = null;

    public Placeholder(Context context) {
        super(context);
        MediaBrowserCompat$CustomActionResultReceiver((AttributeSet) null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MediaBrowserCompat$CustomActionResultReceiver(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MediaBrowserCompat$CustomActionResultReceiver(attributeSet);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(AttributeSet attributeSet) {
        super.setVisibility(this.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_placeholder_content) {
                    this.IconCompatParcelizer = obtainStyledAttributes.getResourceId(index, this.IconCompatParcelizer);
                } else if (index == getSupportImageTintList.IconCompatParcelizer.ConstraintLayout_placeholder_emptyVisibility) {
                    this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInt(index, this.MediaBrowserCompat$ItemReceiver);
                }
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.IconCompatParcelizer != i) {
            View view = this.read;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout$MediaBrowserCompat$CustomActionResultReceiver) this.read.getLayoutParams()).AppCompatViewInflater = false;
                this.read = null;
            }
            this.IconCompatParcelizer = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }
}

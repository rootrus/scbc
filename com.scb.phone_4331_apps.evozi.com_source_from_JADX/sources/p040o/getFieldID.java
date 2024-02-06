package p040o;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.getFieldID */
public abstract class getFieldID extends RecyclerView.RatingCompat {
    public RecyclerView IconCompatParcelizer;
    int MediaBrowserCompat$CustomActionResultReceiver;
    EdgeEffect MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    int read;
    EdgeEffect write;

    /* access modifiers changed from: protected */
    public abstract int write(int i);

    public getFieldID(RecyclerView recyclerView) {
        this.IconCompatParcelizer = recyclerView;
    }

    public final void IconCompatParcelizer(Canvas canvas, RecyclerView recyclerView) {
        EdgeEffect edgeEffect = this.write;
        boolean z = false;
        if (edgeEffect != null) {
            z = false | write(canvas, recyclerView, this.MediaBrowserCompat$CustomActionResultReceiver, edgeEffect);
        }
        EdgeEffect edgeEffect2 = this.MediaBrowserCompat$ItemReceiver;
        if (edgeEffect2 != null) {
            z |= write(canvas, recyclerView, this.read, edgeEffect2);
        }
        if (z) {
            SwitchCompat.setItemInvoker(recyclerView);
        }
    }

    private static boolean write(Canvas canvas, RecyclerView recyclerView, int i, EdgeEffect edgeEffect) {
        boolean z = false;
        if (edgeEffect.isFinished()) {
            return false;
        }
        int save = canvas.save();
        RecyclerView recyclerView2 = recyclerView.AppCompatActivity.setHasDecor;
        if (recyclerView2 != null && recyclerView2.MediaSessionCompat$QueueItem) {
            z = true;
        }
        if (i == 0) {
            canvas.rotate(-90.0f);
            if (z) {
                canvas.translate((float) ((-recyclerView.getHeight()) + recyclerView.getPaddingTop()), (float) recyclerView.getPaddingLeft());
            } else {
                canvas.translate((float) (-recyclerView.getHeight()), BitmapDescriptorFactory.HUE_RED);
            }
        } else if (i != 1) {
            if (i == 2) {
                canvas.rotate(90.0f);
                if (z) {
                    canvas.translate((float) recyclerView.getPaddingTop(), (float) ((-recyclerView.getWidth()) + recyclerView.getPaddingRight()));
                } else {
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (-recyclerView.getWidth()));
                }
            } else if (i == 3) {
                canvas.rotate(180.0f);
                if (z) {
                    canvas.translate((float) ((-recyclerView.getWidth()) + recyclerView.getPaddingRight()), (float) ((-recyclerView.getHeight()) + recyclerView.getPaddingBottom()));
                } else {
                    canvas.translate((float) (-recyclerView.getWidth()), (float) (-recyclerView.getHeight()));
                }
            }
        } else if (z) {
            canvas.translate((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop());
        }
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final void IconCompatParcelizer() {
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = write(0);
            this.read = write(1);
            this.IconCompatParcelizer.IconCompatParcelizer((RecyclerView.RatingCompat) this, -1);
            this.MediaBrowserCompat$SearchResultReceiver = true;
        }
    }

    public final void write() {
        EdgeEffect edgeEffect = this.write;
        boolean z = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = false | this.write.isFinished();
        }
        EdgeEffect edgeEffect2 = this.MediaBrowserCompat$ItemReceiver;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.MediaBrowserCompat$ItemReceiver.isFinished();
        }
        if (z) {
            SwitchCompat.setItemInvoker(this.IconCompatParcelizer);
        }
    }

    static void write(RecyclerView recyclerView, EdgeEffect edgeEffect, int i) {
        int measuredWidth = recyclerView.getMeasuredWidth();
        int measuredHeight = recyclerView.getMeasuredHeight();
        RecyclerView recyclerView2 = recyclerView.AppCompatActivity.setHasDecor;
        if (recyclerView2 != null && recyclerView2.MediaSessionCompat$QueueItem) {
            measuredWidth -= recyclerView.getPaddingLeft() + recyclerView.getPaddingRight();
            measuredHeight -= recyclerView.getPaddingTop() + recyclerView.getPaddingBottom();
        }
        int max = Math.max(0, measuredWidth);
        int max2 = Math.max(0, measuredHeight);
        if (i == 0 || i == 2) {
            int i2 = max2;
            max2 = max;
            max = i2;
        }
        edgeEffect.setSize(max, max2);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            this.IconCompatParcelizer.IconCompatParcelizer((RecyclerView.RatingCompat) this);
            this.IconCompatParcelizer.IconCompatParcelizer((RecyclerView.RatingCompat) this, -1);
        }
    }
}

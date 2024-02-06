package p040o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: o.ActionBarContextView */
public final class ActionBarContextView extends Drawable {
    final ActionBarContainer MediaBrowserCompat$ItemReceiver;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public ActionBarContextView(ActionBarContainer actionBarContainer) {
        this.MediaBrowserCompat$ItemReceiver = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) {
            if (this.MediaBrowserCompat$ItemReceiver.write != null) {
                this.MediaBrowserCompat$ItemReceiver.write.draw(canvas);
            }
            if (this.MediaBrowserCompat$ItemReceiver.read != null && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver.read.draw(canvas);
            }
        } else if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) {
            if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver != null) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.getOutline(outline);
            }
        } else if (this.MediaBrowserCompat$ItemReceiver.write != null) {
            this.MediaBrowserCompat$ItemReceiver.write.getOutline(outline);
        }
    }
}

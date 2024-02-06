package p040o;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: o.DeejungTransferMinFullConfirmationActivity */
public abstract class DeejungTransferMinFullConfirmationActivity implements View.OnTouchListener {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private Drawable read;

    public abstract boolean MediaBrowserCompat$CustomActionResultReceiver();

    public abstract boolean MediaBrowserCompat$ItemReceiver(int i, int i2, View view, Rect rect, int i3);

    DeejungTransferMinFullConfirmationActivity(TextView textView) {
        this(textView, 2);
    }

    private DeejungTransferMinFullConfirmationActivity(TextView textView, int i) {
        this.read = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = 10;
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (compoundDrawables != null && compoundDrawables.length == 4) {
            this.read = compoundDrawables[2];
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || this.read == null) {
            return false;
        }
        if (MediaBrowserCompat$ItemReceiver((int) motionEvent.getX(), (int) motionEvent.getY(), view, this.read.getBounds(), 10)) {
            return MediaBrowserCompat$CustomActionResultReceiver();
        }
        return false;
    }

    /* renamed from: o.DeejungTransferMinFullConfirmationActivity$write */
    public static abstract class write extends DeejungTransferMinFullConfirmationActivity {
        public write(TextView textView) {
            super(textView);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(int i, int i2, View view, Rect rect, int i3) {
            return i >= ((view.getWidth() - view.getPaddingRight()) - rect.width()) - i3 && i <= (view.getWidth() - view.getPaddingRight()) + i3 && i2 >= view.getPaddingTop() - i3 && i2 <= (view.getHeight() - view.getPaddingBottom()) + i3;
        }
    }
}

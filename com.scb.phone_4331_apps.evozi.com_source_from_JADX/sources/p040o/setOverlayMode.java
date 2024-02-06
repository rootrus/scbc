package p040o;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setOverlayMode */
class setOverlayMode extends PopupWindow {
    private static final boolean write = (Build.VERSION.SDK_INT < 21);
    private boolean MediaBrowserCompat$ItemReceiver;

    public setOverlayMode(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        read(context, attributeSet, i, 0);
    }

    public setOverlayMode(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        read(context, attributeSet, i, i2);
    }

    private void read(Context context, AttributeSet attributeSet, int i, int i2) {
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.PopupWindow, i, i2));
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.PopupWindow_overlapAnchor)) {
            write(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getBoolean(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.PopupWindow_android_popupBackground));
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (write && this.MediaBrowserCompat$ItemReceiver) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (write && this.MediaBrowserCompat$ItemReceiver) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (write && this.MediaBrowserCompat$ItemReceiver) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private void write(boolean z) {
        if (write) {
            this.MediaBrowserCompat$ItemReceiver = z;
        } else {
            setCollapsible.MediaBrowserCompat$CustomActionResultReceiver(this, z);
        }
    }
}

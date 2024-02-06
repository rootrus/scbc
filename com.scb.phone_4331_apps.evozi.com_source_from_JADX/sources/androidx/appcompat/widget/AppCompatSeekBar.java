package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p040o.AlertController$RecycleListView;
import p040o.setMenu;

public class AppCompatSeekBar extends SeekBar {
    private final setMenu MediaBrowserCompat$ItemReceiver;

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMenu setmenu = new setMenu(this);
        this.MediaBrowserCompat$ItemReceiver = setmenu;
        setmenu.IconCompatParcelizer(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.MediaBrowserCompat$ItemReceiver.read();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

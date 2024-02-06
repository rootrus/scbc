package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setMenu */
public class setMenu extends setShowingForActionMode {
    private ColorStateList IconCompatParcelizer = null;
    private PorterDuff.Mode MediaBrowserCompat$CustomActionResultReceiver = null;
    private boolean MediaBrowserCompat$ItemReceiver = false;
    private final SeekBar MediaBrowserCompat$MediaItem;
    private boolean read = false;
    private Drawable write;

    public setMenu(SeekBar seekBar) {
        super(seekBar);
        this.MediaBrowserCompat$MediaItem = seekBar;
    }

    public void IconCompatParcelizer(AttributeSet attributeSet, int i) {
        super.IconCompatParcelizer(attributeSet, i);
        Context context = this.MediaBrowserCompat$MediaItem.getContext();
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatSeekBar, i, 0));
        Drawable IconCompatParcelizer2 = mediaDescriptionCompat.IconCompatParcelizer(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatSeekBar_android_thumb);
        if (IconCompatParcelizer2 != null) {
            this.MediaBrowserCompat$MediaItem.setThumb(IconCompatParcelizer2);
        }
        IconCompatParcelizer(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatSeekBar_tickMark));
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatSeekBar_tickMarkTintMode)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setWindowTitle.write(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatSeekBar_tickMarkTintMode, -1), this.MediaBrowserCompat$CustomActionResultReceiver);
            this.read = true;
        }
        if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatSeekBar_tickMarkTint)) {
            this.IconCompatParcelizer = mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatSeekBar_tickMarkTint);
            this.MediaBrowserCompat$ItemReceiver = true;
        }
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer(Drawable drawable) {
        Drawable drawable2 = this.write;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.write = drawable;
        if (drawable != null) {
            drawable.setCallback(this.MediaBrowserCompat$MediaItem);
            setBaselineAligned.read(drawable, SwitchCompat.m3079x50fd9e4a(this.MediaBrowserCompat$MediaItem));
            if (drawable.isStateful()) {
                drawable.setState(this.MediaBrowserCompat$MediaItem.getDrawableState());
            }
            MediaBrowserCompat$ItemReceiver();
        }
        this.MediaBrowserCompat$MediaItem.invalidate();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (this.write == null) {
            return;
        }
        if (this.MediaBrowserCompat$ItemReceiver || this.read) {
            Drawable MediaBrowserCompat$MediaItem2 = setBaselineAligned.MediaBrowserCompat$MediaItem(this.write.mutate());
            this.write = MediaBrowserCompat$MediaItem2;
            if (this.MediaBrowserCompat$ItemReceiver) {
                setBaselineAligned.read(MediaBrowserCompat$MediaItem2, this.IconCompatParcelizer);
            }
            if (this.read) {
                setBaselineAligned.IconCompatParcelizer(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (this.write.isStateful()) {
                this.write.setState(this.MediaBrowserCompat$MediaItem.getDrawableState());
            }
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        Drawable drawable = this.write;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void read() {
        Drawable drawable = this.write;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.MediaBrowserCompat$MediaItem.getDrawableState())) {
            this.MediaBrowserCompat$MediaItem.invalidateDrawable(drawable);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(Canvas canvas) {
        if (this.write != null) {
            int max = this.MediaBrowserCompat$MediaItem.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.write.getIntrinsicWidth();
                int intrinsicHeight = this.write.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.write.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.MediaBrowserCompat$MediaItem.getWidth() - this.MediaBrowserCompat$MediaItem.getPaddingLeft()) - this.MediaBrowserCompat$MediaItem.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.MediaBrowserCompat$MediaItem.getPaddingLeft(), (float) (this.MediaBrowserCompat$MediaItem.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.write.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}

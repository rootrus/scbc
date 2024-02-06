package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setHideOnContentScrollEnabled */
public class setHideOnContentScrollEnabled {
    private AlertController$RecycleListView.write IconCompatParcelizer;
    private final ImageView MediaBrowserCompat$CustomActionResultReceiver;
    private AlertController$RecycleListView.write read;
    private AlertController$RecycleListView.write write;

    public setHideOnContentScrollEnabled(ImageView imageView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = imageView;
    }

    public void MediaBrowserCompat$ItemReceiver(AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.MediaBrowserCompat$CustomActionResultReceiver.getContext();
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatImageView, i, 0));
        try {
            Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver.getDrawable();
            if (!(drawable != null || (resourceId = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getContext(), resourceId)) == null)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setImageDrawable(drawable);
            }
            if (drawable != null) {
                setWindowTitle.write(drawable);
            }
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatImageView_tint)) {
                setContentInsetStartWithNavigation.read(this.MediaBrowserCompat$CustomActionResultReceiver, mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatImageView_tint));
            }
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatImageView_tintMode)) {
                setContentInsetStartWithNavigation.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, setWindowTitle.write(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        }
    }

    public void IconCompatParcelizer(int i) {
        if (i != 0) {
            Drawable MediaBrowserCompat$ItemReceiver = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getContext(), i);
            if (MediaBrowserCompat$ItemReceiver != null) {
                setWindowTitle.write(MediaBrowserCompat$ItemReceiver);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setImageDrawable(MediaBrowserCompat$ItemReceiver);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.setImageDrawable((Drawable) null);
        }
        MediaBrowserCompat$ItemReceiver();
    }

    public boolean write() {
        return Build.VERSION.SDK_INT < 21 || !(this.MediaBrowserCompat$CustomActionResultReceiver.getBackground() instanceof RippleDrawable);
    }

    public void MediaBrowserCompat$ItemReceiver(ColorStateList colorStateList) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new AlertController$RecycleListView.write();
        }
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = colorStateList;
        this.IconCompatParcelizer.read = true;
        MediaBrowserCompat$ItemReceiver();
    }

    public ColorStateList IconCompatParcelizer() {
        AlertController$RecycleListView.write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            return write2.MediaBrowserCompat$ItemReceiver;
        }
        return null;
    }

    public void read(PorterDuff.Mode mode) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new AlertController$RecycleListView.write();
        }
        this.IconCompatParcelizer.IconCompatParcelizer = mode;
        this.IconCompatParcelizer.write = true;
        MediaBrowserCompat$ItemReceiver();
    }

    public PorterDuff.Mode read() {
        AlertController$RecycleListView.write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            return write2.IconCompatParcelizer;
        }
        return null;
    }

    public void MediaBrowserCompat$ItemReceiver() {
        Drawable drawable = this.MediaBrowserCompat$CustomActionResultReceiver.getDrawable();
        if (drawable != null) {
            setWindowTitle.write(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!MediaBrowserCompat$CustomActionResultReceiver() || !IconCompatParcelizer(drawable)) {
            AlertController$RecycleListView.write write2 = this.IconCompatParcelizer;
            if (write2 != null) {
                ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(drawable, write2, this.MediaBrowserCompat$CustomActionResultReceiver.getDrawableState());
                return;
            }
            AlertController$RecycleListView.write write3 = this.read;
            if (write3 != null) {
                ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(drawable, write3, this.MediaBrowserCompat$CustomActionResultReceiver.getDrawableState());
            }
        }
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.read == null) {
            return false;
        }
        return true;
    }

    private boolean IconCompatParcelizer(Drawable drawable) {
        if (this.write == null) {
            this.write = new AlertController$RecycleListView.write();
        }
        AlertController$RecycleListView.write write2 = this.write;
        write2.MediaBrowserCompat$ItemReceiver = null;
        write2.read = false;
        write2.IconCompatParcelizer = null;
        write2.write = false;
        ColorStateList MediaBrowserCompat$ItemReceiver = setContentInsetStartWithNavigation.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (MediaBrowserCompat$ItemReceiver != null) {
            write2.read = true;
            write2.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver;
        }
        PorterDuff.Mode IconCompatParcelizer2 = setContentInsetStartWithNavigation.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (IconCompatParcelizer2 != null) {
            write2.write = true;
            write2.IconCompatParcelizer = IconCompatParcelizer2;
        }
        if (!write2.read && !write2.write) {
            return false;
        }
        ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(drawable, write2, this.MediaBrowserCompat$CustomActionResultReceiver.getDrawableState());
        return true;
    }
}

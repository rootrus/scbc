package p040o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setActionBarHideOffset */
public class setActionBarHideOffset {
    private int IconCompatParcelizer = -1;
    private final ActionBarOverlayLayout MediaBrowserCompat$CustomActionResultReceiver;
    private AlertController$RecycleListView.write MediaBrowserCompat$ItemReceiver;
    private final View MediaDescriptionCompat;
    private AlertController$RecycleListView.write read;
    private AlertController$RecycleListView.write write;

    public setActionBarHideOffset(View view) {
        this.MediaDescriptionCompat = view;
        this.MediaBrowserCompat$CustomActionResultReceiver = ActionBarOverlayLayout.IconCompatParcelizer();
    }

    public void IconCompatParcelizer(AttributeSet attributeSet, int i) {
        Context context = this.MediaDescriptionCompat.getContext();
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewBackgroundHelper, i, 0));
        try {
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewBackgroundHelper_android_background)) {
                this.IconCompatParcelizer = mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewBackgroundHelper_android_background, -1);
                ColorStateList write2 = this.MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaDescriptionCompat.getContext(), this.IconCompatParcelizer);
                if (write2 != null) {
                    IconCompatParcelizer(write2);
                }
            }
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewBackgroundHelper_backgroundTint)) {
                SwitchCompat.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat, mediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewBackgroundHelper_backgroundTint));
            }
            if (mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.hasValue(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewBackgroundHelper_backgroundTintMode)) {
                SwitchCompat.write(this.MediaDescriptionCompat, setWindowTitle.write(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getInt(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
        }
    }

    public void read(int i) {
        this.IconCompatParcelizer = i;
        ActionBarOverlayLayout actionBarOverlayLayout = this.MediaBrowserCompat$CustomActionResultReceiver;
        IconCompatParcelizer(actionBarOverlayLayout != null ? actionBarOverlayLayout.write(this.MediaDescriptionCompat.getContext(), i) : null);
        write();
    }

    public void MediaBrowserCompat$ItemReceiver(Drawable drawable) {
        this.IconCompatParcelizer = -1;
        IconCompatParcelizer((ColorStateList) null);
        write();
    }

    public void read(ColorStateList colorStateList) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = new AlertController$RecycleListView.write();
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = colorStateList;
        this.MediaBrowserCompat$ItemReceiver.read = true;
        write();
    }

    public ColorStateList MediaBrowserCompat$ItemReceiver() {
        AlertController$RecycleListView.write write2 = this.MediaBrowserCompat$ItemReceiver;
        if (write2 != null) {
            return write2.MediaBrowserCompat$ItemReceiver;
        }
        return null;
    }

    public void IconCompatParcelizer(PorterDuff.Mode mode) {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = new AlertController$RecycleListView.write();
        }
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = mode;
        this.MediaBrowserCompat$ItemReceiver.write = true;
        write();
    }

    public PorterDuff.Mode MediaBrowserCompat$CustomActionResultReceiver() {
        AlertController$RecycleListView.write write2 = this.MediaBrowserCompat$ItemReceiver;
        if (write2 != null) {
            return write2.IconCompatParcelizer;
        }
        return null;
    }

    public void write() {
        Drawable background = this.MediaDescriptionCompat.getBackground();
        if (background == null) {
            return;
        }
        if (!read() || !read(background)) {
            AlertController$RecycleListView.write write2 = this.MediaBrowserCompat$ItemReceiver;
            if (write2 != null) {
                ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(background, write2, this.MediaDescriptionCompat.getDrawableState());
                return;
            }
            AlertController$RecycleListView.write write3 = this.write;
            if (write3 != null) {
                ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(background, write3, this.MediaDescriptionCompat.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void IconCompatParcelizer(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.write == null) {
                this.write = new AlertController$RecycleListView.write();
            }
            this.write.MediaBrowserCompat$ItemReceiver = colorStateList;
            this.write.read = true;
        } else {
            this.write = null;
        }
        write();
    }

    private boolean read() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.write == null) {
            return false;
        }
        return true;
    }

    private boolean read(Drawable drawable) {
        if (this.read == null) {
            this.read = new AlertController$RecycleListView.write();
        }
        AlertController$RecycleListView.write write2 = this.read;
        write2.MediaBrowserCompat$ItemReceiver = null;
        write2.read = false;
        write2.IconCompatParcelizer = null;
        write2.write = false;
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2 = SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            write2.read = true;
            write2.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
        }
        PorterDuff.Mode MediaBrowserCompat$ItemReceiver2 = SwitchCompat.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            write2.write = true;
            write2.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
        }
        if (!write2.read && !write2.write) {
            return false;
        }
        ActionBarOverlayLayout.MediaBrowserCompat$ItemReceiver(drawable, write2, this.MediaDescriptionCompat.getDrawableState());
        return true;
    }
}

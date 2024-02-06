package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p040o.AlertController$RecycleListView;
import p040o.setActionBarHideOffset;
import p040o.setContentInsetsRelative;
import p040o.setHideOnContentScrollEnabled;
import p040o.setPresenter;
import p040o.setShowText;

public class AppCompatImageButton extends ImageButton implements setShowText, setContentInsetsRelative {
    private final setHideOnContentScrollEnabled MediaBrowserCompat$CustomActionResultReceiver;
    private final setActionBarHideOffset read;

    public AppCompatImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setActionBarHideOffset setactionbarhideoffset = new setActionBarHideOffset(this);
        this.read = setactionbarhideoffset;
        setactionbarhideoffset.IconCompatParcelizer(attributeSet, i);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = new setHideOnContentScrollEnabled(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = sethideoncontentscrollenabled;
        sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver(attributeSet, i);
    }

    public void setImageResource(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(i);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.MediaBrowserCompat$ItemReceiver(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$ItemReceiver();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.IconCompatParcelizer(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            return sethideoncontentscrollenabled.IconCompatParcelizer();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.read(mode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            return sethideoncontentscrollenabled.read();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.write();
        }
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.write() && super.hasOverlappingRendering();
    }
}

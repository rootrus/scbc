package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p040o.setActionBarHideOffset;
import p040o.setContentInsetsRelative;
import p040o.setHideOnContentScrollEnabled;
import p040o.setPresenter;
import p040o.setShowText;

public class AppCompatImageView extends ImageView implements setShowText, setContentInsetsRelative {
    private final setActionBarHideOffset mBackgroundTintHelper;
    private final setHideOnContentScrollEnabled mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setActionBarHideOffset setactionbarhideoffset = new setActionBarHideOffset(this);
        this.mBackgroundTintHelper = setactionbarhideoffset;
        setactionbarhideoffset.IconCompatParcelizer(attributeSet, i);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = new setHideOnContentScrollEnabled(this);
        this.mImageHelper = sethideoncontentscrollenabled;
        sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver(attributeSet, i);
    }

    public void setImageResource(int i) {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.IconCompatParcelizer(i);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setActionBarHideOffset setactionbarhideoffset = this.mBackgroundTintHelper;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setActionBarHideOffset setactionbarhideoffset = this.mBackgroundTintHelper;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.MediaBrowserCompat$ItemReceiver(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setActionBarHideOffset setactionbarhideoffset = this.mBackgroundTintHelper;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        setActionBarHideOffset setactionbarhideoffset = this.mBackgroundTintHelper;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$ItemReceiver();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setActionBarHideOffset setactionbarhideoffset = this.mBackgroundTintHelper;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.IconCompatParcelizer(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        setActionBarHideOffset setactionbarhideoffset = this.mBackgroundTintHelper;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver(colorStateList);
        }
    }

    public ColorStateList getSupportImageTintList() {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            return sethideoncontentscrollenabled.IconCompatParcelizer();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.read(mode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            return sethideoncontentscrollenabled.read();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setActionBarHideOffset setactionbarhideoffset = this.mBackgroundTintHelper;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.write();
        }
        setHideOnContentScrollEnabled sethideoncontentscrollenabled = this.mImageHelper;
        if (sethideoncontentscrollenabled != null) {
            sethideoncontentscrollenabled.MediaBrowserCompat$ItemReceiver();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.mImageHelper.write() && super.hasOverlappingRendering();
    }
}

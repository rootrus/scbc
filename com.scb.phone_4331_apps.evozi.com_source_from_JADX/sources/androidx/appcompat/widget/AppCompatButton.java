package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import p040o.AlertController$RecycleListView;
import p040o.setActionBarHideOffset;
import p040o.setLogo;
import p040o.setNavigationContentDescription;
import p040o.setPresenter;
import p040o.setShowText;
import p040o.setTrackTintList;

public class AppCompatButton extends Button implements setShowText, setTrackTintList {
    private final setActionBarHideOffset IconCompatParcelizer;
    private final setLogo read;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setActionBarHideOffset setactionbarhideoffset = new setActionBarHideOffset(this);
        this.IconCompatParcelizer = setactionbarhideoffset;
        setactionbarhideoffset.IconCompatParcelizer(attributeSet, i);
        setLogo setlogo = new setLogo(this);
        this.read = setlogo;
        setlogo.read(attributeSet, i);
        this.read.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setActionBarHideOffset setactionbarhideoffset = this.IconCompatParcelizer;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setActionBarHideOffset setactionbarhideoffset = this.IconCompatParcelizer;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.MediaBrowserCompat$ItemReceiver(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setActionBarHideOffset setactionbarhideoffset = this.IconCompatParcelizer;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        setActionBarHideOffset setactionbarhideoffset = this.IconCompatParcelizer;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$ItemReceiver();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setActionBarHideOffset setactionbarhideoffset = this.IconCompatParcelizer;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.IconCompatParcelizer(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        setActionBarHideOffset setactionbarhideoffset = this.IconCompatParcelizer;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setActionBarHideOffset setactionbarhideoffset = this.IconCompatParcelizer;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.write();
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.IconCompatParcelizer(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$CustomActionResultReceiver(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (write) {
            super.setTextSize(i, f);
            return;
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.write(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.read != null && !write && this.read.MediaBrowserCompat$SearchResultReceiver()) {
            this.read.read();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (write) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.read(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (write) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (write) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.IconCompatParcelizer(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!write) {
            setLogo setlogo = this.read;
            if (setlogo != null) {
                return setlogo.RatingCompat();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (write) {
            return super.getAutoSizeStepGranularity();
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            return setlogo.write();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (write) {
            return super.getAutoSizeMinTextSize();
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            return setlogo.IconCompatParcelizer();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (write) {
            return super.getAutoSizeMaxTextSize();
        }
        setLogo setlogo = this.read;
        if (setlogo != null) {
            return setlogo.MediaBrowserCompat$ItemReceiver();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (write) {
            return super.getAutoSizeTextAvailableSizes();
        }
        setLogo setlogo = this.read;
        return setlogo != null ? setlogo.MediaDescriptionCompat() : new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        setLogo setlogo = this.read;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$ItemReceiver(z);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setNavigationContentDescription.read((TextView) this, callback));
    }
}

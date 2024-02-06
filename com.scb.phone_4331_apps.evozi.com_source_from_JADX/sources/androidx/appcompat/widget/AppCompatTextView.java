package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p040o.setActionBarHideOffset;
import p040o.setActionBarVisibilityCallback;
import p040o.setHoverListener;
import p040o.setHoverListener$MediaBrowserCompat$ItemReceiver;
import p040o.setLogo;
import p040o.setNavigationContentDescription;
import p040o.setPresenter;
import p040o.setShowText;
import p040o.setTrackTintList;

public class AppCompatTextView extends TextView implements setShowText, setTrackTintList {
    private Future<setHoverListener> IconCompatParcelizer;
    private final setLogo MediaBrowserCompat$CustomActionResultReceiver;
    private final setActionBarHideOffset read;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setActionBarHideOffset setactionbarhideoffset = new setActionBarHideOffset(this);
        this.read = setactionbarhideoffset;
        setactionbarhideoffset.IconCompatParcelizer(attributeSet, i);
        setLogo setlogo = new setLogo(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = setlogo;
        setlogo.read(attributeSet, i);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
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

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            setlogo.IconCompatParcelizer(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setActionBarHideOffset setactionbarhideoffset = this.read;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.write();
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$CustomActionResultReceiver(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (write) {
            super.setTextSize(i, f);
            return;
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            setlogo.write(i, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null && !write && this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.read();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (write) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            setlogo.read(i);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (write) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (write) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            setlogo.IconCompatParcelizer(iArr, i);
        }
    }

    public int getAutoSizeTextType() {
        if (!write) {
            setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            return setlogo.write();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (write) {
            return super.getAutoSizeMinTextSize();
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            return setlogo.IconCompatParcelizer();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (write) {
            return super.getAutoSizeMaxTextSize();
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setlogo != null) {
            return setlogo.MediaBrowserCompat$ItemReceiver();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (write) {
            return super.getAutoSizeTextAvailableSizes();
        }
        setLogo setlogo = this.MediaBrowserCompat$CustomActionResultReceiver;
        return setlogo != null ? setlogo.MediaDescriptionCompat() : new int[0];
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return setActionBarVisibilityCallback.MediaBrowserCompat$CustomActionResultReceiver(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            setNavigationContentDescription.IconCompatParcelizer(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            setNavigationContentDescription.write(this, i);
        }
    }

    public int getFirstBaselineToTopHeight() {
        return setNavigationContentDescription.write(this);
    }

    public int getLastBaselineToBottomHeight() {
        return setNavigationContentDescription.MediaBrowserCompat$ItemReceiver(this);
    }

    public void setLineHeight(int i) {
        setNavigationContentDescription.MediaBrowserCompat$ItemReceiver((TextView) this, i);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setNavigationContentDescription.read((TextView) this, callback));
    }

    public void setTextMetricsParamsCompat(setHoverListener$MediaBrowserCompat$ItemReceiver sethoverlistener_mediabrowsercompat_itemreceiver) {
        setNavigationContentDescription.read((TextView) this, sethoverlistener_mediabrowsercompat_itemreceiver);
    }

    public void setPrecomputedText(setHoverListener sethoverlistener) {
        setNavigationContentDescription.MediaBrowserCompat$ItemReceiver((TextView) this, sethoverlistener);
    }

    private void read() {
        Future<setHoverListener> future = this.IconCompatParcelizer;
        if (future != null) {
            try {
                this.IconCompatParcelizer = null;
                setNavigationContentDescription.MediaBrowserCompat$ItemReceiver((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public CharSequence getText() {
        read();
        return super.getText();
    }

    public void setTextFuture(Future<setHoverListener> future) {
        this.IconCompatParcelizer = future;
        requestLayout();
    }

    public void onMeasure(int i, int i2) {
        read();
        super.onMeasure(i, i2);
    }
}

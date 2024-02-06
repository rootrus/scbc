package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import p040o.AlertController$RecycleListView;
import p040o.setActionBarHideOffset;
import p040o.setActionBarVisibilityCallback;
import p040o.setLogo;
import p040o.setNavigationContentDescription;
import p040o.setPresenter;
import p040o.setShowText;

public class AppCompatEditText extends EditText implements setShowText {
    private final setActionBarHideOffset MediaBrowserCompat$ItemReceiver;
    private final setLogo read;

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setActionBarHideOffset setactionbarhideoffset = new setActionBarHideOffset(this);
        this.MediaBrowserCompat$ItemReceiver = setactionbarhideoffset;
        setactionbarhideoffset.IconCompatParcelizer(attributeSet, i);
        setLogo setlogo = new setLogo(this);
        this.read = setlogo;
        setlogo.read(attributeSet, i);
        this.read.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setActionBarHideOffset setactionbarhideoffset = this.MediaBrowserCompat$ItemReceiver;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setActionBarHideOffset setactionbarhideoffset = this.MediaBrowserCompat$ItemReceiver;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.MediaBrowserCompat$ItemReceiver(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setActionBarHideOffset setactionbarhideoffset = this.MediaBrowserCompat$ItemReceiver;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.read(colorStateList);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        setActionBarHideOffset setactionbarhideoffset = this.MediaBrowserCompat$ItemReceiver;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$ItemReceiver();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setActionBarHideOffset setactionbarhideoffset = this.MediaBrowserCompat$ItemReceiver;
        if (setactionbarhideoffset != null) {
            setactionbarhideoffset.IconCompatParcelizer(mode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        setActionBarHideOffset setactionbarhideoffset = this.MediaBrowserCompat$ItemReceiver;
        if (setactionbarhideoffset != null) {
            return setactionbarhideoffset.MediaBrowserCompat$CustomActionResultReceiver();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setActionBarHideOffset setactionbarhideoffset = this.MediaBrowserCompat$ItemReceiver;
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return setActionBarVisibilityCallback.MediaBrowserCompat$CustomActionResultReceiver(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setNavigationContentDescription.read((TextView) this, callback));
    }
}

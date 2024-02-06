package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.setHasNonEmbeddedTabs;
import p040o.setLogo;
import p040o.setNavigationOnClickListener;
import p040o.setPresenter;

public class AppCompatCheckBox extends CheckBox implements setNavigationOnClickListener {
    private final setHasNonEmbeddedTabs read;
    private final setLogo write;

    public AppCompatCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setHasNonEmbeddedTabs sethasnonembeddedtabs = new setHasNonEmbeddedTabs(this);
        this.read = sethasnonembeddedtabs;
        sethasnonembeddedtabs.read(attributeSet, i);
        setLogo setlogo = new setLogo(this);
        this.write = setlogo;
        setlogo.read(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.read;
        if (sethasnonembeddedtabs != null) {
            sethasnonembeddedtabs.write();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.read;
        return sethasnonembeddedtabs != null ? sethasnonembeddedtabs.IconCompatParcelizer(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.read;
        if (sethasnonembeddedtabs != null) {
            sethasnonembeddedtabs.MediaBrowserCompat$ItemReceiver(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.read;
        if (sethasnonembeddedtabs != null) {
            sethasnonembeddedtabs.read(mode);
        }
    }
}

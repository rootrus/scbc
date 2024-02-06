package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.setHasNonEmbeddedTabs;
import p040o.setLogo;
import p040o.setNavigationOnClickListener;
import p040o.setPresenter;

public class AppCompatRadioButton extends RadioButton implements setNavigationOnClickListener {
    private final setLogo MediaBrowserCompat$ItemReceiver;
    private final setHasNonEmbeddedTabs write;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AlertController$RecycleListView.read.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setHasNonEmbeddedTabs sethasnonembeddedtabs = new setHasNonEmbeddedTabs(this);
        this.write = sethasnonembeddedtabs;
        sethasnonembeddedtabs.read(attributeSet, i);
        setLogo setlogo = new setLogo(this);
        this.MediaBrowserCompat$ItemReceiver = setlogo;
        setlogo.read(attributeSet, i);
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.write;
        if (sethasnonembeddedtabs != null) {
            sethasnonembeddedtabs.write();
        }
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.write;
        return sethasnonembeddedtabs != null ? sethasnonembeddedtabs.IconCompatParcelizer(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.write;
        if (sethasnonembeddedtabs != null) {
            sethasnonembeddedtabs.MediaBrowserCompat$ItemReceiver(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        setHasNonEmbeddedTabs sethasnonembeddedtabs = this.write;
        if (sethasnonembeddedtabs != null) {
            sethasnonembeddedtabs.read(mode);
        }
    }
}

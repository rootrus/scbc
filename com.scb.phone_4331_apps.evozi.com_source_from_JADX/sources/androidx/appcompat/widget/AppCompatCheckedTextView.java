package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import p040o.AlertController$RecycleListView;
import p040o.AppCompatDelegateImpl$ListMenuDecorView;
import p040o.setActionBarVisibilityCallback;
import p040o.setLogo;
import p040o.setNavigationContentDescription;
import p040o.setPresenter;

public class AppCompatCheckedTextView extends CheckedTextView {
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {16843016};
    private final setLogo IconCompatParcelizer;

    public AppCompatCheckedTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(setPresenter.write(context), attributeSet, i);
        setLogo setlogo = new setLogo(this);
        this.IconCompatParcelizer = setlogo;
        setlogo.read(attributeSet, i);
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        Context context2 = getContext();
        AlertController$RecycleListView.MediaDescriptionCompat mediaDescriptionCompat = new AlertController$RecycleListView.MediaDescriptionCompat(context2, context2.obtainStyledAttributes(attributeSet, MediaBrowserCompat$CustomActionResultReceiver, i, 0));
        setCheckMarkDrawable(mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(0));
        mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.recycle();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        setLogo setlogo = this.IconCompatParcelizer;
        if (setlogo != null) {
            setlogo.IconCompatParcelizer(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setLogo setlogo = this.IconCompatParcelizer;
        if (setlogo != null) {
            setlogo.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return setActionBarVisibilityCallback.MediaBrowserCompat$CustomActionResultReceiver(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(setNavigationContentDescription.read((TextView) this, callback));
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p040o.ActionMenuView;
import p040o.ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver;

public class FitWindowsFrameLayout extends FrameLayout implements ActionMenuView {
    private ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver write;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver actionMenuView$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = actionMenuView$MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver actionMenuView$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        if (actionMenuView$MediaBrowserCompat$CustomActionResultReceiver != null) {
            actionMenuView$MediaBrowserCompat$CustomActionResultReceiver.write(rect);
        }
        return super.fitSystemWindows(rect);
    }
}

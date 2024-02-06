package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p040o.ActionMenuView;
import p040o.ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver;

public class FitWindowsLinearLayout extends LinearLayout implements ActionMenuView {
    private ActionMenuView$MediaBrowserCompat$CustomActionResultReceiver write;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
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

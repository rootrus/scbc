package p040o;

import android.view.ViewParent;

/* renamed from: o.ActionMenuPresenter$OverflowMenuButton$MediaBrowserCompat$ItemReceiver */
class C1128x60ac3840 implements Runnable {
    final /* synthetic */ ActionMenuPresenter$OverflowMenuButton IconCompatParcelizer;

    C1128x60ac3840(ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton) {
        this.IconCompatParcelizer = actionMenuPresenter$OverflowMenuButton;
    }

    public final void run() {
        ViewParent parent = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}

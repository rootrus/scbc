package androidx.appcompat.widget;

import androidx.appcompat.view.menu.ActionMenuItemView$MediaBrowserCompat$ItemReceiver;
import p040o.CheckCaptureModule;

/* renamed from: androidx.appcompat.widget.ActionMenuPresenter$MediaBrowserCompat$CustomActionResultReceiver */
class C0021xd87b00a0 extends ActionMenuItemView$MediaBrowserCompat$ItemReceiver {
    final /* synthetic */ ActionMenuPresenter MediaBrowserCompat$ItemReceiver;

    C0021xd87b00a0(ActionMenuPresenter actionMenuPresenter) {
        this.MediaBrowserCompat$ItemReceiver = actionMenuPresenter;
    }

    public final CheckCaptureModule.C6375a read() {
        if (this.MediaBrowserCompat$ItemReceiver.read == null) {
            return null;
        }
        ActionMenuPresenter$MediaBrowserCompat$ItemReceiver actionMenuPresenter$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver.read;
        if (actionMenuPresenter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver == null) {
            actionMenuPresenter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = actionMenuPresenter$MediaBrowserCompat$ItemReceiver.write();
        }
        return actionMenuPresenter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
    }
}

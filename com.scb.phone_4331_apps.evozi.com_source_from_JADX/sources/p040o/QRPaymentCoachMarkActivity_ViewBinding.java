package p040o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.QRPaymentCoachMarkActivity_ViewBinding */
public final class QRPaymentCoachMarkActivity_ViewBinding extends onSaveClick implements Window.Callback {
    private final Window.Callback read;

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
    }

    private QRPaymentCoachMarkActivity_ViewBinding(Window.Callback callback, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.read = callback;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.read.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.read.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.read.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.read.dispatchTrackballEvent(motionEvent);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.read.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.read.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final View onCreatePanelView(int i) {
        return this.read.onCreatePanelView(i);
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.read.onCreatePanelMenu(i, menu);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.read.onPreparePanel(i, view, menu);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        return this.read.onMenuOpened(i, menu);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, menuItem.getItemId());
        return this.read.onMenuItemSelected(i, menuItem);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.read.onWindowAttributesChanged(layoutParams);
    }

    public final void onContentChanged() {
        this.read.onContentChanged();
    }

    public final void onWindowFocusChanged(boolean z) {
        this.read.onWindowFocusChanged(z);
    }

    public final void onAttachedToWindow() {
        this.read.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        this.read.onDetachedFromWindow();
    }

    public final void onPanelClosed(int i, Menu menu) {
        this.read.onPanelClosed(i, menu);
    }

    public final boolean onSearchRequested() {
        return this.read.onSearchRequested();
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.read.onSearchRequested(searchEvent);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.read.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.read.onWindowStartingActionMode(callback, i);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.read.onActionModeStarted(actionMode);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.read.onActionModeFinished(actionMode);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity, int i) {
        if (deejungTransferLandingActivity.IconCompatParcelizer.getClass().getSimpleName().equals("ActionMenuItemView")) {
            if (deejungTransferLandingActivity.IconCompatParcelizer.getId() == i && deejungTransferLandingActivity.MediaSessionCompat$Token) {
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                StringBuilder sb = new StringBuilder();
                sb.append("OnMenuItemClick path ");
                sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity);
                return;
            }
        }
        if (deejungTransferLandingActivity.read.size() != 0) {
            for (int i2 = 0; i2 < deejungTransferLandingActivity.read.size(); i2++) {
                MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity.read.get(i2), i);
            }
        }
    }

    static boolean write(DeejungTransferLandingActivity deejungTransferLandingActivity, Window window) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null || !(callback instanceof QRPaymentCoachMarkActivity_ViewBinding)) {
            QRPaymentCoachMarkActivity_ViewBinding qRPaymentCoachMarkActivity_ViewBinding = new QRPaymentCoachMarkActivity_ViewBinding(callback, deejungTransferLandingActivity);
            window.setCallback(qRPaymentCoachMarkActivity_ViewBinding);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, qRPaymentCoachMarkActivity_ViewBinding);
            return true;
        }
        ((QRPaymentCoachMarkActivity_ViewBinding) callback).read(deejungTransferLandingActivity);
        return false;
    }
}

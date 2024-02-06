package p040o;

import android.database.CrossProcessCursor;
import android.database.CursorWindow;

/* renamed from: o.TouchPointWebViewActivity_ViewBinding */
public final class TouchPointWebViewActivity_ViewBinding extends TouchPointWebViewActivity implements CrossProcessCursor {
    public final CursorWindow getWindow() {
        return null;
    }

    public final boolean onMove(int i, int i2) {
        return true;
    }

    public TouchPointWebViewActivity_ViewBinding(TouchPointTermsAndConditionsActivity touchPointTermsAndConditionsActivity) {
        super(touchPointTermsAndConditionsActivity);
    }

    public final void fillWindow(int i, CursorWindow cursorWindow) {
        AbstractPartnerLoginActivity.MediaBrowserCompat$ItemReceiver((TouchPointTermsAndConditionsActivity) this, i, cursorWindow);
    }
}

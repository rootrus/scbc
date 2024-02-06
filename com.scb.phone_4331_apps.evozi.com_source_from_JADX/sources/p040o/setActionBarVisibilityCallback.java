package p040o;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: o.setActionBarVisibilityCallback */
public class setActionBarVisibilityCallback {
    public static InputConnection MediaBrowserCompat$CustomActionResultReceiver(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof setInitialActivityCount) {
                    editorInfo.hintText = ((setInitialActivityCount) parent).IconCompatParcelizer();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}

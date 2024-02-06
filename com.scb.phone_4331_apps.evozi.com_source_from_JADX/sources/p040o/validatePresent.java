package p040o;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.UnitsEditText;

/* renamed from: o.validatePresent */
public final /* synthetic */ class validatePresent implements TextView.OnEditorActionListener {
    private final /* synthetic */ UnitsEditText MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ validatePresent(UnitsEditText unitsEditText) {
        this.MediaBrowserCompat$CustomActionResultReceiver = unitsEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        UnitsEditText unitsEditText = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i != 6) {
            return false;
        }
        UnitsEditText.IconCompatParcelizer iconCompatParcelizer = unitsEditText.write;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        }
        unitsEditText.clearFocus();
        if (TextUtils.isEmpty(unitsEditText.getText())) {
            return true;
        }
        unitsEditText.setFormattedUnit(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(unitsEditText.IconCompatParcelizer));
        return true;
    }
}

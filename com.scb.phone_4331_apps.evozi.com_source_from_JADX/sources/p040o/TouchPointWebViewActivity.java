package p040o;

import android.database.CursorWrapper;

/* renamed from: o.TouchPointWebViewActivity */
public class TouchPointWebViewActivity extends CursorWrapper implements TouchPointTermsAndConditionsActivity {
    private final TouchPointTermsAndConditionsActivity IconCompatParcelizer;

    public TouchPointWebViewActivity(TouchPointTermsAndConditionsActivity touchPointTermsAndConditionsActivity) {
        super(touchPointTermsAndConditionsActivity);
        this.IconCompatParcelizer = touchPointTermsAndConditionsActivity;
    }

    public int getType(int i) {
        return this.IconCompatParcelizer.getType(i);
    }
}

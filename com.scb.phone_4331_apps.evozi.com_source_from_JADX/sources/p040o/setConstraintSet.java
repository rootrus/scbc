package p040o;

import android.app.Application;
import android.content.Context;

/* renamed from: o.setConstraintSet */
public class setConstraintSet extends Application {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        setAllowsGoneWidget.IconCompatParcelizer((Context) this);
    }
}

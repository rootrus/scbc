package p040o;

import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: o.MarketingCSentWebViewActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6946xa1f888a0 extends CheckEligibilityActivity implements FundActionsSuccessActivity<Field> {
    public static final C6946xa1f888a0 read = new C6946xa1f888a0();

    C6946xa1f888a0() {
        super(0);
    }

    public final /* synthetic */ Object invoke() {
        Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
        if (declaredField != null) {
            declaredField.setAccessible(true);
            return declaredField;
        }
        throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!".toString());
    }
}

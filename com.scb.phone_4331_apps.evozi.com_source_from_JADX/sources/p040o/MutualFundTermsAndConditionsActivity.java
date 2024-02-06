package p040o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.MutualFundTermsAndConditionsActivity */
public final class MutualFundTermsAndConditionsActivity implements Serializable, Comparator<SplashActivity> {
    public static final MutualFundTermsAndConditionsActivity write = new MutualFundTermsAndConditionsActivity();

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String IconCompatParcelizer = IconCompatParcelizer((SplashActivity) obj);
        String IconCompatParcelizer2 = IconCompatParcelizer((SplashActivity) obj2);
        if (IconCompatParcelizer.equals(IconCompatParcelizer2)) {
            return 0;
        }
        if (IconCompatParcelizer.startsWith(IconCompatParcelizer2)) {
            return -1;
        }
        return IconCompatParcelizer2.startsWith(IconCompatParcelizer) ? 1 : 0;
    }

    private static String IconCompatParcelizer(SplashActivity splashActivity) {
        String IconCompatParcelizer = splashActivity.IconCompatParcelizer();
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = "/";
        }
        if (IconCompatParcelizer.endsWith("/")) {
            return IconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer);
        sb.append('/');
        return sb.toString();
    }
}

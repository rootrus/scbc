package p040o;

/* renamed from: o.JustForYouLandingActivity */
public final class JustForYouLandingActivity extends JuristicSetupResetPinActivity {
    public static final boolean IconCompatParcelizer(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}

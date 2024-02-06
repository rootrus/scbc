package p040o;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: o.LifestyleCustomizationActivity */
public final class LifestyleCustomizationActivity implements Serializable {
    public final Pattern write;

    public LifestyleCustomizationActivity(Pattern pattern) {
        onGetStartedClick.write((Object) pattern, "nativePattern");
        this.write = pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LifestyleCustomizationActivity(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.LifestyleCustomizationActivity.<init>(java.lang.String):void");
    }

    public final String read(CharSequence charSequence, String str) {
        onGetStartedClick.write((Object) charSequence, "input");
        onGetStartedClick.write((Object) str, "replacement");
        String replaceAll = this.write.matcher(charSequence).replaceAll(str);
        onGetStartedClick.IconCompatParcelizer((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String IconCompatParcelizer(CharSequence charSequence, String str) {
        onGetStartedClick.write((Object) charSequence, "input");
        onGetStartedClick.write((Object) str, "replacement");
        String replaceFirst = this.write.matcher(charSequence).replaceFirst(str);
        onGetStartedClick.IconCompatParcelizer((Object) replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final String toString() {
        String obj = this.write.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "nativePattern.toString()");
        return obj;
    }

    private final Object writeReplace() {
        String pattern = this.write.pattern();
        onGetStartedClick.IconCompatParcelizer((Object) pattern, "nativePattern.pattern()");
        return new IconCompatParcelizer(pattern, this.write.flags());
    }

    /* renamed from: o.LifestyleCustomizationActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Serializable {
        private final String IconCompatParcelizer;
        private final int MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(String str, int i) {
            onGetStartedClick.write((Object) str, "pattern");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) compile, "Pattern.compile(pattern, flags)");
            return new LifestyleCustomizationActivity(compile);
        }
    }
}

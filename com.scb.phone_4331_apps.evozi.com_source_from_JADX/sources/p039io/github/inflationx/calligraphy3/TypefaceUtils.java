package p039io.github.inflationx.calligraphy3;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.github.inflationx.calligraphy3.TypefaceUtils */
public final class TypefaceUtils {
    private static final Map<String, Typeface> sCachedFonts = new HashMap();
    private static final Map<Typeface, CalligraphyTypefaceSpan> sCachedSpans = new HashMap();

    public static Typeface load(AssetManager assetManager, String str) {
        Typeface typeface;
        synchronized (sCachedFonts) {
            try {
                if (!sCachedFonts.containsKey(str)) {
                    if (str.startsWith("/")) {
                        typeface = Typeface.createFromFile(str);
                    } else {
                        typeface = Typeface.createFromAsset(assetManager, str);
                    }
                    sCachedFonts.put(str, typeface);
                    return typeface;
                }
                Typeface typeface2 = sCachedFonts.get(str);
                return typeface2;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't create asset from ");
                sb.append(str);
                sb.append(". Make sure you have passed in the correct path and file name.");
                Log.w("Calligraphy", sb.toString(), e);
                sCachedFonts.put(str, (Object) null);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static CalligraphyTypefaceSpan getSpan(Typeface typeface) {
        if (typeface == null) {
            return null;
        }
        synchronized (sCachedSpans) {
            if (!sCachedSpans.containsKey(typeface)) {
                CalligraphyTypefaceSpan calligraphyTypefaceSpan = new CalligraphyTypefaceSpan(typeface);
                sCachedSpans.put(typeface, calligraphyTypefaceSpan);
                return calligraphyTypefaceSpan;
            }
            CalligraphyTypefaceSpan calligraphyTypefaceSpan2 = sCachedSpans.get(typeface);
            return calligraphyTypefaceSpan2;
        }
    }

    public static boolean isLoaded(Typeface typeface) {
        return typeface != null && sCachedFonts.containsValue(typeface);
    }

    private TypefaceUtils() {
    }
}

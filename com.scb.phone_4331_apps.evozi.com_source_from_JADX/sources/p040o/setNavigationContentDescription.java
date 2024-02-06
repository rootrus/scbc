package p040o;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import java.lang.reflect.Field;
import p040o.setHoverListener$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.setNavigationContentDescription */
public final class setNavigationContentDescription {
    private static Field IconCompatParcelizer;
    private static boolean MediaBrowserCompat$CustomActionResultReceiver;
    private static boolean MediaBrowserCompat$ItemReceiver;
    private static Field read;

    private static Field MediaBrowserCompat$CustomActionResultReceiver(String str) {
        Field field;
        try {
            field = TextView.class.getDeclaredField(str);
            try {
                field.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        } catch (NoSuchFieldException unused2) {
            field = null;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve ");
            sb.append(str);
            sb.append(" field.");
            Log.e("TextViewCompat", sb.toString());
            return field;
        }
        return field;
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve value of ");
            sb.append(field.getName());
            sb.append(" field.");
            Log.d("TextViewCompat", sb.toString());
            return -1;
        }
    }

    public static void IconCompatParcelizer(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (Build.VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(TextView textView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!MediaBrowserCompat$ItemReceiver) {
            read = MediaBrowserCompat$CustomActionResultReceiver("mMaxMode");
            MediaBrowserCompat$ItemReceiver = true;
        }
        Field field = read;
        if (field == null || MediaBrowserCompat$CustomActionResultReceiver(field, textView) != 1) {
            return -1;
        }
        if (!MediaBrowserCompat$CustomActionResultReceiver) {
            IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver("mMaximum");
            MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        Field field2 = IconCompatParcelizer;
        if (field2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver(field2, textView);
        }
        return -1;
    }

    public static void read(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static Drawable[] IconCompatParcelizer(TextView textView) {
        if (Build.VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (Build.VERSION.SDK_INT < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    public static ActionMode.Callback read(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT < 26 || Build.VERSION.SDK_INT > 27 || (callback instanceof C1518xe7d29946)) ? callback : new C1518xe7d29946(callback, textView);
    }

    public static void IconCompatParcelizer(TextView textView, int i) {
        int i2;
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
        } else {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.top;
            } else {
                i2 = fontMetricsInt.ascent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
            }
        }
    }

    public static void write(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (Build.VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static int write(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int MediaBrowserCompat$ItemReceiver(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void MediaBrowserCompat$ItemReceiver(TextView textView, int i) {
        if (i >= 0) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static setHoverListener$MediaBrowserCompat$ItemReceiver read(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new setHoverListener$MediaBrowserCompat$ItemReceiver(textView.getTextMetricsParams());
        }
        setHoverListener$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer iconCompatParcelizer = new setHoverListener$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(textView.getBreakStrategy());
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(textView.getHyphenationFrequency());
        }
        if (Build.VERSION.SDK_INT >= 18) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$SearchResultReceiver(textView));
        }
        return iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
    }

    public static void read(TextView textView, setHoverListener$MediaBrowserCompat$ItemReceiver sethoverlistener_mediabrowsercompat_itemreceiver) {
        if (Build.VERSION.SDK_INT >= 18) {
            textView.setTextDirection(MediaBrowserCompat$CustomActionResultReceiver(sethoverlistener_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver()));
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = sethoverlistener_mediabrowsercompat_itemreceiver.read().getTextScaleX();
            textView.getPaint().set(sethoverlistener_mediabrowsercompat_itemreceiver.read());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(sethoverlistener_mediabrowsercompat_itemreceiver.read());
        textView.setBreakStrategy(sethoverlistener_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver());
        textView.setHyphenationFrequency(sethoverlistener_mediabrowsercompat_itemreceiver.write());
    }

    public static void MediaBrowserCompat$ItemReceiver(TextView textView, setHoverListener sethoverlistener) {
        if (read(textView).IconCompatParcelizer(sethoverlistener.write())) {
            textView.setText(sethoverlistener);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    private static TextDirectionHeuristic MediaBrowserCompat$SearchResultReceiver(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }
}

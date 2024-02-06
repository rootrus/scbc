package p040o;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: o.setHoverListener$MediaBrowserCompat$ItemReceiver */
public final class setHoverListener$MediaBrowserCompat$ItemReceiver {
    private final int IconCompatParcelizer;
    private final TextPaint MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    final PrecomputedText.Params read = null;
    private final TextDirectionHeuristic write;

    /* renamed from: o.setHoverListener$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private final TextPaint MediaBrowserCompat$ItemReceiver;
        private TextDirectionHeuristic read;
        private int write;

        public IconCompatParcelizer(TextPaint textPaint) {
            this.MediaBrowserCompat$ItemReceiver = textPaint;
            if (Build.VERSION.SDK_INT >= 23) {
                this.MediaBrowserCompat$CustomActionResultReceiver = 1;
                this.write = 1;
            } else {
                this.write = 0;
                this.MediaBrowserCompat$CustomActionResultReceiver = 0;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                this.read = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            } else {
                this.read = null;
            }
        }

        public IconCompatParcelizer MediaBrowserCompat$ItemReceiver(int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(int i) {
            this.write = i;
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(TextDirectionHeuristic textDirectionHeuristic) {
            this.read = textDirectionHeuristic;
            return this;
        }

        public setHoverListener$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver() {
            return new setHoverListener$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
        }
    }

    setHoverListener$MediaBrowserCompat$ItemReceiver(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = textPaint;
        this.write = textDirectionHeuristic;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }

    public setHoverListener$MediaBrowserCompat$ItemReceiver(PrecomputedText.Params params) {
        this.MediaBrowserCompat$CustomActionResultReceiver = params.getTextPaint();
        this.write = params.getTextDirection();
        this.IconCompatParcelizer = params.getBreakStrategy();
        this.MediaBrowserCompat$ItemReceiver = params.getHyphenationFrequency();
    }

    public final TextPaint read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final TextDirectionHeuristic MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean IconCompatParcelizer(setHoverListener$MediaBrowserCompat$ItemReceiver sethoverlistener_mediabrowsercompat_itemreceiver) {
        PrecomputedText.Params params = this.read;
        if (params != null) {
            return params.equals(sethoverlistener_mediabrowsercompat_itemreceiver.read);
        }
        if ((Build.VERSION.SDK_INT >= 23 && (this.IconCompatParcelizer != sethoverlistener_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver() || this.MediaBrowserCompat$ItemReceiver != sethoverlistener_mediabrowsercompat_itemreceiver.write())) || this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize() != sethoverlistener_mediabrowsercompat_itemreceiver.read().getTextSize() || this.MediaBrowserCompat$CustomActionResultReceiver.getTextScaleX() != sethoverlistener_mediabrowsercompat_itemreceiver.read().getTextScaleX() || this.MediaBrowserCompat$CustomActionResultReceiver.getTextSkewX() != sethoverlistener_mediabrowsercompat_itemreceiver.read().getTextSkewX()) {
            return false;
        }
        if ((Build.VERSION.SDK_INT >= 21 && (this.MediaBrowserCompat$CustomActionResultReceiver.getLetterSpacing() != sethoverlistener_mediabrowsercompat_itemreceiver.read().getLetterSpacing() || !TextUtils.equals(this.MediaBrowserCompat$CustomActionResultReceiver.getFontFeatureSettings(), sethoverlistener_mediabrowsercompat_itemreceiver.read().getFontFeatureSettings()))) || this.MediaBrowserCompat$CustomActionResultReceiver.getFlags() != sethoverlistener_mediabrowsercompat_itemreceiver.read().getFlags()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocales().equals(sethoverlistener_mediabrowsercompat_itemreceiver.read().getTextLocales())) {
                return false;
            }
        } else if (Build.VERSION.SDK_INT >= 17 && !this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocale().equals(sethoverlistener_mediabrowsercompat_itemreceiver.read().getTextLocale())) {
            return false;
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface() == null) {
            if (sethoverlistener_mediabrowsercompat_itemreceiver.read().getTypeface() != null) {
                return false;
            }
            return true;
        } else if (!this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface().equals(sethoverlistener_mediabrowsercompat_itemreceiver.read().getTypeface())) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setHoverListener$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        setHoverListener$MediaBrowserCompat$ItemReceiver sethoverlistener_mediabrowsercompat_itemreceiver = (setHoverListener$MediaBrowserCompat$ItemReceiver) obj;
        if (!IconCompatParcelizer(sethoverlistener_mediabrowsercompat_itemreceiver)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 18 || this.write == sethoverlistener_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver();
    }

    public final int hashCode() {
        if (Build.VERSION.SDK_INT >= 24) {
            return setIconified.MediaBrowserCompat$ItemReceiver(Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextScaleX()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSkewX()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getLetterSpacing()), Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getFlags()), this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocales(), this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface(), Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.isElegantTextHeight()), this.write, Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.MediaBrowserCompat$ItemReceiver));
        } else if (Build.VERSION.SDK_INT >= 21) {
            return setIconified.MediaBrowserCompat$ItemReceiver(Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextScaleX()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSkewX()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getLetterSpacing()), Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getFlags()), this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocale(), this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface(), Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.isElegantTextHeight()), this.write, Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.MediaBrowserCompat$ItemReceiver));
        } else if (Build.VERSION.SDK_INT >= 18) {
            return setIconified.MediaBrowserCompat$ItemReceiver(Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextScaleX()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSkewX()), Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getFlags()), this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocale(), this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface(), this.write, Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.MediaBrowserCompat$ItemReceiver));
        } else if (Build.VERSION.SDK_INT >= 17) {
            return setIconified.MediaBrowserCompat$ItemReceiver(Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextScaleX()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSkewX()), Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getFlags()), this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocale(), this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface(), this.write, Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.MediaBrowserCompat$ItemReceiver));
        } else {
            return setIconified.MediaBrowserCompat$ItemReceiver(Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextScaleX()), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSkewX()), Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.getFlags()), this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface(), this.write, Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.MediaBrowserCompat$ItemReceiver));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("textSize=");
        sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSize());
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(", textScaleX=");
        sb3.append(this.MediaBrowserCompat$CustomActionResultReceiver.getTextScaleX());
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(", textSkewX=");
        sb4.append(this.MediaBrowserCompat$CustomActionResultReceiver.getTextSkewX());
        sb.append(sb4.toString());
        if (Build.VERSION.SDK_INT >= 21) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(", letterSpacing=");
            sb5.append(this.MediaBrowserCompat$CustomActionResultReceiver.getLetterSpacing());
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(", elegantTextHeight=");
            sb6.append(this.MediaBrowserCompat$CustomActionResultReceiver.isElegantTextHeight());
            sb.append(sb6.toString());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(", textLocale=");
            sb7.append(this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocales());
            sb.append(sb7.toString());
        } else if (Build.VERSION.SDK_INT >= 17) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(", textLocale=");
            sb8.append(this.MediaBrowserCompat$CustomActionResultReceiver.getTextLocale());
            sb.append(sb8.toString());
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append(", typeface=");
        sb9.append(this.MediaBrowserCompat$CustomActionResultReceiver.getTypeface());
        sb.append(sb9.toString());
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(", variationSettings=");
            sb10.append(this.MediaBrowserCompat$CustomActionResultReceiver.getFontVariationSettings());
            sb.append(sb10.toString());
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(", textDir=");
        sb11.append(this.write);
        sb.append(sb11.toString());
        StringBuilder sb12 = new StringBuilder();
        sb12.append(", breakStrategy=");
        sb12.append(this.IconCompatParcelizer);
        sb.append(sb12.toString());
        StringBuilder sb13 = new StringBuilder();
        sb13.append(", hyphenationFrequency=");
        sb13.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(sb13.toString());
        sb.append("}");
        return sb.toString();
    }
}

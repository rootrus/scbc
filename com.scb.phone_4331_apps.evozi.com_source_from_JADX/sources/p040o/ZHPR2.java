package p040o;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.View;
import java.util.EnumMap;
import java.util.concurrent.Executor;
import p040o.Iterables;

/* renamed from: o.ZHPR2 */
public final class ZHPR2 {
    private static EnumMap<Int4, Integer> IconCompatParcelizer;
    private static SparseArray<Int4> RatingCompat = new SparseArray<>();
    public final C7507tQ MediaBrowserCompat$CustomActionResultReceiver;
    public final Executor MediaBrowserCompat$ItemReceiver;
    public final CreditCardCaptureModule read;
    public final nAllocationRead2D write;

    public static SpannableString MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, final Resources resources, final ZHPR2$MediaBrowserCompat$ItemReceiver zHPR2$MediaBrowserCompat$ItemReceiver, final boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String obj = sb.toString();
        SpannableString spannableString = new SpannableString(obj);
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                ZHPR2$MediaBrowserCompat$ItemReceiver zHPR2$MediaBrowserCompat$ItemReceiver = zHPR2$MediaBrowserCompat$ItemReceiver;
                if (zHPR2$MediaBrowserCompat$ItemReceiver != null) {
                    zHPR2$MediaBrowserCompat$ItemReceiver.read();
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(z);
                textPaint.setColor(resources.getColor(Iterables.C35273.read.scb_purple));
            }
        }, str.length(), obj.length(), 33);
        if (i != 0) {
            spannableString.setSpan(new StyleSpan(i), str.length(), obj.length(), 33);
        }
        return spannableString;
    }

    public static SpannableStringBuilder MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int indexOf = str.indexOf(str2);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, str2.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    static {
        EnumMap<Int4, Integer> enumMap = new EnumMap<>(Int4.class);
        IconCompatParcelizer = enumMap;
        enumMap.put(Int4.DEFAULT, 0);
        IconCompatParcelizer.put(Int4.VERY_LOW, 1);
        IconCompatParcelizer.put(Int4.HIGHEST, 2);
        for (Int4 next : IconCompatParcelizer.keySet()) {
            RatingCompat.append(IconCompatParcelizer.get(next).intValue(), next);
        }
    }

    public ZHPR2() {
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(Int4 int4) {
        Integer num = IconCompatParcelizer.get(int4);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PriorityMapping is missing known Priority value ");
        sb.append(int4);
        throw new IllegalStateException(sb.toString());
    }

    public static Int4 IconCompatParcelizer(int i) {
        Int4 int4 = RatingCompat.get(i);
        if (int4 != null) {
            return int4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @HmlPinActivity
    public ZHPR2(Executor executor, C7507tQ tQVar, CreditCardCaptureModule creditCardCaptureModule, nAllocationRead2D nallocationread2d) {
        this.MediaBrowserCompat$ItemReceiver = executor;
        this.MediaBrowserCompat$CustomActionResultReceiver = tQVar;
        this.read = creditCardCaptureModule;
        this.write = nallocationread2d;
    }
}

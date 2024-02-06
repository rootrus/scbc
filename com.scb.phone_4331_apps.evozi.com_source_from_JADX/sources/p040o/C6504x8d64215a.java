package p040o;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import com.google.zxing.WriterException;
import java.util.Map;
import p040o.zzge;

/* renamed from: o.FragmentBuilder_BindEBillPaymentBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6504x8d64215a implements getIIdDeserializerOnDevice {
    public static Spannable MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, int i, MetricAffectingSpan metricAffectingSpan) {
        onGetStartedClick.write((Object) str, "fullWord");
        onGetStartedClick.write((Object) str2, "highlightWord");
        CharSequence charSequence = str;
        int read = GoodToKnowActivity.read(charSequence, str2, 0, true);
        int length = str2.length() + read;
        SpannableStringBuilder append = new SpannableStringBuilder().append(charSequence);
        if (read >= 0) {
            append.setSpan(new ForegroundColorSpan(i), read, length, 33);
        }
        if (metricAffectingSpan != null && read >= 0) {
            append.setSpan(metricAffectingSpan, read, length, 33);
        }
        onGetStartedClick.IconCompatParcelizer((Object) append, "SpannableStringBuilder()…      }\n                }");
        return append;
    }

    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (rsnincallocationcreatetyped != rsnIncAllocationCreateTyped.QR_CODE) {
            StringBuilder sb = new StringBuilder("Can only encode QR_CODE, but got ");
            sb.append(rsnincallocationcreatetyped);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Requested dimensions are too small: ");
            sb2.append(i);
            sb2.append('x');
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            execute execute = execute.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(rsnIncObjDestroy.ERROR_CORRECTION)) {
                    execute = execute.valueOf(map.get(rsnIncObjDestroy.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(rsnIncObjDestroy.MARGIN)) {
                    i3 = Integer.parseInt(map.get(rsnIncObjDestroy.MARGIN).toString());
                }
            }
            zzge.zzf.read read = getField.MediaBrowserCompat$ItemReceiver(str, execute, map).IconCompatParcelizer;
            if (read != null) {
                int i4 = read.read;
                int i5 = read.MediaBrowserCompat$ItemReceiver;
                int i6 = i3 << 1;
                int i7 = i4 + i6;
                int i8 = i6 + i5;
                int max = Math.max(i, i7);
                int max2 = Math.max(i2, i8);
                int min = Math.min(max / i7, max2 / i8);
                int i9 = (max - (i4 * min)) / 2;
                int i10 = (max2 - (i5 * min)) / 2;
                rsnScriptSetVarI rsnscriptsetvari = new rsnScriptSetVarI(max, max2);
                int i11 = 0;
                while (i11 < i5) {
                    int i12 = 0;
                    int i13 = i9;
                    while (i12 < i4) {
                        if (read.MediaBrowserCompat$CustomActionResultReceiver[i11][i12] == 1) {
                            rsnscriptsetvari.IconCompatParcelizer(i13, i10, min, min);
                        }
                        i12++;
                        i13 += min;
                    }
                    i11++;
                    i10 += min;
                }
                return rsnscriptsetvari;
            }
            throw new IllegalStateException();
        }
    }
}

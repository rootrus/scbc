package p040o;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: o.FragmentBuilder_BindTopUpTabFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6846x3f1de153 implements LineHeightSpan {
    private /* synthetic */ int read;

    C6846x3f1de153(int i) {
        this.read = i;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        fontMetricsInt.bottom += this.read;
        fontMetricsInt.descent += this.read;
    }
}

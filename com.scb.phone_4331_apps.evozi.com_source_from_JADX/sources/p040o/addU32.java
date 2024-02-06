package p040o;

import java.text.DecimalFormat;

/* renamed from: o.addU32 */
public final class addU32 extends addU16 {
    private DecimalFormat IconCompatParcelizer;
    public int write;

    public addU32(int i) {
        this.write = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("###,###,###,##0");
        sb.append(stringBuffer.toString());
        this.IconCompatParcelizer = new DecimalFormat(sb.toString());
    }

    public final String MediaBrowserCompat$ItemReceiver(float f) {
        return this.IconCompatParcelizer.format((double) f);
    }
}

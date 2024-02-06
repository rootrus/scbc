package p040o;

import java.text.DecimalFormat;

/* renamed from: o.addObj */
public final class addObj extends addU16 {
    private DecimalFormat read;

    public addObj(int i) {
        read(i);
    }

    public final void read(int i) {
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
        this.read = new DecimalFormat(sb.toString());
    }

    public final String MediaBrowserCompat$ItemReceiver(float f) {
        return this.read.format((double) f);
    }
}

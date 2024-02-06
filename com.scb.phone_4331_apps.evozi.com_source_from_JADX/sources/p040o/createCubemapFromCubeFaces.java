package p040o;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.createFromBitmapResource;

/* renamed from: o.createCubemapFromCubeFaces */
public class createCubemapFromCubeFaces<T extends createFromBitmapResource> {
    public final T write;

    public createCubemapFromCubeFaces(T t) {
        this.write = t;
    }

    public String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int length;
        Object obj = this.write.MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        if (obj == null) {
            return null;
        }
        if (obj.getClass().isArray() && (length = Array.getLength(obj)) > 16) {
            return String.format("[%d values]", new Object[]{Integer.valueOf(length)});
        } else if (obj instanceof Date) {
            return new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy").format((Date) obj).replaceAll("([0-9]{2} [^ ]+)$", ":$1");
        } else {
            return this.write.MediaBrowserCompat$SearchResultReceiver(i);
        }
    }

    /* access modifiers changed from: protected */
    public final String IconCompatParcelizer(int i, int i2) {
        int[] MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(i);
        if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < 4 && i3 < MediaBrowserCompat$ItemReceiver.length) {
            if (i3 == i2) {
                sb.append('.');
            }
            char c = (char) MediaBrowserCompat$ItemReceiver[i3];
            if (c < '0') {
                c = (char) (c + '0');
            }
            if (i3 != 0 || c != '0') {
                sb.append(c);
            }
            i3++;
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String MediaBrowserCompat$CustomActionResultReceiver(int i, String... strArr) {
        return write(i, 0, strArr);
    }

    /* access modifiers changed from: protected */
    public final String write(int i, int i2, String... strArr) {
        String str;
        Integer MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue() - i2;
        if (intValue >= 0 && intValue < strArr.length && (str = strArr[intValue]) != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown (");
        sb.append(MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String IconCompatParcelizer(int i) {
        byte[] IconCompatParcelizer = this.write.IconCompatParcelizer(i);
        if (IconCompatParcelizer == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(IconCompatParcelizer.length);
        objArr[1] = IconCompatParcelizer.length == 1 ? "" : "s";
        return String.format("(%d byte%s)", objArr);
    }

    /* access modifiers changed from: protected */
    public final String MediaBrowserCompat$ItemReceiver(int i) {
        copy3DRangeFromUnchecked RatingCompat = this.write.RatingCompat(i);
        if (RatingCompat == null) {
            return null;
        }
        return RatingCompat.IconCompatParcelizer(true);
    }

    /* access modifiers changed from: protected */
    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        copy3DRangeFromUnchecked RatingCompat = this.write.RatingCompat(516);
        if (RatingCompat == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("%.");
        sb.append(3);
        sb.append("f");
        return String.format(sb.toString(), new Object[]{Double.valueOf(RatingCompat.doubleValue())});
    }

    /* access modifiers changed from: protected */
    public final String read(int i, String str) {
        Integer MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return String.format(str, new Object[]{MediaBrowserCompat$CustomActionResultReceiver});
    }

    /* access modifiers changed from: protected */
    public final String write(String str) {
        String MediaBrowserCompat$SearchResultReceiver = this.write.MediaBrowserCompat$SearchResultReceiver(CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA);
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            return null;
        }
        return String.format(str, new Object[]{MediaBrowserCompat$SearchResultReceiver});
    }

    /* access modifiers changed from: protected */
    public final String read() {
        Long MediaDescriptionCompat = this.write.MediaDescriptionCompat(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256);
        if (MediaDescriptionCompat == null) {
            return null;
        }
        return new Date(MediaDescriptionCompat.longValue()).toString();
    }

    /* access modifiers changed from: protected */
    public final String write(int i, Object... objArr) {
        Integer MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; objArr.length > i2; i2++) {
            String[] strArr = objArr[i2];
            if (strArr != null) {
                char c = (MediaBrowserCompat$CustomActionResultReceiver.intValue() & 1) == 1 ? (char) 1 : 0;
                if (strArr instanceof String[]) {
                    arrayList.add(strArr[c]);
                } else if (c != 0 && (strArr instanceof String)) {
                    arrayList.add((String) strArr);
                }
            }
            MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver.intValue() >> 1);
        }
        return getViewLifecycleOwner.IconCompatParcelizer(arrayList, ", ");
    }

    /* access modifiers changed from: protected */
    public final String write() {
        byte[] IconCompatParcelizer = this.write.IconCompatParcelizer(37);
        if (IconCompatParcelizer == null) {
            return null;
        }
        int length = IconCompatParcelizer.length;
        int i = 0;
        while (true) {
            if (i >= IconCompatParcelizer.length) {
                break;
            }
            byte b = IconCompatParcelizer[i] & 255;
            if (b == 0 || b > Byte.MAX_VALUE) {
                length = i;
            } else {
                i++;
            }
        }
        length = i;
        return new String(IconCompatParcelizer, 0, length);
    }

    /* access modifiers changed from: protected */
    public final String read(int i, Charset charset) {
        byte[] IconCompatParcelizer = this.write.IconCompatParcelizer(i);
        if (IconCompatParcelizer == null) {
            return null;
        }
        try {
            return new String(IconCompatParcelizer, charset.name()).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final String MediaBrowserCompat$ItemReceiver() {
        copy3DRangeFromUnchecked RatingCompat = this.write.RatingCompat(515);
        if (RatingCompat != null) {
            return RatingCompat.IconCompatParcelizer(true);
        }
        Double read = this.write.read(515);
        if (read != null) {
            return new DecimalFormat("0.###").format(read);
        }
        return null;
    }

    protected static String write(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        StringBuilder sb = new StringBuilder();
        sb.append("f/");
        sb.append(decimalFormat.format(d));
        return sb.toString();
    }

    protected static String MediaBrowserCompat$CustomActionResultReceiver(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        StringBuilder sb = new StringBuilder();
        sb.append(decimalFormat.format(d));
        sb.append(" mm");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String write(int i) {
        copy3DRangeFromUnchecked[] MediaBrowserCompat$MediaItem = this.write.MediaBrowserCompat$MediaItem(i);
        if (MediaBrowserCompat$MediaItem == null || MediaBrowserCompat$MediaItem.length != 4) {
            return null;
        }
        boolean z = false;
        copy3DRangeFromUnchecked copy3drangefromunchecked = MediaBrowserCompat$MediaItem[0];
        if (copy3drangefromunchecked.IconCompatParcelizer == 0 || copy3drangefromunchecked.MediaBrowserCompat$ItemReceiver == 0) {
            copy3DRangeFromUnchecked copy3drangefromunchecked2 = MediaBrowserCompat$MediaItem[2];
            if (copy3drangefromunchecked2.IconCompatParcelizer == 0 || copy3drangefromunchecked2.MediaBrowserCompat$ItemReceiver == 0) {
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (MediaBrowserCompat$MediaItem[1].doubleValue() == MediaBrowserCompat$MediaItem[0].doubleValue()) {
            sb.append(MediaBrowserCompat$MediaItem[0].IconCompatParcelizer(true));
            sb.append("mm");
        } else {
            sb.append(MediaBrowserCompat$MediaItem[0].IconCompatParcelizer(true));
            sb.append('-');
            sb.append(MediaBrowserCompat$MediaItem[1].IconCompatParcelizer(true));
            sb.append("mm");
        }
        copy3DRangeFromUnchecked copy3drangefromunchecked3 = MediaBrowserCompat$MediaItem[2];
        if (!(copy3drangefromunchecked3.IconCompatParcelizer == 0 || copy3drangefromunchecked3.MediaBrowserCompat$ItemReceiver == 0)) {
            sb.append(' ');
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            if (MediaBrowserCompat$MediaItem[3].doubleValue() == MediaBrowserCompat$MediaItem[2].doubleValue()) {
                z = true;
            }
            if (z) {
                sb.append(write(MediaBrowserCompat$MediaItem[2].doubleValue()));
            } else {
                sb.append("f/");
                sb.append(decimalFormat.format(MediaBrowserCompat$MediaItem[2].doubleValue()));
                sb.append('-');
                sb.append(decimalFormat.format(MediaBrowserCompat$MediaItem[3].doubleValue()));
            }
        }
        return sb.toString();
    }

    public final String IconCompatParcelizer() {
        return write(274, 1, "Top, left side (Horizontal / normal)", "Top, right side (Mirror horizontal)", "Bottom, right side (Rotate 180)", "Bottom, left side (Mirror vertical)", "Left side, top (Mirror horizontal and rotate 270 CW)", "Right side, top (Rotate 90 CW)", "Right side, bottom (Mirror horizontal and rotate 90 CW)", "Left side, bottom (Rotate 270 CW)");
    }

    public final String read(int i) {
        Float write2 = this.write.write(i);
        if (write2 == null) {
            return null;
        }
        if (write2.floatValue() <= 1.0f) {
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            StringBuilder sb = new StringBuilder();
            sb.append(decimalFormat.format((double) (((float) Math.round(((double) ((float) (1.0d / Math.exp(((double) write2.floatValue()) * Math.log(2.0d))))) * 10.0d)) / 10.0f)));
            sb.append(" sec");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1/");
        sb2.append((int) Math.exp(((double) write2.floatValue()) * Math.log(2.0d)));
        sb2.append(" sec");
        return sb2.toString();
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(short s) {
        if (s == 0) {
            return "Unknown";
        }
        if (s == 1) {
            return "Daylight";
        }
        if (s == 2) {
            return "Fluorescent";
        }
        if (s == 3) {
            return "Tungsten (Incandescent)";
        }
        if (s == 4) {
            return "Flash";
        }
        if (s == 255) {
            return "Other";
        }
        switch (s) {
            case 9:
                return "Fine Weather";
            case 10:
                return "Cloudy";
            case 11:
                return "Shade";
            case 12:
                return "Daylight Fluorescent";
            case 13:
                return "Day White Fluorescent";
            case 14:
                return "Cool White Fluorescent";
            case 15:
                return "White Fluorescent";
            case 16:
                return "Warm White Fluorescent";
            case 17:
                return "Standard Light A";
            case 18:
                return "Standard Light B";
            case 19:
                return "Standard Light C";
            case 20:
                return "D55";
            case 21:
                return "D65";
            case 22:
                return "D75";
            case 23:
                return "D50";
            case 24:
                return "ISO Studio Tungsten";
            default:
                return MediaBrowserCompat$CustomActionResultReceiver((int) s);
        }
    }
}

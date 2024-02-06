package p040o;

import android.os.StrictMode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.tls.AlertDescription;
import p040o.RGBA_8888;

/* renamed from: o.setAnimator */
public final class setAnimator {
    public final double IconCompatParcelizer;
    public final double MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: finally extract failed */
    static int IconCompatParcelizer() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File file = new File("/sys/devices/system/cpu/");
            final Pattern compile = Pattern.compile("cpu[0-9]+");
            fileArr = file.listFiles(new FilenameFilter() {
                public final boolean accept(File file, String str) {
                    return compile.matcher(str).matches();
                }
            });
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }

    public setAnimator(double d, double d2) {
        this.MediaBrowserCompat$ItemReceiver = d;
        this.IconCompatParcelizer = d2;
    }

    public static String write(double d) {
        int i = (int) d;
        double abs = Math.abs((d % 1.0d) * 60.0d);
        double[] dArr = {(double) i, (double) ((int) abs), (abs % 1.0d) * 60.0d};
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return String.format("%s° %s' %s\"", new Object[]{decimalFormat.format(dArr[0]), decimalFormat.format(dArr[1]), decimalFormat.format(dArr[2])});
    }

    public static Double MediaBrowserCompat$CustomActionResultReceiver(copy3DRangeFromUnchecked copy3drangefromunchecked, copy3DRangeFromUnchecked copy3drangefromunchecked2, copy3DRangeFromUnchecked copy3drangefromunchecked3, boolean z) {
        double abs = Math.abs(copy3drangefromunchecked.doubleValue()) + (copy3drangefromunchecked2.doubleValue() / 60.0d) + (copy3drangefromunchecked3.doubleValue() / 3600.0d);
        if (Double.isNaN(abs)) {
            return null;
        }
        if (z) {
            abs = -abs;
        }
        return Double.valueOf(abs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setAnimator setanimator = (setAnimator) obj;
        return Double.compare(setanimator.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver) == 0 && Double.compare(setanimator.IconCompatParcelizer, this.IconCompatParcelizer) == 0;
    }

    public final int hashCode() {
        double d = this.MediaBrowserCompat$ItemReceiver;
        long j = 0;
        long doubleToLongBits = d != 0.0d ? Double.doubleToLongBits(d) : 0;
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        double d2 = this.IconCompatParcelizer;
        if (d2 != 0.0d) {
            j = Double.doubleToLongBits(d2);
        }
        return (i * 31) + ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public setAnimator() {
    }

    private static byte[] write(copy1DRangeFromUnchecked copy1drangefromunchecked) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[257];
        while (true) {
            byte MediaBrowserCompat$ItemReceiver2 = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byte b = MediaBrowserCompat$ItemReceiver2 & 255;
            bArr[0] = MediaBrowserCompat$ItemReceiver2;
            copy1drangefromunchecked.IconCompatParcelizer(bArr, 1, b);
            byteArrayOutputStream.write(bArr, 0, b + 1);
        }
    }

    private static byte[] read(copy1DRangeFromUnchecked copy1drangefromunchecked, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i > 0) {
            byteArrayOutputStream.write(copy1drangefromunchecked.IconCompatParcelizer(i), 0, i);
            i = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static RGBA_5551 MediaBrowserCompat$CustomActionResultReceiver(copy1DRangeFromUnchecked copy1drangefromunchecked, int i) throws IOException {
        return new RGBA_5551(new createFromBitmap(read(copy1drangefromunchecked, i), setViewCacheExtension.MediaBrowserCompat$CustomActionResultReceiver));
    }

    private static RGBA_8888 MediaBrowserCompat$CustomActionResultReceiver(copy1DRangeFromUnchecked copy1drangefromunchecked) throws IOException {
        RGBA_8888 rgba_8888 = new RGBA_8888();
        short MediaBrowserCompat$ItemReceiver2 = (short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255);
        rgba_8888.IconCompatParcelizer(2, RGBA_8888.write.read((MediaBrowserCompat$ItemReceiver2 >> 2) & 7));
        boolean z = false;
        rgba_8888.IconCompatParcelizer(3, Boolean.valueOf(((MediaBrowserCompat$ItemReceiver2 & 2) >> 1) == 1));
        if ((MediaBrowserCompat$ItemReceiver2 & 1) == 1) {
            z = true;
        }
        rgba_8888.IconCompatParcelizer(4, Boolean.valueOf(z));
        rgba_8888.IconCompatParcelizer(1, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
        rgba_8888.IconCompatParcelizer(5, Integer.valueOf((short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255)));
        copy1drangefromunchecked.write(1);
        return rgba_8888;
    }

    private static void MediaBrowserCompat$ItemReceiver(copy1DRangeFromUnchecked copy1drangefromunchecked, getSubElementOffsetBytes getsubelementoffsetbytes) throws IOException {
        createCubemapFromBitmap createcubemapfrombitmap;
        byte MediaBrowserCompat$ItemReceiver2 = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
        short MediaBrowserCompat$ItemReceiver3 = (short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255);
        long write = copy1drangefromunchecked.write();
        if (MediaBrowserCompat$ItemReceiver2 == -7) {
            getsubelementoffsetbytes.IconCompatParcelizer.add(MediaBrowserCompat$CustomActionResultReceiver(copy1drangefromunchecked));
        } else if (MediaBrowserCompat$ItemReceiver2 == 1) {
            if (MediaBrowserCompat$ItemReceiver3 != 12) {
                createcubemapfrombitmap = new createCubemapFromBitmap(String.format("Invalid GIF plain text block size. Expected 12, got %d.", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver3)}));
            } else {
                copy1drangefromunchecked.write(12);
                IconCompatParcelizer(copy1drangefromunchecked);
                createcubemapfrombitmap = null;
            }
            if (createcubemapfrombitmap != null) {
                getsubelementoffsetbytes.IconCompatParcelizer.add(createcubemapfrombitmap);
            }
        } else if (MediaBrowserCompat$ItemReceiver2 == -2) {
            getsubelementoffsetbytes.IconCompatParcelizer.add(MediaBrowserCompat$CustomActionResultReceiver(copy1drangefromunchecked, MediaBrowserCompat$ItemReceiver3));
        } else if (MediaBrowserCompat$ItemReceiver2 != -1) {
            getsubelementoffsetbytes.IconCompatParcelizer.add(new createCubemapFromBitmap(String.format("Unsupported GIF extension block with type 0x%02X.", new Object[]{Byte.valueOf(MediaBrowserCompat$ItemReceiver2)})));
        } else if (MediaBrowserCompat$ItemReceiver3 != 11) {
            getsubelementoffsetbytes.IconCompatParcelizer.add(new createCubemapFromBitmap(String.format("Invalid GIF application extension block size. Expected 11, got %d.", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver3)})));
        } else {
            String str = new String(copy1drangefromunchecked.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver3), setViewCacheExtension.write);
            if (str.equals("XMP DataXMP")) {
                byte[] write2 = write(copy1drangefromunchecked);
                nScriptIntrinsicCreate.IconCompatParcelizer(write2, write2.length - 257, getsubelementoffsetbytes);
            } else if (str.equals("ICCRGBG1012")) {
                byte[] read = read(copy1drangefromunchecked, copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver());
                if (read.length != 0) {
                    new nAllocationSetSurface().read(new StaggeredGridLayoutManager(read), getsubelementoffsetbytes);
                }
            } else if (str.equals("NETSCAPE2.0")) {
                copy1drangefromunchecked.write(2);
                int RatingCompat = copy1drangefromunchecked.RatingCompat();
                copy1drangefromunchecked.write(1);
                MATRIX_2X2 matrix_2x2 = new MATRIX_2X2();
                matrix_2x2.IconCompatParcelizer(1, Integer.valueOf(RatingCompat));
                getsubelementoffsetbytes.IconCompatParcelizer.add(matrix_2x2);
            } else {
                IconCompatParcelizer(copy1drangefromunchecked);
            }
        }
        long write3 = (write + ((long) MediaBrowserCompat$ItemReceiver3)) - copy1drangefromunchecked.write();
        if (write3 > 0) {
            copy1drangefromunchecked.write(write3);
        }
    }

    private static RGB_565 MediaBrowserCompat$ItemReceiver(copy1DRangeFromUnchecked copy1drangefromunchecked) throws IOException {
        RGB_565 rgb_565 = new RGB_565();
        if (!new String(copy1drangefromunchecked.IconCompatParcelizer(3)).equals("GIF")) {
            rgb_565.IconCompatParcelizer.add("Invalid GIF file signature");
            return rgb_565;
        }
        String str = new String(copy1drangefromunchecked.IconCompatParcelizer(3));
        if (str.equals("87a") || str.equals("89a")) {
            rgb_565.IconCompatParcelizer(1, str);
            rgb_565.IconCompatParcelizer(2, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
            rgb_565.IconCompatParcelizer(3, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
            short MediaBrowserCompat$ItemReceiver2 = (short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255);
            boolean z = false;
            boolean z2 = (MediaBrowserCompat$ItemReceiver2 & 15) != 0;
            rgb_565.IconCompatParcelizer(4, Integer.valueOf(1 << ((MediaBrowserCompat$ItemReceiver2 & 7) + 1)));
            if (str.equals("89a")) {
                if ((MediaBrowserCompat$ItemReceiver2 & 8) != 0) {
                    z = true;
                }
                rgb_565.IconCompatParcelizer(5, Boolean.valueOf(z));
            }
            rgb_565.IconCompatParcelizer(6, Integer.valueOf(((MediaBrowserCompat$ItemReceiver2 & AlertDescription.unrecognized_name) >> 4) + 1));
            rgb_565.IconCompatParcelizer(7, Boolean.valueOf(z2));
            rgb_565.IconCompatParcelizer(8, Integer.valueOf((short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255)));
            short MediaBrowserCompat$ItemReceiver3 = (short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255);
            if (MediaBrowserCompat$ItemReceiver3 != 0) {
                rgb_565.IconCompatParcelizer(9, Float.valueOf((float) ((((double) MediaBrowserCompat$ItemReceiver3) + 15.0d) / 64.0d)));
            }
            return rgb_565;
        }
        rgb_565.IconCompatParcelizer.add("Unexpected GIF version");
        return rgb_565;
    }

    private static RGB_888 read(copy1DRangeFromUnchecked copy1drangefromunchecked) throws IOException {
        RGB_888 rgb_888 = new RGB_888();
        boolean z = true;
        rgb_888.IconCompatParcelizer(1, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
        rgb_888.IconCompatParcelizer(2, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
        rgb_888.IconCompatParcelizer(3, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
        rgb_888.IconCompatParcelizer(4, Integer.valueOf(copy1drangefromunchecked.RatingCompat()));
        byte MediaBrowserCompat$ItemReceiver2 = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
        byte b = MediaBrowserCompat$ItemReceiver2 & 7;
        boolean z2 = b != 0;
        boolean z3 = (MediaBrowserCompat$ItemReceiver2 & 64) != 0;
        if ((MediaBrowserCompat$ItemReceiver2 & 32) == 0) {
            z = false;
        }
        rgb_888.IconCompatParcelizer(5, Boolean.valueOf(z2));
        rgb_888.IconCompatParcelizer(6, Boolean.valueOf(z3));
        if (z2) {
            rgb_888.IconCompatParcelizer(7, Boolean.valueOf(z));
            rgb_888.IconCompatParcelizer(8, Integer.valueOf(b + 1));
            copy1drangefromunchecked.write((long) ((2 << b) * 3));
        }
        copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
        return rgb_888;
    }

    private static void IconCompatParcelizer(copy1DRangeFromUnchecked copy1drangefromunchecked) throws IOException {
        while (true) {
            short MediaBrowserCompat$ItemReceiver2 = (short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255);
            if (MediaBrowserCompat$ItemReceiver2 != 0) {
                copy1drangefromunchecked.write((long) MediaBrowserCompat$ItemReceiver2);
            } else {
                return;
            }
        }
    }

    public static void write(copy1DRangeFromUnchecked copy1drangefromunchecked, getSubElementOffsetBytes getsubelementoffsetbytes) {
        boolean z = false;
        copy1drangefromunchecked.IconCompatParcelizer = false;
        try {
            RGB_565 MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(copy1drangefromunchecked);
            getsubelementoffsetbytes.IconCompatParcelizer.add(MediaBrowserCompat$ItemReceiver2);
            if (MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer.size() > 0) {
                z = true;
            }
            if (!z) {
                try {
                    Integer MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver(4);
                    if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                        copy1drangefromunchecked.write((long) (MediaBrowserCompat$CustomActionResultReceiver.intValue() * 3));
                    }
                    while (true) {
                        try {
                            byte MediaBrowserCompat$ItemReceiver3 = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
                            if (MediaBrowserCompat$ItemReceiver3 != 33) {
                                if (MediaBrowserCompat$ItemReceiver3 == 44) {
                                    getsubelementoffsetbytes.IconCompatParcelizer.add(read(copy1drangefromunchecked));
                                    while (true) {
                                        short MediaBrowserCompat$ItemReceiver4 = (short) (copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver() & 255);
                                        if (MediaBrowserCompat$ItemReceiver4 == 0) {
                                            break;
                                        }
                                        copy1drangefromunchecked.write((long) MediaBrowserCompat$ItemReceiver4);
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                MediaBrowserCompat$ItemReceiver(copy1drangefromunchecked, getsubelementoffsetbytes);
                            }
                        } catch (IOException unused) {
                            return;
                        }
                    }
                } catch (IOException unused2) {
                    getsubelementoffsetbytes.IconCompatParcelizer.add(new createCubemapFromBitmap("IOException processing GIF data"));
                }
            }
        } catch (IOException unused3) {
            getsubelementoffsetbytes.IconCompatParcelizer.add(new createCubemapFromBitmap("IOException processing GIF data"));
        }
    }
}

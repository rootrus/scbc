package org.beyka.tiffbitmapfactory;

import java.io.File;

public class TiffConverter {
    public static native boolean convertBmpTiff(String str, String str2, ConverterOptions converterOptions, IProgressListener iProgressListener);

    public static native boolean convertJpgTiff(String str, String str2, ConverterOptions converterOptions, IProgressListener iProgressListener);

    public static native boolean convertPngTiff(String str, String str2, ConverterOptions converterOptions, IProgressListener iProgressListener);

    public static native boolean convertTiffBmp(String str, String str2, ConverterOptions converterOptions, IProgressListener iProgressListener);

    public static native boolean convertTiffJpg(String str, String str2, ConverterOptions converterOptions, IProgressListener iProgressListener);

    public static native boolean convertTiffPng(String str, String str2, ConverterOptions converterOptions, IProgressListener iProgressListener);

    public static native ImageFormat getImageType(String str);

    static {
        System.loadLibrary("tiff");
        System.loadLibrary("tiffconverter");
    }

    public static boolean convertToTiff(File file, File file2, ConverterOptions converterOptions, IProgressListener iProgressListener) {
        while (true) {
            file = file.getAbsoluteFile();
            file2 = file2.getAbsoluteFile();
        }
    }

    /* renamed from: org.beyka.tiffbitmapfactory.TiffConverter$1 */
    static /* synthetic */ class C102821 {
        static final /* synthetic */ int[] $SwitchMap$org$beyka$tiffbitmapfactory$ImageFormat;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.beyka.tiffbitmapfactory.ImageFormat[] r0 = org.beyka.tiffbitmapfactory.ImageFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$beyka$tiffbitmapfactory$ImageFormat = r0
                org.beyka.tiffbitmapfactory.ImageFormat r1 = org.beyka.tiffbitmapfactory.ImageFormat.JPEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$beyka$tiffbitmapfactory$ImageFormat     // Catch:{ NoSuchFieldError -> 0x001d }
                org.beyka.tiffbitmapfactory.ImageFormat r1 = org.beyka.tiffbitmapfactory.ImageFormat.PNG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$beyka$tiffbitmapfactory$ImageFormat     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.beyka.tiffbitmapfactory.ImageFormat r1 = org.beyka.tiffbitmapfactory.ImageFormat.BMP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$beyka$tiffbitmapfactory$ImageFormat     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.beyka.tiffbitmapfactory.ImageFormat r1 = org.beyka.tiffbitmapfactory.ImageFormat.TIFF     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.beyka.tiffbitmapfactory.TiffConverter.C102821.<clinit>():void");
        }
    }

    public static boolean convertToTiff(String str, String str2, ConverterOptions converterOptions, IProgressListener iProgressListener) {
        int i = C102821.$SwitchMap$org$beyka$tiffbitmapfactory$ImageFormat[getImageType(str).ordinal()];
        if (i == 1) {
            return convertJpgTiff(str, str2, converterOptions, iProgressListener);
        }
        if (i == 2) {
            return convertPngTiff(str, str2, converterOptions, iProgressListener);
        }
        if (i != 3) {
            return false;
        }
        return convertBmpTiff(str, str2, converterOptions, iProgressListener);
    }

    public static final class ConverterOptions {
        public boolean appendTiff = false;
        public long availableMemory = 256000000;
        public CompressionScheme compressionScheme = CompressionScheme.NONE;
        public String imageDescription;
        public DecodeArea inTiffDecodeArea;
        private volatile boolean isStoped = false;
        public int readTiffDirectory;
        public ResolutionUnit resUnit = ResolutionUnit.NONE;
        public String software;
        public boolean throwExceptions = false;
        public float xResolution;
        public float yResolution;

        public final void stop() {
            this.isStoped = true;
        }
    }
}

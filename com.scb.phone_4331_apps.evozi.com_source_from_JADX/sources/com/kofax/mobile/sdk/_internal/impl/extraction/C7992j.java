package com.kofax.mobile.sdk._internal.impl.extraction;

import com.kofax.kmc.ken.engines.data.Image;
import org.jmrtd.lds.ImageInfo;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.j */
public class C7992j {
    private C7992j() {
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.j$1 */
    static /* synthetic */ class C79931 {

        /* renamed from: iz */
        static final /* synthetic */ int[] f3738iz;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType[] r0 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3738iz = r0
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_TIFF     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3738iz     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_PNG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3738iz     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.ken.engines.data.Image$ImageMimeType r1 = com.kofax.kmc.ken.engines.data.Image.ImageMimeType.MIMETYPE_JPEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.extraction.C7992j.C79931.<clinit>():void");
        }
    }

    /* renamed from: C */
    public static String m3942C(Image image) {
        int i = C79931.f3738iz[image.getImageMimeType().ordinal()];
        if (i == 1) {
            return "image/tiff";
        }
        if (i == 2) {
            return "image/png";
        }
        if (i == 3) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        throw new IllegalArgumentException("Unsupported MIME type");
    }

    /* renamed from: D */
    public static String m3943D(Image image) {
        int i = C79931.f3738iz[image.getImageMimeType().ordinal()];
        if (i == 1) {
            return ".tif";
        }
        if (i == 2) {
            return ".png";
        }
        if (i == 3) {
            return ".jpg";
        }
        throw new IllegalArgumentException("Unsupported MIME type");
    }

    /* renamed from: a */
    public static String m3944a(byte b) {
        byte b2 = b & 255;
        if (b2 == 73 || b2 == 77) {
            return "image/tiff";
        }
        if (b2 == 137) {
            return "image/png";
        }
        if (b2 == 255) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        throw new IllegalArgumentException("Unsupported MIME type");
    }

    /* renamed from: al */
    public static String m3945al(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(!Character.isISOControl(c) || c == 10 || c == 13)) {
                charArray[i] = ' ';
            }
        }
        return new String(charArray);
    }
}

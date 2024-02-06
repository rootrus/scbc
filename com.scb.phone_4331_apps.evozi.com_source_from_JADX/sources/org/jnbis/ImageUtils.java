package org.jnbis;

public class ImageUtils {
    public static final int[] MASKS = {255, 255, 255};

    public byte[] bitmap2jpeg(Bitmap bitmap) {
        return convert(bitmap, "jpeg");
    }

    public byte[] bitmap2gif(Bitmap bitmap) {
        return convert(bitmap, "gif");
    }

    public byte[] bitmap2png(Bitmap bitmap) {
        return convert(bitmap, "png");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] convert(org.jnbis.Bitmap r9, java.lang.String r10) {
        /*
            r8 = this;
            int r6 = r9.getWidth()
            int r7 = r9.getHeight()
            java.awt.image.DataBufferByte r0 = new java.awt.image.DataBufferByte
            byte[] r1 = r9.getPixels()
            int r9 = r9.getLength()
            r0.<init>(r1, r9)
            int[] r4 = MASKS
            r5 = 0
            r1 = r6
            r2 = r7
            r3 = r6
            java.awt.image.WritableRaster r9 = java.awt.image.Raster.createPackedRaster(r0, r1, r2, r3, r4, r5)
            java.awt.image.BufferedImage r0 = new java.awt.image.BufferedImage
            r1 = 1
            r0.<init>(r6, r7, r1)
            r0.setData(r9)
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0047 }
            r9.<init>()     // Catch:{ IOException -> 0x0047 }
            javax.imageio.ImageIO.write(r0, r10, r9)     // Catch:{ all -> 0x003b }
            r9.close()     // Catch:{ all -> 0x003b }
            byte[] r10 = r9.toByteArray()     // Catch:{ all -> 0x003b }
            r9.close()     // Catch:{ IOException -> 0x0047 }
            return r10
        L_0x003b:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x0047 }
        L_0x0046:
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jnbis.ImageUtils.convert(org.jnbis.Bitmap, java.lang.String):byte[]");
    }
}

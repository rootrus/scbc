package org.beyka.tiffbitmapfactory.exceptions;

public class NotEnoughtMemoryException extends RuntimeException {
    private int availableMemory;
    private int needMemory;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NotEnoughtMemoryException(int r3, int r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Available memory is not enought to decode image. Available "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " bytes. Need "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " bytes."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.availableMemory = r3
            r2.needMemory = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.beyka.tiffbitmapfactory.exceptions.NotEnoughtMemoryException.<init>(int, int):void");
    }

    public int getAvailableMemory() {
        return this.availableMemory;
    }

    public int getNeedMemory() {
        return this.needMemory;
    }
}

package org.beyka.tiffbitmapfactory.exceptions;

public class DecodeTiffException extends RuntimeException {
    private String aditionalInfo;
    private String fileName;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DecodeTiffException(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not decode tiff file "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.fileName = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.beyka.tiffbitmapfactory.exceptions.DecodeTiffException.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DecodeTiffException(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Could not decode tiff file "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "\n"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.fileName = r3
            r2.aditionalInfo = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.beyka.tiffbitmapfactory.exceptions.DecodeTiffException.<init>(java.lang.String, java.lang.String):void");
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getAditionalInfo() {
        return this.aditionalInfo;
    }
}

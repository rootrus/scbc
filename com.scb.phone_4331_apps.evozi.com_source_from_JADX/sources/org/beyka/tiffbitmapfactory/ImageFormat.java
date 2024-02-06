package org.beyka.tiffbitmapfactory;

public enum ImageFormat {
    UNKNOWN(0),
    JPEG(1),
    PNG(2),
    TIFF(4),
    BMP(5);
    
    final int ordinal;

    private ImageFormat(int i) {
        this.ordinal = i;
    }
}

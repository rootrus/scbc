package org.beyka.tiffbitmapfactory;

public enum Photometric {
    MINISWHITE(0),
    MINISBLACK(1),
    RGB(2),
    PALETTE(3),
    MASK(4),
    SEPARATED(5),
    YCBCR(6),
    CIELAB(8),
    ICCLAB(9),
    ITULAB(10),
    LOGL(32844),
    LOGLUV(32845),
    OTHER(-1);
    
    final int ordinal;

    private Photometric(int i) {
        this.ordinal = i;
    }
}

package org.beyka.tiffbitmapfactory;

public enum ResolutionUnit {
    NONE(1),
    INCH(2),
    CENTIMETER(3);
    
    final int ordinal;

    private ResolutionUnit(int i) {
        this.ordinal = i;
    }
}

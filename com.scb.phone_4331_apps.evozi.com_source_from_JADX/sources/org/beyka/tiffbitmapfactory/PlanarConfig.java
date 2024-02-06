package org.beyka.tiffbitmapfactory;

public enum PlanarConfig {
    CONTIG(1),
    SEPARATE(2);
    
    final int ordinal;

    private PlanarConfig(int i) {
        this.ordinal = i;
    }
}

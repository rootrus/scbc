package org.beyka.tiffbitmapfactory;

public enum FillOrder {
    MSB2LSB(1),
    LSB2MSB(2);
    
    final int ordinal;

    private FillOrder(int i) {
        this.ordinal = i;
    }
}

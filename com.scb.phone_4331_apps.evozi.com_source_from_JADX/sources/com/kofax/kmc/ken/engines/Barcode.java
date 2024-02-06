package com.kofax.kmc.ken.engines;

class Barcode {
    private final int _angle;
    private final int _checkDigitLocation;
    private final double[] _cornerX;
    private final double[] _cornerY;
    private final String _data;
    private final int _dataType;
    private final int _type;

    public Barcode(int i, double[] dArr, double[] dArr2, int i2, String str, int i3, int i4) {
        this._type = i;
        this._cornerX = dArr;
        this._cornerY = dArr2;
        this._angle = i2;
        this._data = str;
        this._dataType = i3;
        this._checkDigitLocation = i4;
    }

    /* access modifiers changed from: package-private */
    public int getType() {
        return this._type;
    }

    /* access modifiers changed from: package-private */
    public double[] getCornerX() {
        return this._cornerX;
    }

    /* access modifiers changed from: package-private */
    public double[] getCornerY() {
        return this._cornerY;
    }

    /* access modifiers changed from: package-private */
    public int getAngle() {
        return this._angle;
    }

    /* access modifiers changed from: package-private */
    public String getData() {
        return this._data;
    }

    /* access modifiers changed from: package-private */
    public int getDataType() {
        return this._dataType;
    }

    /* access modifiers changed from: package-private */
    public int getCheckDigitLocation() {
        return this._checkDigitLocation;
    }
}

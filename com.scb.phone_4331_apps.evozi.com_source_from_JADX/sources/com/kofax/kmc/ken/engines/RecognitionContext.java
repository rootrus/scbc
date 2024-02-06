package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.BarCodeReader;
import com.kofax.kmc.ken.engines.data.BarCodeDataFormat;
import com.kofax.kmc.ken.engines.data.BarCodeDirection;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import java.util.ArrayList;
import java.util.List;

class RecognitionContext {
    private Barcode[] _atalaBarcode;
    private boolean _checksum;
    private int _engineVersion;
    private String _errorMessage;
    private int _resultCode;
    private int _symbolsFound;

    public RecognitionContext(int i, int i2, String str, int i3, Barcode[] barcodeArr, boolean z) {
        this._resultCode = i;
        this._engineVersion = i2;
        this._errorMessage = str;
        this._symbolsFound = i3;
        this._atalaBarcode = barcodeArr;
        this._checksum = z;
    }

    private BarCodeDataFormat toFormat(int i) {
        if (i == 1) {
            return BarCodeDataFormat.ASCII;
        }
        if (i != 2) {
            return BarCodeDataFormat.UNKNOWN;
        }
        return BarCodeDataFormat.BASE_64;
    }

    private BarCodeDirection toDirection(int i) {
        if (i > 315 && i <= 45) {
            return BarCodeDirection.BOTTOM_UP;
        }
        if (i > 45 && i <= 135) {
            return BarCodeDirection.RIGHT_LEFT;
        }
        if (i <= 135 || i > 225) {
            return BarCodeDirection.LEFT_RIGHT;
        }
        return BarCodeDirection.TOP_DOWN;
    }

    /* access modifiers changed from: package-private */
    public List<BarCodeResult> getBarCodeResults(int i) {
        ArrayList arrayList = new ArrayList();
        if (this._symbolsFound > 0) {
            Barcode[] barcodeArr = this._atalaBarcode;
            int length = barcodeArr.length;
            char c = 0;
            int i2 = 0;
            while (i2 < length) {
                Barcode barcode = barcodeArr[i2];
                BarCodeResult barCodeResult = new BarCodeResult();
                double[] cornerX = barcode.getCornerX();
                double[] cornerY = barcode.getCornerY();
                int i3 = length;
                BoundingTetragon boundingTetragon = r10;
                BoundingTetragon boundingTetragon2 = new BoundingTetragon(((int) cornerX[c]) / i, ((int) cornerY[c]) / i, ((int) cornerX[1]) / i, ((int) cornerY[1]) / i, ((int) cornerX[2]) / i, ((int) cornerY[2]) / i, ((int) cornerX[3]) / i, ((int) cornerY[3]) / i);
                barCodeResult.setBoundingBox(boundingTetragon);
                barCodeResult.setDataFormat(toFormat(barcode.getDataType()));
                barCodeResult.setDirection(toDirection(barcode.getAngle()));
                barCodeResult.setType(BarCodeReader.Symbology.getBarCodeType(barcode.getType()));
                barCodeResult.setValue(barcode.getData());
                arrayList.add(barCodeResult);
                i2++;
                length = i3;
                barcodeArr = barcodeArr;
                c = 0;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public int getResultCode() {
        return this._resultCode;
    }

    /* access modifiers changed from: package-private */
    public int getEngineVersion() {
        return this._engineVersion;
    }

    /* access modifiers changed from: package-private */
    public String getErrorMessage() {
        return this._errorMessage;
    }

    /* access modifiers changed from: package-private */
    public int getSymbolsFound() {
        return this._symbolsFound;
    }

    /* access modifiers changed from: package-private */
    public Barcode[] getBarcode() {
        return this._atalaBarcode;
    }

    /* access modifiers changed from: package-private */
    public boolean getChecksum() {
        return this._checksum;
    }
}

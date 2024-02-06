package com.kofax.kmc.ken.engines;

import android.graphics.Bitmap;
import com.kofax.kmc.ken.engines.BarCodeReader;

class BarcodeReaderEngineManager {
    private static boolean _nativeLibraryLoaded = true;
    private Barcode _barcode;
    private BarCodeReader.Direction _direction;
    private int _maxBarcode;
    private BarCodeReader.Symbology[] _symbology;

    /* access modifiers changed from: package-private */
    public native String ABE_BarcodeEngine_GetVersion();

    /* access modifiers changed from: package-private */
    public native RecognitionContext ABE_BarcodeEngine_Recognize(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6);

    BarcodeReaderEngineManager() {
    }

    static {
        try {
            System.loadLibrary("AtalaBar");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RecognitionContext mo53587a(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        if (_nativeLibraryLoaded) {
            return ABE_BarcodeEngine_Recognize(bitmap, i, i2, i3, i4, i5, i6);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo53589b() {
        return _nativeLibraryLoaded ? ABE_BarcodeEngine_GetVersion() : "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Barcode mo53590c() {
        return this._barcode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo53588a(Barcode barcode) {
        this._barcode = barcode;
    }
}

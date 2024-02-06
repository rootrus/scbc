package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.Image;
import java.util.EventObject;

public class BarCodeFoundEvent extends EventObject {
    private static final long serialVersionUID = 1262060730719713148L;

    /* renamed from: kg */
    private BarCodeResult f3496kg;

    /* renamed from: t */
    private Image f3497t;

    public BarCodeFoundEvent(Object obj, BarCodeResult barCodeResult, Image image) {
        super(obj);
        this.f3496kg = barCodeResult;
        this.f3497t = image;
    }

    public BarCodeResult getBarCode() {
        return this.f3496kg;
    }

    public Image getImage() {
        return this.f3497t;
    }
}

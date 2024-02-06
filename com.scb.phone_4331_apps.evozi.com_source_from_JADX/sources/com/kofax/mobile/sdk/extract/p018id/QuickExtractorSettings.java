package com.kofax.mobile.sdk.extract.p018id;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.kofax.mobile.sdk.extract.id.QuickExtractorSettings */
public class QuickExtractorSettings {

    /* renamed from: RO */
    private Set<BarCodeType> f4892RO = new HashSet(Arrays.asList(new BarCodeType[]{BarCodeType.PDF417, BarCodeType.QR}));
    private float aeS;
    private float aeT;
    private float aeU;
    private float aeV;

    public Set<BarCodeType> getBarcodes() {
        return new HashSet(this.f4892RO);
    }

    public void setBarcodes(Set<BarCodeType> set) {
        this.f4892RO = new HashSet(set);
    }

    public float getFaceLeftPadding() {
        return this.aeS;
    }

    public void setFaceLeftPadding(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else if (f > 50.0f) {
            f = 50.0f;
        }
        this.aeS = f;
    }

    public float getFaceRightPadding() {
        return this.aeT;
    }

    public void setFaceRightPadding(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else if (f > 50.0f) {
            f = 50.0f;
        }
        this.aeT = f;
    }

    public float getFaceTopPadding() {
        return this.aeU;
    }

    public void setFaceTopPadding(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else if (f > 50.0f) {
            f = 50.0f;
        }
        this.aeU = f;
    }

    public float getFaceBottomPadding() {
        return this.aeV;
    }

    public void setFaceBottomPadding(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else if (f > 50.0f) {
            f = 50.0f;
        }
        this.aeV = f;
    }
}

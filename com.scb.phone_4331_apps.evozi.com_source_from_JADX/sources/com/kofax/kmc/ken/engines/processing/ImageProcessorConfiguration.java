package com.kofax.kmc.ken.engines.processing;

import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.mobile.sdk.p009ae.C0793c;
import java.io.Serializable;

public class ImageProcessorConfiguration implements Serializable, Cloneable {
    public String advancedConfiguration;
    public CropType cropType;
    public DeskewType deskewType;
    public DocumentDimensions documentDimensions;
    public final String ippString;
    public ColorDepth outputColorDepth;
    public Integer outputDPI;
    public RotateType rotateType;
    public TargetFrameCropType targetFrameCropType;

    public ImageProcessorConfiguration clone() {
        try {
            return (ImageProcessorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("ImageProcessorConfiguration: unexpected clone not supported exception");
        }
    }

    public ImageProcessorConfiguration() {
        this.rotateType = RotateType.ROTATE_NONE;
        this.outputColorDepth = ColorDepth.COLOR;
        this.cropType = CropType.CROP_NONE;
        this.targetFrameCropType = TargetFrameCropType.TARGET_FRAME_CROP_OFF;
        this.deskewType = DeskewType.DESKEW_NONE;
        this.documentDimensions = null;
        this.outputDPI = 0;
        this.advancedConfiguration = "";
        this.ippString = "";
    }

    public ImageProcessorConfiguration(String str) throws KmcException {
        this.rotateType = RotateType.ROTATE_NONE;
        this.outputColorDepth = ColorDepth.COLOR;
        this.cropType = CropType.CROP_NONE;
        this.targetFrameCropType = TargetFrameCropType.TARGET_FRAME_CROP_OFF;
        this.deskewType = DeskewType.DESKEW_NONE;
        this.documentDimensions = null;
        this.outputDPI = 0;
        this.advancedConfiguration = "";
        this.ippString = C0793c.m1874a(this, str);
    }
}

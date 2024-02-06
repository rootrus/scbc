package com.kofax.kmc.ken.engines.processing;

public enum RotateType {
    ROTATE_NONE(0),
    ROTATE_90(3),
    ROTATE_180(2),
    ROTATE_270(1),
    ROTATE_AUTO(4);
    
    public final int type;

    private RotateType(int i) {
        this.type = i;
    }
}

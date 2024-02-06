package com.kofax.mobile.sdk._internal.impl.event;

public final class LevelChangedEvent {
    public final float pitch;
    public final float pitchVelocity;
    public final float roll;
    public final float rollVelocity;

    public LevelChangedEvent(float f, float f2, float f3, float f4) {
        this.pitch = f;
        this.roll = f2;
        this.pitchVelocity = f3;
        this.rollVelocity = f4;
    }
}

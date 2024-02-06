package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import com.kofax.mobile.sdk._internal.impl.event.PreviewImageReadyBusEvent;
import java.nio.ByteBuffer;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.i */
class C8164i {

    /* renamed from: RV */
    private int f4194RV = 0;

    /* renamed from: RW */
    private ByteBuffer f4195RW = ByteBuffer.allocate(0);
    private int height;
    private int width;

    C8164i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo54571g(PreviewImageReadyBusEvent previewImageReadyBusEvent) {
        this.width = previewImageReadyBusEvent.width;
        this.height = previewImageReadyBusEvent.height;
        if (this.f4194RV != previewImageReadyBusEvent.rotation) {
            this.f4194RV = previewImageReadyBusEvent.rotation;
        }
        int length = previewImageReadyBusEvent.imageData.length;
        if (this.f4195RW.array().length != length) {
            this.f4195RW = ByteBuffer.allocate(length);
        }
        System.arraycopy(previewImageReadyBusEvent.imageData, 0, this.f4195RW.array(), 0, length);
    }

    public byte[] getData() {
        return this.f4195RW.array();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    /* renamed from: qk */
    public C8160e mo54575qk() {
        return new C8158c(this.f4195RW.array(), this.width, this.height, this.f4194RV);
    }
}

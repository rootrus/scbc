package p040o;

import java.util.concurrent.ThreadFactory;
import p040o.CameraApi2$CameraHardwareNotSupportException;

/* renamed from: o.setMErrorTextView */
public final class setMErrorTextView extends CameraApi2$CameraHardwareNotSupportException {
    private final ThreadFactory write;

    public setMErrorTextView(ThreadFactory threadFactory) {
        this.write = threadFactory;
    }

    public final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer() {
        return new setSelectedTextView(this.write);
    }
}

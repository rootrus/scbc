package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ImageCaptureView_Factory */
public final /* synthetic */ class ImageCaptureView_Factory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ InstallIdProvider write;

    public /* synthetic */ ImageCaptureView_Factory(InstallIdProvider installIdProvider) {
        this.write = installIdProvider;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6397xabb2c88d) obj).write(this.write);
    }
}

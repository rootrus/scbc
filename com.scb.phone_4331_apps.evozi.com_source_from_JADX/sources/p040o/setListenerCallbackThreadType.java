package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.ImageProcessor;
import p040o.writeUInt64NoTag;

/* renamed from: o.setListenerCallbackThreadType */
public final /* synthetic */ class setListenerCallbackThreadType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ImageProcessor.ProcessProgressEvent IconCompatParcelizer;

    public /* synthetic */ setListenerCallbackThreadType(ImageProcessor.ProcessProgressEvent processProgressEvent) {
        this.IconCompatParcelizer = processProgressEvent;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setCheckable) obj).write(this.IconCompatParcelizer.read());
    }
}

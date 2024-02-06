package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.writerForAppendable */
public final /* synthetic */ class writerForAppendable implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFieldNames$MediaBrowserCompat$CustomActionResultReceiver read;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ writerForAppendable(getFieldNames$MediaBrowserCompat$CustomActionResultReceiver getfieldnames_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.read = getfieldnames_mediabrowsercompat_customactionresultreceiver;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getFieldNames$MediaBrowserCompat$CustomActionResultReceiver getfieldnames_mediabrowsercompat_customactionresultreceiver = this.read;
        IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory idCaptureModule_GetIExceptionResponseDeserializerKtaFactory = (IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory) obj;
        idCaptureModule_GetIExceptionResponseDeserializerKtaFactory.write(getfieldnames_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, (Runnable) new peekStack(idCaptureModule_GetIExceptionResponseDeserializerKtaFactory)));
    }
}

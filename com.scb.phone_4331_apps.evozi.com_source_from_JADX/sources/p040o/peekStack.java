package p040o;

/* renamed from: o.peekStack */
public final /* synthetic */ class peekStack implements Runnable {
    private final /* synthetic */ IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory write;

    public /* synthetic */ peekStack(IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory idCaptureModule_GetIExceptionResponseDeserializerKtaFactory) {
        this.write = idCaptureModule_GetIExceptionResponseDeserializerKtaFactory;
    }

    public final void run() {
        this.write.read();
    }
}

package p040o;

import p040o.CheckCaptureModule;

/* renamed from: o.CheckCaptureModule$KtaExceptionResponseDeserializer$MediaBrowserCompat$CustomActionResultReceiver */
final class C6376x33986d72 implements nScriptGroup2Create {
    private /* synthetic */ CheckCaptureModule.KtaExceptionResponseDeserializer write;

    C6376x33986d72(CheckCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer) {
        this.write = ktaExceptionResponseDeserializer;
    }

    public final /* synthetic */ void write(Object obj) {
        int i;
        nScriptForEach nscriptforeach = (nScriptForEach) obj;
        CheckCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer = this.write;
        if (nscriptforeach != null) {
            i = nscriptforeach.MediaBrowserCompat$ItemReceiver;
        } else {
            i = 0;
        }
        CheckCaptureModule.KtaExceptionResponseDeserializer.MediaBrowserCompat$ItemReceiver(ktaExceptionResponseDeserializer, i);
    }
}

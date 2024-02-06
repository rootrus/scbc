package p040o;

import retrofit2.Response;

/* renamed from: o.zzeu */
public final /* synthetic */ class zzeu implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ doBestEffortWrite write;

    public /* synthetic */ zzeu(doBestEffortWrite dobesteffortwrite) {
        this.write = dobesteffortwrite;
    }

    public final Object write(Object obj) {
        return this.write.write((Response) obj);
    }
}

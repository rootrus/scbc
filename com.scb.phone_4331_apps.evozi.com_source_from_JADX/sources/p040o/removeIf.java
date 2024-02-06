package p040o;

import java.io.File;
import okhttp3.Response;

/* renamed from: o.removeIf */
public final /* synthetic */ class removeIf implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ File read;

    public /* synthetic */ removeIf(File file) {
        this.read = file;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.fromCallable(new elementsEqual(this.read, (Response) obj));
    }
}

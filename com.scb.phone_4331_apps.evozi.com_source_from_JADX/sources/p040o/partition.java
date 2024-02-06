package p040o;

import java.util.concurrent.Callable;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* renamed from: o.partition */
public final /* synthetic */ class partition implements Callable {
    private final /* synthetic */ OkHttpClient read;
    private final /* synthetic */ String write;

    public /* synthetic */ partition(String str, OkHttpClient okHttpClient) {
        this.write = str;
        this.read = okHttpClient;
    }

    public final Object call() {
        return this.read.newCall(new Request.Builder().url(this.write).build()).execute();
    }
}

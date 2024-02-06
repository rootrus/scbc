package p040o;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import okhttp3.Response;
import org.json.JSONObject;

/* renamed from: o.elementsEqual */
public final /* synthetic */ class elementsEqual implements Callable {
    private final /* synthetic */ File MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Response write;

    public /* synthetic */ elementsEqual(File file, Response response) {
        this.MediaBrowserCompat$CustomActionResultReceiver = file;
        this.write = response;
    }

    public final Object call() {
        File file = this.MediaBrowserCompat$CustomActionResultReceiver;
        Response response = this.write;
        file.createNewFile();
        String string = response.body().string();
        byte[] bytes = string.getBytes();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        return new JSONObject(string);
    }
}

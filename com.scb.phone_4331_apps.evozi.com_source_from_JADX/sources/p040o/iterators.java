package p040o;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: o.iterators */
public final /* synthetic */ class iterators implements Callable {
    private final /* synthetic */ File MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ iterators(File file) {
        this.MediaBrowserCompat$ItemReceiver = file;
    }

    public final Object call() {
        File file = this.MediaBrowserCompat$ItemReceiver;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return new JSONObject(sb.toString());
            }
        }
    }
}

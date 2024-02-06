package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: o.BusinessAndMaritalInfoInputViewHolder */
public class BusinessAndMaritalInfoInputViewHolder implements BusinessAndMaritalInfoInputViewHolder_ViewBinding {
    public HttpsURLConnection read;

    public BusinessAndMaritalInfoInputViewHolder(String str, int i, String str2, int i2) throws IOException {
        this((Proxy) null, str, i, str2, i2);
    }

    public BusinessAndMaritalInfoInputViewHolder(Proxy proxy, String str, int i, String str2, int i2) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL("https", str, i, str2).openConnection();
        this.read = httpsURLConnection;
        httpsURLConnection.setConnectTimeout(i2);
        this.read.setReadTimeout(i2);
        this.read.setUseCaches(false);
        this.read.setDoOutput(true);
        this.read.setDoInput(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.read.disconnect();
    }

    public final List MediaBrowserCompat$ItemReceiver() {
        Map<String, List<String>> headerFields = this.read.getHeaderFields();
        Set<String> keySet = headerFields.keySet();
        LinkedList linkedList = new LinkedList();
        for (String next : keySet) {
            List list = headerFields.get(next);
            for (int i = 0; i < list.size(); i++) {
                linkedList.add(new C10397x8e7fc506(next, (String) list.get(i)));
            }
        }
        return linkedList;
    }

    public final int read() throws IOException {
        return this.read.getResponseCode();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        this.read.setRequestProperty(str, str2);
    }

    public final void write(String str) throws IOException {
        this.read.setRequestMethod(str);
    }

    public final void read(int i) {
        this.read.setFixedLengthStreamingMode(i);
    }

    public final OutputStream MediaDescriptionCompat() throws IOException {
        return this.read.getOutputStream();
    }

    public final InputStream write() throws IOException {
        return this.read.getInputStream();
    }

    public final InputStream IconCompatParcelizer() {
        return this.read.getErrorStream();
    }
}

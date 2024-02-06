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

/* renamed from: o.ETBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding */
public final class ETBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding implements BusinessAndMaritalInfoInputViewHolder_ViewBinding {
    private HttpsURLConnection MediaBrowserCompat$ItemReceiver;

    public ETBProductDetailAdapter$ETBProductDetailViewHolder_ViewBinding(Proxy proxy, String str, int i, String str2, int i2) throws IOException {
        if (proxy == null) {
            this.MediaBrowserCompat$ItemReceiver = (HttpsURLConnection) new URL("https", str, i, str2).openConnection();
        } else {
            this.MediaBrowserCompat$ItemReceiver = (HttpsURLConnection) new URL("https", str, i, str2).openConnection(proxy);
        }
        this.MediaBrowserCompat$ItemReceiver.setConnectTimeout(i2);
        this.MediaBrowserCompat$ItemReceiver.setReadTimeout(i2);
        this.MediaBrowserCompat$ItemReceiver.setUseCaches(false);
        this.MediaBrowserCompat$ItemReceiver.setDoOutput(true);
        this.MediaBrowserCompat$ItemReceiver.setDoInput(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver.disconnect();
    }

    public final List MediaBrowserCompat$ItemReceiver() {
        Map<String, List<String>> headerFields = this.MediaBrowserCompat$ItemReceiver.getHeaderFields();
        Set<String> keySet = headerFields.keySet();
        LinkedList linkedList = new LinkedList();
        for (String next : keySet) {
            List list = headerFields.get(next);
            for (int i = 0; i < list.size(); i++) {
                linkedList.add(new IssuerSearchAdapter$CustomViewHolder_ViewBinding(next, (String) list.get(i)));
            }
        }
        return linkedList;
    }

    public final int read() throws IOException {
        return this.MediaBrowserCompat$ItemReceiver.getResponseCode();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver.setRequestProperty(str, str2);
    }

    public final void write(String str) throws IOException {
        this.MediaBrowserCompat$ItemReceiver.setRequestMethod(str);
    }

    public final void read(int i) {
        this.MediaBrowserCompat$ItemReceiver.setFixedLengthStreamingMode(i);
    }

    public final OutputStream MediaDescriptionCompat() throws IOException {
        return this.MediaBrowserCompat$ItemReceiver.getOutputStream();
    }

    public final InputStream write() throws IOException {
        return this.MediaBrowserCompat$ItemReceiver.getInputStream();
    }

    public final InputStream IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.getErrorStream();
    }
}

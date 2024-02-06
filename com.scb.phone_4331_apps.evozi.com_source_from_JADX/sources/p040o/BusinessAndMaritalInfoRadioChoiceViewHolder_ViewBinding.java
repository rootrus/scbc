package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: o.BusinessAndMaritalInfoRadioChoiceViewHolder_ViewBinding */
public final class BusinessAndMaritalInfoRadioChoiceViewHolder_ViewBinding implements BusinessAndMaritalInfoInputViewHolder_ViewBinding {
    private HttpURLConnection MediaBrowserCompat$ItemReceiver;

    public BusinessAndMaritalInfoRadioChoiceViewHolder_ViewBinding(Proxy proxy, String str, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.MediaBrowserCompat$ItemReceiver = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.MediaBrowserCompat$ItemReceiver.setDoOutput(true);
        this.MediaBrowserCompat$ItemReceiver.setDoInput(true);
        this.MediaBrowserCompat$ItemReceiver.setConnectTimeout(i);
        this.MediaBrowserCompat$ItemReceiver.setReadTimeout(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver.disconnect();
    }

    public final List MediaBrowserCompat$ItemReceiver() throws IOException {
        LinkedList linkedList = new LinkedList();
        Map<String, List<String>> headerFields = this.MediaBrowserCompat$ItemReceiver.getHeaderFields();
        if (headerFields != null) {
            for (String next : headerFields.keySet()) {
                List list = headerFields.get(next);
                for (int i = 0; i < list.size(); i++) {
                    linkedList.add(new C10397x8e7fc506(next, (String) list.get(i)));
                }
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

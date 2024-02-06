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

/* renamed from: o.ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder */
public final class ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder implements BusinessAndMaritalInfoInputViewHolder_ViewBinding {
    private HttpURLConnection MediaBrowserCompat$CustomActionResultReceiver;

    public ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder(Proxy proxy, String str, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? new URL(str).openConnection() : new URL(str).openConnection(proxy));
        this.MediaBrowserCompat$CustomActionResultReceiver = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.MediaBrowserCompat$CustomActionResultReceiver.setDoOutput(true);
        this.MediaBrowserCompat$CustomActionResultReceiver.setDoInput(true);
        this.MediaBrowserCompat$CustomActionResultReceiver.setConnectTimeout(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.setReadTimeout(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver.disconnect();
    }

    public final List MediaBrowserCompat$ItemReceiver() throws IOException {
        LinkedList linkedList = new LinkedList();
        Map<String, List<String>> headerFields = this.MediaBrowserCompat$CustomActionResultReceiver.getHeaderFields();
        if (headerFields != null) {
            for (String next : headerFields.keySet()) {
                List list = headerFields.get(next);
                for (int i = 0; i < list.size(); i++) {
                    linkedList.add(new IssuerSearchAdapter$CustomViewHolder_ViewBinding(next, (String) list.get(i)));
                }
            }
        }
        return linkedList;
    }

    public final int read() throws IOException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getResponseCode();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setRequestProperty(str, str2);
    }

    public final void write(String str) throws IOException {
        this.MediaBrowserCompat$CustomActionResultReceiver.setRequestMethod(str);
    }

    public final void read(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setFixedLengthStreamingMode(i);
    }

    public final OutputStream MediaDescriptionCompat() throws IOException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getOutputStream();
    }

    public final InputStream write() throws IOException {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getInputStream();
    }

    public final InputStream IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getErrorStream();
    }
}

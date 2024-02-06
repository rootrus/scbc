package okhttp3.repackaged;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import okhttp3.repackaged.internal.URLFilter;
import okhttp3.repackaged.internal.huc.HttpURLConnectionImpl;
import okhttp3.repackaged.internal.huc.HttpsURLConnectionImpl;

public final class OkUrlFactory implements Cloneable, URLStreamHandlerFactory {
    private URLFilter aip;
    private OkHttpClient client;

    public OkUrlFactory(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public final OkHttpClient client() {
        return this.client;
    }

    public final OkUrlFactory setClient(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58528a(URLFilter uRLFilter) {
        this.aip = uRLFilter;
    }

    public final OkUrlFactory clone() {
        return new OkUrlFactory(this.client);
    }

    public final HttpURLConnection open(URL url) {
        return mo58527a(url, this.client.proxy());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final HttpURLConnection mo58527a(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        OkHttpClient build = this.client.newBuilder().proxy(proxy).build();
        if (protocol.equals("http")) {
            return new HttpURLConnectionImpl(url, build, this.aip);
        }
        if (protocol.equals("https")) {
            return new HttpsURLConnectionImpl(url, build, this.aip);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected protocol: ");
        sb.append(protocol);
        throw new IllegalArgumentException(sb.toString());
    }

    public final URLStreamHandler createURLStreamHandler(final String str) {
        if (str.equals("http") || str.equals("https")) {
            return new URLStreamHandler() {
                /* access modifiers changed from: protected */
                public URLConnection openConnection(URL url) {
                    return OkUrlFactory.this.open(url);
                }

                /* access modifiers changed from: protected */
                public URLConnection openConnection(URL url, Proxy proxy) {
                    return OkUrlFactory.this.mo58527a(url, proxy);
                }

                /* access modifiers changed from: protected */
                public int getDefaultPort() {
                    if (str.equals("http")) {
                        return 80;
                    }
                    if (str.equals("https")) {
                        return 443;
                    }
                    throw new AssertionError();
                }
            };
        }
        return null;
    }
}

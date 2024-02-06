package okhttp3.repackaged.internal;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import okhttp3.repackaged.Address;
import okhttp3.repackaged.Call;
import okhttp3.repackaged.Callback;
import okhttp3.repackaged.ConnectionPool;
import okhttp3.repackaged.ConnectionSpec;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.HttpUrl;
import okhttp3.repackaged.OkHttpClient;
import okhttp3.repackaged.internal.http.StreamAllocation;
import okhttp3.repackaged.internal.p090io.RealConnection;

public abstract class Internal {
    public static Internal instance;
    public static final Logger logger = Logger.getLogger(OkHttpClient.class.getName());

    public abstract void addLenient(Headers.Builder builder, String str);

    public abstract void addLenient(Headers.Builder builder, String str, String str2);

    public abstract void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z);

    public abstract StreamAllocation callEngineGetStreamAllocation(Call call);

    public abstract void callEnqueue(Call call, Callback callback, boolean z);

    public abstract boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection);

    public abstract RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation);

    public abstract HttpUrl getHttpUrlChecked(String str) throws MalformedURLException, UnknownHostException;

    public abstract InternalCache internalCache(OkHttpClient okHttpClient);

    public abstract void put(ConnectionPool connectionPool, RealConnection realConnection);

    public abstract RouteDatabase routeDatabase(ConnectionPool connectionPool);

    public abstract void setCache(OkHttpClient.Builder builder, InternalCache internalCache);

    public static void initializeInstanceForTests() {
        new OkHttpClient();
    }
}

package okhttp3.repackaged.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.Protocol;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.Response;
import okhttp3.repackaged.ResponseBody;
import okhttp3.repackaged.internal.Util;
import okhttp3.repackaged.internal.framed.ErrorCode;
import okhttp3.repackaged.internal.framed.FramedConnection;
import okhttp3.repackaged.internal.framed.FramedStream;
import okhttp3.repackaged.internal.framed.Header;
import p040o.HowToAddAccountActivity;
import p040o.ModifyQuickBalanceActivity;
import p040o.ModifyQuickTopUpActivity;
import p040o.PinLoginActivity_ViewBinding;
import p040o.QuickPromptPayActivity;
import p040o.onMenuTopUpClick;

public final class Http2xStream implements HttpStream {
    private static final PinLoginActivity_ViewBinding alN = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("connection");
    private static final PinLoginActivity_ViewBinding alO = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("host");
    private static final PinLoginActivity_ViewBinding alP = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("keep-alive");
    private static final PinLoginActivity_ViewBinding alQ = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("proxy-connection");
    private static final PinLoginActivity_ViewBinding alR = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("transfer-encoding");
    private static final PinLoginActivity_ViewBinding alS = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("te");
    private static final PinLoginActivity_ViewBinding alT = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("encoding");
    private static final PinLoginActivity_ViewBinding alU = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("upgrade");
    private static final List<PinLoginActivity_ViewBinding> alV = Util.immutableList((T[]) new PinLoginActivity_ViewBinding[]{alN, alO, alP, alQ, alR, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY, Header.TARGET_HOST, Header.VERSION});
    private static final List<PinLoginActivity_ViewBinding> alW = Util.immutableList((T[]) new PinLoginActivity_ViewBinding[]{alN, alO, alP, alQ, alR});
    private static final List<PinLoginActivity_ViewBinding> alX = Util.immutableList((T[]) new PinLoginActivity_ViewBinding[]{alN, alO, alP, alQ, alS, alR, alT, alU, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY, Header.TARGET_HOST, Header.VERSION});
    private static final List<PinLoginActivity_ViewBinding> alY = Util.immutableList((T[]) new PinLoginActivity_ViewBinding[]{alN, alO, alP, alQ, alS, alR, alT, alU});
    private FramedStream alZ;
    private final FramedConnection framedConnection;
    private HttpEngine httpEngine;
    /* access modifiers changed from: private */
    public final StreamAllocation streamAllocation;

    public Http2xStream(StreamAllocation streamAllocation2, FramedConnection framedConnection2) {
        this.streamAllocation = streamAllocation2;
        this.framedConnection = framedConnection2;
    }

    public final void setHttpEngine(HttpEngine httpEngine2) {
        this.httpEngine = httpEngine2;
    }

    public final QuickPromptPayActivity createRequestBody(Request request, long j) throws IOException {
        return this.alZ.getSink();
    }

    public final void writeRequestHeaders(Request request) throws IOException {
        List<Header> list;
        if (this.alZ == null) {
            this.httpEngine.writingRequestHeaders();
            boolean h = this.httpEngine.mo58849h(request);
            if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {
                list = http2HeadersList(request);
            } else {
                list = spdy3HeadersList(request);
            }
            FramedStream newStream = this.framedConnection.newStream(list, h, true);
            this.alZ = newStream;
            newStream.readTimeout().timeout((long) this.httpEngine.client.readTimeoutMillis(), TimeUnit.MILLISECONDS);
            this.alZ.writeTimeout().timeout((long) this.httpEngine.client.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
    }

    public final void writeRequestBody(RetryableSink retryableSink) throws IOException {
        retryableSink.writeToSocket(this.alZ.getSink());
    }

    public final void finishRequest() throws IOException {
        this.alZ.getSink().close();
    }

    public final Response.Builder readResponseHeaders() throws IOException {
        if (this.framedConnection.getProtocol() == Protocol.HTTP_2) {
            return readHttp2HeadersList(this.alZ.getResponseHeaders());
        }
        return readSpdy3HeadersList(this.alZ.getResponseHeaders());
    }

    public static List<Header> spdy3HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 5);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        arrayList.add(new Header(Header.VERSION, "HTTP/1.1"));
        arrayList.add(new Header(Header.TARGET_HOST, Util.hostHeader(request.url(), false)));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            PinLoginActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(headers.name(i).toLowerCase(Locale.US));
            if (!alV.contains(MediaBrowserCompat$CustomActionResultReceiver)) {
                String value = headers.value(i);
                if (linkedHashSet.add(MediaBrowserCompat$CustomActionResultReceiver)) {
                    arrayList.add(new Header(MediaBrowserCompat$CustomActionResultReceiver, value));
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (((Header) arrayList.get(i2)).name.equals(MediaBrowserCompat$CustomActionResultReceiver)) {
                            PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = ((Header) arrayList.get(i2)).value;
                            String str = pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                            if (str == null) {
                                str = new String(pinLoginActivity_ViewBinding.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                                pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str;
                            }
                            arrayList.set(i2, new Header(MediaBrowserCompat$CustomActionResultReceiver, m6125W(str, value)));
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: W */
    private static String m6125W(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(0);
        sb.append(str2);
        return sb.toString();
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        arrayList.add(new Header(Header.TARGET_AUTHORITY, Util.hostHeader(request.url(), false)));
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            PinLoginActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = PinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(headers.name(i).toLowerCase(Locale.US));
            if (!alX.contains(MediaBrowserCompat$CustomActionResultReceiver)) {
                arrayList.add(new Header(MediaBrowserCompat$CustomActionResultReceiver, headers.value(i)));
            }
        }
        return arrayList;
    }

    public static Response.Builder readSpdy3HeadersList(List<Header> list) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i = 0; i < size; i++) {
            PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = list.get(i).name;
            PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding2 = list.get(i).value;
            String str3 = pinLoginActivity_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 == null) {
                str3 = new String(pinLoginActivity_ViewBinding2.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                pinLoginActivity_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver = str3;
            }
            int i2 = 0;
            while (i2 < str3.length()) {
                int indexOf = str3.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = str3.length();
                }
                String substring = str3.substring(i2, indexOf);
                if (pinLoginActivity_ViewBinding.equals(Header.RESPONSE_STATUS)) {
                    str = substring;
                } else if (pinLoginActivity_ViewBinding.equals(Header.VERSION)) {
                    str2 = substring;
                } else if (!alW.contains(pinLoginActivity_ViewBinding)) {
                    String str4 = pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    if (str4 == null) {
                        str4 = new String(pinLoginActivity_ViewBinding.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                        pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str4;
                    }
                    builder.add(str4, substring);
                }
                i2 = indexOf + 1;
            }
        }
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(str);
            StatusLine parse = StatusLine.parse(sb.toString());
            return new Response.Builder().protocol(Protocol.SPDY_3).code(parse.code).message(parse.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public static Response.Builder readHttp2HeadersList(List<Header> list) throws IOException {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        String str = null;
        for (int i = 0; i < size; i++) {
            PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding = list.get(i).name;
            PinLoginActivity_ViewBinding pinLoginActivity_ViewBinding2 = list.get(i).value;
            String str2 = pinLoginActivity_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 == null) {
                str2 = new String(pinLoginActivity_ViewBinding2.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                pinLoginActivity_ViewBinding2.MediaBrowserCompat$CustomActionResultReceiver = str2;
            }
            if (pinLoginActivity_ViewBinding.equals(Header.RESPONSE_STATUS)) {
                str = str2;
            } else if (!alY.contains(pinLoginActivity_ViewBinding)) {
                String str3 = pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                if (str3 == null) {
                    str3 = new String(pinLoginActivity_ViewBinding.write, ModifyQuickTopUpActivity.MediaBrowserCompat$ItemReceiver);
                    pinLoginActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = str3;
                }
                builder.add(str3, str2);
            }
        }
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("HTTP/1.1 ");
            sb.append(str);
            StatusLine parse = StatusLine.parse(sb.toString());
            return new Response.Builder().protocol(Protocol.HTTP_2).code(parse.code).message(parse.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public final ResponseBody openResponseBody(Response response) throws IOException {
        return new RealResponseBody(response.headers(), ModifyQuickBalanceActivity.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountActivity) new C10273a(this.alZ.getSource())));
    }

    public final void cancel() {
        FramedStream framedStream = this.alZ;
        if (framedStream != null) {
            framedStream.closeLater(ErrorCode.CANCEL);
        }
    }

    /* renamed from: okhttp3.repackaged.internal.http.Http2xStream$a */
    class C10273a extends onMenuTopUpClick {
        public C10273a(HowToAddAccountActivity howToAddAccountActivity) {
            super(howToAddAccountActivity);
        }

        public void close() throws IOException {
            Http2xStream.this.streamAllocation.streamFinished(false, Http2xStream.this);
            super.close();
        }
    }
}

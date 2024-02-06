package okhttp3.repackaged.internal.http;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.repackaged.CacheControl;
import okhttp3.repackaged.Headers;
import okhttp3.repackaged.Request;
import okhttp3.repackaged.Response;

public final class CacheStrategy {
    public final Response cacheResponse;
    public final Request networkRequest;

    private CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.cacheControl().isPrivate() == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCacheable(okhttp3.repackaged.Response r3, okhttp3.repackaged.Request r4) {
        /*
            int r0 = r3.code()
            r1 = 0
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 410(0x19a, float:5.75E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 414(0x19e, float:5.8E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 501(0x1f5, float:7.02E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 203(0xcb, float:2.84E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 204(0xcc, float:2.86E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 307(0x133, float:4.3E-43)
            if (r0 == r2) goto L_0x0031
            r2 = 308(0x134, float:4.32E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 404(0x194, float:5.66E-43)
            if (r0 == r2) goto L_0x0059
            r2 = 405(0x195, float:5.68E-43)
            if (r0 == r2) goto L_0x0059
            switch(r0) {
                case 300: goto L_0x0059;
                case 301: goto L_0x0059;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0058
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L_0x0059
            okhttp3.repackaged.CacheControl r0 = r3.cacheControl()
            int r0 = r0.maxAgeSeconds()
            r2 = -1
            if (r0 != r2) goto L_0x0059
            okhttp3.repackaged.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L_0x0059
            okhttp3.repackaged.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPrivate()
            if (r0 != 0) goto L_0x0059
        L_0x0058:
            return r1
        L_0x0059:
            okhttp3.repackaged.CacheControl r3 = r3.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L_0x006e
            okhttp3.repackaged.CacheControl r3 = r4.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L_0x006e
            r1 = 1
        L_0x006e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.repackaged.internal.http.CacheStrategy.isCacheable(okhttp3.repackaged.Response, okhttp3.repackaged.Request):boolean");
    }

    public static class Factory {
        final Request aix;
        private Date alr;
        private String als;
        private Date alt;
        private String alu;
        private Date alv;
        private long alw;
        private long alx;
        private String aly;
        private int alz = -1;
        final Response cacheResponse;
        final long nowMillis;

        public Factory(long j, Request request, Response response) {
            this.nowMillis = j;
            this.aix = request;
            this.cacheResponse = response;
            if (response != null) {
                Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String name = headers.name(i);
                    String value = headers.value(i);
                    if ("Date".equalsIgnoreCase(name)) {
                        this.alr = HttpDate.parse(value);
                        this.als = value;
                    } else if ("Expires".equalsIgnoreCase(name)) {
                        this.alv = HttpDate.parse(value);
                    } else if ("Last-Modified".equalsIgnoreCase(name)) {
                        this.alt = HttpDate.parse(value);
                        this.alu = value;
                    } else if ("ETag".equalsIgnoreCase(name)) {
                        this.aly = value;
                    } else if ("Age".equalsIgnoreCase(name)) {
                        this.alz = HeaderParser.parseSeconds(value, -1);
                    } else if (OkHeaders.SENT_MILLIS.equalsIgnoreCase(name)) {
                        this.alw = Long.parseLong(value);
                    } else if (OkHeaders.RECEIVED_MILLIS.equalsIgnoreCase(name)) {
                        this.alx = Long.parseLong(value);
                    }
                }
            }
        }

        public CacheStrategy get() {
            CacheStrategy uT = m6111uT();
            return (uT.networkRequest == null || !this.aix.cacheControl().onlyIfCached()) ? uT : new CacheStrategy((Request) null, (Response) null);
        }

        /* renamed from: uT */
        private CacheStrategy m6111uT() {
            if (this.cacheResponse == null) {
                return new CacheStrategy(this.aix, (Response) null);
            }
            if (this.aix.isHttps() && this.cacheResponse.handshake() == null) {
                return new CacheStrategy(this.aix, (Response) null);
            }
            if (!CacheStrategy.isCacheable(this.cacheResponse, this.aix)) {
                return new CacheStrategy(this.aix, (Response) null);
            }
            CacheControl cacheControl = this.aix.cacheControl();
            if (cacheControl.noCache() || m6110g(this.aix)) {
                return new CacheStrategy(this.aix, (Response) null);
            }
            long uV = m6113uV();
            long uU = m6112uU();
            if (cacheControl.maxAgeSeconds() != -1) {
                uU = Math.min(uU, TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds()));
            }
            long j = 0;
            long millis = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis((long) cacheControl.minFreshSeconds()) : 0;
            CacheControl cacheControl2 = this.cacheResponse.cacheControl();
            if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) cacheControl.maxStaleSeconds());
            }
            if (!cacheControl2.noCache()) {
                long j2 = millis + uV;
                if (j2 < j + uU) {
                    Response.Builder newBuilder = this.cacheResponse.newBuilder();
                    if (j2 >= uU) {
                        newBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (uV > 86400000 && m6114uW()) {
                        newBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new CacheStrategy((Request) null, newBuilder.build());
                }
            }
            Request.Builder newBuilder2 = this.aix.newBuilder();
            String str = this.aly;
            if (str != null) {
                newBuilder2.header("If-None-Match", str);
            } else if (this.alt != null) {
                newBuilder2.header("If-Modified-Since", this.alu);
            } else if (this.alr != null) {
                newBuilder2.header("If-Modified-Since", this.als);
            }
            Request build = newBuilder2.build();
            return m6110g(build) ? new CacheStrategy(build, this.cacheResponse) : new CacheStrategy(build, (Response) null);
        }

        /* renamed from: uU */
        private long m6112uU() {
            CacheControl cacheControl = this.cacheResponse.cacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds());
            }
            if (this.alv != null) {
                Date date = this.alr;
                long time = this.alv.getTime() - (date != null ? date.getTime() : this.alx);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.alt == null || this.cacheResponse.request().url().query() != null) {
                return 0;
            } else {
                Date date2 = this.alr;
                long time2 = (date2 != null ? date2.getTime() : this.alw) - this.alt.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: uV */
        private long m6113uV() {
            Date date = this.alr;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.alx - date.getTime());
            }
            if (this.alz != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) this.alz));
            }
            long j2 = this.alx;
            return j + (j2 - this.alw) + (this.nowMillis - j2);
        }

        /* renamed from: uW */
        private boolean m6114uW() {
            return this.cacheResponse.cacheControl().maxAgeSeconds() == -1 && this.alv == null;
        }

        /* renamed from: g */
        private static boolean m6110g(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }
    }
}

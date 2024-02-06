package p040o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import p040o.C10885rotate;
import p040o.Matrix3f;
import p040o.computeCofactor;
import p040o.finish;
import p040o.isComplex;
import p040o.loadProjectionNormalized;
import p040o.loadRotate;
import p040o.loadScale;
import p040o.loadTranslate;
import p040o.scale;
import p040o.set;

/* renamed from: o.translate */
public final class translate implements nAllocationCopyToBitmap {
    private final ConnectivityManager IconCompatParcelizer;
    private final CreditCardCaptureModule_GetIParametersFactory MediaBrowserCompat$CustomActionResultReceiver;
    private URL MediaBrowserCompat$ItemReceiver;
    private final CreditCardCaptureModule_GetIParametersFactory read;
    private final DataEncoder write = new JsonDataEncoderBuilder().configureWith(loadMultiply.IconCompatParcelizer).ignoreNullValues(true).build();

    /* renamed from: o.translate$read */
    public static final class read {
        final URL IconCompatParcelizer;
        public final transpose MediaBrowserCompat$ItemReceiver;
        public final String write;

        public read(URL url, transpose transpose, String str) {
            this.IconCompatParcelizer = url;
            this.MediaBrowserCompat$ItemReceiver = transpose;
            this.write = str;
        }
    }

    public translate(Context context, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory2) {
        this.IconCompatParcelizer = (ConnectivityManager) context.getSystemService("connectivity");
        this.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(C7236load.write);
        this.read = creditCardCaptureModule_GetIParametersFactory2;
        this.MediaBrowserCompat$CustomActionResultReceiver = creditCardCaptureModule_GetIParametersFactory;
    }

    private static URL MediaBrowserCompat$ItemReceiver(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid url: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final finish IconCompatParcelizer(rsnSystemGetPointerSize rsnsystemgetpointersize) {
        Matrix3f.IconCompatParcelizer iconCompatParcelizer;
        HashMap hashMap = new HashMap();
        for (loadProjectionNormalized next : rsnsystemgetpointersize.write()) {
            String MediaBrowserCompat$CustomActionResultReceiver2 = next.MediaBrowserCompat$CustomActionResultReceiver();
            if (!hashMap.containsKey(MediaBrowserCompat$CustomActionResultReceiver2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(MediaBrowserCompat$CustomActionResultReceiver2, arrayList);
            } else {
                ((List) hashMap.get(MediaBrowserCompat$CustomActionResultReceiver2)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            loadProjectionNormalized loadprojectionnormalized = (loadProjectionNormalized) ((List) entry.getValue()).get(0);
            computeCofactor.read read2 = new scale.IconCompatParcelizer().MediaBrowserCompat$CustomActionResultReceiver(inverse.DEFAULT).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver()).read(this.read.MediaBrowserCompat$ItemReceiver()).read(new loadIdentity$MediaBrowserCompat$ItemReceiver().IconCompatParcelizer(C10885rotate.read.ANDROID_FIREBASE).MediaBrowserCompat$CustomActionResultReceiver(new loadRotate.IconCompatParcelizer().IconCompatParcelizer(Integer.valueOf(loadprojectionnormalized.IconCompatParcelizer("sdk-version"))).MediaBrowserCompat$CustomActionResultReceiver(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver("model")).MediaBrowserCompat$ItemReceiver(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver("hardware")).IconCompatParcelizer(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver("device")).MediaDescriptionCompat(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver("product")).RatingCompat(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver("os-uild")).write(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver("manufacturer")).read(loadprojectionnormalized.MediaBrowserCompat$ItemReceiver("fingerprint")).read()).MediaBrowserCompat$ItemReceiver());
            try {
                read2.MediaBrowserCompat$ItemReceiver(Integer.valueOf(Integer.parseInt((String) entry.getKey())));
            } catch (NumberFormatException unused) {
                read2.IconCompatParcelizer((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (loadProjectionNormalized loadprojectionnormalized2 : (List) entry.getValue()) {
                RSIllegalArgumentException IconCompatParcelizer2 = loadprojectionnormalized2.IconCompatParcelizer();
                Float4 float4 = IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver;
                if (float4.equals(new Float4("proto"))) {
                    iconCompatParcelizer = new loadScale.write().MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.write);
                } else if (float4.equals(new Float4("json"))) {
                    iconCompatParcelizer = new loadScale.write().read(new String(IconCompatParcelizer2.write, Charset.forName("UTF-8")));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("TransportRuntime.");
                    sb.append("CctTransportBackend");
                    Log.w(sb.toString(), String.format("Received event of unsupported encoding %s. Skipping...", new Object[]{float4}));
                }
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(loadprojectionnormalized2.MediaBrowserCompat$ItemReceiver()).read(loadprojectionnormalized2.RatingCompat()).MediaBrowserCompat$CustomActionResultReceiver(loadprojectionnormalized2.read("tz-offset")).read(new set.read().MediaBrowserCompat$ItemReceiver(loadTranslate.read.zzt.get(loadprojectionnormalized2.IconCompatParcelizer("net-type"))).MediaBrowserCompat$ItemReceiver(loadTranslate.IconCompatParcelizer.zzv.get(loadprojectionnormalized2.IconCompatParcelizer("mobile-subtype"))).IconCompatParcelizer());
                if (loadprojectionnormalized2.read() != null) {
                    iconCompatParcelizer.read(loadprojectionnormalized2.read());
                }
                arrayList3.add(iconCompatParcelizer.write());
            }
            read2.MediaBrowserCompat$ItemReceiver((List<Matrix3f>) arrayList3);
            arrayList2.add(read2.write());
        }
        multiply multiply = new multiply(arrayList2);
        URL url = this.MediaBrowserCompat$ItemReceiver;
        String str = null;
        if (rsnsystemgetpointersize.read() != null) {
            try {
                String str2 = new String(rsnsystemgetpointersize.read(), Charset.forName("UTF-8"));
                if (str2.startsWith("1$")) {
                    String[] split = str2.substring(2).split(Pattern.quote("\\"), 2);
                    if (split.length == 2) {
                        String str3 = split[0];
                        if (!str3.isEmpty()) {
                            String str4 = split[1];
                            if (str4.isEmpty()) {
                                str4 = null;
                            }
                            C7236load load = new C7236load(str3, str4);
                            if (load.IconCompatParcelizer != null) {
                                str = load.IconCompatParcelizer;
                            }
                            if (load.read != null) {
                                url = MediaBrowserCompat$ItemReceiver(load.read);
                            }
                        } else {
                            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                        }
                    } else {
                        throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                    }
                } else {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
            } catch (IllegalArgumentException unused2) {
                return new finish(finish.IconCompatParcelizer.FATAL_ERROR, -1);
            }
        }
        try {
            translate$MediaBrowserCompat$ItemReceiver translate_mediabrowsercompat_itemreceiver = (translate$MediaBrowserCompat$ItemReceiver) AlertController$RecycleListView.read(new read(url, multiply, str), new isComplex.C137414(this), rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.read);
            if (translate_mediabrowsercompat_itemreceiver.write == 200) {
                return new finish(finish.IconCompatParcelizer.OK, translate_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
            }
            int i = translate_mediabrowsercompat_itemreceiver.write;
            if (i >= 500 || i == 404) {
                return new finish(finish.IconCompatParcelizer.TRANSIENT_ERROR, -1);
            }
            return new finish(finish.IconCompatParcelizer.FATAL_ERROR, -1);
        } catch (IOException e) {
            AlertController$RecycleListView.write("CctTransportBackend", "Could not make request to the backend", (Throwable) e);
            return new finish(finish.IconCompatParcelizer.TRANSIENT_ERROR, -1);
        }
    }

    public final loadProjectionNormalized IconCompatParcelizer(loadProjectionNormalized loadprojectionnormalized) {
        int i;
        int i2;
        NetworkInfo activeNetworkInfo = this.IconCompatParcelizer.getActiveNetworkInfo();
        loadProjectionNormalized.IconCompatParcelizer write2 = loadprojectionnormalized.MediaDescriptionCompat().write("sdk-version", Build.VERSION.SDK_INT).write("model", Build.MODEL).write("hardware", Build.HARDWARE).write("device", Build.DEVICE).write("product", Build.PRODUCT).write("os-uild", Build.ID).write("manufacturer", Build.MANUFACTURER).write("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        loadProjectionNormalized.IconCompatParcelizer read2 = write2.read("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (activeNetworkInfo == null) {
            i = loadTranslate.read.NONE.zzu;
        } else {
            i = activeNetworkInfo.getType();
        }
        loadProjectionNormalized.IconCompatParcelizer write3 = read2.write("net-type", i);
        if (activeNetworkInfo == null) {
            i2 = loadTranslate.IconCompatParcelizer.UNKNOWN_MOBILE_SUBTYPE.zzw;
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                i2 = loadTranslate.IconCompatParcelizer.COMBINED.zzw;
            } else if (loadTranslate.IconCompatParcelizer.zzv.get(i2) == null) {
                i2 = 0;
            }
        }
        return write3.write("mobile-subtype", i2).IconCompatParcelizer();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0114 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0131 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0138 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.translate$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver(p040o.translate.read r14) throws java.io.IOException {
        /*
            r13 = this;
            java.net.URL r0 = r14.IconCompatParcelizer
            java.lang.String r1 = "CctTransportBackend"
            java.lang.String r2 = "Making request to: %s"
            p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((java.lang.String) r1, (java.lang.String) r2, (java.lang.Object) r0)
            java.net.URL r0 = r14.IconCompatParcelizer
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            r2 = 40000(0x9c40, float:5.6052E-41)
            r0.setReadTimeout(r2)
            r2 = 1
            r0.setDoOutput(r2)
            r3 = 0
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "2.2.3"
            r2[r3] = r4
            java.lang.String r3 = "datatransport/%s android/"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "User-Agent"
            r0.setRequestProperty(r3, r2)
            java.lang.String r2 = "gzip"
            java.lang.String r3 = "Content-Encoding"
            r0.setRequestProperty(r3, r2)
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/json"
            r0.setRequestProperty(r4, r5)
            java.lang.String r5 = "Accept-Encoding"
            r0.setRequestProperty(r5, r2)
            java.lang.String r5 = r14.write
            if (r5 == 0) goto L_0x0056
            java.lang.String r6 = "X-Goog-Api-Key"
            r0.setRequestProperty(r6, r5)
        L_0x0056:
            r5 = 0
            r7 = 0
            java.io.OutputStream r8 = r0.getOutputStream()     // Catch:{ EncodingException -> 0x013b, IOException -> 0x0139 }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0132 }
            r9.<init>(r8)     // Catch:{ all -> 0x0132 }
            com.google.firebase.encoders.DataEncoder r10 = r13.write     // Catch:{ all -> 0x012d }
            o.transpose r14 = r14.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x012d }
            java.io.BufferedWriter r11 = new java.io.BufferedWriter     // Catch:{ all -> 0x012d }
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x012d }
            r12.<init>(r9)     // Catch:{ all -> 0x012d }
            r11.<init>(r12)     // Catch:{ all -> 0x012d }
            r10.encode(r14, r11)     // Catch:{ all -> 0x012d }
            r9.close()     // Catch:{ all -> 0x0132 }
            if (r8 == 0) goto L_0x007b
            r8.close()     // Catch:{ EncodingException -> 0x013b, IOException -> 0x0139 }
        L_0x007b:
            int r14 = r0.getResponseCode()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Status Code: "
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            p040o.AlertController$RecycleListView.read((java.lang.String) r1, (java.lang.String) r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Content-Type: "
            r8.append(r9)
            java.lang.String r4 = r0.getHeaderField(r4)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            p040o.AlertController$RecycleListView.read((java.lang.String) r1, (java.lang.String) r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "Content-Encoding: "
            r4.append(r8)
            java.lang.String r8 = r0.getHeaderField(r3)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            p040o.AlertController$RecycleListView.read((java.lang.String) r1, (java.lang.String) r4)
            r1 = 302(0x12e, float:4.23E-43)
            if (r14 == r1) goto L_0x011c
            r1 = 301(0x12d, float:4.22E-43)
            if (r14 == r1) goto L_0x011c
            r1 = 307(0x133, float:4.3E-43)
            if (r14 == r1) goto L_0x011c
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 == r1) goto L_0x00d9
            o.translate$MediaBrowserCompat$ItemReceiver r0 = new o.translate$MediaBrowserCompat$ItemReceiver
            r0.<init>(r14, r7, r5)
            return r0
        L_0x00d9:
            java.io.InputStream r1 = r0.getInputStream()
            java.lang.String r0 = r0.getHeaderField(r3)     // Catch:{ all -> 0x0115 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x00ed
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0115 }
            r0.<init>(r1)     // Catch:{ all -> 0x0115 }
            goto L_0x00ee
        L_0x00ed:
            r0 = r1
        L_0x00ee:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x010e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x010e }
            r3.<init>(r0)     // Catch:{ all -> 0x010e }
            r2.<init>(r3)     // Catch:{ all -> 0x010e }
            o.Matrix4f r2 = p040o.Matrix4f.MediaBrowserCompat$CustomActionResultReceiver(r2)     // Catch:{ all -> 0x010e }
            long r2 = r2.read     // Catch:{ all -> 0x010e }
            o.translate$MediaBrowserCompat$ItemReceiver r4 = new o.translate$MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010e }
            r4.<init>(r14, r7, r2)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0108
            r0.close()     // Catch:{ all -> 0x0115 }
        L_0x0108:
            if (r1 == 0) goto L_0x010d
            r1.close()
        L_0x010d:
            return r4
        L_0x010e:
            r14 = move-exception
            if (r0 == 0) goto L_0x0114
            r0.close()     // Catch:{ all -> 0x0114 }
        L_0x0114:
            throw r14     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r14 = move-exception
            if (r1 == 0) goto L_0x011b
            r1.close()     // Catch:{ all -> 0x011b }
        L_0x011b:
            throw r14
        L_0x011c:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)
            o.translate$MediaBrowserCompat$ItemReceiver r1 = new o.translate$MediaBrowserCompat$ItemReceiver
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            r1.<init>(r14, r2, r5)
            return r1
        L_0x012d:
            r14 = move-exception
            r9.close()     // Catch:{ all -> 0x0131 }
        L_0x0131:
            throw r14     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r14 = move-exception
            if (r8 == 0) goto L_0x0138
            r8.close()     // Catch:{ all -> 0x0138 }
        L_0x0138:
            throw r14     // Catch:{ EncodingException -> 0x013b, IOException -> 0x0139 }
        L_0x0139:
            r14 = move-exception
            goto L_0x013c
        L_0x013b:
            r14 = move-exception
        L_0x013c:
            java.lang.String r0 = "Couldn't encode request, returning with 400"
            p040o.AlertController$RecycleListView.write((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r14)
            o.translate$MediaBrowserCompat$ItemReceiver r14 = new o.translate$MediaBrowserCompat$ItemReceiver
            r0 = 400(0x190, float:5.6E-43)
            r14.<init>(r0, r7, r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.translate.MediaBrowserCompat$CustomActionResultReceiver(o.translate$read):o.translate$MediaBrowserCompat$ItemReceiver");
    }
}

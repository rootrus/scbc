package p040o;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.p085a.C9605b;
import p040o.Keep;

/* renamed from: o.onFilterButtonClick */
public final class onFilterButtonClick {
    private CcSofHybridActivity IconCompatParcelizer = new CcSofHybridActivity();
    public Map<String, String> MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
    private Map<String, Keep.read> MediaBrowserCompat$ItemReceiver;
    public OkHttpClient read = new OkHttpClient();
    public String write = "https://api.beid.io:80";

    private <T> T IconCompatParcelizer(Response response, Type type) throws C9605b {
        if (response == null || type == null) {
            return null;
        }
        if ("byte[]".equals(type.toString())) {
            try {
                return response.body().bytes();
            } catch (IOException e) {
                throw new C9605b((Throwable) e);
            }
        } else if (type.equals(File.class)) {
            return MediaBrowserCompat$CustomActionResultReceiver(response);
        } else {
            try {
                T string = response.body() != null ? response.body().string() : null;
                if (string == null || "".equals(string)) {
                    return null;
                }
                String str = response.headers().get("Content-Type");
                if (str == null) {
                    str = "application/json";
                }
                if (MediaBrowserCompat$CustomActionResultReceiver(str)) {
                    return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(string, type);
                }
                if (type.equals(String.class)) {
                    return string;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Content type \"");
                sb.append(str);
                sb.append("\" is not supported for type: ");
                sb.append(type);
                throw new C9605b(sb.toString(), response.code(), response.headers().toMultimap(), (String) string);
            } catch (IOException e2) {
                throw new C9605b((Throwable) e2);
            }
        }
    }

    private void IconCompatParcelizer(Map<String, String> map, Request.Builder builder) {
        for (Map.Entry next : map.entrySet()) {
            builder.header((String) next.getKey(), MediaBrowserCompat$CustomActionResultReceiver(next.getValue()));
        }
        for (Map.Entry next2 : this.MediaBrowserCompat$CustomActionResultReceiver.entrySet()) {
            if (!map.containsKey(next2.getKey())) {
                builder.header((String) next2.getKey(), MediaBrowserCompat$CustomActionResultReceiver(next2.getValue()));
            }
        }
    }

    private <T> T MediaBrowserCompat$CustomActionResultReceiver(Response response, Type type) throws C9605b {
        String str = null;
        if (!response.isSuccessful()) {
            if (response.body() != null) {
                try {
                    str = response.body().string();
                } catch (IOException e) {
                    throw new C9605b(response.message(), (Throwable) e, response.code(), response.headers().toMultimap());
                }
            }
            throw new C9605b(response.message(), response.code(), response.headers().toMultimap(), str);
        } else if (type != null && response.code() != 204) {
            return IconCompatParcelizer(response, type);
        } else {
            if (response.body() != null) {
                try {
                    response.body().close();
                } catch (Exception e2) {
                    throw new C9605b(response.message(), (Throwable) e2, response.code(), response.headers().toMultimap());
                }
            }
            return null;
        }
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return str != null && (str.matches("(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$") || str.equals("*/*"));
    }

    public static String MediaBrowserCompat$ItemReceiver(String[] strArr) {
        if (strArr.length == 0 || strArr[0].equals("*/*")) {
            return "application/json";
        }
        for (String str : strArr) {
            if (MediaBrowserCompat$CustomActionResultReceiver(str)) {
                return str;
            }
        }
        return strArr[0];
    }

    private RequestBody MediaBrowserCompat$ItemReceiver(Map<String, Object> map) {
        FormBody.Builder builder = new FormBody.Builder();
        for (Map.Entry next : map.entrySet()) {
            builder.add((String) next.getKey(), MediaBrowserCompat$CustomActionResultReceiver(next.getValue()));
        }
        return builder.build();
    }

    public final <T> QuantitySelectionActivity_ViewBinding<T> write(Call call, Type type) throws C9605b {
        try {
            Response execute = call.execute();
            Object MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(execute, type);
            execute.code();
            execute.headers().toMultimap();
            return new QuantitySelectionActivity_ViewBinding<>(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (IOException e) {
            throw new C9605b((Throwable) e);
        }
    }

    public onFilterButtonClick() {
        this.MediaBrowserCompat$CustomActionResultReceiver.put("User-Agent", "Swagger-Codegen/1.0.0/java");
        HashMap hashMap = new HashMap();
        this.MediaBrowserCompat$ItemReceiver = hashMap;
        this.MediaBrowserCompat$ItemReceiver = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032 A[Catch:{ IOException -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[Catch:{ IOException -> 0x008e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File MediaBrowserCompat$CustomActionResultReceiver(okhttp3.Response r8) throws p039io.beid.beidk.p085a.C9605b {
        /*
            r7 = this;
            java.lang.String r0 = "Content-Disposition"
            java.lang.String r0 = r8.header(r0)     // Catch:{ IOException -> 0x008e }
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x002d
            boolean r3 = r2.equals(r0)     // Catch:{ IOException -> 0x008e }
            if (r3 != 0) goto L_0x002d
            java.lang.String r3 = "filename=['\"]?([^'\"\\s]+)['\"]?"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ IOException -> 0x008e }
            java.util.regex.Matcher r0 = r3.matcher(r0)     // Catch:{ IOException -> 0x008e }
            boolean r3 = r0.find()     // Catch:{ IOException -> 0x008e }
            if (r3 == 0) goto L_0x002d
            r3 = 1
            java.lang.String r0 = r0.group(r3)     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = ".*[/\\\\]"
            java.lang.String r0 = r0.replaceAll(r3, r2)     // Catch:{ IOException -> 0x008e }
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            java.lang.String r3 = "download-"
            if (r0 != 0) goto L_0x0033
            goto L_0x0073
        L_0x0033:
            java.lang.String r2 = "."
            int r2 = r0.lastIndexOf(r2)     // Catch:{ IOException -> 0x008e }
            r4 = -1
            java.lang.String r5 = "-"
            if (r2 != r4) goto L_0x004e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008e }
            r2.<init>()     // Catch:{ IOException -> 0x008e }
            r2.append(r0)     // Catch:{ IOException -> 0x008e }
            r2.append(r5)     // Catch:{ IOException -> 0x008e }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x008e }
            goto L_0x0069
        L_0x004e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008e }
            r1.<init>()     // Catch:{ IOException -> 0x008e }
            r4 = 0
            java.lang.String r4 = r0.substring(r4, r2)     // Catch:{ IOException -> 0x008e }
            r1.append(r4)     // Catch:{ IOException -> 0x008e }
            r1.append(r5)     // Catch:{ IOException -> 0x008e }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x008e }
            java.lang.String r0 = r0.substring(r2)     // Catch:{ IOException -> 0x008e }
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0069:
            int r2 = r0.length()     // Catch:{ IOException -> 0x008e }
            r4 = 3
            if (r2 >= r4) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r3 = r0
        L_0x0072:
            r2 = r1
        L_0x0073:
            java.io.File r0 = java.io.File.createTempFile(r3, r2)     // Catch:{ IOException -> 0x008e }
            o.PinChangeActivity r1 = p040o.onSubmit.read((java.io.File) r0)     // Catch:{ IOException -> 0x008e }
            o.NsipPartnerPaymentReviewActivity r1 = p040o.onSubmit.read((p040o.PinChangeActivity) r1)     // Catch:{ IOException -> 0x008e }
            okhttp3.ResponseBody r8 = r8.body()     // Catch:{ IOException -> 0x008e }
            o.NsipPartnerPaymentOtpActivity r8 = r8.source()     // Catch:{ IOException -> 0x008e }
            r1.MediaBrowserCompat$CustomActionResultReceiver((p040o.HowToAddAccountStep2Activity) r8)     // Catch:{ IOException -> 0x008e }
            r1.close()     // Catch:{ IOException -> 0x008e }
            return r0
        L_0x008e:
            r8 = move-exception
            io.beid.beidk.a.b r0 = new io.beid.beidk.a.b
            r0.<init>((java.lang.Throwable) r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onFilterButtonClick.MediaBrowserCompat$CustomActionResultReceiver(okhttp3.Response):java.io.File");
    }

    private String MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj == null) {
            return "";
        }
        if ((obj instanceof Date) || (obj instanceof OffsetDateTime) || (obj instanceof QuickAccountSelectAdapter$UnselectedHolder)) {
            String json = this.IconCompatParcelizer.write.toJson(obj);
            return json.substring(1, json.length() - 1);
        } else if (!(obj instanceof Collection)) {
            return String.valueOf(obj);
        } else {
            StringBuilder sb = new StringBuilder();
            for (Object next : (Collection) obj) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(String.valueOf(next));
            }
            return sb.toString();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [okhttp3.RequestBody] */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Call write(java.lang.String r2, java.lang.String r3, java.util.List<p040o.C1133x65c1ec57> r4, java.util.List<p040o.C1133x65c1ec57> r5, java.lang.Object r6, java.util.Map<java.lang.String, java.lang.String> r7, java.util.Map<java.lang.String, java.lang.Object> r8, java.lang.String[] r9, p040o.C6372x3d677cbb r10) throws p039io.beid.beidk.p085a.C9605b {
        /*
            r1 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r1.write
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = "?"
            if (r4 == 0) goto L_0x0028
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0028
            r2.contains(r10)
            java.util.Iterator r2 = r4.iterator()
        L_0x001e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0028
            r2.next()
            goto L_0x001e
        L_0x0028:
            if (r5 == 0) goto L_0x0045
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = r9.toString()
            r2.contains(r10)
            java.util.Iterator r2 = r5.iterator()
        L_0x003b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0045
            r2.next()
            goto L_0x003b
        L_0x0045:
            java.lang.String r2 = r9.toString()
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder
            r4.<init>()
            okhttp3.Request$Builder r2 = r4.url((java.lang.String) r2)
            r1.IconCompatParcelizer((java.util.Map<java.lang.String, java.lang.String>) r7, (okhttp3.Request.Builder) r2)
            java.lang.String r4 = "Content-Type"
            java.lang.Object r4 = r7.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0061
            java.lang.String r4 = "application/json"
        L_0x0061:
            boolean r5 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r3)
            r7 = 0
            if (r5 != 0) goto L_0x0069
            goto L_0x00cf
        L_0x0069:
            java.lang.String r5 = "application/x-www-form-urlencoded"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0076
            okhttp3.RequestBody r7 = r1.MediaBrowserCompat$ItemReceiver((java.util.Map<java.lang.String, java.lang.Object>) r8)
            goto L_0x00cf
        L_0x0076:
            java.lang.String r5 = "multipart/form-data"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0083
            okhttp3.RequestBody r7 = r1.read(r8)
            goto L_0x00cf
        L_0x0083:
            if (r6 != 0) goto L_0x0099
            java.lang.String r5 = "DELETE"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x008e
            goto L_0x00cf
        L_0x008e:
            okhttp3.MediaType r4 = okhttp3.MediaType.parse(r4)
            java.lang.String r5 = ""
            okhttp3.RequestBody r7 = okhttp3.RequestBody.create((okhttp3.MediaType) r4, (java.lang.String) r5)
            goto L_0x00cf
        L_0x0099:
            boolean r5 = r6 instanceof byte[]
            if (r5 == 0) goto L_0x00a8
            okhttp3.MediaType r4 = okhttp3.MediaType.parse(r4)
            byte[] r6 = (byte[]) r6
            okhttp3.RequestBody r7 = okhttp3.RequestBody.create((okhttp3.MediaType) r4, (byte[]) r6)
            goto L_0x00cf
        L_0x00a8:
            boolean r5 = r6 instanceof java.io.File
            if (r5 == 0) goto L_0x00b7
            okhttp3.MediaType r4 = okhttp3.MediaType.parse(r4)
            java.io.File r6 = (java.io.File) r6
            okhttp3.RequestBody r7 = okhttp3.RequestBody.create((okhttp3.MediaType) r4, (java.io.File) r6)
            goto L_0x00cf
        L_0x00b7:
            boolean r5 = MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r4)
            if (r5 == 0) goto L_0x00de
            if (r6 == 0) goto L_0x00c7
            o.CcSofHybridActivity r5 = r1.IconCompatParcelizer
            com.google.gson.Gson r5 = r5.write
            java.lang.String r7 = r5.toJson((java.lang.Object) r6)
        L_0x00c7:
            okhttp3.MediaType r4 = okhttp3.MediaType.parse(r4)
            okhttp3.RequestBody r7 = okhttp3.RequestBody.create((okhttp3.MediaType) r4, (java.lang.String) r7)
        L_0x00cf:
            okhttp3.Request$Builder r2 = r2.method(r3, r7)
            okhttp3.Request r2 = r2.build()
            okhttp3.OkHttpClient r3 = r1.read
            okhttp3.Call r2 = r3.newCall(r2)
            return r2
        L_0x00de:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Content type \""
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "\" is not supported"
            r2.append(r3)
            io.beid.beidk.a.b r3 = new io.beid.beidk.a.b
            java.lang.String r2 = r2.toString()
            r3.<init>((java.lang.String) r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onFilterButtonClick.write(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.Object, java.util.Map, java.util.Map, java.lang.String[], o.CcSofCreditCardOnlyActivity$MediaBrowserCompat$CustomActionResultReceiver):okhttp3.Call");
    }

    private RequestBody read(Map<String, Object> map) {
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MultipartBody.FORM);
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() instanceof File) {
                File file = (File) next.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=\"");
                sb.append((String) next.getKey());
                sb.append("\"; filename=\"");
                sb.append(file.getName());
                sb.append("\"");
                Headers of = Headers.m3581of("Content-Disposition", sb.toString());
                String guessContentTypeFromName = URLConnection.guessContentTypeFromName(file.getName());
                if (guessContentTypeFromName == null) {
                    guessContentTypeFromName = "application/octet-stream";
                }
                builder.addPart(of, RequestBody.create(MediaType.parse(guessContentTypeFromName), file));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=\"");
                sb2.append((String) next.getKey());
                sb2.append("\"");
                builder.addPart(Headers.m3581of("Content-Disposition", sb2.toString()), RequestBody.create((MediaType) null, MediaBrowserCompat$CustomActionResultReceiver(next.getValue())));
            }
        }
        return builder.build();
    }
}

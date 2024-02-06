package p040o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.util.zip.GZIPInputStream;

/* renamed from: o.ETBEligibilityAdapter$EligibilityHolder_ViewBinding */
public class ETBEligibilityAdapter$EligibilityHolder_ViewBinding extends ETBSaleSheetSubAccountAdapter$ETBSaleSheetHolder {
    public ETBEligibilityAdapter$EligibilityHolder_ViewBinding(String str) {
        super(str);
    }

    public ETBEligibilityAdapter$EligibilityHolder_ViewBinding(String str, int i) {
        super(str, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List read(java.lang.String r17, p040o.IssuerSearchAdapter$CustomViewHolder r18, java.util.List r19) throws org.ksoap2.transport.HttpResponseException, java.io.IOException, org.xmlpull.p042v1.XmlPullParserException {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.write(r2, r0)
            boolean r3 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r4 = 0
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            goto L_0x0016
        L_0x0015:
            r3 = r4
        L_0x0016:
            r1.write = r3
            o.BusinessAndMaritalInfoInputViewHolder_ViewBinding r3 = r16.read()
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = "ksoap2-android/2.6.0+"
            r3.MediaBrowserCompat$CustomActionResultReceiver(r5, r6)
            int r5 = r2.read
            r6 = 120(0x78, float:1.68E-43)
            if (r5 == r6) goto L_0x0030
            java.lang.String r5 = "SOAPAction"
            r7 = r17
            r3.MediaBrowserCompat$CustomActionResultReceiver(r5, r7)
        L_0x0030:
            int r5 = r2.read
            java.lang.String r7 = "Content-Type"
            if (r5 != r6) goto L_0x003c
            java.lang.String r5 = "application/soap+xml;charset=utf-8"
            r3.MediaBrowserCompat$CustomActionResultReceiver(r7, r5)
            goto L_0x0041
        L_0x003c:
            java.lang.String r5 = "text/xml;charset=utf-8"
            r3.MediaBrowserCompat$CustomActionResultReceiver(r7, r5)
        L_0x0041:
            java.lang.String r5 = "gzip"
            java.lang.String r6 = "Accept-Encoding"
            r3.MediaBrowserCompat$CustomActionResultReceiver(r6, r5)
            java.lang.String r6 = "POST"
            r3.write(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r8 = r0.length
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "Content-Length"
            r3.MediaBrowserCompat$CustomActionResultReceiver(r8, r6)
            int r6 = r0.length
            r3.read(r6)
            java.io.OutputStream r6 = r3.MediaDescriptionCompat()
            int r8 = r0.length
            r9 = 0
            r6.write(r0, r9, r8)
            r6.flush()
            r6.close()
            int r0 = r3.read()
            r8 = 1
            java.util.List r10 = r3.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x010f }
            r11 = r9
            r12 = r11
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x007f:
            int r14 = r10.size()     // Catch:{ IOException -> 0x010a }
            if (r11 >= r14) goto L_0x00d0
            java.lang.Object r14 = r10.get(r11)     // Catch:{ IOException -> 0x010a }
            o.IssuerSearchAdapter$CustomViewHolder_ViewBinding r14 = (p040o.IssuerSearchAdapter$CustomViewHolder_ViewBinding) r14     // Catch:{ IOException -> 0x010a }
            java.lang.String r15 = r14.read     // Catch:{ IOException -> 0x010a }
            if (r15 != 0) goto L_0x0090
            goto L_0x00cd
        L_0x0090:
            java.lang.String r15 = r14.read     // Catch:{ IOException -> 0x010a }
            java.lang.String r6 = "content-length"
            boolean r6 = r15.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x010a }
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = r14.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x010a }
            if (r6 == 0) goto L_0x00a7
            java.lang.String r6 = r14.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NumberFormatException -> 0x00a5 }
            int r13 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00a5 }
            goto L_0x00a7
        L_0x00a5:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            java.lang.String r6 = r14.read     // Catch:{ IOException -> 0x010a }
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ IOException -> 0x010a }
            if (r6 == 0) goto L_0x00ba
            java.lang.String r6 = r14.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x010a }
            java.lang.String r15 = "xml"
            boolean r6 = r6.contains(r15)     // Catch:{ IOException -> 0x010a }
            if (r6 == 0) goto L_0x00ba
            r9 = r8
        L_0x00ba:
            java.lang.String r6 = r14.read     // Catch:{ IOException -> 0x010a }
            java.lang.String r15 = "Content-Encoding"
            boolean r6 = r6.equalsIgnoreCase(r15)     // Catch:{ IOException -> 0x010a }
            if (r6 == 0) goto L_0x00cd
            java.lang.String r6 = r14.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x010a }
            boolean r6 = r6.equalsIgnoreCase(r5)     // Catch:{ IOException -> 0x010a }
            if (r6 == 0) goto L_0x00cd
            r12 = r8
        L_0x00cd:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x00d0:
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x00f3
            if (r13 <= 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00e7
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x010a }
            java.io.InputStream r5 = r3.write()     // Catch:{ IOException -> 0x010a }
            r0.<init>(r5, r13)     // Catch:{ IOException -> 0x010a }
            java.io.InputStream r0 = write(r0)     // Catch:{ IOException -> 0x010a }
            goto L_0x0146
        L_0x00e7:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x010a }
            java.io.InputStream r5 = r3.write()     // Catch:{ IOException -> 0x010a }
            r0.<init>(r5, r13)     // Catch:{ IOException -> 0x010a }
            goto L_0x0146
        L_0x00f1:
            r0 = r4
            goto L_0x0146
        L_0x00f3:
            org.ksoap2.transport.HttpResponseException r5 = new org.ksoap2.transport.HttpResponseException     // Catch:{ IOException -> 0x010a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010a }
            r6.<init>()     // Catch:{ IOException -> 0x010a }
            java.lang.String r7 = "HTTP request failed, HTTP status: "
            r6.append(r7)     // Catch:{ IOException -> 0x010a }
            r6.append(r0)     // Catch:{ IOException -> 0x010a }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x010a }
            r5.<init>(r0)     // Catch:{ IOException -> 0x010a }
            throw r5     // Catch:{ IOException -> 0x010a }
        L_0x010a:
            r0 = move-exception
            r6 = r13
            r5 = r9
            r9 = r12
            goto L_0x0114
        L_0x010f:
            r0 = move-exception
            r10 = r4
            r5 = r9
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0114:
            if (r6 <= 0) goto L_0x0130
            if (r9 == 0) goto L_0x0126
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream
            java.io.InputStream r9 = r3.IconCompatParcelizer()
            r7.<init>(r9, r6)
            java.io.InputStream r7 = write(r7)
            goto L_0x0131
        L_0x0126:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream
            java.io.InputStream r9 = r3.IconCompatParcelizer()
            r7.<init>(r9, r6)
            goto L_0x0131
        L_0x0130:
            r7 = r4
        L_0x0131:
            boolean r9 = r0 instanceof org.ksoap2.transport.HttpResponseException
            if (r9 == 0) goto L_0x0144
            if (r5 != 0) goto L_0x0144
            boolean r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x0140
            if (r7 == 0) goto L_0x0140
            MediaBrowserCompat$CustomActionResultReceiver(r7, r6, r4)
        L_0x0140:
            r3.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0144:
            r13 = r6
            r0 = r7
        L_0x0146:
            boolean r5 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 == 0) goto L_0x014e
            java.io.InputStream r0 = MediaBrowserCompat$CustomActionResultReceiver(r0, r13, r4)
        L_0x014e:
            o.ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder_ViewBinding r5 = new o.ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder_ViewBinding
            r5.<init>()
            java.lang.String r6 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5.setFeature(r6, r8)
            r5.setInput(r0, r4)
            r2.IconCompatParcelizer(r5)
            r0.close()
            r3.MediaBrowserCompat$CustomActionResultReceiver()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ETBEligibilityAdapter$EligibilityHolder_ViewBinding.read(java.lang.String, o.IssuerSearchAdapter$CustomViewHolder, java.util.List):java.util.List");
    }

    private static InputStream MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, int i, File file) throws IOException {
        if (i <= 0) {
            i = 262144;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        byte[] bArr = new byte[256];
        while (true) {
            int read = inputStream.read(bArr, 0, 256);
            if (read == -1) {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                inputStream.close();
                return new ByteArrayInputStream(byteArray);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private static InputStream write(InputStream inputStream) throws IOException {
        try {
            return (GZIPInputStream) inputStream;
        } catch (ClassCastException unused) {
            return new GZIPInputStream(inputStream);
        }
    }

    public BusinessAndMaritalInfoInputViewHolder_ViewBinding read() throws IOException {
        return new ETBSaleSheetAccountTypeAdapter$ETBSaleSheetHolder((Proxy) null, this.MediaBrowserCompat$ItemReceiver, this.read);
    }
}

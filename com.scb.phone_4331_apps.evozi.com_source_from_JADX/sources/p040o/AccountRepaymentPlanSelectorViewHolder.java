package p040o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.util.zip.GZIPInputStream;

/* renamed from: o.AccountRepaymentPlanSelectorViewHolder */
public class AccountRepaymentPlanSelectorViewHolder extends BusinessAndMaritalInfoNationalIdViewHolder_ViewBinding {
    public AccountRepaymentPlanSelectorViewHolder(String str, int i) {
        super(str, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List write(java.lang.String r17, p040o.LendingIssuerAdapter$IssuerViewHolder_ViewBinding r18, java.util.List r19) throws org.ksoap2.repackaged.transport.HttpResponseException, java.io.IOException, org.xmlpull.repackaged.p103v1.XmlPullParserException {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            if (r17 != 0) goto L_0x0009
            java.lang.String r0 = "\"\""
            goto L_0x000b
        L_0x0009:
            r0 = r17
        L_0x000b:
            java.lang.String r3 = "UTF-8"
            byte[] r3 = r1.MediaBrowserCompat$CustomActionResultReceiver(r2, r3)
            boolean r4 = r1.write
            r5 = 0
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            goto L_0x001d
        L_0x001c:
            r4 = r5
        L_0x001d:
            r1.IconCompatParcelizer = r4
            r1.RatingCompat = r5
            o.BusinessAndMaritalInfoInputViewHolder_ViewBinding r4 = r16.read()
            java.lang.String r6 = "User-Agent"
            java.lang.String r7 = "ksoap2-android/2.6.0+"
            r4.MediaBrowserCompat$CustomActionResultReceiver(r6, r7)
            int r6 = r2.MediaMetadataCompat
            r7 = 120(0x78, float:1.68E-43)
            if (r6 == r7) goto L_0x0037
            java.lang.String r6 = "SOAPAction"
            r4.MediaBrowserCompat$CustomActionResultReceiver(r6, r0)
        L_0x0037:
            int r0 = r2.MediaMetadataCompat
            java.lang.String r6 = "Content-Type"
            if (r0 != r7) goto L_0x0043
            java.lang.String r0 = "application/soap+xml;charset=utf-8"
            r4.MediaBrowserCompat$CustomActionResultReceiver(r6, r0)
            goto L_0x0048
        L_0x0043:
            java.lang.String r0 = "text/xml;charset=utf-8"
            r4.MediaBrowserCompat$CustomActionResultReceiver(r6, r0)
        L_0x0048:
            java.lang.String r0 = "gzip"
            java.lang.String r7 = "Accept-Encoding"
            r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r0)
            java.lang.String r7 = "POST"
            r4.write(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = r3.length
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Content-Length"
            r4.MediaBrowserCompat$CustomActionResultReceiver(r8, r7)
            int r7 = r3.length
            r4.read(r7)
            java.io.OutputStream r7 = r4.MediaDescriptionCompat()
            int r8 = r3.length
            r9 = 0
            r7.write(r3, r9, r8)
            r7.flush()
            r7.close()
            int r3 = r4.read()
            java.util.List r8 = r4.MediaBrowserCompat$ItemReceiver()     // Catch:{ IOException -> 0x011a }
            r10 = r9
            r11 = r10
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0085:
            int r13 = r8.size()     // Catch:{ IOException -> 0x0115 }
            if (r10 >= r13) goto L_0x00d7
            java.lang.Object r13 = r8.get(r10)     // Catch:{ IOException -> 0x0115 }
            o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder_ViewBinding r13 = (p040o.C10397x8e7fc506) r13     // Catch:{ IOException -> 0x0115 }
            java.lang.String r14 = r13.write     // Catch:{ IOException -> 0x0115 }
            r15 = 1
            if (r14 != 0) goto L_0x0097
            goto L_0x00d4
        L_0x0097:
            java.lang.String r14 = r13.write     // Catch:{ IOException -> 0x0115 }
            java.lang.String r7 = "content-length"
            boolean r7 = r14.equalsIgnoreCase(r7)     // Catch:{ IOException -> 0x0115 }
            if (r7 == 0) goto L_0x00ae
            java.lang.String r7 = r13.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x0115 }
            if (r7 == 0) goto L_0x00ae
            java.lang.String r7 = r13.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NumberFormatException -> 0x00ac }
            int r12 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x00ac }
            goto L_0x00ae
        L_0x00ac:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x00ae:
            java.lang.String r7 = r13.write     // Catch:{ IOException -> 0x0115 }
            boolean r7 = r7.equalsIgnoreCase(r6)     // Catch:{ IOException -> 0x0115 }
            if (r7 == 0) goto L_0x00c1
            java.lang.String r7 = r13.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x0115 }
            java.lang.String r14 = "xml"
            boolean r7 = r7.contains(r14)     // Catch:{ IOException -> 0x0115 }
            if (r7 == 0) goto L_0x00c1
            r9 = r15
        L_0x00c1:
            java.lang.String r7 = r13.write     // Catch:{ IOException -> 0x0115 }
            java.lang.String r14 = "Content-Encoding"
            boolean r7 = r7.equalsIgnoreCase(r14)     // Catch:{ IOException -> 0x0115 }
            if (r7 == 0) goto L_0x00d4
            java.lang.String r7 = r13.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x0115 }
            boolean r7 = r7.equalsIgnoreCase(r0)     // Catch:{ IOException -> 0x0115 }
            if (r7 == 0) goto L_0x00d4
            r11 = r15
        L_0x00d4:
            int r10 = r10 + 1
            goto L_0x0085
        L_0x00d7:
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x00f7
            r0 = 202(0xca, float:2.83E-43)
            if (r3 != r0) goto L_0x00e0
            goto L_0x00f7
        L_0x00e0:
            org.ksoap2.repackaged.transport.HttpResponseException r0 = new org.ksoap2.repackaged.transport.HttpResponseException     // Catch:{ IOException -> 0x0115 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0115 }
            r6.<init>()     // Catch:{ IOException -> 0x0115 }
            java.lang.String r7 = "HTTP request failed, HTTP status: "
            r6.append(r7)     // Catch:{ IOException -> 0x0115 }
            r6.append(r3)     // Catch:{ IOException -> 0x0115 }
            java.lang.String r3 = r6.toString()     // Catch:{ IOException -> 0x0115 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0115 }
            throw r0     // Catch:{ IOException -> 0x0115 }
        L_0x00f7:
            if (r12 <= 0) goto L_0x0113
            if (r11 == 0) goto L_0x0109
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0115 }
            java.io.InputStream r3 = r4.write()     // Catch:{ IOException -> 0x0115 }
            r0.<init>(r3, r12)     // Catch:{ IOException -> 0x0115 }
            java.io.InputStream r0 = read(r0)     // Catch:{ IOException -> 0x0115 }
            goto L_0x0151
        L_0x0109:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0115 }
            java.io.InputStream r3 = r4.write()     // Catch:{ IOException -> 0x0115 }
            r0.<init>(r3, r12)     // Catch:{ IOException -> 0x0115 }
            goto L_0x0151
        L_0x0113:
            r0 = r5
            goto L_0x0151
        L_0x0115:
            r0 = move-exception
            r7 = r12
            r3 = r9
            r9 = r11
            goto L_0x011f
        L_0x011a:
            r0 = move-exception
            r8 = r5
            r3 = r9
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x011f:
            if (r7 <= 0) goto L_0x013b
            if (r9 == 0) goto L_0x0131
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream
            java.io.InputStream r9 = r4.IconCompatParcelizer()
            r6.<init>(r9, r7)
            java.io.InputStream r6 = read(r6)
            goto L_0x013c
        L_0x0131:
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream
            java.io.InputStream r9 = r4.IconCompatParcelizer()
            r6.<init>(r9, r7)
            goto L_0x013c
        L_0x013b:
            r6 = r5
        L_0x013c:
            boolean r9 = r0 instanceof org.ksoap2.repackaged.transport.HttpResponseException
            if (r9 == 0) goto L_0x014f
            if (r3 != 0) goto L_0x014f
            boolean r2 = r1.write
            if (r2 == 0) goto L_0x014b
            if (r6 == 0) goto L_0x014b
            r1.MediaBrowserCompat$CustomActionResultReceiver(r6, r7, r5)
        L_0x014b:
            r4.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x014f:
            r0 = r6
            r12 = r7
        L_0x0151:
            boolean r3 = r1.write
            if (r3 == 0) goto L_0x0159
            java.io.InputStream r0 = r1.MediaBrowserCompat$CustomActionResultReceiver(r0, r12, r5)
        L_0x0159:
            if (r0 == 0) goto L_0x016e
            o.ETBSelectionAdapter$OneButtonHolder_ViewBinding r3 = new o.ETBSelectionAdapter$OneButtonHolder_ViewBinding
            r3.<init>()
            java.lang.String r5 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r3.write((java.lang.String) r5)
            r3.read((java.io.InputStream) r0)
            r2.IconCompatParcelizer((p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding) r3)
            r0.close()
        L_0x016e:
            r4.MediaBrowserCompat$CustomActionResultReceiver()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountRepaymentPlanSelectorViewHolder.write(java.lang.String, o.LendingIssuerAdapter$IssuerViewHolder_ViewBinding, java.util.List):java.util.List");
    }

    private InputStream MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, int i, File file) throws IOException {
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
                this.RatingCompat = new String(byteArray);
                inputStream.close();
                return new ByteArrayInputStream(byteArray);
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private static InputStream read(InputStream inputStream) throws IOException {
        try {
            return (GZIPInputStream) inputStream;
        } catch (ClassCastException unused) {
            return new GZIPInputStream(inputStream);
        }
    }

    public BusinessAndMaritalInfoInputViewHolder_ViewBinding read() throws IOException {
        return new BusinessAndMaritalInfoRadioChoiceViewHolder_ViewBinding((Proxy) null, this.MediaBrowserCompat$SearchResultReceiver, this.MediaDescriptionCompat);
    }
}

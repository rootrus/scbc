package p040o;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.json.JSONObject;

/* renamed from: o.validateSPR2 */
public final class validateSPR2 {
    public static final String write = new C6555xdccae8ee().MediaBrowserCompat$ItemReceiver("AES", 256).MediaBrowserCompat$ItemReceiver(McElieceCCA2KeyGenParameterSpec.SHA256).write.toString();

    /* renamed from: o.validateSPR2$write */
    static class write {
        int IconCompatParcelizer = 128;
        String MediaBrowserCompat$CustomActionResultReceiver = "AES";
        boolean MediaBrowserCompat$ItemReceiver = false;
        boolean read = false;
        String write = McElieceCCA2KeyGenParameterSpec.SHA256;

        write() {
        }
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, String str5) {
        return IconCompatParcelizer(str, str2, str3, AlertController$RecycleListView.IconCompatParcelizer(str4), str5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        if ("SM4".equals(r6.MediaBrowserCompat$CustomActionResultReceiver) != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String IconCompatParcelizer(java.lang.String r9, java.lang.String r10, java.lang.String r11, byte[] r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "AES"
            java.lang.String r1 = "symmetric"
            java.lang.String r2 = "hash"
            java.lang.String r3 = "symmetricKeyLength"
            java.lang.String r4 = "symmetricAlgo"
            java.lang.String r5 = "hashAlgo"
            o.validateSPR2$write r6 = new o.validateSPR2$write
            r6.<init>()
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ce }
            r7.<init>(r9)     // Catch:{ Exception -> 0x01ce }
            boolean r8 = r7.has(r2)     // Catch:{ Exception -> 0x01ce }
            if (r8 == 0) goto L_0x0028
            boolean r8 = r7.isNull(r2)     // Catch:{ Exception -> 0x01ce }
            if (r8 != 0) goto L_0x0028
            boolean r2 = r7.getBoolean(r2)     // Catch:{ Exception -> 0x01ce }
            r6.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ Exception -> 0x01ce }
        L_0x0028:
            boolean r2 = r7.has(r5)     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x0048
            boolean r2 = r7.isNull(r5)     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r7.getString(r5)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = r2.trim()     // Catch:{ Exception -> 0x01ce }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x0048
            java.lang.String r2 = r7.getString(r5)     // Catch:{ Exception -> 0x01ce }
            r6.write = r2     // Catch:{ Exception -> 0x01ce }
        L_0x0048:
            boolean r2 = r7.has(r1)     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x005a
            boolean r2 = r7.isNull(r1)     // Catch:{ Exception -> 0x01ce }
            if (r2 != 0) goto L_0x005a
            boolean r1 = r7.getBoolean(r1)     // Catch:{ Exception -> 0x01ce }
            r6.read = r1     // Catch:{ Exception -> 0x01ce }
        L_0x005a:
            boolean r1 = r7.has(r4)     // Catch:{ Exception -> 0x01ce }
            if (r1 == 0) goto L_0x007a
            boolean r1 = r7.isNull(r4)     // Catch:{ Exception -> 0x01ce }
            if (r1 != 0) goto L_0x007a
            java.lang.String r1 = r7.getString(r4)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x01ce }
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x01ce }
            if (r1 != 0) goto L_0x007a
            java.lang.String r1 = r7.getString(r4)     // Catch:{ Exception -> 0x01ce }
            r6.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ Exception -> 0x01ce }
        L_0x007a:
            boolean r1 = r7.has(r3)     // Catch:{ Exception -> 0x01ce }
            if (r1 == 0) goto L_0x0092
            boolean r1 = r7.isNull(r3)     // Catch:{ Exception -> 0x01ce }
            if (r1 != 0) goto L_0x0092
            int r1 = r7.getInt(r3)     // Catch:{ Exception -> 0x01ce }
            if (r1 <= 0) goto L_0x0092
            int r1 = r7.getInt(r3)     // Catch:{ Exception -> 0x01ce }
            r6.IconCompatParcelizer = r1     // Catch:{ Exception -> 0x01ce }
        L_0x0092:
            boolean r1 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x01ce }
            if (r1 == 0) goto L_0x01ae
            boolean r1 = r6.read     // Catch:{ Exception -> 0x01ce }
            if (r1 == 0) goto L_0x01ae
            java.lang.String r1 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x01ce }
            boolean r1 = r0.equals(r1)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = "SM4"
            if (r1 != 0) goto L_0x00ac
            java.lang.String r1 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x01ce }
            boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x01ce }
            if (r1 == 0) goto L_0x01ae
        L_0x00ac:
            java.security.Key r9 = p040o.validateSYMV.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r10)     // Catch:{ Exception -> 0x01ce }
            byte[] r10 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((java.lang.String) r11)     // Catch:{ Exception -> 0x01ce }
            int r11 = r6.IconCompatParcelizer     // Catch:{ Exception -> 0x01ce }
            int r11 = r11 / 8
            byte[] r11 = p040o.validateSYMV.MediaBrowserCompat$CustomActionResultReceiver((int) r11)     // Catch:{ Exception -> 0x01ce }
            r1 = 16
            byte[] r3 = p040o.validateSYMV.MediaBrowserCompat$CustomActionResultReceiver((int) r1)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r4 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x01ce }
            boolean r4 = r0.equals(r4)     // Catch:{ Exception -> 0x01ce }
            if (r4 == 0) goto L_0x00d5
            java.security.Key r0 = p040o.validateSYMV.MediaBrowserCompat$CustomActionResultReceiver(r11, r0)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = "AES/CBC/Pkcs5Padding"
            byte[] r12 = p040o.validateSYMV.IconCompatParcelizer(r0, r12, r2, r3)     // Catch:{ Exception -> 0x01ce }
            goto L_0x00e7
        L_0x00d5:
            java.lang.String r0 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x01ce }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x0195
            boolean r0 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver()     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x018d
            byte[] r12 = p040o.C6554xc460715d.IconCompatParcelizer(r11, r12, r3)     // Catch:{ Exception -> 0x01ce }
        L_0x00e7:
            java.lang.String r0 = "SHA-256"
            java.lang.String r2 = r6.write     // Catch:{ Exception -> 0x01ce }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x01ce }
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "SM3"
            java.lang.String r2 = r6.write     // Catch:{ Exception -> 0x01ce }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x01ce }
            if (r0 == 0) goto L_0x00fc
            goto L_0x0115
        L_0x00fc:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r9.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r10 = "Unsupported hash algorithm: "
            r9.append(r10)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r10 = r6.write     // Catch:{ Exception -> 0x01ce }
            r9.append(r10)     // Catch:{ Exception -> 0x01ce }
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01ce }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01ce }
            r10.<init>(r9)     // Catch:{ Exception -> 0x01ce }
            throw r10     // Catch:{ Exception -> 0x01ce }
        L_0x0115:
            r0 = 2
            byte[][] r2 = new byte[r0][]     // Catch:{ Exception -> 0x01ce }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x01ce }
            r5 = 1
            r2[r5] = r12     // Catch:{ Exception -> 0x01ce }
            byte[] r2 = p040o.AlertController$RecycleListView.read((byte[][]) r2)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = r6.write     // Catch:{ Exception -> 0x01ce }
            byte[] r2 = p040o.validateSYMV.IconCompatParcelizer((java.lang.String) r6, (byte[]) r2)     // Catch:{ Exception -> 0x01ce }
            r6 = 4
            byte[][] r7 = new byte[r6][]     // Catch:{ Exception -> 0x01ce }
            r7[r4] = r11     // Catch:{ Exception -> 0x01ce }
            r7[r5] = r2     // Catch:{ Exception -> 0x01ce }
            r7[r0] = r10     // Catch:{ Exception -> 0x01ce }
            r10 = 3
            r7[r10] = r3     // Catch:{ Exception -> 0x01ce }
            byte[] r11 = p040o.AlertController$RecycleListView.read((byte[][]) r7)     // Catch:{ Exception -> 0x01ce }
            byte[] r1 = p040o.validateSYMV.MediaBrowserCompat$CustomActionResultReceiver((int) r1)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r2 = "RSA/ECB/OAEPWithSHA1AndMGF1Padding"
            byte[] r9 = p040o.validateSYMV.IconCompatParcelizer(r9, r11, r2, r1)     // Catch:{ Exception -> 0x01ce }
            r11 = 6
            byte[][] r11 = new byte[r11][]     // Catch:{ Exception -> 0x01ce }
            byte[] r2 = new byte[r5]     // Catch:{ Exception -> 0x01ce }
            r2[r4] = r0     // Catch:{ Exception -> 0x01ce }
            r11[r4] = r2     // Catch:{ Exception -> 0x01ce }
            int r2 = r1.length     // Catch:{ Exception -> 0x01ce }
            byte[] r2 = p040o.AlertController$RecycleListView.write((int) r2, (int) r5)     // Catch:{ Exception -> 0x01ce }
            r11[r5] = r2     // Catch:{ Exception -> 0x01ce }
            r11[r0] = r1     // Catch:{ Exception -> 0x01ce }
            int r1 = r9.length     // Catch:{ Exception -> 0x01ce }
            byte[] r0 = p040o.AlertController$RecycleListView.write((int) r1, (int) r0)     // Catch:{ Exception -> 0x01ce }
            r11[r10] = r0     // Catch:{ Exception -> 0x01ce }
            r11[r6] = r9     // Catch:{ Exception -> 0x01ce }
            r9 = 5
            r11[r9] = r12     // Catch:{ Exception -> 0x01ce }
            byte[] r9 = p040o.AlertController$RecycleListView.read((byte[][]) r11)     // Catch:{ Exception -> 0x01ce }
            byte[] r9 = p040o.validateSPR.IconCompatParcelizer(r9)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r9 = p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((byte[]) r9)     // Catch:{ Exception -> 0x01ce }
            if (r13 == 0) goto L_0x018c
            java.lang.String r10 = r13.trim()     // Catch:{ Exception -> 0x01ce }
            boolean r10 = r10.isEmpty()     // Catch:{ Exception -> 0x01ce }
            if (r10 != 0) goto L_0x018c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r10.<init>()     // Catch:{ Exception -> 0x01ce }
            r10.append(r13)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r11 = ","
            r10.append(r11)     // Catch:{ Exception -> 0x01ce }
            r10.append(r9)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x01ce }
        L_0x018c:
            return r9
        L_0x018d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01ce }
            java.lang.String r10 = "SM Crypto library cannot be found"
            r9.<init>(r10)     // Catch:{ Exception -> 0x01ce }
            throw r9     // Catch:{ Exception -> 0x01ce }
        L_0x0195:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r9.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r10 = "Unsupported symmetric algorithm: "
            r9.append(r10)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r10 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x01ce }
            r9.append(r10)     // Catch:{ Exception -> 0x01ce }
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01ce }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01ce }
            r10.<init>(r9)     // Catch:{ Exception -> 0x01ce }
            throw r10     // Catch:{ Exception -> 0x01ce }
        L_0x01ae:
            boolean r0 = r6.read     // Catch:{ Exception -> 0x01ce }
            if (r0 != 0) goto L_0x01b7
            java.lang.String r9 = read(r6, r10, r11, r12, r13)     // Catch:{ Exception -> 0x01ce }
            return r9
        L_0x01b7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01ce }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ce }
            r11.<init>()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r12 = "Invalid cipher params combination, cipherParams="
            r11.append(r12)     // Catch:{ Exception -> 0x01ce }
            r11.append(r9)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x01ce }
            r10.<init>(r9)     // Catch:{ Exception -> 0x01ce }
            throw r10     // Catch:{ Exception -> 0x01ce }
        L_0x01ce:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = "Failed to encrypt"
            r10.<init>(r11, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.validateSPR2.IconCompatParcelizer(java.lang.String, java.lang.String, java.lang.String, byte[], java.lang.String):java.lang.String");
    }

    private static String read(write write2, String str, String str2, byte[] bArr, String str3) throws Exception {
        Key MediaBrowserCompat$CustomActionResultReceiver = validateSYMV.MediaBrowserCompat$CustomActionResultReceiver(str);
        byte[] MediaBrowserCompat$ItemReceiver = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(str2);
        byte[] bArr2 = new byte[0];
        if (write2.MediaBrowserCompat$ItemReceiver) {
            bArr2 = validateSYMV.IconCompatParcelizer(McElieceCCA2KeyGenParameterSpec.SHA256, bArr);
        }
        byte[] read = AlertController$RecycleListView.read(bArr, bArr2, MediaBrowserCompat$ItemReceiver);
        byte[] MediaBrowserCompat$CustomActionResultReceiver2 = validateSYMV.MediaBrowserCompat$CustomActionResultReceiver(16);
        byte[] IconCompatParcelizer = validateSYMV.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, read, "RSA/ECB/OAEPWithSHA1AndMGF1Padding", MediaBrowserCompat$CustomActionResultReceiver2);
        StringBuilder sb = new StringBuilder();
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(validateSPR.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2)));
        sb.append(":");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(validateSPR.IconCompatParcelizer(IconCompatParcelizer)));
        String obj = sb.toString();
        if (str3 == null || str3.trim().isEmpty()) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(",");
        sb2.append(obj);
        return sb2.toString();
    }

    static {
        JSONObject jSONObject = new C6555xdccae8ee().MediaBrowserCompat$ItemReceiver(McElieceCCA2KeyGenParameterSpec.SHA256).write;
        JSONObject jSONObject2 = new C6555xdccae8ee().MediaBrowserCompat$ItemReceiver("AES", 128).MediaBrowserCompat$ItemReceiver(McElieceCCA2KeyGenParameterSpec.SHA256).write;
        JSONObject jSONObject3 = new C6555xdccae8ee().MediaBrowserCompat$ItemReceiver("SM4", 128).MediaBrowserCompat$ItemReceiver("SM3").write;
    }
}

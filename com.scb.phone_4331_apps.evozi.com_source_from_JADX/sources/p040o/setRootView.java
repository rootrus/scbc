package p040o;

import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* renamed from: o.setRootView */
public final class setRootView {
    private static final char[] IconCompatParcelizer = {'A', 'n', 'd', 'r', 'o', 'i', 'd', 'K', 'e', 'y', 'S', 't', 'o', 'r', 'e'};
    private static final char[] read = {'k', 'e', 'y', 'A', 'l', 'i', 'a', 's'};
    private static final char[] write = {'e', 'n', 'c', 'r', 'y', 'p', 't', 'e', 'd', 'K', 'e', 'y'};
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final WeakReference<Context> MediaBrowserCompat$ItemReceiver;
    private KeyStore MediaBrowserCompat$MediaItem;
    private final EditRecipientActivity MediaMetadataCompat;

    public setRootView(EditRecipientActivity editRecipientActivity, WeakReference<Context> weakReference) {
        onGetStartedClick.write((Object) weakReference, "context");
        this.MediaMetadataCompat = editRecipientActivity;
        this.MediaBrowserCompat$ItemReceiver = weakReference;
    }

    private final Key read() throws Exception {
        EditRecipientActivity editRecipientActivity = this.MediaMetadataCompat;
        String MediaBrowserCompat$ItemReceiver2 = editRecipientActivity != null ? editRecipientActivity.MediaBrowserCompat$ItemReceiver(new String(write)) : null;
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            return null;
        }
        if (MediaBrowserCompat$ItemReceiver2.length() == 0) {
            return null;
        }
        byte[] decode = Base64.decode(MediaBrowserCompat$ItemReceiver2, 0);
        onGetStartedClick.IconCompatParcelizer((Object) decode, "encryptedKey");
        return new SecretKeySpec(MediaBrowserCompat$ItemReceiver(decode), "RSA");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        try {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                Context context = this.MediaBrowserCompat$ItemReceiver.get();
                if (context != null) {
                    onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                    read(context);
                    MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMailingAddressLandingFragment.ERROR_INIT_HASH_UTIL);
        }
    }

    private final void read(Context context) throws Exception {
        KeyStore instance = KeyStore.getInstance(new String(IconCompatParcelizer));
        this.MediaBrowserCompat$MediaItem = instance;
        if (instance != null) {
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!instance.containsAlias(new String(read))) {
                Calendar instance2 = Calendar.getInstance();
                Calendar instance3 = Calendar.getInstance();
                instance3.add(1, 30);
                KeyPairGeneratorSpec.Builder alias = new KeyPairGeneratorSpec.Builder(context).setAlias(new String(read));
                StringBuilder sb = new StringBuilder();
                sb.append("CN=");
                sb.append(read);
                KeyPairGeneratorSpec.Builder serialNumber = alias.setSubject(new X500Principal(sb.toString())).setSerialNumber(BigInteger.TEN);
                onGetStartedClick.IconCompatParcelizer((Object) instance2, "start");
                KeyPairGeneratorSpec.Builder startDate = serialNumber.setStartDate(instance2.getTime());
                onGetStartedClick.IconCompatParcelizer((Object) instance3, "end");
                KeyPairGeneratorSpec build = startDate.setEndDate(instance3.getTime()).build();
                onGetStartedClick.IconCompatParcelizer((Object) build, "KeyPairGeneratorSpec.Bui…                 .build()");
                KeyPairGenerator instance4 = KeyPairGenerator.getInstance("RSA", new String(IconCompatParcelizer));
                instance4.initialize(build);
                instance4.generateKeyPair();
                instance.load((KeyStore.LoadStoreParameter) null);
            }
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver() throws Exception {
        EditRecipientActivity editRecipientActivity = this.MediaMetadataCompat;
        CharSequence MediaBrowserCompat$ItemReceiver2 = editRecipientActivity != null ? editRecipientActivity.MediaBrowserCompat$ItemReceiver(new String(write)) : null;
        if (MediaBrowserCompat$ItemReceiver2 == null || MediaBrowserCompat$ItemReceiver2.length() == 0) {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String encodeToString = Base64.encodeToString(MediaBrowserCompat$CustomActionResultReceiver(bArr), 0);
            EditRecipientActivity editRecipientActivity2 = this.MediaMetadataCompat;
            if (editRecipientActivity2 != null) {
                editRecipientActivity2.MediaBrowserCompat$ItemReceiver(new String(write), encodeToString);
            } else {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressLandingFragment.PREFERENCES_NULL);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] MediaBrowserCompat$CustomActionResultReceiver(byte[] r7) throws java.lang.Exception {
        /*
            r6 = this;
            java.security.KeyStore r0 = r6.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = new java.lang.String
            char[] r1 = IconCompatParcelizer
            r0.<init>(r1)
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            r6.MediaBrowserCompat$MediaItem = r0
        L_0x0011:
            java.security.KeyStore r0 = r6.MediaBrowserCompat$MediaItem
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = new java.lang.String
            char[] r3 = read
            r2.<init>(r3)
            java.security.cert.Certificate r0 = r0.getCertificate(r2)
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0076
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            if (r2 == 0) goto L_0x0037
            r3 = 1
            java.security.PublicKey r0 = r0.getPublicKey()
            java.security.Key r0 = (java.security.Key) r0
            r2.init(r3, r0)
        L_0x0037:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.Closeable r0 = (java.io.Closeable) r0
            r3 = r0
            java.io.ByteArrayOutputStream r3 = (java.io.ByteArrayOutputStream) r3     // Catch:{ all -> 0x006f }
            javax.crypto.CipherOutputStream r4 = new javax.crypto.CipherOutputStream     // Catch:{ all -> 0x006f }
            r5 = r3
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch:{ all -> 0x006f }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x006f }
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ all -> 0x006f }
            r2 = r4
            javax.crypto.CipherOutputStream r2 = (javax.crypto.CipherOutputStream) r2     // Catch:{ all -> 0x0068 }
            r2.write(r7)     // Catch:{ all -> 0x0068 }
            o.HmlVerifyPhoneValidateOtpActivity r7 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0068 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x006f }
            byte[] r7 = r3.toByteArray()     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "str.toByteArray()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r2)     // Catch:{ all -> 0x006f }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)
            java.lang.String r0 = "ByteArrayOutputStream().…ByteArray()\n            }"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r7, (java.lang.String) r0)
            return r7
        L_0x0068:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x006a }
        L_0x006a:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r4, (java.lang.Throwable) r7)     // Catch:{ all -> 0x006f }
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r7)
            throw r1
        L_0x0076:
            r7 = 0
            byte[] r7 = new byte[r7]
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setRootView.MediaBrowserCompat$CustomActionResultReceiver(byte[]):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final byte[] MediaBrowserCompat$ItemReceiver(byte[] r6) throws java.lang.Exception {
        /*
            r5 = this;
            java.security.KeyStore r0 = r5.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = new java.lang.String
            char[] r1 = IconCompatParcelizer
            r0.<init>(r1)
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            r5.MediaBrowserCompat$MediaItem = r0
        L_0x0011:
            java.security.KeyStore r0 = r5.MediaBrowserCompat$MediaItem
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = new java.lang.String
            char[] r3 = read
            r2.<init>(r3)
            java.security.Key r0 = r0.getKey(r2, r1)
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            boolean r2 = r0 instanceof java.security.PrivateKey
            if (r2 != 0) goto L_0x0028
            r0 = r1
        L_0x0028:
            java.security.PrivateKey r0 = (java.security.PrivateKey) r0
            if (r0 == 0) goto L_0x007b
            java.lang.String r2 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r2)
            if (r2 == 0) goto L_0x003a
            r3 = 2
            java.security.Key r0 = (java.security.Key) r0
            r2.init(r3, r0)
        L_0x003a:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r6)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r6 = r0
            java.io.ByteArrayInputStream r6 = (java.io.ByteArrayInputStream) r6     // Catch:{ all -> 0x0074 }
            javax.crypto.CipherInputStream r3 = new javax.crypto.CipherInputStream     // Catch:{ all -> 0x0074 }
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch:{ all -> 0x0074 }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x0074 }
            java.io.InputStream r3 = (java.io.InputStream) r3     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "$this$readBytes"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r6)     // Catch:{ all -> 0x0074 }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0074 }
            r2 = 8192(0x2000, float:1.14794E-41)
            int r4 = r3.available()     // Catch:{ all -> 0x0074 }
            int r2 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x0074 }
            r6.<init>(r2)     // Catch:{ all -> 0x0074 }
            r2 = r6
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ all -> 0x0074 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.InputStream) r3, (java.io.OutputStream) r2)     // Catch:{ all -> 0x0074 }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "buffer.toByteArray()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r2)     // Catch:{ all -> 0x0074 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)
            return r6
        L_0x0074:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r6)
            throw r1
        L_0x007b:
            r6 = 0
            byte[] r6 = new byte[r6]
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setRootView.MediaBrowserCompat$ItemReceiver(byte[]):byte[]");
    }

    public final String MediaBrowserCompat$ItemReceiver(String str) throws Exception {
        onGetStartedClick.write((Object) str, "data");
        Charset forName = Charset.forName("UTF-8");
        onGetStartedClick.IconCompatParcelizer((Object) forName, "Charset.forName(charsetName)");
        byte[] bytes = str.getBytes(forName);
        onGetStartedClick.IconCompatParcelizer((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
        instance.init(1, read());
        String encodeToString = Base64.encodeToString(instance.doFinal(bytes), 0);
        onGetStartedClick.IconCompatParcelizer((Object) encodeToString, "Base64.encodeToString(en…dedBytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final String read(String str) throws Exception {
        onGetStartedClick.write((Object) str, "encrypted");
        byte[] decode = Base64.decode(str, 0);
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
        instance.init(2, read());
        byte[] doFinal = instance.doFinal(decode);
        onGetStartedClick.IconCompatParcelizer((Object) doFinal, "output");
        Charset forName = Charset.forName("UTF-8");
        onGetStartedClick.IconCompatParcelizer((Object) forName, "Charset.forName(charsetName)");
        return new String(doFinal, forName);
    }
}

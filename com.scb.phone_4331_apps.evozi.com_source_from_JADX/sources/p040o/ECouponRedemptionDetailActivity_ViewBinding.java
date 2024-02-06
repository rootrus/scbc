package p040o;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: o.ECouponRedemptionDetailActivity_ViewBinding */
public final class ECouponRedemptionDetailActivity_ViewBinding {
    private static AtomicBoolean MediaBrowserCompat$ItemReceiver = new AtomicBoolean(false);

    public static C6440x626e8d3 read(String str) throws InvalidKeyException {
        String[] split = str.split(":");
        if (split.length == 2) {
            byte[] decode = Base64.decode(split[0], 2);
            if (decode.length == 16) {
                byte[] decode2 = Base64.decode(split[1], 2);
                if (decode2.length == 32) {
                    return new C6440x626e8d3(new SecretKeySpec(decode, 0, decode.length, "AES"), new SecretKeySpec(decode2, "HmacSHA256"));
                }
                throw new InvalidKeyException("Base64 decoded key is not 256 bytes");
            }
            throw new InvalidKeyException("Base64 decoded key is not 128 bytes");
        }
        throw new IllegalArgumentException("Cannot parse aesKey:hmacKey");
    }

    public static C6440x626e8d3 write() throws GeneralSecurityException {
        MediaBrowserCompat$CustomActionResultReceiver();
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(128);
        return new C6440x626e8d3(instance.generateKey(), new SecretKeySpec(write(32), "HmacSHA256"));
    }

    public static C6440x626e8d3 write(String str, byte[] bArr, int i) throws GeneralSecurityException {
        MediaBrowserCompat$CustomActionResultReceiver();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, i, 384)).getEncoded();
        byte[] bArr2 = new byte[16];
        System.arraycopy(encoded, 0, bArr2, 0, 16);
        byte[] bArr3 = new byte[32];
        System.arraycopy(encoded, 16, bArr3, 0, 32);
        return new C6440x626e8d3(new SecretKeySpec(bArr2, "AES"), new SecretKeySpec(bArr3, "HmacSHA256"));
    }

    private static byte[] write(int i) throws GeneralSecurityException {
        MediaBrowserCompat$CustomActionResultReceiver();
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!MediaBrowserCompat$ItemReceiver.get()) {
            synchronized (IconCompatParcelizer.class) {
                if (!MediaBrowserCompat$ItemReceiver.get()) {
                    IconCompatParcelizer.write();
                    MediaBrowserCompat$ItemReceiver.set(true);
                }
            }
        }
    }

    /* renamed from: o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private static final byte[] IconCompatParcelizer = MediaBrowserCompat$ItemReceiver();

        private IconCompatParcelizer() {
        }

        /* renamed from: o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer$write */
        static class write extends Provider {
            public write() {
                super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
                put("SecureRandom.SHA1PRNG", C6438xb0d03eeb.class.getName());
                put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
            }
        }

        /* access modifiers changed from: private */
        public static byte[] IconCompatParcelizer() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(IconCompatParcelizer);
                dataOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new SecurityException("Failed to generate seed", e);
            }
        }

        private static String read() {
            try {
                return (String) Build.class.getField("SERIAL").get((Object) null);
            } catch (Exception unused) {
                return null;
            }
        }

        private static byte[] MediaBrowserCompat$ItemReceiver() {
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str != null) {
                sb.append(str);
            }
            String read = read();
            if (read != null) {
                sb.append(read);
            }
            try {
                return sb.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("UTF-8 encoding not supported");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
            if (r0[0].getClass().getSimpleName().equals(p040o.ECouponRedemptionDetailActivity_ViewBinding.IconCompatParcelizer.write.class.getSimpleName()) != false) goto L_0x00ae;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void write() {
            /*
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 18
                r2 = 0
                r3 = 0
                r4 = 1
                r5 = 16
                if (r0 < r5) goto L_0x007e
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 > r1) goto L_0x007e
                java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.NativeCrypto"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0075 }
                java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0075 }
                java.lang.Class<byte[]> r6 = byte[].class
                r5[r3] = r6     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = "RAND_seed"
                java.lang.reflect.Method r0 = r0.getMethod(r6, r5)     // Catch:{ Exception -> 0x0075 }
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0075 }
                byte[] r6 = IconCompatParcelizer()     // Catch:{ Exception -> 0x0075 }
                r5[r3] = r6     // Catch:{ Exception -> 0x0075 }
                r0.invoke(r2, r5)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.NativeCrypto"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0075 }
                r5 = 2
                java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0075 }
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r6[r3] = r7     // Catch:{ Exception -> 0x0075 }
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0075 }
                r6[r4] = r7     // Catch:{ Exception -> 0x0075 }
                java.lang.String r7 = "RAND_load_file"
                java.lang.reflect.Method r0 = r0.getMethod(r7, r6)     // Catch:{ Exception -> 0x0075 }
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = "/dev/urandom"
                r5[r3] = r6     // Catch:{ Exception -> 0x0075 }
                r6 = 1024(0x400, float:1.435E-42)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0075 }
                r5[r4] = r7     // Catch:{ Exception -> 0x0075 }
                java.lang.Object r0 = r0.invoke(r2, r5)     // Catch:{ Exception -> 0x0075 }
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0075 }
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x0075 }
                if (r0 != r6) goto L_0x005e
                goto L_0x007e
            L_0x005e:
                java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x0075 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
                r2.<init>()     // Catch:{ Exception -> 0x0075 }
                java.lang.String r3 = "Unexpected number of bytes read from Linux PRNG: "
                r2.append(r3)     // Catch:{ Exception -> 0x0075 }
                r2.append(r0)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0075 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0075 }
                throw r1     // Catch:{ Exception -> 0x0075 }
            L_0x0075:
                r0 = move-exception
                java.lang.SecurityException r1 = new java.lang.SecurityException
                java.lang.String r2 = "Failed to seed OpenSSL PRNG"
                r1.<init>(r2, r0)
                throw r1
            L_0x007e:
                int r0 = android.os.Build.VERSION.SDK_INT
                if (r0 > r1) goto L_0x0135
                java.lang.String r0 = "SecureRandom.SHA1PRNG"
                java.security.Provider[] r0 = java.security.Security.getProviders(r0)
                java.lang.Class<java.security.Security> r1 = java.security.Security.class
                monitor-enter(r1)
                if (r0 == 0) goto L_0x00a6
                int r5 = r0.length     // Catch:{ all -> 0x0132 }
                if (r5 <= 0) goto L_0x00a6
                r0 = r0[r3]     // Catch:{ all -> 0x0132 }
                java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0132 }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x0132 }
                java.lang.Class<o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer$write> r3 = p040o.ECouponRedemptionDetailActivity_ViewBinding.IconCompatParcelizer.write.class
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0132 }
                boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0132 }
                if (r0 != 0) goto L_0x00ae
            L_0x00a6:
                o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer$write r0 = new o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer$write     // Catch:{ all -> 0x0132 }
                r0.<init>()     // Catch:{ all -> 0x0132 }
                java.security.Security.insertProviderAt(r0, r4)     // Catch:{ all -> 0x0132 }
            L_0x00ae:
                java.security.SecureRandom r0 = new java.security.SecureRandom     // Catch:{ all -> 0x0132 }
                r0.<init>()     // Catch:{ all -> 0x0132 }
                java.security.Provider r3 = r0.getProvider()     // Catch:{ all -> 0x0132 }
                java.lang.Class r3 = r3.getClass()     // Catch:{ all -> 0x0132 }
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0132 }
                java.lang.Class<o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer$write> r4 = p040o.ECouponRedemptionDetailActivity_ViewBinding.IconCompatParcelizer.write.class
                java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x0132 }
                boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0132 }
                if (r3 == 0) goto L_0x0113
                java.lang.String r0 = "SHA1PRNG"
                java.security.SecureRandom r2 = java.security.SecureRandom.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00d2 }
                goto L_0x00da
            L_0x00d2:
                r0 = move-exception
                java.lang.SecurityException r3 = new java.lang.SecurityException     // Catch:{ all -> 0x0132 }
                java.lang.String r4 = "SHA1PRNG not available"
                r3.<init>(r4, r0)     // Catch:{ all -> 0x0132 }
            L_0x00da:
                java.security.Provider r0 = r2.getProvider()     // Catch:{ all -> 0x0132 }
                java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0132 }
                java.lang.String r0 = r0.getSimpleName()     // Catch:{ all -> 0x0132 }
                java.lang.Class<o.ECouponRedemptionDetailActivity_ViewBinding$IconCompatParcelizer$write> r3 = p040o.ECouponRedemptionDetailActivity_ViewBinding.IconCompatParcelizer.write.class
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x0132 }
                boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0132 }
                if (r0 == 0) goto L_0x00f4
                monitor-exit(r1)
                return
            L_0x00f4:
                java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x0132 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
                r3.<init>()     // Catch:{ all -> 0x0132 }
                java.lang.String r4 = "SecureRandom.getInstance(\"SHA1PRNG\") backed by wrong Provider: "
                r3.append(r4)     // Catch:{ all -> 0x0132 }
                java.security.Provider r2 = r2.getProvider()     // Catch:{ all -> 0x0132 }
                java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0132 }
                r3.append(r2)     // Catch:{ all -> 0x0132 }
                java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0132 }
                r0.<init>(r2)     // Catch:{ all -> 0x0132 }
                throw r0     // Catch:{ all -> 0x0132 }
            L_0x0113:
                java.lang.SecurityException r2 = new java.lang.SecurityException     // Catch:{ all -> 0x0132 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
                r3.<init>()     // Catch:{ all -> 0x0132 }
                java.lang.String r4 = "new SecureRandom() backed by wrong Provider: "
                r3.append(r4)     // Catch:{ all -> 0x0132 }
                java.security.Provider r0 = r0.getProvider()     // Catch:{ all -> 0x0132 }
                java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0132 }
                r3.append(r0)     // Catch:{ all -> 0x0132 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0132 }
                r2.<init>(r0)     // Catch:{ all -> 0x0132 }
                throw r2     // Catch:{ all -> 0x0132 }
            L_0x0132:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0135:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ECouponRedemptionDetailActivity_ViewBinding.IconCompatParcelizer.write():void");
        }
    }

    private static byte[] IconCompatParcelizer(C6439x870a5304 eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, C6440x626e8d3 eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) throws GeneralSecurityException {
        byte[] bArr = eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        byte[] bArr2 = eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.read;
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        boolean z = false;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        SecretKey secretKey = eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.read;
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKey);
        byte[] doFinal = instance.doFinal(bArr3);
        byte[] bArr4 = eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (doFinal.length == bArr4.length) {
            byte b = 0;
            for (int i = 0; i < doFinal.length; i++) {
                b |= doFinal[i] ^ bArr4[i];
            }
            if (b == 0) {
                z = true;
            }
        }
        if (z) {
            Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance2.init(2, eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.write, new IvParameterSpec(eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
            return instance2.doFinal(eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.read);
        }
        throw new GeneralSecurityException("MAC stored in civ does not match computed MAC.");
    }

    public static String MediaBrowserCompat$ItemReceiver(C6439x870a5304 eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, C6440x626e8d3 eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) throws UnsupportedEncodingException, GeneralSecurityException {
        return new String(IconCompatParcelizer(eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver), "UTF-8");
    }

    public static C6439x870a5304 MediaBrowserCompat$ItemReceiver(String str, C6440x626e8d3 eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver) throws UnsupportedEncodingException, GeneralSecurityException {
        byte[] bytes = str.getBytes("UTF-8");
        byte[] write = write(16);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.write, new IvParameterSpec(write));
        byte[] iv = instance.getIV();
        byte[] doFinal = instance.doFinal(bytes);
        byte[] bArr = new byte[(iv.length + doFinal.length)];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
        SecretKey secretKey = eCouponRedemptionDetailActivity_ViewBinding$MediaBrowserCompat$ItemReceiver.read;
        Mac instance2 = Mac.getInstance("HmacSHA256");
        instance2.init(secretKey);
        return new C6439x870a5304(doFinal, iv, instance2.doFinal(bArr));
    }
}

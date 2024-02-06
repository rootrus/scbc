package p040o;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: o.validateSYMV */
public final class validateSYMV {
    private static final IvParameterSpec IconCompatParcelizer = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final IvParameterSpec write = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});

    static {
        AlertController$RecycleListView.IconCompatParcelizer("secret00");
        try {
            if (Security.getProvider("SunJCE") == null) {
                Security.addProvider((Provider) Class.forName("com.sun.crypto.provider.SunJCE").newInstance());
            }
        } catch (Throwable unused) {
        }
        try {
            if (Security.getProvider("IBMJCE") == null) {
                Security.addProvider((Provider) Class.forName("com.ibm.crypto.provider.IBMJCE").newInstance());
            }
        } catch (Throwable unused2) {
        }
        try {
            if (Security.getProvider("IBMJCA") == null) {
                Security.addProvider((Provider) Class.forName("com.ibm.crypto.provider.IBMJCA").newInstance());
            }
        } catch (Throwable unused3) {
        }
        try {
            if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
                Security.addProvider((Provider) Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider").newInstance());
            }
        } catch (Throwable unused4) {
        }
        for (int i = 1; i <= 100; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("isprint.security.provider.");
            sb.append(i);
            String property = System.getProperty(sb.toString());
            if (property == null || property.length() < 0) {
                break;
            }
            try {
                Security.addProvider((Provider) Class.forName(property).newInstance());
            } catch (Throwable unused5) {
            }
        }
        new SecureRandom();
    }

    public static byte[] MediaBrowserCompat$CustomActionResultReceiver(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static byte[] IconCompatParcelizer(String str, byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(str);
        instance.update(bArr);
        return instance.digest();
    }

    public static Key MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException {
        return new SecretKeySpec(bArr, str);
    }

    private static byte[] IconCompatParcelizer(byte[] bArr, int i) {
        if (bArr.length == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length && i2 < i) {
            bArr2[i2] = bArr[i2];
            i2++;
        }
        return bArr2;
    }

    public static Key MediaBrowserCompat$CustomActionResultReceiver(String str) {
        try {
            String[] split = str.split(",", 2);
            return KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(1, AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(split[0])), new BigInteger(1, AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(split[1]))));
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to restore RSA key", e);
        }
    }

    public static byte[] IconCompatParcelizer(Key key, byte[] bArr, String str, byte[] bArr2) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException {
        IvParameterSpec ivParameterSpec;
        OAEPParameterSpec oAEPParameterSpec;
        Cipher instance = Cipher.getInstance(str);
        if (str.indexOf("/OAEPWithSHA1AndMGF1Padding") >= 0) {
            if (bArr2 == null || bArr2.length == 0) {
                oAEPParameterSpec = OAEPParameterSpec.DEFAULT;
            } else {
                oAEPParameterSpec = new OAEPParameterSpec(OAEPParameterSpec.DEFAULT.getDigestAlgorithm(), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), OAEPParameterSpec.DEFAULT.getMGFParameters(), new PSource.PSpecified(bArr2));
            }
            instance.init(1, key, oAEPParameterSpec);
        } else if (str.indexOf("/ECB") >= 0 || str.indexOf("/SSL") >= 0 || str.indexOf("/NONE") >= 0 || str.indexOf(47) < 0) {
            instance.init(1, key);
        } else {
            int blockSize = instance.getBlockSize();
            if (bArr2 == null || bArr2.length == 0) {
                if (blockSize == 8) {
                    ivParameterSpec = write;
                } else if (blockSize == 16) {
                    ivParameterSpec = IconCompatParcelizer;
                } else {
                    bArr2 = new byte[blockSize];
                }
                instance.init(1, key, ivParameterSpec);
            } else if (bArr2.length < blockSize) {
                bArr2 = IconCompatParcelizer(bArr2, blockSize);
            }
            ivParameterSpec = new IvParameterSpec(bArr2, 0, blockSize);
            instance.init(1, key, ivParameterSpec);
        }
        return instance.doFinal(bArr);
    }
}

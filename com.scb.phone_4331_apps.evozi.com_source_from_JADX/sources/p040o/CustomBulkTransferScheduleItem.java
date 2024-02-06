package p040o;

import android.util.Log;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import net.p088sf.scuba.smartcards.ISO7816;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jmrtd.lds.CVCAFile;
import p104sg.nec.com.epid_sdk_master.crypto.CipherCreateException;

/* renamed from: o.CustomBulkTransferScheduleItem */
public class CustomBulkTransferScheduleItem implements CustomBulkTransferScheduleItem_ViewBinding {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = CustomBulkTransferScheduleItem.class.getName();
    private static byte[] MediaBrowserCompat$ItemReceiver = {65, CVCAFile.CAR_TAG, 67, ISO7816.INS_REHABILITATE_CHV, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80};
    private static Key read = null;

    public final Cipher read(Key key) throws CipherCreateException {
        Cipher read2;
        synchronized (this) {
            try {
                read2 = read(1, key, MediaBrowserCompat$ItemReceiver);
            } catch (InvalidAlgorithmParameterException e) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e);
            } catch (InvalidKeyException e2) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e2);
            } catch (NoSuchAlgorithmException e3) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e3);
            } catch (NoSuchPaddingException e4) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e4);
            } catch (NoSuchProviderException e5) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e5);
            } catch (InstantiationException e6) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e6);
            } catch (IllegalAccessException e7) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e7);
            } catch (ClassNotFoundException e8) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e8);
            } catch (IOException e9) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e9);
            }
        }
        return read2;
    }

    public final Cipher MediaBrowserCompat$CustomActionResultReceiver(Key key) throws CipherCreateException {
        Cipher read2;
        synchronized (this) {
            try {
                read2 = read(2, key, MediaBrowserCompat$ItemReceiver);
            } catch (InvalidAlgorithmParameterException e) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e);
            } catch (InvalidKeyException e2) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e2);
            } catch (NoSuchAlgorithmException e3) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e3);
            } catch (NoSuchPaddingException e4) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e4);
            } catch (NoSuchProviderException e5) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e5);
            } catch (InstantiationException e6) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e6);
            } catch (IllegalAccessException e7) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e7);
            } catch (ClassNotFoundException e8) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e8);
            } catch (IOException e9) {
                Log.d(MediaBrowserCompat$CustomActionResultReceiver, "Exception occurred");
                throw new CipherCreateException(e9);
            }
        }
        return read2;
    }

    private Cipher read(int i, Key key, byte[] bArr) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IOException, NoSuchProviderException, InvalidAlgorithmParameterException {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding", BouncyCastleProvider.PROVIDER_NAME);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        if (key == null) {
            key = MediaBrowserCompat$ItemReceiver();
        }
        instance.init(i, key, ivParameterSpec);
        return instance;
    }

    private Key MediaBrowserCompat$ItemReceiver() throws NoSuchAlgorithmException, NoSuchProviderException {
        Key key;
        synchronized (this) {
            if (read == null) {
                KeyGenerator instance = KeyGenerator.getInstance((String) null, (String) null);
                instance.init(0);
                read = instance.generateKey();
            }
            key = read;
        }
        return key;
    }
}

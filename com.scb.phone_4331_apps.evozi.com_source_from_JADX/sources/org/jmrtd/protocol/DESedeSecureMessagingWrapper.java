package org.jmrtd.protocol;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import net.p088sf.scuba.smartcards.CommandAPDU;
import net.p088sf.scuba.smartcards.ResponseAPDU;
import okhttp3.internal.http2.Settings;
import org.jmrtd.Util;
import p040o.AlertController$RecycleListView;

public class DESedeSecureMessagingWrapper extends SecureMessagingWrapper implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final IvParameterSpec ZERO_IV_PARAM_SPEC = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
    private static final long serialVersionUID = -2859033943345961793L;
    private transient Cipher cipher;
    private SecretKey ksEnc;
    private SecretKey ksMac;
    private transient Mac mac;
    private boolean shouldCheckMAC;
    private long ssc;

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2) throws GeneralSecurityException {
        this(secretKey, secretKey2, true);
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, boolean z) throws GeneralSecurityException {
        this(secretKey, secretKey2, z, 0);
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, long j) throws NoSuchAlgorithmException, NoSuchPaddingException {
        this(secretKey, secretKey2, "DESede/CBC/NoPadding", "ISO9797Alg3Mac", true, j);
    }

    public DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, boolean z, long j) throws NoSuchAlgorithmException, NoSuchPaddingException {
        this(secretKey, secretKey2, "DESede/CBC/NoPadding", "ISO9797Alg3Mac", z, j);
    }

    private DESedeSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, String str, String str2, boolean z, long j) throws NoSuchAlgorithmException, NoSuchPaddingException {
        this.ksEnc = secretKey;
        this.ksMac = secretKey2;
        this.shouldCheckMAC = z;
        this.ssc = j;
        this.cipher = Cipher.getInstance(str);
        this.mac = Mac.getInstance(str2);
    }

    public CommandAPDU wrap(CommandAPDU commandAPDU) {
        long j = this.ssc + 1;
        this.ssc = j;
        try {
            return wrapCommandAPDU(commandAPDU, j);
        } catch (GeneralSecurityException e) {
            LOGGER.log(Level.SEVERE, "Exception", e);
            throw new IllegalStateException(e.getMessage());
        } catch (IOException e2) {
            LOGGER.log(Level.SEVERE, "Exception", e2);
            throw new IllegalStateException(e2.getMessage());
        }
    }

    public ResponseAPDU unwrap(ResponseAPDU responseAPDU) {
        this.ssc++;
        try {
            byte[] data = responseAPDU.getData();
            if (data != null && data.length > 0) {
                return unwrapResponseAPDU(responseAPDU, this.ssc);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Card indicates SM error, SW = ");
            sb.append(Integer.toHexString(responseAPDU.getSW() & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            LOGGER.log(Level.SEVERE, "Exception", e);
            throw new IllegalStateException(e.getMessage());
        } catch (IOException e2) {
            LOGGER.log(Level.SEVERE, "Exception", e2);
            throw new IllegalStateException(e2.getMessage());
        }
    }

    public SecretKey getEncryptionKey() {
        return this.ksEnc;
    }

    public SecretKey getMACKey() {
        return this.ksMac;
    }

    public long getSendSequenceCounter() {
        return this.ssc;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DESedeSecureMessagingWrapper [ ");
        sb.append(this.ksEnc.toString());
        sb.append(", ");
        sb.append(this.ksMac.toString());
        sb.append(", ");
        sb.append(this.ssc);
        sb.append("]");
        return sb.toString();
    }

    private CommandAPDU wrapCommandAPDU(CommandAPDU commandAPDU, long j) throws GeneralSecurityException, IOException {
        int nc = commandAPDU.getNc();
        int ne = commandAPDU.getNe();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {(byte) (commandAPDU.getCLA() | 12), (byte) commandAPDU.getINS(), (byte) commandAPDU.getP1(), (byte) commandAPDU.getP2()};
        int i = 8;
        byte[] pad = Util.pad(bArr, 8);
        int i2 = ((byte) commandAPDU.getINS()) == -79 ? 1 : 0;
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        if (ne > 0) {
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(-105);
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write((byte) ne);
            bArr3 = byteArrayOutputStream.toByteArray();
        }
        this.cipher.init(1, this.ksEnc, ZERO_IV_PARAM_SPEC);
        if (nc > 0) {
            byte[] doFinal = this.cipher.doFinal(Util.pad(commandAPDU.getData(), 8));
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(i2 != 0 ? -123 : -121);
            byteArrayOutputStream.write(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(doFinal.length + (i2 ^ 1)));
            if (i2 == 0) {
                byteArrayOutputStream.write(1);
            }
            byteArrayOutputStream.write(doFinal, 0, doFinal.length);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeLong(j);
        dataOutputStream.write(pad);
        dataOutputStream.write(bArr2);
        dataOutputStream.write(bArr3);
        dataOutputStream.flush();
        byte[] pad2 = Util.pad(byteArrayOutputStream.toByteArray(), 8);
        this.mac.init(this.ksMac);
        byte[] doFinal2 = this.mac.doFinal(pad2);
        int length = doFinal2.length;
        if (length == 8) {
            i = length;
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(-114);
        byteArrayOutputStream.write(i);
        byteArrayOutputStream.write(doFinal2, 0, i);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        byteArrayOutputStream.write(byteArray);
        return new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArrayOutputStream.toByteArray(), 256);
    }

    private ResponseAPDU unwrapResponseAPDU(ResponseAPDU responseAPDU, long j) throws GeneralSecurityException, IOException {
        byte[] bytes = responseAPDU.getBytes();
        if (bytes == null || bytes.length < 2) {
            throw new IllegalArgumentException("Invalid response APDU");
        }
        this.cipher.init(2, this.ksEnc, ZERO_IV_PARAM_SPEC);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bytes));
        byte[] bArr = new byte[0];
        byte[] bArr2 = null;
        boolean z = false;
        short s = 0;
        while (!z) {
            byte readByte = dataInputStream.readByte();
            if (readByte == -123) {
                bArr = readDO87(dataInputStream, true);
            } else if (readByte == -121) {
                bArr = readDO87(dataInputStream, false);
            } else if (readByte == -114) {
                bArr2 = readDO8E(dataInputStream);
                z = true;
            } else if (readByte == -103) {
                s = readDO99(dataInputStream);
            }
        }
        if (!this.shouldCheckMAC || checkMac(bytes, bArr2, j)) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr, 0, bArr.length);
            byteArrayOutputStream.write((65280 & s) >> 8);
            byteArrayOutputStream.write(s & 255);
            return new ResponseAPDU(byteArrayOutputStream.toByteArray());
        }
        throw new IllegalStateException("Invalid MAC");
    }

    private byte[] readDO87(DataInputStream dataInputStream, boolean z) throws IOException, GeneralSecurityException {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 128) == 128) {
            int i = 0;
            for (int i2 = 0; i2 < (readUnsignedByte & 127); i2++) {
                i = (i << 8) | dataInputStream.readUnsignedByte();
            }
            readUnsignedByte = i;
        }
        if (!z) {
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            if (readUnsignedByte2 == 1) {
                readUnsignedByte--;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("DO'87 expected 0x01 marker, found ");
                sb.append(Integer.toHexString(readUnsignedByte2 & 255));
                throw new IllegalStateException(sb.toString());
            }
        }
        byte[] bArr = new byte[readUnsignedByte];
        dataInputStream.readFully(bArr);
        return Util.unpad(this.cipher.doFinal(bArr));
    }

    private short readDO99(DataInputStream dataInputStream) throws IOException {
        if (dataInputStream.readUnsignedByte() == 2) {
            return (short) ((dataInputStream.readByte() & 255) | ((dataInputStream.readByte() & 255) << 8));
        }
        throw new IllegalStateException("DO'99 wrong length");
    }

    private byte[] readDO8E(DataInputStream dataInputStream) throws IOException, GeneralSecurityException {
        if (dataInputStream.readUnsignedByte() == 8) {
            byte[] bArr = new byte[8];
            dataInputStream.readFully(bArr);
            return bArr;
        }
        throw new IllegalStateException("DO'8E wrong length");
    }

    private boolean checkMac(byte[] bArr, byte[] bArr2, long j) throws GeneralSecurityException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(j);
            byte[] pad = Util.pad(bArr, 0, ((bArr.length - 2) - 8) - 2, 8);
            dataOutputStream.write(pad, 0, pad.length);
            dataOutputStream.flush();
            dataOutputStream.close();
            this.mac.init(this.ksMac);
            byte[] doFinal = this.mac.doFinal(byteArrayOutputStream.toByteArray());
            if (doFinal.length > 8 && bArr2.length == 8) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(doFinal, 0, bArr3, 0, 8);
                doFinal = bArr3;
            }
            return Arrays.equals(bArr2, doFinal);
        } catch (IOException unused) {
            return false;
        }
    }
}

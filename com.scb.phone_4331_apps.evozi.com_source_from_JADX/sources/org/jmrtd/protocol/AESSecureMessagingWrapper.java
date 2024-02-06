package org.jmrtd.protocol;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import net.p088sf.scuba.smartcards.CommandAPDU;
import net.p088sf.scuba.smartcards.ResponseAPDU;
import okhttp3.internal.http2.Settings;
import org.jmrtd.Util;
import p040o.AlertController$RecycleListView;

public class AESSecureMessagingWrapper extends SecureMessagingWrapper implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 2086301081448345496L;
    private transient Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
    private SecretKey ksEnc;
    private SecretKey ksMac;
    private transient Mac mac;
    private long ssc;
    private transient Cipher sscIVCipher;

    private boolean checkMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return true;
    }

    public AESSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, long j) throws GeneralSecurityException {
        this.ksEnc = secretKey;
        this.ksMac = secretKey2;
        this.ssc = j;
        Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
        this.sscIVCipher = instance;
        instance.init(1, secretKey);
        Mac instance2 = Mac.getInstance("AESCMAC");
        this.mac = instance2;
        instance2.init(secretKey2);
    }

    public long getSendSequenceCounter() {
        return this.ssc;
    }

    public CommandAPDU wrap(CommandAPDU commandAPDU) {
        try {
            return wrapCommandAPDU(commandAPDU);
        } catch (GeneralSecurityException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            throw new IllegalStateException(e.toString());
        } catch (IOException e2) {
            Logger logger2 = LOGGER;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e2.getMessage());
            logger2.severe(sb2.toString());
            throw new IllegalStateException(e2.toString());
        }
    }

    public ResponseAPDU unwrap(ResponseAPDU responseAPDU) {
        try {
            byte[] bytes = responseAPDU.getBytes();
            if (bytes.length != 2) {
                return new ResponseAPDU(unwrapResponseAPDU(bytes));
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Card indicates SM error, SW = ");
            sb.append(Integer.toHexString(responseAPDU.getSW() & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            Logger logger = LOGGER;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e.getMessage());
            logger.severe(sb2.toString());
            throw new IllegalStateException(e.toString());
        } catch (IOException e2) {
            Logger logger2 = LOGGER;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception: ");
            sb3.append(e2.getMessage());
            logger2.severe(sb3.toString());
            throw new IllegalStateException(e2.toString());
        }
    }

    public SecretKey getEncryptionKey() {
        return this.ksEnc;
    }

    public SecretKey getMACKey() {
        return this.ksMac;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AESSecureMessagingWrapper [ ");
        sb.append(this.ksEnc.toString());
        sb.append(", ");
        sb.append(this.ksMac.toString());
        sb.append(", ");
        sb.append(this.ssc);
        sb.append("]");
        return sb.toString();
    }

    private CommandAPDU wrapCommandAPDU(CommandAPDU commandAPDU) throws GeneralSecurityException, IOException {
        int nc = commandAPDU.getNc();
        int ne = commandAPDU.getNe();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {(byte) (commandAPDU.getCLA() | 12), (byte) commandAPDU.getINS(), (byte) commandAPDU.getP1(), (byte) commandAPDU.getP2()};
        byte[] pad = Util.pad(bArr, 16);
        int i = ((byte) commandAPDU.getINS()) == -79 ? 1 : 0;
        byte[] bArr2 = new byte[0];
        byte[] bArr3 = new byte[0];
        if (ne > 0) {
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(-105);
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write((byte) ne);
            bArr3 = byteArrayOutputStream.toByteArray();
        }
        long j = this.ssc + 1;
        this.ssc = j;
        byte[] sSCAsBytes = getSSCAsBytes(j);
        if (nc > 0) {
            byte[] pad2 = Util.pad(commandAPDU.getData(), 16);
            this.cipher.init(1, this.ksEnc, getIV(sSCAsBytes));
            byte[] doFinal = this.cipher.doFinal(pad2);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(i != 0 ? -123 : -121);
            byteArrayOutputStream.write(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(doFinal.length + (i ^ 1)));
            if (i == 0) {
                byteArrayOutputStream.write(1);
            }
            byteArrayOutputStream.write(doFinal);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(pad);
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(sSCAsBytes);
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.flush();
        byte[] pad3 = Util.pad(byteArrayOutputStream.toByteArray(), 16);
        this.mac.init(this.ksMac);
        byte[] doFinal2 = this.mac.doFinal(pad3);
        int length = doFinal2.length;
        if (length != 8) {
            length = 8;
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(-114);
        byteArrayOutputStream.write(length);
        byteArrayOutputStream.write(doFinal2, 0, length);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(bArr2);
        byteArrayOutputStream.write(bArr3);
        byteArrayOutputStream.write(byteArray2);
        return new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArrayOutputStream.toByteArray(), 256);
    }

    private byte[] unwrapResponseAPDU(byte[] bArr) throws GeneralSecurityException, IOException {
        long j = this.ssc;
        if (bArr != null) {
            try {
                if (bArr.length >= 2) {
                    long j2 = j + 1;
                    this.ssc = j2;
                    this.cipher.init(2, this.ksEnc, getIV(j2));
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    byte[] bArr2 = new byte[0];
                    byte[] bArr3 = null;
                    boolean z = false;
                    short s = 0;
                    while (!z) {
                        byte readByte = dataInputStream.readByte();
                        if (readByte == -123) {
                            bArr2 = readDO87(dataInputStream, true);
                        } else if (readByte == -121) {
                            bArr2 = readDO87(dataInputStream, false);
                        } else if (readByte == -114) {
                            bArr3 = readDO8E(dataInputStream);
                            z = true;
                        } else if (readByte == -103) {
                            s = readDO99(dataInputStream);
                        }
                    }
                    if (checkMac(bArr, bArr3)) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr2, 0, bArr2.length);
                        byteArrayOutputStream.write((65280 & s) >> 8);
                        byteArrayOutputStream.write(s & 255);
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Invalid MAC");
                }
            } finally {
                long j3 = this.ssc;
                if (j3 == j) {
                    this.ssc = j3 + 1;
                }
            }
        }
        throw new IllegalArgumentException("Invalid response APDU");
    }

    private byte[] readDO87(DataInputStream dataInputStream, boolean z) throws IOException, GeneralSecurityException {
        int readUnsignedByte;
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte2 & 128) == 128) {
            int i = 0;
            for (int i2 = 0; i2 < (readUnsignedByte2 & 127); i2++) {
                i = (i << 8) | dataInputStream.readUnsignedByte();
            }
            if (z || dataInputStream.readUnsignedByte() == 1) {
                readUnsignedByte2 = i;
            } else {
                throw new IllegalStateException("DO'87 expected 0x01 marker");
            }
        } else if (!z && (readUnsignedByte = dataInputStream.readUnsignedByte()) != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("DO'87 expected 0x01 marker, found ");
            sb.append(Integer.toHexString(readUnsignedByte & 255));
            throw new IllegalStateException(sb.toString());
        }
        if (!z) {
            readUnsignedByte2--;
        }
        byte[] bArr = new byte[readUnsignedByte2];
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
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if (readUnsignedByte == 8) {
            byte[] bArr = new byte[8];
            dataInputStream.readFully(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DO'8E wrong length ");
        sb.append(readUnsignedByte);
        throw new IllegalStateException(sb.toString());
    }

    private IvParameterSpec getIV(long j) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        return new IvParameterSpec(this.sscIVCipher.doFinal(getSSCAsBytes(j)));
    }

    private IvParameterSpec getIV(byte[] bArr) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        return new IvParameterSpec(this.sscIVCipher.doFinal(bArr));
    }

    private byte[] getSSCAsBytes(long j) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(j);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.warning(sb.toString());
            return null;
        }
    }
}

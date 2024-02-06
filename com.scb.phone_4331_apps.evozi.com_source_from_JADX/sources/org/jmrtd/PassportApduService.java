package org.jmrtd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Collection;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import net.p088sf.scuba.smartcards.APDUEvent;
import net.p088sf.scuba.smartcards.APDUListener;
import net.p088sf.scuba.smartcards.APDUWrapper;
import net.p088sf.scuba.smartcards.CardService;
import net.p088sf.scuba.smartcards.CardServiceException;
import net.p088sf.scuba.smartcards.CommandAPDU;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import net.p088sf.scuba.smartcards.ResponseAPDU;
import net.p088sf.scuba.tlv.TLVInputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.AlertController$RecycleListView;

public class PassportApduService extends CardService {
    protected static final byte[] APPLET_AID = {ISOFileInfo.f5467A0, 0, 0, 2, 71, 16, 1};
    private static final Provider BC_PROVIDER = JMRTDSecurityProvider.getBouncyCastleProvider();
    public static final byte CAN_PACE_KEY_REFERENCE = 2;
    private static final byte INS_PACE_GENERAL_AUTHENTICATE = -122;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final byte MRZ_PACE_KEY_REFERENCE = 1;
    public static final byte PIN_PACE_KEY_REFERENCE = 3;
    public static final byte PUK_PACE_KEY_REFERENCE = 4;
    private static final IvParameterSpec ZERO_IV_PARAM_SPEC = new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0});
    private static final long serialVersionUID = 2451509825132976178L;
    private byte[] atr;
    private transient Cipher cipher;
    private transient Mac mac;
    private int plainAPDUCount = 0;
    private Collection<APDUListener> plainTextAPDUListeners = new HashSet();
    private CardService service;

    public PassportApduService(CardService cardService) throws CardServiceException {
        this.service = cardService;
        try {
            this.mac = Mac.getInstance("ISO9797Alg3Mac", BC_PROVIDER);
            this.cipher = Cipher.getInstance("DESede/CBC/NoPadding");
        } catch (GeneralSecurityException e) {
            LOGGER.log(Level.SEVERE, "Unexpected security exception during initialization", e);
            throw new CardServiceException(e.toString());
        }
    }

    public void open() throws CardServiceException {
        if (!this.service.isOpen()) {
            this.service.open();
        }
        this.atr = this.service.getATR();
    }

    public boolean isOpen() {
        boolean isOpen;
        synchronized (this) {
            isOpen = this.service.isOpen();
        }
        return isOpen;
    }

    public ResponseAPDU transmit(CommandAPDU commandAPDU) throws CardServiceException {
        ResponseAPDU transmit;
        synchronized (this) {
            transmit = this.service.transmit(commandAPDU);
        }
        return transmit;
    }

    public byte[] getATR() {
        return this.atr;
    }

    public void close() {
        CardService cardService = this.service;
        if (cardService != null) {
            cardService.close();
        }
    }

    public void setService(CardService cardService) {
        this.service = cardService;
    }

    public void addAPDUListener(APDUListener aPDUListener) {
        this.service.addAPDUListener(aPDUListener);
    }

    public void removeAPDUListener(APDUListener aPDUListener) {
        this.service.removeAPDUListener(aPDUListener);
    }

    private ResponseAPDU transmit(APDUWrapper aPDUWrapper, CommandAPDU commandAPDU) throws CardServiceException {
        ResponseAPDU transmit = transmit(aPDUWrapper != null ? aPDUWrapper.wrap(commandAPDU) : commandAPDU);
        short sw = (short) transmit.getSW();
        if (aPDUWrapper != null) {
            try {
                if (transmit.getBytes().length != 2) {
                    transmit = aPDUWrapper.unwrap(transmit);
                    int i = this.plainAPDUCount + 1;
                    this.plainAPDUCount = i;
                    notifyExchangedPlainTextAPDU(i, commandAPDU, transmit);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception during transmission of wrapped APDU\nC=");
                    sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(commandAPDU.getBytes()));
                    throw new CardServiceException(sb.toString(), sw);
                }
            } catch (Exception e) {
                if (e instanceof CardServiceException) {
                    throw ((CardServiceException) e);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception during transmission of wrapped APDU\nC=");
                sb2.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(commandAPDU.getBytes()));
                sb2.append("\n");
                sb2.append(e.getMessage());
                throw new CardServiceException(sb2.toString(), sw);
            } catch (Throwable th) {
                int i2 = this.plainAPDUCount + 1;
                this.plainAPDUCount = i2;
                notifyExchangedPlainTextAPDU(i2, commandAPDU, transmit);
                throw th;
            }
        }
        return transmit;
    }

    public void sendSelectApplet(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException {
        synchronized (this) {
            CommandAPDU commandAPDU = new CommandAPDU(0, -92, 4, 12, bArr);
            checkStatusWordAfterFileOperation(commandAPDU, transmit(aPDUWrapper, commandAPDU));
        }
    }

    public void sendSelectFile(short s) throws CardServiceException {
        synchronized (this) {
            sendSelectFile((APDUWrapper) null, s);
        }
    }

    public void sendSelectFile(APDUWrapper aPDUWrapper, short s) throws CardServiceException {
        synchronized (this) {
            CommandAPDU commandAPDU = new CommandAPDU(0, -92, 2, 12, new byte[]{(byte) (s >> 8), (byte) s}, 0);
            ResponseAPDU transmit = transmit(aPDUWrapper, commandAPDU);
            if (transmit != null) {
                checkStatusWordAfterFileOperation(commandAPDU, transmit);
            }
        }
    }

    public byte[] sendReadBinary(short s, int i, boolean z) throws CardServiceException {
        byte[] sendReadBinary;
        synchronized (this) {
            sendReadBinary = sendReadBinary((APDUWrapper) null, s, i, z);
        }
        return sendReadBinary;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] sendReadBinary(net.p088sf.scuba.smartcards.APDUWrapper r12, int r13, int r14, boolean r15) throws net.p088sf.scuba.smartcards.CardServiceException {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            if (r14 != 0) goto L_0x0006
            monitor-exit(r11)
            return r0
        L_0x0006:
            r1 = 128(0x80, float:1.794E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x0018
            if (r14 >= r1) goto L_0x0011
            int r14 = r14 + 2
            goto L_0x0015
        L_0x0011:
            if (r14 >= r2) goto L_0x0015
            int r14 = r14 + 3
        L_0x0015:
            if (r14 <= r2) goto L_0x0018
            r14 = r2
        L_0x0018:
            r2 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r13
            int r2 = r2 >> 8
            byte r6 = (byte) r2
            byte r7 = (byte) r13
            r13 = 0
            r2 = 1
            if (r15 == 0) goto L_0x0040
            r3 = 4
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x00ca }
            r3 = 84
            r8[r13] = r3     // Catch:{ all -> 0x00ca }
            r3 = 2
            r8[r2] = r3     // Catch:{ all -> 0x00ca }
            r8[r3] = r6     // Catch:{ all -> 0x00ca }
            r3 = 3
            r8[r3] = r7     // Catch:{ all -> 0x00ca }
            net.sf.scuba.smartcards.CommandAPDU r10 = new net.sf.scuba.smartcards.CommandAPDU     // Catch:{ all -> 0x00ca }
            r4 = 0
            r5 = -79
            r6 = 0
            r7 = 0
            r3 = r10
            r9 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00ca }
            goto L_0x004a
        L_0x0040:
            net.sf.scuba.smartcards.CommandAPDU r10 = new net.sf.scuba.smartcards.CommandAPDU     // Catch:{ all -> 0x00ca }
            r4 = 0
            r5 = -80
            r3 = r10
            r8 = r14
            r3.<init>((int) r4, (int) r5, (int) r6, (int) r7, (int) r8)     // Catch:{ all -> 0x00ca }
        L_0x004a:
            net.sf.scuba.smartcards.ResponseAPDU r12 = r11.transmit(r12, r10)     // Catch:{ CardServiceException -> 0x0055 }
            int r3 = r12.getSW()     // Catch:{ CardServiceException -> 0x0053 }
            goto L_0x005b
        L_0x0053:
            r3 = move-exception
            goto L_0x0057
        L_0x0055:
            r3 = move-exception
            r12 = r0
        L_0x0057:
            int r3 = r3.getSW()     // Catch:{ all -> 0x00ca }
        L_0x005b:
            short r3 = (short) r3     // Catch:{ all -> 0x00ca }
            if (r12 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            byte[] r0 = r12.getData()     // Catch:{ all -> 0x00ca }
        L_0x0063:
            if (r15 == 0) goto L_0x0090
            r15 = -28672(0xffffffffffff9000, float:NaN)
            if (r3 != r15) goto L_0x0090
            byte r15 = r0[r13]     // Catch:{ all -> 0x00ca }
            r4 = 83
            if (r15 != r4) goto L_0x0088
            byte r15 = r0[r2]     // Catch:{ all -> 0x00ca }
            r15 = r15 & r1
            byte r15 = (byte) r15     // Catch:{ all -> 0x00ca }
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r15 != r1) goto L_0x007d
            byte r15 = r0[r2]     // Catch:{ all -> 0x00ca }
            r15 = r15 & 15
            int r15 = r15 + r2
            goto L_0x007e
        L_0x007d:
            r15 = r2
        L_0x007e:
            int r15 = r15 + r2
            int r1 = r0.length     // Catch:{ all -> 0x00ca }
            int r1 = r1 - r15
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00ca }
            java.lang.System.arraycopy(r0, r15, r2, r13, r1)     // Catch:{ all -> 0x00ca }
            r0 = r2
            goto L_0x0090
        L_0x0088:
            net.sf.scuba.smartcards.CardServiceException r12 = new net.sf.scuba.smartcards.CardServiceException     // Catch:{ all -> 0x00ca }
            java.lang.String r13 = "Malformed read binary long response data"
            r12.<init>(r13, r3)     // Catch:{ all -> 0x00ca }
            throw r12     // Catch:{ all -> 0x00ca }
        L_0x0090:
            if (r0 == 0) goto L_0x009a
            int r13 = r0.length     // Catch:{ all -> 0x00ca }
            if (r13 != 0) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            checkStatusWordAfterFileOperation(r10, r12)     // Catch:{ all -> 0x00ca }
            goto L_0x00c8
        L_0x009a:
            java.util.logging.Logger r12 = LOGGER     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r13.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r15 = "DEBUG: rapduBytes = "
            r13.append(r15)     // Catch:{ all -> 0x00ca }
            java.lang.String r15 = java.util.Arrays.toString(r0)     // Catch:{ all -> 0x00ca }
            r13.append(r15)     // Catch:{ all -> 0x00ca }
            java.lang.String r15 = ", le = "
            r13.append(r15)     // Catch:{ all -> 0x00ca }
            r13.append(r14)     // Catch:{ all -> 0x00ca }
            java.lang.String r14 = ", sw = "
            r13.append(r14)     // Catch:{ all -> 0x00ca }
            java.lang.String r14 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x00ca }
            r13.append(r14)     // Catch:{ all -> 0x00ca }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ca }
            r12.warning(r13)     // Catch:{ all -> 0x00ca }
        L_0x00c8:
            monitor-exit(r11)
            return r0
        L_0x00ca:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.PassportApduService.sendReadBinary(net.sf.scuba.smartcards.APDUWrapper, int, int, boolean):byte[]");
    }

    public byte[] sendGetChallenge() throws CardServiceException {
        byte[] sendGetChallenge;
        synchronized (this) {
            sendGetChallenge = sendGetChallenge((APDUWrapper) null);
        }
        return sendGetChallenge;
    }

    public byte[] sendGetChallenge(APDUWrapper aPDUWrapper) throws CardServiceException {
        byte[] data;
        synchronized (this) {
            data = transmit(aPDUWrapper, new CommandAPDU(0, -124, 0, 0, 8)).getData();
        }
        return data;
    }

    public byte[] sendInternalAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException {
        byte[] data;
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length == 8) {
                    data = transmit(aPDUWrapper, new CommandAPDU(0, -120, 0, 0, bArr, 256)).getData();
                }
            }
            throw new IllegalArgumentException("rndIFD wrong length");
        }
        return data;
    }

    public byte[] sendMutualAuth(byte[] bArr, byte[] bArr2, byte[] bArr3, SecretKey secretKey, SecretKey secretKey2) throws CardServiceException {
        byte[] doFinal;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr3;
        SecretKey secretKey3 = secretKey;
        SecretKey secretKey4 = secretKey2;
        synchronized (this) {
            if (bArr4 != null) {
                try {
                    if (bArr4.length == 8) {
                        if (bArr5 == null || bArr5.length != 8) {
                            bArr5 = new byte[8];
                        }
                        if (bArr6 == null || bArr6.length != 16) {
                            throw new IllegalArgumentException("kIFD wrong length");
                        } else if (secretKey3 == null) {
                            throw new IllegalArgumentException("kEnc == null");
                        } else if (secretKey4 != null) {
                            this.cipher.init(1, secretKey3, ZERO_IV_PARAM_SPEC);
                            byte[] bArr7 = new byte[32];
                            System.arraycopy(bArr4, 0, bArr7, 0, 8);
                            System.arraycopy(bArr5, 0, bArr7, 8, 8);
                            System.arraycopy(bArr6, 0, bArr7, 16, 16);
                            byte[] doFinal2 = this.cipher.doFinal(bArr7);
                            if (doFinal2.length == 32) {
                                this.mac.init(secretKey4);
                                byte[] doFinal3 = this.mac.doFinal(Util.pad(doFinal2, 8));
                                if (doFinal3.length == 8) {
                                    byte[] bArr8 = new byte[40];
                                    System.arraycopy(doFinal2, 0, bArr8, 0, 32);
                                    System.arraycopy(doFinal3, 0, bArr8, 32, 8);
                                    ResponseAPDU transmit = transmit(new CommandAPDU(0, -126, 0, 0, bArr8, 40));
                                    if (transmit != null) {
                                        byte[] bytes = transmit.getBytes();
                                        short sw = (short) transmit.getSW();
                                        if (bytes != null) {
                                            if (sw != -28672) {
                                                ResponseAPDU transmit2 = transmit(new CommandAPDU(0, -126, 0, 0, bArr8, 0));
                                                bytes = transmit2.getBytes();
                                                sw = (short) transmit2.getSW();
                                            }
                                            if (bytes.length == 42) {
                                                this.cipher.init(2, secretKey3, ZERO_IV_PARAM_SPEC);
                                                doFinal = this.cipher.doFinal(bytes, 0, (bytes.length - 8) - 2);
                                                if (doFinal.length != 32) {
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Cryptogram wrong length ");
                                                    sb.append(doFinal.length);
                                                    throw new IllegalStateException(sb.toString());
                                                }
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Mutual authentication failed: expected length: 40 + 2, actual length: ");
                                                sb2.append(bytes.length);
                                                throw new CardServiceException(sb2.toString(), sw);
                                            }
                                        } else {
                                            throw new CardServiceException("Mutual authentication failed, received empty data in response APDU", sw);
                                        }
                                    } else {
                                        throw new CardServiceException("Mutual authentication failed, received null response APDU");
                                    }
                                } else {
                                    throw new IllegalStateException("MAC wrong length");
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Cryptogram wrong length ");
                                sb3.append(doFinal2.length);
                                throw new IllegalStateException(sb3.toString());
                            }
                        } else {
                            throw new IllegalArgumentException("kMac == null");
                        }
                    }
                } catch (GeneralSecurityException e) {
                    throw new CardServiceException(e.toString());
                }
            }
            throw new IllegalArgumentException("rndIFD wrong length");
        }
        return doFinal;
    }

    public void sendMutualAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException {
        synchronized (this) {
            short sw = (short) transmit(aPDUWrapper, new CommandAPDU(0, -126, 0, 0, bArr)).getSW();
            if (sw != -28672) {
                throw new CardServiceException("Sending External Authenticate failed.", sw);
            }
        }
    }

    public void sendMSEKAT(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2) throws CardServiceException {
        synchronized (this) {
            byte[] bArr3 = new byte[(bArr.length + (bArr2 != null ? bArr2.length : 0))];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            if (bArr2 != null) {
                System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            }
            short sw = (short) transmit(aPDUWrapper, new CommandAPDU(0, 34, 65, (int) CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256, bArr3)).getSW();
            if (sw != -28672) {
                throw new CardServiceException("Sending MSE KAT failed", sw);
            }
        }
    }

    public void sendMSESetDST(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException {
        synchronized (this) {
            short sw = (short) transmit(aPDUWrapper, new CommandAPDU(0, 34, 129, (int) CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, bArr)).getSW();
            if (sw != -28672) {
                throw new CardServiceException("Sending MSE Set DST failed", sw);
            }
        }
    }

    public void sendMSESetATExtAuth(APDUWrapper aPDUWrapper, byte[] bArr) throws CardServiceException {
        synchronized (this) {
            short sw = (short) transmit(aPDUWrapper, new CommandAPDU(0, 34, 129, (int) CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, bArr)).getSW();
            if (sw != -28672) {
                throw new CardServiceException("Sending MSE AT failed", sw);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008c A[Catch:{ IOException -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008e A[Catch:{ IOException -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099 A[SYNTHETIC, Splitter:B:22:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendMSESetATIntAuth(net.p088sf.scuba.smartcards.APDUWrapper r10, java.lang.String r11, java.math.BigInteger r12) throws net.p088sf.scuba.smartcards.CardServiceException {
        /*
            r9 = this;
            monitor-enter(r9)
            if (r12 == 0) goto L_0x005f
            java.math.BigInteger r0 = java.math.BigInteger.ZERO     // Catch:{ all -> 0x00a1 }
            int r0 = r12.compareTo(r0)     // Catch:{ all -> 0x00a1 }
            if (r0 >= 0) goto L_0x000c
            goto L_0x005f
        L_0x000c:
            java.util.logging.Logger r0 = LOGGER     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r1.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "DEBUG: explicit case, keyId == "
            r1.append(r2)     // Catch:{ all -> 0x00a1 }
            r1.append(r12)     // Catch:{ all -> 0x00a1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a1 }
            r0.info(r1)     // Catch:{ all -> 0x00a1 }
            byte[] r11 = r9.toOIDBytes(r11)     // Catch:{ all -> 0x00a1 }
            r0 = -124(0xffffffffffffff84, float:NaN)
            byte[] r12 = org.jmrtd.Util.i2os(r12)     // Catch:{ all -> 0x00a1 }
            byte[] r12 = org.jmrtd.Util.wrapDO(r0, r12)     // Catch:{ all -> 0x00a1 }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00a1 }
            r0.<init>()     // Catch:{ all -> 0x00a1 }
            r0.write(r11)     // Catch:{ IOException -> 0x003f }
            r0.write(r12)     // Catch:{ IOException -> 0x003f }
            r0.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0049
        L_0x003f:
            r11 = move-exception
            java.util.logging.Logger r12 = LOGGER     // Catch:{ all -> 0x00a1 }
            java.util.logging.Level r1 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "Exception"
            r12.log(r1, r2, r11)     // Catch:{ all -> 0x00a1 }
        L_0x0049:
            net.sf.scuba.smartcards.CommandAPDU r11 = new net.sf.scuba.smartcards.CommandAPDU     // Catch:{ all -> 0x00a1 }
            r4 = 0
            r5 = 34
            r6 = 65
            r7 = 164(0xa4, float:2.3E-43)
            byte[] r8 = r0.toByteArray()     // Catch:{ all -> 0x00a1 }
            r3 = r11
            r3.<init>((int) r4, (int) r5, (int) r6, (int) r7, (byte[]) r8)     // Catch:{ all -> 0x00a1 }
            net.sf.scuba.smartcards.ResponseAPDU r10 = r9.transmit(r10, r11)     // Catch:{ all -> 0x00a1 }
            goto L_0x008a
        L_0x005f:
            java.util.logging.Logger r0 = LOGGER     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r1.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "DEBUG: implicit case, keyId == "
            r1.append(r2)     // Catch:{ all -> 0x00a1 }
            r1.append(r12)     // Catch:{ all -> 0x00a1 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x00a1 }
            r0.info(r12)     // Catch:{ all -> 0x00a1 }
            net.sf.scuba.smartcards.CommandAPDU r12 = new net.sf.scuba.smartcards.CommandAPDU     // Catch:{ all -> 0x00a1 }
            r2 = 0
            r3 = 34
            r4 = 65
            r5 = 164(0xa4, float:2.3E-43)
            byte[] r6 = r9.toOIDBytes(r11)     // Catch:{ all -> 0x00a1 }
            r1 = r12
            r1.<init>((int) r2, (int) r3, (int) r4, (int) r5, (byte[]) r6)     // Catch:{ all -> 0x00a1 }
            net.sf.scuba.smartcards.ResponseAPDU r10 = r9.transmit(r10, r12)     // Catch:{ all -> 0x00a1 }
        L_0x008a:
            if (r10 != 0) goto L_0x008e
            r10 = -1
            goto L_0x0093
        L_0x008e:
            int r10 = r10.getSW()     // Catch:{ all -> 0x00a1 }
            short r10 = (short) r10
        L_0x0093:
            r11 = -28672(0xffffffffffff9000, float:NaN)
            if (r10 != r11) goto L_0x0099
            monitor-exit(r9)
            return
        L_0x0099:
            net.sf.scuba.smartcards.CardServiceException r11 = new net.sf.scuba.smartcards.CardServiceException     // Catch:{ all -> 0x00a1 }
            java.lang.String r12 = "Sending MSE AT failed"
            r11.<init>(r12, r10)     // Catch:{ all -> 0x00a1 }
            throw r11     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.PassportApduService.sendMSESetATIntAuth(net.sf.scuba.smartcards.APDUWrapper, java.lang.String, java.math.BigInteger):void");
    }

    public void sendMSESetATMutualAuth(APDUWrapper aPDUWrapper, String str, int i, byte[] bArr) throws CardServiceException {
        synchronized (this) {
            if (str != null) {
                byte[] oIDBytes = toOIDBytes(str);
                if (!(i == 1 || i == 2 || i == 3)) {
                    if (i != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported key type reference (MRZ, CAN, etc), found ");
                        sb.append(i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                byte[] wrapDO = Util.wrapDO(ISOFileInfo.FILE_IDENTIFIER, new byte[]{(byte) i});
                if (bArr != null) {
                    bArr = Util.wrapDO((byte) -124, bArr);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byteArrayOutputStream.write(oIDBytes);
                    byteArrayOutputStream.write(wrapDO);
                    if (bArr != null) {
                        byteArrayOutputStream.write(bArr);
                    }
                    short sw = (short) transmit(aPDUWrapper, new CommandAPDU(0, 34, (int) CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, (int) CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, byteArrayOutputStream.toByteArray())).getSW();
                    if (sw != -28672) {
                        throw new CardServiceException("Sending MSE AT failed", sw);
                    }
                } catch (IOException e) {
                    LOGGER.log(Level.SEVERE, "Error while copying data", e);
                    throw new IllegalStateException("Error while copying data");
                }
            } else {
                throw new IllegalArgumentException("OID cannot be null");
            }
        }
    }

    private byte[] toOIDBytes(String str) {
        try {
            TLVInputStream tLVInputStream = new TLVInputStream(new ByteArrayInputStream(new ASN1ObjectIdentifier(str).getEncoded()));
            tLVInputStream.write();
            tLVInputStream.IconCompatParcelizer();
            byte[] MediaBrowserCompat$ItemReceiver = tLVInputStream.MediaBrowserCompat$ItemReceiver();
            tLVInputStream.close();
            return Util.wrapDO(ISOFileInfo.DATA_BYTES1, MediaBrowserCompat$ItemReceiver);
        } catch (IOException e) {
            Logger logger = LOGGER;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected exception interpreting OID \"");
            sb.append(str);
            sb.append("\"");
            logger.log(level, sb.toString(), e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal OID: \"");
            sb2.append(str);
            sb2.append("\" (");
            sb2.append(e.getMessage());
            sb2.append(")");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public byte[] sendGeneralAuthenticate(APDUWrapper aPDUWrapper, byte[] bArr, boolean z) throws CardServiceException {
        byte[] unwrapDO;
        synchronized (this) {
            ResponseAPDU transmit = transmit(aPDUWrapper, new CommandAPDU(z ? 0 : 16, -122, 0, 0, Util.wrapDO((byte) 124, bArr), 256));
            short sw = (short) transmit.getSW();
            if (sw == -28672) {
                unwrapDO = Util.unwrapDO((byte) 124, transmit.getData());
            } else {
                throw new CardServiceException("Sending general authenticate failed", sw);
            }
        }
        return unwrapDO;
    }

    public void sendPSOExtendedLengthMode(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2) throws CardServiceException {
        synchronized (this) {
            byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
            short sw = (short) transmit(aPDUWrapper, new CommandAPDU(0, 42, 0, (int) CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, bArr3)).getSW();
            if (sw != -28672) {
                throw new CardServiceException("Sending PSO failed", sw);
            }
        }
    }

    public void sendPSOChainMode(APDUWrapper aPDUWrapper, byte[] bArr, byte[] bArr2) throws CardServiceException {
        int i;
        int i2;
        APDUWrapper aPDUWrapper2 = aPDUWrapper;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        synchronized (this) {
            int length = bArr3.length + bArr4.length;
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr3, 0, bArr5, 0, bArr3.length);
            System.arraycopy(bArr4, 0, bArr5, bArr3.length, bArr4.length);
            if (length > 223) {
                int i3 = length / 223;
                if (i3 * 223 < length) {
                    i3++;
                }
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3 - 1) {
                    CommandAPDU commandAPDU = r5;
                    CommandAPDU commandAPDU2 = new CommandAPDU(16, 42, 0, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, bArr5, i5, length);
                    short sw = (short) transmit(aPDUWrapper2, commandAPDU).getSW();
                    if (sw == -28672) {
                        length -= 223;
                        i5 += 223;
                        i4++;
                    } else {
                        throw new CardServiceException("Sending PSO failed", sw);
                    }
                }
                i = length;
                i2 = i5;
            } else {
                i = length;
                i2 = 0;
            }
            short sw2 = (short) transmit(aPDUWrapper2, new CommandAPDU(0, 42, 0, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, bArr5, i2, i)).getSW();
            if (sw2 != -28672) {
                throw new CardServiceException("Sending PSO failed", sw2);
            }
        }
    }

    public void addPlainTextAPDUListener(APDUListener aPDUListener) {
        Collection<APDUListener> collection = this.plainTextAPDUListeners;
        if (collection != null) {
            collection.add(aPDUListener);
        }
    }

    public void removePlainTextAPDUListener(APDUListener aPDUListener) {
        Collection<APDUListener> collection = this.plainTextAPDUListeners;
        if (collection != null) {
            collection.remove(aPDUListener);
        }
    }

    /* access modifiers changed from: protected */
    public void notifyExchangedPlainTextAPDU(int i, CommandAPDU commandAPDU, ResponseAPDU responseAPDU) {
        Collection<APDUListener> collection = this.plainTextAPDUListeners;
        if (collection != null && collection.size() > 0) {
            APDUEvent aPDUEvent = new APDUEvent(this, "PLAINTEXT", i, commandAPDU, responseAPDU);
            for (APDUListener exchangedAPDU : this.plainTextAPDUListeners) {
                exchangedAPDU.exchangedAPDU(aPDUEvent);
            }
        }
    }

    private static void checkStatusWordAfterFileOperation(CommandAPDU commandAPDU, ResponseAPDU responseAPDU) throws CardServiceException {
        short sw = (short) responseAPDU.getSW();
        StringBuilder sb = new StringBuilder();
        sb.append("CAPDU = ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(commandAPDU.getBytes()));
        sb.append(", RAPDU = ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(responseAPDU.getBytes()));
        String obj = sb.toString();
        if (sw != -28672) {
            if (sw != 27010) {
                if (sw == 27266) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("File not found, ");
                    sb2.append(obj);
                    throw new CardServiceException(sb2.toString(), sw);
                } else if (!(sw == 27013 || sw == 27014)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error occured, ");
                    sb3.append(obj);
                    throw new CardServiceException(sb3.toString(), sw);
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Access to file denied, ");
            sb4.append(obj);
            throw new CardServiceException(sb4.toString(), sw);
        }
    }
}

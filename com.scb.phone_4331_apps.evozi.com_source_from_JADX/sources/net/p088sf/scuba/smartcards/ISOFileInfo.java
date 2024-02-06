package net.p088sf.scuba.smartcards;

import java.math.BigInteger;
import org.jmrtd.cbeff.ISO781611;
import p040o.AlertController$RecycleListView;

/* renamed from: net.sf.scuba.smartcards.ISOFileInfo */
public class ISOFileInfo extends FileInfo {

    /* renamed from: A0 */
    public static final byte f5467A0 = -96;

    /* renamed from: A1 */
    public static final byte f5468A1 = -95;

    /* renamed from: A2 */
    public static final byte f5469A2 = -94;

    /* renamed from: A5 */
    public static final byte f5470A5 = -91;

    /* renamed from: AB */
    public static final byte f5471AB = -85;

    /* renamed from: AC */
    public static final byte f5472AC = -84;
    public static final byte CHANNEL_SECURITY = -114;
    public static final byte DATA_BYTES1 = Byte.MIN_VALUE;
    public static final byte DATA_BYTES2 = -127;
    public static final byte DF_NAME = -124;
    public static final byte ENV_TEMP_EF = -115;
    public static final byte FCI_BYTE = 111;
    public static final byte FCI_EXT = -121;
    public static final byte FCP_BYTE = 98;
    public static final byte FILE_DESCRIPTOR = -126;
    public static final byte FILE_IDENTIFIER = -125;
    public static final byte FMD_BYTE = 100;
    public static final byte LCS_BYTE = -118;
    public static final byte PROP_INFO = -123;
    public static final byte SECURITY_ATTR_COMPACT = -116;
    public static final byte SECURITY_ATTR_EXP = -117;
    public static final byte SECURITY_ATTR_PROP = -122;
    public static final byte SHORT_EF = -120;

    /* renamed from: a0 */
    byte[] f5473a0 = null;

    /* renamed from: a1 */
    byte[] f5474a1 = null;

    /* renamed from: a2 */
    byte[] f5475a2 = null;

    /* renamed from: a5 */
    byte[] f5476a5 = null;

    /* renamed from: ab */
    byte[] f5477ab = null;

    /* renamed from: ac */
    byte[] f5478ac = null;
    byte channelSecurity = -1;
    byte dataCodingByte = -1;
    byte descriptorByte = -1;
    byte[] dfName = null;
    short envTempEF = -1;
    short fciExt = -1;
    short fid = -1;
    int fileLength = -1;
    int fileLengthFCI = -1;
    byte lcsByte = -1;
    byte mainTag = -1;
    short maxRecordSize = -1;
    short maxRecordsCount = -1;
    byte[] propInfo = null;
    byte[] secAttrCompact = null;
    byte[] secAttrExp = null;
    byte[] secAttrProp = null;
    byte shortEF = -1;

    public ISOFileInfo(byte[] bArr) throws CardServiceException {
        if (bArr.length != 0) {
            if (bArr[0] == 111 || bArr[0] == 98 || bArr[0] == 100) {
                this.mainTag = bArr[0];
                byte b = bArr[1];
                byte[] bArr2 = new byte[b];
                System.arraycopy(bArr, 2, bArr2, 0, bArr[1]);
                int i = 0;
                while (i < b) {
                    int i2 = i + 1;
                    try {
                        byte b2 = bArr2[i];
                        int i3 = i2 + 1;
                        byte b3 = bArr2[i2];
                        byte[] bArr3 = new byte[b3];
                        System.arraycopy(bArr2, i3, bArr3, 0, b3);
                        if (b2 == -91) {
                            byte[] bArr4 = new byte[b3];
                            this.f5476a5 = bArr4;
                            System.arraycopy(bArr3, 0, bArr4, 0, b3);
                        } else if (b2 == -85) {
                            byte[] bArr5 = new byte[b3];
                            this.f5477ab = bArr5;
                            System.arraycopy(bArr3, 0, bArr5, 0, b3);
                        } else if (b2 != -84) {
                            switch (b2) {
                                case Byte.MIN_VALUE:
                                    this.fileLength = new BigInteger(bArr3).abs().intValue();
                                    break;
                                case -127:
                                    checkLen(b3, 2);
                                    this.fileLengthFCI = new BigInteger(bArr3).intValue();
                                    break;
                                case -126:
                                    checkLen(b3, 1, 6);
                                    this.descriptorByte = bArr3[0];
                                    if (1 == b3) {
                                        break;
                                    } else {
                                        this.dataCodingByte = bArr3[1];
                                        if (2 == b3) {
                                            break;
                                        } else {
                                            byte b4 = 3;
                                            if (b3 == 3) {
                                                this.maxRecordSize = (short) bArr3[2];
                                            } else {
                                                this.maxRecordSize = new BigInteger(new byte[]{bArr3[2], bArr3[3]}).shortValue();
                                                b4 = 4;
                                            }
                                            if (b4 != b3) {
                                                if (b3 != 5) {
                                                    this.maxRecordsCount = new BigInteger(new byte[]{bArr3[b4], bArr3[b4 + 1]}).shortValue();
                                                    break;
                                                } else {
                                                    this.maxRecordsCount = (short) bArr3[b4];
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                case -125:
                                    checkLen(b3, 2);
                                    this.fid = new BigInteger(bArr3).shortValue();
                                    break;
                                case -124:
                                    checkLen(b3, 0, 16);
                                    byte[] bArr6 = new byte[b3];
                                    this.dfName = bArr6;
                                    System.arraycopy(bArr3, 0, bArr6, 0, b3);
                                    break;
                                case -123:
                                    byte[] bArr7 = new byte[b3];
                                    this.propInfo = bArr7;
                                    System.arraycopy(bArr3, 0, bArr7, 0, b3);
                                    break;
                                case -122:
                                    byte[] bArr8 = new byte[b3];
                                    this.secAttrProp = bArr8;
                                    System.arraycopy(bArr3, 0, bArr8, 0, b3);
                                    break;
                                case -121:
                                    checkLen(b3, 2);
                                    this.fciExt = new BigInteger(bArr3).shortValue();
                                    break;
                                case -120:
                                    checkLen(b3, 0, 1);
                                    if (b3 != 0) {
                                        this.shortEF = bArr3[0];
                                        break;
                                    } else {
                                        this.shortEF = 0;
                                        break;
                                    }
                                default:
                                    switch (b2) {
                                        case -118:
                                            checkLen(b3, 1);
                                            this.lcsByte = bArr3[0];
                                            break;
                                        case -117:
                                            byte[] bArr9 = new byte[b3];
                                            this.secAttrExp = bArr9;
                                            System.arraycopy(bArr3, 0, bArr9, 0, b3);
                                            break;
                                        case -116:
                                            byte[] bArr10 = new byte[b3];
                                            this.secAttrCompact = bArr10;
                                            System.arraycopy(bArr3, 0, bArr10, 0, b3);
                                            break;
                                        case -115:
                                            checkLen(b3, 2);
                                            this.envTempEF = new BigInteger(bArr3).shortValue();
                                            break;
                                        case -114:
                                            checkLen(b3, 1);
                                            this.channelSecurity = bArr3[0];
                                            break;
                                        default:
                                            switch (b2) {
                                                case -96:
                                                    byte[] bArr11 = new byte[b3];
                                                    this.f5473a0 = bArr11;
                                                    System.arraycopy(bArr3, 0, bArr11, 0, b3);
                                                    break;
                                                case ISO781611.BIOMETRIC_HEADER_TEMPLATE_BASE_TAG /*-95*/:
                                                    byte[] bArr12 = new byte[b3];
                                                    this.f5474a1 = bArr12;
                                                    System.arraycopy(bArr3, 0, bArr12, 0, b3);
                                                    break;
                                                case -94:
                                                    byte[] bArr13 = new byte[b3];
                                                    this.f5475a2 = bArr13;
                                                    System.arraycopy(bArr3, 0, bArr13, 0, b3);
                                                    break;
                                                default:
                                                    throw new CardServiceException("Malformed FCI: unrecognized tag.");
                                            }
                                    }
                            }
                        } else {
                            byte[] bArr14 = new byte[b3];
                            this.f5478ac = bArr14;
                            System.arraycopy(bArr3, 0, bArr14, 0, b3);
                        }
                        i = i3 + b3;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new CardServiceException("Malformed FCI.");
                    }
                }
                return;
            }
            throw new CardServiceException("Malformed FCI data");
        }
    }

    private static void checkLen(int i, int i2) throws CardServiceException {
        if (i != i2) {
            throw new CardServiceException("Malformed FCI.");
        }
    }

    private static void checkLen(int i, int i2, int i3) throws CardServiceException {
        if (i < i2 || i > i3) {
            throw new CardServiceException("Malformed FCI.");
        }
    }

    public byte[] getFormatted() {
        byte[] bArr;
        String str;
        String str2;
        byte[] bArr2 = new byte[0];
        if (this.mainTag == -1) {
            return bArr2;
        }
        int i = this.fileLength;
        if (i != -1) {
            bArr2 = catArray(bArr2, getArray(DATA_BYTES1, AlertController$RecycleListView.ParcelableVolumeInfo(AlertController$RecycleListView.read((short) i))));
        }
        int i2 = this.fileLengthFCI;
        if (i2 != -1) {
            bArr2 = catArray(bArr2, getArray(DATA_BYTES2, AlertController$RecycleListView.ParcelableVolumeInfo(AlertController$RecycleListView.read((short) i2))));
        }
        byte b = this.descriptorByte;
        if (b != -1) {
            byte[] bArr3 = {b};
            byte[] bArr4 = new byte[0];
            byte b2 = this.dataCodingByte;
            if (b2 != -1) {
                bArr4 = new byte[]{b2};
            }
            byte[] bArr5 = new byte[0];
            short s = this.maxRecordSize;
            if (s != -1) {
                if (s > 256) {
                    str2 = AlertController$RecycleListView.read(s);
                } else if (this.maxRecordsCount == -1) {
                    str2 = AlertController$RecycleListView.read((byte) s);
                } else {
                    str2 = AlertController$RecycleListView.read(s);
                }
                bArr5 = AlertController$RecycleListView.ParcelableVolumeInfo(str2);
            }
            byte[] bArr6 = new byte[0];
            short s2 = this.maxRecordsCount;
            if (s2 != -1) {
                if (s2 <= 256) {
                    str = AlertController$RecycleListView.read((byte) s2);
                } else {
                    str = AlertController$RecycleListView.read(s2);
                }
                bArr6 = AlertController$RecycleListView.ParcelableVolumeInfo(str);
            }
            bArr2 = catArray(bArr2, getArray((byte) -126, catArray(catArray(catArray(bArr3, bArr4), bArr5), bArr6)));
        }
        short s3 = this.fid;
        if (s3 != -1) {
            bArr2 = catArray(bArr2, getArray(FILE_IDENTIFIER, AlertController$RecycleListView.ParcelableVolumeInfo(AlertController$RecycleListView.read(s3))));
        }
        byte[] bArr7 = this.dfName;
        if (bArr7 != null) {
            bArr2 = catArray(bArr2, getArray((byte) -124, bArr7));
        }
        byte[] bArr8 = this.propInfo;
        if (bArr8 != null) {
            bArr2 = catArray(bArr2, getArray(PROP_INFO, bArr8));
        }
        byte[] bArr9 = this.secAttrProp;
        if (bArr9 != null) {
            bArr2 = catArray(bArr2, getArray((byte) -122, bArr9));
        }
        short s4 = this.fciExt;
        if (s4 != -1) {
            bArr2 = catArray(bArr2, getArray(FCI_EXT, AlertController$RecycleListView.ParcelableVolumeInfo(AlertController$RecycleListView.read(s4))));
        }
        byte b3 = this.shortEF;
        if (b3 != -1) {
            if (b3 == 0) {
                bArr = new byte[0];
            } else {
                bArr = new byte[]{b3};
            }
            bArr2 = catArray(bArr2, getArray((byte) -120, bArr));
        }
        byte b4 = this.lcsByte;
        if (b4 != -1) {
            bArr2 = catArray(bArr2, getArray(LCS_BYTE, new byte[]{b4}));
        }
        byte[] bArr10 = this.secAttrExp;
        if (bArr10 != null) {
            bArr2 = catArray(bArr2, getArray(SECURITY_ATTR_EXP, bArr10));
        }
        byte[] bArr11 = this.secAttrCompact;
        if (bArr11 != null) {
            bArr2 = catArray(bArr2, getArray(SECURITY_ATTR_COMPACT, bArr11));
        }
        short s5 = this.envTempEF;
        if (s5 != -1) {
            bArr2 = catArray(bArr2, getArray(ENV_TEMP_EF, AlertController$RecycleListView.ParcelableVolumeInfo(AlertController$RecycleListView.read(s5))));
        }
        byte b5 = this.channelSecurity;
        if (b5 != -1) {
            bArr2 = catArray(bArr2, getArray(CHANNEL_SECURITY, new byte[]{b5}));
        }
        byte[] bArr12 = this.f5473a0;
        if (bArr12 != null) {
            bArr2 = catArray(bArr2, getArray(f5467A0, bArr12));
        }
        byte[] bArr13 = this.f5474a1;
        if (bArr13 != null) {
            bArr2 = catArray(bArr2, getArray(f5468A1, bArr13));
        }
        byte[] bArr14 = this.f5475a2;
        if (bArr14 != null) {
            bArr2 = catArray(bArr2, getArray((byte) -94, bArr14));
        }
        byte[] bArr15 = this.f5476a5;
        if (bArr15 != null) {
            bArr2 = catArray(bArr2, getArray(f5470A5, bArr15));
        }
        byte[] bArr16 = this.f5477ab;
        if (bArr16 != null) {
            bArr2 = catArray(bArr2, getArray(f5471AB, bArr16));
        }
        byte[] bArr17 = this.f5478ac;
        if (bArr17 != null) {
            bArr2 = catArray(bArr2, getArray((byte) -84, bArr17));
        }
        return getArray(this.mainTag, bArr2);
    }

    private static byte[] getArray(byte b, byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 2)];
        bArr2[0] = b;
        bArr2[1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
        return bArr2;
    }

    private static byte[] catArray(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Length: ");
        sb.append(this.fileLength);
        sb.append("\nLength FCI: ");
        sb.append(this.fileLengthFCI);
        sb.append("\nDesc byte: ");
        sb.append(this.descriptorByte);
        sb.append("\nData byte: ");
        sb.append(this.dataCodingByte);
        sb.append("\nRecord size: ");
        sb.append(this.maxRecordSize);
        sb.append("\nRecord count: ");
        sb.append(this.maxRecordsCount);
        sb.append("\nFID: ");
        sb.append(AlertController$RecycleListView.read(this.fid));
        sb.append("\nDF name: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.dfName));
        sb.append("\npropInfo: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.propInfo));
        sb.append("\nsecAttrProp: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.secAttrProp));
        sb.append("\nsecAttrExp: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.secAttrExp));
        sb.append("\nsecAttrComp: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.secAttrCompact));
        sb.append("\nFCI ext: ");
        sb.append(AlertController$RecycleListView.read(this.fciExt));
        sb.append("\nEF env temp: ");
        sb.append(AlertController$RecycleListView.read(this.envTempEF));
        sb.append("\nShort EF: ");
        sb.append(AlertController$RecycleListView.read(this.shortEF));
        sb.append("\nLCS byte: ");
        sb.append(AlertController$RecycleListView.read(this.lcsByte));
        sb.append("\nChannel sec: ");
        sb.append(AlertController$RecycleListView.read(this.channelSecurity));
        sb.append("\na0: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.f5473a0));
        sb.append("\na1: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.f5474a1));
        sb.append("\na2: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.f5475a2));
        sb.append("\na5: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.f5476a5));
        sb.append("\nab: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.f5477ab));
        sb.append("\nac: ");
        sb.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.f5478ac));
        sb.append("\n");
        return sb.toString();
    }

    public short getFID() {
        return this.fid;
    }

    public int getFileLength() {
        return this.fileLength;
    }
}

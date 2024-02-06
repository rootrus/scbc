package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

public class AESEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: S */
    private static final byte[] f5826S = {99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.f5471AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.f5470A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, Ascii.SUB, Ascii.ESC, 110, 90, ISOFileInfo.f5467A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Ascii.DEL, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, 16, -1, -13, ISO7816.INS_WRITE_RECORD, -51, 12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, Ascii.ETB, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, Ascii.f3248EM, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, 11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, Ascii.f3259US, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, 30, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.f5468A1, -119, 13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, 15, ISO7816.INS_READ_BINARY, 84, -69, Ascii.SYN};

    /* renamed from: Si */
    private static final byte[] f5827Si = {82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.f5470A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, 11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.f5468A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, Ascii.NAK, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.f5471AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, 30, -113, ISO7816.INS_GET_DATA, 63, 15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, Ascii.SUB, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, 14, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, 32, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, Ascii.f3259US, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, Ascii.DC2, 16, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Ascii.DEL, -87, Ascii.f3248EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.f5467A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, Ascii.DC4, 99, 85, 33, 12, 125};

    /* renamed from: T0 */
    private static final int[] f5828T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] Tinv0 = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    /* renamed from: m1 */
    private static final int f5829m1 = -2139062144;

    /* renamed from: m2 */
    private static final int f5830m2 = 2139062143;

    /* renamed from: m3 */
    private static final int f5831m3 = 27;

    /* renamed from: m4 */
    private static final int f5832m4 = -1061109568;

    /* renamed from: m5 */
    private static final int f5833m5 = 1061109567;
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 47, 94, 188, 99, 198, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, 250, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    /* renamed from: C0 */
    private int f5834C0;

    /* renamed from: C1 */
    private int f5835C1;

    /* renamed from: C2 */
    private int f5836C2;

    /* renamed from: C3 */
    private int f5837C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    private static int FFmulX(int i) {
        return ((i & f5830m2) << 1) ^ (((f5829m1 & i) >>> 7) * 27);
    }

    private static int FFmulX2(int i) {
        int i2 = f5832m4 & i;
        int i3 = i2 ^ (i2 >>> 1);
        return (((i & f5833m5) << 2) ^ (i3 >>> 2)) ^ (i3 >>> 5);
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.f5834C0;
        int i2 = this.ROUNDS;
        char c = 0;
        int i3 = i ^ iArr[i2][0];
        int i4 = 1;
        int i5 = this.f5835C1 ^ iArr[i2][1];
        char c2 = 2;
        int i6 = this.f5836C2 ^ iArr[i2][2];
        int i7 = i2 - 1;
        char c3 = 3;
        int i8 = iArr[i2][3] ^ this.f5837C3;
        while (i7 > i4) {
            int[] iArr2 = Tinv0;
            int shift = (((shift(iArr2[(i8 >> 8) & 255], 24) ^ iArr2[i3 & 255]) ^ shift(Tinv0[(i6 >> 16) & 255], 16)) ^ shift(Tinv0[i5 >>> 24], 8)) ^ iArr[i7][c];
            int[] iArr3 = Tinv0;
            int shift2 = (((shift(iArr3[(i3 >> 8) & 255], 24) ^ iArr3[i5 & 255]) ^ shift(Tinv0[(i8 >> 16) & 255], 16)) ^ shift(Tinv0[i6 >>> 24], 8)) ^ iArr[i7][i4];
            int[] iArr4 = Tinv0;
            int shift3 = (((shift(iArr4[(i5 >> 8) & 255], 24) ^ iArr4[i6 & 255]) ^ shift(Tinv0[(i3 >> 16) & 255], 16)) ^ shift(Tinv0[i8 >>> 24], 8)) ^ iArr[i7][c2];
            int[] iArr5 = Tinv0;
            int i9 = iArr5[i8 & 255];
            int shift4 = shift(iArr5[(i6 >> 8) & 255], 24);
            int i10 = i7 - 1;
            int shift5 = (shift(Tinv0[i3 >>> 24], 8) ^ ((i9 ^ shift4) ^ shift(Tinv0[(i5 >> 16) & 255], 16))) ^ iArr[i7][c3];
            int[] iArr6 = Tinv0;
            int i11 = iArr6[shift & 255];
            int shift6 = shift(iArr6[(shift5 >> 8) & 255], 24);
            int shift7 = shift(Tinv0[(shift3 >> 16) & 255], 16);
            int shift8 = shift(Tinv0[shift2 >>> 24], 8);
            int i12 = iArr[i10][0];
            int[] iArr7 = Tinv0;
            int i13 = iArr7[shift2 & 255];
            int shift9 = shift(iArr7[(shift >> 8) & 255], 24);
            int shift10 = shift(Tinv0[(shift5 >> 16) & 255], 16);
            int shift11 = shift(Tinv0[shift3 >>> 24], 8);
            int i14 = iArr[i10][1];
            int[] iArr8 = Tinv0;
            int i15 = iArr8[shift3 & 255];
            int i16 = iArr8[(shift2 >> 8) & 255];
            int i17 = i15;
            int shift12 = shift(i16, 24);
            int shift13 = shift(Tinv0[(shift >> 16) & 255], 16);
            int shift14 = shift(Tinv0[shift5 >>> 24], 8);
            int i18 = iArr[i10][2];
            int[] iArr9 = Tinv0;
            int i19 = iArr9[shift5 & 255];
            int shift15 = shift(iArr9[(shift3 >> 8) & 255], 24);
            int shift16 = ((shift15 ^ i19) ^ shift(Tinv0[(shift2 >> 16) & 255], 16)) ^ shift(Tinv0[shift >>> 24], 8);
            i3 = (((shift6 ^ i11) ^ shift7) ^ shift8) ^ i12;
            i5 = (((shift9 ^ i13) ^ shift10) ^ shift11) ^ i14;
            i6 = (((shift12 ^ i17) ^ shift13) ^ shift14) ^ i18;
            i7 = i10 - 1;
            i4 = 1;
            c = 0;
            c2 = 2;
            c3 = 3;
            i8 = shift16 ^ iArr[i10][3];
        }
        int[] iArr10 = Tinv0;
        int shift17 = (((shift(iArr10[(i8 >> 8) & 255], 24) ^ iArr10[i3 & 255]) ^ shift(Tinv0[(i6 >> 16) & 255], 16)) ^ shift(Tinv0[i5 >>> 24], 8)) ^ iArr[i7][0];
        int[] iArr11 = Tinv0;
        int shift18 = (((shift(iArr11[(i3 >> 8) & 255], 24) ^ iArr11[i5 & 255]) ^ shift(Tinv0[(i8 >> 16) & 255], 16)) ^ shift(Tinv0[i6 >>> 24], 8)) ^ iArr[i7][1];
        int[] iArr12 = Tinv0;
        int shift19 = (((shift(iArr12[(i5 >> 8) & 255], 24) ^ iArr12[i6 & 255]) ^ shift(Tinv0[(i3 >> 16) & 255], 16)) ^ shift(Tinv0[i8 >>> 24], 8)) ^ iArr[i7][2];
        int[] iArr13 = Tinv0;
        int shift20 = (shift(Tinv0[i3 >>> 24], 8) ^ ((iArr13[i8 & 255] ^ shift(iArr13[(i6 >> 8) & 255], 24)) ^ shift(Tinv0[(i5 >> 16) & 255], 16))) ^ iArr[i7][3];
        byte[] bArr = f5827Si;
        this.f5834C0 = ((((bArr[shift17 & 255] & 255) ^ ((bArr[(shift20 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift19 >> 16) & 255] & 255) << 16)) ^ (bArr[shift18 >>> 24] << Ascii.CAN)) ^ iArr[0][0];
        this.f5835C1 = ((((bArr[shift18 & 255] & 255) ^ ((bArr[(shift17 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift20 >> 16) & 255] & 255) << 16)) ^ (bArr[shift19 >>> 24] << Ascii.CAN)) ^ iArr[0][1];
        this.f5836C2 = ((((bArr[shift19 & 255] & 255) ^ ((bArr[(shift18 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift17 >> 16) & 255] & 255) << 16)) ^ (bArr[shift20 >>> 24] << Ascii.CAN)) ^ iArr[0][2];
        this.f5837C3 = ((bArr[shift17 >>> 24] << Ascii.CAN) ^ (((bArr[shift20 & 255] & 255) ^ ((bArr[(shift19 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift18 >> 16) & 255] & 255) << 16))) ^ iArr[0][3];
    }

    private void encryptBlock(int[][] iArr) {
        AESEngine aESEngine = this;
        char c = 0;
        int i = aESEngine.f5834C0 ^ iArr[0][0];
        int i2 = 1;
        int i3 = aESEngine.f5835C1 ^ iArr[0][1];
        char c2 = 2;
        int i4 = aESEngine.f5836C2 ^ iArr[0][2];
        char c3 = 3;
        int i5 = aESEngine.f5837C3 ^ iArr[0][3];
        int i6 = 1;
        while (i6 < aESEngine.ROUNDS - i2) {
            int[] iArr2 = f5828T0;
            int shift = (((shift(iArr2[(i3 >> 8) & 255], 24) ^ iArr2[i & 255]) ^ shift(f5828T0[(i4 >> 16) & 255], 16)) ^ shift(f5828T0[i5 >>> 24], 8)) ^ iArr[i6][c];
            int[] iArr3 = f5828T0;
            int shift2 = (((shift(iArr3[(i4 >> 8) & 255], 24) ^ iArr3[i3 & 255]) ^ shift(f5828T0[(i5 >> 16) & 255], 16)) ^ shift(f5828T0[i >>> 24], 8)) ^ iArr[i6][i2];
            int[] iArr4 = f5828T0;
            int shift3 = (((shift(iArr4[(i5 >> 8) & 255], 24) ^ iArr4[i4 & 255]) ^ shift(f5828T0[(i >> 16) & 255], 16)) ^ shift(f5828T0[i3 >>> 24], 8)) ^ iArr[i6][c2];
            int[] iArr5 = f5828T0;
            int i7 = iArr5[i5 & 255];
            int shift4 = shift(iArr5[(i >> 8) & 255], 24);
            int i8 = i6 + 1;
            int shift5 = (((shift4 ^ i7) ^ shift(f5828T0[(i3 >> 16) & 255], 16)) ^ shift(f5828T0[i4 >>> 24], 8)) ^ iArr[i6][c3];
            int[] iArr6 = f5828T0;
            int i9 = iArr6[shift & 255];
            int shift6 = shift(iArr6[(shift2 >> 8) & 255], 24);
            int shift7 = shift(f5828T0[(shift3 >> 16) & 255], 16);
            int shift8 = shift(f5828T0[shift5 >>> 24], 8);
            int i10 = iArr[i8][0];
            int[] iArr7 = f5828T0;
            int i11 = iArr7[shift2 & 255];
            int shift9 = shift(iArr7[(shift3 >> 8) & 255], 24);
            int shift10 = shift(f5828T0[(shift5 >> 16) & 255], 16);
            int shift11 = shift(f5828T0[shift >>> 24], 8);
            int i12 = iArr[i8][1];
            int[] iArr8 = f5828T0;
            int i13 = iArr8[shift3 & 255];
            int i14 = iArr8[(shift5 >> 8) & 255];
            int i15 = i13;
            int shift12 = shift(i14, 24);
            int shift13 = shift(f5828T0[(shift >> 16) & 255], 16);
            int shift14 = shift(f5828T0[shift2 >>> 24], 8);
            int i16 = iArr[i8][2];
            int[] iArr9 = f5828T0;
            int i17 = iArr9[shift5 & 255];
            int shift15 = shift(iArr9[(shift >> 8) & 255], 24);
            int shift16 = ((shift15 ^ i17) ^ shift(f5828T0[(shift2 >> 16) & 255], 16)) ^ shift(f5828T0[shift3 >>> 24], 8);
            i = (((shift6 ^ i9) ^ shift7) ^ shift8) ^ i10;
            i4 = (((shift12 ^ i15) ^ shift13) ^ shift14) ^ i16;
            i6 = i8 + 1;
            i5 = shift16 ^ iArr[i8][3];
            i2 = 1;
            i3 = (((shift9 ^ i11) ^ shift10) ^ shift11) ^ i12;
            c = 0;
            c2 = 2;
            c3 = 3;
            aESEngine = this;
        }
        int[] iArr10 = f5828T0;
        int shift17 = (((shift(iArr10[(i3 >> 8) & 255], 24) ^ iArr10[i & 255]) ^ shift(f5828T0[(i4 >> 16) & 255], 16)) ^ shift(f5828T0[i5 >>> 24], 8)) ^ iArr[i6][0];
        int[] iArr11 = f5828T0;
        int shift18 = (((shift(iArr11[(i4 >> 8) & 255], 24) ^ iArr11[i3 & 255]) ^ shift(f5828T0[(i5 >> 16) & 255], 16)) ^ shift(f5828T0[i >>> 24], 8)) ^ iArr[i6][1];
        int[] iArr12 = f5828T0;
        int shift19 = (((shift(iArr12[(i5 >> 8) & 255], 24) ^ iArr12[i4 & 255]) ^ shift(f5828T0[(i >> 16) & 255], 16)) ^ shift(f5828T0[i3 >>> 24], 8)) ^ iArr[i6][2];
        int[] iArr13 = f5828T0;
        int i18 = iArr13[i5 & 255];
        int shift20 = shift(iArr13[(i >> 8) & 255], 24);
        int i19 = i6 + 1;
        int shift21 = (((shift20 ^ i18) ^ shift(f5828T0[(i3 >> 16) & 255], 16)) ^ shift(f5828T0[i4 >>> 24], 8)) ^ iArr[i6][3];
        byte[] bArr = f5826S;
        this.f5834C0 = ((((bArr[shift17 & 255] & 255) ^ ((bArr[(shift18 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift19 >> 16) & 255] & 255) << 16)) ^ (bArr[shift21 >>> 24] << Ascii.CAN)) ^ iArr[i19][0];
        this.f5835C1 = ((((bArr[shift18 & 255] & 255) ^ ((bArr[(shift19 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift21 >> 16) & 255] & 255) << 16)) ^ (bArr[shift17 >>> 24] << Ascii.CAN)) ^ iArr[i19][1];
        this.f5836C2 = ((((bArr[shift19 & 255] & 255) ^ ((bArr[(shift21 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift17 >> 16) & 255] & 255) << 16)) ^ (bArr[shift18 >>> 24] << Ascii.CAN)) ^ iArr[i19][2];
        this.f5837C3 = (((((bArr[(shift17 >> 8) & 255] & 255) << 8) ^ (bArr[shift21 & 255] & 255)) ^ ((bArr[(shift18 >> 16) & 255] & 255) << 16)) ^ (bArr[shift19 >>> 24] << Ascii.CAN)) ^ iArr[i19][3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i = length >>> 2;
        int i2 = i + 6;
        this.ROUNDS = i2;
        int[] iArr = new int[2];
        iArr[1] = 4;
        iArr[0] = i2 + 1;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        if (i == 4) {
            int littleEndianToInt = Pack.littleEndianToInt(bArr2, 0);
            iArr2[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr2, 4);
            iArr2[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr2, 8);
            iArr2[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr2, 12);
            iArr2[0][3] = littleEndianToInt4;
            for (int i3 = 1; i3 <= 10; i3++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i3 - 1];
                iArr2[i3][0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[i3][1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[i3][2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[i3][3] = littleEndianToInt4;
            }
        } else if (i == 6) {
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr2, 0);
            iArr2[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr2, 4);
            iArr2[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr2, 8);
            iArr2[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr2, 12);
            iArr2[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr2, 16);
            iArr2[1][0] = littleEndianToInt9;
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr2, 20);
            iArr2[1][1] = littleEndianToInt10;
            int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ 1);
            iArr2[1][2] = subWord;
            int i4 = littleEndianToInt6 ^ subWord;
            iArr2[1][3] = i4;
            int i5 = littleEndianToInt7 ^ i4;
            iArr2[2][0] = i5;
            int i6 = littleEndianToInt8 ^ i5;
            iArr2[2][1] = i6;
            int i7 = littleEndianToInt9 ^ i6;
            iArr2[2][2] = i7;
            int i8 = littleEndianToInt10 ^ i7;
            iArr2[2][3] = i8;
            int i9 = 3;
            int i10 = 2;
            while (i9 < 12) {
                int i11 = i10 << 1;
                int subWord2 = subWord ^ (i10 ^ subWord(shift(i8, 8)));
                iArr2[i9][0] = subWord2;
                int i12 = i4 ^ subWord2;
                iArr2[i9][1] = i12;
                int i13 = i5 ^ i12;
                iArr2[i9][2] = i13;
                int i14 = i6 ^ i13;
                iArr2[i9][3] = i14;
                int i15 = i7 ^ i14;
                int i16 = i9 + 1;
                iArr2[i16][0] = i15;
                int i17 = i8 ^ i15;
                iArr2[i16][1] = i17;
                subWord = subWord2 ^ (subWord(shift(i17, 8)) ^ i11);
                iArr2[i16][2] = subWord;
                i4 = i12 ^ subWord;
                iArr2[i16][3] = i4;
                i5 = i13 ^ i4;
                int i18 = i9 + 2;
                iArr2[i18][0] = i5;
                i6 = i14 ^ i5;
                iArr2[i18][1] = i6;
                i7 = i15 ^ i6;
                iArr2[i18][2] = i7;
                i8 = i17 ^ i7;
                iArr2[i18][3] = i8;
                i9 += 3;
                i10 = i11 << 1;
            }
            int subWord3 = (subWord(shift(i8, 8)) ^ 128) ^ subWord;
            iArr2[12][0] = subWord3;
            int i19 = subWord3 ^ i4;
            iArr2[12][1] = i19;
            int i20 = i19 ^ i5;
            iArr2[12][2] = i20;
            iArr2[12][3] = i20 ^ i6;
        } else if (i == 8) {
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr2, 0);
            iArr2[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr2, 4);
            iArr2[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr2, 8);
            iArr2[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr2, 12);
            iArr2[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr2, 16);
            iArr2[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr2, 20);
            iArr2[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr2, 24);
            iArr2[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr2, 28);
            iArr2[1][3] = littleEndianToInt18;
            int i21 = 2;
            int i22 = 1;
            while (i21 < 14) {
                littleEndianToInt11 ^= subWord(shift(littleEndianToInt18, 8)) ^ i22;
                iArr2[i21][0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr2[i21][1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr2[i21][2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr2[i21][3] = littleEndianToInt14;
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int i23 = i21 + 1;
                iArr2[i23][0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr2[i23][1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr2[i23][2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr2[i23][3] = littleEndianToInt18;
                i21 += 2;
                i22 <<= 1;
            }
            int subWord4 = (subWord(shift(littleEndianToInt18, 8)) ^ i22) ^ littleEndianToInt11;
            iArr2[14][0] = subWord4;
            int i24 = subWord4 ^ littleEndianToInt12;
            iArr2[14][1] = i24;
            int i25 = i24 ^ littleEndianToInt13;
            iArr2[14][2] = i25;
            iArr2[14][3] = i25 ^ littleEndianToInt14;
        } else {
            throw new IllegalStateException("Should never get here");
        }
        if (!z) {
            for (int i26 = 1; i26 < this.ROUNDS; i26++) {
                for (int i27 = 0; i27 < 4; i27++) {
                    iArr2[i26][i27] = inv_mcol(iArr2[i26][i27]);
                }
            }
        }
        return iArr2;
    }

    private static int inv_mcol(int i) {
        int shift = shift(i, 8) ^ i;
        int FFmulX = i ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = this.f5834C0;
        bArr[i] = (byte) i3;
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 16);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i3 >> 24);
        int i7 = i6 + 1;
        int i8 = this.f5835C1;
        bArr[i6] = (byte) i8;
        int i9 = i7 + 1;
        bArr[i7] = (byte) (i8 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i8 >> 16);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (i8 >> 24);
        int i12 = i11 + 1;
        int i13 = this.f5836C2;
        bArr[i11] = (byte) i13;
        int i14 = i12 + 1;
        bArr[i12] = (byte) (i13 >> 8);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i13 >> 16);
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i13 >> 24);
        int i17 = i16 + 1;
        int i18 = this.f5837C3;
        bArr[i16] = (byte) i18;
        int i19 = i17 + 1;
        bArr[i17] = (byte) (i18 >> 8);
        bArr[i19] = (byte) (i18 >> 16);
        bArr[i19 + 1] = (byte) (i18 >> 24);
    }

    private static int shift(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private static int subWord(int i) {
        byte[] bArr = f5826S;
        return (bArr[i >>> 24] << Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        this.f5834C0 = b;
        int i3 = i2 + 1;
        byte b2 = b | ((bArr[i2] & 255) << 8);
        this.f5834C0 = b2;
        int i4 = i3 + 1;
        byte b3 = b2 | ((bArr[i3] & 255) << 16);
        this.f5834C0 = b3;
        int i5 = i4 + 1;
        this.f5834C0 = b3 | (bArr[i4] << Ascii.CAN);
        int i6 = i5 + 1;
        byte b4 = bArr[i5] & 255;
        this.f5835C1 = b4;
        int i7 = i6 + 1;
        byte b5 = ((bArr[i6] & 255) << 8) | b4;
        this.f5835C1 = b5;
        int i8 = i7 + 1;
        byte b6 = b5 | ((bArr[i7] & 255) << 16);
        this.f5835C1 = b6;
        int i9 = i8 + 1;
        this.f5835C1 = b6 | (bArr[i8] << Ascii.CAN);
        int i10 = i9 + 1;
        byte b7 = bArr[i9] & 255;
        this.f5836C2 = b7;
        int i11 = i10 + 1;
        byte b8 = ((bArr[i10] & 255) << 8) | b7;
        this.f5836C2 = b8;
        int i12 = i11 + 1;
        byte b9 = b8 | ((bArr[i11] & 255) << 16);
        this.f5836C2 = b9;
        int i13 = i12 + 1;
        this.f5836C2 = b9 | (bArr[i12] << Ascii.CAN);
        int i14 = i13 + 1;
        byte b10 = bArr[i13] & 255;
        this.f5837C3 = b10;
        int i15 = i14 + 1;
        byte b11 = ((bArr[i14] & 255) << 8) | b10;
        this.f5837C3 = b11;
        byte b12 = b11 | ((bArr[i15] & 255) << 16);
        this.f5837C3 = b12;
        this.f5837C3 = (bArr[i15 + 1] << Ascii.CAN) | b12;
    }

    public String getAlgorithmName() {
        return "AES";
    }

    public int getBlockSize() {
        return 16;
    }

    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
            this.forEncryption = z;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid parameter passed to AES init - ");
        sb.append(cipherParameters.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        } else if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 16 <= bArr2.length) {
            boolean z = this.forEncryption;
            unpackBlock(bArr, i);
            int[][] iArr = this.WorkingKey;
            if (z) {
                encryptBlock(iArr);
            } else {
                decryptBlock(iArr);
            }
            packBlock(bArr2, i2);
            return 16;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    public void reset() {
    }
}

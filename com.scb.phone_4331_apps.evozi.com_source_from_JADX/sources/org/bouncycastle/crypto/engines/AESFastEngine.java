package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.util.Pack;
import org.jmrtd.lds.CVCAFile;

public class AESFastEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: S */
    private static final byte[] f5838S = {99, 124, 119, 123, -14, 107, ISOFileInfo.FCI_BYTE, -59, ISO7816.INS_DECREASE, 1, 103, 43, -2, -41, ISOFileInfo.f5471AB, 118, ISO7816.INS_GET_DATA, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, ISO7816.INS_GET_RESPONSE, -73, -3, -109, 38, 54, 63, -9, -52, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.f5470A5, -27, -15, 113, ISO7816.INS_LOAD_KEY_FILE, 49, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, Ascii.DC2, ISOFileInfo.DATA_BYTES1, ISO7816.INS_APPEND_RECORD, -21, 39, -78, 117, 9, ISOFileInfo.FILE_IDENTIFIER, ISO7816.INS_UNBLOCK_CHV, Ascii.SUB, Ascii.ESC, 110, 90, ISOFileInfo.f5467A0, 82, 59, ISO7816.INS_UPDATE_BINARY, ISO7816.INS_READ_RECORD2, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, ISO7816.INS_READ_BINARY2, 91, 106, -53, -66, 57, 74, 76, 88, -49, ISO7816.INS_WRITE_BINARY, -17, -86, -5, 67, 77, 51, ISOFileInfo.PROP_INFO, 69, -7, 2, Ascii.DEL, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, ISO7816.INS_READ_RECORD_STAMPED, ISO7816.INS_PUT_DATA, 33, 16, -1, -13, ISO7816.INS_WRITE_RECORD, -51, 12, 19, -20, 95, -105, ISO7816.INS_REHABILITATE_CHV, Ascii.ETB, -60, -89, 126, 61, ISOFileInfo.FMD_BYTE, 93, Ascii.f3248EM, 115, 96, ISOFileInfo.DATA_BYTES2, 79, ISO7816.INS_UPDATE_RECORD, ISO7816.INS_MSE, ISO7816.INS_PSO, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, 11, -37, ISO7816.INS_CREATE_FILE, ISO7816.INS_INCREASE, 58, 10, 73, 6, ISO7816.INS_CHANGE_CHV, 92, ISO7816.INS_ENVELOPE, -45, -84, ISOFileInfo.FCP_BYTE, -111, -107, ISO7816.INS_DELETE_FILE, 121, -25, -56, 55, 109, ISOFileInfo.ENV_TEMP_EF, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, ISO7816.INS_READ_BINARY_STAMPED, -58, -24, -35, 116, Ascii.f3259US, 75, -67, ISOFileInfo.SECURITY_ATTR_EXP, ISOFileInfo.LCS_BYTE, ISO7816.INS_MANAGE_CHANNEL, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, ISOFileInfo.CHANNEL_SECURITY, -108, -101, 30, ISOFileInfo.FCI_EXT, -23, -50, 85, 40, -33, ISOFileInfo.SECURITY_ATTR_COMPACT, ISOFileInfo.f5468A1, -119, 13, -65, -26, CVCAFile.CAR_TAG, 104, 65, -103, 45, 15, ISO7816.INS_READ_BINARY, 84, -69, Ascii.SYN};

    /* renamed from: Si */
    private static final byte[] f5839Si = {82, 9, 106, -43, ISO7816.INS_DECREASE, 54, ISOFileInfo.f5470A5, 56, -65, 64, -93, -98, ISOFileInfo.DATA_BYTES2, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, ISOFileInfo.FCI_EXT, ISO7816.INS_DECREASE_STAMPED, ISOFileInfo.CHANNEL_SECURITY, 67, ISO7816.INS_REHABILITATE_CHV, -60, -34, -23, -53, 84, 123, -108, ISO7816.INS_INCREASE, -90, ISO7816.INS_ENVELOPE, 35, 61, -18, 76, -107, 11, CVCAFile.CAR_TAG, -6, -61, 78, 8, 46, ISOFileInfo.f5468A1, 102, 40, -39, ISO7816.INS_CHANGE_CHV, -78, 118, 91, -94, 73, 109, ISOFileInfo.SECURITY_ATTR_EXP, -47, 37, 114, -8, -10, ISOFileInfo.FMD_BYTE, -122, 104, -104, Ascii.SYN, -44, -92, 92, -52, 93, 101, ISO7816.INS_READ_RECORD_STAMPED, -110, 108, ISO7816.INS_MANAGE_CHANNEL, 72, 80, -3, -19, -71, ISO7816.INS_PUT_DATA, 94, Ascii.NAK, 70, 87, -89, ISOFileInfo.ENV_TEMP_EF, -99, -124, -112, ISO7816.INS_LOAD_KEY_FILE, ISOFileInfo.f5471AB, 0, ISOFileInfo.SECURITY_ATTR_COMPACT, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, ISO7816.INS_DELETE_FILE, 88, 5, -72, ISO7816.INS_READ_RECORD2, 69, 6, ISO7816.INS_WRITE_BINARY, ISO7816.INS_UNBLOCK_CHV, 30, -113, ISO7816.INS_GET_DATA, 63, 15, 2, -63, -81, -67, 3, 1, 19, ISOFileInfo.LCS_BYTE, 107, 58, -111, 17, 65, 79, 103, ISO7816.INS_UPDATE_RECORD, -22, -105, -14, -49, -50, -16, ISO7816.INS_READ_BINARY_STAMPED, -26, 115, -106, -84, 116, ISO7816.INS_MSE, -25, -83, 53, ISOFileInfo.PROP_INFO, ISO7816.INS_APPEND_RECORD, -7, 55, -24, 28, 117, -33, 110, 71, -15, Ascii.SUB, 113, 29, 41, -59, -119, ISOFileInfo.FCI_BYTE, -73, ISOFileInfo.FCP_BYTE, 14, -86, Ascii.CAN, -66, Ascii.ESC, -4, 86, 62, 75, -58, ISO7816.INS_WRITE_RECORD, 121, 32, -102, -37, ISO7816.INS_GET_RESPONSE, -2, 120, -51, 90, -12, Ascii.f3259US, -35, -88, 51, -120, 7, -57, 49, ISO7816.INS_READ_BINARY2, Ascii.DC2, 16, 89, 39, ISOFileInfo.DATA_BYTES1, -20, 95, 96, 81, Ascii.DEL, -87, Ascii.f3248EM, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, ISOFileInfo.f5467A0, ISO7816.INS_CREATE_FILE, 59, 77, -82, ISO7816.INS_PSO, -11, ISO7816.INS_READ_BINARY, -56, -21, -69, 60, ISOFileInfo.FILE_IDENTIFIER, 83, -103, 97, Ascii.ETB, 43, 4, 126, -70, 119, ISO7816.INS_UPDATE_BINARY, 38, -31, 105, Ascii.DC4, 99, 85, 33, 12, 125};

    /* renamed from: T */
    private static final int[] f5840T;
    private static final int[] Tinv;

    /* renamed from: m1 */
    private static final int f5841m1 = -2139062144;

    /* renamed from: m2 */
    private static final int f5842m2 = 2139062143;

    /* renamed from: m3 */
    private static final int f5843m3 = 27;

    /* renamed from: m4 */
    private static final int f5844m4 = -1061109568;

    /* renamed from: m5 */
    private static final int f5845m5 = 1061109567;
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 47, 94, 188, 99, 198, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, 250, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    /* renamed from: C0 */
    private int f5846C0;

    /* renamed from: C1 */
    private int f5847C1;

    /* renamed from: C2 */
    private int f5848C2;

    /* renamed from: C3 */
    private int f5849C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    static {
        int[] iArr = new int[1024];
        ByteBuffer.wrap("¥ccÆ||øwwî{{ö\ròòÿ½kkÖ±ooÞTÅÅP00`\u0003\u0001\u0001\u0002©ggÎ}++V\u0019þþçb××µæ««MvvìEÊÊ\u001f@ÉÉ}}ú\u0015úúïëYY²ÉGG\u000bððûì­­AgÔÔ³ý¢¢_ê¯¯E¿#÷¤¤Srrä[ÀÀÂ··u\u001cýýá®=j&&LZ66lA??~\u0002÷÷õOÌÌ\\44hô¥¥Q4ååÑ\bññùqqâsØØ«S11b?\u0015\u0015*\f\u0004\u0004\bRÇÇe##F^ÃÃ(\u0018\u00180¡7\u000f\u0005\u0005\nµ/\t\u0007\u0007\u000e6\u0012\u0012$\u001b=ââß&ëëÍi''NÍ²²uuê\u001b\t\t\u0012\u001dt,,X.\u001a\u001a4-\u001b\u001b6²nnÜîZZ´û  [öRR¤M;;vaÖÖ·Î³³}{))R>ããÝq//^\u0013õSS¦hÑÑ¹\u0000\u0000\u0000\u0000,ííÁ`  @\u001füüãÈ±±yí[[¶¾jjÔFËËÙ¾¾gK99rÞJJÔLLèXX°JÏÏkÐÐ»*ïïÅåªªO\u0016ûûíÅCC×MMU33f\u0011ÏEE\u0010ùùé\u0006\u0002\u0002\u0004þðPP D<<xº%ã¨¨KóQQ¢þ££]À@@\u0005­?¼!H88p\u0004õõñß¼¼cÁ¶¶wuÚÚ¯c!!B0\u0010\u0010 \u001aÿÿå\u000eóóýmÒÒ¿LÍÍ\u0014\f\f\u00185\u0013\u0013&/ììÃá__¾¢5ÌDD9\u0017\u0017.WÄÄò§§U~~üG==z¬ddÈç]]º+\u0019\u00192ssæ ``À\u0019ÑOOÜÜ£f\"\"D~**T«;\u000bÊFF)îîÇÓ¸¸k<\u0014\u0014(yÞÞ§â^^¼\u001d\u000b\u000b\u0016vÛÛ­;ààÛV22dN::t\u001e\n\n\u0014ÛII\n\u0006\u0006\fl$$Hä\\\\¸]ÂÂnÓÓ½ï¬¬C¦bbÄ¨9¤17ääÓyyò2ççÕCÈÈY77n·mmÚ\u0001dÕÕ±ÒNNà©©I´llØúVV¬\u0007ôôó%êêÏ¯eeÊzzôé®®G\u0018\b\b\u0010Õººoxxðo%%Jr..\\$\u001c\u001c8ñ¦¦WÇ´´sQÆÆ#èèË|ÝÝ¡ttè!\u001f\u001f>ÝKKÜ½½a\r\u000fppàB>>|ÄµµqªffÌØHH\u0005\u0003\u0003\u0006\u0001öö÷\u0012\u000e\u000e\u001c£aaÂ_55jùWW®Ð¹¹i\u0017XÁÁ'\u001d\u001d:¹'8ááÙ\u0013øøë³+3\u0011\u0011\"»iiÒpÙÙ©\u0007§3¶-\"\u001e\u001e<\u0015 ééÉIÎÎÿUUªx((Pzßß¥\u0003ø¡¡Y\t\u0017\r\r\u001aÚ¿¿e1ææ×ÆBB¸hhÐÃAA°)w--Z\u0011\u000f\u000f\u001eË°°{üTT¨Ö»»m:\u0016\u0016,ccÆ¥||øwwî{{öòòÿ\rkkÖ½ooÞ±ÅÅT00`P\u0001\u0001\u0002\u0003ggÎ©++V}þþç\u0019××µb««MævvìÊÊE\u001fÉÉ@}}úúúï\u0015YY²ëGGÉððû\u000b­­AìÔÔ³g¢¢_ý¯¯Eê#¿¤¤S÷rräÀÀ[··uÂýýá\u001c=®&&Lj66lZ??~A÷÷õ\u0002ÌÌO44h\\¥¥QôååÑ4ññù\bqqâØØ«s11bS\u0015\u0015*?\u0004\u0004\b\fÇÇR##FeÃÃ^\u0018\u00180(7¡\u0005\u0005\n\u000f/µ\u0007\u0007\u000e\t\u0012\u0012$6\u001bââß=ëëÍ&''Ni²²Íuuê\t\t\u0012\u001b\u001d,,Xt\u001a\u001a4.\u001b\u001b6-nnÜ²ZZ´î  [ûRR¤ö;;vMÖÖ·a³³}Î))R{ããÝ>//^q\u0013SS¦õÑÑ¹h\u0000\u0000\u0000\u0000ííÁ,  @`üüã\u001f±±yÈ[[¶íjjÔ¾ËËF¾¾gÙ99rKJJÞLLÔXX°èÏÏJÐÐ»kïïÅ*ªªOåûûí\u0016CCÅMM×33fU\u0011EEÏùùé\u0010\u0002\u0002\u0004\u0006þPP ð<<xD%º¨¨KãQQ¢ó££]þ@@À\u0005?­!¼88pHõõñ\u0004¼¼cß¶¶wÁÚÚ¯u!!Bc\u0010\u0010 0ÿÿå\u001aóóý\u000eÒÒ¿mÍÍL\f\f\u0018\u0014\u0013\u0013&5ììÃ/__¾á5¢DDÌ\u0017\u0017.9ÄÄW§§Uò~~ü==zGddÈ¬]]ºç\u0019\u00192+ssæ``À \u0019OOÑÜÜ£\"\"Df**T~;«\u000bFFÊîîÇ)¸¸kÓ\u0014\u0014(<ÞÞ§y^^¼â\u000b\u000b\u0016\u001dÛÛ­vààÛ;22dV::tN\n\n\u0014\u001eIIÛ\u0006\u0006\f\n$$Hl\\\\¸äÂÂ]ÓÓ½n¬¬CïbbÄ¦9¨1¤ääÓ7yyòççÕ2ÈÈC77nYmmÚ·\u0001ÕÕ±dNNÒ©©IàllØ´VV¬úôôó\u0007êêÏ%eeÊ¯zzô®®Gé\b\b\u0010\u0018ººoÕxxð%%Jo..\\r\u001c\u001c8$¦¦Wñ´´sÇÆÆQèèË#ÝÝ¡|ttè\u001f\u001f>!KKÝ½½aÜ\r\u000fppà>>|BµµqÄffÌªHHØ\u0003\u0003\u0006\u0005öö÷\u0001\u000e\u000e\u001c\u0012aaÂ£55j_WW®ù¹¹iÐ\u0017ÁÁX\u001d\u001d:''¹ááÙ8øøë\u0013+³\u0011\u0011\"3iiÒ»ÙÙ©p\u00073§-¶\u001e\u001e<\"\u0015ééÉ ÎÎIUUªÿ((Pxßß¥z\u0003¡¡Yø\t\r\r\u001a\u0017¿¿eÚææ×1BBÆhhÐ¸AAÃ)°--Zw\u000f\u000f\u001e\u0011°°{ËTT¨ü»»mÖ\u0016\u0016,:cÆ¥c|ø|wîw{ö{òÿ\ròkÖ½koÞ±oÅTÅ0`P0\u0001\u0002\u0003\u0001gÎ©g+V}+þç\u0019þ×µb×«Mæ«vìvÊEÊ\u001fÉ@É}ú}úï\u0015úY²ëYGÉGðû\u000bð­Aì­Ô³gÔ¢_ý¢¯Eê¯#¿¤S÷¤rärÀ[À·uÂ·ýá\u001cý=®&Lj&6lZ6?~A?÷õ\u0002÷ÌOÌ4h\\4¥Qô¥åÑ4åñù\bñqâqØ«sØ1bS1\u0015*?\u0015\u0004\b\f\u0004ÇRÇ#Fe#Ã^Ã\u00180(\u00187¡\u0005\n\u000f\u0005/µ\u0007\u000e\t\u0007\u0012$6\u0012\u001bâß=âëÍ&ë'Ni'²Í²uêu\t\u0012\u001b\t\u001d,Xt,\u001a4.\u001a\u001b6-\u001bnÜ²nZ´îZ [û R¤öR;vM;Ö·aÖ³}Î³)R{)ãÝ>ã/^q/\u0013S¦õSÑ¹hÑ\u0000\u0000\u0000\u0000íÁ,í @` üã\u001fü±yÈ±[¶í[jÔ¾jËFË¾gÙ¾9rK9JÞJLÔLX°èXÏJÏÐ»kÐïÅ*ïªOåªûí\u0016ûCÅCM×M3fU3\u0011EÏEùé\u0010ù\u0002\u0004\u0006\u0002þP ðP<xD<%º¨Kã¨Q¢óQ£]þ£@À@\u0005?­!¼8pH8õñ\u0004õ¼cß¼¶wÁ¶Ú¯uÚ!Bc!\u0010 0\u0010ÿå\u001aÿóý\u000eóÒ¿mÒÍLÍ\f\u0018\u0014\f\u0013&5\u0013ìÃ/ì_¾á_5¢DÌD\u0017.9\u0017ÄWÄ§Uò§~ü~=zG=dÈ¬d]ºç]\u00192+\u0019sæs`À `\u0019OÑOÜ£Ü\"Df\"*T~*;«\u000bFÊFîÇ)î¸kÓ¸\u0014(<\u0014Þ§yÞ^¼â^\u000b\u0016\u001d\u000bÛ­vÛàÛ;à2dV2:tN:\n\u0014\u001e\nIÛI\u0006\f\n\u0006$Hl$\\¸ä\\Â]ÂÓ½nÓ¬Cï¬bÄ¦b9¨1¤äÓ7äyòyçÕ2çÈCÈ7nY7mÚ·m\u0001Õ±dÕNÒN©Ià©lØ´lV¬úVôó\u0007ôêÏ%êeÊ¯ezôz®Gé®\b\u0010\u0018\bºoÕºxðx%Jo%.\\r.\u001c8$\u001c¦Wñ¦´sÇ´ÆQÆèË#èÝ¡|Ýtèt\u001f>!\u001fKÝK½aÜ½\r\u000fpàp>|B>µqÄµfÌªfHØH\u0003\u0006\u0005\u0003ö÷\u0001ö\u000e\u001c\u0012\u000eaÂ£a5j_5W®ùW¹iÐ¹\u0017ÁXÁ\u001d:'\u001d'¹áÙ8áøë\u0013ø+³\u0011\"3\u0011iÒ»iÙ©pÙ\u00073§-¶\u001e<\"\u001e\u0015éÉ éÎIÎUªÿU(Px(ß¥zß\u0003¡Yø¡\t\r\u001a\u0017\r¿eÚ¿æ×1æBÆBhÐ¸hAÃA)°-Zw-\u000f\u001e\u0011\u000f°{Ë°T¨üT»mÖ»\u0016,:\u0016Æ¥ccø||îwwö{{ÿ\ròòÖ½kkÞ±ooTÅÅ`P00\u0002\u0003\u0001\u0001Î©ggV}++ç\u0019þþµb××Mæ««ìvvEÊÊ\u001f@ÉÉú}}ï\u0015úú²ëYYÉGGû\u000bððAì­­³gÔÔ_ý¢¢Eê¯¯#¿S÷¤¤ärr[ÀÀuÂ··á\u001cýý=®Lj&&lZ66~A??õ\u0002÷÷OÌÌh\\44Qô¥¥Ñ4ååù\bññâqq«sØØbS11*?\u0015\u0015\b\f\u0004\u0004RÇÇFe##^ÃÃ0(\u0018\u00187¡\n\u000f\u0005\u0005/µ\u000e\t\u0007\u0007$6\u0012\u0012\u001bß=ââÍ&ëëNi''Í²²êuu\u0012\u001b\t\t\u001dXt,,4.\u001a\u001a6-\u001b\u001bÜ²nn´îZZ[û  ¤öRRvM;;·aÖÖ}Î³³R{))Ý>ãã^q//\u0013¦õSS¹hÑÑ\u0000\u0000\u0000\u0000Á,íí@`  ã\u001füüyÈ±±¶í[[Ô¾jjFËËgÙ¾¾rK99ÞJJÔLL°èXXJÏÏ»kÐÐÅ*ïïOåªªí\u0016ûûÅCC×MMfU33\u0011ÏEEé\u0010ùù\u0004\u0006\u0002\u0002þ ðPPxD<<%ºKã¨¨¢óQQ]þ££À@@\u0005?­!¼pH88ñ\u0004õõcß¼¼wÁ¶¶¯uÚÚBc!! 0\u0010\u0010å\u001aÿÿý\u000eóó¿mÒÒLÍÍ\u0018\u0014\f\f&5\u0013\u0013Ã/ìì¾á__5¢ÌDD.9\u0017\u0017WÄÄUò§§ü~~zG==È¬ddºç]]2+\u0019\u0019æssÀ ``\u0019ÑOO£ÜÜDf\"\"T~**;«\u000bÊFFÇ)îîkÓ¸¸(<\u0014\u0014§yÞÞ¼â^^\u0016\u001d\u000b\u000b­vÛÛÛ;ààdV22tN::\u0014\u001e\n\nÛII\f\n\u0006\u0006Hl$$¸ä\\\\]ÂÂ½nÓÓCï¬¬Ä¦bb9¨1¤Ó7ääòyyÕ2ççCÈÈnY77Ú·mm\u0001±dÕÕÒNNIà©©Ø´ll¬úVVó\u0007ôôÏ%êêÊ¯eeôzzGé®®\u0010\u0018\b\boÕººðxxJo%%\\r..8$\u001c\u001cWñ¦¦sÇ´´QÆÆË#èè¡|ÝÝètt>!\u001f\u001fÝKKaÜ½½\r\u000fàpp|B>>qÄµµÌªffØHH\u0006\u0005\u0003\u0003÷\u0001öö\u001c\u0012\u000e\u000eÂ£aaj_55®ùWWiÐ¹¹\u0017XÁÁ:'\u001d\u001d'¹Ù8ááë\u0013øø+³\"3\u0011\u0011Ò»ii©pÙÙ\u00073§-¶<\"\u001e\u001e\u0015É ééIÎÎªÿUUPx((¥zßß\u0003Yø¡¡\t\u001a\u0017\r\reÚ¿¿×1ææÆBBÐ¸hhÃAA)°Zw--\u001e\u0011\u000f\u000f{Ë°°¨üTTmÖ»»,:\u0016\u0016".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asIntBuffer().get(iArr, 0, 1024);
        f5840T = iArr;
        int[] iArr2 = new int[1024];
        ByteBuffer.wrap("P§ôQSeA~Ã¤\u0017\u001a^':Ëk«;ñE\u001f«Xú¬\u0003ãKUú0 ömv­vÌ%L\u0002õü×åO×Ë*ÅD5&£bµIZ±Þg\u001bº%\u000eêEáÀþ]\u0002u/Ã\u0012ðL£FÆùÓkç_\u0003\u0015ëzm¿ÚYR-¾ÔÓ!tX)iàIDÈÉjÂuxyôk>XÝq¹'¶Oá¾\u0017­ðf¬ É´:Î}\u0018Jßc1\u001aå`3QESbàwd±®k»\u001c þ+\bùXhHp\u0019ýElÞ·ø{R#Ós«â\u0002KrW\u001fã*«Uf\u0007(ë²\u0003Âµ/{Å¥\b7Óò(0²¥¿#ºj\u0003\u0002\\\u0016í+\u001cÏ´y§ðò\u0007ó¡âiNÍôÚeÕ¾\u0005\u0006\u001fb4Ñþ¦ÄS.4 Uó¢2á\u0005uëö¤9ì\u000bªï`@\u0006q^Q\u0010n½ù!>=\u0006Ý®\u0005>ÝF½æMµT\u0005]ÄqoÔ\u0006\u0004ÿ\u0015P`$û\u0019é½ÖÌC@wÙg½Bè°\u00078[\u0019çÛîÈyG\n|¡é\u000fB|É\u001eø\u0000\u0000\u0000\u0000\tHí+2¬p\u0011\u001eNrZlûÿ\u000eýV8\u000f\u001eÕ®='9-6dÙ\u000f\n!¦\\hÑT[:.6$±g\n\f\u000fçWÒî´\u001bOÅÀ¢ ÜaiKwZ\u0016\u001a\u0012\u001c\nºâå* ÀCà\"<\u001d\u0017\u001b\u0012\u000b\r\t\u000e­Çò¹¨¶-È©\u001e\u0014\u0019ñWL\u0007u¯»Ýîý`£&\u0001÷¼õr\\Å;fD4~û[v)CÜÆ#Ëhüí¶cñä¸ÊÜ1×\u0010cB@\"\u0013 \u0011Æ}$Jø=»Ò\u00112ù®m¡)ÇK/\u001dó0²ÜìR\rÐãÁwl\u0016³+¹p©úH\u0011\"déGÄü¨\u001a?ð Ø,}Vï3\"ÇNIÁÑ8Ùþ¢Ê6\u000bÔÏõ¦(Þz¥&·Ú¤¿­?ä:,\rxPÌ_jbF~TÂ\u0013öè¸Ø^÷9.õ¯Ã¾]|Ði©-Õo³\u0012%Ï;¬È§}\u0018\u0010ncè{»;Û\tx&Íô\u0018Yn\u0001·ì¨Oenæ~æÿª\bÏ¼!æè\u0015ïÙçºÎ6oJÔ\têÖ|°)¯²¤11#?*0¥ÆÀf¢57¼Nt¦Êü°Ðà\u0015Ø§3J\u0004ñ÷ÚìA\u000ePÍ/ö\u0017ÖMvM°ïCTMªÌß\u0004äãµÑ\u001bjL¸\u001f,ÁQeF\u0004ê^]5\u0001stú.A\u000bûZ\u001dg³RÒÛ3V\u0010é\u0013GÖma×z\f¡7\u0014øY<\u0013ëî'©Î5Éa·íå\u001cá<±GzYßÒ?sòUyÎ\u0014\u0018¿7ÇsêÍ÷S[ªý_\u0014o=ßÛDxó¯Ê>Äh¹,4$8_@£ÂrÃ\u001d\u0016\f%â¼I<(A\rÿq\u0001¨9Þ³\f\bä´ØÁVdaË{p¶2Õt\\lHBW¸Ð§ôQPeA~S¤\u0017\u001aÃ^':k«;ËE\u001fñXú¬«\u0003ãKú0 Umv­övÌL\u0002õ%×åOüË*Å×D5&£bµZ±ÞI\u001bº%g\u000eêEÀþ]áu/Ã\u0002ðL\u0012F£ùÓkÆ_\u0003ç\u0015zm¿ëYRÚ¾Ô-!tXÓiàI)ÈÉDÂujyôx>Xkq¹'ÝOá¾¶­ð\u0017¬ Éf:Î}´Jßc\u00181\u001aå3Q`SbEwd±à®k» þ\u001c+\bùhHpXýE\u0019lÞø{R·Ós«#\u0002Krâ\u001fãW«Uf*(ë²\u0007Âµ/\u0003{Å\b7Ó¥(0ò¥¿#²j\u0003\u0002º\u0016í\\\u001cÏ+´y§ò\u0007óðâiN¡ôÚeÍ¾\u0005\u0006Õb4Ñ\u001fþ¦ÄS.4Uó¢ á\u00052ëö¤uì\u000b9ï`@ªq^\u0006\u0010n½Q!>ù\u0006Ý=\u0005>Ý®½æMFTµ]Äq\u0005Ô\u0006\u0004o\u0015P`ÿû\u0019$é½ÖC@ÌÙgwBè°½\u0007[\u0019ç8îÈyÛ\n|¡G\u000fB|é\u001eøÉ\u0000\u0000\u0000\u0000\tí+2Hp\u0011\u001e¬rZlNÿ\u000eýû8\u000fVÕ®=\u001e9-6'Ù\u000f\nd¦\\h!T[Ñ.6$:g\n\f±çW\u000fî´Ò\u001bÅÀO Üa¢KwZi\u001a\u0012\u001c\u0016ºâ\n* Àåà\"<C\u0017\u001b\u0012\u001d\r\t\u000e\u000bÇò­¨¶-¹©\u001e\u0014È\u0019ñW\u0007u¯LÝî»`£ý&\u0001÷õr\\¼;fDÅ~û[4)CvÆ#ËÜüí¶hñä¸cÜ1×ÊcB\u0010\"\u0013@\u0011Æ $J}=»Òø2ù®\u0011¡)Çm/\u001dK0²ÜóR\rìãÁwÐ\u0016³+l¹p©H\u0011údéG\"ü¨Ä?ð \u001a,}VØ3\"ïNIÇÑ8ÙÁ¢Êþ\u000bÔ6õ¦ÏÞz¥(·Ú&¿­?¤:,äxP\rÌ_jF~Tb\u0013öÂ¸Øè÷9.^¯Ãõ]¾Ði|-Õo©\u0012%Ï³¬È;}\u0018\u0010§cèn»;Û{x&Í\t\u0018Ynô·ì\u0001O¨næeæÿª~Ï¼!\bè\u0015ïæçºÙ6oJÎ\têÔ|°)Ö²¤1¯#?*1¥Æ0f¢5À¼Nt7Êü¦Ðà°Ø§3\u0015\u0004ñJÚìA÷PÍ\u000eö\u0017/ÖMv°ïCMMªÌT\u0004äßµÑãjL\u001b\u001f,Á¸QeFê^\u00045\u0001]túsA\u000bû.\u001dg³ZÒÛRV\u0010é3GÖm\u0013a×\f¡7z\u0014øY<\u0013ë'©ÎîÉa·5å\u001cáí±Gz<ßÒYsòU?Î\u0014\u0018y7Çs¿Í÷Sêªý_[o=ß\u0014ÛDxó¯ÊÄh¹>4$8,@£Â_Ã\u001d\u0016r%â¼\fI<(\rÿA\u0001¨9q³\f\bÞä´ØÁVdË{a¶2Õp\\lHtW¸ÐBôQP§A~Se\u0017\u001aÃ¤':^«;Ëk\u001fñEú¬«XãK\u00030 Uúv­ömÌv\u0002õ%LåOü×*Å×Ë5&Dbµ£±ÞIZº%g\u001bêE\u000eþ]áÀ/Ã\u0002uL\u0012ðF£ÓkÆù\u0003ç_\u0015m¿ëzRÚY¾Ô-tXÓ!àI)iÉDÈÂujôxyXk>¹'Ýqá¾¶Oð\u0017­ Éf¬Î}´:ßc\u0018J\u001aå1Q`3SbEd±àwk»®þ\u001c \bù+HpXhE\u0019ýÞl{R·øs«#ÓKrâ\u0002\u001fãWUf*«ë²\u0007(µ/\u0003ÂÅ{7Ó¥\b(0ò¿#²¥\u0003\u0002ºj\u0016í\\Ï+\u001cy§´\u0007óðòiN¡âÚeÍô\u0005\u0006Õ¾4Ñ\u001fb¦Äþ.4Só¢ U\u00052áö¤uë\u000b9ì`@ªïq^\u0006n½Q\u0010!>ùÝ=\u0006>Ý®\u0005æMF½TµÄq\u0005]\u0006\u0004oÔP`ÿ\u0015\u0019$û½Öé@ÌCÙgwè°½B\u0007\u0019ç8[ÈyÛî|¡G\nB|é\u000føÉ\u001e\u0000\u0000\u0000\u0000\t+2Hí\u0011\u001e¬pZlNr\u000eýûÿ\u000fV8®=\u001eÕ-6'9\u000f\ndÙ\\h!¦[ÑT6$:.\n\f±gW\u000fçî´Ò\u001bÀOÅÜa¢ wZiK\u0012\u001c\u0016\u001aâ\nº Àå*\"<Cà\u001b\u0012\u001d\u0017\t\u000e\u000b\rò­Ç¶-¹¨\u001e\u0014È©ñW\u0019u¯L\u0007î»Ý£ý`\u0001÷&r\\¼õfDÅ;û[4~Cv)#ËÜÆí¶hüä¸cñ1×ÊÜcB\u0010\u0013@\"Æ \u0011J}$»Òø=ù®\u00112)Çm¡\u001dK/²Üó0\rìRÁwÐã³+l\u0016p©¹\u0011úHéG\"dü¨Äð \u001a?}VØ,3\"ïIÇN8ÙÁÑÊþ¢Ô6\u000bõ¦Ïz¥(Þ·Ú&­?¤¿:,äxP\r_jÌ~TbFöÂ\u0013Øè¸9.^÷Ãõ¯]¾Ði|Õo©-%Ï³\u0012¬È;\u0018\u0010§}ènc;Û{»&Í\txYnô\u0018ì\u0001·O¨æenÿª~æ¼!\bÏ\u0015ïæèçºÙoJÎ6êÔ\t°)Ö|¤1¯²?*1#¥Æ0¢5ÀfNt7¼ü¦Êà°Ð§3\u0015Ø\u0004ñJìA÷ÚÍ\u000eP\u0017/öMvÖïCM°ªÌTMäß\u0004ÑãµjL\u001b,Á¸\u001feFQ^\u0004ê\u0001]5úst\u000bû.Ag³Z\u001dÛRÒ\u0010é3VÖm\u0013G×a¡7z\føY\u0014\u0013ë<©Îî'a·5É\u001cáíåGz<±ÒYßòU?s\u0014\u0018yÎÇs¿7÷SêÍý_[ª=ß\u0014oDxÛ¯Êóh¹>Ä$8,4£Â_@\u001d\u0016rÃâ¼\f%<(I\rÿA¨9q\u0001\f\bÞ³´ØäVdÁË{a2Õp¶lHt\\¸ÐBWQP§ô~SeA\u001aÃ¤\u0017:^';Ëk«\u001fñE¬«XúK\u0003ã Uú0­ömvvÌõ%L\u0002Oü×åÅ×Ë*&D5µ£bÞIZ±%g\u001bºE\u000eê]áÀþÃ\u0002u/\u0012ðL£FkÆùÓ\u0003ç_\u0015¿ëzmÚYRÔ-¾XÓ!tI)iàDÈÉujÂôxyk>X'Ýq¹¾¶Oáð\u0017­Éf¬ }´:Îc\u0018Jßå1\u001a`3QbES±àwd»®kþ\u001c ù+\bpXhH\u0019ýElÞR·ø{«#Ósrâ\u0002KãW\u001ff*«U²\u0007(ë/\u0003Âµ{ÅÓ¥\b70ò(#²¥¿\u0002ºj\u0003í\\\u0016+\u001cÏ§´yóðò\u0007N¡âieÍôÚ\u0006Õ¾\u0005Ñ\u001fb4Äþ¦4S.¢ Uó\u00052á¤uëö\u000b9ì@ªï`^\u0006q½Q\u0010n>ù!=\u0006ÝÝ®\u0005>MF½æµTq\u0005]Ä\u0004oÔ\u0006`ÿ\u0015P\u0019$ûÖé½ÌC@gwÙ°½Bè\u0007ç8[\u0019yÛîÈ¡G\n||é\u000fBøÉ\u001e\u0000\u0000\u0000\u0000\t2Hí+\u001e¬p\u0011lNrZýûÿ\u000e\u000fV8=\u001eÕ®6'9-\ndÙ\u000fh!¦\\ÑT[$:.6\f±g\n\u000fçW´Òî\u001bOÅÀa¢ ÜZiKw\u001c\u0016\u001a\u0012â\nºÀå* <Cà\"\u0012\u001d\u0017\u001b\u000e\u000b\r\tò­Ç-¹¨¶\u0014È©\u001eW\u0019ñ¯L\u0007uî»Ý£ý`÷&\u0001\\¼õrDÅ;f[4~ûv)CËÜÆ#¶hüí¸cñä×ÊÜ1B\u0010c\u0013@\" \u0011Æ}$JÒø=»®\u00112ùÇm¡)\u001dK/Üó0²\rìRwÐãÁ+l\u0016³©¹p\u0011úHG\"dé¨Äü \u001a?ðVØ,}\"ï3ÇNIÙÁÑ8þ¢Ê6\u000bÔ¦Ïõ¥(ÞzÚ&·?¤¿­,ä:P\rxjÌ_TbF~öÂ\u0013è¸Ø.^÷9õ¯Ã¾]i|Ðo©-ÕÏ³\u0012%È;¬\u0010§}\u0018èncÛ{»;Í\tx&nô\u0018Yì\u0001·¨Oæenª~æÿ!\bÏ¼ïæè\u0015ºÙçJÎ6oêÔ\t)Ö|°1¯²¤*1#?Æ0¥5Àf¢t7¼Nü¦Êà°Ð3\u0015Ø§ñJ\u0004A÷Úì\u000ePÍ\u0017/övÖMCM°ïÌTMªäß\u0004ãµÑL\u001bjÁ¸\u001f,FQe\u0004ê^\u0001]5ústû.A\u000b³Z\u001dgRÒÛé3V\u0010m\u0013GÖa×7z\f¡Y\u0014øë<\u0013Îî'©·5Éaáíå\u001cz<±GYßÒU?sò\u0018yÎ\u0014s¿7ÇSêÍ÷_[ªýß\u0014o=xÛDÊó¯¹>Äh8,4$Â_@£\u0016rÃ\u001d¼\f%â(I<ÿA\r9q\u0001¨\bÞ³\fØä´dÁV{aËÕp¶2Ht\\lÐBW¸".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asIntBuffer().get(iArr2, 0, 1024);
        Tinv = iArr2;
    }

    private static int FFmulX(int i) {
        return ((i & f5842m2) << 1) ^ (((f5841m1 & i) >>> 7) * 27);
    }

    private static int FFmulX2(int i) {
        int i2 = f5844m4 & i;
        int i3 = i2 ^ (i2 >>> 1);
        return (((i & f5845m5) << 2) ^ (i3 >>> 2)) ^ (i3 >>> 5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void decryptBlock(int[][] r26) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f5846C0
            int r2 = r0.ROUNDS
            r3 = r26[r2]
            r4 = 0
            r3 = r3[r4]
            r1 = r1 ^ r3
            int r3 = r0.f5847C1
            r5 = r26[r2]
            r6 = 1
            r5 = r5[r6]
            r3 = r3 ^ r5
            int r5 = r0.f5848C2
            r7 = r26[r2]
            r8 = 2
            r7 = r7[r8]
            r5 = r5 ^ r7
            int r7 = r2 + -1
            int r9 = r0.f5849C3
            r2 = r26[r2]
            r10 = 3
            r2 = r2[r10]
            r2 = r2 ^ r9
        L_0x0026:
            if (r7 <= r6) goto L_0x015d
            int[] r9 = Tinv
            r11 = r1 & 255(0xff, float:3.57E-43)
            r11 = r9[r11]
            int r12 = r2 >>> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 + 256
            r12 = r9[r12]
            r11 = r11 ^ r12
            int r12 = r5 >>> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 + 512
            r12 = r9[r12]
            r11 = r11 ^ r12
            int r12 = r3 >>> 24
            int r12 = r12 + 768
            r12 = r9[r12]
            r11 = r11 ^ r12
            r12 = r26[r7]
            r12 = r12[r4]
            r11 = r11 ^ r12
            r12 = r3 & 255(0xff, float:3.57E-43)
            r12 = r9[r12]
            int r13 = r1 >>> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 + 256
            r13 = r9[r13]
            r12 = r12 ^ r13
            int r13 = r2 >>> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 + 512
            r13 = r9[r13]
            r12 = r12 ^ r13
            int r13 = r5 >>> 24
            int r13 = r13 + 768
            r13 = r9[r13]
            r12 = r12 ^ r13
            r13 = r26[r7]
            r13 = r13[r6]
            r12 = r12 ^ r13
            r13 = r5 & 255(0xff, float:3.57E-43)
            r13 = r9[r13]
            int r14 = r3 >>> 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 + 256
            r14 = r9[r14]
            r13 = r13 ^ r14
            int r14 = r1 >>> 16
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 + 512
            r14 = r9[r14]
            r13 = r13 ^ r14
            int r14 = r2 >>> 24
            int r14 = r14 + 768
            r14 = r9[r14]
            r13 = r13 ^ r14
            r14 = r26[r7]
            r14 = r14[r8]
            r13 = r13 ^ r14
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r9[r2]
            int r5 = r5 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 256
            r5 = r9[r5]
            int r3 = r3 >>> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 512
            r3 = r9[r3]
            int r1 = r1 >>> 24
            int r1 = r1 + 768
            r1 = r9[r1]
            int r14 = r7 + -1
            r2 = r2 ^ r5
            r2 = r2 ^ r3
            r1 = r1 ^ r2
            r2 = r26[r7]
            r2 = r2[r10]
            r1 = r1 ^ r2
            r2 = r11 & 255(0xff, float:3.57E-43)
            r2 = r9[r2]
            int r3 = r1 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 256
            r3 = r9[r3]
            int r5 = r13 >>> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 512
            r5 = r9[r5]
            int r7 = r12 >>> 24
            int r7 = r7 + 768
            r7 = r9[r7]
            r15 = r26[r14]
            r15 = r15[r4]
            r4 = r12 & 255(0xff, float:3.57E-43)
            r4 = r9[r4]
            int r10 = r11 >>> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 + 256
            r10 = r9[r10]
            int r8 = r1 >>> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 + 512
            r8 = r9[r8]
            int r6 = r13 >>> 24
            int r6 = r6 + 768
            r6 = r9[r6]
            r19 = r26[r14]
            r18 = 1
            r19 = r19[r18]
            r0 = r13 & 255(0xff, float:3.57E-43)
            r0 = r9[r0]
            r20 = r0
            int r0 = r12 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + 256
            r0 = r9[r0]
            r21 = r0
            int r0 = r11 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + 512
            r0 = r9[r0]
            r22 = r0
            int r0 = r1 >>> 24
            int r0 = r0 + 768
            r0 = r9[r0]
            r23 = r26[r14]
            r17 = 2
            r23 = r23[r17]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r9[r1]
            int r13 = r13 >>> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 + 256
            r13 = r9[r13]
            int r12 = r12 >>> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 + 512
            r12 = r9[r12]
            int r11 = r11 >>> 24
            int r11 = r11 + 768
            r9 = r9[r11]
            r11 = r26[r14]
            r16 = 3
            r11 = r11[r16]
            r1 = r1 ^ r13
            r1 = r1 ^ r12
            r1 = r1 ^ r9
            r1 = r1 ^ r11
            r2 = r2 ^ r3
            r2 = r2 ^ r5
            r2 = r2 ^ r7
            r2 = r2 ^ r15
            r3 = r10 ^ r4
            r3 = r3 ^ r8
            r3 = r3 ^ r6
            r3 = r3 ^ r19
            r4 = r21 ^ r20
            r4 = r4 ^ r22
            r0 = r0 ^ r4
            r5 = r0 ^ r23
            r0 = 1
            int r7 = r14 + -1
            r6 = r0
            r4 = 0
            r8 = 2
            r10 = 3
            r0 = r25
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x0026
        L_0x015d:
            int[] r0 = Tinv
            r4 = r1 & 255(0xff, float:3.57E-43)
            r4 = r0[r4]
            int r6 = r2 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 + 256
            r6 = r0[r6]
            r4 = r4 ^ r6
            int r6 = r5 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 + 512
            r6 = r0[r6]
            r4 = r4 ^ r6
            int r6 = r3 >>> 24
            int r6 = r6 + 768
            r6 = r0[r6]
            r4 = r4 ^ r6
            r6 = 1
            r7 = r26[r6]
            r6 = 0
            r7 = r7[r6]
            r4 = r4 ^ r7
            r6 = r3 & 255(0xff, float:3.57E-43)
            r6 = r0[r6]
            int r7 = r1 >>> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 256
            r7 = r0[r7]
            r6 = r6 ^ r7
            int r7 = r2 >>> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 512
            r7 = r0[r7]
            r6 = r6 ^ r7
            int r7 = r5 >>> 24
            int r7 = r7 + 768
            r7 = r0[r7]
            r6 = r6 ^ r7
            r7 = 1
            r8 = r26[r7]
            r8 = r8[r7]
            r6 = r6 ^ r8
            r7 = r5 & 255(0xff, float:3.57E-43)
            r7 = r0[r7]
            int r8 = r3 >>> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 + 256
            r8 = r0[r8]
            r7 = r7 ^ r8
            int r8 = r1 >>> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 + 512
            r8 = r0[r8]
            r7 = r7 ^ r8
            int r8 = r2 >>> 24
            int r8 = r8 + 768
            r8 = r0[r8]
            r7 = r7 ^ r8
            r8 = 1
            r9 = r26[r8]
            r8 = 2
            r9 = r9[r8]
            r7 = r7 ^ r9
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r0[r2]
            int r5 = r5 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 256
            r5 = r0[r5]
            int r3 = r3 >>> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 512
            r3 = r0[r3]
            int r1 = r1 >>> 24
            int r1 = r1 + 768
            r0 = r0[r1]
            r1 = r2 ^ r5
            r1 = r1 ^ r3
            r0 = r0 ^ r1
            r1 = 1
            r2 = r26[r1]
            r1 = 3
            r2 = r2[r1]
            r0 = r0 ^ r2
            byte[] r1 = f5839Si
            r2 = r4 & 255(0xff, float:3.57E-43)
            byte r2 = r1[r2]
            int r3 = r0 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r3
            int r3 = r7 >>> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 ^ r3
            int r3 = r6 >>> 24
            byte r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            r2 = r2 ^ r3
            r3 = 0
            r5 = r26[r3]
            r5 = r5[r3]
            r2 = r2 ^ r5
            r3 = r25
            r3.f5846C0 = r2
            r2 = r6 & 255(0xff, float:3.57E-43)
            byte r2 = r1[r2]
            int r5 = r4 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r5
            int r5 = r0 >>> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r2 = r2 ^ r5
            int r5 = r7 >>> 24
            byte r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 24
            r2 = r2 ^ r5
            r5 = 0
            r8 = r26[r5]
            r5 = 1
            r5 = r8[r5]
            r2 = r2 ^ r5
            r3.f5847C1 = r2
            r2 = r7 & 255(0xff, float:3.57E-43)
            byte r2 = r1[r2]
            int r5 = r6 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r5
            int r5 = r4 >>> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r2 = r2 ^ r5
            int r5 = r0 >>> 24
            byte r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 24
            r2 = r2 ^ r5
            r5 = 0
            r8 = r26[r5]
            r5 = 2
            r5 = r8[r5]
            r2 = r2 ^ r5
            r3.f5848C2 = r2
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r7 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r0 = r0 ^ r2
            int r2 = r6 >>> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r0 = r0 ^ r2
            int r2 = r4 >>> 24
            byte r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            r0 = r0 ^ r1
            r1 = 0
            r1 = r26[r1]
            r2 = 3
            r1 = r1[r2]
            r0 = r0 ^ r1
            r3.f5849C3 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.AESFastEngine.decryptBlock(int[][]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void encryptBlock(int[][] r25) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.f5846C0
            r2 = 0
            r3 = r25[r2]
            r3 = r3[r2]
            r1 = r1 ^ r3
            int r3 = r0.f5847C1
            r4 = r25[r2]
            r5 = 1
            r4 = r4[r5]
            r3 = r3 ^ r4
            int r4 = r0.f5848C2
            r6 = r25[r2]
            r7 = 2
            r6 = r6[r7]
            r4 = r4 ^ r6
            int r6 = r0.f5849C3
            r8 = r25[r2]
            r9 = 3
            r8 = r8[r9]
            r6 = r6 ^ r8
            r8 = r5
        L_0x0023:
            int r10 = r0.ROUNDS
            int r10 = r10 - r5
            if (r8 >= r10) goto L_0x015a
            int[] r10 = f5840T
            r11 = r1 & 255(0xff, float:3.57E-43)
            r11 = r10[r11]
            int r12 = r3 >>> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 + 256
            r12 = r10[r12]
            r11 = r11 ^ r12
            int r12 = r4 >>> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 + 512
            r12 = r10[r12]
            r11 = r11 ^ r12
            int r12 = r6 >>> 24
            int r12 = r12 + 768
            r12 = r10[r12]
            r11 = r11 ^ r12
            r12 = r25[r8]
            r12 = r12[r2]
            r11 = r11 ^ r12
            r12 = r3 & 255(0xff, float:3.57E-43)
            r12 = r10[r12]
            int r13 = r4 >>> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 + 256
            r13 = r10[r13]
            r12 = r12 ^ r13
            int r13 = r6 >>> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 + 512
            r13 = r10[r13]
            r12 = r12 ^ r13
            int r13 = r1 >>> 24
            int r13 = r13 + 768
            r13 = r10[r13]
            r12 = r12 ^ r13
            r13 = r25[r8]
            r13 = r13[r5]
            r12 = r12 ^ r13
            r13 = r4 & 255(0xff, float:3.57E-43)
            r13 = r10[r13]
            int r14 = r6 >>> 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 + 256
            r14 = r10[r14]
            r13 = r13 ^ r14
            int r14 = r1 >>> 16
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 + 512
            r14 = r10[r14]
            r13 = r13 ^ r14
            int r14 = r3 >>> 24
            int r14 = r14 + 768
            r14 = r10[r14]
            r13 = r13 ^ r14
            r14 = r25[r8]
            r14 = r14[r7]
            r13 = r13 ^ r14
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r10[r6]
            int r1 = r1 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 256
            r1 = r10[r1]
            int r3 = r3 >>> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 512
            r3 = r10[r3]
            int r4 = r4 >>> 24
            int r4 = r4 + 768
            r4 = r10[r4]
            int r14 = r8 + 1
            r1 = r1 ^ r6
            r1 = r1 ^ r3
            r1 = r1 ^ r4
            r3 = r25[r8]
            r3 = r3[r9]
            r1 = r1 ^ r3
            r3 = r11 & 255(0xff, float:3.57E-43)
            r3 = r10[r3]
            int r4 = r12 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 256
            r4 = r10[r4]
            int r6 = r13 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 + 512
            r6 = r10[r6]
            int r8 = r1 >>> 24
            int r8 = r8 + 768
            r8 = r10[r8]
            r15 = r25[r14]
            r15 = r15[r2]
            r2 = r12 & 255(0xff, float:3.57E-43)
            r2 = r10[r2]
            int r9 = r13 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 + 256
            r9 = r10[r9]
            int r7 = r1 >>> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 512
            r7 = r10[r7]
            int r5 = r11 >>> 24
            int r5 = r5 + 768
            r5 = r10[r5]
            r19 = r25[r14]
            r18 = 1
            r19 = r19[r18]
            r0 = r13 & 255(0xff, float:3.57E-43)
            r0 = r10[r0]
            r20 = r0
            int r0 = r1 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + 256
            r0 = r10[r0]
            r21 = r0
            int r0 = r11 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 + 512
            r0 = r10[r0]
            r22 = r0
            int r0 = r12 >>> 24
            int r0 = r0 + 768
            r0 = r10[r0]
            r23 = r25[r14]
            r17 = 2
            r23 = r23[r17]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r10[r1]
            int r11 = r11 >>> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 + 256
            r11 = r10[r11]
            int r12 = r12 >>> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 + 512
            r12 = r10[r12]
            int r13 = r13 >>> 24
            int r13 = r13 + 768
            r10 = r10[r13]
            r13 = r25[r14]
            r16 = 3
            r13 = r13[r16]
            r2 = r2 ^ r9
            r2 = r2 ^ r7
            r2 = r2 ^ r5
            r2 = r2 ^ r19
            r1 = r1 ^ r11
            r1 = r1 ^ r12
            r1 = r1 ^ r10
            r1 = r1 ^ r13
            r3 = r3 ^ r4
            r3 = r3 ^ r6
            r3 = r3 ^ r8
            r3 = r3 ^ r15
            r4 = r21 ^ r20
            r4 = r4 ^ r22
            r0 = r0 ^ r4
            r4 = r0 ^ r23
            r0 = 1
            int r8 = r14 + 1
            r5 = r0
            r6 = r1
            r1 = r3
            r7 = 2
            r9 = 3
            r0 = r24
            r3 = r2
            r2 = 0
            goto L_0x0023
        L_0x015a:
            int[] r0 = f5840T
            r2 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r2]
            int r5 = r3 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 256
            r5 = r0[r5]
            r2 = r2 ^ r5
            int r5 = r4 >>> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 512
            r5 = r0[r5]
            r2 = r2 ^ r5
            int r5 = r6 >>> 24
            int r5 = r5 + 768
            r5 = r0[r5]
            r2 = r2 ^ r5
            r5 = r25[r8]
            r7 = 0
            r5 = r5[r7]
            r2 = r2 ^ r5
            r5 = r3 & 255(0xff, float:3.57E-43)
            r5 = r0[r5]
            int r7 = r4 >>> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 256
            r7 = r0[r7]
            r5 = r5 ^ r7
            int r7 = r6 >>> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 512
            r7 = r0[r7]
            r5 = r5 ^ r7
            int r7 = r1 >>> 24
            int r7 = r7 + 768
            r7 = r0[r7]
            r5 = r5 ^ r7
            r7 = r25[r8]
            r9 = 1
            r7 = r7[r9]
            r5 = r5 ^ r7
            r7 = r4 & 255(0xff, float:3.57E-43)
            r7 = r0[r7]
            int r9 = r6 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 + 256
            r9 = r0[r9]
            r7 = r7 ^ r9
            int r9 = r1 >>> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 + 512
            r9 = r0[r9]
            r7 = r7 ^ r9
            int r9 = r3 >>> 24
            int r9 = r9 + 768
            r9 = r0[r9]
            r7 = r7 ^ r9
            r9 = r25[r8]
            r10 = 2
            r9 = r9[r10]
            r7 = r7 ^ r9
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r0[r6]
            int r1 = r1 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 256
            r1 = r0[r1]
            int r3 = r3 >>> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 512
            r3 = r0[r3]
            int r4 = r4 >>> 24
            int r4 = r4 + 768
            r0 = r0[r4]
            int r4 = r8 + 1
            r1 = r1 ^ r6
            r1 = r1 ^ r3
            r0 = r0 ^ r1
            r1 = r25[r8]
            r3 = 3
            r1 = r1[r3]
            r0 = r0 ^ r1
            byte[] r1 = f5838S
            r3 = r2 & 255(0xff, float:3.57E-43)
            byte r3 = r1[r3]
            int r6 = r5 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = r1[r6]
            int r8 = r7 >>> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = r1[r8]
            int r9 = r0 >>> 24
            byte r9 = r1[r9]
            r10 = r25[r4]
            r11 = 0
            r10 = r10[r11]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 ^ r6
            r6 = r8 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r3 = r3 ^ r6
            r6 = r9 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 24
            r3 = r3 ^ r6
            r3 = r3 ^ r10
            r6 = r24
            r6.f5846C0 = r3
            r3 = r5 & 255(0xff, float:3.57E-43)
            byte r3 = r1[r3]
            int r8 = r7 >>> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 ^ r8
            int r8 = r0 >>> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r3 = r3 ^ r8
            int r8 = r2 >>> 24
            byte r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 24
            r3 = r3 ^ r8
            r8 = r25[r4]
            r9 = 1
            r8 = r8[r9]
            r3 = r3 ^ r8
            r6.f5847C1 = r3
            r3 = r7 & 255(0xff, float:3.57E-43)
            byte r3 = r1[r3]
            int r8 = r0 >>> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 ^ r8
            int r8 = r2 >>> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r3 = r3 ^ r8
            int r8 = r5 >>> 24
            byte r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 24
            r3 = r3 ^ r8
            r8 = r25[r4]
            r9 = 2
            r8 = r8[r9]
            r3 = r3 ^ r8
            r6.f5848C2 = r3
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r0 = r0 ^ r2
            int r2 = r5 >>> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r0 = r0 ^ r2
            int r2 = r7 >>> 24
            byte r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            r0 = r0 ^ r1
            r1 = r25[r4]
            r2 = 3
            r1 = r1[r2]
            r0 = r0 ^ r1
            r6.f5849C3 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.AESFastEngine.encryptBlock(int[][]):void");
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
        Pack.intToLittleEndian(this.f5846C0, bArr, i);
        Pack.intToLittleEndian(this.f5847C1, bArr, i + 4);
        Pack.intToLittleEndian(this.f5848C2, bArr, i + 8);
        Pack.intToLittleEndian(this.f5849C3, bArr, i + 12);
    }

    private static int shift(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    private static int subWord(int i) {
        byte[] bArr = f5838S;
        return ((bArr[i >>> 24] & 255) << Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >>> 8) & 255] & 255) << 8) | ((bArr[(i >>> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i) {
        this.f5846C0 = Pack.littleEndianToInt(bArr, i);
        this.f5847C1 = Pack.littleEndianToInt(bArr, i + 4);
        this.f5848C2 = Pack.littleEndianToInt(bArr, i + 8);
        this.f5849C3 = Pack.littleEndianToInt(bArr, i + 12);
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
            unpackBlock(bArr, i);
            if (this.forEncryption) {
                encryptBlock(this.WorkingKey);
            } else {
                decryptBlock(this.WorkingKey);
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

package p040o;

import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.math.Primes;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.setZ */
public final class setZ {
    private static final int[][] MediaBrowserCompat$ItemReceiver;

    static {
        int[] iArr = new int[512];
        ByteBuffer.wrap("\u0000\u0000\u0001`\u0000\u0000\u0000M\u0000\u0000\u0001u\u0000\u0000\u0001ø\u0000\u0000\u0000#\u0000\u0000\u0002W\u0000\u0000\u0001¬\u0000\u0000\u0000Ï\u0000\u0000\u0001\u0000\u0000\u0002>\u0000\u0000\u0000v\u0000\u0000\u0001ò\u0000\u0000\u0001\u001d\u0000\u0000\u0001|\u0000\u0000\u0001^\u0000\u0000\u0001ì\u0000\u0000\u0000Å\u0000\u0000\u0001\t\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0000\u0001+\u0000\u0000\u0000å\u0000\u0000\u0002\u0000\u0000\u0001&\u0000\u0000\u0003g\u0000\u0000\u00012\u0000\u0000\u0000X\u0000\u0000\u0000W\u0000\u0000\u0000Á\u0000\u0000\u0001`\u0000\u0000\u0003\r\u0000\u0000\u0003N\u0000\u0000\u0000K\u0000\u0000\u0001G\u0000\u0000\u0002\b\u0000\u0000\u0001³\u0000\u0000\u0002\u001f\u0000\u0000\u0000Ë\u0000\u0000\u0002\u0000\u0000\u0000ù\u0000\u0000\u0001Z\u0000\u0000\u0003\r\u0000\u0000\u0002m\u0000\u0000\u0002\u0000\u0000\u0001\f\u0000\u0000\u0003\u001a\u0000\u0000\u0002\u0016\u0000\u0000\u0002\u001b\u0000\u0000\u0003\r\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0000\u0000f\u0000\u0000\u0001Ü\u0000\u0000\u0001ó\u0000\u0000\u0001\"\u0000\u0000\u0002x\u0000\u0000\u0002!\u0000\u0000\u0000%\u0000\u0000\u0003Z\u0000\u0000\u0003\u0000\u0000\u0002(\u0000\u0000\u0000)\u0000\u0000\u0002\u001e\u0000\u0000\u0001!\u0000\u0000\u0000z\u0000\u0000\u0001\u0010\u0000\u0000\u0001\u0000\u0000\u0003 \u0000\u0000\u0001å\u0000\u0000\u0000b\u0000\u0000\u0002ð\u0000\u0000\u0001Ø\u0000\u0000\u0002ù\u0000\u0000\u0000k\u0000\u0000\u0003\u0010\u0000\u0000\u0003\\\u0000\u0000\u0002\u0000\u0000\u0002å\u0000\u0000\u0001\"\u0000\u0000\u0000Ì\u0000\u0000\u0002©\u0000\u0000\u0001\u0000\u0000\u0003W\u0000\u0000\u0000U\u0000\u0000\u0000c\u0000\u0000\u0000>\u0000\u0000\u0001â\u0000\u0000\u0000´\u0000\u0000\u0000\u0014\u0000\u0000\u0001)\u0000\u0000\u0001Ã\u0000\u0000\u0002Q\u0000\u0000\u0003\u0000\u0000\u0000\u0000\u0000\u0003(\u0000\u0000\u0002¬\u0000\u0000\u0001\u001f\u0000\u0000\u0002\u0018\u0000\u0000\u00021\u0000\u0000\u0000L\u0000\u0000\u0002\u0000\u0000\u0003\u0000\u0000\u0002Ù\u0000\u0000\u00027\u0000\u0000\u0002è\u0000\u0000\u0001\u0000\u0000\u0002\u0001\u0000\u0000\u0000À\u0000\u0000\u0002\u0004\u0000\u0000\u0001\u0002\u0000\u0000\u0000ð\u0000\u0000\u0002\u0006\u0000\u0000\u0003\u001a\u0000\u0000\u0001\u0000\u0000\u0003\u0000\u0000\u0000\u0003P\u0000\u0000\u00003\u0000\u0000\u0002b\u0000\u0000\u0001\u0000\u0000\u0000¨\u0000\u0000\u0000¾\u0000\u0000\u0003:\u0000\u0000\u0001H\u0000\u0000\u0002T\u0000\u0000\u0003\u0012\u0000\u0000\u0001/\u0000\u0000\u0002:\u0000\u0000\u0001}\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0000í\u0000\u0000\u0000\u0000\u0000\u0001­\u0000\u0000\u0002\u0013\u0000\u0000\u0000Ï\u0000\u0000\u0002¤\u0000\u0000\u0002Æ\u0000\u0000\u0000Y\u0000\u0000\u0000¨\u0000\u0000\u00010\u0000\u0000\u0001\u0000\u0000\u0000(\u0000\u0000\u0002Ä\u0000\u0000\u0002?\u0000\u0000\u0000¢\u0000\u0000\u0003`\u0000\u0000\u0000å\u0000\u0000\u0000A\u0000\u0000\u0003]\u0000\u0000\u0003I\u0000\u0000\u0002\u0000\u0000\u0000\u0000¤\u0000\u0000\u0001Ý\u0000\u0000\u0000Ý\u0000\u0000\u0000\\\u0000\u0000\u0001f\u0000\u0000\u0003\u0011\u0000\u0000\u0001 \u0000\u0000\u0001e\u0000\u0000\u0003R\u0000\u0000\u0003D\u0000\u0000\u0003;\u0000\u0000\u0002à\u0000\u0000\u0002Ã\u0000\u0000\u0000^\u0000\u0000\u0000\b\u0000\u0000\u0001î\u0000\u0000\u0000r\u0000\u0000\u0002\t\u0000\u0000\u0000\u0002\u0000\u0000\u0001ó\u0000\u0000\u0003S\u0000\u0000\u0002\u001f\u0000\u0000\u0000\u0000\u0000\u0002Ù\u0000\u0000\u0003\u0003\u0000\u0000\u0000_\u0000\u0000\u0000ø\u0000\u0000\u0001i\u0000\u0000\u0002B\u0000\u0000\u0001C\u0000\u0000\u0003X\u0000\u0000\u0003\u001d\u0000\u0000\u0001!\u0000\u0000\u00003\u0000\u0000\u0002¬\u0000\u0000\u0001Ò\u0000\u0000\u0002\u0015\u0000\u0000\u00034\u0000\u0000\u0002\u0000\u0000\u0000-\u0000\u0000\u0003\u0000\u0000\u0001Ä\u0000\u0000\u0000§\u0000\u0000\u0001V\u0000\u0000\u0000ô\u0000\u0000\u0000­\u0000\u0000\u0000#\u0000\u0000\u0001Ï\u0000\u0000\u0002\u0000\u0000\u00003\u0000\u0000\u0002»\u0000\u0000\u0002O\u0000\u0000\u0001Ä\u0000\u0000\u0002B\u0000\u0000\u0000%\u0000\u0000\u0000|\u0000\u0000\u0001*\u0000\u0000\u0001L\u0000\u0000\u0002(\u0000\u0000\u0000+\u0000\u0000\u0001«\u0000\u0000\u0000w\u0000\u0000\u0002\u0000\u0000\u0003\t\u0000\u0000\u0001Û\u0000\u0000\u0003R\u0000\u0000\u0002ü\u0000\u0000\u0001l\u0000\u0000\u0002B\u0000\u0000\u0003\u0000\u0000\u0001\u001b\u0000\u0000\u0002Ç\u0000\u0000\u0001Ø\u0000\u0000\u0001¤\u0000\u0000\u0000õ\u0000\u0000\u0001 \u0000\u0000\u0002R\u0000\u0000\u0001\u0000\u0000\u0001ÿ\u0000\u0000\u0001G\u0000\u0000\u0002M\u0000\u0000\u0003\t\u0000\u0000\u0002»\u0000\u0000\u0002°\u0000\u0000\u0000+\u0000\u0000\u0001\u0000\u0000\u0003J\u0000\u0000\u0001\u0000\u0000\u0002Ñ\u0000\u0000\u0002\t\u0000\u0000\u00020\u0000\u0000\u0002\u0000\u0000\u0002Ê\u0000\u0000\u0002/\u0000\u0000\u0000>\u0000\u0000\u0000\u0000\u0000\u0003i\u0000\u0000\u0002\u0000\u0000\u0002É\u0000\u0000\u0000\u0000\u0000\u0002 \u0000\u0000\u0002Ù\u0000\u0000\u0002p\u0000\u0000\u0000;\u0000\u0000\u0000Á\u0000\u0000\u0001¡\u0000\u0000\u0000\u0000\u0000\u0000Ñ\u0000\u0000\u00023\u0000\u0000\u00024\u0000\u0000\u0001W\u0000\u0000\u0002µ\u0000\u0000\u0000m\u0000\u0000\u0002`\u0000\u0000\u00023\u0000\u0000\u0001m\u0000\u0000\u0000µ\u0000\u0000\u0003\u0004\u0000\u0000\u0002¥\u0000\u0000\u00016\u0000\u0000\u0000ø\u0000\u0000\u0001a\u0000\u0000\u0002Ä\u0000\u0000\u0001\u0000\u0000\u0002C\u0000\u0000\u0003f\u0000\u0000\u0002i\u0000\u0000\u0003I\u0000\u0000\u0002x\u0000\u0000\u0003\\\u0000\u0000\u0001!\u0000\u0000\u0002\u0018\u0000\u0000\u0000#\u0000\u0000\u0003\t\u0000\u0000\u0002j\u0000\u0000\u0002J\u0000\u0000\u0001¨\u0000\u0000\u0003A\u0000\u0000\u0000M\u0000\u0000\u0002U\u0000\u0000\u0001Z\u0000\u0000\u0001\r\u0000\u0000\u0002õ\u0000\u0000\u0002x\u0000\u0000\u0002·\u0000\u0000\u0002ï\u0000\u0000\u0001K\u0000\u0000\u0000÷\u0000\u0000\u0000¸\u0000\u0000\u0000-\u0000\u0000\u0003\u0013\u0000\u0000\u0002¨\u0000\u0000\u0000\u0012\u0000\u0000\u0000B\u0000\u0000\u0001\u0000\u0000\u0001q\u0000\u0000\u00006\u0000\u0000\u0001ì\u0000\u0000\u0000ä\u0000\u0000\u0002e\u0000\u0000\u0003>\u0000\u0000\u0003\u0000\u0000\u0001µ\u0000\u0000\u0002\u0007\u0000\u0000\u0002\u0000\u0000\u0003\u0000\u0000\u0003\u0015\u0000\u0000\u0001¤\u0000\u0000\u00011\u0000\u0000\u0001¹\u0000\u0000\u0000Ï\u0000\u0000\u0001,\u0000\u0000\u0003|\u0000\u0000\u0003;\u0000\u0000\u0000\u0000\u0000\u0002\u0019\u0000\u0000\u0001}\u0000\u0000\u0002\u0000\u0000\u0002\u0001\u0000\u0000\u00008\u0000\u0000\u0000ü\u0000\u0000\u0001U\u0000\u0000\u0000ò\u0000\u0000\u0003\u001d\u0000\u0000\u0003F\u0000\u0000\u0003E\u0000\u0000\u0002Ð\u0000\u0000\u0000à\u0000\u0000\u00013\u0000\u0000\u0002w\u0000\u0000\u0000=\u0000\u0000\u0000W\u0000\u0000\u00020\u0000\u0000\u00016\u0000\u0000\u0002ô\u0000\u0000\u0002\u0000\u0000\u0001\u0000\u0000\u0003(\u0000\u0000\u0003S\u0000\u0000\u00015\u0000\u0000\u0001Ù\u0000\u0000\u0003\u001b\u0000\u0000\u0001z\u0000\u0000\u0000\u001f\u0000\u0000\u0002\u0000\u0000\u0003\u0000\u0000\u0001Ë\u0000\u0000\u0003&\u0000\u0000\u0002N\u0000\u0000\u0002Û\u0000\u0000\u0001©\u0000\u0000\u0000Ø\u0000\u0000\u0002$\u0000\u0000\u0000ù\u0000\u0000\u0001A\u0000\u0000\u0003q\u0000\u0000\u0002»\u0000\u0000\u0002\u0017\u0000\u0000\u0002¡\u0000\u0000\u0003\u000e\u0000\u0000\u0000Ò\u0000\u0000\u0003/\u0000\u0000\u0003\u0000\u0000\u0001/\u0000\u0000\u0003K\u0000\u0000\u0003\u0000\u0000\u0001\u0019\u0000\u0000\u0000I\u0000\u0000\u0001Õ\u0000\u0000\u0003\u0017\u0000\u0000\u0002\u0000\u0000\u0000¢\u0000\u0000\u0001ò\u0000\u0000\u00014\u0000\u0000\u0000\u0000\u0000\u0001¦\u0000\u0000\u0003\u0000\u0000\u00031\u0000\u0000\u0000»\u0000\u0000\u0000>\u0000\u0000\u0000\u0010\u0000\u0000\u0001©\u0000\u0000\u0002\u0017\u0000\u0000\u0001P\u0000\u0000\u0001\u001e\u0000\u0000\u0001µ\u0000\u0000\u0001w\u0000\u0000\u0001\u0011\u0000\u0000\u0002b\u0000\u0000\u0001(\u0000\u0000\u0000·\u0000\u0000\u0003\u0000\u0000\u0000t\u0000\u0000\u0002\u0000\u0000\u0002ï\u0000\u0000\u0001a\u0000\u0000\u0000>\u0000\u0000\u0001n\u0000\u0000\u0002³\u0000\u0000\u0001{\u0000\u0000\u0002¯\u0000\u0000\u0003J\u0000\u0000\u0000%\u0000\u0000\u0001e\u0000\u0000\u0002Ð\u0000\u0000\u0002æ\u0000\u0000\u0001J\u0000\u0000\u0000\u0005\u0000\u0000\u0000'\u0000\u0000\u0003\u0000\u0000\u00017\u0000\u0000\u0001¨\u0000\u0000\u0000ò\u0000\u0000\u0002í\u0000\u0000\u0001A\u0000\u0000\u00006\u0000\u0000\u0002\u0000\u0000\u0001<\u0000\u0000\u0001V\u0000\u0000\u0001+\u0000\u0000\u0002\u0016\u0000\u0000\u0000i\u0000\u0000\u0002\u0000\u0000\u0001è\u0000\u0000\u0002\u0000\u0000\u0002 \u0000\u0000\u0002@\u0000\u0000\u0002\u001c\u0000\u0000\u0001<\u0000\u0000\u0001æ\u0000\u0000\u0002Ñ\u0000\u0000\u0002b\u0000\u0000\u0000.\u0000\u0000\u0002\u0000\u0000\u0001¿\u0000\u0000\u0000«\u0000\u0000\u0002h\u0000\u0000\u0001Ð\u0000\u0000\u0000¾\u0000\u0000\u0002\u0013\u0000\u0000\u0001)\u0000\u0000\u0001A\u0000\u0000\u0002ú\u0000\u0000\u0002ð\u0000\u0000\u0002\u0015\u0000\u0000\u0000¯\u0000\u0000\u0000\u0000\u0000\u0000\u000e\u0000\u0000\u0001}\u0000\u0000\u0001±\u0000\u0000\u0002Í\u0000\u0000\u0000-\u0000\u0000\u0000o\u0000\u0000\u0000\u0014\u0000\u0000\u0002T\u0000\u0000\u0001\u001c\u0000\u0000\u0002à\u0000\u0000\u0000\u0000\u0000\u0002\u0000\u0000\u0001\u0000\u0000\u0003m\u0000\u0000\u0002\u0000\u0000\u0000\u0000\u0000\u0003\u0000\u0000\u0000-\u0000\u0000\u0003\f\u0000\u0000\u0001\u0000\u0000\u0000¤\u0000\u0000\u0001L\u0000\u0000\u0003\u0000\u0000\u0000¥\u0000\u0000\u0002Ö\u0000\u0000\u0002X\u0000\u0000\u0001E\u0000\u0000\u0001ò\u0000\u0000\u0002\u0000\u0000\u0001e\u0000\u0000\u0002ð\u0000\u0000\u0003\u0000\u0000\u0000\u0000ß\u0000\u0000\u0003Q\u0000\u0000\u0002\u0000\u0000\u0000?\u0000\u0000\u00016\u0000\u0000\u0003_\u0000\u0000\u0000û\u0000\u0000\u0001n\u0000\u0000\u00010\u0000\u0000\u0001\u001a\u0000\u0000\u0002â\u0000\u0000\u0002£\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000ô\u0000\u0000\u0000\u001f\u0000\u0000\u0000y\u0000\u0000\u0001/\u0000\u0000\u0001\u0007".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asIntBuffer().get(iArr, 0, 512);
        MediaBrowserCompat$ItemReceiver = new int[][]{new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, CipherSuite.TLS_PSK_WITH_NULL_SHA256, 65}, new int[]{361, 575, 922, 525, CipherSuite.TLS_PSK_WITH_NULL_SHA256, 586, 640, 321, 536, 742, 677, 742, 687, 284, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 517, 273, 494, 263, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 430, 609, 858, 822, 543, 376, 511, TitleChanger.DEFAULT_ANIMATION_DELAY, 672, 762, 283, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, TitleChanger.DEFAULT_ANIMATION_DELAY, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 219, 129, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 236, 287, 192, 775, 278, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 40, 379, 712, 463, 646, 776, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 491, 297, 763, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, ISO781611.BIOMETRIC_SUBTYPE_TAG, 814, 587, 804, 34, Primes.SMALL_FACTOR_LIMIT, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, C0608h.f1446Ay, 858, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 311, 913, 275, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 375, 850, 438, 733, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, ISO781611.BIOMETRIC_SUBTYPE_TAG, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, CipherSuite.TLS_PSK_WITH_NULL_SHA384, 752, 607, 640, 455, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 910, 532, 609, 829, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 20, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 404, 251, 688, 95, 497, 555, 642, 543, 307, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, 924, 558, 648, 55, 497, 10}, iArr};
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i >= 0 && i <= 8) {
            return 1 << (i + 1);
        }
        throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
    }

    public static String IconCompatParcelizer(CharSequence charSequence, int i) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        int i2 = 1 << (i + 1);
        char[] cArr = new char[i2];
        int length = charSequence.length();
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i2 - 1;
            int charAt = (charSequence.charAt(i3) + cArr[i4]) % 929;
            while (i4 > 0) {
                cArr[i4] = (char) ((cArr[i4 - 1] + (929 - ((MediaBrowserCompat$ItemReceiver[i][i4] * charAt) % 929))) % 929);
                i4--;
            }
            cArr[0] = (char) ((929 - ((charAt * MediaBrowserCompat$ItemReceiver[i][0]) % 929)) % 929);
        }
        StringBuilder sb = new StringBuilder(i2);
        for (int i5 = i2 - 1; i5 >= 0; i5--) {
            if (cArr[i5] != 0) {
                cArr[i5] = (char) (929 - cArr[i5]);
            }
            sb.append(cArr[i5]);
        }
        return sb.toString();
    }
}
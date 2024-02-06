package p040o;

import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import net.p088sf.scuba.smartcards.ISO7816;
import org.bouncycastle.i18n.LocalizedMessage;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: o.QuickTopUpReviewActivity */
public final class QuickTopUpReviewActivity {
    private static final byte[] IconCompatParcelizer = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -1, -1, -1, -1, -1, -1, -1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f3248EM, Ascii.SUB, Ascii.ESC, -1, -1, -1, -1, -1, -1, 28, 29, 30, Ascii.f3259US, 32, 33, ISO7816.INS_MSE, 35, ISO7816.INS_CHANGE_CHV, 37, 38, 39, 40, 41, ISO7816.INS_PSO, 43, ISO7816.INS_UNBLOCK_CHV, 45, 46, 47, ISO7816.INS_DECREASE, 49, ISO7816.INS_INCREASE, 51, ISO7816.INS_DECREASE_STAMPED, 53, -1, -1, -1, -1, -1};
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver;
    private static final char[] MediaBrowserCompat$ItemReceiver = {'.', '/', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static final int[] read = {1332899944, 1700884034, 1701343084, 1684370003, 1668446532, 1869963892};
    private static final int[] write = {608135816, -2052912941, 320440878, 57701188, -1542899678, 698298832, 137296536, -330404727, 1160258022, 953160567, -1101764913, 887688300, -1062458953, -914599715, 1065670069, -1253635817, -1843997223, -1988494565};
    private int[] MediaDescriptionCompat;
    private int[] RatingCompat;

    static {
        int[] iArr = new int[1024];
        ByteBuffer.wrap("Ñ1\u000b¦ßµ¬/ýrÛÐ\u001aß·¸á¯íj&~º|Eñ,$¡G³l÷\b\u0001òâü\u0016ci ØqWNi¤Xþ£ô=~\rtr¶XqÍX\u0015Jî{T¤\u001dÂZYµ0Õ9*ò`\u0013ÅÑ°#(`ðÊAy\u0018¸Û8ïyÜ°`:\u0018\u000el\u000e°\u001e>×\u0015wÁ½1K'x¯/ÚU`\\`æU%óªU«WHbcè\u0014@UÊ9j*«\u0010¶´Ì\\4\u0011AèÎ¡T¯|ré³î\u0014\u0011co¼*+©Å]t\u00181öÎ\\>\u0016\u001e¯Öº3l$Ï\\z2S(w;HkK¹¯Ä¿è\u001bf(!aØ\tÌû!©H|¬`]ì2ï]]éu±Ü&#\u0002ëe\u001b#>Ó¬Å\u000fmoóôB9.\u000bD¤ \u0004iÈðJ\u001f^!ÆhBöélg\fa«ÓðjQ ÒØT/h\u000f§(«Q3£nï\u000bl\u0013z;äº;ðP~û*¡ñe\u001d9¯\u0001vfÊY>C\u000eî\u0019Eo´}¥Ã;^¾àouØÁ s@\u001aDVÁj¦NÓªb6?w\u0006\u001bþßrB\u0002=7Ð×$Ð\n\u0012HÛ\u000fêÓIñÀ\u0007SrÉ\u001b{%ÔyØöèÞ÷ãþP\u001a¶yL;là½\u0004À\u0006ºÁ©O¶@`Ä^\\Â\u0019j$chûo¯>lSµ\u00139²ë;RìomüQ\u001f0,ÌED¯^½\t¾ãÐ\u0004Þ3Jýf\u000f(\u0007\u0019.K³ÀË¨WEÈt\u000fÒ\u000b_9¹ÓûÛUyÀ½\u001a`2\nÖ¡\u0000Æ@,ryg%þû\u001f£Ì¥éøÛ2\"ø<u\u0016ßýak\u0015/P\u001eÈ­\u0005R«2=µúý#`S1{H>\u0000ß\\W»Êo \u001aV.ß\u0017iÛÕB¨ö(~ÿÃ¬g2ÆOUsi['°»ÊXÈáÿ£]¸ð\u0011 \u0010ú=ý!¸Jüµl-ÑÓ[Säy¶øEeÒI¼KûáÝòÚ¤Ë~3bû\u0013AÎäÆèï ÊÚ6wL\u0001Ð~þ+ñ\u001f´ÛÚM®ê­qkÕ ÐÑÐ¯Ç%à<[/u·öâûò\u0012+d¸\u0012\rð\u001cO­^ hÃ\u001cÑÏñ³¨Á­//\"\u0018¾\u000e\u0017wêu-þ\u0002\u001f¡å Ì\u000fµotè\u0018¬óÖÎâ´¨Oàý\u0013à·|Ä;Ò­¨Ù\u0016_¢fw\u0005Ìs\u0014!\u001a\u0014wæ­ ewµúÇTBõû5ÏëÍ¯\f{> ÖA\u001bÓ®\u001e~I\u0000%\u000e- q³^\"h\u0000»W¸à¯$d6ð\t¹\u001eUc\u001dYß¦ªxÁCÙZS }[¢\u0002å¹Å&\u0003vbÏ©\u0011È\u0019hNsJA³G-Ê{\u0014©J\u001bQ\u0000RS)\u0015Ö\u000fW?¼Æä+`¤væt\u0000\bºoµW\u001bé\u001fòìk*\rÙ\u0015¶ce!ç¹ù¶ÿ4\u0005.ÅVdS°-]©¡\bºGn\u0007jKzpéµ³)DÛu\t.Ä\u0019&#­n¦°I§ß}î`¸í²fìªqi\u0017ÿVdRlÂ±á\u00196\u0002¥u\tL) Y\u0013@ä\u0018:>?T[BekäÖ÷?Ö¡Ò\u0007ïè0õM-8æð%]ÁLÝ pë&céÆ\u0002\u001eÌ^\thk?>ºïÉ<\u0018\u0014kjp¡h5R â·S\u0005ªP\u00077>\u0007\u001cÞ®\\}DìW\u0016ò¸°:Ú7ðP\f\rð\u001c\u001f\u0004\u0002\u0000³ÿ®\fõ\u001a<µt²%zXÜ\t!½Ñ\u0013ù|©/ö2Gs\"õG\u0001:åå7ÂÚÜÈµv4óÝ§©DaF\u000fÐ\u0003\u000eìÈÇ>¤u\u001eAâ8Í;ê\u000e/2»¡\u0018>³1NT8Om¹\boB\r\u0003ö\n\u0004¿,¸\u0012$|yVy°r¼¯¯Þw\u001fÙ\b\u0010³®\u0012ÜÏ?.U\u0012r\u001f.kq$P\u001aÝæÍzXG\u0018t\bÚ\u0017¼¼éK}ìzì:Û\u001dúc\tCfÄdÃÒï\u001c\u0018G2\u0015Ù\bÝC;7$Âº\u0016\u0012¡MC*eÄQP\u0000\u0002\u0013:äÝqßø\u00101NU¬wÖ_\u0011\u0019\u00045Vñ×£Çk<\u0011\u0018;Y$¥\tòæíñûúº¿,\u001e\u0015<nãEpêéo±\u000e^\nZ>*³w\u001fç\u001cN=\u0006ú)eÜ¹ç\u001d\u000f>ÖRfÈ%.LÉx\u0010³jÆ\u0015\u000eºâêx¥ü<S\u001e\n-ôò÷N§6\u001d+=\u00199&\u000f\u0019Ây`R#§\b÷\u0013\u0012¶ë­þnêÃ\u001ffã¼E¦{È±7Ñ\u0001ÿ(Ã2Ýï¾lZ¥eX!h«\u0002îÎ¥\u000fÛ/;*ï}­[n/\u0015!¶()\u0007apìÝGua\u0015\u0010\u0013Ì¨0ëa½\u00034þ\u001eª\u0003cÏµs\\Lp¢9Õ\u000bËªÞ\u0014îÌ¼`b,§«\\«²ónd\u001e¯\u0019½ðÊ #i¹eZ»P@hZ2<*´³1éÕÀ!¸÷T\u000b\u0019_ ÷~b=}¨ø7ã-w\u0011í_\u0016h\u0012\u000e5)Çæ\u001fÖÞß¡xXºWõ¥\u001b\"rcÃÿ\u001aÂFÍ³\nëS.0TÙHäm¼1(Xëòï4Æÿêþ(íaî|<s]J\u0014Ùèd·ãB\u0010]\u0014 >\u0013àEîâ¶£ª«êÛlO\u0015úËOÐÇBôBïj»µeO;\u001dAÍ!\u0005Ø\u001eyMÇäKGj=bPÏb¡ò[&Fü ÁÇ¶£\u0015$ÃiËtG\u000bV²\t[¿\u0000­\u0019H\u0014b±t#\u000e\u0000XB*\fUõê\u001d­ô>#?pa3rð~AÖ_ìñl\";Û|Þ7YËît`@ò§Îw2n¦\u0007\u0019øPèïØUaÙ5©i§ªÅ\f\u0006ÂZ\u0004«ü\u000bÊÜDz.ÃE4ýÕg\u0005\u000e\u001eÉÛsÛÓ\u0010UÍg_ÚyãgC@ÅÄ4eq>8Ø=(øñmÿ \u0015>!ç°=Jæã+Û­÷é=Zh@÷öL&\u001ci)4A\u0015 ÷v\u0002Ô÷¼ôk.Ô¢\u0000hÔ\b$q3 ôjC·Ô·P\u0000a¯\u001e9ö.$EF\u0014!Ot¿@Mü\u001dµ¯pôÝÓf /E¿¼\tì\u0003½¬mÐ1Ë\u0004ë'³Uý9AÚ%Gæ«Ê\n(Px%S\u0004)ô\n,Úé¶mûhÜ\u0014b×Hi\u0000h\u000eÀ¤'¡îO?þ¢è­µà\u0006zôÖ¶ªÎ\u001e|Ó7_ìÎx£@k*B þ5Ùó¹î9×«;\u0012N\u001dÉú÷Km\u0018V&£f1êã²:nútÝ[C2hAç÷Êx ûû\nõNØþ³E@V¬ºH'US:: þk©·ÐKU¨g¼¡\u0015XÌ©)cáÛ3¦*JV?1%ù^ô~\u001c)1|ýøè\u0002\u0004'/p»\u0015\\\u0005(,ãÁ\u0015HäÆm\"HÁ\u0013?Ç\u000fÜ\u0007ùÉîA\u0004\u001f\u000f@Gy¤]n\u00172_QëÕÀÑò¼ÁA\u00115d%{x4`*`ßøè£\u001fcl\u001b\u000e\u0012´Â\u0002á2¯fOÑÊÑ\u0015k#à3>á;$\u000bbî¾¹\"²¢\u000eæº\rÞr\f-¢÷(Ð\u0012xE·ýd}\bbçÌõðTI£o}HúÃý'ó>\u001e\nGcA.ÿt:on«ôøý7¨\u0012Ü`¡ëÝø\u001báLÛnk\rÆ{U\u0010mg,7'eÔ;ÜÐè\u0004ñ)\rÇÌ\u0000ÿ£µ9\u000fi\u000fí\u000bf{ûÎÛ} Ï\u000bÙ\u0015^£»\u0013/Q[­${y¿v;Öë79.³Ì\u0011Yy&âô.1-hB­§Æj+;\u0012uLÌx.ñ\u001cj\u0012B7·Qç\u0006¡»æKûcP\u001ak\u0010\u0018\u0011Êíú=%½ØâáÃÉDB\u0016Y\n\u0012\u0013Ù\fìnÕ«ê*d¯gNÚ¨_¾¿édäÃþ¼Wð÷À`x{ø`\u0003`MÑýFö8\u001f°wE®\u0004×6üÌBk3ð\u001e«q°A<\u0000^_w W¾½è®$UFB¿X.aNXôòÝý¢ôtï8½ÂSfùÃÈ³t´uòUFüÙ¹zë&a\u001dßj\u000ey_âFnY ´WpÕUÉ\u0002ÞL¹\u000b¬á»\u0005Ð\u0011¨bHut©·\u0019¶à©Ü\tf-\t¡Ä2F3èZ\u001f\u0002\tð¾J %\u001dnþ\u0010\u001a¹=\u001d\u000b¥¤ß¡ò\u000f(hñiÜ·ÚW9\u0006þ¡âÎOÍRP\u0011^\u0001§\u0006ú \u0002µÄ\ræÐ'ø'w?AÃ`L\u0006a¨\u0006µð\u0017z(Àõà\u0000`Xª0Ü}b\u0011æ×#8êcSÂÝÂÂ\u00164»ËîV¼¶Þëü}¡ÎY\u001dvo\u0005ä\tK|\u00019r\n=||$ãr_rM¹\u001aÁ[´Ó¸üíTUx\bü¥µØ=|ÓM­\u000fÄ\u001ePï^±aæø¢\u0014ÙlQ\u0013<oÕÇçVáNÄ6*¿ÎÝÆÈ7×24c\u0012g\u000eú@`\u0000à:9Î7ÓúõÏ«Âw7ZÅ-\u001b\\°gO£7BÓ'@¼¾Õ\u0011¿\u000fs\u0015Ö-\u001c~Ç\u0000Ä{·\u001bk!¡E²n±¾j6n´WH«/¼nyÆ£vÒeIÂÈS\u000føîFÞ}Õs\n\u001dLÐMÆ)9»Û©ºFP¬&è¾^ã\u0004¡úÕðj-Qcïâî\"ÀÂ¸C$.ö¥\u001e\u0003ªòÐ¤ÀaºéjMå\u0015Pºd[Ö(&¢ù§::áK©ïUbéÇ/ïÓ÷R÷Ú?\u0004oiwú\nYä©\u0015°\u0001\tæ­;>åéýZ4×,ð·Ù\u0002+QÕ¬:\u0001}¦}ÑÏ>Ö|}-(\u001f%Ï­ò¸ZÖ´rZõLà)¬qà\u0019¥æG°¬ýíúèÓÄ(;WÌøÕf)y\u0013.(x_\u0001íu`U÷\u000eDãÓ^\u0015\u0005mÔômº\u0003¡a%\u0005dð½Ãë\u0015<W¢'\u001aì©:\u0007*\u001b?m\u001ec!õõfû&Üó\u0019u3Ù(±Uýõ\u0003V4º<»(Qw\u0011Â\nÙø«ÌQgÌ­_Mè\u0017Q80Ü7Xb ùêzÂû>{ÎQ!ÎdwO¾2¨¶ã~Ã)=FHÞSid\u0013æ¢®\b\u0010Ým²$i-ý\t\u0007!f³F\ndEÀÝXlÞÏ\u001c È®[¾÷Ý\u001bX@ÌÒ\u0001k´ã»Ý¢j~:YÿE>5\nD¼´ÍÕrêÎ¨úd»f\u0012®¿<oGÒäcT/]®Âw\u001böNcpt\u000e\rç[\u0013Wør\u0016q¯S}]@@Ë\bN´âÌ4ÒFj\u0001\u0015¯á°\u0004(:\u001d\u0006¸´În Ho?;5 «\u0001\u001a\u001dK'r'øa\u0015`±ç?Ü»:y+4E%½ 9áQÎyK/2É· \u001fºÉà\u001cÈ~¼ÇÑöÏ\u0001\u0011Ã¡èªÇ\u001aIÔO½ÐÚÞËÕ\nÚ8\u00039Ã*Æ6gù1|à±+O÷Y·Cõ»:òÕ\u0019ÿ'ÙE¿\",\u0015æü*\u000füq\u0015%úåaÎ¶ëÂ¨dY\u0012º¨Ñ¶Á\u0007^ã\u0005j\f\u0010ÒPeË\u0003¤Bàìn\u000e\u0016Û;L ¾2xéd\u001f2àÓßÓ 4+qò\u001e\u001b\ntAK£4Å¾q Ãv2Øß5/.æ\u000boG\u000fãñ\u001dåLÚT\u001eÚØÎbyÏÍ>~o\u0016\u0018±fý,\u001d\u0005ÒÅöû\"õ#óW¦2v#¨51VÌÍ\u0002¬ðbZuëµn\u00166ÒsÌÞb¹IÐLP\u001bqÆV\u0014æÆÇ½2z\u0014\nEáÐ\u0006Ãò{ÉªSýb¨\u000f\u0000»%¿â5½Òöq\u0012i\u0005²\u0004\u0002\"¶ËÏ|Ív+S\u0011>À\u0016@ãÓ8«½`%G­ðº8 ÷FÎvw¯¡Å u``ËþNèØzªù°Lùª~\u0019HÂ\\\u0002û\u0001ÃjäÖëáùÔøi¦\\Þ ?\t%-Â\bæ·Na2Îwâ[Wßã:Ãræ".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asIntBuffer().get(iArr, 0, 1024);
        MediaBrowserCompat$CustomActionResultReceiver = iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r0.append(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String IconCompatParcelizer(byte[] r6, int r7) throws java.lang.IllegalArgumentException {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            if (r7 <= 0) goto L_0x0072
            int r1 = r6.length
            if (r7 > r1) goto L_0x0072
            r1 = 0
        L_0x000b:
            if (r1 >= r7) goto L_0x006d
            int r2 = r1 + 1
            byte r1 = r6[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            char[] r3 = MediaBrowserCompat$ItemReceiver
            int r4 = r1 >> 2
            r4 = r4 & 63
            char r3 = r3[r4]
            r0.append(r3)
            r1 = r1 & 3
            int r1 = r1 << 4
            if (r2 < r7) goto L_0x002b
            char[] r6 = MediaBrowserCompat$ItemReceiver
            r7 = r1 & 63
            char r6 = r6[r7]
            goto L_0x004b
        L_0x002b:
            int r3 = r2 + 1
            byte r2 = r6[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            char[] r4 = MediaBrowserCompat$ItemReceiver
            int r5 = r2 >> 4
            r5 = r5 & 15
            r1 = r1 | r5
            r1 = r1 & 63
            char r1 = r4[r1]
            r0.append(r1)
            r1 = r2 & 15
            int r1 = r1 << 2
            if (r3 < r7) goto L_0x004f
            char[] r6 = MediaBrowserCompat$ItemReceiver
            r7 = r1 & 63
            char r6 = r6[r7]
        L_0x004b:
            r0.append(r6)
            goto L_0x006d
        L_0x004f:
            byte r2 = r6[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            char[] r4 = MediaBrowserCompat$ItemReceiver
            int r5 = r2 >> 6
            r5 = r5 & 3
            r1 = r1 | r5
            r1 = r1 & 63
            char r1 = r4[r1]
            r0.append(r1)
            char[] r1 = MediaBrowserCompat$ItemReceiver
            r2 = r2 & 63
            char r1 = r1[r2]
            r0.append(r1)
            int r1 = r3 + 1
            goto L_0x000b
        L_0x006d:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x0072:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Invalid len"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.QuickTopUpReviewActivity.IconCompatParcelizer(byte[], int):java.lang.String");
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(int[] iArr, int i) {
        int i2 = iArr[i];
        int i3 = i + 1;
        int i4 = iArr[i3];
        int i5 = 0;
        int i6 = this.RatingCompat[0];
        while (true) {
            i2 ^= i6;
            if (i5 <= 14) {
                int[] iArr2 = this.MediaDescriptionCompat;
                int i7 = iArr2[i2 >>> 24];
                int i8 = iArr2[((i2 >> 16) & 255) | 256];
                int i9 = iArr2[((i2 >> 8) & 255) | 512];
                int i10 = iArr2[(i2 & 255) | 768];
                int[] iArr3 = this.RatingCompat;
                int i11 = i5 + 1;
                i4 ^= (((i7 + i8) ^ i9) + i10) ^ iArr3[i11];
                int i12 = iArr2[i4 >>> 24];
                int i13 = iArr2[((i4 >> 16) & 255) | 256];
                int i14 = iArr2[((i4 >> 8) & 255) | 512];
                i5 = i11 + 1;
                i6 = iArr3[i5] ^ (((i12 + i13) ^ i14) + iArr2[(i4 & 255) | 768]);
            } else {
                iArr[i] = i4 ^ this.RatingCompat[17];
                iArr[i3] = i2;
                return;
            }
        }
    }

    public static String read(int i, SecureRandom secureRandom) {
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArr = new byte[16];
        secureRandom.nextBytes(bArr);
        stringBuffer.append("$2a$");
        if (i < 10) {
            stringBuffer.append("0");
        }
        if (i <= 30) {
            stringBuffer.append(Integer.toString(i));
            stringBuffer.append("$");
            stringBuffer.append(IconCompatParcelizer(bArr, 16));
            return stringBuffer.toString();
        }
        throw new IllegalArgumentException("log_rounds exceeds maximum (30)");
    }

    public static String read(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        char c = 0;
        if (str2.charAt(0) == '$' && str2.charAt(1) == '2') {
            int i = 3;
            if (str2.charAt(2) != '$') {
                c = str2.charAt(2);
                if (c == 'a' && str2.charAt(3) == '$') {
                    i = 4;
                } else {
                    throw new IllegalArgumentException("Invalid salt revision");
                }
            }
            int i2 = i + 2;
            if (str2.charAt(i2) <= '$') {
                int parseInt = Integer.parseInt(str2.substring(i, i2));
                String substring = str2.substring(i + 3, i + 25);
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(c >= 'a' ? "\u0000" : "");
                    byte[] bytes = sb.toString().getBytes("UTF-8");
                    byte[] read2 = read(substring);
                    byte[] IconCompatParcelizer2 = new QuickTopUpReviewActivity().IconCompatParcelizer(bytes, read2, parseInt, (int[]) read.clone());
                    stringBuffer.append("$2");
                    if (c >= 'a') {
                        stringBuffer.append(c);
                    }
                    stringBuffer.append("$");
                    if (parseInt < 10) {
                        stringBuffer.append("0");
                    }
                    if (parseInt <= 30) {
                        stringBuffer.append(Integer.toString(parseInt));
                        stringBuffer.append("$");
                        stringBuffer.append(IconCompatParcelizer(read2, read2.length));
                        stringBuffer.append(IconCompatParcelizer(IconCompatParcelizer2, (read.length << 2) - 1));
                        return stringBuffer.toString();
                    }
                    throw new IllegalArgumentException("rounds exceeds maximum (30)");
                } catch (UnsupportedEncodingException unused) {
                    throw new AssertionError("UTF-8 is not supported");
                }
            } else {
                throw new IllegalArgumentException("Missing salt rounds");
            }
        } else {
            throw new IllegalArgumentException("Invalid salt version");
        }
    }

    private static int write(byte[] bArr, int[] iArr) {
        int i = iArr[0];
        byte b = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            b = (b << 8) | (bArr[i] & 255);
            i = (i + 1) % bArr.length;
        }
        iArr[0] = i;
        return b;
    }

    private void write(byte[] bArr) {
        int[] iArr = {0};
        int[] iArr2 = {0, 0};
        int length = this.RatingCompat.length;
        int length2 = this.MediaDescriptionCompat.length;
        for (int i = 0; i < length; i++) {
            int[] iArr3 = this.RatingCompat;
            iArr3[i] = iArr3[i] ^ write(bArr, iArr);
        }
        for (int i2 = 0; i2 < length; i2 += 2) {
            MediaBrowserCompat$CustomActionResultReceiver(iArr2, 0);
            int[] iArr4 = this.RatingCompat;
            iArr4[i2] = iArr2[0];
            iArr4[i2 + 1] = iArr2[1];
        }
        for (int i3 = 0; i3 < length2; i3 += 2) {
            MediaBrowserCompat$CustomActionResultReceiver(iArr2, 0);
            int[] iArr5 = this.MediaDescriptionCompat;
            iArr5[i3] = iArr2[0];
            iArr5[i3 + 1] = iArr2[1];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098 A[EDGE_INSN: B:46:0x0098->B:38:0x0098 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] read(java.lang.String r11) throws java.lang.IllegalArgumentException {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r11.length()
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x000c:
            int r5 = r1 + -1
            if (r4 >= r5) goto L_0x0098
            r5 = 16
            if (r3 >= r5) goto L_0x0098
            int r6 = r4 + 1
            char r4 = r11.charAt(r4)
            r7 = -1
            if (r4 < 0) goto L_0x0025
            byte[] r8 = IconCompatParcelizer
            int r9 = r8.length
            if (r4 > r9) goto L_0x0025
            byte r4 = r8[r4]
            goto L_0x0026
        L_0x0025:
            r4 = r7
        L_0x0026:
            int r8 = r6 + 1
            char r6 = r11.charAt(r6)
            if (r6 < 0) goto L_0x0036
            byte[] r9 = IconCompatParcelizer
            int r10 = r9.length
            if (r6 > r10) goto L_0x0036
            byte r6 = r9[r6]
            goto L_0x0037
        L_0x0036:
            r6 = r7
        L_0x0037:
            if (r4 == r7) goto L_0x0098
            if (r6 != r7) goto L_0x003c
            goto L_0x0098
        L_0x003c:
            int r4 = r4 << 2
            byte r4 = (byte) r4
            r9 = r6 & 48
            int r9 = r9 >> 4
            r4 = r4 | r9
            byte r4 = (byte) r4
            char r4 = (char) r4
            r0.append(r4)
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x0098
            if (r8 < r1) goto L_0x0050
            goto L_0x0098
        L_0x0050:
            int r4 = r8 + 1
            char r8 = r11.charAt(r8)
            if (r8 < 0) goto L_0x0060
            byte[] r9 = IconCompatParcelizer
            int r10 = r9.length
            if (r8 > r10) goto L_0x0060
            byte r8 = r9[r8]
            goto L_0x0061
        L_0x0060:
            r8 = r7
        L_0x0061:
            if (r8 != r7) goto L_0x0064
            goto L_0x0098
        L_0x0064:
            r6 = r6 & 15
            int r6 = r6 << 4
            byte r6 = (byte) r6
            r9 = r8 & 60
            int r9 = r9 >> 2
            r6 = r6 | r9
            byte r6 = (byte) r6
            char r6 = (char) r6
            r0.append(r6)
            int r3 = r3 + 1
            if (r3 >= r5) goto L_0x0098
            if (r4 < r1) goto L_0x007a
            goto L_0x0098
        L_0x007a:
            char r5 = r11.charAt(r4)
            if (r5 < 0) goto L_0x0087
            byte[] r6 = IconCompatParcelizer
            int r9 = r6.length
            if (r5 > r9) goto L_0x0087
            byte r7 = r6[r5]
        L_0x0087:
            r5 = r8 & 3
            int r5 = r5 << 6
            byte r5 = (byte) r5
            r5 = r5 | r7
            byte r5 = (byte) r5
            char r5 = (char) r5
            r0.append(r5)
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0098:
            byte[] r11 = new byte[r3]
        L_0x009a:
            if (r2 >= r3) goto L_0x00a6
            char r1 = r0.charAt(r2)
            byte r1 = (byte) r1
            r11[r2] = r1
            int r2 = r2 + 1
            goto L_0x009a
        L_0x00a6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.QuickTopUpReviewActivity.read(java.lang.String):byte[]");
    }

    private byte[] IconCompatParcelizer(byte[] bArr, byte[] bArr2, int i, int[] iArr) {
        byte[] bArr3 = bArr2;
        int i2 = i;
        int[] iArr2 = iArr;
        int length = iArr2.length;
        if (i2 < 4 || i2 > 30) {
            throw new IllegalArgumentException("Bad number of rounds");
        } else if (bArr3.length == 16) {
            this.RatingCompat = (int[]) write.clone();
            int[] iArr3 = (int[]) MediaBrowserCompat$CustomActionResultReceiver.clone();
            this.MediaDescriptionCompat = iArr3;
            int[] iArr4 = {0};
            int[] iArr5 = {0};
            int[] iArr6 = {0, 0};
            int length2 = this.RatingCompat.length;
            int length3 = iArr3.length;
            for (int i3 = 0; i3 < length2; i3++) {
                int[] iArr7 = this.RatingCompat;
                iArr7[i3] = iArr7[i3] ^ write(bArr, iArr4);
            }
            byte[] bArr4 = bArr;
            for (int i4 = 0; i4 < length2; i4 += 2) {
                iArr6[0] = iArr6[0] ^ write(bArr3, iArr5);
                iArr6[1] = iArr6[1] ^ write(bArr3, iArr5);
                MediaBrowserCompat$CustomActionResultReceiver(iArr6, 0);
                int[] iArr8 = this.RatingCompat;
                iArr8[i4] = iArr6[0];
                iArr8[i4 + 1] = iArr6[1];
            }
            for (int i5 = 0; i5 < length3; i5 += 2) {
                iArr6[0] = iArr6[0] ^ write(bArr3, iArr5);
                iArr6[1] = iArr6[1] ^ write(bArr3, iArr5);
                MediaBrowserCompat$CustomActionResultReceiver(iArr6, 0);
                int[] iArr9 = this.MediaDescriptionCompat;
                iArr9[i5] = iArr6[0];
                iArr9[i5 + 1] = iArr6[1];
            }
            for (int i6 = 0; i6 != (1 << i2); i6++) {
                write(bArr);
                write(bArr3);
            }
            for (int i7 = 0; i7 < 64; i7++) {
                for (int i8 = 0; i8 < (length >> 1); i8++) {
                    MediaBrowserCompat$CustomActionResultReceiver(iArr2, i8 << 1);
                }
            }
            byte[] bArr5 = new byte[(length << 2)];
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i9 + 1;
                bArr5[i9] = (byte) (iArr2[i10] >>> 24);
                int i12 = i11 + 1;
                bArr5[i11] = (byte) (iArr2[i10] >> 16);
                int i13 = i12 + 1;
                bArr5[i12] = (byte) (iArr2[i10] >> 8);
                i9 = i13 + 1;
                bArr5[i13] = (byte) iArr2[i10];
            }
            return bArr5;
        } else {
            throw new IllegalArgumentException("Bad salt length");
        }
    }
}

package org.bouncycastle.pqc.crypto.newhope;

import java.nio.ByteBuffer;
import org.bouncycastle.i18n.LocalizedMessage;

class Precomp {
    static final short[] OMEGAS_INV_MONTGOMERY;
    static final short[] OMEGAS_MONTGOMERY;
    static final short[] PSIS_BITREV_MONTGOMERY;
    static final short[] PSIS_INV_MONTGOMERY;

    static {
        short[] sArr = new short[512];
        ByteBuffer.wrap("\u000fë\u001b>\u001cÍ\u001f\u001d\f¾\u0013×\u0002\n\by\u0018Ü\u0003ú\u0004\u0011\"G\t(+\u0003\u0015Æ\u0007µ\u0011¸\u0004\u001a\u001a¼\u000f\u0014\u000eê\u0017æ\n{\u0004¦\u0012µ\u001e\u001dt\u001a`\u0015P\u0011a\u000eÍ/n.Å\u0001~\u000f\u0001Ô\u001a»\u0014Û\u00184\u000e~,4\u0004æ\u0015;*²\u000f(\u0010(\u000f'.q\u0006À\u0017ù\u0013T\u0016æ\u0017ø\u000e;\u001aÚ\"\u0014\u0002(>\u0006¦\u001b«\u001ah\u00008\f'\u0003\u0002].\t\u001f\u0015Ú$,\u0019\u0003\u0012®\u0018D\u0012\u0010#B!ñ\u000fð.\\\u0018M\u000e\u0012\u0003Ï\u001f\"$å\u00161\r\u0004Q\u0000\u0000ñ/Ç\u0003ë\rÌ\u0013\u0007¤\u0017x,\u001cÑ\b\u0001*Ø/A\u001d§\u0013Á\ru\u0012¬\u000bh\u001b\f7\u001f¸,\u000f\u001a¥,î\"g/j\bO\u000b\u0017\u000fu\u0001¯\u0006+\u0018ï&8\u0016ò\u0002¥\r\b\u0018Z\nÎ\u0005+#/Í\u0007ï\u001b,\u0019\r\bé\u000f\u000f/e%2\u0012*ô\u0012¦\u00155._\u000e¼\u0001Å\u0017\u0014\u000bB\u0007\r\b\u0003\u0007¢-Á\u000f{\t\u0017þ\u001fî\u000bÖ\u00073\t9/'\u000b\\\rÉ\rj\f\u001et\b\t\u0014ù.£\u0005è\u001aú(ê+\u0012\u00001*6\u0017\u001b\u0005Ñ&=\u00176)Ò(¿\u001do\u0001ª#\u000e\u000e­(J$\u0001[\u0016ì%O%¢\u0019)d$@-.\u0000®\u000b\tÇ\u0019k)ã-V\t\u0000@\u000eH!\u0007\u0014\u0017\u001f\u001e°\u0006Ó#Î\u0015n$\u0013\u0017±\u0003C\rò\u0010-<\u000fÎ*Ú#³\u0004\" \u0012.H\u0003\u001f\u001f\u0007¦'ã\u0004X\u000e\u000fÑ+z\u0017f\u0005|\u0001E\u0003´+\u0018.\u0001'-u\u0016 \u0014 Q\u000bg!O\u0017ç\u001bP \u0005P\tû\u0018\u0017\u0004°\u001bÁ\u001f7\r\u0001%}/Y\u0013ò\u0017I)Ç(W\u000bë&Ã\u0013 $n\u0000Q\f\u0013\u0003è\u001f!\u0012\u0003\u0002Ö\u0007=/u\u0010+h\nÐ)\u0004&\bö\rá\u0012Å\n»\u0012î!#Â\u0004\t\u000f\u0003\u0016,F$;#\u0005.\u0013Þ#\u0019\u001d+E)\r°\rÖ!Ü&\u0010\u0005Ç\u0000\u0001 6\u001bç-/*è\u0010&\u0016h\u0013r*º\u0016#\u0001\u0011ï\u0016`\u0019=\u0013%²\u001d,\u0003µ%À\u000b-Î\n¸$C'l\u0013Ë/\t¬\u000e¤,H\u0019z\u0003;$ì\u0014þ/\u001eÿ\fà\u000fm&¥\u0011d*\tÝ\u000e\u0000\u001f°\u001fK)x\u0013}\u001b..!$ç/ø\u0003þ.®&]-á\u0016\u0013ä\b)#-\u000bA\fÙ\u0007Ý#X\u0002Ù\u001eÝ\u0004ì\u0016{\u0012\u0018.³\tz)a\u0005\u0013\u001a\u0017\u0017\u000f\\%V\"~\u000e5\u0015¦\u0000\u0014;!\u000e{)\"\u0001c\r6\u0010&\r\u0004·#Q\u001bd\u0004'¢+Ø\u0012%.m*(\u0001³\u001f\u0010\u0010\u0000\u0001í&´\u001a½\u0017\tv\b%û!Ã&|$V\u0017\u001cn\u0003ê\u0010¼\u0013à\u0006G\u001c\u0003k!=$Ö\u0004\u0015\t±\u0013\u001d\u0004\u0001b\u0019¿$¡.G\ta\u0004+\u001c\u0014,ü\u0001!?!\b\u001cf\u0002!!%/\u000f\u0006\u0001\u0010/\u0012j\u0013\u0015\u0003ù\u0013Ü\u0006`\u000bú\u0000\u001b\u0005 !N$9/\u000e-b$I\rH&¢\f@\u001bº\"6.%\u001cØ\u000f.]\u001aJ)ù'\bÉ\u000fÐ\u000bD+\bN\u0006^#\u0015\u001f\n~#R\u000b w$Ð&¿\"K\u0014Ô)\u0006ñ\u0012.*o\u001c·\u000e4%q\u0014« ¶\bv\u00137/#´/a\u001e¬/þ\u0013\u001f*5\nÜ\u0014K\t\u0001\u001cO%¬\u000fÕ)h\r$\fÇ\u000fÙ\u0011>$â\u001eí\b~".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asShortBuffer().get(sArr, 0, 512);
        OMEGAS_MONTGOMERY = sArr;
        short[] sArr2 = new short[512];
        ByteBuffer.wrap("\u000fë\u0014Ã\u0010ä\u00134'-÷\u001c*#C(L\u001a;\u0004þ&Ù\rº+ð,\u0007\u0017%\u0000!4\u001e \u001a±\u0015¡\u0012\u0011s\u001dL+[%\u0018\u001b!\u0017 í\u0015E+ç\u001eI#/É\u0015\u0014V)[\u0007Ã-s\rí\u0015'!Æ\u0018\t\u0019\u001b\u001c­\u0018\b)A\u0001 Ú\u0007\u0007ñ c\u0005O\u001aÆ+\u001b\u0003Í!\u0017Í\u001b&\u0015F.- m.\u0001<\u00004\ff*Ö%3\u0017§\"ù-\\\u0019\u000f\tÉ\u0017\u0012)Ö.R $ê'²\u0000\r\u0003\u0013\u0015\\\u0003ò\u0010I#Ê\u0014y$\u001dU\"\u001c@\u0012Z\u0000À\u0005)(\u0000\u00130\u0003u\u0018(]\u001cp\"5,\u0016\u0000:/\u0010/s+°\"l\u0019Ð\u000b\u001c\rn\u0010t,2!ï\u0017´\u0001¥ \u0011\u000e\u0010\f¿\u001dñ\u0017½\u001dS\u0016þ\u000bÕ\u001a'\u0010u\u0001ø-¤\bþ\u0007ª\u0006:\u0018¸\u001c\u000f\u0000¨\n#\u0000\u0010Ê\u0014@+Q\u0017ê&\u0006*±\u000ft\u0014±\u0018\u001a\u000e²$\u000f°\u000fí\u0019{\u0002.Ú\u0017Ó\u0004z,M.¼*\u0018\u0004 0!q+©\b\u001e([\u0010â,g\u0001¹\u000fï+ß\fN\u0005' 3\u0002Å\u001fq\"\u000f,¾\u0018P\u000bî\u001a\f3).\u0011Q\u0018â\u001bx\u000eú!¹/Á&f\u0002«\u0006\u001e\u0016&:$}/S\u0002Ó\u000bÁ\u0006\u0016g\n_\n²\u0019\u0015.¦\u000bm\u0007·!T\fó.W\u0012\u0007B\u0006/\u0018Ë\tÄ*0\u0018æ\u0005Ë/Ð\u0004ï\u0007\u0017\u0015\u0007*\u0019\u0001^\u001b\b'ø\u0011#\"\"8$¥\u0000Ú&È(Î$+\u0010\u0013\u0018\u0003&r \u0002@(_'þ(ô$¿\u0018í.<!E\u0001¢\u001aÌ\u001d[\u0005\r\u001d\nÏ\u0000 j '\u0018\u0016ô\u0014Õ(\u0012'\u0011\u0014\u000b\u001f\u001eÃ (#:\"Ý\u0006 ,\nU\u0013²'\u0000\u001b¶%%\u0005Ì\u001câ\u0000\u0003\u0011U\u0000 \fM\u0000q\u001cÊ'\u000fK\u001bV\n!Í\u0013J\u0005\u001dÓ)\u0010\u0006\u001b-\r¶\tB\u000b1\u000f$h\f¯%\u001aâ\fr)£'³\u0004$½ 1'8\b\u0006\b\u0015·\u0001¤ p\u0013)\u0001Ü\rË\u0014G#Á\t_\"¹\u000b¸\u0002\u0000ó\u000bÈ\u000e³*a/æ$\u0007)¡\u001c%,\b\u001cì\u001d\u001fÒ*\u0000\u0000ò\nv\u000ex-à\u0013\u000eù\u000eÂ.{\u0003\u0005\u0013í+Ö& \u0001º\u000b`\u0016B.\u0012ý\u001cm&P+ì\u000b+\u000eÄ,\u0013p)º\u001c!\u001fE,\u0017\u0013\u0018{\u000b«\t\u000e>\n\u0006'v&\u0018j\u0015D\tM.\u0014 \u0001\u0010ñ.N\u0007x\u0005b\u0001\u001dÜ\u0004)\b_+q\u0014\f°+J\tô\u001fz\"Ë.\u0006ß!\u000en\u001bÆ/p\u001a[!Ì\r\n« ¥\u0018ê\u001cç*m\u0006 &\u0001N\u001dé\u0019+\u0015\u0011$-(\f©($#($À\fÔ'Ø\u001c\u001d\u0019b\u0002 \t¤\u0001S,\u0003\u0000\t\u000b\u001a\u0001à\u0014Ó\u001c\u0006\u0010¶\u0010Q\"\u0001&$\u0005e\u001e\t\\ #!\u0011\u0002\u0000\u001b\u0003\u000b\u0015,Æ\u0016\u0003¹!]&U\u0000v\u001c6\b\u000b¾%I\u00023$b\nA,L\u0012Õ\nO\u001cb\u0016Ä\u0019¡\u001e\u0012\r\u0000\u0019p\u0005G\u001c\u0019\u001fÛ\u0005\u0019\u0002Ò\u0014\u001a\u000fË0\u0000*:\tñ\u000e%\"+\"Q\u0006n\u0004¼\u0016ä\f{\u001c#*Ó\f\u000bÆ\u0003»,ë&ò+o\f?\u000e\u001d\u0013%F\u001d<\" '\u000b+Û\u0006c%1\u0004\u001fb\u0000(Ä-+\u001dþ\u0010à,\u0019#î/°\u000b\u001cá\t>$\u0016".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asShortBuffer().get(sArr2, 0, 512);
        OMEGAS_INV_MONTGOMERY = sArr2;
        short[] sArr3 = new short[1024];
        ByteBuffer.wrap("\u000fë\u001b>\u001cÍ\u001f\u001d\f¾\u0013×\u0002\n\by\u0018Ü\u0003ú\u0004\u0011\"G\t(+\u0003\u0015Æ\u0007µ\u0011¸\u0004\u001a\u001a¼\u000f\u0014\u000eê\u0017æ\n{\u0004¦\u0012µ\u001e\u001dt\u001a`\u0015P\u0011a\u000eÍ/n.Å\u0001~\u000f\u0001Ô\u001a»\u0014Û\u00184\u000e~,4\u0004æ\u0015;*²\u000f(\u0010(\u000f'.q\u0006À\u0017ù\u0013T\u0016æ\u0017ø\u000e;\u001aÚ\"\u0014\u0002(>\u0006¦\u001b«\u001ah\u00008\f'\u0003\u0002].\t\u001f\u0015Ú$,\u0019\u0003\u0012®\u0018D\u0012\u0010#B!ñ\u000fð.\\\u0018M\u000e\u0012\u0003Ï\u001f\"$å\u00161\r\u0004Q\u0000\u0000ñ/Ç\u0003ë\rÌ\u0013\u0007¤\u0017x,\u001cÑ\b\u0001*Ø/A\u001d§\u0013Á\ru\u0012¬\u000bh\u001b\f7\u001f¸,\u000f\u001a¥,î\"g/j\bO\u000b\u0017\u000fu\u0001¯\u0006+\u0018ï&8\u0016ò\u0002¥\r\b\u0018Z\nÎ\u0005+#/Í\u0007ï\u001b,\u0019\r\bé\u000f\u000f/e%2\u0012*ô\u0012¦\u00155._\u000e¼\u0001Å\u0017\u0014\u000bB\u0007\r\b\u0003\u0007¢-Á\u000f{\t\u0017þ\u001fî\u000bÖ\u00073\t9/'\u000b\\\rÉ\rj\f\u001et\b\t\u0014ù.£\u0005è\u001aú(ê+\u0012\u00001*6\u0017\u001b\u0005Ñ&=\u00176)Ò(¿\u001do\u0001ª#\u000e\u000e­(J$\u0001[\u0016ì%O%¢\u0019)d$@-.\u0000®\u000b\tÇ\u0019k)ã-V\t\u0000@\u000eH!\u0007\u0014\u0017\u001f\u001e°\u0006Ó#Î\u0015n$\u0013\u0017±\u0003C\rò\u0010-<\u000fÎ*Ú#³\u0004\" \u0012.H\u0003\u001f\u001f\u0007¦'ã\u0004X\u000e\u000fÑ+z\u0017f\u0005|\u0001E\u0003´+\u0018.\u0001'-u\u0016 \u0014 Q\u000bg!O\u0017ç\u001bP \u0005P\tû\u0018\u0017\u0004°\u001bÁ\u001f7\r\u0001%}/Y\u0013ò\u0017I)Ç(W\u000bë&Ã\u0013 $n\u0000Q\f\u0013\u0003è\u001f!\u0012\u0003\u0002Ö\u0007=/u\u0010+h\nÐ)\u0004&\bö\rá\u0012Å\n»\u0012î!#Â\u0004\t\u000f\u0003\u0016,F$;#\u0005.\u0013Þ#\u0019\u001d+E)\r°\rÖ!Ü&\u0010\u0005Ç\u0000\u0001 6\u001bç-/*è\u0010&\u0016h\u0013r*º\u0016#\u0001\u0011ï\u0016`\u0019=\u0013%²\u001d,\u0003µ%À\u000b-Î\n¸$C'l\u0013Ë/\t¬\u000e¤,H\u0019z\u0003;$ì\u0014þ/\u001eÿ\fà\u000fm&¥\u0011d*\tÝ\u000e\u0000\u001f°\u001fK)x\u0013}\u001b..!$ç/ø\u0003þ.®&]-á\u0016\u0013ä\b)#-\u000bA\fÙ\u0007Ý#X\u0002Ù\u001eÝ\u0004ì\u0016{\u0012\u0018.³\tz)a\u0005\u0013\u001a\u0017\u0017\u000f\\%V\"~\u000e5\u0015¦\u0000\u0014;!\u000e{)\"\u0001c\r6\u0010&\r\u0004·#Q\u001bd\u0004'¢+Ø\u0012%.m*(\u0001³\u001f\u0010\u0010\u0000\u0001í&´\u001a½\u0017\tv\b%û!Ã&|$V\u0017\u001cn\u0003ê\u0010¼\u0013à\u0006G\u001c\u0003k!=$Ö\u0004\u0015\t±\u0013\u001d\u0004\u0001b\u0019¿$¡.G\ta\u0004+\u001c\u0014,ü\u0001!?!\b\u001cf\u0002!!%/\u000f\u0006\u0001\u0010/\u0012j\u0013\u0015\u0003ù\u0013Ü\u0006`\u000bú\u0000\u001b\u0005 !N$9/\u000e-b$I\rH&¢\f@\u001bº\"6.%\u001cØ\u000f.]\u001aJ)ù'\bÉ\u000fÐ\u000bD+\bN\u0006^#\u0015\u001f\n~#R\u000b w$Ð&¿\"K\u0014Ô)\u0006ñ\u0012.*o\u001c·\u000e4%q\u0014« ¶\bv\u00137/#´/a\u001e¬/þ\u0013\u001f*5\nÜ\u0014K\t\u0001\u001cO%¬\u000fÕ)h\r$\fÇ\u000fÙ\u0011>$â\u001eí\b~\u000fk.¯\t\u0019Ç)1*ß\u000eF\u000bN\u001e\u0001\u001bÖ\u001cw/í\u0010\u0017\r\u000f\bg\u0005ò\u001c\u0006\u001c¶+!\t\bd\u0017G\u0019\\ \"ñ\u0015Þ\u000e((\u0005-\u0019¥\u0007+ü']\nr\r\n\fÌ+\u001a\u0001ú\u0019i\u0005p\u0015f\"J\u0004\nØ\rP(k+t\n\u000f%\u0011/@\u0017Ì'J\u0010G\u0017Å\u0003+ó.\u0011â)­.\u0001©(Õ\u0001'x!\u0010\u0010\"9\u001cÐ\bó\r/\u001f\u0012\"À\u0019Ù\u001en\u0006É-\u000f$~\u001a\u0018\u0002|\u001a©\u001c×\u0002\u0000\u0012>\u000bT/\u0012\u001e7\u0003â\u0006.k\u001bm\u0000(õ\u0005{\u0014E\u0017Î\t³\b\u0006\u000bâ*Á\u000f*E.2\"²\u001f×\u0000´%\u001e\u0004\u0014c*\u001a|\u0000Ì+à\n(\u001d \f1\u000bÉ+-\u001e\u001b\u0010\u0012+7\u001as\u001b¡$-\t8.\u0007.1\u001fX\u000e^\f\r\u001f+½\u0014Y!\f¦\"\u0004p$\u0007\"\fc\u0011\u001eÍ\u0001Z\b\u0014\u0005m A\f[\u0012è\u0017ï\u001f~\"Ù\u0002d\u0010*\u000b\u001f\u0000}-å'\u0015(\b>\u0002Ì&o)X,Ó.a\rx\u0001W\u0007t\u0011º(·\u001b¦\u0012w\u0004¸-4\u000e\u0005\u000b¦\u0005]\u0006¹*\u0001\u0010\u0007\t}\u0010q\u0015$\u0017i#3\u0001¶\r»\u001c<\u0004Â \u0014p!ê\u0005/\u001dT\u0013<\u0001À\u0003ö'-/½\u0011Ö\u0016Ì/Å\n\u0005ÿ\f\u0015Ô\u0016Õ\u0001\u0013î\u001c\u000e \u000bð\tà\u001cî z#ò\u00196\u0019Õ\u0005'0\u001eh\u0005î\u000eµ\u0010P\u0013Ç&d\bã\u0019ì\u0010«\u0019?\b\u0011\u001e-\r§ \"3\u001fÐ)%\u0017N/-#×%0\u0015Ü\u0018 Ð\u0002C\u001a}+\u0006\u0016f+i+\u0012ü\u0004k*\\#l\u001fP%Þ\u000eý\u00027$\u001bX\u0019ã\u001e\u0013\u0013Ú\u0002ª,-\u0014W\u000fÒ\u001b¯\u0003L\u001d\n\u000e¹\u0001%#a\u001b\u001c$*\nI\u001fþ\u000fh\u0015\u0015ä\r\b{$B+\u0010\b¥\u001fÈ\u000eÝ\u0002ÿ/Ï\u0000Ø-\u0000\u001ak(q\u0000\u0007!v\u0003M\u001cC\fR\u0011\b\fÕ(\u001c\u000b\u0010\rô\u0005\u0002\u001d\f ¨)W\u0017Ù\f0\u0019ó\u0018;!X \u001b\u0007\rÐ#ï*,Ç\u0013³\u0006z\u0015ò\"S\u0016\u0012o\u0002ï,s\u0018õ*\u001f\u000bù\u001e~\u0019º\n>\u0015\n\u0001þ\u001dÌ\u001b\t\u0002B(i.?\"á\u0012L/Â\u001bò&¼\u001c!!\u000eV+:\t\u001e\u00066\u001eÆ)î\u0007\n\u0007c\u0013ï\u0018\u0007\"t\rZ\u001e¦&ß\u0012U\u0001¡'\f%´\u0011\u000b\u0015U\u0001m\u0003q\u0007\u0003÷-+\u0001\u0005[/é\tµ,y\u0013¯\u001aV!\u0001\u00072/¹\u001fð%i\u0012â\u001f\u0001$õ\nS+º\u000bå\u0019l\u000fþ\r{\u001eç+(\u0015\u001e\u00129\u000bÌ\u0019Ø,Q\u001d_\u000eU\u0014§\u0006þ\u001bf\u0015\"+\u001e+ñ\u0007ó\u0017í(§\u0011Õ\u001c\u0013Ö)\n\u000b\u0018\t®$6\u0010b#ë\u0011¦\u001d-\u0004\u001aÞ\nª(µ'4\u0006Æ\u000eç*»\u0016È)c*\u0007\u0011G ä%\u001bÏ+\u0002, #Õ\u0000½'`)\u001e\r)\\\u001d¨\rú,÷\u001ei%¿\u0002\u0012/v\"ý\tä\fõ$(\u0003\u0005É$t\r~\u000e®\u001eÛ\u0010z\n!,\bä\u0003Ö\u0019q\u00079!.#=\u0011«\u001f4\u0000\b\u0001É\u0002\u0000\u001f@\t\u0003\bý\u0003j\u0016\u0012\u0000ª$ö\u000b9&,ê\tç+¡\u0016°/ì%×\u0007m\u001c\u0003.\u000b\u000f\u0006\u0006%\u0017¯\u000eÑ\u0001Ò+û)p\u000eí\u0018°\u0012)\u0018w\u000bq".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asShortBuffer().get(sArr3, 0, 1024);
        PSIS_BITREV_MONTGOMERY = sArr3;
        short[] sArr4 = new short[1024];
        ByteBuffer.wrap("\u0001\u0000)J\u0005æ\u001cF\u0004\n\u001c\u0002\u0018\u001eñ-\r^\u000f \t\u0017\b(\u0015½\u0003\u001b)\u0005ñ\u0015l\të\u001cÙ\u0004\u001f\u001c\u0005\u001fo-£\u0006\u0007Ê\u000eÔ\u0016±\u0010õ$¶.d/Æ)\u001d/\u0005/Ý\r²\u000f¬$\u0012ï\t\u001cÌ&g\fX\b\u0015Î\tù\u001cÛ\u0018²%Ñ\u0005g)ë\u0005ý\u0000Û\u0014²\u0010¬\u001dÐ\u0018Õ%Ö Ö\u0012h$ë'\u0013^\u0017W,{!É-ù\u001b$-\u0006/\u0006Ì*\u001e\u001a\n¨\u001cô\u0011Ú\u0010D\u0010\n+p/Z\"2.\b\ro\u0016~,\\\u001aé&\".\u0006¨\u0007Ï*C///ã\u001bj-\u0010\u0006p\u0007Ç\u0007ø\u0007ÿ\b\u0000*J/0\", P \f\u0004\u0007\u001c\nî\u001cþ\u0018·\u0011?\u001då\u0018Ø,²/\u001b]\u001fW&Ä ø $\u000bs\u001d\u0011\u0004'\u000eO\u0016%'¦\u0005ª#\u0019.)(â(!.á\r\u001d^\u00042\u0007u\u001c&\\\u00132\u0002¾\u0014÷\u001em\u001fÇ&Ô\u0005\u000e+8/R/è\u0006Ø\u0015%^.|\u0006¤\u000eª\u0016«\u0003=\u0007R\u001cz\ní*µ\u0013Ñ\u001eC\u001fÁ\u0019\u001c\u0018),\u0006_\u0000é\u0014´%?'.Î\"\u001e N\u000by*É! 9\u000bv#í\u0012Ù\u0017D\u0011\n$¹\u0005?\u000ew\u0002\u0011)q/\u0011\u001bL\u0018y\u0003\u000e7\u000f¿\u000f÷\u000fÿ\u0002I)y![\u0012{\u0010[$ \f\u0017$\u0004'o'ì\u0005´)ö/$\u0006¼\u0015,9\u001aä\n³\u0016\u001a\u0017»\u0011\u001b+(!8\u0012v$í\f\"\u001d*-P(Ã!A'\n!\u0002'\u0001\fn*ì!\u000b§#ô\u0012Ú\t\u0015ð\u0017µ\u0003c\u000e3\u0016,`\u0014\u000e\t¹*/9\u0006¿\u001ce\nê#Ù\u0005\u001f\u0015N%U\u0019è\n#Ì'g\u0005¡\u000e\u0002\u0013\u000e\u0003\bÜ\u0001D\u0014Á\u0002÷\u0007H\u0015\tò\u001cÚ&i ë\u0012k+Ç\u0006A\u001cS\u0011Ã+¯/c\u0006Å*\u001d(N\u0005Â)ø\u0013¶\u0010+(\u001a\\\u0003Ä\u001bø\u0011¶\u001dö\u001f¶\u001fö\u0012H+Â\u001aÓ\u0003Õ\"Ö\u0004ú\u0000¶\u0000\u001a\u001br\u001fZ- /ª)\u0019\u0005ß\u001cE\u0011Á\u0017\u001c% Í-Õ(Ö\f±$\u001a\u0019»\u0003­\u0007b\u0001\u000e)L\u001ay&\u0012\u001a\u0003\u0018J\u0018\u000b\u0018\u0002\u0003n\u0007Y\u001c{-7/\u0006Í\u001cg\u001f}-¥\u001b\u0018\u0011$Í\u0012ù\u0010m\u001dÇ\u0004A)Á\u0005÷#$'O.Ã(ø\u001am\n¢\u000f<$w.[\u001b2-\b\u0014&\u0010\u0010\u0016\u0016ß\n \u0016\u0005\u0017¸\n?\u001cå\u001f&Ì\u0013B\u0017S\u0003U\u000e1\u0002\u0007\".\u0016\rq+\u0011\u0006'\u0000á\"j.\u0010/º\r­$>\f\t$\u0002\u0012Ü\u001e \u001f¼-®/¬\r«\u000f«\u0002=\u000e\t\u0016\u001e¨&«'Ð\u0005°\u0000Ð\u001b\nË\u001cù-I(Â.ø\"$.\u0006(Ý\f²\u0016c\u001e¡&ª\u0005\u0000Ê\rÔ\u001dh\u000b\u000f\bp*Z\u0013Ä\u0010\u0010\u0014\u0002L\u0000T\u0000\f\u001bp\nÇ#Ô\u0019±,Ñ\u0006g#4\u000bã\u001d!\u0018¼,®\u0006b\u0007Å#f.4\"\b.\u0002/¸)\u001b\u001ar&\u0011'º\u0013d%\u000f\u0019Þ\u0003²\"Ñ\u0019\u00189\u0011-$¾ ®&õ ÿ %-½!÷'$\fs\u0016Z\n\r*\u001a¨\u0011\u00108$ ©\u000b\b\u00017\u0007\b#K y-É\rf\u0001ê\u0000F\u0000\n\u0006Ý\u0000û\rÛ\u001di-Y\rV\u001dV\u0011è\u0010F$\u0005;\u0015R\u001ez-\u0006\u001c\\&W'Ä\u001aA&\n'¹!\u001b )&â\u0005#\u0015\u0005\u0003\u0015J,0\u0006P\u000e+<(w\u0013\u0002É\u000e\u001d$N \u0012`\u0002 \u0000`\u001b|&7.\r\u0016\u00037)/\u0017)\u0004\u0005Ü\u0015i\u0003\u000f\u000e'++! ; \t-¹(Ò\u0013\u0010\u001dÊ\u000b\u001d\br\u000eì\u001d&\f\\\u0001Ä)f\u0005ê\u0015k\u0017¢\u0017ó\u0011#\u001dá\u001f³\u0019\u001a\u0003\"Í g\u0004¡\u0015<,.!¾\u0004Ò\u0015C,/\u0014\u0007\t¸\b?*S\u0013Ã\u001eA\u000b.\u000fP\u00020\u0000P\u0006ç\u0007Ø\u000eÖ+D\u001aÁ\n®*¬/>\".\u0004â)Ø\u001a\u0003Ë\u001bù\u0003ÿ\"Ü\u0012²\u001e\u001a\u0012\u0004\u0010J\u001dÂ\u0018Ó\u0011C\u0017\n,p(£(\u0018\u001aM\u0011y\u0002\u0014î\tÙ#²\u000bõ\u0016H\u0010æ\u0002j\u0014ë\u0002ý\u0015\u0000\u0003\u0000\u001bÜ\u0011²$Ñ\f\u001e$\u0005\u0019¸,Ò(±(\u001a.à\u001bE\u0018x\u00116\tQ\u001cÃ\u0011Ó\u0010C\u001dÁ&\f]$\u000e.L(ç\u0013\u0017^,|\u0014\u0012\u0002Þ\u000e +*/P\u001bU-\r/)\u0016/\u0004\r\bÌ\u001c°&c\u00133%\b\u0019Ý\u0011i\u001dë&\u001a\u0015\u0011q\u00105\u001d¿\u0011÷\u0002\u000e\u0015\u0002\u0003)o\u001a~\u0011\u0002\u00077\u000e¿\u0016®\n\u0019\u0016\u0004%o\u0005Y)é!k'\u0010.º\u0014d\u001eX\u001fÄ\u001fø&Û\u0005\u0000Ë\u0000\u001d\"N.\f\u0006*\u0016(M\u0013y%\u0012 º\u0012d+Æ\u0013ø\u0017m\u001eÇ-/§\"='.\u0013P\u0017U\u0017è\u0017ý\u0018\u0000\u001eÜ-\u0006\u0000î\u0000\"\r¼\u0016% Ê&ù\u001a$\u0003¼)®\u001a&\u0014.\"\u0016.\u0004\u0014J\u0002æ\u0000j\"Y'2\fu*í\u0013Ù\u0010\u0016ð\u0010þ\tI*y\u001a¤\u0018a,¡(ª(\u0019\f\u0016_%|\u0013\u0012\t\b:\u000eä+F/T\u0014z\u0010¤+!¦-ô/¶\u0014\u0010¦\u0010\u0018+r\u0013ì+þ\u0014\u0000\t·\u0015ö%m Ç \u001d\u000br*È/B\u001bS\u0018z%É\u0013\u001d\u0002»\u000e\u001b\u000f»\u0016Ò,h\u0006X\u0000è\"k Y\u0004\u0000©\"b\u000bÅ\b\u0015Ë\u0003\u001d\u000e)\u000f½+e\u00063\u001cQ-1!ã\u0019j\n}*¥/=/å/ý\u0006Û\u001ci\u0004\u000f\u0007p\u0001\u0010\rÞ$E\f\n\u0016K\u0017Â\u0011\u001c\u001dà-j\u00144\u0010$© « \u0019\u0012M\u00170\u0003P\"Ã\u0019\u0003¦\u0007a\u000eÅ$f'}'î\u001aG\u0003Á\u0015\u001c\u0003\u0004\u0015\u0001%J Â\u0004®\"õ\u000bÚ\b\u001c§\u0011Ï\u0017\u001e\n)*\u0013Í%\u001e\f)\u001d+\u001f-©\u0014=%. ¾\u000b\u000f]\u000fé\u000fý\u001d·\u001f­\u000bb\u00163\u0010ã+\u00069*\t\u001a\u0003Ì\u000eB\bå\u0015Ø\u0010Ö\u001dÖ&\u00139\u0002¿\u0007@#S\u0012Ã$ø\u0005H#\u000b.'\u0014O\u001eU\u0018è\u0011F\u001dæ\u000b!\u0001\"\u0019\u001f\u0013\u000bL#ç\u0005!)á/!/á\u0006×#D x\u000b\b\u000eî\u0002\"\u0000N\"U.\r(Þ.ü\u001bI\u0011$Î\u0005B\u0015S\u0010Ã\u0002e)}\u001a&\u0013\fL\u001d0\u000b\u0007\u0016&\u0003*\u001bâ\u001fj\u00124\u001e\b\u0018Ý\u0018 \u0018\u0005\nJ\u0016\u000b%p'£.Ï\u0014g%4.v(í!G\u0004Á\u000ee\bê\u0001F)T\fÃ\u001dA\u0011å\tj\u0015ë,G\u001aæ\u001fF\u001fæ-´\rc+\u000f!'\u0016\fq\u0001Ç\u0000A\u0014\u001e`\u0012\u000e\u0017'\u001e½&®.¬\u0014b\tÅ\u0015ø\tÿ*\u0006\u0015\u0007º*@(S!1\u0012u\u0002£\u0007<*./,)\u0007\f¸$\u001b\f\u0004\b*_/3)\b/\u0002)\u0001".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asShortBuffer().get(sArr4, 0, 1024);
        PSIS_INV_MONTGOMERY = sArr4;
    }

    Precomp() {
    }
}
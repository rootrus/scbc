package p040o;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: o.rsnScriptSetTimeZone */
public enum rsnScriptSetTimeZone {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{LocalizedMessage.DEFAULT_ENCODING}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}, (int) new String[]{"US-ASCII"}),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    
    private static final Map<String, rsnScriptSetTimeZone> NAME_TO_ECI = null;
    private static final Map<Integer, rsnScriptSetTimeZone> VALUE_TO_ECI = null;
    private final String[] otherEncodingNames;
    public final int[] values;

    static {
        VALUE_TO_ECI = new HashMap();
        NAME_TO_ECI = new HashMap();
        for (rsnScriptSetTimeZone rsnscriptsettimezone : values()) {
            for (int valueOf : rsnscriptsettimezone.values) {
                VALUE_TO_ECI.put(Integer.valueOf(valueOf), rsnscriptsettimezone);
            }
            NAME_TO_ECI.put(rsnscriptsettimezone.name(), rsnscriptsettimezone);
            for (String put : rsnscriptsettimezone.otherEncodingNames) {
                NAME_TO_ECI.put(put, rsnscriptsettimezone);
            }
        }
    }

    private rsnScriptSetTimeZone(String str) {
        this(str, 24, new int[]{28}, new String[0]);
    }

    private rsnScriptSetTimeZone(int i, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    private rsnScriptSetTimeZone(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public static rsnScriptSetTimeZone IconCompatParcelizer(int i) throws FormatException {
        if (i >= 0 && i < 900) {
            return VALUE_TO_ECI.get(Integer.valueOf(i));
        }
        throw FormatException.read();
    }

    public static rsnScriptSetTimeZone write(String str) {
        return NAME_TO_ECI.get(str);
    }
}

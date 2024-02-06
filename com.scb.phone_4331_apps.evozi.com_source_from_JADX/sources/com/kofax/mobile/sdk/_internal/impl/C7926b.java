package com.kofax.mobile.sdk._internal.impl;

import android.util.Base64;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7888b;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: com.kofax.mobile.sdk._internal.impl.b */
public class C7926b implements C7888b {

    /* renamed from: vP */
    private static final Charset[] f3664vP = {Charset.forName("UTF-8"), Charset.forName(LocalizedMessage.DEFAULT_ENCODING)};

    public String decode(String str) {
        return m3876d(Base64.decode(str, 0));
    }

    /* renamed from: d */
    private static String m3876d(byte[] bArr) {
        Charset[] charsetArr = f3664vP;
        int i = 0;
        while (i < charsetArr.length) {
            try {
                return charsetArr[i].newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (CharacterCodingException unused) {
                i++;
            }
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION);
    }

    /* renamed from: v */
    public boolean mo54216v(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            char[] cArr = new char[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (!Character.isWhitespace(str.charAt(i2))) {
                    cArr[i] = str.charAt(i2);
                    i++;
                }
            }
            if (i != length) {
                str = new String(cArr, 0, i);
            }
        }
        return str.matches("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$");
    }
}

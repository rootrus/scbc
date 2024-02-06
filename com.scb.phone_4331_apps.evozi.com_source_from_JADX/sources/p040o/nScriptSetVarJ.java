package p040o;

import com.google.common.base.Preconditions;
import java.io.InputStream;

/* renamed from: o.nScriptSetVarJ */
public class nScriptSetVarJ extends nScriptSetVarObj {
    private nScriptSetVarJ(String str, byte[] bArr) {
        this((String) null, bArr, bArr.length);
    }

    private nScriptSetVarJ(String str, byte[] bArr, int i) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(i >= 0 && i <= bArr.length, "offset %s, length %s, array length %s", 0, Integer.valueOf(i), Integer.valueOf(bArr.length));
    }

    public static nScriptSetVarJ IconCompatParcelizer(String str) {
        return new nScriptSetVarJ((String) null, rsnAllocationGetType.IconCompatParcelizer(str));
    }

    public nScriptSetVarJ(String str, InputStream inputStream) {
        Preconditions.checkNotNull(inputStream);
    }
}

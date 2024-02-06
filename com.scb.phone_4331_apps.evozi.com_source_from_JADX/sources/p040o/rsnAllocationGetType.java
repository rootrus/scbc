package p040o;

import java.nio.charset.StandardCharsets;

/* renamed from: o.rsnAllocationGetType */
public final class rsnAllocationGetType {
    static {
        System.getProperty("line.separator");
    }

    public static byte[] IconCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }
}

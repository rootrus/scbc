package p039io.beid.beidk.p085a;

import java.util.List;
import java.util.Map;

/* renamed from: io.beid.beidk.a.b */
public class C9605b extends Exception {
    public int read;

    public C9605b() {
        this.read = 0;
    }

    public C9605b(String str) {
        super(str);
        this.read = 0;
    }

    public C9605b(String str, int i, Map<String, List<String>> map, String str2) {
        this(str, (Throwable) null, i);
    }

    private C9605b(String str, Throwable th, int i) {
        super(str, th);
        this.read = 0;
        this.read = i;
    }

    public C9605b(String str, Throwable th, int i, Map<String, List<String>> map) {
        this(str, th, i);
    }

    public C9605b(Throwable th) {
        super(th);
        this.read = 0;
    }
}

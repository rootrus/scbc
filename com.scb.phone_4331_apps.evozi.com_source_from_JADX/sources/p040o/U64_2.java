package p040o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: o.U64_2 */
public class U64_2 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;
    public List<read> read = new ArrayList(4);

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Huffman";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Number of Tables");
    }

    public U64_2() {
        read((createCubemapFromCubeFaces) new U32_4(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    /* renamed from: o.U64_2$read */
    public static class read {

        /* renamed from: o.U64_2$read$write */
        public enum write {
            DC,
            AC,
            UNKNOWN;

            public static write read(int i) {
                if (i == 0) {
                    return DC;
                }
                if (i != 1) {
                    return UNKNOWN;
                }
                return AC;
            }
        }
    }
}

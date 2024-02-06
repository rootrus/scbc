package p040o;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.p041bp.zone.ZoneRulesException;

/* renamed from: o.HistoryAdapter$GroupErrorViewHolder$MediaBrowserCompat$CustomActionResultReceiver */
class C6881x60251890 {
    private final String[] regionArray;
    private final AtomicReferenceArray<Object> ruleData;
    private final short[] ruleIndices;
    /* access modifiers changed from: private */
    public final String versionId;

    C6881x60251890(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
        this.ruleData = atomicReferenceArray;
        this.versionId = str;
        this.regionArray = strArr;
        this.ruleIndices = sArr;
    }

    /* access modifiers changed from: package-private */
    public HistoryAdapter$ChildViewHolder getRules(String str) {
        int binarySearch = Arrays.binarySearch(this.regionArray, str);
        if (binarySearch < 0) {
            return null;
        }
        try {
            return createRule(this.ruleIndices[binarySearch]);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid binary time-zone data: TZDB:");
            sb.append(str);
            sb.append(", version: ");
            sb.append(this.versionId);
            throw new ZoneRulesException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public HistoryAdapter$ChildViewHolder createRule(short s) throws Exception {
        Object obj = this.ruleData.get(s);
        if (obj instanceof byte[]) {
            obj = FavouriteTargetAdapter$ItemViewHolder_ViewBinding.read(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
            this.ruleData.set(s, obj);
        }
        return (HistoryAdapter$ChildViewHolder) obj;
    }

    public String toString() {
        return this.versionId;
    }
}

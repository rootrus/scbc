package p040o;

import java.util.List;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.GPUStrategyEdgeDetection */
public final /* synthetic */ class GPUStrategyEdgeDetection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List write;

    public /* synthetic */ GPUStrategyEdgeDetection(List list) {
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.read) obj).write(this.write);
    }
}

package com.kofax.mobile.sdk._internal.impl.detection.data;

public class EdgeGuidance {

    /* renamed from: HM */
    private final boolean[] f1595HM;

    public enum EdgeType {
        LEFT(0),
        TOP(1),
        RIGHT(2),
        BOTTOM(3);
        

        /* renamed from: HN */
        private final int f1597HN;

        private EdgeType(int i) {
            this.f1597HN = i;
        }

        public final int index() {
            return this.f1597HN;
        }
    }

    public EdgeGuidance(boolean[] zArr) {
        this.f1595HM = zArr;
    }

    public boolean isEdgeFound(EdgeType edgeType) {
        return this.f1595HM[edgeType.index()];
    }
}

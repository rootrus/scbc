package com.kofax.mobile.sdk.p023k;

import com.kofax.mobile.sdk._internal.impl.detection.data.EdgeGuidance;

/* renamed from: com.kofax.mobile.sdk.k.g */
public class C0955g {

    /* renamed from: FU */
    private static final int f2318FU = 5;

    /* renamed from: FV */
    private boolean[] f2319FV = new boolean[EdgeGuidance.EdgeType.values().length];

    /* renamed from: FW */
    private int[] f2320FW = new int[EdgeGuidance.EdgeType.values().length];

    /* renamed from: a */
    public void mo12352a(EdgeGuidance edgeGuidance) {
        if (edgeGuidance != null) {
            for (EdgeGuidance.EdgeType edgeType : EdgeGuidance.EdgeType.values()) {
                if (this.f2319FV[edgeType.index()] != edgeGuidance.isEdgeFound(edgeType)) {
                    int[] iArr = this.f2320FW;
                    int index = edgeType.index();
                    iArr[index] = iArr[index] - 1;
                    if (this.f2320FW[edgeType.index()] < 0) {
                        this.f2319FV[edgeType.index()] = edgeGuidance.isEdgeFound(edgeType);
                    }
                }
                this.f2320FW[edgeType.index()] = 5;
            }
        }
    }

    public EdgeGuidance getEdgesGuidance() {
        return new EdgeGuidance(this.f2319FV);
    }
}

package com.kofax.kmc.ken.engines.processing;

public class DocumentDimensions {

    /* renamed from: ib */
    private Float f524ib;

    /* renamed from: ic */
    private Float f525ic;

    public DocumentDimensions(Float f, Float f2) {
        this.f524ib = f;
        this.f525ic = f2;
    }

    public Float getShortEdge() {
        return this.f524ib;
    }

    public Float getLongEdge() {
        return this.f525ic;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocumentDimensions documentDimensions = (DocumentDimensions) obj;
        Float f = this.f524ib;
        if (f == null ? documentDimensions.f524ib != null : !f.equals(documentDimensions.f524ib)) {
            return false;
        }
        Float f2 = this.f525ic;
        Float f3 = documentDimensions.f525ic;
        if (f2 != null) {
            return f2.equals(f3);
        }
        if (f3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Float f = this.f524ib;
        int i = 0;
        int hashCode = f != null ? f.hashCode() : 0;
        Float f2 = this.f525ic;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}

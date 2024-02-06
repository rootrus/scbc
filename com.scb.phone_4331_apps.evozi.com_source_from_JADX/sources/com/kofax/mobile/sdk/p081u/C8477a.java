package com.kofax.mobile.sdk.p081u;

import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionResult;
import com.kofax.mobile.sdk.extract.p018id.ImageField;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.u.a */
public class C8477a implements IIdExtractionResult, Serializable {

    /* renamed from: NO */
    boolean f5057NO;

    /* renamed from: NP */
    boolean f5058NP;

    /* renamed from: NQ */
    double f5059NQ;

    /* renamed from: NR */
    private final String f5060NR;

    /* renamed from: NS */
    private final float f5061NS;

    /* renamed from: NT */
    private ImageField f5062NT;

    /* renamed from: NU */
    private ImageField f5063NU;

    /* renamed from: Np */
    List<DataField> f5064Np;

    public C8477a(boolean z, boolean z2, double d, String str, float f, ImageField imageField, ImageField imageField2, List<DataField> list) {
        this.f5057NO = z;
        this.f5058NP = z2;
        this.f5059NQ = d;
        this.f5060NR = str;
        this.f5061NS = f;
        this.f5062NT = imageField;
        this.f5063NU = imageField2;
        this.f5064Np = list;
    }

    public String classification() {
        return this.f5060NR;
    }

    public float classificationConfidence() {
        return this.f5061NS;
    }

    public boolean isBarcodeRead() {
        return this.f5057NO;
    }

    public boolean isOcrRead() {
        return this.f5058NP;
    }

    public double getDocumentVerificationConfidenceRating() {
        return this.f5059NQ;
    }

    public ImageField getFaceImageField() {
        return this.f5062NT;
    }

    public ImageField getSignatureImageField() {
        return this.f5063NU;
    }

    public List<DataField> getFields() {
        return this.f5064Np;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BarcodeRead: ");
        sb.append(isBarcodeRead());
        sb.append(", OcrRead: ");
        sb.append(isOcrRead());
        sb.append(", DocumentVerificationConfidenceRating: ");
        sb.append(getDocumentVerificationConfidenceRating());
        return sb.toString();
    }
}

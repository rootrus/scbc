package com.kofax.mobile.sdk.p075e;

import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.mobile.sdk.extract.p018id.AggregateException;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionListener;
import com.kofax.mobile.sdk.extract.p018id.IIdImageProcessingListener;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;
import com.kofax.mobile.sdk.extract.p018id.ImageField;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p081u.C8478b;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.e.a */
public interface C8340a {

    /* renamed from: vM */
    public static final String f4877vM = "Passports";

    /* renamed from: vN */
    public static final String f4878vN = "IDNumber";

    /* renamed from: vO */
    public static final String f4879vO = "License";

    /* renamed from: a */
    void mo55095a(C8297a aVar);

    /* renamed from: a */
    void mo55096a(ImageField imageField);

    /* renamed from: a */
    void mo55097a(C8478b bVar);

    /* renamed from: a */
    void mo55098a(Exception exc);

    /* renamed from: b */
    void mo55099b(C8297a aVar);

    /* renamed from: b */
    void mo55100b(ImageField imageField);

    /* renamed from: b */
    void mo55101b(C8478b bVar);

    /* renamed from: b */
    void mo55102b(Exception exc);

    /* renamed from: b */
    void mo55103b(List<DataField> list);

    /* renamed from: c */
    void mo55104c(List<DataField> list);

    /* renamed from: d */
    void mo55105d(double d);

    /* renamed from: d */
    void mo55106d(List<DataField> list);

    /* renamed from: e */
    void mo55107e(List<DataField> list);

    /* renamed from: f */
    void mo55108f(List<List<DataField>> list);

    /* renamed from: g */
    void mo55109g(List<List<DataField>> list);

    double getDocumentVerificationConfidenceRating();

    IIdExtractionListener getExtractionListener();

    ImageField getFaceImageField();

    IIdImageProcessingListener getImageProcessingListener();

    ImageField getSignatureImageField();

    /* renamed from: h */
    void mo55115h(List<DataField> list);

    /* renamed from: hA */
    AggregateException mo55116hA();

    /* renamed from: hB */
    List<DataField> mo55117hB();

    /* renamed from: hC */
    List<BarCodeResult> mo55118hC();

    /* renamed from: hD */
    List<List<DataField>> mo55119hD();

    /* renamed from: hE */
    List<BarCodeResult> mo55120hE();

    /* renamed from: hF */
    List<List<DataField>> mo55121hF();

    /* renamed from: hG */
    List<DataField> mo55122hG();

    /* renamed from: hH */
    List<List<DataField>> mo55123hH();

    /* renamed from: hI */
    List<List<DataField>> mo55124hI();

    /* renamed from: hq */
    IdExtractionParameters mo55125hq();

    /* renamed from: hr */
    C8478b mo55126hr();

    /* renamed from: hs */
    C8478b mo55127hs();

    /* renamed from: ht */
    String mo55128ht();

    /* renamed from: hu */
    C8297a mo55129hu();

    /* renamed from: hv */
    C8297a mo55130hv();

    /* renamed from: hw */
    C8297a mo55131hw();

    /* renamed from: hx */
    List<DataField> mo55132hx();

    /* renamed from: hy */
    List<DataField> mo55133hy();

    /* renamed from: hz */
    List<DataField> mo55134hz();

    /* renamed from: i */
    void mo55135i(List<DataField> list);

    boolean isBarcodeRead();

    boolean isOcrRead();

    boolean isProcessed();

    /* renamed from: j */
    void mo55139j(List<DataField> list);

    /* renamed from: n */
    void mo55140n(boolean z);

    /* renamed from: o */
    void mo55141o(boolean z);
}

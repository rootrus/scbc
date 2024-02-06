package com.kofax.mobile.sdk.p081u;

import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.mobile.sdk.extract.p018id.AggregateException;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.kofax.mobile.sdk.extract.p018id.IIdExtractionListener;
import com.kofax.mobile.sdk.extract.p018id.IIdImageProcessingListener;
import com.kofax.mobile.sdk.extract.p018id.IdExtractionParameters;
import com.kofax.mobile.sdk.extract.p018id.IdType;
import com.kofax.mobile.sdk.extract.p018id.ImageField;
import com.kofax.mobile.sdk.extract.p018id.ListOfException;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.u.d */
public class C8481d implements C8340a {

    /* renamed from: NO */
    private boolean f5073NO;

    /* renamed from: NP */
    private boolean f5074NP;

    /* renamed from: Oc */
    private final IdExtractionParameters f5075Oc;

    /* renamed from: Od */
    private List<DataField> f5076Od;

    /* renamed from: Oe */
    private List<Exception> f5077Oe = new ArrayList();

    /* renamed from: Of */
    private List<Exception> f5078Of = new ArrayList();

    /* renamed from: Og */
    private C8478b f5079Og;

    /* renamed from: Oh */
    private C8478b f5080Oh;

    /* renamed from: Oi */
    private C8297a f5081Oi;

    /* renamed from: Oj */
    private C8297a f5082Oj;

    /* renamed from: Ok */
    private List<DataField> f5083Ok = null;

    /* renamed from: Ol */
    private List<DataField> f5084Ol = null;

    /* renamed from: Om */
    private List<DataField> f5085Om = null;

    /* renamed from: On */
    private ImageField f5086On = null;

    /* renamed from: Oo */
    private ImageField f5087Oo = null;

    /* renamed from: Op */
    private List<DataField> f5088Op = null;

    /* renamed from: Oq */
    private List<DataField> f5089Oq = null;

    /* renamed from: Or */
    private List<DataField> f5090Or = null;

    /* renamed from: Os */
    private List<List<DataField>> f5091Os;

    /* renamed from: Ot */
    private List<List<DataField>> f5092Ot;

    /* renamed from: Ou */
    private double f5093Ou;

    public C8481d(IdExtractionParameters idExtractionParameters) {
        this.f5075Oc = idExtractionParameters;
    }

    /* renamed from: hq */
    public IdExtractionParameters mo55125hq() {
        return this.f5075Oc;
    }

    /* renamed from: hr */
    public C8478b mo55126hr() {
        return this.f5079Og;
    }

    /* renamed from: a */
    public void mo55097a(C8478b bVar) {
        this.f5079Og = bVar;
    }

    /* renamed from: hs */
    public C8478b mo55127hs() {
        return this.f5080Oh;
    }

    /* renamed from: b */
    public void mo55101b(C8478b bVar) {
        this.f5080Oh = bVar;
    }

    /* renamed from: a */
    public void mo55098a(Exception exc) {
        this.f5077Oe.add(exc);
    }

    /* renamed from: b */
    public void mo55102b(Exception exc) {
        this.f5078Of.add(exc);
    }

    public boolean isProcessed() {
        return this.f5075Oc.isProcessed();
    }

    /* renamed from: ht */
    public String mo55128ht() {
        return this.f5075Oc.getIdType() == IdType.Passport ? C8340a.f4877vM : this.f5075Oc.getProjectName();
    }

    public IIdExtractionListener getExtractionListener() {
        return this.f5075Oc.getExtractionListener();
    }

    public IIdImageProcessingListener getImageProcessingListener() {
        return this.f5075Oc.getImageProcessingListener();
    }

    /* renamed from: n */
    public void mo55140n(boolean z) {
        this.f5073NO = z | this.f5073NO;
    }

    public boolean isBarcodeRead() {
        return this.f5073NO;
    }

    /* renamed from: o */
    public void mo55141o(boolean z) {
        this.f5074NP = this.f5074NP || z;
    }

    public boolean isOcrRead() {
        return this.f5074NP;
    }

    /* renamed from: hu */
    public C8297a mo55129hu() {
        return this.f5081Oi;
    }

    /* renamed from: a */
    public void mo55095a(C8297a aVar) {
        this.f5081Oi = aVar;
    }

    /* renamed from: hv */
    public C8297a mo55130hv() {
        return this.f5081Oi;
    }

    /* renamed from: b */
    public void mo55099b(C8297a aVar) {
        this.f5082Oj = aVar;
    }

    /* renamed from: hw */
    public C8297a mo55131hw() {
        return this.f5082Oj;
    }

    /* renamed from: b */
    public void mo55103b(List<DataField> list) {
        this.f5083Ok = list;
    }

    /* renamed from: hx */
    public List<DataField> mo55132hx() {
        return this.f5083Ok;
    }

    /* renamed from: c */
    public void mo55104c(List<DataField> list) {
        this.f5084Ol = list;
    }

    /* renamed from: hy */
    public List<DataField> mo55133hy() {
        return this.f5084Ol;
    }

    /* renamed from: hz */
    public List<DataField> mo55134hz() {
        return this.f5076Od;
    }

    /* renamed from: d */
    public void mo55106d(List<DataField> list) {
        this.f5076Od = list;
    }

    public ImageField getFaceImageField() {
        return this.f5086On;
    }

    /* renamed from: a */
    public void mo55096a(ImageField imageField) {
        this.f5086On = imageField;
    }

    public ImageField getSignatureImageField() {
        return this.f5087Oo;
    }

    /* renamed from: b */
    public void mo55100b(ImageField imageField) {
        this.f5087Oo = imageField;
    }

    /* renamed from: d */
    public void mo55105d(double d) {
        this.f5093Ou = d;
    }

    public double getDocumentVerificationConfidenceRating() {
        return this.f5093Ou;
    }

    /* renamed from: hA */
    public AggregateException mo55116hA() {
        Exception exc;
        Exception exc2;
        do {
        } while (this.f5077Oe.remove((Object) null));
        if (this.f5077Oe.size() == 1) {
            exc = this.f5077Oe.get(0);
        } else {
            exc = this.f5077Oe.size() > 1 ? new ListOfException(this.f5077Oe) : null;
        }
        do {
        } while (this.f5078Of.remove((Object) null));
        if (this.f5078Of.size() == 1) {
            exc2 = this.f5078Of.get(0);
        } else {
            exc2 = this.f5078Of.size() > 1 ? new ListOfException(this.f5078Of) : null;
        }
        if (exc == null && exc2 == null) {
            return null;
        }
        return new AggregateException(exc, exc2);
    }

    /* renamed from: e */
    public void mo55107e(List<DataField> list) {
        this.f5085Om = list;
    }

    /* renamed from: hB */
    public List<DataField> mo55117hB() {
        return this.f5085Om;
    }

    /* renamed from: hC */
    public List<BarCodeResult> mo55118hC() {
        return this.f5075Oc.getBackBarcodes();
    }

    /* renamed from: f */
    public void mo55108f(List<List<DataField>> list) {
        this.f5092Ot = list;
    }

    /* renamed from: hD */
    public List<List<DataField>> mo55119hD() {
        return this.f5092Ot;
    }

    /* renamed from: hE */
    public List<BarCodeResult> mo55120hE() {
        return this.f5075Oc.getFrontBarcodes();
    }

    /* renamed from: g */
    public void mo55109g(List<List<DataField>> list) {
        this.f5091Os = list;
    }

    /* renamed from: hF */
    public List<List<DataField>> mo55121hF() {
        return this.f5091Os;
    }

    /* renamed from: h */
    public void mo55115h(List<DataField> list) {
        this.f5089Oq = list;
    }

    /* renamed from: i */
    public void mo55135i(List<DataField> list) {
        this.f5090Or = list;
    }

    /* renamed from: j */
    public void mo55139j(List<DataField> list) {
        this.f5088Op = list;
    }

    /* renamed from: hG */
    public List<DataField> mo55122hG() {
        return this.f5088Op;
    }

    /* renamed from: hH */
    public List<List<DataField>> mo55123hH() {
        return Arrays.asList(new List[]{this.f5089Oq});
    }

    /* renamed from: hI */
    public List<List<DataField>> mo55124hI() {
        return Arrays.asList(new List[]{this.f5090Or});
    }
}

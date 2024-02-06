package com.kofax.kmc.klo.logistics.data;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.klo.logistics.version.KloVersion;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p027r.C8466a;
import com.kofax.mobile.sdk.p079q.C8464a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Document implements Serializable, Cloneable {
    private static final long serialVersionUID = -5740834983974316354L;
    private transient IBus _bus;

    /* renamed from: iF */
    private transient DocumentType f3406iF;

    /* renamed from: iG */
    private transient List<FieldType> f3407iG;

    /* renamed from: iH */
    private transient List<Field> f3408iH;

    /* renamed from: iI */
    private transient List<Field> f3409iI;

    /* renamed from: iJ */
    private transient List<Page> f3410iJ;

    /* renamed from: iK */
    private transient List<Page> f3411iK;

    /* renamed from: iL */
    private transient String f3412iL;

    /* renamed from: iM */
    private transient String f3413iM;

    /* renamed from: iN */
    private transient List<ClassificationResult> f3414iN;

    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("Document: unexpected 'clone not supported exception'");
        }
    }

    public Document(DocumentType documentType) {
        this.f3406iF = documentType.clone();
        this.f3412iL = UUID.randomUUID().toString();
        init();
    }

    public Document(DocumentTypeR documentTypeR) {
        this.f3406iF = (DocumentType) documentTypeR;
        this.f3412iL = UUID.randomUUID().toString();
        init();
    }

    public Document(DocumentType documentType, String str) {
        if (str != null) {
            str = str.isEmpty() ? UUID.randomUUID().toString() : str;
            this.f3406iF = documentType.clone();
            this.f3412iL = str;
            init();
            return;
        }
        throw new NullPointerException("Document constructor: documentID parameter cannot be null");
    }

    public Document(DocumentTypeR documentTypeR, String str) {
        if (str != null) {
            str = str.isEmpty() ? UUID.randomUUID().toString() : str;
            this.f3406iF = (DocumentType) documentTypeR;
            this.f3412iL = str;
            init();
            return;
        }
        throw new NullPointerException("Document constructor: documentID parameter cannot be null");
    }

    private void init() {
        this.f3407iG = this.f3406iF.getFieldTypes();
        ArrayList arrayList = new ArrayList();
        this.f3408iH = arrayList;
        this.f3409iI = Collections.unmodifiableList(arrayList);
        if (this.f3407iG != null) {
            for (int i = 0; i < this.f3407iG.size(); i++) {
                this.f3408iH.add(new Field(this.f3407iG.get(i), this.f3412iL));
                List<Field> list = this.f3408iH;
                list.get(list.size() - 1).updateFieldProperties(this.f3407iG.get(i).getDefault(), true, "");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        this.f3410iJ = arrayList2;
        this.f3411iK = Collections.unmodifiableList(arrayList2);
        this.f3413iM = "";
        this.f3414iN = new ArrayList();
        IBus iBus = Injector.getInjector(AppContextProvider.getContext()).getIBus();
        this._bus = iBus;
        iBus.post(new C8464a(this));
    }

    public void addPage(Page page) throws KmcException {
        Image image;
        page.setDocumentID(this.f3412iL);
        this.f3410iJ.add(page);
        if (this.f3412iL != null && page.getImages().size() > 0 && (image = page.getImages().get(0)) != null) {
            this._bus.post(new C8466a(this.f3412iL, image));
        }
    }

    public ErrorInfo removePage(String str) {
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        Iterator<Page> it = this.f3410iJ.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next().getPageID())) {
                it.remove();
                return errorInfo;
            }
        }
        return ErrorInfo.KMC_LO_PAGE_NOT_FOUND;
    }

    public String getDocumentId() {
        return this.f3412iL;
    }

    public DocumentType getDocumentType() {
        return this.f3406iF;
    }

    public List<Field> getFields() {
        return this.f3409iI;
    }

    public List<Page> getPages() {
        return this.f3411iK;
    }

    public List<ClassificationResult> getClassificationAlternatives() {
        return new ArrayList(this.f3414iN);
    }

    public void setClassificationAlternatives(List<ClassificationResult> list) {
        new ArrayList(list);
    }

    public String getDocumentLevelError() {
        return this.f3413iM;
    }

    public void setDocumentLevelError(String str) {
        if (str != null) {
            this.f3413iM = str;
            return;
        }
        throw new NullPointerException("setDocumentLevelError: documentLevelError parameter cannot be null");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(Document.class.getName());
        objectOutputStream.writeObject(KloVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f3406iF);
        objectOutputStream.writeObject(this.f3408iH);
        objectOutputStream.writeObject(this.f3410iJ);
        objectOutputStream.writeObject(this.f3412iL);
        objectOutputStream.writeObject(this.f3413iM);
        objectOutputStream.writeObject(this.f3414iN);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (Document.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KloVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                DocumentType documentType = (DocumentType) objectInputStream.readObject();
                this.f3406iF = documentType;
                this.f3407iG = documentType.getFieldTypes();
                ArrayList arrayList = (ArrayList) objectInputStream.readObject();
                this.f3408iH = arrayList;
                this.f3409iI = Collections.unmodifiableList(arrayList);
                ArrayList arrayList2 = (ArrayList) objectInputStream.readObject();
                this.f3410iJ = arrayList2;
                this.f3411iK = Collections.unmodifiableList(arrayList2);
                this.f3412iL = (String) objectInputStream.readObject();
                this.f3413iM = (String) objectInputStream.readObject();
                this.f3414iN = (ArrayList) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

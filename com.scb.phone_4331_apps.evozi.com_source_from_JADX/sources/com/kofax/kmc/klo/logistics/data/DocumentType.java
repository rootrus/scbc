package com.kofax.kmc.klo.logistics.data;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.data.BasicSettingsProfile;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.ken.engines.processing.ImageProcessorConfiguration;
import com.kofax.kmc.klo.logistics.version.KloVersion;
import com.kofax.kmc.klo.logistics.webservice.WscIndexField;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import p040o.ModifyQuickTopUpReviewActivity;

public class DocumentType implements DocumentTypeR {

    /* renamed from: iO */
    private static final String f3415iO = "3.4.0.0.0.0";
    private static final long serialVersionUID = -5952233167460944223L;

    /* renamed from: aP */
    private transient ImagePerfectionProfile f3416aP;

    /* renamed from: aQ */
    private transient BasicSettingsProfile f3417aQ;
    private transient String displayName = new String();

    /* renamed from: iP */
    private transient String f3418iP = new String();

    /* renamed from: iQ */
    private transient List<FieldType> f3419iQ = null;

    /* renamed from: iR */
    private transient Float f3420iR;

    /* renamed from: iS */
    private transient Float f3421iS;

    /* renamed from: iT */
    private transient ImageProcessorConfiguration f3422iT;

    /* renamed from: iU */
    private transient SourceServer f3423iU;
    /* access modifiers changed from: private */

    /* renamed from: iV */
    public transient List<WscIndexField> f3424iV;
    private transient String version = new String();

    public enum SourceServer {
        SERVER_KFS,
        SERVER_KTA,
        SERVER_NONE
    }

    public DocumentType clone() {
        try {
            DocumentType documentType = (DocumentType) super.clone();
            if (documentType.f3416aP != null) {
                documentType.f3416aP = documentType.f3416aP.clone();
            }
            if (documentType.f3417aQ != null) {
                documentType.f3417aQ = documentType.f3417aQ.clone();
            }
            if (documentType.f3422iT != null) {
                documentType.f3422iT = documentType.f3422iT.clone();
            }
            if (this.f3419iQ != null) {
                ArrayList arrayList = new ArrayList(documentType.f3419iQ.size());
                for (FieldType clone : this.f3419iQ) {
                    arrayList.add(clone.clone());
                }
                documentType.f3419iQ = arrayList;
            }
            if (this.f3424iV != null) {
                ArrayList arrayList2 = new ArrayList(documentType.f3424iV.size());
                for (WscIndexField clone2 : this.f3424iV) {
                    arrayList2.add(clone2.clone());
                }
                documentType.f3424iV = arrayList2;
            }
            return documentType;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("DocumentType: clone not supported exception");
        }
    }

    public DocumentType(List<FieldType> list) {
        Float valueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        this.f3420iR = valueOf;
        this.f3421iS = valueOf;
        this.f3416aP = null;
        this.f3417aQ = null;
        this.f3422iT = null;
        this.f3423iU = SourceServer.SERVER_NONE;
        this.f3424iV = null;
        this.f3419iQ = new ArrayList(list.size());
        for (FieldType clone : list) {
            this.f3419iQ.add(clone.clone());
        }
    }

    public String getTypeName() {
        return this.f3418iP;
    }

    public void setTypeName(String str) {
        if (str != null) {
            this.f3418iP = str;
            return;
        }
        throw new NullPointerException("setTypeName: typeName parameter is null");
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        if (str != null) {
            this.displayName = str;
            return;
        }
        throw new NullPointerException("setDisplayName: displayName parameter is null");
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        if (str != null) {
            this.version = str;
            return;
        }
        throw new NullPointerException("setVersion: version parameter is null");
    }

    public List<FieldType> getFieldTypes() {
        ArrayList arrayList = new ArrayList(this.f3419iQ.size());
        for (FieldType clone : this.f3419iQ) {
            arrayList.add(clone.clone());
        }
        return arrayList;
    }

    public float getDocWidth() {
        return this.f3420iR.floatValue();
    }

    public void setDocWidth(float f) {
        this.f3420iR = Float.valueOf(f);
    }

    public float getDocHeight() {
        return this.f3421iS.floatValue();
    }

    public void setDocHeight(float f) {
        this.f3421iS = Float.valueOf(f);
    }

    @Deprecated
    public ImagePerfectionProfile getImagePerfectionProfile() {
        return this.f3416aP;
    }

    @Deprecated
    public void setImagePerfectionProfile(ImagePerfectionProfile imagePerfectionProfile) {
        this.f3416aP = imagePerfectionProfile;
    }

    @Deprecated
    public BasicSettingsProfile getBasicSettingsProfile() {
        return this.f3417aQ;
    }

    @Deprecated
    public void setBasicSettingsProfile(BasicSettingsProfile basicSettingsProfile) {
        this.f3417aQ = basicSettingsProfile;
    }

    public ImageProcessorConfiguration getImageProcessorConfiguration() {
        return this.f3422iT;
    }

    public void setImageProcessorConfiguration(ImageProcessorConfiguration imageProcessorConfiguration) {
        this.f3422iT = imageProcessorConfiguration;
    }

    public SourceServer getSourceServer() {
        return this.f3423iU;
    }

    public void setSourceServer(SourceServer sourceServer) {
        this.f3423iU = sourceServer;
    }

    public class FriendDT {
        public FriendDT(String str) throws KmcException {
            if (!ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            }
        }

        public void setWscIndexFields(List<WscIndexField> list) {
            List unused = DocumentType.this.f3424iV = list;
        }

        public List<WscIndexField> getWscIndexFields() {
            ArrayList arrayList = new ArrayList(DocumentType.this.f3424iV.size());
            for (WscIndexField clone : DocumentType.this.f3424iV) {
                arrayList.add(clone.clone());
            }
            return DocumentType.this.f3424iV;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(DocumentType.class.getName());
        objectOutputStream.writeObject(KloVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f3418iP);
        objectOutputStream.writeObject(this.displayName);
        objectOutputStream.writeObject(this.version);
        objectOutputStream.writeObject(this.f3419iQ);
        objectOutputStream.writeObject(this.f3420iR);
        objectOutputStream.writeObject(this.f3421iS);
        objectOutputStream.writeObject(this.f3416aP);
        objectOutputStream.writeObject(this.f3417aQ);
        objectOutputStream.writeObject(this.f3422iT);
        objectOutputStream.writeObject(this.f3423iU);
        objectOutputStream.writeObject(this.f3424iV);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (DocumentType.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            String str = (String) objectInputStream.readObject();
            if (SdkVersion.versionCompatible(KloVersion.getPackageVersion(), str).booleanValue()) {
                this.f3418iP = (String) objectInputStream.readObject();
                this.displayName = (String) objectInputStream.readObject();
                this.version = (String) objectInputStream.readObject();
                this.f3419iQ = (ArrayList) objectInputStream.readObject();
                this.f3420iR = (Float) objectInputStream.readObject();
                this.f3421iS = (Float) objectInputStream.readObject();
                this.f3416aP = (ImagePerfectionProfile) objectInputStream.readObject();
                this.f3417aQ = (BasicSettingsProfile) objectInputStream.readObject();
                if (SdkVersion.versionCompatible(str, f3415iO).booleanValue()) {
                    this.f3422iT = (ImageProcessorConfiguration) objectInputStream.readObject();
                }
                this.f3423iU = (SourceServer) objectInputStream.readObject();
                this.f3424iV = (List) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

package com.kofax.kmc.ken.engines.data;

import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p040o.ModifyQuickTopUpReviewActivity;

@Deprecated
public class ImagePerfectionProfile implements Serializable, Cloneable {

    /* renamed from: dY */
    private static final String f274dY = "3.0.0.4.0.0";

    /* renamed from: dZ */
    private static final String f275dZ = "3.1.0.0.0.0";

    /* renamed from: ea */
    private static final String f276ea = "3.1.0.1.0.0";
    private static final long serialVersionUID = 1111562310791364351L;
    /* access modifiers changed from: private */

    /* renamed from: eb */
    public transient String f277eb = "";
    /* access modifiers changed from: private */

    /* renamed from: ec */
    public transient String f278ec = "";
    /* access modifiers changed from: private */

    /* renamed from: ed */
    public transient UseMRZPassportDetection f279ed = UseMRZPassportDetection.OFF;

    /* renamed from: ee */
    private transient UseTargetFrameCrop f280ee = UseTargetFrameCrop.OFF;

    /* renamed from: ef */
    private transient UseDocumentDetectionBasedCrop f281ef = UseDocumentDetectionBasedCrop.OFF;
    private transient String name = "";

    public enum UseDocumentDetectionBasedCrop {
        OFF,
        ON
    }

    public enum UseMRZPassportDetection {
        OFF,
        ON
    }

    public enum UseTargetFrameCrop {
        OFF,
        ON
    }

    public ImagePerfectionProfile clone() {
        try {
            return (ImagePerfectionProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("ImagePerfectionProfile: unexpected clone not supported exception");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        m276a(str, "name");
        this.name = str;
    }

    public String getIpOperations() {
        return this.f277eb;
    }

    public void setIpOperations(String str) {
        m276a(str, "ipOperations");
        this.f277eb = str;
    }

    public String getIpOperationsFilePath() {
        return this.f278ec;
    }

    public void setIpOperationsFilePath(String str) {
        m276a(str, "ipOperationsFilePath");
        this.f278ec = str;
    }

    public UseMRZPassportDetection getUseMRZPassportDetection() {
        return this.f279ed;
    }

    public void setUseMRZPassportDetection(UseMRZPassportDetection useMRZPassportDetection) {
        m276a(useMRZPassportDetection, "useMRZPassportDetection");
        this.f279ed = useMRZPassportDetection;
    }

    public UseTargetFrameCrop getUseTargetFrameCrop() {
        return this.f280ee;
    }

    public void setUseTargetFrameCrop(UseTargetFrameCrop useTargetFrameCrop) {
        m276a(useTargetFrameCrop, "useTargetFrameCrop");
        this.f280ee = useTargetFrameCrop;
    }

    public UseDocumentDetectionBasedCrop getUseDocumentDetectionBasedCrop() {
        return this.f281ef;
    }

    public void setUseDocumentDetectionBasedCrop(UseDocumentDetectionBasedCrop useDocumentDetectionBasedCrop) {
        m276a(this.f280ee, "useDocumentDetectionBasedCrop");
        this.f281ef = useDocumentDetectionBasedCrop;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(ImagePerfectionProfile.class.getName());
        objectOutputStream.writeObject(KenVersion.getPackageVersion());
        objectOutputStream.writeObject(this.name);
        objectOutputStream.writeObject(this.f277eb);
        objectOutputStream.writeObject(this.f278ec);
        objectOutputStream.writeObject(this.f279ed);
        objectOutputStream.writeObject(this.f280ee);
        objectOutputStream.writeObject(this.f281ef);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (ImagePerfectionProfile.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            String str = (String) objectInputStream.readObject();
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), str).booleanValue()) {
                this.name = (String) objectInputStream.readObject();
                this.f277eb = (String) objectInputStream.readObject();
                this.f278ec = (String) objectInputStream.readObject();
                if (SdkVersion.versionCompatible(str, f275dZ).booleanValue()) {
                    this.f279ed = (UseMRZPassportDetection) objectInputStream.readObject();
                }
                if (SdkVersion.versionCompatible(str, f274dY).booleanValue()) {
                    this.f280ee = (UseTargetFrameCrop) objectInputStream.readObject();
                }
                if (SdkVersion.versionCompatible(str, f276ea).booleanValue()) {
                    this.f281ef = (UseDocumentDetectionBasedCrop) objectInputStream.readObject();
                    return;
                }
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }

    public class FriendIPP {
        public FriendIPP(String str) throws KmcException {
            if (!ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            }
        }

        public String toFinalOpString() throws KmcException {
            String a = ImagePerfectionProfile.this.f277eb;
            String b = ImagePerfectionProfile.this.f278ec;
            if (ModifyQuickTopUpReviewActivity.write(a)) {
                if (ModifyQuickTopUpReviewActivity.write(b)) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_ED_IMAGE_PERFECTION_PROFILE_EMPTY);
                } else if (new File(b).exists()) {
                    if (a == null) {
                        a = "";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(a);
                    sb.append("_LoadOperationsStringTokensFromFile_<");
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(b);
                    String obj2 = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj2);
                    sb3.append(">");
                    a = sb3.toString();
                } else {
                    throw new KmcException(ErrorInfo.KMC_GN_FILE_NOT_FOUND);
                }
            }
            if (ImagePerfectionProfile.this.f279ed != UseMRZPassportDetection.ON) {
                return a;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a);
            sb4.append("_ProcessMrzDoc_");
            return sb4.toString();
        }
    }

    /* renamed from: a */
    private void m276a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" parameter is null");
            throw new NullPointerException(sb.toString());
        }
    }
}

package com.kofax.kmc.klo.logistics.data;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.kmc.ken.engines.ImageClassificationResult;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.klo.logistics.version.KloVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ClassificationResult implements Serializable, Cloneable {
    private static final long serialVersionUID = -5992761528618637831L;

    /* renamed from: ah */
    private transient String f3404ah = null;

    /* renamed from: aj */
    private transient Float f3405aj = Float.valueOf(BitmapDescriptorFactory.HUE_RED);

    public ClassificationResult(String str, float f) {
        this.f3404ah = str;
        this.f3405aj = Float.valueOf(f);
    }

    public ClassificationResult clone() {
        try {
            return (ClassificationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("ClassificationResult: unexpected clone not supported exception");
        }
    }

    public float getConfidence() {
        return this.f3405aj.floatValue();
    }

    public String getClassId() {
        return this.f3404ah;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(ClassificationResult.class.getName());
        objectOutputStream.writeObject(KloVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f3404ah);
        objectOutputStream.writeObject(this.f3405aj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        String name = ImageClassificationResult.class.getName();
        String name2 = ClassificationResult.class.getName();
        String str = (String) objectInputStream.readObject();
        if (name2.equalsIgnoreCase(str) || name.equalsIgnoreCase(str)) {
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.f3404ah = (String) objectInputStream.readObject();
                this.f3405aj = (Float) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

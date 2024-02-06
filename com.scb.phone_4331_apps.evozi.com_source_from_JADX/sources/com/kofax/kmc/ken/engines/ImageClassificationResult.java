package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@Deprecated
public class ImageClassificationResult implements Serializable {
    private static final long serialVersionUID = -5981021011261327362L;

    /* renamed from: ah */
    private transient String f3313ah = null;

    /* renamed from: ai */
    private transient Integer f3314ai = -1;

    /* renamed from: aj */
    private transient Float f3315aj = Float.valueOf(-5000.0f);

    public ImageClassificationResult() {
    }

    public ImageClassificationResult(String str, float f, int i) {
        this.f3313ah = str;
        this.f3314ai = Integer.valueOf(i);
        this.f3315aj = Float.valueOf(f);
    }

    public float getConfidence() {
        return this.f3315aj.floatValue();
    }

    public int getOrientation() {
        return this.f3314ai.intValue();
    }

    public String getClassId() {
        return this.f3313ah;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(ImageClassificationResult.class.getName());
        objectOutputStream.writeObject(KenVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f3313ah);
        objectOutputStream.writeObject(this.f3314ai);
        objectOutputStream.writeObject(this.f3315aj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (ImageClassificationResult.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.f3313ah = (String) objectInputStream.readObject();
                this.f3314ai = (Integer) objectInputStream.readObject();
                this.f3315aj = (Float) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

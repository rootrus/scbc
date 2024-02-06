package com.kofax.kmc.ken.engines.data;

import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BarCodeResult implements Serializable {
    private static final long serialVersionUID = 6885777831842993257L;

    /* renamed from: bU */
    private transient BarCodeType f166bU = BarCodeType.UNKNOWN;

    /* renamed from: bV */
    private transient BoundingTetragon f167bV;

    /* renamed from: bW */
    private transient BarCodeDirection f168bW = BarCodeDirection.UNKNOWN;

    /* renamed from: bX */
    private transient BarCodeDataFormat f169bX = BarCodeDataFormat.UNKNOWN;
    private transient String value;

    public BarCodeType getType() {
        return this.f166bU;
    }

    public void setType(BarCodeType barCodeType) {
        this.f166bU = barCodeType;
    }

    public BoundingTetragon getBoundingBox() {
        return this.f167bV;
    }

    public void setBoundingBox(BoundingTetragon boundingTetragon) {
        this.f167bV = boundingTetragon;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public BarCodeDirection getDirection() {
        return this.f168bW;
    }

    public void setDirection(BarCodeDirection barCodeDirection) {
        this.f168bW = barCodeDirection;
    }

    public BarCodeDataFormat getDataFormat() {
        return this.f169bX;
    }

    public void setDataFormat(BarCodeDataFormat barCodeDataFormat) {
        this.f169bX = barCodeDataFormat;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(BarCodeResult.class.getName());
        objectOutputStream.writeObject(KenVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f166bU);
        objectOutputStream.writeObject(this.f167bV);
        objectOutputStream.writeObject(this.value);
        objectOutputStream.writeObject(this.f168bW);
        objectOutputStream.writeObject(this.f169bX);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (BarCodeResult.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.f166bU = (BarCodeType) objectInputStream.readObject();
                this.f167bV = (BoundingTetragon) objectInputStream.readObject();
                this.value = (String) objectInputStream.readObject();
                this.f168bW = (BarCodeDirection) objectInputStream.readObject();
                this.f169bX = (BarCodeDataFormat) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

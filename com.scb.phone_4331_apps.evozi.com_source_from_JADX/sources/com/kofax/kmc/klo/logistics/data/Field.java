package com.kofax.kmc.klo.logistics.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kofax.kmc.klo.logistics.version.KloVersion;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.p079q.C8465b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Field implements Serializable, Cloneable {
    private static final String TAG = Field.class.getSimpleName();
    private static final long serialVersionUID = 8609833668015011166L;
    private transient IBus _bus;

    /* renamed from: iL */
    private transient String f3427iL = "";

    /* renamed from: iY */
    private transient FieldType f3428iY = null;

    /* renamed from: iZ */
    private transient String f3429iZ = new String();

    /* renamed from: ja */
    private transient Boolean f3430ja;
    private transient String tag = new String();
    private transient String value = new String();

    public Field clone() {
        try {
            return (Field) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("Field: unexpected clone not supported exception");
        }
    }

    public Field(FieldType fieldType) {
        m3755a(fieldType);
    }

    Field(FieldType fieldType, String str) {
        m3755a(fieldType);
        this.f3427iL = str;
    }

    public FieldType getFieldType() {
        FieldType fieldType = this.f3428iY;
        if (fieldType != null) {
            return fieldType.clone();
        }
        return null;
    }

    public String getValue() {
        return this.value;
    }

    public Boolean isValid() {
        return this.f3430ja;
    }

    public String getErrorDescription() {
        return this.f3429iZ;
    }

    public void setTag(String str) {
        m3756a(str, "tag");
        this.tag = str;
    }

    public String getTag() {
        return this.tag;
    }

    public void updateFieldProperties(String str, boolean z, String str2) {
        m3756a(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        m3756a(str2, "errorDescription");
        this.f3430ja = Boolean.valueOf(z);
        this.f3429iZ = str2;
        m3757k(str);
    }

    /* renamed from: a */
    private void m3755a(FieldType fieldType) {
        this.value = "";
        this.f3430ja = Boolean.TRUE;
        this.f3429iZ = "";
        this.tag = "";
        this.f3428iY = fieldType.clone();
        this._bus = Injector.getInjector(AppContextProvider.getContext()).getIBus();
    }

    /* renamed from: a */
    private void m3756a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" parameter is null");
            throw new NullPointerException(sb.toString());
        } else if (obj.getClass().getSimpleName().equals("Integer") && ((Integer) obj).intValue() < 0) {
            ErrorInfo errorInfo = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("'");
            sb2.append(str);
            sb2.append("' parameter is negative");
            errorInfo.setErrCause(sb2.toString());
            throw new KmcRuntimeException(errorInfo);
        }
    }

    /* renamed from: k */
    private void m3757k(String str) {
        m3756a(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C0767k.m1807c(TAG, "FieldChangedEvent::setValue");
        String str2 = this.value;
        this.value = str;
        this._bus.post(new C8465b(this.f3427iL, this, str2));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(Field.class.getName());
        objectOutputStream.writeObject(KloVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f3428iY);
        objectOutputStream.writeObject(this.f3429iZ);
        objectOutputStream.writeObject(this.f3430ja);
        objectOutputStream.writeObject(this.value);
        objectOutputStream.writeObject(this.tag);
        objectOutputStream.writeObject(this.f3427iL);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (Field.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KloVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.f3428iY = (FieldType) objectInputStream.readObject();
                this.f3429iZ = (String) objectInputStream.readObject();
                this.f3430ja = (Boolean) objectInputStream.readObject();
                this.value = (String) objectInputStream.readObject();
                this.tag = (String) objectInputStream.readObject();
                this.f3427iL = (String) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

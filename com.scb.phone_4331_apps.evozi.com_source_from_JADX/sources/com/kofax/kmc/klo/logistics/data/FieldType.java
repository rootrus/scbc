package com.kofax.kmc.klo.logistics.data;

import com.kofax.kmc.klo.logistics.version.KloVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;

public class FieldType implements Serializable, Cloneable {
    private static final long serialVersionUID = 3723273543893332115L;
    private transient String displayName;

    /* renamed from: jb */
    private transient Boolean f3431jb;

    /* renamed from: jc */
    private transient DataType f3432jc;

    /* renamed from: jd */
    private transient Boolean f3433jd;

    /* renamed from: je */
    private transient Boolean f3434je;

    /* renamed from: jf */
    private transient String[] f3435jf;

    /* renamed from: jg */
    private transient Boolean f3436jg;

    /* renamed from: jh */
    private transient String f3437jh;

    /* renamed from: ji */
    private transient String f3438ji;
    private transient String label;
    private transient String max;
    private transient String min;
    private transient String name;

    public enum DataType {
        STRING,
        INT,
        FLOAT,
        BOOL,
        DATE,
        EMAIL,
        URL
    }

    public FieldType clone() {
        try {
            return (FieldType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("FieldType: unexpected clone not supported exception");
        }
    }

    public FieldType() {
        this.name = new String();
        this.displayName = new String();
        this.label = new String();
        this.min = new String();
        this.max = new String();
        this.f3437jh = new String();
        this.f3438ji = new String();
        this.name = "";
        this.displayName = "";
        this.label = "";
        Boolean bool = Boolean.FALSE;
        this.f3431jb = bool;
        this.f3432jc = DataType.STRING;
        this.f3433jd = bool;
        this.f3434je = bool;
        this.f3435jf = null;
        this.f3436jg = Boolean.TRUE;
        this.min = "";
        this.max = "";
        this.f3437jh = "";
        this.f3438ji = "";
    }

    public void setName(String str) {
        m3758a(str, "name");
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public void setDisplayName(String str) {
        m3758a(str, "displayName");
        this.displayName = str;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setLabel(String str) {
        m3758a(str, "label");
        this.label = str;
    }

    public String getLabel() {
        return this.label;
    }

    public void setRequired(Boolean bool) {
        this.f3431jb = bool;
    }

    public boolean isRequired() {
        return this.f3431jb.booleanValue();
    }

    public void setDataType(DataType dataType) {
        this.f3432jc = dataType;
    }

    public DataType getDataType() {
        return this.f3432jc;
    }

    public void setHidden(Boolean bool) {
        this.f3433jd = bool;
    }

    public boolean isHidden() {
        return this.f3433jd.booleanValue();
    }

    public void setReadOnly(Boolean bool) {
        this.f3434je = bool;
    }

    public boolean isReadOnly() {
        return this.f3434je.booleanValue();
    }

    public void setOptions(String[] strArr) {
        m3758a(strArr, "options");
        this.f3435jf = new String[strArr.length];
        this.f3435jf = strArr;
    }

    public String[] getOptions() {
        return this.f3435jf;
    }

    public void setForceMatch(Boolean bool) {
        this.f3436jg = bool;
    }

    public boolean isForceMatch() {
        return this.f3436jg.booleanValue();
    }

    public void setMin(String str) {
        m3758a(str, "min");
        this.min = str;
    }

    public String getMin() {
        return this.min;
    }

    public void setMax(String str) {
        m3758a(str, "max");
        this.max = str;
    }

    public String getMax() {
        return this.max;
    }

    public void setDefault(String str) {
        m3758a(str, FragmentBuilder_BindEasycashReferralSendDfwFragment.DEFAULT_IDENTIFIER);
        this.f3437jh = str;
    }

    public String getDefault() {
        return this.f3437jh;
    }

    public void setCustomTag(String str) {
        m3758a(str, "customTag");
        this.f3438ji = str;
    }

    public String getCustomTag() {
        return this.f3438ji;
    }

    /* renamed from: a */
    private void m3758a(Object obj, String str) {
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

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(FieldType.class.getName());
        objectOutputStream.writeObject(KloVersion.getPackageVersion());
        objectOutputStream.writeObject(this.name);
        objectOutputStream.writeObject(this.displayName);
        objectOutputStream.writeObject(this.label);
        objectOutputStream.writeObject(this.f3431jb);
        objectOutputStream.writeObject(this.f3432jc);
        objectOutputStream.writeObject(this.f3433jd);
        objectOutputStream.writeObject(this.f3434je);
        objectOutputStream.writeObject(this.f3435jf);
        objectOutputStream.writeObject(this.f3436jg);
        objectOutputStream.writeObject(this.min);
        objectOutputStream.writeObject(this.max);
        objectOutputStream.writeObject(this.f3437jh);
        objectOutputStream.writeObject(this.f3438ji);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (FieldType.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KloVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.name = (String) objectInputStream.readObject();
                this.displayName = (String) objectInputStream.readObject();
                this.label = (String) objectInputStream.readObject();
                this.f3431jb = (Boolean) objectInputStream.readObject();
                this.f3432jc = (DataType) objectInputStream.readObject();
                this.f3433jd = (Boolean) objectInputStream.readObject();
                this.f3434je = (Boolean) objectInputStream.readObject();
                this.f3435jf = (String[]) objectInputStream.readObject();
                this.f3436jg = (Boolean) objectInputStream.readObject();
                this.min = (String) objectInputStream.readObject();
                this.max = (String) objectInputStream.readObject();
                this.f3437jh = (String) objectInputStream.readObject();
                this.f3438ji = (String) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

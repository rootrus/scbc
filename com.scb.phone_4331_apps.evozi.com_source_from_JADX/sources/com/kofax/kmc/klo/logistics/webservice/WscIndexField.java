package com.kofax.kmc.klo.logistics.webservice;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import com.kofax.kmc.klo.logistics.version.KloVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class WscIndexField extends KofaxWebServiceObjectBase implements Serializable, Cloneable {
    private static final String TAG = WscIndexField.class.getSimpleName();
    private static final long serialVersionUID = 4705811951869805523L;
    private transient boolean batchClassIndexField;
    private transient String dataType;
    private transient String displayName;
    private transient boolean documentClassIndexField;
    private transient boolean forceMatch;
    private transient boolean hidden;
    private transient String isBatchClassIndexFieldString;
    private transient String isDocumentClassIndexFieldString;
    private transient boolean masked;
    private transient String max;
    private transient String min;
    private transient String name;
    private transient List<String> options = new ArrayList();
    private transient boolean required;
    private transient String scale;
    private transient String value;
    private transient String width;

    public WscIndexField clone() {
        try {
            WscIndexField wscIndexField = (WscIndexField) super.clone();
            wscIndexField.options = new ArrayList(this.options);
            return wscIndexField;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("WscIndexField: clone not supported exception");
        }
    }

    public boolean isBatchClassIndexField() {
        return this.batchClassIndexField;
    }

    public void setBatchClassIndexField(boolean z) {
        this.batchClassIndexField = z;
    }

    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public boolean isDocumentClassIndexField() {
        return this.documentClassIndexField;
    }

    public void setDocumentClassIndexField(boolean z) {
        this.documentClassIndexField = z;
    }

    public boolean isForceMatch() {
        return this.forceMatch;
    }

    public void setForceMatch(boolean z) {
        this.forceMatch = z;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public void setHidden(boolean z) {
        this.hidden = z;
    }

    public String getIsBatchClassIndexFieldString() {
        return this.isBatchClassIndexFieldString;
    }

    public void setIsBatchClassIndexFieldString(String str) {
        this.isBatchClassIndexFieldString = str;
    }

    public String getIsDocumentClassIndexFieldString() {
        return this.isDocumentClassIndexFieldString;
    }

    public void setIsDocumentClassIndexFieldString(String str) {
        this.isDocumentClassIndexFieldString = str;
    }

    public boolean isMasked() {
        return this.masked;
    }

    public void setMasked(boolean z) {
        this.masked = z;
    }

    public String getMax() {
        return this.max;
    }

    public void setMax(String str) {
        this.max = str;
    }

    public String getMin() {
        return this.min;
    }

    public void setMin(String str) {
        this.min = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public List<String> getOptions() {
        return this.options;
    }

    public void setOptions(List<String> list) {
        this.options = list;
    }

    public boolean isRequired() {
        return this.required;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public String getScale() {
        return this.scale;
    }

    public void setScale(String str) {
        this.scale = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String getWidth() {
        return this.width;
    }

    public void setWidth(String str) {
        this.width = str;
    }

    public static WscIndexField populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        WscIndexField wscIndexField = new WscIndexField();
        wscIndexField.setBatchClassIndexField("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "batchClassIndexField", "false")));
        wscIndexField.setDataType(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "dataType", "string"));
        wscIndexField.setDisplayName(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "displayName", ""));
        wscIndexField.setDocumentClassIndexField("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "documentClassIndexField", "false")));
        wscIndexField.setForceMatch("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "forceMatch", "false")));
        wscIndexField.setHidden("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "hidden", "false")));
        wscIndexField.setIsBatchClassIndexFieldString(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "isBatchClassIndexFieldString", ""));
        wscIndexField.setIsDocumentClassIndexFieldString(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "isDocumentClassIndexFieldString", ""));
        wscIndexField.setMasked("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "masked", "false")));
        wscIndexField.setMax(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "max", ""));
        wscIndexField.setMin(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "min", ""));
        wscIndexField.setName(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "name", ""));
        wscIndexField.setRequired("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "required", "false")));
        wscIndexField.setScale(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "scale", ""));
        wscIndexField.setValue(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, AppMeasurementSdk.ConditionalUserProperty.VALUE, ""));
        wscIndexField.setWidth(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, RttiJsonExactionHelper.WIDTH, ""));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < accountHeaderViewHolder_ViewBinding.getPropertyCount(); i++) {
            AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
            accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, accountRemarkViewHolder);
            if (accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver() != null && accountRemarkViewHolder.f5805x50fd9e4a.equals("options")) {
                arrayList.add(accountHeaderViewHolder_ViewBinding.getProperty(i).toString());
            }
        }
        wscIndexField.setOptions(arrayList);
        return wscIndexField;
    }

    public AccountHeaderViewHolder_ViewBinding toSoapObject(String str, String str2) {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str, str2);
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "batchClassIndexField", Boolean.valueOf(isBatchClassIndexField()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "dataType", getDataType(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "displayName", getDisplayName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "documentClassIndexField", Boolean.valueOf(isDocumentClassIndexField()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "forceMatch", Boolean.valueOf(isForceMatch()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "hidden", Boolean.valueOf(isHidden()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "isBatchClassIndexFieldString", getIsBatchClassIndexFieldString(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "isDocumentClassIndexFieldString", getIsDocumentClassIndexFieldString(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "masked", Boolean.valueOf(isMasked()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "max", getMax(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "min", getMin(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "name", getName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "required", Boolean.valueOf(isRequired()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "scale", getScale(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, AppMeasurementSdk.ConditionalUserProperty.VALUE, getValue(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, RttiJsonExactionHelper.WIDTH, getWidth(), AccountRemarkViewHolder.MediaDescriptionCompat));
        return accountHeaderViewHolder_ViewBinding;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(WscIndexField.class.getName());
        objectOutputStream.writeObject(KloVersion.getPackageVersion());
        objectOutputStream.writeObject(Boolean.valueOf(this.batchClassIndexField));
        objectOutputStream.writeObject(this.dataType);
        objectOutputStream.writeObject(this.displayName);
        objectOutputStream.writeObject(Boolean.valueOf(this.documentClassIndexField));
        objectOutputStream.writeObject(Boolean.valueOf(this.forceMatch));
        objectOutputStream.writeObject(Boolean.valueOf(this.hidden));
        objectOutputStream.writeObject(this.isBatchClassIndexFieldString);
        objectOutputStream.writeObject(this.isDocumentClassIndexFieldString);
        objectOutputStream.writeObject(Boolean.valueOf(this.masked));
        objectOutputStream.writeObject(this.max);
        objectOutputStream.writeObject(this.min);
        objectOutputStream.writeObject(this.name);
        objectOutputStream.writeObject(this.options);
        objectOutputStream.writeObject(Boolean.valueOf(this.required));
        objectOutputStream.writeObject(this.scale);
        objectOutputStream.writeObject(this.value);
        objectOutputStream.writeObject(this.width);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (WscIndexField.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KloVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.batchClassIndexField = ((Boolean) objectInputStream.readObject()).booleanValue();
                this.dataType = (String) objectInputStream.readObject();
                this.displayName = (String) objectInputStream.readObject();
                this.documentClassIndexField = ((Boolean) objectInputStream.readObject()).booleanValue();
                this.forceMatch = ((Boolean) objectInputStream.readObject()).booleanValue();
                this.hidden = ((Boolean) objectInputStream.readObject()).booleanValue();
                this.isBatchClassIndexFieldString = (String) objectInputStream.readObject();
                this.isDocumentClassIndexFieldString = (String) objectInputStream.readObject();
                this.masked = ((Boolean) objectInputStream.readObject()).booleanValue();
                this.max = (String) objectInputStream.readObject();
                this.min = (String) objectInputStream.readObject();
                this.name = (String) objectInputStream.readObject();
                this.options = (List) objectInputStream.readObject();
                this.required = ((Boolean) objectInputStream.readObject()).booleanValue();
                this.scale = (String) objectInputStream.readObject();
                this.value = (String) objectInputStream.readObject();
                this.width = (String) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }
}

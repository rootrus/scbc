package com.kofax.kmc.klo.logistics.webservice;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class WscDestination extends KofaxWebServiceObjectBase {
    private String backendId;
    private byte backendType;
    private String dataStoreName;
    private String displayValue;
    private String formTypeId;
    private String iconType;

    /* renamed from: id */
    private String f3459id;
    private List<WscIndexField> indexFields = new ArrayList();
    private String shortcutName;
    private int shortcutTypeOrdinal;
    private boolean showNotificationDialog;
    private String value;

    public String getBackendId() {
        return this.backendId;
    }

    public void setBackendId(String str) {
        this.backendId = str;
    }

    public byte getBackendType() {
        return this.backendType;
    }

    public void setBackendType(byte b) {
        this.backendType = b;
    }

    public String getDataStoreName() {
        return this.dataStoreName;
    }

    public void setDataStoreName(String str) {
        this.dataStoreName = str;
    }

    public String getDisplayValue() {
        return this.displayValue;
    }

    public void setDisplayValue(String str) {
        this.displayValue = str;
    }

    public String getFormTypeId() {
        return this.formTypeId;
    }

    public void setFormTypeId(String str) {
        this.formTypeId = str;
    }

    public String getIconType() {
        return this.iconType;
    }

    public void setIconType(String str) {
        this.iconType = str;
    }

    public String getId() {
        return this.f3459id;
    }

    public void setId(String str) {
        this.f3459id = str;
    }

    public String getShortcutName() {
        return this.shortcutName;
    }

    public void setShortcutName(String str) {
        this.shortcutName = str;
    }

    public int getShortcutTypeOrdinal() {
        return this.shortcutTypeOrdinal;
    }

    public void setShortcutTypeOrdinal(int i) {
        this.shortcutTypeOrdinal = i;
    }

    public boolean isShowNotificationDialog() {
        return this.showNotificationDialog;
    }

    public void setShowNotificationDialog(boolean z) {
        this.showNotificationDialog = z;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public List<WscIndexField> getIndexFields() {
        return this.indexFields;
    }

    public void setIndexFields(List<WscIndexField> list) {
        this.indexFields = list;
    }

    public static WscDestination populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        WscDestination wscDestination = new WscDestination();
        wscDestination.setBackendId(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "backendId", (String) null));
        wscDestination.setBackendType(Byte.parseByte(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "backendType", (String) null)));
        wscDestination.setDataStoreName(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "dataStoreName", (String) null));
        wscDestination.setDisplayValue(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "displayValue", (String) null));
        wscDestination.setFormTypeId(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "formTypeId", (String) null));
        wscDestination.setIconType(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "iconType", (String) null));
        wscDestination.setId(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, Name.MARK, (String) null));
        wscDestination.setShortcutName(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "shortcutName", (String) null));
        wscDestination.setShortcutTypeOrdinal(Integer.parseInt(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "shortcutTypeOrdinal", (String) null)));
        wscDestination.setShowNotificationDialog("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "showNotificationDialog", (String) null)));
        wscDestination.setValue(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) null));
        for (int i = 0; i < accountHeaderViewHolder_ViewBinding.getPropertyCount(); i++) {
            AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
            accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, accountRemarkViewHolder);
            if (accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver() != null && accountRemarkViewHolder.f5805x50fd9e4a.equals("indexFields")) {
                wscDestination.indexFields.add(WscIndexField.populateFromResponse((AccountHeaderViewHolder_ViewBinding) accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver()));
            }
        }
        return wscDestination;
    }

    public AccountHeaderViewHolder_ViewBinding toSoapObject(String str, String str2, String str3) {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str, str2);
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "backendId", getBackendId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "backendType", Byte.valueOf(getBackendType()), Byte.class));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "dataStoreName", getDataStoreName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "displayValue", getDisplayValue(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "formTypeId", getFormTypeId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "iconType", getIconType(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, Name.MARK, getId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        for (WscIndexField soapObject : this.indexFields) {
            accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(soapObject.toSoapObject("http://util.wsc.des.kofax.com/xsd", "indexFields"));
        }
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "shortcutName", getShortcutName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "shortcutTypeOrdinal", Integer.valueOf(getShortcutTypeOrdinal()), AccountRemarkViewHolder.read));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "showNotificationDialog", Boolean.valueOf(isShowNotificationDialog()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, AppMeasurementSdk.ConditionalUserProperty.VALUE, getValue(), AccountRemarkViewHolder.MediaDescriptionCompat));
        return accountHeaderViewHolder_ViewBinding;
    }
}

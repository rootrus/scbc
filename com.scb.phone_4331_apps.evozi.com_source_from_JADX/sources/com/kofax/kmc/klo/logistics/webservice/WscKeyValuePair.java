package com.kofax.kmc.klo.logistics.webservice;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Hashtable;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class WscKeyValuePair extends KofaxWebServiceObjectBase {
    public static final int PROPERTY_COUNT = 2;
    private String key;
    private String value;

    public interface FIELD_INDEXES {
        public static final int IDX_KEY = 0;
        public static final int IDX_VALUE = 1;
    }

    public int getPropertyCount() {
        return 2;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Object getProperty(int i) {
        if (i == 0) {
            return getKey();
        }
        if (i != 1) {
            return null;
        }
        return getValue();
    }

    public void getPropertyInfo(int i, Hashtable hashtable, AccountRemarkViewHolder accountRemarkViewHolder) {
        if (i == 0) {
            accountRemarkViewHolder.f5805x50fd9e4a = "key";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 1) {
            accountRemarkViewHolder.f5805x50fd9e4a = AppMeasurementSdk.ConditionalUserProperty.VALUE;
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        }
        accountRemarkViewHolder.write(getProperty(i));
    }

    public void setProperty(int i, Object obj) {
        String obj2 = obj != null ? obj.toString() : "";
        if (i == 0) {
            setKey(obj2);
        } else if (i == 1) {
            setValue(obj2);
        }
    }

    /* access modifiers changed from: protected */
    public void initialize(String str, String str2) {
        setKey(str);
        setValue(str2);
    }

    public static WscKeyValuePair initializeRequest(String str, String str2) {
        WscKeyValuePair wscKeyValuePair = new WscKeyValuePair();
        wscKeyValuePair.initialize(str, str2);
        return wscKeyValuePair;
    }

    public AccountHeaderViewHolder_ViewBinding toSoapObject(String str, String str2, String str3) {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str, str2);
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, "key", getKey(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str3, AppMeasurementSdk.ConditionalUserProperty.VALUE, getValue(), AccountRemarkViewHolder.MediaDescriptionCompat));
        return accountHeaderViewHolder_ViewBinding;
    }
}

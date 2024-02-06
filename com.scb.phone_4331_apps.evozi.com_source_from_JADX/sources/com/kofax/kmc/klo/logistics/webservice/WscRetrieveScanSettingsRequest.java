package com.kofax.kmc.klo.logistics.webservice;

import java.util.Hashtable;
import p040o.AccountRemarkViewHolder;

public class WscRetrieveScanSettingsRequest extends WscRequest {
    public static final int PROPERTY_COUNT = 2;
    private String shortcutName;
    private String shortcutTypeOrdinal;

    public interface FIELD_INDEXES {
        public static final int IDX_SHORTCUT_NAME = 0;
        public static final int IDX_SHORTCUT_TYPE_ORDINAL = 1;
    }

    public String getShortcutName() {
        return this.shortcutName;
    }

    public void setShortcutName(String str) {
        this.shortcutName = str;
    }

    public String getShortcutTypeOrdinal() {
        return this.shortcutTypeOrdinal;
    }

    public void setShortcutTypeOrdinal(String str) {
        this.shortcutTypeOrdinal = str;
    }

    private void initBaseFields(WscRetrieveScanSettingsRequest wscRetrieveScanSettingsRequest) {
        super.initialize();
    }

    public static WscRetrieveScanSettingsRequest initializeRequest(WscDestination wscDestination, String str, String str2) {
        WscRetrieveScanSettingsRequest wscRetrieveScanSettingsRequest = new WscRetrieveScanSettingsRequest();
        wscRetrieveScanSettingsRequest.setShortcutName(wscDestination.getShortcutName());
        wscRetrieveScanSettingsRequest.setShortcutTypeOrdinal(String.valueOf(wscDestination.getShortcutTypeOrdinal()));
        wscRetrieveScanSettingsRequest.setUserName(str);
        wscRetrieveScanSettingsRequest.setPassword(str2);
        wscRetrieveScanSettingsRequest.initBaseFields(wscRetrieveScanSettingsRequest);
        return wscRetrieveScanSettingsRequest;
    }

    public int getPropertyCount() {
        return super.getPropertyCount() + 2;
    }

    public Object getProperty(int i) {
        if (i >= 2) {
            return super.getProperty(i - 2);
        }
        if (i == 0) {
            return getShortcutName();
        }
        if (i != 1) {
            return null;
        }
        return getShortcutTypeOrdinal();
    }

    public void getPropertyInfo(int i, Hashtable hashtable, AccountRemarkViewHolder accountRemarkViewHolder) {
        if (i >= 2) {
            super.getPropertyInfo(i - 2, hashtable, accountRemarkViewHolder);
        } else if (i == 0) {
            accountRemarkViewHolder.f5805x50fd9e4a = "shortcutName";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 1) {
            accountRemarkViewHolder.f5805x50fd9e4a = "shortcutTypeOrdinal";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        }
        accountRemarkViewHolder.write(getProperty(i));
    }

    public void setProperty(int i, Object obj) {
        if (i < 2) {
            String obj2 = obj != null ? obj.toString() : "";
            if (i == 0) {
                setShortcutName(obj2);
            } else if (i == 1) {
                setShortcutTypeOrdinal(obj2);
            }
        } else {
            super.setProperty(i - 2, obj);
        }
    }
}

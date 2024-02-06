package com.kofax.kmc.klo.logistics.webservice;

import java.util.Hashtable;
import p040o.AccountRemarkViewHolder;

public class WscIndexFieldsRequest extends WscRequest {
    public static final int PROPERTY_COUNT = 5;
    private String backendId;
    private String dataStoreName;
    private String formTypeId;
    private String shortcutName;
    private int shortcutTypeOrdinal;

    public interface FIELD_INDEXES {
        public static final int IDX_BACKEND_ID = 0;
        public static final int IDX_DATASTORE_NAME = 1;
        public static final int IDX_FORM_TYPE_ID = 2;
        public static final int IDX_SHORTCUT_NAME = 3;
        public static final int IDX_SHORTCUT_TYPE_ORDINAL = 4;
    }

    public String getBackendId() {
        return this.backendId;
    }

    public void setBackendId(String str) {
        this.backendId = str;
    }

    public String getDataStoreName() {
        return this.dataStoreName;
    }

    public void setDataStoreName(String str) {
        this.dataStoreName = str;
    }

    public String getFormTypeId() {
        return this.formTypeId;
    }

    public void setFormTypeId(String str) {
        this.formTypeId = str;
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

    private void initialize(WscDestination wscDestination) {
        super.initialize();
        setBackendId(wscDestination.getBackendId());
        setDataStoreName(wscDestination.getDataStoreName());
        setFormTypeId(wscDestination.getFormTypeId());
        setShortcutName(wscDestination.getShortcutName());
        setShortcutTypeOrdinal(wscDestination.getShortcutTypeOrdinal());
    }

    public static WscIndexFieldsRequest initializeRequest(WscDestination wscDestination, String str, String str2) {
        WscIndexFieldsRequest wscIndexFieldsRequest = new WscIndexFieldsRequest();
        wscIndexFieldsRequest.setUserName(str);
        wscIndexFieldsRequest.setPassword(str2);
        wscIndexFieldsRequest.initialize(wscDestination);
        return wscIndexFieldsRequest;
    }

    public int getPropertyCount() {
        return super.getPropertyCount() + 5;
    }

    public Object getProperty(int i) {
        if (i >= 5) {
            return super.getProperty(i - 5);
        }
        if (i == 0) {
            return getBackendId();
        }
        if (i == 1) {
            return getDataStoreName();
        }
        if (i == 2) {
            return getFormTypeId();
        }
        if (i == 3) {
            return getShortcutName();
        }
        if (i != 4) {
            return null;
        }
        return Integer.valueOf(getShortcutTypeOrdinal());
    }

    public void getPropertyInfo(int i, Hashtable hashtable, AccountRemarkViewHolder accountRemarkViewHolder) {
        if (i >= 5) {
            super.getPropertyInfo(i - 5, hashtable, accountRemarkViewHolder);
        } else if (i == 0) {
            accountRemarkViewHolder.f5805x50fd9e4a = "backendId";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 1) {
            accountRemarkViewHolder.f5805x50fd9e4a = "dataStoreName";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 2) {
            accountRemarkViewHolder.f5805x50fd9e4a = "formTypeId";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 3) {
            accountRemarkViewHolder.f5805x50fd9e4a = "shortcutName";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 4) {
            accountRemarkViewHolder.f5805x50fd9e4a = "shortcutTypeOrdinal";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.read;
        }
        accountRemarkViewHolder.write(getProperty(i));
    }

    public void setProperty(int i, Object obj) {
        String str;
        if (i < 5) {
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
            if (i == 0) {
                setBackendId(str);
            } else if (i == 1) {
                setDataStoreName(str);
            } else if (i == 2) {
                setFormTypeId(str);
            } else if (i == 3) {
                setShortcutName(str);
            } else if (i == 4) {
                setShortcutTypeOrdinal(getIntFromValue(str, 0));
            }
        } else {
            super.setProperty(i - 5, obj);
        }
    }
}

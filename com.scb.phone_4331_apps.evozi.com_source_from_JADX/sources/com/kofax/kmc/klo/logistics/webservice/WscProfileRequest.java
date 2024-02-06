package com.kofax.kmc.klo.logistics.webservice;

import java.util.Hashtable;
import p040o.AccountRemarkViewHolder;

public class WscProfileRequest extends WscRequest {
    public static final int PROPERTY_COUNT = 1;
    private String wscClientId;

    public interface PROFILE_INDEXES {
        public static final int PROFILE_CLIENT_ID = 0;
    }

    public String getWscClientId() {
        return this.wscClientId;
    }

    public void setWscClientId(String str) {
        this.wscClientId = str;
    }

    private void initialize(String str) {
        super.initialize();
        setWscClientId(str);
    }

    public static WscProfileRequest initializeRequest(String str) {
        WscProfileRequest wscProfileRequest = new WscProfileRequest();
        wscProfileRequest.initialize(str);
        return wscProfileRequest;
    }

    public int getPropertyCount() {
        return super.getPropertyCount() + 1;
    }

    public Object getProperty(int i) {
        if (i > 0) {
            return super.getProperty(i - 1);
        }
        if (i != 0) {
            return null;
        }
        return getWscClientId();
    }

    public void getPropertyInfo(int i, Hashtable hashtable, AccountRemarkViewHolder accountRemarkViewHolder) {
        if (i > 0) {
            super.getPropertyInfo(i - 1, hashtable, accountRemarkViewHolder);
        } else if (i == 0) {
            accountRemarkViewHolder.f5805x50fd9e4a = "wscClientId";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        }
        accountRemarkViewHolder.write(getProperty(i));
    }

    public void setProperty(int i, Object obj) {
        if (i <= 0) {
            String obj2 = obj != null ? obj.toString() : "";
            if (i == 0) {
                setWscClientId(obj2);
                return;
            }
            return;
        }
        super.setProperty(i - 1, obj);
    }
}

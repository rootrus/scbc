package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.NetworkService;
import java.util.Hashtable;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class WscRequest extends KofaxWebServiceObjectBase {
    public static final int PROPERTY_COUNT = 4;
    private String encryptedPassword;
    private String jobId;
    private String password;
    private String userName;
    private String wscClientId;
    private String wscClientIp;

    public interface FIELD_INDEXES {
        public static final int IDX_CLIENT_ID = 2;
        public static final int IDX_CLIENT_IP = 5;
        public static final int IDX_ENC_PW = 4;
        public static final int IDX_JOB_ID = 3;
        public static final int IDX_PW = 1;
        public static final int IDX_USERNAME = 0;
    }

    public int getPropertyCount() {
        return 4;
    }

    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public void setEncryptedPassword(String str) {
        this.encryptedPassword = str;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String str) {
        this.jobId = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String getWscClientId() {
        return this.wscClientId;
    }

    public void setWscClientId(String str) {
        this.wscClientId = str;
    }

    public String getWscClientIp() {
        return this.wscClientIp;
    }

    public void setWscClientIp(String str) {
        this.wscClientIp = str;
    }

    public Object getProperty(int i) {
        if (i == 0) {
            return getUserName();
        }
        if (i == 1) {
            return getPassword();
        }
        if (i == 2) {
            return getWscClientId();
        }
        if (i == 3) {
            return getJobId();
        }
        if (i == 4) {
            return getEncryptedPassword();
        }
        if (i != 5) {
            return null;
        }
        return getWscClientIp();
    }

    public void getPropertyInfo(int i, Hashtable hashtable, AccountRemarkViewHolder accountRemarkViewHolder) {
        if (i == 0) {
            accountRemarkViewHolder.f5805x50fd9e4a = "userName";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 1) {
            accountRemarkViewHolder.f5805x50fd9e4a = "password";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 2) {
            accountRemarkViewHolder.f5805x50fd9e4a = "wscClientId";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 3) {
            accountRemarkViewHolder.f5805x50fd9e4a = "jobId";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 4) {
            accountRemarkViewHolder.f5805x50fd9e4a = "encryptedPassword";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        } else if (i == 5) {
            accountRemarkViewHolder.f5805x50fd9e4a = "wscClientIp";
            accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountRemarkViewHolder.MediaDescriptionCompat;
        }
        accountRemarkViewHolder.write(getProperty(i));
    }

    public void setProperty(int i, Object obj) {
        String obj2 = obj != null ? obj.toString() : "";
        if (i == 0) {
            setUserName(obj2);
        } else if (i == 1) {
            setPassword(obj2);
        } else if (i == 2) {
            setWscClientId(obj2);
        } else if (i == 3) {
            setJobId(obj2);
        } else if (i == 4) {
            setEncryptedPassword(obj2);
        } else if (i == 5) {
            setWscClientIp(obj2);
        }
    }

    public AccountHeaderViewHolder_ViewBinding toSoapObject(String str, String str2) {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str, str2);
        toSoapObject(accountHeaderViewHolder_ViewBinding, str);
        return accountHeaderViewHolder_ViewBinding;
    }

    public void toSoapObject(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding, String str) {
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "encryptedPassword", getEncryptedPassword(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "jobId", getJobId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "password", getPassword(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "userName", getUserName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "wscClientId", getWscClientId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "wscClientIp", getWscClientIp(), AccountRemarkViewHolder.MediaDescriptionCompat));
    }

    public boolean initialize() {
        setWscClientId(NetworkService.getSystemIdentifier());
        setUserName(this.userName);
        setPassword(this.password);
        return true;
    }

    public static WscRequest initializeRequest() {
        WscRequest wscRequest = new WscRequest();
        wscRequest.initialize();
        return wscRequest;
    }
}

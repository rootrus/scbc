package com.kofax.kmc.klo.logistics.webservice;

import java.util.Hashtable;
import p040o.AccountRemarkViewHolder;
import p040o.C10410xd06cdadd;

public abstract class KofaxWebServiceObjectBase implements C10410xd06cdadd {
    public Object getProperty(int i) {
        return null;
    }

    public int getPropertyCount() {
        return 0;
    }

    public void getPropertyInfo(int i, Hashtable hashtable, AccountRemarkViewHolder accountRemarkViewHolder) {
    }

    public void setProperty(int i, Object obj) {
    }

    protected KofaxWebServiceObjectBase() {
    }

    public AccountRemarkViewHolder createPropertyInfo(String str, String str2, Object obj, Class cls) {
        return generatePropertyInfo(str, str2, obj, cls);
    }

    public static AccountRemarkViewHolder generatePropertyInfo(String str, String str2, Object obj, Class cls) {
        AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
        accountRemarkViewHolder.f5805x50fd9e4a = str2;
        accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = str;
        accountRemarkViewHolder.write(obj);
        accountRemarkViewHolder.MediaSessionCompat$QueueItem = cls;
        return accountRemarkViewHolder;
    }

    /* access modifiers changed from: protected */
    public int getIntFromValue(String str, int i) {
        return str == null || str.length() == 0 ? i : Integer.parseInt(str);
    }
}

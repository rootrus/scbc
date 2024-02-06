package com.kofax.kmc.klo.logistics.data;

import com.kofax.kmc.kut.utilities.error.InternalError;
import com.kofax.kmc.kut.utilities.error.NullPointerException;

public class UserProfile implements Cloneable {
    private String domain = "";

    /* renamed from: jr */
    private String f3448jr = "";
    private String password = "";
    private String username = "";

    public UserProfile clone() {
        try {
            return (UserProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("UserProfile: unexpected clone not supported exception");
        }
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String str) {
        m3759a(str, "name");
        this.username = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        m3759a(str, "password");
        this.password = str;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        m3759a(str, "domain");
        this.domain = str;
    }

    public String getUserEmailAddress() {
        return this.f3448jr;
    }

    public void setUserEmailAddress(String str) {
        m3759a(str, "email address");
        this.f3448jr = str;
    }

    /* renamed from: a */
    private void m3759a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" parameter is null");
            throw new NullPointerException(sb.toString());
        }
    }
}

package org.jmrtd.cert;

import java.io.Serializable;
import java.security.Principal;
import net.p088sf.scuba.data.Country;

public class CVCPrincipal implements Principal, Serializable {
    private static final long serialVersionUID = -4905647207367309688L;
    private Country country;
    private String mnemonic;
    private String seqNumber;

    public CVCPrincipal(String str) {
        String str2;
        if (str == null || str.length() < 7 || str.length() > 16) {
            StringBuilder sb = new StringBuilder();
            sb.append("Name should be <Country (2F)><Mnemonic (9V)><SeqNum (5F)> formatted, found ");
            sb.append(str);
            if (sb.toString() == null) {
                str2 = "null";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\"");
                str2 = sb2.toString();
            }
            throw new IllegalArgumentException(str2);
        }
        this.country = Country.getInstance(str.substring(0, 2).toUpperCase());
        this.mnemonic = str.substring(2, str.length() - 5);
        this.seqNumber = str.substring(str.length() - 5, str.length());
    }

    public CVCPrincipal(Country country2, String str, String str2) {
        if (str == null || str.length() > 9) {
            throw new IllegalArgumentException("Wrong length mnemonic");
        } else if (str2 == null || str2.length() != 5) {
            throw new IllegalArgumentException("Wrong length seqNumber");
        } else {
            this.country = country2;
            this.mnemonic = str;
            this.seqNumber = str2;
        }
    }

    public String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.country.toAlpha2Code());
        sb.append(this.mnemonic);
        sb.append(this.seqNumber);
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.country.toAlpha2Code());
        sb.append("/");
        sb.append(this.mnemonic);
        sb.append("/");
        sb.append(this.seqNumber);
        return sb.toString();
    }

    public Country getCountry() {
        return this.country;
    }

    public String getMnemonic() {
        return this.mnemonic;
    }

    public String getSeqNumber() {
        return this.seqNumber;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        CVCPrincipal cVCPrincipal = (CVCPrincipal) obj;
        if (!cVCPrincipal.country.equals(this.country) || !cVCPrincipal.mnemonic.equals(this.mnemonic) || !cVCPrincipal.seqNumber.equals(this.seqNumber)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (getName().hashCode() << 1) + 1231211;
    }
}

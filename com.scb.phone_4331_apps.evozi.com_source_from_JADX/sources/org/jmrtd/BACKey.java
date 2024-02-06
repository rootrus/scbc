package org.jmrtd;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BACKey implements BACKeySpec {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyMMdd");
    private static final long serialVersionUID = -1059774581180524710L;
    private String dateOfBirth;
    private String dateOfExpiry;
    private String documentNumber;

    public String getAlgorithm() {
        return "BAC";
    }

    public byte[] getEncoded() {
        return null;
    }

    public String getFormat() {
        return null;
    }

    protected BACKey() {
    }

    public BACKey(String str, String str2, String str3) {
        if (str == null) {
            throw new IllegalArgumentException("Illegal document number");
        } else if (str2 == null || str2.length() != 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal date: ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        } else if (str3 == null || str3.length() != 6) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal date: ");
            sb2.append(str3);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            while (str.length() < 9) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("<");
                str = sb3.toString();
            }
            this.documentNumber = str.trim();
            this.dateOfBirth = str2;
            this.dateOfExpiry = str3;
        }
    }

    public BACKey(String str, Date date, Date date2) {
        this(str, toString(date), toString(date2));
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.documentNumber);
        sb.append(", ");
        sb.append(this.dateOfBirth);
        sb.append(", ");
        sb.append(this.dateOfExpiry);
        return sb.toString();
    }

    public int hashCode() {
        String str = this.documentNumber;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.dateOfBirth;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dateOfExpiry;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((hashCode + 305) * 61) + hashCode2) * 61) + i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        BACKey bACKey = (BACKey) obj;
        if (!this.documentNumber.equals(bACKey.documentNumber) || !this.dateOfBirth.equals(bACKey.dateOfBirth) || !this.dateOfExpiry.equals(bACKey.dateOfExpiry)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void setDocumentNumber(String str) {
        this.documentNumber = str;
    }

    /* access modifiers changed from: protected */
    public void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    /* access modifiers changed from: protected */
    public void setDateOfExpiry(String str) {
        this.dateOfExpiry = str;
    }

    private static String toString(Date date) {
        String format;
        synchronized (BACKey.class) {
            format = SDF.format(date);
        }
        return format;
    }
}

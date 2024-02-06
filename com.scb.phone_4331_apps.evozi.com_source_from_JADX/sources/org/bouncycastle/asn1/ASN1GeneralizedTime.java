package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class ASN1GeneralizedTime extends ASN1Primitive {
    private byte[] time;

    public ASN1GeneralizedTime(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("invalid date string: ");
            sb.append(e.getMessage());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public ASN1GeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    ASN1GeneralizedTime(byte[] bArr) {
        this.time = bArr;
    }

    private String calculateGMTOffset() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (((i * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(getDate())) {
                i += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GMT");
        sb.append(str);
        sb.append(convert(i));
        sb.append(":");
        sb.append(convert(i2));
        return sb.toString();
    }

    private String convert(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        sb.append(i);
        return sb.toString();
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1GeneralizedTime) fromByteArray((byte[]) obj);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("encoding error in getInstance: ");
                sb.append(e.toString());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("illegal object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof ASN1GeneralizedTime)) ? getInstance(object) : new ASN1GeneralizedTime(((ASN1OctetString) object).getOctets());
    }

    private boolean hasFractionalSeconds() {
        int i = 0;
        while (true) {
            byte[] bArr = this.time;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1GeneralizedTime)) {
            return false;
        }
        return Arrays.areEqual(this.time, ((ASN1GeneralizedTime) aSN1Primitive).time);
    }

    /* access modifiers changed from: package-private */
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(24, this.time);
    }

    /* access modifiers changed from: package-private */
    public int encodedLength() {
        int length = this.time.length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date getDate() throws java.text.ParseException {
        /*
            r9 = this;
            byte[] r0 = r9.time
            java.lang.String r0 = org.bouncycastle.util.Strings.fromByteArray(r0)
            java.lang.String r1 = "Z"
            boolean r2 = r0.endsWith(r1)
            r3 = 0
            if (r2 == 0) goto L_0x002a
            boolean r2 = r9.hasFractionalSeconds()
            if (r2 == 0) goto L_0x001d
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyyMMddHHmmss.SSS'Z'"
            r2.<init>(r4)
            goto L_0x0024
        L_0x001d:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyyMMddHHmmss'Z'"
            r2.<init>(r4)
        L_0x0024:
            java.util.SimpleTimeZone r4 = new java.util.SimpleTimeZone
            r4.<init>(r3, r1)
            goto L_0x007e
        L_0x002a:
            r2 = 45
            int r2 = r0.indexOf(r2)
            if (r2 > 0) goto L_0x0060
            r2 = 43
            int r2 = r0.indexOf(r2)
            if (r2 > 0) goto L_0x0060
            boolean r1 = r9.hasFractionalSeconds()
            if (r1 == 0) goto L_0x0048
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMddHHmmss.SSS"
            r1.<init>(r2)
            goto L_0x004f
        L_0x0048:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r2 = "yyyyMMddHHmmss"
            r1.<init>(r2)
        L_0x004f:
            java.util.SimpleTimeZone r2 = new java.util.SimpleTimeZone
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r4.getID()
            r2.<init>(r3, r4)
            r1.setTimeZone(r2)
            goto L_0x0082
        L_0x0060:
            java.lang.String r0 = r9.getTime()
            boolean r2 = r9.hasFractionalSeconds()
            if (r2 == 0) goto L_0x0072
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyyMMddHHmmss.SSSz"
            r2.<init>(r4)
            goto L_0x0079
        L_0x0072:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyyMMddHHmmssz"
            r2.<init>(r4)
        L_0x0079:
            java.util.SimpleTimeZone r4 = new java.util.SimpleTimeZone
            r4.<init>(r3, r1)
        L_0x007e:
            r2.setTimeZone(r4)
            r1 = r2
        L_0x0082:
            boolean r2 = r9.hasFractionalSeconds()
            if (r2 == 0) goto L_0x011e
            r2 = 14
            java.lang.String r4 = r0.substring(r2)
            r5 = 1
            r6 = r5
        L_0x0090:
            int r7 = r4.length()
            if (r6 >= r7) goto L_0x00a5
            char r7 = r4.charAt(r6)
            r8 = 48
            if (r8 > r7) goto L_0x00a5
            r8 = 57
            if (r7 > r8) goto L_0x00a5
            int r6 = r6 + 1
            goto L_0x0090
        L_0x00a5:
            int r7 = r6 + -1
            r8 = 3
            if (r7 <= r8) goto L_0x00c8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r7 = 4
            java.lang.String r7 = r4.substring(r3, r7)
            r5.append(r7)
            java.lang.String r4 = r4.substring(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L_0x0110
        L_0x00c8:
            if (r7 != r5) goto L_0x00ec
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r4.substring(r3, r6)
            r5.append(r7)
            java.lang.String r7 = "00"
            r5.append(r7)
            java.lang.String r4 = r4.substring(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L_0x0110
        L_0x00ec:
            r5 = 2
            if (r7 != r5) goto L_0x011e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = r4.substring(r3, r6)
            r5.append(r7)
            java.lang.String r7 = "0"
            r5.append(r7)
            java.lang.String r4 = r4.substring(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L_0x0110:
            java.lang.String r0 = r0.substring(r3, r2)
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L_0x011e:
            java.util.Date r0 = r1.parse(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1GeneralizedTime.getDate():java.util.Date");
    }

    public String getTime() {
        String fromByteArray = Strings.fromByteArray(this.time);
        if (fromByteArray.charAt(fromByteArray.length() - 1) == 'Z') {
            StringBuilder sb = new StringBuilder();
            sb.append(fromByteArray.substring(0, fromByteArray.length() - 1));
            sb.append("GMT+00:00");
            return sb.toString();
        }
        int length = fromByteArray.length() - 5;
        char charAt = fromByteArray.charAt(length);
        if (charAt == '-' || charAt == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fromByteArray.substring(0, length));
            sb2.append("GMT");
            int i = length + 3;
            sb2.append(fromByteArray.substring(length, i));
            sb2.append(":");
            sb2.append(fromByteArray.substring(i));
            return sb2.toString();
        }
        int length2 = fromByteArray.length() - 3;
        char charAt2 = fromByteArray.charAt(length2);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(fromByteArray.substring(0, length2));
            sb3.append("GMT");
            sb3.append(fromByteArray.substring(length2));
            sb3.append(":00");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(fromByteArray);
        sb4.append(calculateGMTOffset());
        return sb4.toString();
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.time);
    }

    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    /* access modifiers changed from: package-private */
    public boolean isConstructed() {
        return false;
    }
}

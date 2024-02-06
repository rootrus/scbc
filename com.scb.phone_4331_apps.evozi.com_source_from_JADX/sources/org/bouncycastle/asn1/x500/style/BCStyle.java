package org.bouncycastle.asn1.x500.style;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY = new ASN1ObjectIdentifier("2.5.4.15").intern();

    /* renamed from: C */
    public static final ASN1ObjectIdentifier f3183C = new ASN1ObjectIdentifier("2.5.4.6").intern();

    /* renamed from: CN */
    public static final ASN1ObjectIdentifier f3184CN = new ASN1ObjectIdentifier("2.5.4.3").intern();
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4").intern();
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5").intern();
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1").intern();

    /* renamed from: DC */
    public static final ASN1ObjectIdentifier f3185DC = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
    public static final ASN1ObjectIdentifier DMD_NAME = new ASN1ObjectIdentifier("2.5.4.54").intern();
    public static final ASN1ObjectIdentifier DN_QUALIFIER = new ASN1ObjectIdentifier("2.5.4.46").intern();
    private static final Hashtable DefaultLookUp = new Hashtable();
    private static final Hashtable DefaultSymbols = new Hashtable();

    /* renamed from: E */
    public static final ASN1ObjectIdentifier f3186E = EmailAddress;
    public static final ASN1ObjectIdentifier EmailAddress = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
    public static final ASN1ObjectIdentifier GENDER = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3").intern();
    public static final ASN1ObjectIdentifier GENERATION = new ASN1ObjectIdentifier("2.5.4.44").intern();
    public static final ASN1ObjectIdentifier GIVENNAME = new ASN1ObjectIdentifier("2.5.4.42").intern();
    public static final ASN1ObjectIdentifier INITIALS = new ASN1ObjectIdentifier("2.5.4.43").intern();
    public static final X500NameStyle INSTANCE = new BCStyle();

    /* renamed from: L */
    public static final ASN1ObjectIdentifier f3187L = new ASN1ObjectIdentifier("2.5.4.7").intern();
    public static final ASN1ObjectIdentifier NAME = X509ObjectIdentifiers.id_at_name;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH = new ASN1ObjectIdentifier("1.3.36.8.3.14").intern();

    /* renamed from: O */
    public static final ASN1ObjectIdentifier f3188O = new ASN1ObjectIdentifier("2.5.4.10").intern();

    /* renamed from: OU */
    public static final ASN1ObjectIdentifier f3189OU = new ASN1ObjectIdentifier("2.5.4.11").intern();
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2").intern();
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS = new ASN1ObjectIdentifier("2.5.4.16").intern();
    public static final ASN1ObjectIdentifier POSTAL_CODE = new ASN1ObjectIdentifier("2.5.4.17").intern();
    public static final ASN1ObjectIdentifier PSEUDONYM = new ASN1ObjectIdentifier("2.5.4.65").intern();
    public static final ASN1ObjectIdentifier SERIALNUMBER = f3190SN;

    /* renamed from: SN */
    public static final ASN1ObjectIdentifier f3190SN = new ASN1ObjectIdentifier("2.5.4.5").intern();

    /* renamed from: ST */
    public static final ASN1ObjectIdentifier f3191ST = new ASN1ObjectIdentifier("2.5.4.8").intern();
    public static final ASN1ObjectIdentifier STREET = new ASN1ObjectIdentifier("2.5.4.9").intern();
    public static final ASN1ObjectIdentifier SURNAME = new ASN1ObjectIdentifier("2.5.4.4").intern();

    /* renamed from: T */
    public static final ASN1ObjectIdentifier f3192T = new ASN1ObjectIdentifier("2.5.4.12").intern();
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER = X509ObjectIdentifiers.id_at_telephoneNumber;
    public static final ASN1ObjectIdentifier UID = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER = new ASN1ObjectIdentifier("2.5.4.45").intern();
    public static final ASN1ObjectIdentifier UnstructuredAddress = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
    protected final Hashtable defaultLookUp = copyHashTable(DefaultLookUp);
    protected final Hashtable defaultSymbols = copyHashTable(DefaultSymbols);

    static {
        DefaultSymbols.put(f3183C, "C");
        DefaultSymbols.put(f3188O, "O");
        DefaultSymbols.put(f3192T, "T");
        DefaultSymbols.put(f3189OU, "OU");
        DefaultSymbols.put(f3184CN, "CN");
        DefaultSymbols.put(f3187L, "L");
        DefaultSymbols.put(f3191ST, "ST");
        DefaultSymbols.put(f3190SN, "SERIALNUMBER");
        DefaultSymbols.put(EmailAddress, "E");
        DefaultSymbols.put(f3185DC, "DC");
        DefaultSymbols.put(UID, "UID");
        DefaultSymbols.put(STREET, "STREET");
        DefaultSymbols.put(SURNAME, "SURNAME");
        DefaultSymbols.put(GIVENNAME, "GIVENNAME");
        DefaultSymbols.put(INITIALS, "INITIALS");
        DefaultSymbols.put(GENERATION, "GENERATION");
        DefaultSymbols.put(UnstructuredAddress, "unstructuredAddress");
        DefaultSymbols.put(UnstructuredName, "unstructuredName");
        DefaultSymbols.put(UNIQUE_IDENTIFIER, "UniqueIdentifier");
        DefaultSymbols.put(DN_QUALIFIER, "DN");
        DefaultSymbols.put(PSEUDONYM, "Pseudonym");
        DefaultSymbols.put(POSTAL_ADDRESS, "PostalAddress");
        DefaultSymbols.put(NAME_AT_BIRTH, "NameAtBirth");
        DefaultSymbols.put(COUNTRY_OF_CITIZENSHIP, "CountryOfCitizenship");
        DefaultSymbols.put(COUNTRY_OF_RESIDENCE, "CountryOfResidence");
        DefaultSymbols.put(GENDER, "Gender");
        DefaultSymbols.put(PLACE_OF_BIRTH, "PlaceOfBirth");
        DefaultSymbols.put(DATE_OF_BIRTH, "DateOfBirth");
        DefaultSymbols.put(POSTAL_CODE, "PostalCode");
        DefaultSymbols.put(BUSINESS_CATEGORY, "BusinessCategory");
        DefaultSymbols.put(TELEPHONE_NUMBER, "TelephoneNumber");
        DefaultSymbols.put(NAME, KtaJsonExactionHelper.NAME);
        DefaultLookUp.put("c", f3183C);
        DefaultLookUp.put("o", f3188O);
        DefaultLookUp.put("t", f3192T);
        DefaultLookUp.put("ou", f3189OU);
        DefaultLookUp.put("cn", f3184CN);
        DefaultLookUp.put("l", f3187L);
        DefaultLookUp.put("st", f3191ST);
        DefaultLookUp.put("sn", f3190SN);
        DefaultLookUp.put("serialnumber", f3190SN);
        DefaultLookUp.put("street", STREET);
        DefaultLookUp.put("emailaddress", f3186E);
        DefaultLookUp.put("dc", f3185DC);
        DefaultLookUp.put("e", f3186E);
        DefaultLookUp.put("uid", UID);
        DefaultLookUp.put("surname", SURNAME);
        DefaultLookUp.put("givenname", GIVENNAME);
        DefaultLookUp.put("initials", INITIALS);
        DefaultLookUp.put("generation", GENERATION);
        DefaultLookUp.put("unstructuredaddress", UnstructuredAddress);
        DefaultLookUp.put("unstructuredname", UnstructuredName);
        DefaultLookUp.put("uniqueidentifier", UNIQUE_IDENTIFIER);
        DefaultLookUp.put("dn", DN_QUALIFIER);
        DefaultLookUp.put("pseudonym", PSEUDONYM);
        DefaultLookUp.put("postaladdress", POSTAL_ADDRESS);
        DefaultLookUp.put("nameofbirth", NAME_AT_BIRTH);
        DefaultLookUp.put("countryofcitizenship", COUNTRY_OF_CITIZENSHIP);
        DefaultLookUp.put("countryofresidence", COUNTRY_OF_RESIDENCE);
        DefaultLookUp.put("gender", GENDER);
        DefaultLookUp.put("placeofbirth", PLACE_OF_BIRTH);
        DefaultLookUp.put("dateofbirth", DATE_OF_BIRTH);
        DefaultLookUp.put("postalcode", POSTAL_CODE);
        DefaultLookUp.put("businesscategory", BUSINESS_CATEGORY);
        DefaultLookUp.put("telephonenumber", TELEPHONE_NUMBER);
        DefaultLookUp.put("name", NAME);
    }

    protected BCStyle() {
    }

    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    /* access modifiers changed from: protected */
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return (aSN1ObjectIdentifier.equals(EmailAddress) || aSN1ObjectIdentifier.equals(f3185DC)) ? new DERIA5String(str) : aSN1ObjectIdentifier.equals(DATE_OF_BIRTH) ? new ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals(f3183C) || aSN1ObjectIdentifier.equals(f3190SN) || aSN1ObjectIdentifier.equals(DN_QUALIFIER) || aSN1ObjectIdentifier.equals(TELEPHONE_NUMBER)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
    }

    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) DefaultSymbols.get(aSN1ObjectIdentifier);
    }

    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z = true;
        for (RDN appendRDN : rDNs) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, appendRDN, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}

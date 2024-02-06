package org.jmrtd.lds.icao;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
import net.p088sf.scuba.data.Gender;
import org.jmrtd.lds.AbstractLDSInfo;

public class MRZInfo extends AbstractLDSInfo {
    public static final int DOC_TYPE_ID1 = 1;
    public static final int DOC_TYPE_ID2 = 2;
    public static final int DOC_TYPE_ID3 = 3;
    public static final int DOC_TYPE_UNSPECIFIED = 0;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final String MRZ_CHARS = "<0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final long serialVersionUID = 7054965914471297804L;
    private char compositeCheckDigit;
    private String dateOfBirth;
    private char dateOfBirthCheckDigit;
    private String dateOfExpiry;
    private char dateOfExpiryCheckDigit;
    private String documentCode;
    private String documentNumber;
    private char documentNumberCheckDigit;
    private int documentType;
    private Gender gender;
    private String issuingState;
    private String nationality;
    private String optionalData1;
    private String optionalData2;
    private String primaryIdentifier;
    private String secondaryIdentifier;

    public MRZInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Gender gender2, String str8, String str9) {
        if (str == null || str.length() <= 0 || str.length() > 2 || (!str.startsWith("P") && !str.startsWith("V"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wrong document code: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        this.documentType = getDocumentTypeFromDocumentCode(str);
        this.documentCode = trimFillerChars(str);
        this.issuingState = str2;
        this.primaryIdentifier = str3;
        this.secondaryIdentifier = str4;
        this.documentNumber = trimFillerChars(str5);
        this.nationality = str6;
        this.dateOfBirth = str7;
        this.gender = gender2;
        this.dateOfExpiry = str8;
        if (str9 == null || equalsModuloFillerChars(str9, "")) {
            this.optionalData1 = "";
        } else if (str9.length() == 15) {
            this.optionalData1 = str9;
        } else if (str9.length() <= 14) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mrzFormat(str9, 14));
            sb2.append(checkDigit(str9, true));
            this.optionalData1 = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Wrong personal number: ");
            sb3.append(str9);
            throw new IllegalArgumentException(sb3.toString());
        }
        checkDigit();
    }

    public MRZInfo(String str, String str2, String str3, String str4, String str5, Gender gender2, String str6, String str7, String str8, String str9, String str10) {
        String str11;
        if (str == null || str.length() <= 0 || str.length() > 2 || (!str.startsWith("C") && !str.startsWith("I") && !str.startsWith("A"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Wrong document code: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        this.documentType = getDocumentTypeFromDocumentCode(str);
        this.documentCode = trimFillerChars(str);
        this.issuingState = str2;
        this.primaryIdentifier = str9;
        this.secondaryIdentifier = str10;
        this.documentNumber = trimFillerChars(str3);
        this.nationality = str7;
        this.dateOfBirth = str5;
        this.gender = gender2;
        this.dateOfExpiry = str6;
        if (str4 == null || str4.length() > 15) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Wrong optional data 1: ");
            if (str4 == null) {
                str11 = "null";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\"");
                sb3.append(str4);
                sb3.append("\"");
                str11 = sb3.toString();
            }
            sb2.append(str11);
            throw new IllegalArgumentException(sb2.toString());
        }
        this.optionalData1 = str4;
        this.optionalData2 = str8;
        checkDigit();
    }

    public MRZInfo(InputStream inputStream, int i) {
        try {
            readObject(inputStream, i);
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public MRZInfo(String str) {
        if (str != null) {
            String replace = str.trim().replace("\n", "");
            try {
                readObject(new ByteArrayInputStream(replace.getBytes("UTF-8")), replace.length());
            } catch (UnsupportedEncodingException e) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.getMessage());
                logger.severe(sb.toString());
                throw new IllegalStateException(e.getMessage());
            } catch (IOException e2) {
                Logger logger2 = LOGGER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception: ");
                sb2.append(e2.getMessage());
                logger2.severe(sb2.toString());
                throw new IllegalArgumentException(e2.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Null string");
        }
    }

    private void readObject(InputStream inputStream, int i) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readStringWithFillers = readStringWithFillers(dataInputStream, 2);
        this.documentCode = readStringWithFillers;
        this.documentType = getDocumentTypeFromDocumentCode(readStringWithFillers);
        if (i == 88) {
            this.documentType = 3;
        } else if (i != 90) {
            this.documentType = getDocumentTypeFromDocumentCode(this.documentCode);
        } else {
            this.documentType = 1;
        }
        if (this.documentType == 1) {
            this.issuingState = readCountry(dataInputStream);
            this.documentNumber = readString(dataInputStream, 9);
            this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
            this.optionalData1 = readStringWithFillers(dataInputStream, 15);
            if (this.documentNumberCheckDigit == '<') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.documentNumber);
                String str = this.optionalData1;
                sb.append(str.substring(0, str.length() - 1));
                this.documentNumber = sb.toString();
                String str2 = this.optionalData1;
                this.documentNumberCheckDigit = str2.charAt(str2.length() - 1);
                this.optionalData1 = null;
            }
            this.documentNumber = trimFillerChars(this.documentNumber);
            this.dateOfBirth = readDateOfBirth(dataInputStream);
            this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
            this.gender = readGender(dataInputStream);
            this.dateOfExpiry = readDateOfExpiry(dataInputStream);
            this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
            this.nationality = readCountry(dataInputStream);
            this.optionalData2 = readString(dataInputStream, 11);
            this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
            readNameIdentifiers(readString(dataInputStream, 30));
            return;
        }
        this.issuingState = readCountry(dataInputStream);
        readNameIdentifiers(readString(dataInputStream, 39));
        this.documentNumber = trimFillerChars(readString(dataInputStream, 9));
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = readCountry(dataInputStream);
        this.dateOfBirth = readDateOfBirth(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = readGender(dataInputStream);
        this.dateOfExpiry = readDateOfExpiry(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        String readStringWithFillers2 = readStringWithFillers(dataInputStream, 14);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mrzFormat(readStringWithFillers2, 14));
        sb2.append((char) dataInputStream.readUnsignedByte());
        this.optionalData1 = sb2.toString();
        this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeDocumentType(dataOutputStream);
        if (this.documentType == 1) {
            writeIssuingState(dataOutputStream);
            if (this.documentNumber.length() <= 9 || !equalsModuloFillerChars(this.optionalData1, "")) {
                writeString(this.documentNumber, dataOutputStream, 9);
                dataOutputStream.write(this.documentNumberCheckDigit);
                writeString(this.optionalData1, dataOutputStream, 15);
            } else {
                writeString(this.documentNumber.substring(0, 9), dataOutputStream, 9);
                dataOutputStream.write(60);
                StringBuilder sb = new StringBuilder();
                String str = this.documentNumber;
                sb.append(str.substring(9, str.length()));
                sb.append(this.documentNumberCheckDigit);
                sb.append("<");
                writeString(sb.toString(), dataOutputStream, 15);
            }
            writeDateOfBirth(dataOutputStream);
            dataOutputStream.write(this.dateOfBirthCheckDigit);
            writeGender(dataOutputStream);
            writeDateOfExpiry(dataOutputStream);
            dataOutputStream.write(this.dateOfExpiryCheckDigit);
            writeNationality(dataOutputStream);
            writeString(this.optionalData2, dataOutputStream, 11);
            dataOutputStream.write(this.compositeCheckDigit);
            writeName(dataOutputStream, 30);
            return;
        }
        writeIssuingState(dataOutputStream);
        writeName(dataOutputStream, 39);
        writeString(this.documentNumber, dataOutputStream, 9);
        dataOutputStream.write(this.documentNumberCheckDigit);
        writeNationality(dataOutputStream);
        writeDateOfBirth(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        writeGender(dataOutputStream);
        writeDateOfExpiry(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        writeString(this.optionalData1, dataOutputStream, 15);
        dataOutputStream.write(this.compositeCheckDigit);
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String str) {
        this.dateOfBirth = str;
        checkDigit();
    }

    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public void setDateOfExpiry(String str) {
        this.dateOfExpiry = str;
        checkDigit();
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public void setDocumentNumber(String str) {
        this.documentNumber = str.trim();
        checkDigit();
    }

    public int getDocumentType() {
        return this.documentType;
    }

    public String getDocumentCode() {
        return this.documentCode;
    }

    public void setDocumentCode(String str) {
        this.documentCode = str;
        int documentTypeFromDocumentCode = getDocumentTypeFromDocumentCode(str);
        this.documentType = documentTypeFromDocumentCode;
        if (documentTypeFromDocumentCode == 1 && this.optionalData2 == null) {
            this.optionalData2 = "";
        }
    }

    public String getIssuingState() {
        return this.issuingState;
    }

    public void setIssuingState(String str) {
        this.issuingState = str;
        checkDigit();
    }

    public String getPrimaryIdentifier() {
        return this.primaryIdentifier;
    }

    public void setPrimaryIdentifier(String str) {
        this.primaryIdentifier = str.trim();
        checkDigit();
    }

    public String getSecondaryIdentifier() {
        return this.secondaryIdentifier;
    }

    public String[] getSecondaryIdentifierComponents() {
        return this.secondaryIdentifier.split(" |<");
    }

    public void setSecondaryIdentifierComponents(String[] strArr) {
        if (strArr == null) {
            this.secondaryIdentifier = null;
        }
        checkDigit();
    }

    public void setSecondaryIdentifiers(String str) {
        readSecondaryIdentifiers(str.trim());
        checkDigit();
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String str) {
        this.nationality = str;
        checkDigit();
    }

    public String getPersonalNumber() {
        if (this.optionalData1.length() > 14) {
            return trimFillerChars(this.optionalData1.substring(0, 14));
        }
        return trimFillerChars(this.optionalData1);
    }

    public void setPersonalNumber(String str) {
        if (str == null || str.length() > 14) {
            throw new IllegalArgumentException("Wrong personal number");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mrzFormat(str, 14));
        sb.append(checkDigit(str, true));
        this.optionalData1 = sb.toString();
    }

    public String getOptionalData1() {
        return this.optionalData1;
    }

    public String getOptionalData2() {
        return this.optionalData2;
    }

    public void setOptionalData2(String str) {
        this.optionalData2 = trimFillerChars(str);
        checkDigit();
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender2) {
        this.gender = gender2;
        checkDigit();
    }

    public String toString() {
        try {
            String str = new String(getEncoded(), "UTF-8");
            int length = str.length();
            if (length == 88) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, 44));
                sb.append("\n");
                sb.append(str.substring(44, 88));
                sb.append("\n");
                return sb.toString();
            } else if (length != 90) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, 30));
                sb2.append("\n");
                sb2.append(str.substring(30, 60));
                sb2.append("\n");
                sb2.append(str.substring(60, 90));
                sb2.append("\n");
                return sb2.toString();
            }
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception: ");
            sb3.append(e.getMessage());
            logger.severe(sb3.toString());
            throw new IllegalStateException(e.getMessage());
        }
    }

    public int hashCode() {
        return (toString().hashCode() << 1) + 53;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Gender gender2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        MRZInfo mRZInfo = (MRZInfo) obj;
        if ((this.documentCode != null || mRZInfo.documentCode != null) && ((str9 = this.documentCode) == null || !str9.equals(mRZInfo.documentCode))) {
            return false;
        }
        if ((this.issuingState != null || mRZInfo.issuingState != null) && ((str8 = this.issuingState) == null || !str8.equals(mRZInfo.issuingState))) {
            return false;
        }
        if ((this.primaryIdentifier != null || mRZInfo.primaryIdentifier != null) && ((str7 = this.primaryIdentifier) == null || !str7.equals(mRZInfo.primaryIdentifier))) {
            return false;
        }
        if ((this.secondaryIdentifier != null || mRZInfo.secondaryIdentifier != null) && !equalsModuloFillerChars(this.secondaryIdentifier, mRZInfo.secondaryIdentifier)) {
            return false;
        }
        if ((this.nationality != null || mRZInfo.nationality != null) && ((str6 = this.nationality) == null || !str6.equals(mRZInfo.nationality))) {
            return false;
        }
        if ((this.documentNumber != null || mRZInfo.documentNumber != null) && ((str5 = this.documentNumber) == null || !str5.equals(mRZInfo.documentNumber))) {
            return false;
        }
        if ((this.optionalData1 != null || mRZInfo.optionalData1 != null) && (((str4 = this.optionalData1) == null || !str4.equals(mRZInfo.optionalData1)) && !getPersonalNumber().equals(mRZInfo.getPersonalNumber()))) {
            return false;
        }
        if ((this.dateOfBirth != null || mRZInfo.dateOfBirth != null) && ((str3 = this.dateOfBirth) == null || !str3.equals(mRZInfo.dateOfBirth))) {
            return false;
        }
        if ((this.gender != null || mRZInfo.gender != null) && ((gender2 = this.gender) == null || !gender2.equals(mRZInfo.gender))) {
            return false;
        }
        if ((this.dateOfExpiry != null || mRZInfo.dateOfExpiry != null) && ((str2 = this.dateOfExpiry) == null || !str2.equals(mRZInfo.dateOfExpiry))) {
            return false;
        }
        if ((this.optionalData2 != null || mRZInfo.optionalData2 != null) && ((str = this.optionalData2) == null || !equalsModuloFillerChars(str, mRZInfo.optionalData2))) {
            return false;
        }
        return true;
    }

    public static char checkDigit(String str) {
        return checkDigit(str, false);
    }

    private void readNameIdentifiers(String str) {
        int indexOf = str.indexOf("<<");
        if (indexOf >= 0) {
            this.primaryIdentifier = trimFillerChars(str.substring(0, indexOf));
            readSecondaryIdentifiers(str.substring(str.indexOf("<<") + 2));
            return;
        }
        throw new IllegalArgumentException("Input does not contain primary identifier!");
    }

    private void readSecondaryIdentifiers(String str) {
        this.secondaryIdentifier = str;
    }

    private void writeString(String str, DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.write(mrzFormat(str, i).getBytes("UTF-8"));
    }

    private void writeIssuingState(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.issuingState.getBytes("UTF-8"));
    }

    private void writeDateOfExpiry(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.dateOfExpiry.getBytes("UTF-8"));
    }

    private void writeGender(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(genderToString().getBytes("UTF-8"));
    }

    private void writeDateOfBirth(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.dateOfBirth.getBytes("UTF-8"));
    }

    private void writeNationality(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.nationality.getBytes("UTF-8"));
    }

    private void writeName(DataOutputStream dataOutputStream, int i) throws IOException {
        dataOutputStream.write(nameToString(i).getBytes("UTF-8"));
    }

    private void writeDocumentType(DataOutputStream dataOutputStream) throws IOException {
        writeString(this.documentCode, dataOutputStream, 2);
    }

    /* renamed from: org.jmrtd.lds.icao.MRZInfo$1 */
    static /* synthetic */ class C104941 {
        static final /* synthetic */ int[] $SwitchMap$net$sf$scuba$data$Gender;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                net.sf.scuba.data.Gender[] r0 = net.p088sf.scuba.data.Gender.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$net$sf$scuba$data$Gender = r0
                net.sf.scuba.data.Gender r1 = net.p088sf.scuba.data.Gender.MALE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$net$sf$scuba$data$Gender     // Catch:{ NoSuchFieldError -> 0x001d }
                net.sf.scuba.data.Gender r1 = net.p088sf.scuba.data.Gender.FEMALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.icao.MRZInfo.C104941.<clinit>():void");
        }
    }

    private String genderToString() {
        int i = C104941.$SwitchMap$net$sf$scuba$data$Gender[this.gender.ordinal()];
        if (i != 1) {
            return i != 2 ? "<" : "F";
        }
        return "M";
    }

    private String nameToString(int i) {
        String[] split = this.primaryIdentifier.split(" |<");
        String[] split2 = this.secondaryIdentifier.split(" |<");
        StringBuffer stringBuffer = new StringBuffer();
        for (String append : split) {
            stringBuffer.append(append);
            stringBuffer.append('<');
        }
        for (String append2 : split2) {
            stringBuffer.append('<');
            stringBuffer.append(append2);
        }
        return mrzFormat(stringBuffer.toString(), i);
    }

    private String readString(DataInputStream dataInputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new String(bArr).trim();
    }

    private String readStringWithFillers(DataInputStream dataInputStream, int i) throws IOException {
        return trimFillerChars(readString(dataInputStream, i));
    }

    private String readCountry(DataInputStream dataInputStream) throws IOException {
        return readString(dataInputStream, 3);
    }

    private Gender readGender(DataInputStream dataInputStream) throws IOException {
        String readString = readString(dataInputStream, 1);
        if (readString.equalsIgnoreCase("M")) {
            return Gender.MALE;
        }
        if (readString.equalsIgnoreCase("F")) {
            return Gender.FEMALE;
        }
        return Gender.UNKNOWN;
    }

    private String readDateOfBirth(DataInputStream dataInputStream) throws IOException, NumberFormatException {
        return readString(dataInputStream, 6);
    }

    private String readDateOfExpiry(DataInputStream dataInputStream) throws IOException, NumberFormatException {
        return readString(dataInputStream, 6);
    }

    private static String mrzFormat(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Attempting to MRZ format null");
        } else if (str.length() <= i) {
            String trim = str.toUpperCase().trim();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < trim.length(); i2++) {
                char charAt = trim.charAt(i2);
                if (MRZ_CHARS.indexOf(charAt) == -1) {
                    stringBuffer.append('<');
                } else {
                    stringBuffer.append(charAt);
                }
            }
            while (stringBuffer.length() < i) {
                stringBuffer.append("<");
            }
            return stringBuffer.toString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument too wide (");
            sb.append(str.length());
            sb.append(" > ");
            sb.append(i);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static boolean equalsModuloFillerChars(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int max = Math.max(str.length(), str2.length());
        return mrzFormat(str, max).equals(mrzFormat(str2, max));
    }

    private static int getDocumentTypeFromDocumentCode(String str) {
        if (str == null || str.length() <= 0 || str.length() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Was expecting 1 or 2 digit document code, got ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (str.startsWith("A") || str.startsWith("C") || str.startsWith("I") || str.startsWith("V")) {
            return 1;
        } else {
            return str.startsWith("P") ? 3 : 0;
        }
    }

    private static String trimFillerChars(String str) {
        byte[] bytes = str.trim().getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 60) {
                bytes[i] = 32;
            }
        }
        return new String(bytes).trim();
    }

    private void checkDigit() {
        this.documentNumberCheckDigit = checkDigit(this.documentNumber);
        this.dateOfBirthCheckDigit = checkDigit(this.dateOfBirth);
        this.dateOfExpiryCheckDigit = checkDigit(this.dateOfExpiry);
        if (this.optionalData1.length() < 15) {
            String mrzFormat = mrzFormat(this.optionalData1, 14);
            char checkDigit = checkDigit(mrzFormat(this.optionalData1, 14), true);
            StringBuilder sb = new StringBuilder();
            sb.append(mrzFormat);
            sb.append(checkDigit);
            this.optionalData1 = sb.toString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.documentType == 1) {
            stringBuffer.append(this.documentNumber);
            stringBuffer.append(this.documentNumberCheckDigit);
            stringBuffer.append(mrzFormat(this.optionalData1, 15));
            stringBuffer.append(this.dateOfBirth);
            stringBuffer.append(this.dateOfBirthCheckDigit);
            stringBuffer.append(this.dateOfExpiry);
            stringBuffer.append(this.dateOfExpiryCheckDigit);
            stringBuffer.append(mrzFormat(this.optionalData2, 11));
        } else {
            stringBuffer.append(this.documentNumber);
            stringBuffer.append(this.documentNumberCheckDigit);
            stringBuffer.append(this.dateOfBirth);
            stringBuffer.append(this.dateOfBirthCheckDigit);
            stringBuffer.append(this.dateOfExpiry);
            stringBuffer.append(this.dateOfExpiryCheckDigit);
            stringBuffer.append(mrzFormat(this.optionalData1, 15));
        }
        this.compositeCheckDigit = checkDigit(stringBuffer.toString());
    }

    private static char checkDigit(String str, boolean z) {
        byte[] bArr;
        if (str == null) {
            try {
                bArr = new byte[0];
            } catch (NumberFormatException e) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.getMessage());
                logger.severe(sb.toString());
                throw new IllegalStateException("Error in computing check digit.");
            } catch (UnsupportedEncodingException e2) {
                Logger logger2 = LOGGER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception: ");
                sb2.append(e2.getMessage());
                logger2.severe(sb2.toString());
                throw new IllegalStateException("Error in computing check digit.");
            } catch (Exception e3) {
                Logger logger3 = LOGGER;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Exception: ");
                sb3.append(e3.getMessage());
                logger3.severe(sb3.toString());
                throw new IllegalArgumentException(e3.toString());
            }
        } else {
            bArr = str.getBytes("UTF-8");
        }
        int[] iArr = {7, 3, 1};
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i = (i + (iArr[i2 % 3] * decodeMRZDigit(bArr[i2]))) % 10;
        }
        String num = Integer.toString(i);
        if (num.length() == 1) {
            char c = (char) num.getBytes("UTF-8")[0];
            if (!z || c != '0') {
                return c;
            }
            return '<';
        }
        throw new IllegalStateException("Error in computing check digit.");
    }

    private static int decodeMRZDigit(byte b) throws NumberFormatException {
        if (b == 60) {
            return 0;
        }
        switch (b) {
            case 48:
                return 0;
            case 49:
                return 1;
            case 50:
                return 2;
            case 51:
                return 3;
            case 52:
                return 4;
            case 53:
                return 5;
            case 54:
                return 6;
            case 55:
                return 7;
            case 56:
                return 8;
            case 57:
                return 9;
            default:
                switch (b) {
                    case 65:
                        return 10;
                    case 66:
                        return 11;
                    case 67:
                        return 12;
                    case 68:
                        return 13;
                    case 69:
                        return 14;
                    case 70:
                        return 15;
                    case 71:
                        return 16;
                    case 72:
                        return 17;
                    case 73:
                        return 18;
                    case 74:
                        return 19;
                    case 75:
                        return 20;
                    case 76:
                        return 21;
                    case 77:
                        return 22;
                    case 78:
                        return 23;
                    case 79:
                        return 24;
                    case 80:
                        return 25;
                    case 81:
                        return 26;
                    case 82:
                        return 27;
                    case 83:
                        return 28;
                    case 84:
                        return 29;
                    case 85:
                        return 30;
                    case 86:
                        return 31;
                    case 87:
                        return 32;
                    case 88:
                        return 33;
                    case 89:
                        return 34;
                    case 90:
                        return 35;
                    default:
                        switch (b) {
                            case 97:
                                return 10;
                            case 98:
                                return 11;
                            case 99:
                                return 12;
                            case 100:
                                return 13;
                            case 101:
                                return 14;
                            case 102:
                                return 15;
                            case 103:
                                return 16;
                            case 104:
                                return 17;
                            case 105:
                                return 18;
                            case 106:
                                return 19;
                            case 107:
                                return 20;
                            case 108:
                                return 21;
                            case 109:
                                return 22;
                            case 110:
                                return 23;
                            case 111:
                                return 24;
                            case 112:
                                return 25;
                            case 113:
                                return 26;
                            case 114:
                                return 27;
                            case 115:
                                return 28;
                            case 116:
                                return 29;
                            case 117:
                                return 30;
                            case 118:
                                return 31;
                            case 119:
                                return 32;
                            case 120:
                                return 33;
                            case 121:
                                return 34;
                            case 122:
                                return 35;
                            default:
                                StringBuilder sb = new StringBuilder();
                                sb.append("Could not decode MRZ character ");
                                sb.append(b);
                                sb.append(" ('");
                                sb.append(Character.toString((char) b));
                                sb.append("')");
                                throw new NumberFormatException(sb.toString());
                        }
                }
        }
    }
}

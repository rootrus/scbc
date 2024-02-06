package org.jmrtd.lds.icao;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;
import okhttp3.HttpUrl;
import org.jmrtd.lds.DataGroup;
import p040o.AlertController$RecycleListView;

public class DG11File extends DataGroup {
    public static final int CONTENT_SPECIFIC_CONSTRUCTED_TAG = 160;
    public static final int COUNT_TAG = 2;
    public static final int CUSTODY_INFORMATION_TAG = 24344;
    public static final int FULL_DATE_OF_BIRTH_TAG = 24363;
    public static final int FULL_NAME_TAG = 24334;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int OTHER_NAME_TAG = 24335;
    public static final int OTHER_VALID_TD_NUMBERS_TAG = 24343;
    public static final int PERMANENT_ADDRESS_TAG = 24386;
    public static final int PERSONAL_NUMBER_TAG = 24336;
    public static final int PERSONAL_SUMMARY_TAG = 24341;
    public static final int PLACE_OF_BIRTH_TAG = 24337;
    public static final int PROFESSION_TAG = 24339;
    public static final int PROOF_OF_CITIZENSHIP_TAG = 24342;
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");
    public static final int TAG_LIST_TAG = 92;
    public static final int TELEPHONE_TAG = 24338;
    public static final int TITLE_TAG = 24340;
    private static final long serialVersionUID = 8566312538928662937L;
    private String custodyInformation;
    private Date fullDateOfBirth;
    private String nameOfHolder;
    private List<String> otherNames;
    private List<String> otherValidTDNumbers;
    private List<String> permanentAddress;
    private String personalNumber;
    private String personalSummary;
    private List<String> placeOfBirth;
    private String profession;
    private byte[] proofOfCitizenship;
    private List<Integer> tagPresenceList;
    private String telephone;
    private String title;

    public int getTag() {
        return 107;
    }

    public DG11File(String str, List<String> list, String str2, Date date, List<String> list2, List<String> list3, String str3, String str4, String str5, String str6, byte[] bArr, List<String> list4, String str7) {
        super(107);
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.nameOfHolder = str;
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        this.otherNames = arrayList;
        this.personalNumber = str2;
        this.fullDateOfBirth = date;
        if (list2 != null) {
            arrayList2 = new ArrayList(list2);
        }
        this.placeOfBirth = arrayList2;
        this.permanentAddress = list3;
        this.telephone = str3;
        this.profession = str4;
        this.title = str5;
        this.personalSummary = str6;
        this.proofOfCitizenship = bArr;
        if (list4 != null) {
            arrayList3 = new ArrayList(list4);
        }
        this.otherValidTDNumbers = arrayList3;
        this.custodyInformation = str7;
    }

    public DG11File(InputStream inputStream) throws IOException {
        super(107, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (tLVInputStream.write() == 92) {
            int IconCompatParcelizer = tLVInputStream.IconCompatParcelizer();
            int i = 0;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tLVInputStream.MediaBrowserCompat$ItemReceiver());
            ArrayList<Integer> arrayList = new ArrayList<>((IconCompatParcelizer / 2) + 1);
            while (i < IconCompatParcelizer) {
                int write = new TLVInputStream(byteArrayInputStream).write();
                i += AlertController$RecycleListView.write(write);
                arrayList.add(Integer.valueOf(write));
            }
            for (Integer intValue : arrayList) {
                readField(intValue.intValue(), tLVInputStream);
            }
            return;
        }
        throw new IllegalArgumentException("Expected tag list in DG11");
    }

    private void readField(int i, TLVInputStream tLVInputStream) throws IOException {
        int write = tLVInputStream.write();
        if (write == 160) {
            tLVInputStream.IconCompatParcelizer();
            int write2 = tLVInputStream.write();
            if (write2 == 2) {
                int IconCompatParcelizer = tLVInputStream.IconCompatParcelizer();
                if (IconCompatParcelizer == 1) {
                    byte[] MediaBrowserCompat$ItemReceiver = tLVInputStream.MediaBrowserCompat$ItemReceiver();
                    if (MediaBrowserCompat$ItemReceiver.length == 1) {
                        int i2 = 0;
                        byte b = MediaBrowserCompat$ItemReceiver[0];
                        while (i2 < (b & 255)) {
                            int write3 = tLVInputStream.write();
                            if (write3 == 24335) {
                                tLVInputStream.IconCompatParcelizer();
                                parseOtherName(tLVInputStream.MediaBrowserCompat$ItemReceiver());
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Expected ");
                                sb.append(Integer.toHexString(OTHER_NAME_TAG));
                                sb.append(", found ");
                                sb.append(Integer.toHexString(write3));
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Number of content specific fields should be encoded in single byte, found ");
                    sb2.append(Arrays.toString(MediaBrowserCompat$ItemReceiver));
                    throw new IllegalArgumentException(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Expected length 1 count length, found ");
                sb3.append(IconCompatParcelizer);
                throw new IllegalArgumentException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Expected ");
            sb4.append(Integer.toHexString(2));
            sb4.append(", found ");
            sb4.append(Integer.toHexString(write2));
            throw new IllegalArgumentException(sb4.toString());
        } else if (write == i) {
            tLVInputStream.IconCompatParcelizer();
            byte[] MediaBrowserCompat$ItemReceiver2 = tLVInputStream.MediaBrowserCompat$ItemReceiver();
            if (write == 24363) {
                parseFullDateOfBirth(MediaBrowserCompat$ItemReceiver2);
            } else if (write != 24386) {
                switch (write) {
                    case FULL_NAME_TAG /*24334*/:
                        parseNameOfHolder(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case OTHER_NAME_TAG /*24335*/:
                        parseOtherName(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case PERSONAL_NUMBER_TAG /*24336*/:
                        parsePersonalNumber(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case PLACE_OF_BIRTH_TAG /*24337*/:
                        parsePlaceOfBirth(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case TELEPHONE_TAG /*24338*/:
                        parseTelephone(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case PROFESSION_TAG /*24339*/:
                        parseProfession(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case TITLE_TAG /*24340*/:
                        parseTitle(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case PERSONAL_SUMMARY_TAG /*24341*/:
                        parsePersonalSummary(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case PROOF_OF_CITIZENSHIP_TAG /*24342*/:
                        parseProofOfCitizenShip(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case OTHER_VALID_TD_NUMBERS_TAG /*24343*/:
                        parseOtherValidTDNumbers(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case CUSTODY_INFORMATION_TAG /*24344*/:
                        parseCustodyInformation(MediaBrowserCompat$ItemReceiver2);
                        return;
                    default:
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Unknown field tag in DG11: ");
                        sb5.append(Integer.toHexString(write));
                        throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                parsePermanentAddress(MediaBrowserCompat$ItemReceiver2);
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Expected ");
            sb6.append(Integer.toHexString(i));
            sb6.append(", but found ");
            sb6.append(Integer.toHexString(write));
            throw new IllegalArgumentException(sb6.toString());
        }
    }

    private void parseCustodyInformation(byte[] bArr) {
        try {
            this.custodyInformation = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            this.custodyInformation = new String(bArr).trim();
        }
    }

    private void parseOtherValidTDNumbers(byte[] bArr) {
        String trim = new String(bArr).trim();
        try {
            trim = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        this.otherValidTDNumbers = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(trim, "<");
        while (stringTokenizer.hasMoreTokens()) {
            this.otherValidTDNumbers.add(stringTokenizer.nextToken().trim());
        }
    }

    private void parseProofOfCitizenShip(byte[] bArr) {
        this.proofOfCitizenship = bArr;
    }

    private void parsePersonalSummary(byte[] bArr) {
        try {
            this.personalSummary = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            this.personalSummary = new String(bArr).trim();
        }
    }

    private void parseTitle(byte[] bArr) {
        try {
            this.title = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            this.title = new String(bArr).trim();
        }
    }

    private void parseProfession(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        this.profession = str.trim();
    }

    private void parseTelephone(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        this.telephone = str.replace("<", " ").trim();
    }

    private void parsePermanentAddress(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.permanentAddress = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.permanentAddress.add(stringTokenizer.nextToken().trim());
        }
    }

    private void parsePlaceOfBirth(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.placeOfBirth = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.placeOfBirth.add(stringTokenizer.nextToken().trim());
        }
    }

    private void parseFullDateOfBirth(byte[] bArr) {
        String str;
        try {
            if (bArr.length != 4) {
                String str2 = new String(bArr);
                try {
                    str = new String(bArr, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Logger logger = LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception: ");
                    sb.append(e.getMessage());
                    logger.severe(sb.toString());
                    str = str2;
                }
            } else if (bArr == null) {
                str = "NULL";
            } else {
                str = AlertController$RecycleListView.IconCompatParcelizer(bArr, bArr.length, 1000);
            }
            this.fullDateOfBirth = SDF.parse(str);
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    private void parseOtherName(byte[] bArr) {
        synchronized (this) {
            if (this.otherNames == null) {
                this.otherNames = new ArrayList();
            }
            try {
                this.otherNames.add(new String(bArr, "UTF-8").trim());
            } catch (UnsupportedEncodingException e) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.getMessage());
                logger.severe(sb.toString());
                this.otherNames.add(new String(bArr).trim());
            }
        }
        return;
    }

    private void parsePersonalNumber(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        this.personalNumber = str.trim();
    }

    private void parseNameOfHolder(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        }
        this.nameOfHolder = str.trim();
    }

    public List<Integer> getTagPresenceList() {
        List<Integer> list = this.tagPresenceList;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(12);
        this.tagPresenceList = arrayList;
        if (this.nameOfHolder != null) {
            arrayList.add(Integer.valueOf(FULL_NAME_TAG));
        }
        List<String> list2 = this.otherNames;
        if (list2 != null && list2.size() > 0) {
            this.tagPresenceList.add(Integer.valueOf(OTHER_NAME_TAG));
        }
        if (this.personalNumber != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONAL_NUMBER_TAG));
        }
        if (this.fullDateOfBirth != null) {
            this.tagPresenceList.add(24363);
        }
        List<String> list3 = this.placeOfBirth;
        if (list3 != null && list3.size() > 0) {
            this.tagPresenceList.add(Integer.valueOf(PLACE_OF_BIRTH_TAG));
        }
        List<String> list4 = this.permanentAddress;
        if (list4 != null && list4.size() > 0) {
            this.tagPresenceList.add(24386);
        }
        if (this.telephone != null) {
            this.tagPresenceList.add(Integer.valueOf(TELEPHONE_TAG));
        }
        if (this.profession != null) {
            this.tagPresenceList.add(Integer.valueOf(PROFESSION_TAG));
        }
        if (this.title != null) {
            this.tagPresenceList.add(Integer.valueOf(TITLE_TAG));
        }
        if (this.personalSummary != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONAL_SUMMARY_TAG));
        }
        if (this.proofOfCitizenship != null) {
            this.tagPresenceList.add(Integer.valueOf(PROOF_OF_CITIZENSHIP_TAG));
        }
        List<String> list5 = this.otherValidTDNumbers;
        if (list5 != null && list5.size() > 0) {
            this.tagPresenceList.add(Integer.valueOf(OTHER_VALID_TD_NUMBERS_TAG));
        }
        if (this.custodyInformation != null) {
            this.tagPresenceList.add(Integer.valueOf(CUSTODY_INFORMATION_TAG));
        }
        return this.tagPresenceList;
    }

    public String getNameOfHolder() {
        return this.nameOfHolder;
    }

    public List<String> getOtherNames() {
        return this.otherNames == null ? new ArrayList() : new ArrayList(this.otherNames);
    }

    public String getPersonalNumber() {
        return this.personalNumber;
    }

    public Date getFullDateOfBirth() {
        return this.fullDateOfBirth;
    }

    public List<String> getPlaceOfBirth() {
        return this.placeOfBirth;
    }

    public List<String> getPermanentAddress() {
        return this.permanentAddress;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String getProfession() {
        return this.profession;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPersonalSummary() {
        return this.personalSummary;
    }

    public byte[] getProofOfCitizenship() {
        return this.proofOfCitizenship;
    }

    public List<String> getOtherValidTDNumbers() {
        return this.otherValidTDNumbers;
    }

    public String getCustodyInformation() {
        return this.custodyInformation;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DG11File [");
        String str2 = this.nameOfHolder;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        stringBuffer.append(str2);
        stringBuffer.append(", ");
        List<String> list = this.otherNames;
        String str4 = HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        stringBuffer.append((list == null || list.size() == 0) ? str4 : this.otherNames);
        stringBuffer.append(", ");
        String str5 = this.personalNumber;
        if (str5 == null) {
            str5 = str3;
        }
        stringBuffer.append(str5);
        stringBuffer.append(", ");
        Date date = this.fullDateOfBirth;
        stringBuffer.append(date == null ? str3 : SDF.format(date));
        stringBuffer.append(", ");
        List<String> list2 = this.placeOfBirth;
        stringBuffer.append((list2 == null || list2.size() == 0) ? str4 : this.placeOfBirth.toString());
        stringBuffer.append(", ");
        List<String> list3 = this.permanentAddress;
        stringBuffer.append((list3 == null || list3.size() == 0) ? str4 : this.permanentAddress.toString());
        stringBuffer.append(", ");
        String str6 = this.telephone;
        if (str6 == null) {
            str6 = str3;
        }
        stringBuffer.append(str6);
        stringBuffer.append(", ");
        String str7 = this.profession;
        if (str7 == null) {
            str7 = str3;
        }
        stringBuffer.append(str7);
        stringBuffer.append(", ");
        String str8 = this.title;
        if (str8 == null) {
            str8 = str3;
        }
        stringBuffer.append(str8);
        stringBuffer.append(", ");
        String str9 = this.personalSummary;
        if (str9 == null) {
            str9 = str3;
        }
        stringBuffer.append(str9);
        stringBuffer.append(", ");
        if (this.proofOfCitizenship == null) {
            str = str3;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("image (");
            sb.append(this.proofOfCitizenship.length);
            sb.append(")");
            str = sb.toString();
        }
        stringBuffer.append(str);
        stringBuffer.append(", ");
        List<String> list4 = this.otherValidTDNumbers;
        if (!(list4 == null || list4.size() == 0)) {
            str4 = this.otherValidTDNumbers.toString();
        }
        stringBuffer.append(str4);
        stringBuffer.append(", ");
        String str10 = this.custodyInformation;
        if (str10 != null) {
            str3 = str10;
        }
        stringBuffer.append(str3);
        stringBuffer.append("]");
        return stringBuffer.toString();
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
        return toString().equals(((DG11File) obj).toString());
    }

    public int hashCode() {
        return (toString().hashCode() * 13) + 111;
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.IconCompatParcelizer(92);
        DataOutputStream dataOutputStream = new DataOutputStream(tLVOutputStream);
        List<Integer> tagPresenceList2 = getTagPresenceList();
        for (Integer intValue : tagPresenceList2) {
            dataOutputStream.writeShort(intValue.intValue());
        }
        dataOutputStream.flush();
        tLVOutputStream.write();
        for (Integer intValue2 : tagPresenceList2) {
            int intValue3 = intValue2.intValue();
            if (intValue3 != 24363) {
                boolean z = true;
                if (intValue3 != 24386) {
                    switch (intValue3) {
                        case FULL_NAME_TAG /*24334*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.nameOfHolder.trim().getBytes("UTF-8"));
                            break;
                        case OTHER_NAME_TAG /*24335*/:
                            if (this.otherNames == null) {
                                this.otherNames = new ArrayList();
                            }
                            tLVOutputStream.IconCompatParcelizer(160);
                            tLVOutputStream.IconCompatParcelizer(2);
                            tLVOutputStream.write(this.otherNames.size());
                            tLVOutputStream.write();
                            for (String trim : this.otherNames) {
                                tLVOutputStream.IconCompatParcelizer(OTHER_NAME_TAG);
                                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(trim.trim().getBytes("UTF-8"));
                            }
                            tLVOutputStream.write();
                            break;
                        case PERSONAL_NUMBER_TAG /*24336*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.personalNumber.trim().getBytes("UTF-8"));
                            break;
                        case PLACE_OF_BIRTH_TAG /*24337*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            for (String next : this.placeOfBirth) {
                                if (next != null) {
                                    if (z) {
                                        z = false;
                                    } else {
                                        tLVOutputStream.write(60);
                                    }
                                    tLVOutputStream.write(next.trim().getBytes("UTF-8"));
                                }
                            }
                            tLVOutputStream.write();
                            break;
                        case TELEPHONE_TAG /*24338*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.telephone.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case PROFESSION_TAG /*24339*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.profession.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case TITLE_TAG /*24340*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.title.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case PERSONAL_SUMMARY_TAG /*24341*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.personalSummary.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        case PROOF_OF_CITIZENSHIP_TAG /*24342*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.proofOfCitizenship);
                            break;
                        case OTHER_VALID_TD_NUMBERS_TAG /*24343*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            for (String next2 : this.otherValidTDNumbers) {
                                if (next2 != null) {
                                    if (z) {
                                        z = false;
                                    } else {
                                        tLVOutputStream.write(60);
                                    }
                                    tLVOutputStream.write(next2.trim().replace(' ', '<').getBytes("UTF-8"));
                                }
                            }
                            tLVOutputStream.write();
                            break;
                        case CUSTODY_INFORMATION_TAG /*24344*/:
                            tLVOutputStream.IconCompatParcelizer(intValue3);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.custodyInformation.trim().replace(' ', '<').getBytes("UTF-8"));
                            break;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unknown tag in DG11: ");
                            sb.append(Integer.toHexString(intValue3));
                            throw new IllegalStateException(sb.toString());
                    }
                } else {
                    tLVOutputStream.IconCompatParcelizer(intValue3);
                    for (String next3 : this.permanentAddress) {
                        if (next3 != null) {
                            if (z) {
                                z = false;
                            } else {
                                tLVOutputStream.write(60);
                            }
                            tLVOutputStream.write(next3.trim().getBytes("UTF-8"));
                        }
                    }
                    tLVOutputStream.write();
                }
            } else {
                tLVOutputStream.IconCompatParcelizer(intValue3);
                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(SDF.format(this.fullDateOfBirth).getBytes("UTF-8"));
            }
        }
    }
}

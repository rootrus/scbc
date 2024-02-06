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
import java.util.logging.Logger;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.lds.DataGroup;
import p040o.AlertController$RecycleListView;

public class DG12File extends DataGroup {
    public static final int CONTENT_SPECIFIC_CONSTRUCTED_TAG = 160;
    public static final int COUNT_TAG = 2;
    public static final int DATE_AND_TIME_OF_PERSONALIZATION = 24405;
    public static final int DATE_OF_ISSUE_TAG = 24358;
    public static final int ENDORSEMENTS_AND_OBSERVATIONS_TAG = 24347;
    public static final int IMAGE_OF_FRONT_TAG = 24349;
    public static final int IMAGE_OF_REAR_TAG = 24350;
    public static final int ISSUING_AUTHORITY_TAG = 24345;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int NAME_OF_OTHER_PERSON_TAG = 24346;
    public static final int PERSONALIZATION_SYSTEM_SERIAL_NUMBER_TAG = 24406;
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat SDTF = new SimpleDateFormat("yyyyMMddhhmmss");
    private static final int TAG_LIST_TAG = 92;
    public static final int TAX_OR_EXIT_REQUIREMENTS_TAG = 24348;
    private static final long serialVersionUID = -1979367459379125674L;
    private Date dateAndTimeOfPersonalization;
    private Date dateOfIssue;
    private String endorsementsAndObservations;
    private byte[] imageOfFront;
    private byte[] imageOfRear;
    private String issuingAuthority;
    private List<String> namesOfOtherPersons;
    private String personalizationSystemSerialNumber;
    private List<Integer> tagPresenceList;
    private String taxOrExitRequirements;

    public int getTag() {
        return 108;
    }

    public DG12File(String str, Date date, List<String> list, String str2, String str3, byte[] bArr, byte[] bArr2, Date date2, String str4) {
        super(108);
        ArrayList arrayList;
        this.issuingAuthority = str;
        this.dateOfIssue = date;
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        this.namesOfOtherPersons = arrayList;
        this.endorsementsAndObservations = str2;
        this.taxOrExitRequirements = str3;
        this.imageOfFront = bArr;
        this.imageOfRear = bArr2;
        this.dateAndTimeOfPersonalization = date2;
        this.personalizationSystemSerialNumber = str4;
    }

    public DG12File(InputStream inputStream) throws IOException {
        super(108, inputStream);
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
        throw new IllegalArgumentException("Expected tag list in DG12");
    }

    public List<Integer> getTagPresenceList() {
        List<Integer> list = this.tagPresenceList;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(10);
        this.tagPresenceList = arrayList;
        if (this.issuingAuthority != null) {
            arrayList.add(Integer.valueOf(ISSUING_AUTHORITY_TAG));
        }
        if (this.dateOfIssue != null) {
            this.tagPresenceList.add(24358);
        }
        List<String> list2 = this.namesOfOtherPersons;
        if (list2 != null && list2.size() > 0) {
            this.tagPresenceList.add(Integer.valueOf(NAME_OF_OTHER_PERSON_TAG));
        }
        if (this.endorsementsAndObservations != null) {
            this.tagPresenceList.add(Integer.valueOf(ENDORSEMENTS_AND_OBSERVATIONS_TAG));
        }
        if (this.taxOrExitRequirements != null) {
            this.tagPresenceList.add(Integer.valueOf(TAX_OR_EXIT_REQUIREMENTS_TAG));
        }
        if (this.imageOfFront != null) {
            this.tagPresenceList.add(Integer.valueOf(IMAGE_OF_FRONT_TAG));
        }
        if (this.imageOfRear != null) {
            this.tagPresenceList.add(Integer.valueOf(IMAGE_OF_REAR_TAG));
        }
        if (this.dateAndTimeOfPersonalization != null) {
            this.tagPresenceList.add(Integer.valueOf(DATE_AND_TIME_OF_PERSONALIZATION));
        }
        if (this.personalizationSystemSerialNumber != null) {
            this.tagPresenceList.add(Integer.valueOf(PERSONALIZATION_SYSTEM_SERIAL_NUMBER_TAG));
        }
        return this.tagPresenceList;
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
                            if (write3 == 24346) {
                                tLVInputStream.IconCompatParcelizer();
                                parseNameOfOtherPerson(tLVInputStream.MediaBrowserCompat$ItemReceiver());
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Expected ");
                                sb.append(Integer.toHexString(NAME_OF_OTHER_PERSON_TAG));
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
            if (write == 24358) {
                parseDateOfIssue(MediaBrowserCompat$ItemReceiver2);
            } else if (write == 24405) {
                parseDateAndTimeOfPersonalization(MediaBrowserCompat$ItemReceiver2);
            } else if (write != 24406) {
                switch (write) {
                    case ISSUING_AUTHORITY_TAG /*24345*/:
                        parseIssuingAuthority(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case NAME_OF_OTHER_PERSON_TAG /*24346*/:
                        parseNameOfOtherPerson(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case ENDORSEMENTS_AND_OBSERVATIONS_TAG /*24347*/:
                        parseEndorsementsAndObservations(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case TAX_OR_EXIT_REQUIREMENTS_TAG /*24348*/:
                        parseTaxOrExitRequirements(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case IMAGE_OF_FRONT_TAG /*24349*/:
                        parseImageOfFront(MediaBrowserCompat$ItemReceiver2);
                        return;
                    case IMAGE_OF_REAR_TAG /*24350*/:
                        parseImageOfRear(MediaBrowserCompat$ItemReceiver2);
                        return;
                    default:
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Unknown field tag in DG12: ");
                        sb5.append(Integer.toHexString(write));
                        throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                parsePersonalizationSystemSerialNumber(MediaBrowserCompat$ItemReceiver2);
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

    private void parsePersonalizationSystemSerialNumber(byte[] bArr) {
        try {
            this.personalizationSystemSerialNumber = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            this.personalizationSystemSerialNumber = new String(bArr).trim();
        }
    }

    private void parseDateAndTimeOfPersonalization(byte[] bArr) {
        try {
            this.dateAndTimeOfPersonalization = SDTF.parse(new String(bArr, "UTF-8").trim());
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    private void parseImageOfFront(byte[] bArr) {
        this.imageOfFront = bArr;
    }

    private void parseImageOfRear(byte[] bArr) {
        this.imageOfRear = bArr;
    }

    private void parseTaxOrExitRequirements(byte[] bArr) {
        try {
            this.taxOrExitRequirements = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            this.taxOrExitRequirements = new String(bArr).trim();
        }
    }

    private void parseEndorsementsAndObservations(byte[] bArr) {
        try {
            this.endorsementsAndObservations = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            this.endorsementsAndObservations = new String(bArr).trim();
        }
    }

    private void parseNameOfOtherPerson(byte[] bArr) {
        synchronized (this) {
            if (this.namesOfOtherPersons == null) {
                this.namesOfOtherPersons = new ArrayList();
            }
            try {
                this.namesOfOtherPersons.add(new String(bArr, "UTF-8").trim());
            } catch (UnsupportedEncodingException e) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception: ");
                sb.append(e.getMessage());
                logger.severe(sb.toString());
                this.namesOfOtherPersons.add(new String(bArr).trim());
            }
        }
        return;
    }

    private void parseDateOfIssue(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length == 8) {
                try {
                    this.dateOfIssue = SDF.parse(new String(bArr, "UTF-8").trim());
                    return;
                } catch (UnsupportedEncodingException e) {
                    Logger logger = LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Exception: ");
                    sb.append(e.getMessage());
                    logger.severe(sb.toString());
                } catch (ParseException e2) {
                    Logger logger2 = LOGGER;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Exception: ");
                    sb2.append(e2.getMessage());
                    logger2.severe(sb2.toString());
                }
            }
            LOGGER.warning("DG12 date of issue is not in expected ccyymmdd ASCII format");
            if (bArr.length == 4) {
                try {
                    this.dateOfIssue = SDF.parse(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bArr).trim());
                    return;
                } catch (ParseException e3) {
                    Logger logger3 = LOGGER;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Exception: ");
                    sb3.append(e3.getMessage());
                    logger3.severe(sb3.toString());
                }
            }
            throw new IllegalArgumentException("Wrong date format");
        }
        throw new IllegalArgumentException("Wrong date format");
    }

    private void parseIssuingAuthority(byte[] bArr) {
        try {
            this.issuingAuthority = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            this.issuingAuthority = new String(bArr).trim();
        }
    }

    public String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public Date getDateOfIssue() {
        return this.dateOfIssue;
    }

    public List<String> getNamesOfOtherPersons() {
        return this.namesOfOtherPersons;
    }

    public String getEndorsementsAndObservations() {
        return this.endorsementsAndObservations;
    }

    public String getTaxOrExitRequirements() {
        return this.taxOrExitRequirements;
    }

    public byte[] getImageOfFront() {
        return this.imageOfFront;
    }

    public byte[] getImageOfRear() {
        return this.imageOfRear;
    }

    public Date getDateAndTimeOfPersonalization() {
        return this.dateAndTimeOfPersonalization;
    }

    public String getPersonalizationSystemSerialNumber() {
        return this.personalizationSystemSerialNumber;
    }

    public String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DG12File [");
        String str3 = this.issuingAuthority;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        stringBuffer.append(str3);
        stringBuffer.append(", ");
        Date date = this.dateOfIssue;
        stringBuffer.append(date == null ? str4 : SDF.format(date));
        stringBuffer.append(", ");
        List<String> list = this.namesOfOtherPersons;
        stringBuffer.append((list == null || list.size() == 0) ? str4 : this.namesOfOtherPersons);
        stringBuffer.append(", ");
        String str5 = this.endorsementsAndObservations;
        if (str5 == null) {
            str5 = str4;
        }
        stringBuffer.append(str5);
        stringBuffer.append(", ");
        String str6 = this.taxOrExitRequirements;
        if (str6 == null) {
            str6 = str4;
        }
        stringBuffer.append(str6);
        stringBuffer.append(", ");
        if (this.imageOfFront == null) {
            str = str4;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("image (");
            sb.append(this.imageOfFront.length);
            sb.append(")");
            str = sb.toString();
        }
        stringBuffer.append(str);
        stringBuffer.append(", ");
        if (this.imageOfRear == null) {
            str2 = str4;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image (");
            sb2.append(this.imageOfRear.length);
            sb2.append(")");
            str2 = sb2.toString();
        }
        stringBuffer.append(str2);
        stringBuffer.append(", ");
        Date date2 = this.dateAndTimeOfPersonalization;
        stringBuffer.append(date2 == null ? str4 : SDF.format(date2));
        stringBuffer.append(", ");
        String str7 = this.personalizationSystemSerialNumber;
        if (str7 != null) {
            str4 = str7;
        }
        stringBuffer.append(str4);
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
        return toString().equals(((DG12File) obj).toString());
    }

    public int hashCode() {
        return (toString().hashCode() * 13) + 112;
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.IconCompatParcelizer(92);
        List<Integer> tagPresenceList2 = getTagPresenceList();
        DataOutputStream dataOutputStream = new DataOutputStream(tLVOutputStream);
        for (Integer intValue : tagPresenceList2) {
            dataOutputStream.writeShort(intValue.intValue());
        }
        dataOutputStream.flush();
        tLVOutputStream.write();
        for (Integer intValue2 : tagPresenceList2) {
            int intValue3 = intValue2.intValue();
            if (intValue3 == 24358) {
                tLVOutputStream.IconCompatParcelizer(intValue3);
                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(new String(SDF.format(this.dateOfIssue)).getBytes("UTF-8"));
            } else if (intValue3 == 24405) {
                tLVOutputStream.IconCompatParcelizer(intValue3);
                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(new String(SDTF.format(this.dateAndTimeOfPersonalization)).getBytes("UTF-8"));
            } else if (intValue3 != 24406) {
                switch (intValue3) {
                    case ISSUING_AUTHORITY_TAG /*24345*/:
                        tLVOutputStream.IconCompatParcelizer(intValue3);
                        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.issuingAuthority.trim().getBytes("UTF-8"));
                        break;
                    case NAME_OF_OTHER_PERSON_TAG /*24346*/:
                        if (this.namesOfOtherPersons == null) {
                            this.namesOfOtherPersons = new ArrayList();
                        }
                        tLVOutputStream.IconCompatParcelizer(160);
                        tLVOutputStream.IconCompatParcelizer(2);
                        tLVOutputStream.write(this.namesOfOtherPersons.size());
                        tLVOutputStream.write();
                        for (String trim : this.namesOfOtherPersons) {
                            tLVOutputStream.IconCompatParcelizer(NAME_OF_OTHER_PERSON_TAG);
                            tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(trim.trim().getBytes("UTF-8"));
                        }
                        tLVOutputStream.write();
                        break;
                    case ENDORSEMENTS_AND_OBSERVATIONS_TAG /*24347*/:
                        tLVOutputStream.IconCompatParcelizer(intValue3);
                        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.endorsementsAndObservations.trim().getBytes("UTF-8"));
                        break;
                    case TAX_OR_EXIT_REQUIREMENTS_TAG /*24348*/:
                        tLVOutputStream.IconCompatParcelizer(intValue3);
                        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.taxOrExitRequirements.trim().getBytes("UTF-8"));
                        break;
                    case IMAGE_OF_FRONT_TAG /*24349*/:
                        tLVOutputStream.IconCompatParcelizer(intValue3);
                        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.imageOfFront);
                        break;
                    case IMAGE_OF_REAR_TAG /*24350*/:
                        tLVOutputStream.IconCompatParcelizer(intValue3);
                        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.imageOfRear);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown field tag in DG12: ");
                        sb.append(Integer.toHexString(intValue3));
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                tLVOutputStream.IconCompatParcelizer(intValue3);
                tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.personalizationSystemSerialNumber.trim().getBytes("UTF-8"));
            }
        }
    }
}

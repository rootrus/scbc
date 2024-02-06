package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IllegalFormatConversionException;
import java.util.List;
import java.util.StringTokenizer;
import net.p088sf.scuba.tlv.TLVInputStream;
import net.p088sf.scuba.tlv.TLVOutputStream;
import org.jmrtd.lds.AbstractTaggedLDSFile;
import org.jmrtd.lds.LDSFileUtil;

public class COMFile extends AbstractTaggedLDSFile {
    private static final int TAG_LIST_TAG = 92;
    private static final int VERSION_LDS_TAG = 24321;
    private static final int VERSION_UNICODE_TAG = 24374;
    private static final long serialVersionUID = 2002455279067170063L;
    private String majorVersionUnicode;
    private String minorVersionUnicode;
    private String releaseLevelUnicode;
    private List<Integer> tagList;
    private String updateLevelLDS;
    private String versionLDS;

    public COMFile(String str, String str2, String str3, String str4, String str5, int[] iArr) {
        super(96);
        initialize(str, str2, str3, str4, str5, iArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public COMFile(String str, String str2, int[] iArr) {
        super(96);
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new IllegalArgumentException("Null versionLDS");
        } else if (str4 != null) {
            try {
                StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
                if (stringTokenizer.countTokens() == 2) {
                    int parseInt = Integer.parseInt(stringTokenizer.nextToken().trim());
                    int parseInt2 = Integer.parseInt(stringTokenizer.nextToken().trim());
                    StringTokenizer stringTokenizer2 = new StringTokenizer(str2, ".");
                    if (stringTokenizer2.countTokens() == 3) {
                        int parseInt3 = Integer.parseInt(stringTokenizer2.nextToken().trim());
                        int parseInt4 = Integer.parseInt(stringTokenizer2.nextToken().trim());
                        int parseInt5 = Integer.parseInt(stringTokenizer2.nextToken().trim());
                        initialize(String.format("%02d", new Object[]{Integer.valueOf(parseInt)}), String.format("%02d", new Object[]{Integer.valueOf(parseInt2)}), String.format("%02d", new Object[]{Integer.valueOf(parseInt3)}), String.format("%02d", new Object[]{Integer.valueOf(parseInt4)}), String.format("%02d", new Object[]{Integer.valueOf(parseInt5)}), iArr);
                        return;
                    }
                    throw new IllegalArgumentException("Could not parse unicode version. Expecting 3 level version number x.y.z.");
                }
                throw new IllegalArgumentException("Could not parse LDS version. Expecting 2 level version number x.y.");
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not parse version number. ");
                sb.append(e.getMessage());
                throw new IllegalArgumentException(sb.toString());
            } catch (IllegalFormatConversionException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not parse version number. ");
                sb2.append(e2.getMessage());
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("Null versionUnicode");
        }
    }

    private void initialize(String str, String str2, String str3, String str4, String str5, int[] iArr) {
        if (iArr == null) {
            throw new IllegalArgumentException("Null tag list");
        } else if (str == null || str.length() != 2 || str2 == null || str2.length() != 2 || str3 == null || str3.length() != 2 || str4 == null || str4.length() != 2 || str5 == null || str5.length() != 2 || iArr == null) {
            throw new IllegalArgumentException();
        } else {
            this.versionLDS = str;
            this.updateLevelLDS = str2;
            this.majorVersionUnicode = str3;
            this.minorVersionUnicode = str4;
            this.releaseLevelUnicode = str5;
            this.tagList = new ArrayList(iArr.length);
            for (int valueOf : iArr) {
                this.tagList.add(Integer.valueOf(valueOf));
            }
        }
    }

    public COMFile(InputStream inputStream) throws IOException {
        super(96, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        int write = tLVInputStream.write();
        if (write != VERSION_LDS_TAG) {
            StringBuilder sb = new StringBuilder();
            sb.append("Excepected VERSION_LDS_TAG (");
            sb.append(Integer.toHexString(VERSION_LDS_TAG));
            sb.append("), found ");
            sb.append(Integer.toHexString(write));
            throw new IllegalArgumentException(sb.toString());
        } else if (tLVInputStream.IconCompatParcelizer() == 4) {
            byte[] MediaBrowserCompat$ItemReceiver = tLVInputStream.MediaBrowserCompat$ItemReceiver();
            this.versionLDS = new String(MediaBrowserCompat$ItemReceiver, 0, 2);
            this.updateLevelLDS = new String(MediaBrowserCompat$ItemReceiver, 2, 2);
            int write2 = tLVInputStream.write();
            if (write2 != 24374) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected VERSION_UNICODE_TAG (");
                sb2.append(Integer.toHexString(24374));
                sb2.append("), found ");
                sb2.append(Integer.toHexString(write2));
                throw new IllegalArgumentException(sb2.toString());
            } else if (tLVInputStream.IconCompatParcelizer() == 6) {
                byte[] MediaBrowserCompat$ItemReceiver2 = tLVInputStream.MediaBrowserCompat$ItemReceiver();
                this.majorVersionUnicode = new String(MediaBrowserCompat$ItemReceiver2, 0, 2);
                this.minorVersionUnicode = new String(MediaBrowserCompat$ItemReceiver2, 2, 2);
                this.releaseLevelUnicode = new String(MediaBrowserCompat$ItemReceiver2, 4, 2);
                int write3 = tLVInputStream.write();
                if (write3 == 92) {
                    tLVInputStream.IconCompatParcelizer();
                    byte[] MediaBrowserCompat$ItemReceiver3 = tLVInputStream.MediaBrowserCompat$ItemReceiver();
                    this.tagList = new ArrayList();
                    for (byte b : MediaBrowserCompat$ItemReceiver3) {
                        this.tagList.add(Integer.valueOf(b & 255));
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Expected TAG_LIST_TAG (");
                sb3.append(Integer.toHexString(92));
                sb3.append("), found ");
                sb3.append(Integer.toHexString(write3));
                throw new IllegalArgumentException(sb3.toString());
            } else {
                throw new IllegalArgumentException("Wrong length of LDS version object");
            }
        } else {
            throw new IllegalArgumentException("Wrong length of LDS version object");
        }
    }

    public String getLDSVersion() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.versionLDS);
        sb.append(".");
        sb.append(this.updateLevelLDS);
        try {
            int parseInt = Integer.parseInt(this.versionLDS);
            int parseInt2 = Integer.parseInt(this.updateLevelLDS);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(parseInt);
            sb2.append(".");
            sb2.append(parseInt2);
            return sb2.toString();
        } catch (NumberFormatException unused) {
            return sb.toString();
        }
    }

    public String getUnicodeVersion() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.majorVersionUnicode);
        sb.append(".");
        sb.append(this.minorVersionUnicode);
        sb.append(".");
        sb.append(this.releaseLevelUnicode);
        try {
            int parseInt = Integer.parseInt(this.majorVersionUnicode);
            int parseInt2 = Integer.parseInt(this.minorVersionUnicode);
            int parseInt3 = Integer.parseInt(this.releaseLevelUnicode);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(parseInt);
            sb2.append(".");
            sb2.append(parseInt2);
            sb2.append(".");
            sb2.append(parseInt3);
            return sb2.toString();
        } catch (NumberFormatException unused) {
            return sb.toString();
        }
    }

    public int[] getTagList() {
        int[] iArr = new int[this.tagList.size()];
        int i = 0;
        for (Integer intValue : this.tagList) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    public void insertTag(Integer num) {
        if (!this.tagList.contains(num)) {
            this.tagList.add(num);
            Collections.sort(this.tagList);
        }
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.IconCompatParcelizer(VERSION_LDS_TAG);
        StringBuilder sb = new StringBuilder();
        sb.append(this.versionLDS);
        sb.append(this.updateLevelLDS);
        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(sb.toString().getBytes());
        tLVOutputStream.IconCompatParcelizer(24374);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.majorVersionUnicode);
        sb2.append(this.minorVersionUnicode);
        sb2.append(this.releaseLevelUnicode);
        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(sb2.toString().getBytes());
        tLVOutputStream.IconCompatParcelizer(92);
        tLVOutputStream.MediaBrowserCompat$CustomActionResultReceiver(this.tagList.size());
        for (Integer intValue : this.tagList) {
            tLVOutputStream.write((byte) intValue.intValue());
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("COMFile ");
        StringBuilder sb = new StringBuilder();
        sb.append("LDS ");
        sb.append(this.versionLDS);
        sb.append(".");
        sb.append(this.updateLevelLDS);
        stringBuffer.append(sb.toString());
        stringBuffer.append(", ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unicode ");
        sb2.append(this.majorVersionUnicode);
        sb2.append(".");
        sb2.append(this.minorVersionUnicode);
        sb2.append(".");
        sb2.append(this.releaseLevelUnicode);
        stringBuffer.append(sb2.toString());
        stringBuffer.append(", ");
        stringBuffer.append("[");
        int size = this.tagList.size();
        int i = 0;
        for (Integer intValue : this.tagList) {
            int intValue2 = intValue.intValue();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DG");
            sb3.append(LDSFileUtil.lookupDataGroupNumberByTag(intValue2));
            stringBuffer.append(sb3.toString());
            if (i < size - 1) {
                stringBuffer.append(", ");
            }
            i++;
        }
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
        COMFile cOMFile = (COMFile) obj;
        if (!this.versionLDS.equals(cOMFile.versionLDS) || !this.updateLevelLDS.equals(cOMFile.updateLevelLDS) || !this.majorVersionUnicode.equals(cOMFile.majorVersionUnicode) || !this.minorVersionUnicode.equals(cOMFile.minorVersionUnicode) || !this.releaseLevelUnicode.equals(cOMFile.releaseLevelUnicode) || !this.tagList.equals(cOMFile.tagList)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.versionLDS.hashCode() * 3) + (this.updateLevelLDS.hashCode() * 5) + (this.majorVersionUnicode.hashCode() * 7) + (this.minorVersionUnicode.hashCode() * 11) + (this.releaseLevelUnicode.hashCode() * 13) + (this.tagList.hashCode() * 17);
    }
}

package org.jmrtd.lds.iso19794;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jmrtd.lds.AbstractImageInfo;

public class FingerImageInfo extends AbstractImageInfo {
    private static final byte[] FORMAT_TYPE_VALUE = {0, 9};
    public static final int IMPRESSION_TYPE_LATENT = 7;
    public static final int IMPRESSION_TYPE_LIVE_SCAN_CONTACTLESS = 9;
    public static final int IMPRESSION_TYPE_LIVE_SCAN_PLAIN = 0;
    public static final int IMPRESSION_TYPE_LIVE_SCAN_ROLLED = 1;
    public static final int IMPRESSION_TYPE_NON_LIVE_SCAN_PLAIN = 2;
    public static final int IMPRESSION_TYPE_NON_LIVE_SCAN_ROLLED = 3;
    public static final int IMPRESSION_TYPE_SWIPE = 8;
    public static final int POSITION_LEFT_FULL_PALM = 23;
    public static final int POSITION_LEFT_HYPOTHENAR = 36;
    public static final int POSITION_LEFT_INDEX_FINGER = 7;
    public static final int POSITION_LEFT_INTERDIGITAL = 34;
    public static final int POSITION_LEFT_LITTLE_FINGER = 10;
    public static final int POSITION_LEFT_LOWER_PALM = 27;
    public static final int POSITION_LEFT_MIDDLE_FINGER = 8;
    public static final int POSITION_LEFT_OTHER = 30;
    public static final int POSITION_LEFT_RING_FINGER = 9;
    public static final int POSITION_LEFT_THENAR = 35;
    public static final int POSITION_LEFT_THUMB = 6;
    public static final int POSITION_LEFT_UPPER_PALM = 28;
    public static final int POSITION_LEFT_WRITER_S_PALM = 24;
    public static final int POSITION_PLAIN_LEFT_FOUR_FINGERS = 14;
    public static final int POSITION_PLAIN_RIGHT_FOUR_FINGERS = 13;
    public static final int POSITION_PLAIN_THUMBS = 15;
    public static final int POSITION_RIGHT_FULL_PALM = 21;
    public static final int POSITION_RIGHT_HYPOTHENAR = 33;
    public static final int POSITION_RIGHT_INDEX_FINGER = 2;
    public static final int POSITION_RIGHT_INTERDIGITAL = 31;
    public static final int POSITION_RIGHT_LITTLE_FINGER = 5;
    public static final int POSITION_RIGHT_LOWER_PALM = 25;
    public static final int POSITION_RIGHT_MIDDLE_FINGER = 3;
    public static final int POSITION_RIGHT_OTHER = 29;
    public static final int POSITION_RIGHT_RING_FINGER = 4;
    public static final int POSITION_RIGHT_THENAR = 32;
    public static final int POSITION_RIGHT_THUMB = 1;
    public static final int POSITION_RIGHT_UPPER_PALM = 26;
    public static final int POSITION_RIGHT_WRITER_S_PALM = 22;
    public static final int POSITION_UNKNOWN_FINGER = 0;
    public static final int POSITION_UNKNOWN_PALM = 20;
    private static final long serialVersionUID = -6625447389275461027L;
    private int compressionAlgorithm;
    private int impressionType;
    private int position;
    private int quality;
    private long recordLength;
    private int viewCount;
    private int viewNumber;

    private static String impressionTypeToString(int i) {
        if (i == 0) {
            return "Live scan plain";
        }
        if (i == 1) {
            return "Live scan rolled";
        }
        if (i == 2) {
            return "Non-live scan plain";
        }
        if (i == 3) {
            return "Non-live scan rolled";
        }
        if (i == 7) {
            return "Latent";
        }
        if (i == 8) {
            return "Swipe";
        }
        if (i != 9) {
            return null;
        }
        return "Live scan contactless";
    }

    private static String positionToString(int i) {
        switch (i) {
            case 0:
                return "Unknown finger";
            case 1:
                return "Right thumb";
            case 2:
                return "Right index finger";
            case 3:
                return "Right middle finger";
            case 4:
                return "Right ring finger";
            case 5:
                return "Right little finger";
            case 6:
                return "Left thumb";
            case 7:
                return "Left index finger";
            case 8:
                return "Left middle finger";
            case 9:
                return "Left ring finger";
            case 10:
                return "Left little finger";
            case 13:
                return "Right four fingers";
            case 14:
                return "Left four fingers";
            case 15:
                return "Plain thumbs";
            case 20:
                return "Unknown palm";
            case 21:
                return "Right full palm";
            case 22:
                return "Right writer's palm";
            case 23:
                return "Left full palm";
            case 24:
                return "Left writer's palm";
            case 25:
                return "Right lower palm";
            case 26:
                return "Right upper palm";
            case 27:
                return "Left lower palm";
            case 28:
                return "Left upper palm";
            case 29:
                return "Right other";
            case 30:
                return "Left other";
            case 31:
                return "Right interdigital";
            case 32:
                return "Right thenar";
            case 33:
                return "Right hypothenar";
            case 34:
                return "Left interdigital";
            case 35:
                return "Left thenar";
            case 36:
                return "Left hypothenar";
            default:
                return null;
        }
    }

    private static int toBiometricSubtype(int i) {
        switch (i) {
            case 1:
                return 5;
            case 2:
                return 9;
            case 3:
                return 13;
            case 4:
                return 17;
            case 5:
                return 21;
            case 6:
                return 6;
            case 7:
                return 10;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
                return 22;
            case 13:
                return 1;
            case 14:
                return 2;
            case 15:
                return 4;
            case 21:
                return 1;
            case 23:
            case 24:
                return 2;
            case 25:
            case 26:
                return 1;
            case 27:
            case 28:
                return 2;
            case 29:
                return 1;
            case 30:
                return 2;
            case 31:
            case 32:
            case 33:
                return 1;
            case 34:
            case 35:
            case 36:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FingerImageInfo(int r12, int r13, int r14, int r15, int r16, int r17, int r18, java.io.InputStream r19, int r20, int r21) throws java.io.IOException {
        /*
            r11 = this;
            r8 = r11
            r9 = r15
            r10 = r20
            long r5 = (long) r10
            java.lang.String r7 = org.jmrtd.lds.iso19794.FingerInfo.toMimeType(r21)
            r1 = 2
            r0 = r11
            r2 = r17
            r3 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r7)
            if (r9 < 0) goto L_0x003d
            r0 = 100
            if (r9 > r0) goto L_0x003d
            if (r19 == 0) goto L_0x0035
            r0 = r12
            r8.position = r0
            r0 = r13
            r8.viewCount = r0
            r0 = r14
            r8.viewNumber = r0
            r8.quality = r9
            r0 = r16
            r8.impressionType = r0
            r0 = r21
            r8.compressionAlgorithm = r0
            int r0 = r10 + 14
            long r0 = (long) r0
            r8.recordLength = r0
            return
        L_0x0035:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Null image"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Quality needs to be a number between 0 and 100"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.iso19794.FingerImageInfo.<init>(int, int, int, int, int, int, int, java.io.InputStream, int, int):void");
    }

    public FingerImageInfo(InputStream inputStream, int i) throws IOException {
        super(2, FingerInfo.toMimeType(i));
        this.compressionAlgorithm = i;
        this.compressionAlgorithm = i;
        readObject(inputStream);
    }

    public int getQuality() {
        return this.quality;
    }

    public int getPosition() {
        return this.position;
    }

    public int getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public int getViewCount() {
        return this.viewCount;
    }

    public int getViewNumber() {
        return this.viewNumber;
    }

    public int getImpressionType() {
        return this.impressionType;
    }

    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.recordLength = ((long) dataInputStream.readInt()) & 4294967295L;
        this.position = dataInputStream.readUnsignedByte();
        this.viewCount = dataInputStream.readUnsignedByte();
        this.viewNumber = dataInputStream.readUnsignedByte();
        this.quality = dataInputStream.readUnsignedByte();
        this.impressionType = dataInputStream.readUnsignedByte();
        setWidth(dataInputStream.readUnsignedShort());
        setHeight(dataInputStream.readUnsignedShort());
        dataInputStream.readUnsignedByte();
        readImage(inputStream, this.recordLength - 14);
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeImage(byteArrayOutputStream);
        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        long length = (long) (byteArray.length + 14);
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt((int) length);
        dataOutputStream.writeByte(this.position);
        dataOutputStream.writeByte(this.viewCount);
        dataOutputStream.writeByte(this.viewNumber);
        dataOutputStream.writeByte(this.quality);
        dataOutputStream.writeByte(this.impressionType);
        dataOutputStream.writeShort(getWidth());
        dataOutputStream.writeShort(getHeight());
        dataOutputStream.writeByte(0);
        dataOutputStream.write(byteArray);
        dataOutputStream.flush();
    }

    public long getRecordLength() {
        return this.recordLength;
    }

    public byte[] getFormatType() {
        return FORMAT_TYPE_VALUE;
    }

    public int getBiometricSubtype() {
        return toBiometricSubtype(this.position);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FingerImageInfo [");
        StringBuilder sb = new StringBuilder();
        sb.append("quality: ");
        sb.append(this.quality);
        sb.append(", ");
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("position: ");
        sb2.append(positionToString(this.position));
        sb2.append(", ");
        stringBuffer.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("impression type: ");
        sb3.append(impressionTypeToString(this.impressionType));
        sb3.append(", ");
        stringBuffer.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("horizontal line length: ");
        sb4.append(getWidth());
        sb4.append(", ");
        stringBuffer.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("vertical line length: ");
        sb5.append(getHeight());
        sb5.append(", ");
        stringBuffer.append(sb5.toString());
        stringBuffer.append("image: ");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(getWidth());
        sb6.append(" x ");
        sb6.append(getHeight());
        stringBuffer.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(" \"");
        sb7.append(FingerInfo.toMimeType(this.compressionAlgorithm));
        sb7.append("\"");
        stringBuffer.append(sb7.toString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}

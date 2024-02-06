package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.lds.AbstractListInfo;
import org.jmrtd.lds.ImageInfo;

public class FingerInfo extends AbstractListInfo<FingerImageInfo> implements BiometricDataBlock {
    public static final int COMPRESSION_JPEG = 3;
    public static final int COMPRESSION_JPEG2000 = 4;
    public static final int COMPRESSION_PNG = 5;
    public static final int COMPRESSION_UNCOMPRESSED_BIT_PACKED = 1;
    public static final int COMPRESSION_UNCOMPRESSED_NO_BIT_PACKING = 0;
    public static final int COMPRESSION_WSQ = 2;
    private static final int FORMAT_IDENTIFIER = 1179210240;
    private static final int FORMAT_OWNER_VALUE = 257;
    private static final int FORMAT_TYPE_VALUE = 7;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int SCALE_UNITS_PPCM = 2;
    public static final int SCALE_UNITS_PPI = 1;
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = 5808625058034008176L;
    private int acquisitionLevel;
    private int captureDeviceId;
    private int compressionAlgorithm;
    private int depth;
    private int imageResolutionHorizontal;
    private int imageResolutionVertical;
    private StandardBiometricHeader sbh;
    private int scaleUnits;
    private int scanResolutionHorizontal;
    private int scanResolutionVertical;

    static String toMimeType(int i) {
        if (i == 0 || i == 1) {
            return "image/raw";
        }
        if (i == 2) {
            return ImageInfo.WSQ_MIME_TYPE;
        }
        if (i == 3) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i == 4) {
            return "image/jpeg2000";
        }
        if (i != 5) {
            return null;
        }
        return "image/png";
    }

    public FingerInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<FingerImageInfo> list) {
        this((StandardBiometricHeader) null, i, i2, i3, i4, i5, i6, i7, i8, i9, list);
    }

    public FingerInfo(StandardBiometricHeader standardBiometricHeader, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<FingerImageInfo> list) {
        this.sbh = standardBiometricHeader;
        this.captureDeviceId = i;
        this.acquisitionLevel = i2;
        this.scaleUnits = i3;
        this.scanResolutionHorizontal = i4;
        this.scanResolutionVertical = i5;
        this.imageResolutionHorizontal = i6;
        this.imageResolutionVertical = i7;
        this.depth = i8;
        this.compressionAlgorithm = i9;
        addAll(list);
    }

    public FingerInfo(InputStream inputStream) throws IOException {
        this((StandardBiometricHeader) null, inputStream);
    }

    public FingerInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this.sbh = standardBiometricHeader;
        readObject(inputStream);
    }

    public int getCaptureDeviceId() {
        return this.captureDeviceId;
    }

    public int getAcquisitionLevel() {
        return this.acquisitionLevel;
    }

    public int getScaleUnits() {
        return this.scaleUnits;
    }

    public int getHorizontalScanningResolution() {
        return this.scanResolutionHorizontal;
    }

    public int getVerticalScanningResolution() {
        return this.scanResolutionVertical;
    }

    public int getHorizontalImageResolution() {
        return this.imageResolutionHorizontal;
    }

    public int getVerticalImageResolution() {
        return this.imageResolutionVertical;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getCompressionAlgorithm() {
        return this.compressionAlgorithm;
    }

    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        if (readInt == FORMAT_IDENTIFIER) {
            int readInt2 = dataInputStream.readInt();
            if (readInt2 == VERSION_NUMBER) {
                long readUnsignedLong = readUnsignedLong(dataInputStream, 6);
                this.captureDeviceId = dataInputStream.readUnsignedShort();
                this.acquisitionLevel = dataInputStream.readUnsignedShort();
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                this.scaleUnits = dataInputStream.readUnsignedByte();
                this.scanResolutionHorizontal = dataInputStream.readUnsignedShort();
                this.scanResolutionVertical = dataInputStream.readUnsignedShort();
                this.imageResolutionHorizontal = dataInputStream.readUnsignedShort();
                this.imageResolutionVertical = dataInputStream.readUnsignedShort();
                this.depth = dataInputStream.readUnsignedByte();
                this.compressionAlgorithm = dataInputStream.readUnsignedByte();
                dataInputStream.readUnsignedShort();
                long j = readUnsignedLong - 32;
                long j2 = 0;
                for (int i = 0; i < readUnsignedByte; i++) {
                    FingerImageInfo fingerImageInfo = new FingerImageInfo(inputStream, this.compressionAlgorithm);
                    j2 += fingerImageInfo.getRecordLength();
                    add(fingerImageInfo);
                }
                if (j != j2) {
                    Logger logger = LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DEBUG: constructedDataLength and dataLength differ: dataLength = ");
                    sb.append(j);
                    sb.append(", constructedDataLength = ");
                    sb.append(j2);
                    logger.warning(sb.toString());
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("'010' version number expected! Found ");
            sb2.append(Integer.toHexString(readInt2));
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("'FIR' marker expected! Found ");
        sb3.append(Integer.toHexString(readInt));
        throw new IllegalArgumentException(sb3.toString());
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        List<FingerImageInfo> subRecords = getSubRecords();
        long j = 0;
        for (FingerImageInfo recordLength : subRecords) {
            j += recordLength.getRecordLength();
        }
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        writeLong(j + 32, dataOutputStream, 6);
        dataOutputStream.writeShort(this.captureDeviceId);
        dataOutputStream.writeShort(this.acquisitionLevel);
        dataOutputStream.writeByte(subRecords.size());
        dataOutputStream.writeByte(this.scaleUnits);
        dataOutputStream.writeShort(this.scanResolutionHorizontal);
        dataOutputStream.writeShort(this.scanResolutionVertical);
        dataOutputStream.writeShort(this.imageResolutionHorizontal);
        dataOutputStream.writeShort(this.imageResolutionVertical);
        dataOutputStream.writeByte(this.depth);
        dataOutputStream.writeByte(this.compressionAlgorithm);
        dataOutputStream.writeShort(0);
        for (FingerImageInfo writeObject : subRecords) {
            writeObject.writeObject(dataOutputStream);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FingerInfo [");
        for (FingerImageInfo obj : getSubRecords()) {
            stringBuffer.append(obj.toString());
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.sbh == null) {
            byte[] bArr = {(byte) getBiometricSubtype()};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{8});
            treeMap.put(Integer.valueOf(ISO781611.BIOMETRIC_SUBTYPE_TAG), bArr);
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 7});
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    public List<FingerImageInfo> getFingerImageInfos() {
        return getSubRecords();
    }

    public void addFingerImageInfo(FingerImageInfo fingerImageInfo) {
        add(fingerImageInfo);
    }

    public void removeFingerImageInfo(int i) {
        remove(i);
    }

    private static long readUnsignedLong(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        (inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream)).readFully(bArr);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) + ((long) (bArr[i2] & 255));
        }
        return j;
    }

    private static void writeLong(long j, OutputStream outputStream, int i) throws IOException {
        if (i > 0) {
            for (int i2 = 0; i2 < i - 8; i2++) {
                outputStream.write(0);
            }
            if (i > 8) {
                i = 8;
            }
            for (int i3 = i - 1; i3 >= 0; i3--) {
                int i4 = i3 << 3;
                outputStream.write((byte) ((int) (((255 << i4) & j) >> i4)));
            }
        }
    }

    static int fromMimeType(String str) {
        if (ImageInfo.WSQ_MIME_TYPE.equals(str)) {
            return 2;
        }
        if (ImageInfo.JPEG_MIME_TYPE.equals(str)) {
            return 3;
        }
        if ("image/jpeg2000".equals(str)) {
            return 4;
        }
        if ("images/png".equals(str)) {
            return 5;
        }
        throw new IllegalArgumentException("Did not recognize mimeType");
    }

    private int getBiometricSubtype() {
        boolean z = true;
        int i = 0;
        for (FingerImageInfo biometricSubtype : getSubRecords()) {
            int biometricSubtype2 = biometricSubtype.getBiometricSubtype();
            if (z) {
                z = false;
                i = biometricSubtype2;
            } else {
                i &= biometricSubtype2;
            }
        }
        return i;
    }
}

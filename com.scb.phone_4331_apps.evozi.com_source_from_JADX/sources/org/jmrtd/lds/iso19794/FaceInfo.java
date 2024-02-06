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

public class FaceInfo extends AbstractListInfo<FaceImageInfo> implements BiometricDataBlock {
    private static final int FORMAT_IDENTIFIER = 1178682112;
    private static final int FORMAT_OWNER_VALUE = 257;
    private static final int FORMAT_TYPE_VALUE = 8;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int VERSION_NUMBER = 808529920;
    private static final long serialVersionUID = -6053206262773400725L;
    private StandardBiometricHeader sbh;

    public FaceInfo(List<FaceImageInfo> list) {
        this((StandardBiometricHeader) null, list);
    }

    public FaceInfo(StandardBiometricHeader standardBiometricHeader, List<FaceImageInfo> list) {
        this.sbh = standardBiometricHeader;
        addAll(list);
    }

    public FaceInfo(InputStream inputStream) throws IOException {
        this((StandardBiometricHeader) null, inputStream);
    }

    public FaceInfo(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this.sbh = standardBiometricHeader;
        readObject(inputStream);
    }

    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        if (readInt == FORMAT_IDENTIFIER) {
            int readInt2 = dataInputStream.readInt();
            if (readInt2 == VERSION_NUMBER) {
                long readInt3 = (((long) dataInputStream.readInt()) & 4294967295L) - 14;
                long j = 0;
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                for (int i = 0; i < readUnsignedShort; i++) {
                    FaceImageInfo faceImageInfo = new FaceImageInfo(inputStream);
                    j += faceImageInfo.getRecordLength();
                    add(faceImageInfo);
                }
                if (readInt3 != j) {
                    Logger logger = LOGGER;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DEBUG: constructedDataLength and dataLength differ: dataLength = ");
                    sb.append(readInt3);
                    sb.append(", constructedDataLength = ");
                    sb.append(j);
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
        sb3.append("'FAC' marker expected! Found ");
        sb3.append(Integer.toHexString(readInt));
        throw new IllegalArgumentException(sb3.toString());
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        List<FaceImageInfo> subRecords = getSubRecords();
        long j = 0;
        for (FaceImageInfo recordLength : subRecords) {
            j += recordLength.getRecordLength();
        }
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeInt(FORMAT_IDENTIFIER);
        dataOutputStream.writeInt(VERSION_NUMBER);
        dataOutputStream.writeInt((int) ((j + 14) & 4294967295L));
        dataOutputStream.writeShort(subRecords.size());
        for (FaceImageInfo writeObject : subRecords) {
            writeObject.writeObject(dataOutputStream);
        }
    }

    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.sbh == null) {
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{2});
            treeMap.put(Integer.valueOf(ISO781611.BIOMETRIC_SUBTYPE_TAG), new byte[]{0});
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 8});
            this.sbh = new StandardBiometricHeader(treeMap);
        }
        return this.sbh;
    }

    public List<FaceImageInfo> getFaceImageInfos() {
        return getSubRecords();
    }

    public void addFaceImageInfo(FaceImageInfo faceImageInfo) {
        add(faceImageInfo);
    }

    public void removeFaceImageInfo(int i) {
        remove(i);
    }
}

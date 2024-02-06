package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import okhttp3.internal.http2.Settings;
import org.jmrtd.lds.AbstractListInfo;

public class IrisBiometricSubtypeInfo extends AbstractListInfo<IrisImageInfo> {
    public static final int EYE_LEFT = 2;
    public static final int EYE_RIGHT = 1;
    public static final int EYE_UNDEF = 0;
    private static final long serialVersionUID = -6588640634764878039L;
    private int biometricSubtype;
    private int imageFormat;

    public IrisBiometricSubtypeInfo(int i, int i2, List<IrisImageInfo> list) {
        this.biometricSubtype = i;
        this.imageFormat = i2;
        addAll(list);
    }

    public IrisBiometricSubtypeInfo(InputStream inputStream, int i) throws IOException {
        this.imageFormat = i;
        readObject(inputStream);
    }

    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.biometricSubtype = dataInputStream.readUnsignedByte();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        for (int i = 0; i < readUnsignedShort; i++) {
            IrisImageInfo irisImageInfo = new IrisImageInfo(inputStream, this.imageFormat);
            irisImageInfo.getRecordLength();
            add(irisImageInfo);
        }
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeByte(this.biometricSubtype & 255);
        List<IrisImageInfo> subRecords = getSubRecords();
        dataOutputStream.writeShort(subRecords.size() & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        for (IrisImageInfo writeObject : subRecords) {
            writeObject.writeObject(dataOutputStream);
        }
    }

    public long getRecordLength() {
        long j = 3;
        for (IrisImageInfo recordLength : getSubRecords()) {
            j += recordLength.getRecordLength();
        }
        return j;
    }

    public String toString() {
        List subRecords = getSubRecords();
        StringBuilder sb = new StringBuilder();
        sb.append("IrisBiometricSubtypeInfo [biometric subtype: ");
        sb.append(biometricSubtypeToString(this.biometricSubtype));
        sb.append(", imageCount = ");
        sb.append(subRecords.size());
        sb.append("]");
        return sb.toString();
    }

    public int getBiometricSubtype() {
        return this.biometricSubtype;
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public List<IrisImageInfo> getIrisImageInfos() {
        return getSubRecords();
    }

    public void addIrisImageInfo(IrisImageInfo irisImageInfo) {
        add(irisImageInfo);
    }

    public void removeIrisImageInfo(int i) {
        remove(i);
    }

    private static String biometricSubtypeToString(int i) {
        if (i == 0) {
            return "Undefined";
        }
        if (i == 1) {
            return "Right eye";
        }
        if (i == 2) {
            return "Left eye";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown biometric subtype: ");
        sb.append(Integer.toHexString(i));
        throw new NumberFormatException(sb.toString());
    }
}

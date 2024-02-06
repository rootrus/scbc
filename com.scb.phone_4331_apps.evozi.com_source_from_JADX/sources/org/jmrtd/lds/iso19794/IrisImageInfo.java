package org.jmrtd.lds.iso19794;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.internal.http2.Settings;
import org.jmrtd.lds.AbstractImageInfo;
import org.jmrtd.lds.ImageInfo;

public class IrisImageInfo extends AbstractImageInfo {
    public static int IMAGE_QUAL_HIGH_HI = 100;
    public static int IMAGE_QUAL_HIGH_LO = 76;
    public static int IMAGE_QUAL_LOW_HI = 50;
    public static int IMAGE_QUAL_LOW_LO = 26;
    public static int IMAGE_QUAL_MED_HI = 75;
    public static int IMAGE_QUAL_MED_LO = 51;
    public static int IMAGE_QUAL_UNDEF = 254;
    private static final int ROT_ANGLE_UNDEF = 65535;
    private static final int ROT_UNCERTAIN_UNDEF = 65535;
    private static final long serialVersionUID = 833541246115625112L;
    private int imageFormat;
    private int imageNumber;
    private int quality;
    private int rotationAngle;
    private int rotationAngleUncertainty;

    private static String getMimeTypeFromImageFormat(int i) {
        if (i == 2 || i == 4) {
            return ImageInfo.WSQ_MIME_TYPE;
        }
        if (i == 6 || i == 8 || i == 10 || i == 12) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i == 14 || i == 16) {
            return ImageInfo.JPEG2000_MIME_TYPE;
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IrisImageInfo(int i, int i2, int i3, int i4, int i5, int i6, InputStream inputStream, int i7, int i8) throws IOException {
        super(3, i5, i6, inputStream, (long) i7, getMimeTypeFromImageFormat(i8));
        if (inputStream != null) {
            this.imageNumber = i;
            this.quality = i2;
            this.rotationAngle = i3;
            this.rotationAngleUncertainty = i4;
            return;
        }
        throw new IllegalArgumentException("Null image bytes");
    }

    public IrisImageInfo(int i, int i2, int i3, InputStream inputStream, int i4, int i5) throws IOException {
        this(i, IMAGE_QUAL_UNDEF, Settings.DEFAULT_INITIAL_WINDOW_SIZE, Settings.DEFAULT_INITIAL_WINDOW_SIZE, i2, i3, inputStream, i4, i5);
    }

    IrisImageInfo(InputStream inputStream, int i) throws IOException {
        super(3);
        this.imageFormat = i;
        setMimeType(getMimeTypeFromImageFormat(i));
        readObject(inputStream);
    }

    public int getImageFormat() {
        return this.imageFormat;
    }

    public int getImageNumber() {
        return this.imageNumber;
    }

    public int getQuality() {
        return this.quality;
    }

    public int getRotationAngle() {
        return this.rotationAngle;
    }

    public int getRotationAngleUncertainty() {
        return this.rotationAngleUncertainty;
    }

    public long getRecordLength() {
        return (long) (getImageLength() + 11);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IrisImageInfo [");
        StringBuilder sb = new StringBuilder();
        sb.append("image number: ");
        sb.append(this.imageNumber);
        sb.append(", ");
        stringBuffer.append(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("quality: ");
        sb2.append(this.quality);
        sb2.append(", ");
        stringBuffer.append(sb2.toString());
        stringBuffer.append("image: ");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getWidth());
        sb3.append(" x ");
        sb3.append(getHeight());
        stringBuffer.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("mime-type: ");
        sb4.append(getMimeTypeFromImageFormat(this.imageFormat));
        stringBuffer.append(sb4.toString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.imageNumber = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedByte();
        this.rotationAngle = dataInputStream.readShort();
        this.rotationAngleUncertainty = dataInputStream.readUnsignedShort();
        readImage(inputStream, ((long) dataInputStream.readInt()) & 4294967295L);
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = outputStream instanceof DataOutputStream ? (DataOutputStream) outputStream : new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.imageNumber);
        dataOutputStream.writeByte(this.quality);
        dataOutputStream.writeShort(this.rotationAngle);
        dataOutputStream.writeShort(this.rotationAngleUncertainty);
        dataOutputStream.writeInt(getImageLength());
        writeImage(dataOutputStream);
    }
}

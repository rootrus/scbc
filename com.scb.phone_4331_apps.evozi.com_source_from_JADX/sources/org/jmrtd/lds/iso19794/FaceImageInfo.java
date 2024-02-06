package org.jmrtd.lds.iso19794;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import net.p088sf.scuba.data.Gender;
import org.jmrtd.lds.AbstractImageInfo;
import org.jmrtd.lds.ImageInfo;

public class FaceImageInfo extends AbstractImageInfo {
    public static final short EXPRESSION_EYES_LOOKING_AWAY = 5;
    public static final short EXPRESSION_FROWNING = 7;
    public static final short EXPRESSION_NEUTRAL = 1;
    public static final short EXPRESSION_RAISED_EYEBROWS = 4;
    public static final short EXPRESSION_SMILE_CLOSED = 2;
    public static final short EXPRESSION_SMILE_OPEN = 3;
    public static final short EXPRESSION_SQUINTING = 6;
    public static final short EXPRESSION_UNSPECIFIED = 0;
    public static final int EYE_COLOR_BLACK = 1;
    public static final int EYE_COLOR_BLUE = 2;
    public static final int EYE_COLOR_BROWN = 3;
    public static final int EYE_COLOR_GRAY = 4;
    public static final int EYE_COLOR_GREEN = 5;
    public static final int EYE_COLOR_MULTI_COLORED = 6;
    public static final int EYE_COLOR_PINK = 7;
    public static final int EYE_COLOR_UNKNOWN = 8;
    public static final int EYE_COLOR_UNSPECIFIED = 0;
    public static final int FACE_IMAGE_TYPE_BASIC = 0;
    public static final int FACE_IMAGE_TYPE_FULL_FRONTAL = 1;
    public static final int FACE_IMAGE_TYPE_TOKEN_FRONTAL = 2;
    private static final int FEATURE_BEARD_FLAG = 8;
    private static final int FEATURE_BLINK_FLAG = 32;
    private static final int FEATURE_DARK_GLASSES = 512;
    private static final int FEATURE_DISTORTING_MEDICAL_CONDITION = 1024;
    private static final int FEATURE_FEATURES_ARE_SPECIFIED_FLAG = 1;
    private static final int FEATURE_GLASSES_FLAG = 2;
    private static final int FEATURE_LEFT_EYE_PATCH_FLAG = 128;
    private static final int FEATURE_MOUSTACHE_FLAG = 4;
    private static final int FEATURE_MOUTH_OPEN_FLAG = 64;
    private static final int FEATURE_RIGHT_EYE_PATCH = 256;
    private static final int FEATURE_TEETH_VISIBLE_FLAG = 16;
    public static final int HAIR_COLOR_BALD = 1;
    public static final int HAIR_COLOR_BLACK = 2;
    public static final int HAIR_COLOR_BLONDE = 3;
    public static final int HAIR_COLOR_BLUE = 9;
    public static final int HAIR_COLOR_BROWN = 4;
    public static final int HAIR_COLOR_GRAY = 5;
    public static final int HAIR_COLOR_GREEN = 8;
    public static final int HAIR_COLOR_RED = 7;
    public static final int HAIR_COLOR_UNKNOWN = 255;
    public static final int HAIR_COLOR_UNSPECIFIED = 0;
    public static final int HAIR_COLOR_WHITE = 6;
    public static final int IMAGE_COLOR_SPACE_GRAY8 = 3;
    public static final int IMAGE_COLOR_SPACE_OTHER = 4;
    public static final int IMAGE_COLOR_SPACE_RGB24 = 1;
    public static final int IMAGE_COLOR_SPACE_UNSPECIFIED = 0;
    public static final int IMAGE_COLOR_SPACE_YUV422 = 2;
    public static final int IMAGE_DATA_TYPE_JPEG = 0;
    public static final int IMAGE_DATA_TYPE_JPEG2000 = 1;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final int PITCH = 1;
    private static final int ROLL = 2;
    public static final int SOURCE_TYPE_STATIC_PHOTO_DIGITAL_CAM = 2;
    public static final int SOURCE_TYPE_STATIC_PHOTO_SCANNER = 3;
    public static final int SOURCE_TYPE_STATIC_PHOTO_UNKNOWN_SOURCE = 1;
    public static final int SOURCE_TYPE_UNKNOWN = 7;
    public static final int SOURCE_TYPE_UNSPECIFIED = 0;
    public static final int SOURCE_TYPE_VIDEO_FRAME_ANALOG_CAM = 5;
    public static final int SOURCE_TYPE_VIDEO_FRAME_DIGITAL_CAM = 6;
    public static final int SOURCE_TYPE_VIDEO_FRAME_UNKNOWN_SOURCE = 4;
    private static final int YAW = 0;
    private static final long serialVersionUID = -1751069410327594067L;
    private int colorSpace;
    private int deviceType;
    private int expression;
    private EyeColor eyeColor;
    private int faceImageType;
    private int featureMask;
    private FeaturePoint[] featurePoints;
    private Gender gender;
    private int hairColor;
    private int imageDataType;
    private int[] poseAngle;
    private int[] poseAngleUncertainty;
    private int quality;
    private long recordLength;
    private int sourceType;

    public enum Expression {
        UNSPECIFIED,
        NEUTRAL,
        SMILE_CLOSED,
        SMILE_OPEN,
        RAISED_EYEBROWS,
        EYES_LOOKING_AWAY,
        SQUINTING,
        FROWNING
    }

    public enum FaceImageType {
        BASIC,
        FULL_FRONTAL,
        TOKEN_FRONTAL
    }

    public enum Features {
        FEATURES_ARE_SPECIFIED,
        GLASSES,
        MOUSTACHE,
        BEARD,
        TEETH_VISIBLE,
        BLINK,
        MOUTH_OPEN,
        LEFT_EYE_PATCH,
        RIGHT_EYE_PATCH,
        DARK_GLASSES,
        DISTORTING_MEDICAL_CONDITION
    }

    public enum HairColor {
        UNSPECIFIED,
        BALD,
        BLACK,
        BLONDE,
        BROWN,
        GRAY,
        WHITE,
        RED,
        GREEN,
        BLUE,
        UNKNOWN
    }

    public enum ImageColorSpace {
        UNSPECIFIED,
        RGB24,
        YUV422,
        GRAY8,
        OTHER
    }

    public enum ImageDataType {
        TYPE_JPEG,
        TYPE_JPEG2000
    }

    public enum SourceType {
        UNSPECIFIED,
        STATIC_PHOTO_UNKNOWN_SOURCE,
        STATIC_PHOTO_DIGITAL_CAM,
        STATIC_PHOTO_SCANNER,
        VIDEO_FRAME_UNKNOWN_SOURCE,
        VIDEO_FRAME_ANALOG_CAM,
        VIDEO_FRAME_DIGITAL_CAM,
        UNKNOWN
    }

    public enum EyeColor {
        UNSPECIFIED {
            public final int toInt() {
                return 0;
            }
        },
        BLACK {
            public final int toInt() {
                return 1;
            }
        },
        BLUE {
            public final int toInt() {
                return 2;
            }
        },
        BROWN {
            public final int toInt() {
                return 3;
            }
        },
        GRAY {
            public final int toInt() {
                return 4;
            }
        },
        GREEN {
            public final int toInt() {
                return 5;
            }
        },
        MULTI_COLORED {
            public final int toInt() {
                return 6;
            }
        },
        PINK {
            public final int toInt() {
                return 7;
            }
        },
        UNKNOWN {
            public final int toInt() {
                return 8;
            }
        };

        public abstract int toInt();

        static EyeColor toEyeColor(int i) {
            for (EyeColor eyeColor : values()) {
                if (eyeColor.toInt() == i) {
                    return eyeColor;
                }
            }
            return UNKNOWN;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FaceImageInfo(net.p088sf.scuba.data.Gender r15, org.jmrtd.lds.iso19794.FaceImageInfo.EyeColor r16, int r17, int r18, int r19, int[] r20, int[] r21, int r22, int r23, int r24, int r25, int r26, org.jmrtd.lds.iso19794.FaceImageInfo.FeaturePoint[] r27, int r28, int r29, java.io.InputStream r30, int r31, int r32) throws java.io.IOException {
        /*
            r14 = this;
            r8 = r14
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r27
            r13 = r31
            long r5 = (long) r13
            java.lang.String r7 = toMimeType((int) r32)
            r1 = 0
            r0 = r14
            r2 = r28
            r3 = r29
            r4 = r30
            r0.<init>(r1, r2, r3, r4, r5, r7)
            if (r30 == 0) goto L_0x007f
            if (r15 != 0) goto L_0x0022
            net.sf.scuba.data.Gender r0 = net.p088sf.scuba.data.Gender.UNSPECIFIED
            goto L_0x0023
        L_0x0022:
            r0 = r15
        L_0x0023:
            r8.gender = r0
            if (r16 != 0) goto L_0x002a
            org.jmrtd.lds.iso19794.FaceImageInfo$EyeColor r0 = org.jmrtd.lds.iso19794.FaceImageInfo.EyeColor.UNSPECIFIED
            goto L_0x002c
        L_0x002a:
            r0 = r16
        L_0x002c:
            r8.eyeColor = r0
            r0 = r17
            r8.featureMask = r0
            r0 = r18
            r8.hairColor = r0
            r0 = r19
            r8.expression = r0
            r8.colorSpace = r9
            r8.sourceType = r10
            r8.deviceType = r11
            r0 = 0
            if (r12 != 0) goto L_0x0045
            r1 = r0
            goto L_0x0046
        L_0x0045:
            int r1 = r12.length
        L_0x0046:
            org.jmrtd.lds.iso19794.FaceImageInfo$FeaturePoint[] r2 = new org.jmrtd.lds.iso19794.FaceImageInfo.FeaturePoint[r1]
            r8.featurePoints = r2
            if (r1 <= 0) goto L_0x004f
            java.lang.System.arraycopy(r12, r0, r2, r0, r1)
        L_0x004f:
            r2 = 3
            int[] r3 = new int[r2]
            r8.poseAngle = r3
            r4 = r20
            java.lang.System.arraycopy(r4, r0, r3, r0, r2)
            int[] r3 = new int[r2]
            r8.poseAngleUncertainty = r3
            r4 = r21
            java.lang.System.arraycopy(r4, r0, r3, r0, r2)
            r0 = r32
            r8.imageDataType = r0
            int r0 = r1 << 3
            int r0 = r0 + 20
            int r0 = r0 + 12
            int r0 = r0 + r13
            long r0 = (long) r0
            r8.recordLength = r0
            r0 = r22
            r8.faceImageType = r0
            r8.colorSpace = r9
            r8.sourceType = r10
            r8.deviceType = r11
            r0 = r26
            r8.quality = r0
            return
        L_0x007f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Null image"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.iso19794.FaceImageInfo.<init>(net.sf.scuba.data.Gender, org.jmrtd.lds.iso19794.FaceImageInfo$EyeColor, int, int, int, int[], int[], int, int, int, int, int, org.jmrtd.lds.iso19794.FaceImageInfo$FeaturePoint[], int, int, java.io.InputStream, int, int):void");
    }

    public FaceImageInfo(InputStream inputStream) throws IOException {
        super(0);
        readObject(inputStream);
    }

    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        this.recordLength = ((long) dataInputStream.readInt()) & 4294967295L;
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.gender = Gender.MediaBrowserCompat$ItemReceiver(dataInputStream.readUnsignedByte());
        this.eyeColor = EyeColor.toEyeColor(dataInputStream.readUnsignedByte());
        this.hairColor = dataInputStream.readUnsignedByte();
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        this.featureMask = readUnsignedByte;
        this.featureMask = (readUnsignedByte << 16) | dataInputStream.readUnsignedShort();
        this.expression = dataInputStream.readShort();
        this.poseAngle = new int[3];
        this.poseAngle[0] = dataInputStream.readUnsignedByte();
        this.poseAngle[1] = dataInputStream.readUnsignedByte();
        this.poseAngle[2] = dataInputStream.readUnsignedByte();
        int[] iArr = new int[3];
        this.poseAngleUncertainty = iArr;
        iArr[0] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty[1] = dataInputStream.readUnsignedByte();
        this.poseAngleUncertainty[2] = dataInputStream.readUnsignedByte();
        this.featurePoints = new FeaturePoint[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            int readUnsignedByte2 = dataInputStream.readUnsignedByte();
            byte readByte = dataInputStream.readByte();
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            int readUnsignedShort3 = dataInputStream.readUnsignedShort();
            for (long j = 0; j < 2; j += dataInputStream.skip(2)) {
            }
            this.featurePoints[i] = new FeaturePoint(readUnsignedByte2, readByte, readUnsignedShort2, readUnsignedShort3);
        }
        this.faceImageType = dataInputStream.readUnsignedByte();
        this.imageDataType = dataInputStream.readUnsignedByte();
        setWidth(dataInputStream.readUnsignedShort());
        setHeight(dataInputStream.readUnsignedShort());
        this.colorSpace = dataInputStream.readUnsignedByte();
        this.sourceType = dataInputStream.readUnsignedByte();
        this.deviceType = dataInputStream.readUnsignedShort();
        this.quality = dataInputStream.readUnsignedShort();
        if (getWidth() <= 0) {
            setWidth(800);
        }
        if (getHeight() <= 0) {
            setHeight(600);
        }
        setMimeType(toMimeType(this.imageDataType));
        readImage(inputStream, ((this.recordLength - 20) - ((long) (readUnsignedShort << 3))) - 12);
    }

    public void writeObject(OutputStream outputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        writeFacialRecordData(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt((int) ((long) (byteArray.length + 4)));
        dataOutputStream.write(byteArray);
        dataOutputStream.flush();
    }

    public long getRecordLength() {
        return this.recordLength;
    }

    public FeaturePoint[] getFeaturePoints() {
        return this.featurePoints;
    }

    public int getExpression() {
        return this.expression;
    }

    public EyeColor getEyeColor() {
        return this.eyeColor;
    }

    public Gender getGender() {
        return this.gender;
    }

    public int getHairColor() {
        return this.hairColor;
    }

    public int getFaceImageType() {
        return this.faceImageType;
    }

    public int getFeatureMask() {
        return this.featureMask;
    }

    public int getQuality() {
        return this.quality;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public int getImageDataType() {
        return this.imageDataType;
    }

    public int getColorSpace() {
        return this.colorSpace;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public int[] getPoseAngle() {
        int[] iArr = new int[3];
        System.arraycopy(this.poseAngle, 0, iArr, 0, 3);
        return iArr;
    }

    public int[] getPoseAngleUncertainty() {
        int[] iArr = new int[3];
        System.arraycopy(this.poseAngleUncertainty, 0, iArr, 0, 3);
        return iArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image size: ");
        sb.append(getWidth());
        sb.append(" x ");
        sb.append(getHeight());
        sb.append("\n");
        sb.append("Gender: ");
        Gender gender2 = this.gender;
        if (gender2 == null) {
            gender2 = Gender.UNSPECIFIED;
        }
        sb.append(gender2);
        sb.append("\n");
        sb.append("Eye color: ");
        EyeColor eyeColor2 = this.eyeColor;
        if (eyeColor2 == null) {
            eyeColor2 = EyeColor.UNSPECIFIED;
        }
        sb.append(eyeColor2);
        sb.append("\n");
        sb.append("Hair color: ");
        sb.append(hairColorToString());
        sb.append("\n");
        sb.append("Feature mask: ");
        sb.append(featureMaskToString());
        sb.append("\n");
        sb.append("Expression: ");
        sb.append(expressionToString());
        sb.append("\n");
        sb.append("Pose angle: ");
        sb.append(poseAngleToString());
        sb.append("\n");
        sb.append("Face image type: ");
        sb.append(faceImageTypeToString());
        sb.append("\n");
        sb.append("Source type: ");
        sb.append(sourceTypeToString());
        sb.append("\n");
        sb.append("Feature points: ");
        sb.append("\n");
        FeaturePoint[] featurePointArr = this.featurePoints;
        if (featurePointArr == null || featurePointArr.length == 0) {
            sb.append("   (none)\n");
        } else {
            for (FeaturePoint obj : this.featurePoints) {
                sb.append("   ");
                sb.append(obj.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private void writeFacialRecordData(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeShort(this.featurePoints.length);
        Gender gender2 = this.gender;
        if (gender2 == null) {
            gender2 = Gender.UNSPECIFIED;
        }
        dataOutputStream.writeByte(gender2.IconCompatParcelizer());
        EyeColor eyeColor2 = this.eyeColor;
        if (eyeColor2 == null) {
            eyeColor2 = EyeColor.UNSPECIFIED;
        }
        dataOutputStream.writeByte(eyeColor2.toInt());
        dataOutputStream.writeByte(this.hairColor);
        dataOutputStream.writeByte((byte) ((int) ((((long) this.featureMask) & 16711680) >> 16)));
        dataOutputStream.writeByte((byte) ((int) ((((long) this.featureMask) & 65280) >> 8)));
        dataOutputStream.writeByte((byte) ((int) (((long) this.featureMask) & 255)));
        dataOutputStream.writeShort(this.expression);
        for (int i = 0; i < 3; i++) {
            dataOutputStream.writeByte(this.poseAngle[i]);
        }
        for (int i2 = 0; i2 < 3; i2++) {
            dataOutputStream.writeByte(this.poseAngleUncertainty[i2]);
        }
        int i3 = 0;
        while (true) {
            FeaturePoint[] featurePointArr = this.featurePoints;
            if (i3 < featurePointArr.length) {
                FeaturePoint featurePoint = featurePointArr[i3];
                dataOutputStream.writeByte(featurePoint.getType());
                dataOutputStream.writeByte((featurePoint.getMajorCode() << 4) | featurePoint.getMinorCode());
                dataOutputStream.writeShort(featurePoint.getX());
                dataOutputStream.writeShort(featurePoint.getY());
                dataOutputStream.writeShort(0);
                i3++;
            } else {
                dataOutputStream.writeByte(this.faceImageType);
                dataOutputStream.writeByte(this.imageDataType);
                dataOutputStream.writeShort(getWidth());
                dataOutputStream.writeShort(getHeight());
                dataOutputStream.writeByte(this.colorSpace);
                dataOutputStream.writeByte(this.sourceType);
                dataOutputStream.writeShort(this.deviceType);
                dataOutputStream.writeShort(this.quality);
                writeImage(dataOutputStream);
                dataOutputStream.flush();
                dataOutputStream.close();
                return;
            }
        }
    }

    private String hairColorToString() {
        switch (this.hairColor) {
            case 0:
                return "unspecified";
            case 1:
                return "bald";
            case 2:
                return "black";
            case 3:
                return "blonde";
            case 4:
                return "brown";
            case 5:
                return "gray";
            case 6:
                return "white";
            case 7:
                return "red";
            case 8:
                return "green";
            case 9:
                return "blue";
            default:
                return "unknown";
        }
    }

    private String featureMaskToString() {
        if ((this.featureMask & 1) == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.featureMask & 2) != 0) {
            arrayList.add("glasses");
        }
        if ((this.featureMask & 4) != 0) {
            arrayList.add("moustache");
        }
        if ((this.featureMask & 8) != 0) {
            arrayList.add("beard");
        }
        if ((this.featureMask & 16) != 0) {
            arrayList.add("teeth visible");
        }
        if ((this.featureMask & 32) != 0) {
            arrayList.add("blink");
        }
        if ((this.featureMask & 64) != 0) {
            arrayList.add("mouth open");
        }
        if ((this.featureMask & 128) != 0) {
            arrayList.add("left eye patch");
        }
        if ((this.featureMask & 256) != 0) {
            arrayList.add("right eye patch");
        }
        if ((this.featureMask & 512) != 0) {
            arrayList.add("dark glasses");
        }
        if ((this.featureMask & 1024) != 0) {
            arrayList.add("distorting medical condition (which could impact feature point detection)");
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((String) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String expressionToString() {
        switch (this.expression) {
            case 0:
                return "unspecified";
            case 1:
                return "neutral (non-smiling) with both eyes open and mouth closed";
            case 2:
                return "a smile where the inside of the mouth and/or teeth is not exposed (closed jaw)";
            case 3:
                return "a smile where the inside of the mouth and/or teeth is exposed";
            case 4:
                return "raised eyebrows";
            case 5:
                return "eyes looking away from the camera";
            case 6:
                return "squinting";
            case 7:
                return "frowning";
            default:
                return "unknown";
        }
    }

    private String poseAngleToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append("y: ");
        sb.append(this.poseAngle[0]);
        if (this.poseAngleUncertainty[0] != 0) {
            sb.append(" (");
            sb.append(this.poseAngleUncertainty[0]);
            sb.append(")");
        }
        sb.append(", ");
        sb.append("p:");
        sb.append(this.poseAngle[1]);
        if (this.poseAngleUncertainty[1] != 0) {
            sb.append(" (");
            sb.append(this.poseAngleUncertainty[1]);
            sb.append(")");
        }
        sb.append(", ");
        sb.append("r: ");
        sb.append(this.poseAngle[2]);
        if (this.poseAngleUncertainty[2] != 0) {
            sb.append(" (");
            sb.append(this.poseAngleUncertainty[2]);
            sb.append(")");
        }
        sb.append(")");
        return sb.toString();
    }

    private String faceImageTypeToString() {
        int i = this.faceImageType;
        if (i == 0) {
            return "basic";
        }
        if (i != 1) {
            return i != 2 ? "unknown" : "token frontal";
        }
        return "full frontal";
    }

    private String sourceTypeToString() {
        switch (this.sourceType) {
            case 0:
                return "unspecified";
            case 1:
                return "static photograph from an unknown source";
            case 2:
                return "static photograph from a digital still-image camera";
            case 3:
                return "static photograph from a scanner";
            case 4:
                return "single video frame from an unknown source";
            case 5:
                return "single video frame from an analogue camera";
            case 6:
                return "single video frame from a digital camera";
            default:
                return "unknown";
        }
    }

    private static String toMimeType(int i) {
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("DEBUG: Image type: ");
        sb.append(i);
        logger.info(sb.toString());
        if (i == 0) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i == 1) {
            return ImageInfo.JPEG2000_MIME_TYPE;
        }
        Logger logger2 = LOGGER;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DEBUG: Unknown image type: ");
        sb2.append(i);
        logger2.info(sb2.toString());
        return null;
    }

    /* renamed from: org.jmrtd.lds.iso19794.FaceImageInfo$1 */
    static /* synthetic */ class C104951 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$lds$iso19794$FaceImageInfo$ImageDataType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.jmrtd.lds.iso19794.FaceImageInfo$ImageDataType[] r0 = org.jmrtd.lds.iso19794.FaceImageInfo.ImageDataType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jmrtd$lds$iso19794$FaceImageInfo$ImageDataType = r0
                org.jmrtd.lds.iso19794.FaceImageInfo$ImageDataType r1 = org.jmrtd.lds.iso19794.FaceImageInfo.ImageDataType.TYPE_JPEG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$jmrtd$lds$iso19794$FaceImageInfo$ImageDataType     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jmrtd.lds.iso19794.FaceImageInfo$ImageDataType r1 = org.jmrtd.lds.iso19794.FaceImageInfo.ImageDataType.TYPE_JPEG2000     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.iso19794.FaceImageInfo.C104951.<clinit>():void");
        }
    }

    private static String toMimeType(ImageDataType imageDataType2) {
        int i = C104951.$SwitchMap$org$jmrtd$lds$iso19794$FaceImageInfo$ImageDataType[imageDataType2.ordinal()];
        if (i == 1) {
            return ImageInfo.JPEG_MIME_TYPE;
        }
        if (i != 2) {
            return null;
        }
        return "image/jpeg2000";
    }

    private static int fromMimeType(String str) {
        if (ImageInfo.JPEG_MIME_TYPE.equals(str)) {
            return 0;
        }
        if ("image/jpeg2000".equals(str) || ImageInfo.JPEG2000_MIME_TYPE.equals(str)) {
            return 1;
        }
        throw new IllegalArgumentException("Did not recognize mimeType");
    }

    public static class FeaturePoint {
        private int majorCode;
        private int minorCode;
        private int type;

        /* renamed from: x */
        private int f6388x;

        /* renamed from: y */
        private int f6389y;

        public FeaturePoint(int i, int i2, int i3, int i4, int i5) {
            this.type = i;
            this.majorCode = i2;
            this.minorCode = i3;
            this.f6388x = i4;
            this.f6389y = i5;
        }

        FeaturePoint(int i, byte b, int i2, int i3) {
            this(i, (b & 240) >> 4, b & 15, i2, i3);
        }

        public int getMajorCode() {
            return this.majorCode;
        }

        public int getMinorCode() {
            return this.minorCode;
        }

        public int getType() {
            return this.type;
        }

        public int getX() {
            return this.f6388x;
        }

        public int getY() {
            return this.f6389y;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("( point: ");
            sb.append(getMajorCode());
            sb.append(".");
            sb.append(getMinorCode());
            sb.append(", ");
            sb.append("type: ");
            sb.append(Integer.toHexString(this.type));
            sb.append(", ");
            sb.append("(");
            sb.append(this.f6388x);
            sb.append(", ");
            sb.append(this.f6389y);
            sb.append(")");
            sb.append(")");
            return sb.toString();
        }
    }
}

package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.version.KenVersion;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p040o.ModifyQuickTopUpReviewActivity;

@Deprecated
public class BasicSettingsProfile implements Serializable, Cloneable {
    private static final String TAG = BasicSettingsProfile.class.getSimpleName();
    private static final long serialVersionUID = -9103212200093175144L;
    /* access modifiers changed from: private */

    /* renamed from: bZ */
    public transient RotateType f172bZ = RotateType.ROTATE_NONE;
    /* access modifiers changed from: private */

    /* renamed from: ca */
    public transient CropType f173ca = CropType.CROP_NONE;
    /* access modifiers changed from: private */

    /* renamed from: cb */
    public transient BoundingTetragon f174cb = null;
    /* access modifiers changed from: private */

    /* renamed from: cc */
    public transient Boolean f175cc = Boolean.FALSE;
    /* access modifiers changed from: private */

    /* renamed from: cd */
    public transient OutputBitDepth f176cd = OutputBitDepth.COLOR;
    /* access modifiers changed from: private */

    /* renamed from: ce */
    public transient Float f177ce = null;
    /* access modifiers changed from: private */

    /* renamed from: cf */
    public transient Float f178cf = null;
    /* access modifiers changed from: private */
    public transient Integer outputDPI = null;

    public enum CropType {
        CROP_NONE,
        CROP_AUTO,
        CROP_TETRAGON,
        CROP_QUICKANALYSIS
    }

    public enum OutputBitDepth {
        BITONAL,
        GRAYSCALE,
        COLOR
    }

    public enum RotateType {
        ROTATE_NONE,
        ROTATE_90,
        ROTATE_180,
        ROTATE_270,
        ROTATE_AUTO
    }

    public BasicSettingsProfile clone() {
        try {
            BasicSettingsProfile basicSettingsProfile = (BasicSettingsProfile) super.clone();
            BoundingTetragon boundingTetragon = basicSettingsProfile.f174cb;
            if (boundingTetragon != null) {
                basicSettingsProfile.f174cb = boundingTetragon.clone();
            }
            return basicSettingsProfile;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("BasicSettingsProfile: unexpected clone not supported exception");
        }
    }

    public RotateType getRotateType() {
        return this.f172bZ;
    }

    public void setRotateType(RotateType rotateType) {
        m184a((Object) rotateType, "rotateType");
        this.f172bZ = rotateType;
    }

    public CropType getCropType() {
        return this.f173ca;
    }

    public void setCropType(CropType cropType) {
        m184a((Object) cropType, "cropType");
        this.f173ca = cropType;
    }

    public BoundingTetragon getCroppingTetragon() {
        BoundingTetragon boundingTetragon = this.f174cb;
        if (boundingTetragon != null) {
            return new BoundingTetragon(boundingTetragon.getTopLeft(), this.f174cb.getTopRight(), this.f174cb.getBottomLeft(), this.f174cb.getBottomRight());
        }
        return null;
    }

    public void setCroppingTetragon(BoundingTetragon boundingTetragon) {
        if (boundingTetragon == null) {
            this.f174cb = null;
            return;
        }
        m192f(boundingTetragon);
        if (this.f174cb == null) {
            this.f174cb = new BoundingTetragon();
        }
        this.f174cb.setTopLeft(boundingTetragon.getTopLeft());
        this.f174cb.setTopRight(boundingTetragon.getTopRight());
        this.f174cb.setBottomLeft(boundingTetragon.getBottomLeft());
        this.f174cb.setBottomRight(boundingTetragon.getBottomRight());
    }

    public boolean getDoDeskew() {
        return this.f175cc.booleanValue();
    }

    public void setDoDeskew(boolean z) {
        m184a((Object) Boolean.valueOf(z), "doDeskew");
        this.f175cc = Boolean.valueOf(z);
    }

    public Integer getOutputDPI() {
        return this.outputDPI;
    }

    public void setOutputDPI(Integer num) {
        if (num != null) {
            m184a((Object) num, "outputDPI");
        }
        this.outputDPI = num;
    }

    public OutputBitDepth getOutputBitDepth() {
        return this.f176cd;
    }

    public void setOutputBitDepth(OutputBitDepth outputBitDepth) {
        this.f176cd = outputBitDepth;
    }

    public Float getInputDocLongEdge() {
        return this.f177ce;
    }

    public void setInputDocLongEdge(Float f) {
        if (f != null) {
            m184a((Object) f, "inputDocLongEdge");
        }
        this.f177ce = f;
    }

    public Float getInputDocShortEdge() {
        return this.f178cf;
    }

    public void setInputDocShortEdge(Float f) {
        if (f != null) {
            m184a((Object) f, "inputDocShortEdge");
        }
        this.f178cf = f;
    }

    /* renamed from: a */
    private void m184a(Object obj, String str) {
        if (obj != null) {
            boolean z = false;
            if ((obj.getClass().getSimpleName().equals("Integer") && ((Integer) obj).intValue() < 0) || (obj.getClass().getSimpleName().equals("Float") && ((Float) obj).floatValue() < BitmapDescriptorFactory.HUE_RED)) {
                z = true;
            }
            if (z) {
                ErrorInfo errorInfo = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
                StringBuilder sb = new StringBuilder();
                sb.append("'");
                sb.append(str);
                sb.append("' parameter is negative");
                errorInfo.setErrCause(sb.toString());
                throw new KmcRuntimeException(errorInfo);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("'");
        sb2.append(str);
        sb2.append("' parameter is null");
        throw new NullPointerException(sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m186a(Float f) {
        return f != null && Math.abs(f.floatValue()) >= 1.0E-6f;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(BasicSettingsProfile.class.getName());
        objectOutputStream.writeObject(KenVersion.getPackageVersion());
        objectOutputStream.writeObject(this.f172bZ);
        objectOutputStream.writeObject(this.f173ca);
        objectOutputStream.writeObject(this.f174cb);
        objectOutputStream.writeObject(this.f175cc);
        objectOutputStream.writeObject(this.outputDPI);
        objectOutputStream.writeObject(this.f176cd);
        objectOutputStream.writeObject(this.f177ce);
        objectOutputStream.writeObject(this.f178cf);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException, KmcRuntimeException {
        objectInputStream.defaultReadObject();
        if (BasicSettingsProfile.class.getName().compareToIgnoreCase((String) objectInputStream.readObject()) == 0) {
            if (SdkVersion.versionCompatible(KenVersion.getPackageVersion(), (String) objectInputStream.readObject()).booleanValue()) {
                this.f172bZ = (RotateType) objectInputStream.readObject();
                this.f173ca = (CropType) objectInputStream.readObject();
                this.f174cb = (BoundingTetragon) objectInputStream.readObject();
                this.f175cc = (Boolean) objectInputStream.readObject();
                this.outputDPI = (Integer) objectInputStream.readObject();
                this.f176cd = (OutputBitDepth) objectInputStream.readObject();
                this.f177ce = (Float) objectInputStream.readObject();
                this.f178cf = (Float) objectInputStream.readObject();
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_VERSION_ERROR);
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_DESERIALIZE_OBJECT_ERROR);
    }

    /* renamed from: f */
    private void m192f(BoundingTetragon boundingTetragon) {
        Point topLeft = boundingTetragon.getTopLeft();
        Point topRight = boundingTetragon.getTopRight();
        Point bottomLeft = boundingTetragon.getBottomLeft();
        Point bottomRight = boundingTetragon.getBottomRight();
        if (topLeft.x >= topRight.x - 24 || bottomLeft.x >= bottomRight.x - 24 || topLeft.y >= bottomLeft.y - 24 || topRight.y >= bottomRight.y - 24) {
            throw new IllegalArgumentException("Cropping tetragon must be larger than 24 pixels");
        }
    }

    public class FriendBSP {
        private static final String DO_BINARIZATION = "_DoBinarization_";
        private static final String DO_CROP_CORRECTION = "_DoCropCorrection_";
        private static final String DO_ENHANCED_BINARIZATION = "_DoEnhancedBinarization_";
        private static final String DO_GRAY_OUTPUT = "_DoGrayOutput_";
        private static final String DO_SKEW_CORRECTION_PAGE = "_DoSkewCorrectionPage_";

        /* renamed from: ch */
        private static final String f180ch = "_Do90DegreeRotation_0";

        /* renamed from: ci */
        private static final String f181ci = "_Do90DegreeRotation_3";

        /* renamed from: cj */
        private static final String f182cj = "_Do90DegreeRotation_2";

        /* renamed from: ck */
        private static final String f183ck = "_Do90DegreeRotation_1";

        /* renamed from: cl */
        private static final String f184cl = "_Do90DegreeRotation_4";

        /* renamed from: cm */
        private static final String f185cm = "_DoScaleBWImageToDPI_";

        /* renamed from: cn */
        private static final String f186cn = "_DoScaleCGImageToDPI_";

        /* renamed from: co */
        private static final String f187co = "_DocDimLarge_";

        /* renamed from: cp */
        private static final String f188cp = "_DocDimSmall_";

        /* renamed from: cq */
        private static final String f189cq = "_LoadSetting_";

        /* renamed from: cr */
        private static final int f190cr = 300;

        public FriendBSP(String str) throws KmcException {
            if (!ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
            }
        }

        public String toFinalOpString() {
            String str;
            String str2 = "_DeviceType_2";
            if (BasicSettingsProfile.this.f172bZ != RotateType.ROTATE_NONE) {
                BasicSettingsProfile basicSettingsProfile = BasicSettingsProfile.this;
                RotateType unused = basicSettingsProfile.f172bZ = basicSettingsProfile.f172bZ;
                if (BasicSettingsProfile.this.f172bZ == RotateType.ROTATE_90) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(f181ci);
                    str2 = sb.toString();
                } else if (BasicSettingsProfile.this.f172bZ == RotateType.ROTATE_180) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(f182cj);
                    str2 = sb2.toString();
                } else if (BasicSettingsProfile.this.f172bZ == RotateType.ROTATE_270) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(f183ck);
                    str2 = sb3.toString();
                } else if (BasicSettingsProfile.this.f172bZ == RotateType.ROTATE_AUTO) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(f184cl);
                    str2 = sb4.toString();
                } else {
                    throw new IllegalArgumentException("unable to recognize rotateType");
                }
            }
            if (BasicSettingsProfile.this.f173ca != CropType.CROP_NONE) {
                if (BasicSettingsProfile.this.f173ca == CropType.CROP_AUTO) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append("_DoCropCorrection_");
                    str2 = sb5.toString();
                } else if (BasicSettingsProfile.this.f173ca == CropType.CROP_TETRAGON) {
                    BasicSettingsProfile basicSettingsProfile2 = BasicSettingsProfile.this;
                    BoundingTetragon unused2 = basicSettingsProfile2.f174cb = basicSettingsProfile2.f174cb;
                    BoundingTetragon.FriendBT friendBT = null;
                    if (BasicSettingsProfile.this.f174cb == null) {
                        str = "CropType requires non-null tetragon";
                    } else {
                        str = (BasicSettingsProfile.this.f174cb.getTopLeft() == null || BasicSettingsProfile.this.f174cb.getTopRight() == null || BasicSettingsProfile.this.f174cb.getBottomLeft() == null || BasicSettingsProfile.this.f174cb.getBottomRight() == null) ? "CropType requires non-null points" : null;
                    }
                    if (str == null) {
                        try {
                            friendBT = new BoundingTetragon.FriendBT(BuildConfig.APPLICATION_ID);
                        } catch (KmcException e) {
                            e.printStackTrace();
                            str = "Unable to convert croppingTetragon";
                        }
                        if (str != null) {
                            throw new IllegalArgumentException(str);
                        } else if (friendBT.isValid()) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str2);
                            sb6.append("_DoCropCorrection_");
                            String obj = sb6.toString();
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(obj);
                            sb7.append(friendBT.toExtCornersOpString(f189cq));
                            str2 = sb7.toString();
                        } else {
                            throw new IllegalArgumentException("Specified tetragon is unsorted");
                        }
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else if (BasicSettingsProfile.this.f173ca == CropType.CROP_QUICKANALYSIS) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str2);
                    sb8.append("_DoCropCorrection_");
                    str2 = sb8.toString();
                } else {
                    throw new IllegalArgumentException("Unable to recognize crop type");
                }
            }
            if (BasicSettingsProfile.this.f175cc.booleanValue()) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append("_DoSkewCorrectionPage_");
                str2 = sb9.toString();
            }
            OutputBitDepth e2 = BasicSettingsProfile.this.f176cd;
            if (e2 == null) {
                e2 = OutputBitDepth.COLOR;
            }
            if (e2 != OutputBitDepth.COLOR) {
                if (e2 == OutputBitDepth.GRAYSCALE) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(str2);
                    sb10.append("_DoGrayOutput_");
                    str2 = sb10.toString();
                } else if (e2 != OutputBitDepth.BITONAL) {
                    throw new IllegalArgumentException("unable to recognize outputBitDepth");
                }
            }
            int i = 0;
            if (!(BasicSettingsProfile.this.outputDPI == null || BasicSettingsProfile.this.outputDPI.intValue() == 0)) {
                i = BasicSettingsProfile.this.outputDPI.intValue();
            }
            if (e2 != OutputBitDepth.BITONAL) {
                if (i > 0) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(str2);
                    sb11.append(f186cn);
                    sb11.append(i);
                    str2 = sb11.toString();
                }
            } else if (i == 0) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str2);
                sb12.append("_DoBinarization_");
                str2 = sb12.toString();
            } else if (i < f190cr) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str2);
                sb13.append("_DoBinarization__DoScaleBWImageToDPI_");
                sb13.append(i);
                str2 = sb13.toString();
            } else {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str2);
                sb14.append("_DoEnhancedBinarization__DoScaleBWImageToDPI_");
                sb14.append(i);
                str2 = sb14.toString();
            }
            BasicSettingsProfile basicSettingsProfile3 = BasicSettingsProfile.this;
            if (basicSettingsProfile3.m186a(basicSettingsProfile3.f177ce)) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str2);
                sb15.append(f187co);
                sb15.append(String.valueOf(BasicSettingsProfile.this.f177ce));
                str2 = sb15.toString();
            }
            BasicSettingsProfile basicSettingsProfile4 = BasicSettingsProfile.this;
            if (!basicSettingsProfile4.m186a(basicSettingsProfile4.f178cf)) {
                return str2;
            }
            StringBuilder sb16 = new StringBuilder();
            sb16.append(str2);
            sb16.append(f188cp);
            sb16.append(String.valueOf(BasicSettingsProfile.this.f178cf));
            return sb16.toString();
        }
    }
}

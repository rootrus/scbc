package com.kofax.mobile.sdk.extract.p018id;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.extract.id.IdExtractionParameters */
public class IdExtractionParameters {
    public static final String PREPROCESS_ID2_STRING = "_DeviceType_2_Do90DegreeRotation_4_DoCropCorrection__DoScaleImageToDPI_500_DoSkewCorrectionPage__DocDimLarge_4.134_DocDimSmall_2.913_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value=\"0\" />";
    public static final String PREPROCESS_PASSPORT_STRING = "_DeviceType_2_DoCropCorrection__DoSkewCorrectionAlt__Do90DegreeRotation_4_DoScaleImageToDPI_500_DocDimSmall_3.465_DocDimLarge_4.921_";
    public static final String PREPROCESS_STRING = "_DeviceType_2_Do90DegreeRotation_4_DoCropCorrection__DoScaleImageToDPI_500_DoSkewCorrectionPage__DocDimLarge_3.375_DocDimSmall_2.125_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value=\"0\" />";
    private final IdRegion adG;
    private final String adH;
    private final IdType adI;
    private final Image adJ;
    private final Image adK;
    private final List<BarCodeResult> adL;
    private final List<BarCodeResult> adM;
    private final boolean adN;
    private final boolean adO;
    private final boolean adP;
    private final IIdExtractionListener adQ;
    private final IIdImageProcessingListener adR;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public IdExtractionParameters(IdRegion idRegion, IdType idType, Image image, List<BarCodeResult> list, Image image2, List<BarCodeResult> list2, boolean z, IIdExtractionListener iIdExtractionListener) {
        this(idRegion == null ? null : idRegion.getRegionName(), idType, image, list, image2, list2, z, iIdExtractionListener);
    }

    public IdExtractionParameters(String str, IdType idType, Image image, List<BarCodeResult> list, Image image2, List<BarCodeResult> list2, boolean z, IIdExtractionListener iIdExtractionListener) {
        this(str, idType, image, list, image2, list2, z, false, false, iIdExtractionListener, (IIdImageProcessingListener) null);
    }

    public IdExtractionParameters(String str, IdType idType, Image image, List<BarCodeResult> list, Image image2, List<BarCodeResult> list2, boolean z, boolean z2, boolean z3, IIdExtractionListener iIdExtractionListener, IIdImageProcessingListener iIdImageProcessingListener) {
        this.adH = str;
        this.adG = null;
        this.adI = idType;
        this.adJ = image;
        this.adL = list;
        this.adK = image2;
        this.adM = list2;
        this.adN = z;
        this.adO = z2;
        this.adP = z3;
        this.adQ = iIdExtractionListener;
        this.adR = iIdImageProcessingListener;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("region");
        } else if (idType == null) {
            throw new IllegalArgumentException("idType");
        } else if (m4778tV() && !m4779tW()) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION);
        } else if (m4778tV() && m4779tW() && !this.adH.equals(IdRegion.US.getRegionName()) && !this.adH.equals(IdRegion.CANADA.getRegionName())) {
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_NO_IMAGE_SUPPLIED);
        } else if (iIdExtractionListener == null) {
            throw new IllegalArgumentException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    /* renamed from: tV */
    private boolean m4778tV() {
        return this.adJ == null && this.adK == null;
    }

    /* renamed from: tW */
    private boolean m4779tW() {
        return m4780v(this.adL) || m4780v(this.adM);
    }

    /* renamed from: v */
    private boolean m4780v(List<BarCodeResult> list) {
        boolean z;
        if (list != null) {
            for (BarCodeResult value : list) {
                String value2 = value.getValue();
                if (value2 == null || value2.length() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    return true;
                }
            }
        }
        return false;
    }

    public IIdExtractionListener getListener() {
        return this.adQ;
    }

    public IIdExtractionListener getExtractionListener() {
        return this.adQ;
    }

    public IIdImageProcessingListener getImageProcessingListener() {
        return this.adR;
    }

    @Deprecated
    public IdRegion getRegion() {
        if (this.adG == null) {
            for (IdRegion idRegion : IdRegion.values()) {
                if (idRegion.getRegionName().equals(this.adH)) {
                    return idRegion;
                }
            }
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_OCR_ID_REGION_NOT_SET);
    }

    public String getProjectName() {
        return this.adH;
    }

    public IdType getIdType() {
        return this.adI;
    }

    public Image getFrontImage() {
        return this.adJ;
    }

    public Image getBackImage() {
        return this.adK;
    }

    public List<BarCodeResult> getFrontBarcodes() {
        return this.adL;
    }

    public List<BarCodeResult> getBackBarcodes() {
        return this.adM;
    }

    public boolean isProcessed() {
        return this.adN;
    }

    public boolean getExtractFaceImage() {
        return this.adO;
    }

    public boolean getExtractSignatureImage() {
        return this.adP;
    }
}

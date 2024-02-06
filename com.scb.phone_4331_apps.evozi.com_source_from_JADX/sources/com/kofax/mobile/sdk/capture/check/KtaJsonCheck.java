package com.kofax.mobile.sdk.capture.check;

import android.content.Context;
import com.kofax.mobile.sdk._internal.C7922i;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk.capture.model.Check;
import com.kofax.mobile.sdk.capture.model.CheckIQAData;
import com.kofax.mobile.sdk.capture.model.CheckUsabilityData;
import com.kofax.mobile.sdk.capture.model.Field;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class KtaJsonCheck extends Check implements C7922i {
    private static final String aaA = "CheckUsable";
    private static final String aaB = "A2iA_CheckCodeline";
    private static final String aaC = "A2iA_CheckCAR";
    private static final String aaD = "A2iA_CheckLAR";
    private static final String aaE = "A2iA_CheckPayeeName";
    private static final String aaF = "A2iA_CheckNumber";
    private static final String aaG = "A2iA_CheckDate";
    private static final String aaH = "A2iA_CheckCodeline_Transit";
    private static final String aaI = "A2iA_CheckCodeline_OnUs1";
    private static final String aaJ = "A2iA_CheckCodeline_AuxiliaryOnUs";
    private static final String aaK = "A2iA_CheckCodeline_OnUs2";
    private static final String aaL = "A2iA_CheckCodeline_EPC";
    private static final String aaM = "RestrictiveEndorsementPresent";
    private static final String aaN = "RestrictiveEndorsement";
    private static final String aaO = "ReasonForRejection";
    private static final String aaP = "A2iA_CheckCodeline_Amount";
    private static final String aaz = "A2iA_CheckAmount";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_check_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZW */
    IJsonExactionHelper f4702ZW;

    /* renamed from: ZX */
    private String f4703ZX;

    public KtaJsonCheck(Context context, String str) {
        if (str != null) {
            Injector.getInjector(context).injectMembers(this);
            this.f4702ZW.init(str);
            setJson(str);
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    public Field<String> getUsable() {
        return this.f4702ZW.getString(aaA);
    }

    public Field<String> getAmount() {
        return this.f4702ZW.getString(aaz);
    }

    public Field<String> getCar() {
        return this.f4702ZW.getString(aaC);
    }

    public Field<String> getLar() {
        return this.f4702ZW.getString(aaD);
    }

    public Field<String> getPayee() {
        return this.f4702ZW.getString(aaE);
    }

    public Field<String> getCheckNumber() {
        return this.f4702ZW.getString(aaF);
    }

    public Field<String> getDate() {
        return this.f4702ZW.getString(aaG);
    }

    public Field<String> getMicr() {
        return this.f4702ZW.getString(aaB);
    }

    public Field<String> getRestrictiveEndorsementPresent() {
        return this.f4702ZW.getString(aaM);
    }

    public Field<String> getRestrictiveEndorsement() {
        return this.f4702ZW.getString(aaN);
    }

    public Field<String> getReasonForRejection() {
        return this.f4702ZW.getString(aaO);
    }

    public Field<String> getOnUs1() {
        return this.f4702ZW.getString(aaI);
    }

    public Field<String> getTransit() {
        return this.f4702ZW.getString(aaH);
    }

    public Field<String> getEpc() {
        return this.f4702ZW.getString(aaL);
    }

    public Field<String> getMicrAmount() {
        return this.f4702ZW.getString(aaP);
    }

    public CheckIQAData getCheckIQAData() {
        return new C8315a();
    }

    public CheckUsabilityData getCheckUsabilityData() {
        return new C8316b();
    }

    public String getRawData() {
        return this.f4703ZX;
    }

    public Field<String> getAuxiliaryOnUs() {
        return this.f4702ZW.getString(aaJ);
    }

    public Field<String> getOnUs2() {
        return this.f4702ZW.getString(aaK);
    }

    public void setJson(String str) {
        this.f4703ZX = str;
    }

    /* renamed from: com.kofax.mobile.sdk.capture.check.KtaJsonCheck$b */
    class C8316b extends CheckUsabilityData {
        private final String DATE;
        private final String aaC;
        private final String aaD;
        private final String abU;
        private final String abV;
        private final String abW;
        private final String abX;

        private C8316b() {
            this.aaC = "UsabilityFailure_CAR";
            this.aaD = "UsabilityFailure_LAR";
            this.abU = "UsabilityFailure_Signature";
            this.abV = "UsabilityFailure_PayeeName";
            this.DATE = "UsabilityFailure_Date";
            this.abW = "UsabilityFailure_Codeline";
            this.abX = "UsabilityFailure_PayeeEndorsement";
        }

        public Field<String> getCAR() {
            return KtaJsonCheck.this.f4702ZW.getString("UsabilityFailure_CAR");
        }

        public Field<String> getLAR() {
            return KtaJsonCheck.this.f4702ZW.getString("UsabilityFailure_LAR");
        }

        public Field<String> getSignature() {
            return KtaJsonCheck.this.f4702ZW.getString("UsabilityFailure_Signature");
        }

        public Field<String> gePayeeName() {
            return KtaJsonCheck.this.f4702ZW.getString("UsabilityFailure_PayeeName");
        }

        public Field<String> getDate() {
            return KtaJsonCheck.this.f4702ZW.getString("UsabilityFailure_Date");
        }

        public Field<String> getCodeline() {
            return KtaJsonCheck.this.f4702ZW.getString("UsabilityFailure_Codeline");
        }

        public Field<String> getPayeeEndorsement() {
            return KtaJsonCheck.this.f4702ZW.getString("UsabilityFailure_PayeeEndorsement");
        }
    }

    /* renamed from: com.kofax.mobile.sdk.capture.check.KtaJsonCheck$a */
    class C8315a extends CheckIQAData {
        private final String aaQ;
        private final String aaR;
        private final String aaS;
        private final String aaT;
        private final String aaU;
        private final String aaV;
        private final String aaW;
        private final String aaX;
        private final String aaY;
        private final String aaZ;
        private final String abA;
        private final String abB;
        private final String abC;
        private final String abD;
        private final String abE;
        private final String abF;
        private final String abG;
        private final String abH;
        private final String abI;
        private final String abJ;
        private final String abK;
        private final String abL;
        private final String abM;
        private final String abN;
        private final String abO;
        private final String abP;
        private final String abQ;
        private final String abR;
        private final String abS;
        private final String aba;
        private final String abb;
        private final String abc;
        private final String abd;
        private final String abe;
        private final String abf;
        private final String abg;
        private final String abh;
        private final String abi;
        private final String abj;
        private final String abk;
        private final String abl;
        private final String abm;
        private final String abn;
        private final String abo;
        private final String abp;
        private final String abq;
        private final String abr;
        private final String abs;
        private final String abt;
        private final String abu;
        private final String abv;
        private final String abw;
        private final String abx;
        private final String aby;
        private final String abz;

        private C8315a() {
            this.aaQ = "IQA_ImageWidth";
            this.aaR = "IQA_ImageHeight";
            this.aaS = "IQA_TopLeftCornerWidth";
            this.aaT = "IQA_TopLeftCornerHeight";
            this.aaU = "IQA_BottomLeftCornerWidth";
            this.aaV = "IQA_BottomLeftCornerHeight";
            this.aaW = "IQA_TopRightCornerWidth";
            this.aaX = "IQA_TopRightCornerHeight";
            this.aaY = "IQA_BottomRightCornerWidth";
            this.aaZ = "IQA_BottomRightCornerHeight";
            this.aba = "IQA_TopEdgeTearWidth";
            this.abb = "IQA_TopEdgeTearHeight";
            this.abc = "IQA_RightEdgeTearWidth";
            this.abd = "IQA_RightEdgeTearHeight";
            this.abe = "IQA_BottomEdgeTearWidth";
            this.abf = "IQA_BottomEdgeTearHeight";
            this.abg = "IQA_LeftEdgeTearWidth";
            this.abh = "IQA_LeftEdgeTearHeight";
            this.abi = "IQA_AdditionalLeftScanLinesWidth";
            this.abj = "IQA_AdditionalTopScanLinesHeight";
            this.abk = "IQA_AdditionalRightScanLinesWidth";
            this.abl = "IQA_AdditionalBottomScanLinesHeight";
            this.abm = "IQA_DocumentSkewAngle";
            this.abn = "IQA_PercentBlackPixels";
            this.abo = "IQA_PercentAverageImageBrightness";
            this.abp = "IQA_PercentAverageImageContrast";
            this.abq = "IQA_BlackStreakCount";
            this.abr = "IQA_BlackStreakMaxHeight";
            this.abs = "IQA_GrayLevelStreakCount";
            this.abt = "IQA_GrayLevelStreakMaxHeight";
            this.abu = "IQA_AverageSpotNoiseGroupingsPerSquareInch";
            this.abv = "IQA_FrontRearWidthDifference";
            this.abw = "IQA_FrontRearHeightDifference";
            this.abx = "IQA_CarbonStripHeight";
            this.aby = "IQA_ImageFocusScore";
            this.abz = "IQA_CompressedFrontImageSize";
            this.abA = "IQA_CompressedRearImageSize";
            this.abB = "IQAFailure_UndersizeImage";
            this.abC = "IQAFailure_FoldedOrTornDocumentCorners";
            this.abD = "IQAFailure_FoldedOrTornDocumentEdges";
            this.abE = "IQAFailure_DocumentFramingError";
            this.abF = "IQAFailure_DocumentSkew";
            this.abG = "IQAFailure_OversizeImage";
            this.abH = "IQAFailure_PiggybackDocument";
            this.abI = "IQAFailure_ImageTooLight";
            this.abJ = "IQAFailure_ImageTooDark";
            this.abK = "IQAFailure_HorizontalStreaks";
            this.abL = "IQAFailure_BelowMinFrontImageSize";
            this.abM = "IQAFailure_AboveMaxFrontImageSize";
            this.abN = "IQAFailure_BelowMinRearImageSize";
            this.abO = "IQAFailure_AboveMaxRearImageSize";
            this.abP = "IQAFailure_SpotNoise";
            this.abQ = "IQAFailure_ImageDimensionMismatch";
            this.abR = "IQAFailure_CarbonStrip";
            this.abS = "IQAFailure_OutOfFocus";
        }

        public Field<String> getImageWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_ImageWidth");
        }

        public Field<String> getImageHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_ImageHeight");
        }

        public Field<String> getTopLeftCornerWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_TopLeftCornerWidth");
        }

        public Field<String> getTopLeftCornerHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_TopLeftCornerHeight");
        }

        public Field<String> getBottomLeftCornerWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BottomLeftCornerWidth");
        }

        public Field<String> getBottomLeftCornerHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BottomLeftCornerHeight");
        }

        public Field<String> getTopRightCornerWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_TopRightCornerWidth");
        }

        public Field<String> getTopRightCornerHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_TopRightCornerHeight");
        }

        public Field<String> getBottomRightCornerWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BottomRightCornerWidth");
        }

        public Field<String> getBottomRightCornerHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BottomRightCornerHeight");
        }

        public Field<String> getTopEdgeTearWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_TopEdgeTearWidth");
        }

        public Field<String> getTopEdgeTearHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_TopEdgeTearHeight");
        }

        public Field<String> getRightEdgeTearWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_RightEdgeTearWidth");
        }

        public Field<String> getRightEdgeTearHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_RightEdgeTearHeight");
        }

        public Field<String> getBottomEdgeTearWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BottomEdgeTearWidth");
        }

        public Field<String> getBottomEdgeTearHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BottomEdgeTearHeight");
        }

        public Field<String> getLeftEdgeTearWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_LeftEdgeTearWidth");
        }

        public Field<String> getLeftEdgeTearHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_LeftEdgeTearHeight");
        }

        public Field<String> getAdditionalLeftScanLinesWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_AdditionalLeftScanLinesWidth");
        }

        public Field<String> getAdditionalTopScanLinesHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_AdditionalTopScanLinesHeight");
        }

        public Field<String> getAdditionalRightScanLinesWidth() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_AdditionalRightScanLinesWidth");
        }

        public Field<String> getAdditionalBottomScanLinesHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_AdditionalBottomScanLinesHeight");
        }

        public Field<String> getDocumentSkewAngle() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_DocumentSkewAngle");
        }

        public Field<String> getPercentBlackPixels() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_PercentBlackPixels");
        }

        public Field<String> getPercentAverageImageBrightness() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_PercentAverageImageBrightness");
        }

        public Field<String> getPercentAverageImageContrast() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_PercentAverageImageContrast");
        }

        public Field<String> getBlackStreakCount() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BlackStreakCount");
        }

        public Field<String> getBlackStreakMaxHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_BlackStreakMaxHeight");
        }

        public Field<String> getGrayLevelStreakCount() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_GrayLevelStreakCount");
        }

        public Field<String> getGrayLevelStreakMaxHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_GrayLevelStreakMaxHeight");
        }

        public Field<String> getAverageSpotNoiseGroupingsPerSquareInch() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_AverageSpotNoiseGroupingsPerSquareInch");
        }

        public Field<String> getFrontRearWidthDifference() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_FrontRearWidthDifference");
        }

        public Field<String> getFrontRearHeightDifference() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_FrontRearHeightDifference");
        }

        public Field<String> getCarbonStripHeight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_CarbonStripHeight");
        }

        public Field<String> getImageFocusScore() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_ImageFocusScore");
        }

        public Field<String> getCompressedFrontImageSize() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_CompressedFrontImageSize");
        }

        public Field<String> getCompressedRearImageSize() {
            return KtaJsonCheck.this.f4702ZW.getString("IQA_CompressedRearImageSize");
        }

        public Field<String> getUndersizeImage() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_UndersizeImage");
        }

        public Field<String> getFoldedOrTornDocumentCorners() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_FoldedOrTornDocumentCorners");
        }

        public Field<String> getFoldedOrTornDocumentEdges() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_FoldedOrTornDocumentEdges");
        }

        public Field<String> getDocumentFramingError() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_DocumentFramingError");
        }

        public Field<String> getDocumentSkew() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_DocumentSkew");
        }

        public Field<String> getOversizeImage() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_OversizeImage");
        }

        public Field<String> getPiggybackDocument() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_PiggybackDocument");
        }

        public Field<String> getImageTooLight() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_ImageTooLight");
        }

        public Field<String> getImageTooDark() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_ImageTooDark");
        }

        public Field<String> getHorizontalStreaks() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_HorizontalStreaks");
        }

        public Field<String> getBelowMinFrontImageSize() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_BelowMinFrontImageSize");
        }

        public Field<String> getAboveMaxFrontImageSize() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_AboveMaxFrontImageSize");
        }

        public Field<String> getBelowMinRearImageSize() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_BelowMinRearImageSize");
        }

        public Field<String> getAboveMaxRearImageSize() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_AboveMaxRearImageSize");
        }

        public Field<String> getSpotNoise() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_SpotNoise");
        }

        public Field<String> getImageDimensionMismatch() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_ImageDimensionMismatch");
        }

        public Field<String> getCarbonStrip() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_CarbonStrip");
        }

        public Field<String> getOutOfFocus() {
            return KtaJsonCheck.this.f4702ZW.getString("IQAFailure_OutOfFocus");
        }
    }
}

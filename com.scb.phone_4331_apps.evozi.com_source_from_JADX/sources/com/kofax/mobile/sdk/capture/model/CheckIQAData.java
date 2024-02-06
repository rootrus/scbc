package com.kofax.mobile.sdk.capture.model;

import java.io.Serializable;

public abstract class CheckIQAData implements Serializable {
    public abstract Field<String> getAboveMaxFrontImageSize();

    public abstract Field<String> getAboveMaxRearImageSize();

    public abstract Field<String> getAdditionalBottomScanLinesHeight();

    public abstract Field<String> getAdditionalLeftScanLinesWidth();

    public abstract Field<String> getAdditionalRightScanLinesWidth();

    public abstract Field<String> getAdditionalTopScanLinesHeight();

    public abstract Field<String> getAverageSpotNoiseGroupingsPerSquareInch();

    public abstract Field<String> getBelowMinFrontImageSize();

    public abstract Field<String> getBelowMinRearImageSize();

    public abstract Field<String> getBlackStreakCount();

    public abstract Field<String> getBlackStreakMaxHeight();

    public abstract Field<String> getBottomEdgeTearHeight();

    public abstract Field<String> getBottomEdgeTearWidth();

    public abstract Field<String> getBottomLeftCornerHeight();

    public abstract Field<String> getBottomLeftCornerWidth();

    public abstract Field<String> getBottomRightCornerHeight();

    public abstract Field<String> getBottomRightCornerWidth();

    public abstract Field<String> getCarbonStrip();

    public abstract Field<String> getCarbonStripHeight();

    public abstract Field<String> getCompressedFrontImageSize();

    public abstract Field<String> getCompressedRearImageSize();

    public abstract Field<String> getDocumentFramingError();

    public abstract Field<String> getDocumentSkew();

    public abstract Field<String> getDocumentSkewAngle();

    public abstract Field<String> getFoldedOrTornDocumentCorners();

    public abstract Field<String> getFoldedOrTornDocumentEdges();

    public abstract Field<String> getFrontRearHeightDifference();

    public abstract Field<String> getFrontRearWidthDifference();

    public abstract Field<String> getGrayLevelStreakCount();

    public abstract Field<String> getGrayLevelStreakMaxHeight();

    public abstract Field<String> getHorizontalStreaks();

    public abstract Field<String> getImageDimensionMismatch();

    public abstract Field<String> getImageFocusScore();

    public abstract Field<String> getImageHeight();

    public abstract Field<String> getImageTooDark();

    public abstract Field<String> getImageTooLight();

    public abstract Field<String> getImageWidth();

    public abstract Field<String> getLeftEdgeTearHeight();

    public abstract Field<String> getLeftEdgeTearWidth();

    public abstract Field<String> getOutOfFocus();

    public abstract Field<String> getOversizeImage();

    public abstract Field<String> getPercentAverageImageBrightness();

    public abstract Field<String> getPercentAverageImageContrast();

    public abstract Field<String> getPercentBlackPixels();

    public abstract Field<String> getPiggybackDocument();

    public abstract Field<String> getRightEdgeTearHeight();

    public abstract Field<String> getRightEdgeTearWidth();

    public abstract Field<String> getSpotNoise();

    public abstract Field<String> getTopEdgeTearHeight();

    public abstract Field<String> getTopEdgeTearWidth();

    public abstract Field<String> getTopLeftCornerHeight();

    public abstract Field<String> getTopLeftCornerWidth();

    public abstract Field<String> getTopRightCornerHeight();

    public abstract Field<String> getTopRightCornerWidth();

    public abstract Field<String> getUndersizeImage();
}

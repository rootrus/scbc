package org.jnbis.record;

import org.jnbis.internal.record.BaseImageRecord;

public class FacialAndSmtImage extends BaseImageRecord {
    private String colorSpace;
    private String colorsPresent;
    private String deviceMonitoringMode;
    private String facialFeaturePoints;
    private String horizontalPixelScale;
    private String imageType;
    private String ncicDesignationCode;
    private String photoAcquisitionSource;
    private String photoDate;
    private String photoDescription;
    private String poseOffsetAngle;
    private String scaleUnits;
    private String scannedHorizontalPixelScale;
    private String scannedVerticalPixelScale;
    private String scarMarkTattooSize;
    private String smtDescriptors;
    private String sourceAgency;
    private String subjectAcquisitionProfile;
    private String subjectEyeColor;
    private String subjectFacialDescription;
    private String subjectHairColor;
    private String subjectPose;
    private String subjectPoseAngles;
    private String subjectQualityScore;
    private String verticalPixelScale;

    public String getImageType() {
        return this.imageType;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public String getSourceAgency() {
        return this.sourceAgency;
    }

    public void setSourceAgency(String str) {
        this.sourceAgency = str;
    }

    public String getPhotoDate() {
        return this.photoDate;
    }

    public void setPhotoDate(String str) {
        this.photoDate = str;
    }

    public String getScaleUnits() {
        return this.scaleUnits;
    }

    public void setScaleUnits(String str) {
        this.scaleUnits = str;
    }

    public String getHorizontalPixelScale() {
        return this.horizontalPixelScale;
    }

    public void setHorizontalPixelScale(String str) {
        this.horizontalPixelScale = str;
    }

    public String getVerticalPixelScale() {
        return this.verticalPixelScale;
    }

    public void setVerticalPixelScale(String str) {
        this.verticalPixelScale = str;
    }

    public String getColorSpace() {
        return this.colorSpace;
    }

    public void setColorSpace(String str) {
        this.colorSpace = str;
    }

    public String getSubjectAcquisitionProfile() {
        return this.subjectAcquisitionProfile;
    }

    public void setSubjectAcquisitionProfile(String str) {
        this.subjectAcquisitionProfile = str;
    }

    public String getScannedHorizontalPixelScale() {
        return this.scannedHorizontalPixelScale;
    }

    public void setScannedHorizontalPixelScale(String str) {
        this.scannedHorizontalPixelScale = str;
    }

    public String getScannedVerticalPixelScale() {
        return this.scannedVerticalPixelScale;
    }

    public void setScannedVerticalPixelScale(String str) {
        this.scannedVerticalPixelScale = str;
    }

    public String getSubjectPose() {
        return this.subjectPose;
    }

    public void setSubjectPose(String str) {
        this.subjectPose = str;
    }

    public String getPoseOffsetAngle() {
        return this.poseOffsetAngle;
    }

    public void setPoseOffsetAngle(String str) {
        this.poseOffsetAngle = str;
    }

    public String getPhotoDescription() {
        return this.photoDescription;
    }

    public void setPhotoDescription(String str) {
        this.photoDescription = str;
    }

    public String getPhotoAcquisitionSource() {
        return this.photoAcquisitionSource;
    }

    public void setPhotoAcquisitionSource(String str) {
        this.photoAcquisitionSource = str;
    }

    public String getSubjectQualityScore() {
        return this.subjectQualityScore;
    }

    public void setSubjectQualityScore(String str) {
        this.subjectQualityScore = str;
    }

    public String getSubjectPoseAngles() {
        return this.subjectPoseAngles;
    }

    public void setSubjectPoseAngles(String str) {
        this.subjectPoseAngles = str;
    }

    public String getSubjectFacialDescription() {
        return this.subjectFacialDescription;
    }

    public void setSubjectFacialDescription(String str) {
        this.subjectFacialDescription = str;
    }

    public String getSubjectEyeColor() {
        return this.subjectEyeColor;
    }

    public void setSubjectEyeColor(String str) {
        this.subjectEyeColor = str;
    }

    public String getSubjectHairColor() {
        return this.subjectHairColor;
    }

    public void setSubjectHairColor(String str) {
        this.subjectHairColor = str;
    }

    public String getFacialFeaturePoints() {
        return this.facialFeaturePoints;
    }

    public void setFacialFeaturePoints(String str) {
        this.facialFeaturePoints = str;
    }

    public String getDeviceMonitoringMode() {
        return this.deviceMonitoringMode;
    }

    public void setDeviceMonitoringMode(String str) {
        this.deviceMonitoringMode = str;
    }

    public String getNcicDesignationCode() {
        return this.ncicDesignationCode;
    }

    public void setNcicDesignationCode(String str) {
        this.ncicDesignationCode = str;
    }

    public String getScarMarkTattooSize() {
        return this.scarMarkTattooSize;
    }

    public void setScarMarkTattooSize(String str) {
        this.scarMarkTattooSize = str;
    }

    public String getSmtDescriptors() {
        return this.smtDescriptors;
    }

    public void setSmtDescriptors(String str) {
        this.smtDescriptors = str;
    }

    public String getColorsPresent() {
        return this.colorsPresent;
    }

    public void setColorsPresent(String str) {
        this.colorsPresent = str;
    }
}

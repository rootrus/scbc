package com.kofax.kmc.ken.engines.data;

public class DocumentDetectionSettings extends DetectionSettings {

    /* renamed from: cO */
    private double f210cO = 0.85d;

    /* renamed from: cP */
    private double f211cP = 0.85d;

    /* renamed from: cQ */
    private DocumentEdgeDetection f212cQ = DocumentEdgeDetection.GPU_BASED;

    public enum DocumentEdgeDetection {
        ISG,
        GPU_BASED
    }

    public DocumentDetectionSettings() {
        setMinFillFraction(0.2d);
    }

    public DocumentDetectionSettings(DocumentDetectionSettings documentDetectionSettings) {
        super(documentDetectionSettings);
        this.f210cO = documentDetectionSettings.f210cO;
        this.f211cP = documentDetectionSettings.f211cP;
        this.f212cQ = documentDetectionSettings.f212cQ;
    }

    public DocumentDetectionSettings(DetectionSettings detectionSettings) {
        super(detectionSettings);
    }

    public double getShortEdgeThreshold() {
        return this.f210cO;
    }

    public void setShortEdgeThreshold(double d) {
        m201b(d);
        this.f210cO = d;
    }

    public double getLongEdgeThreshold() {
        return this.f211cP;
    }

    public void setLongEdgeThreshold(double d) {
        m201b(d);
        this.f211cP = d;
    }

    /* renamed from: b */
    private static void m201b(double d) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException();
        }
    }

    public DocumentEdgeDetection getEdgeDetection() {
        return this.f212cQ;
    }

    public void setEdgeDetection(DocumentEdgeDetection documentEdgeDetection) {
        this.f212cQ = documentEdgeDetection;
    }
}

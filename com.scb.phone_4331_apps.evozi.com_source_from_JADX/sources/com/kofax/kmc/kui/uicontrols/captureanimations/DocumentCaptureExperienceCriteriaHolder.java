package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;

public class DocumentCaptureExperienceCriteriaHolder extends DocumentBaseCaptureExperienceCriteriaHolder {

    /* renamed from: nf */
    private DocumentDetectionSettings f697nf = new DocumentDetectionSettings();

    public DocumentCaptureExperienceCriteriaHolder() {
    }

    DocumentCaptureExperienceCriteriaHolder(DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder) {
        super(documentCaptureExperienceCriteriaHolder);
        setDetectionSettings(new DocumentDetectionSettings(documentCaptureExperienceCriteriaHolder.getDetectionSettings()));
    }

    public void setDetectionSettings(DocumentDetectionSettings documentDetectionSettings) {
        this.f697nf = documentDetectionSettings;
    }

    public DocumentDetectionSettings getDetectionSettings() {
        return this.f697nf;
    }
}

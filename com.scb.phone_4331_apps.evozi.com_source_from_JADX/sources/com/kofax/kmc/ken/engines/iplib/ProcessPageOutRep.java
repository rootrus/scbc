package com.kofax.kmc.ken.engines.iplib;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.QuickAnalysisSettings;
import com.kofax.kmc.ken.engines.service.ImageService;

public class ProcessPageOutRep {
    final int KIPPOUTREP_BITMAP = 1;
    final int KIPPOUTREP_BOTH = 3;
    final int KIPPOUTREP_FILE = 2;
    final int KIPPOUTREP_NONE = 0;
    final int QUICKANALYSISMODE_METADATAONLY = 1;
    final int QUICKANALYSISMODE_METADATAPLUSIMAGE = 2;
    final int QUICKANALYSISMODE_OFF = 0;
    public boolean callbackOnWorkerThread;
    public String exifMetadataStr;
    public String imageID;
    public Image.ImageMimeType imageMimeType;
    public int imageMimeTypeCode;
    public Image.ImageRep imageRep;
    public int imageRepCode;
    public boolean isGlareDetected = false;
    public String processedFilePathStr;
    public int processedImageJpegQuality;
    public int quickAnalysisMode;
    public QuickAnalysisSettings quickAnalysisSettings;

    public void setImageRep(Image.ImageRep imageRep2) {
        this.imageRep = imageRep2;
        if (Image.ImageRep.IMAGE_REP_BITMAP == imageRep2) {
            this.imageRepCode = 1;
        } else if (Image.ImageRep.IMAGE_REP_BOTH == imageRep2) {
            this.imageRepCode = 3;
        } else if (Image.ImageRep.IMAGE_REP_FILE == imageRep2) {
            this.imageRepCode = 2;
        } else if (Image.ImageRep.IMAGE_REP_NONE == imageRep2) {
            this.imageRepCode = 0;
        } else {
            throw new InternalError("ProcessPageOutRep: unable to recognize imageRep");
        }
    }

    public void setImageMimeType(Image.ImageMimeType imageMimeType2) {
        this.imageMimeType = imageMimeType2;
        this.imageMimeTypeCode = ImageService.imgMimeTypetoIpFileType(imageMimeType2);
    }

    public void setGlareDetected(boolean z) {
        this.isGlareDetected = z;
    }

    public boolean getGlareDetected() {
        return this.isGlareDetected;
    }

    public void setQuickAnalysisMode(boolean z, boolean z2) {
        if (!z) {
            this.quickAnalysisMode = 0;
        } else {
            this.quickAnalysisMode = z2 ? 2 : 1;
        }
    }

    public void setQuickAnalysisSettings(QuickAnalysisSettings quickAnalysisSettings2) {
        this.quickAnalysisSettings = quickAnalysisSettings2;
    }

    public boolean isQuickAnalysisEnabled() {
        return this.quickAnalysisMode != 0;
    }

    public boolean isQuickAnalysisBitmapNeeded() {
        return 2 == this.quickAnalysisMode;
    }
}

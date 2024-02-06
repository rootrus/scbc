package com.kofax.kmc.kut.utilities.appstats.type;

public enum AppStatsEventIDType {
    APP_STATS_UNKNOWN_EVENT("Unknown"),
    APP_STATS_ERROR_LOG_EVENT("ErrorLog"),
    APP_STATS_ENVIRONMENT_CHANGED_EVENT("EnvironmentChanged"),
    APP_STATS_FIELD_CHANGE_EVENT(""),
    APP_STATS_CLASSIFY_START_EVENT(""),
    APP_STATS_CLASSIFY_STOP_EVENT(""),
    APP_STATS_IMG_PROC_START_EVENT(""),
    APP_STATS_IMG_PROC_STOP_EVENT(""),
    APP_STATS_BAR_READER_START_EVENT(""),
    APP_STATS_BAR_READER_STOP_EVENT(""),
    APP_STATS_BAR_CAPTURE_EVENT("BarcodeCapture"),
    APP_STATS_IMG_REVIEW_MOVE_EVENT("Review"),
    APP_STATS_KFS_KTA_SERVER_START_EVENT("ServerStart"),
    APP_STATS_KFS_KTA_SERVER_STOP_EVENT("ServerStop"),
    APP_STATS_PROPERTY_CHANGE_EVENT("PropertyChanged"),
    APP_STATS_IMG_CAPTURE_EVENT("Capture"),
    APP_STATS_IMG_CAPTURE_FOCUS("Focus"),
    APP_STATS_IMG_CAPTURE_STABILITY("Stability"),
    APP_STATS_IMG_CAPTURE_LEVELNESS("Levelness"),
    APP_STATS_IMG_CAPTURE_PAGEDETECT("PageDetect"),
    APP_STATS_FIELD_CHANGED("FieldChangedEvent"),
    APP_STATS_BEGIN_SESSION_EVENT("BeginSessionEvent"),
    APP_STATS_LOG_SESSION_EVENT("LogSessionEvent"),
    APP_STATS_END_SESSION_EVENT("EndSessionEvent"),
    APP_STATS_DOCUMENT_CREATE_EVENT("DocumentCreateEvent"),
    APP_STATS_DOCUMENT_UPDATE_EVENT("DocumentUpdateEvent"),
    APP_STATS_IMAGE_CREATED("ImageCreated"),
    APP_STATS_IMAGE_ADD_TO_DOCUMENT("ImageAddedToDocument"),
    APP_STATS_IMG_PROCESSING_START_EVENT("ImageProcessorStartEvent"),
    APP_STATS_IMG_PROCESSING_STOP_EVENT("ImageProcessorStopEvent"),
    APP_STATS_IMG_FORCE_CAPTURE_EVENT("ForceCapture"),
    APP_STATS_IMG_EXP_CAPTURE_EVENT("CaptureExperienceCapture"),
    APP_STATS_OCR_STOP_EVENT("OCRStop"),
    APP_STATS_OCR_START_EVENT("OCRStart");
    

    /* renamed from: sk */
    private final String f999sk;

    private AppStatsEventIDType(String str) {
        this.f999sk = str;
    }

    public final String getEventTypeDescription() {
        return this.f999sk;
    }
}

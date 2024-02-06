package com.kofax.kmc.kut.utilities.appstats;

public interface AppStatsDsExportHandler {
    void configDsExpFilePath(String str);

    void onExportAppStatsRowEvent(String str, AppStatsDaoField[] appStatsDaoFieldArr);
}

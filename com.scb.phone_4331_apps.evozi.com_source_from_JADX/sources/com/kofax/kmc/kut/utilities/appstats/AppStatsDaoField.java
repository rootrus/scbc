package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class AppStatsDaoField {
    private static final String TAG = AppStatsDataStore.class.getSimpleName();

    /* renamed from: oJ */
    private String f758oJ;

    /* renamed from: oK */
    private AppStatsDsFieldType f759oK;

    /* renamed from: oL */
    private AppStatsDbFieldType f760oL;

    /* renamed from: oM */
    private AppStatsDbFieldKeyType f761oM;

    /* renamed from: oN */
    private String f762oN;

    /* renamed from: oO */
    private Integer f763oO;

    /* renamed from: oP */
    private Date f764oP;

    /* renamed from: oQ */
    private Long f765oQ;

    /* renamed from: oR */
    private Float f766oR;

    public AppStatsDaoField() {
        this.f758oJ = "";
        this.f759oK = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        this.f760oL = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        this.f761oM = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        this.f762oN = "";
        this.f763oO = null;
        this.f764oP = null;
        this.f765oQ = null;
        this.f766oR = null;
    }

    public AppStatsDaoField(String str, AppStatsDsFieldType appStatsDsFieldType, AppStatsDbFieldType appStatsDbFieldType, AppStatsDbFieldKeyType appStatsDbFieldKeyType, String str2) {
        this.f758oJ = "";
        this.f759oK = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        this.f760oL = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        this.f761oM = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        this.f762oN = "";
        this.f763oO = null;
        this.f764oP = null;
        this.f765oQ = null;
        this.f766oR = null;
        this.f758oJ = str;
        this.f759oK = appStatsDsFieldType;
        this.f760oL = appStatsDbFieldType;
        this.f761oM = appStatsDbFieldKeyType;
        this.f762oN = str2;
    }

    public AppStatsDaoField(String str, AppStatsDsFieldType appStatsDsFieldType, AppStatsDbFieldType appStatsDbFieldType, AppStatsDbFieldKeyType appStatsDbFieldKeyType, Integer num) {
        this.f758oJ = "";
        this.f759oK = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        this.f760oL = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        this.f761oM = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        this.f762oN = "";
        String str2 = null;
        this.f763oO = null;
        this.f764oP = null;
        this.f765oQ = null;
        this.f766oR = null;
        this.f758oJ = str;
        this.f759oK = appStatsDsFieldType;
        this.f760oL = appStatsDbFieldType;
        this.f761oM = appStatsDbFieldKeyType;
        this.f763oO = num;
        this.f762oN = num != null ? Integer.toString(num.intValue()) : str2;
    }

    public AppStatsDaoField(String str, AppStatsDsFieldType appStatsDsFieldType, AppStatsDbFieldType appStatsDbFieldType, AppStatsDbFieldKeyType appStatsDbFieldKeyType, Date date) {
        this.f758oJ = "";
        this.f759oK = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        this.f760oL = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        this.f761oM = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        this.f762oN = "";
        this.f763oO = null;
        this.f764oP = null;
        this.f765oQ = null;
        this.f766oR = null;
        this.f758oJ = str;
        this.f759oK = appStatsDsFieldType;
        this.f760oL = appStatsDbFieldType;
        this.f761oM = appStatsDbFieldKeyType;
        this.f764oP = date;
        if (date != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            this.f762oN = simpleDateFormat.format(date);
            return;
        }
        this.f762oN = null;
    }

    public AppStatsDaoField(String str, AppStatsDsFieldType appStatsDsFieldType, AppStatsDbFieldType appStatsDbFieldType, AppStatsDbFieldKeyType appStatsDbFieldKeyType, Float f) {
        this.f758oJ = "";
        this.f759oK = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        this.f760oL = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        this.f761oM = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        this.f762oN = "";
        String str2 = null;
        this.f763oO = null;
        this.f764oP = null;
        this.f765oQ = null;
        this.f766oR = null;
        this.f758oJ = str;
        this.f759oK = appStatsDsFieldType;
        this.f760oL = appStatsDbFieldType;
        this.f761oM = appStatsDbFieldKeyType;
        this.f766oR = f;
        this.f762oN = f != null ? Float.toString(f.floatValue()) : str2;
    }

    public AppStatsDaoField(String str, AppStatsDsFieldType appStatsDsFieldType, AppStatsDbFieldType appStatsDbFieldType, AppStatsDbFieldKeyType appStatsDbFieldKeyType, Long l) {
        this.f758oJ = "";
        this.f759oK = AppStatsDsFieldType.DS_FIELD_TYPE_NONE;
        this.f760oL = AppStatsDbFieldType.DB_FIELD_TYPE_NONE;
        this.f761oM = AppStatsDbFieldKeyType.DB_FIELD_NO_KEY;
        this.f762oN = "";
        String str2 = null;
        this.f763oO = null;
        this.f764oP = null;
        this.f765oQ = null;
        this.f766oR = null;
        this.f758oJ = str;
        this.f759oK = appStatsDsFieldType;
        this.f760oL = appStatsDbFieldType;
        this.f761oM = appStatsDbFieldKeyType;
        this.f765oQ = l;
        this.f762oN = l != null ? Long.toString(l.longValue()) : str2;
    }

    public String getDsFieldName() {
        return this.f758oJ;
    }

    public void setDsFieldName(String str) {
        this.f758oJ = str;
    }

    public AppStatsDsFieldType getDsFieldType() {
        return this.f759oK;
    }

    public void setDsFieldType(AppStatsDsFieldType appStatsDsFieldType) {
        this.f759oK = appStatsDsFieldType;
    }

    public AppStatsDbFieldType getDbFieldType() {
        return this.f760oL;
    }

    public void setDbFieldType(AppStatsDbFieldType appStatsDbFieldType) {
        this.f760oL = appStatsDbFieldType;
    }

    public AppStatsDbFieldKeyType getDbFieldKeyType() {
        return this.f761oM;
    }

    public void setDbFieldKeyType(AppStatsDbFieldKeyType appStatsDbFieldKeyType) {
        this.f761oM = appStatsDbFieldKeyType;
    }

    public String getDsValueString() {
        return this.f762oN;
    }

    public void setDsValueString(String str) {
        this.f762oN = str;
    }

    public Float getDsValueFloat() {
        return this.f766oR;
    }

    public void setDsValueFloat(Float f) {
        this.f766oR = f;
    }

    public Integer getDsValueInt() {
        return this.f763oO;
    }

    public void setDsValueInt(Integer num) {
        this.f763oO = num;
    }

    public Long getDsValueLong() {
        return this.f765oQ;
    }

    public void setDsValueLong(Long l) {
        this.f765oQ = l;
    }

    public Date getDsValueDate() {
        return this.f764oP;
    }

    public void setDsValueDate(Date date) {
        this.f764oP = date;
    }
}

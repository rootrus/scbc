package com.kofax.kmc.kut.utilities.appstats;

import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AppStatsMsSqlExportHandler implements AppStatsDsExportHandler {
    private static final String TAG = AppStatsMsSqlExportHandler.class.getSimpleName();

    /* renamed from: pV */
    private ArrayList<String> f3629pV = new ArrayList<>();
    private String path;

    public void onExportAppStatsRowEvent(String str, AppStatsDaoField[] appStatsDaoFieldArr) {
        m3819a(this.path, str, appStatsDaoFieldArr);
    }

    public void configDsExpFilePath(String str) {
        this.path = str;
        if (str.endsWith(".sql")) {
            m3820t(this.path);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.path);
        sb.append(".sql");
        String obj = sb.toString();
        this.path = obj;
        m3820t(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        if (r4.equals("null") != false) goto L_0x008b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3819a(java.lang.String r10, java.lang.String r11, com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField[] r12) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r10)
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "INSERT INTO "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r11 = " ("
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r10.append(r11)
            java.lang.String r11 = "VALUES ("
            r1.append(r11)
            boolean r11 = r0.exists()
            r2 = 0
            if (r11 == 0) goto L_0x0153
            int r11 = r12.length
            r3 = r2
        L_0x0036:
            java.lang.String r4 = ","
            if (r3 >= r11) goto L_0x0109
            r5 = r12[r3]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r5.getDsFieldName()
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r10.append(r4)
            java.lang.String r4 = r5.getDsValueString()
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r6 = r5.getDsFieldType()
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r7 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.DS_FIELD_TYPE_STRING
            r8 = 1
            if (r6 != r7) goto L_0x00a4
            if (r4 == 0) goto L_0x0068
            int r6 = r4.length()
            if (r6 == 0) goto L_0x0068
            r8 = r2
        L_0x0068:
            if (r8 == 0) goto L_0x006b
            goto L_0x008b
        L_0x006b:
            java.lang.String r6 = r5.getDsFieldName()
            java.lang.String r7 = "ID"
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x008d
            java.lang.String r5 = r5.getDsFieldName()
            java.lang.String r6 = "Id"
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x008d
            java.lang.String r5 = "null"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00f4
        L_0x008b:
            r4 = 0
            goto L_0x00f4
        L_0x008d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "{"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = "}"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L_0x00f4
        L_0x00a4:
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r6 = r5.getDsFieldType()
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r7 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT
            if (r6 != r7) goto L_0x00b5
            java.lang.Float r4 = r5.getDsValueFloat()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x00f4
        L_0x00b5:
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r6 = r5.getDsFieldType()
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r7 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER
            if (r6 != r7) goto L_0x00c6
            java.lang.Integer r4 = r5.getDsValueInt()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x00f4
        L_0x00c6:
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r6 = r5.getDsFieldType()
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r7 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.DS_FIELD_TYPE_LONG
            if (r6 != r7) goto L_0x00d7
            java.lang.Long r4 = r5.getDsValueLong()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x00f4
        L_0x00d7:
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType r5 = r5.getDbFieldType()
            com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType r6 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME
            if (r5 != r6) goto L_0x00f4
            if (r4 == 0) goto L_0x00e8
            int r5 = r4.length()
            if (r5 == 0) goto L_0x00e8
            r8 = r2
        L_0x00e8:
            if (r8 != 0) goto L_0x00f2
            java.lang.String r5 = "0"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00f4
        L_0x00f2:
            java.lang.String r4 = " "
        L_0x00f4:
            if (r4 != 0) goto L_0x00f9
            java.lang.String r4 = "NULL"
            goto L_0x00fd
        L_0x00f9:
            java.lang.String r4 = android.database.DatabaseUtils.sqlEscapeString(r4)
        L_0x00fd:
            r1.append(r4)
            java.lang.String r4 = ", "
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x0036
        L_0x0109:
            int r11 = r1.lastIndexOf(r4)
            r1.deleteCharAt(r11)
            int r11 = r10.lastIndexOf(r4)
            r10.deleteCharAt(r11)
            java.lang.String r11 = ")"
            r10.append(r11)
            java.lang.String r11 = ");"
            r1.append(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.toString()
            r11.append(r10)
            java.lang.String r10 = r1.toString()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = TAG
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "insertStatment = "
            r12.append(r1)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1807c((java.lang.String) r11, (java.lang.String) r12)
            java.util.ArrayList<java.lang.String> r11 = r9.f3629pV
            r11.add(r10)
        L_0x0153:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x018b }
            r10.<init>(r0)     // Catch:{ Exception -> 0x018b }
            java.io.OutputStreamWriter r11 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x018b }
            r11.<init>(r10)     // Catch:{ Exception -> 0x018b }
        L_0x015d:
            java.util.ArrayList<java.lang.String> r12 = r9.f3629pV     // Catch:{ Exception -> 0x018b }
            int r12 = r12.size()     // Catch:{ Exception -> 0x018b }
            if (r2 >= r12) goto L_0x0184
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018b }
            r12.<init>()     // Catch:{ Exception -> 0x018b }
            java.util.ArrayList<java.lang.String> r0 = r9.f3629pV     // Catch:{ Exception -> 0x018b }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x018b }
            r12.append(r0)     // Catch:{ Exception -> 0x018b }
            java.lang.String r0 = "\n"
            r12.append(r0)     // Catch:{ Exception -> 0x018b }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x018b }
            r11.write(r12)     // Catch:{ Exception -> 0x018b }
            int r2 = r2 + 1
            goto L_0x015d
        L_0x0184:
            r11.close()     // Catch:{ Exception -> 0x018b }
            r10.close()     // Catch:{ Exception -> 0x018b }
            return
        L_0x018b:
            r10 = move-exception
            r10.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.appstats.AppStatsMsSqlExportHandler.m3819a(java.lang.String, java.lang.String, com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField[]):void");
    }

    /* renamed from: t */
    private void m3820t(String str) {
        if (str != null) {
            if (!(str == null || str.length() == 0)) {
                int lastIndexOf = str.lastIndexOf(File.separator);
                String substring = str.substring(0, lastIndexOf);
                String substring2 = str.substring(lastIndexOf, str.length());
                if (!substring.equalsIgnoreCase(Environment.getExternalStorageDirectory().getPath())) {
                    File file = new File(substring);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    try {
                        new File(file, substring2).createNewFile();
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    try {
                        new File(substring, substring2).createNewFile();
                        return;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return;
                    }
                }
            }
        }
        throw null;
    }
}

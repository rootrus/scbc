package p040o;

import android.util.Log;

/* renamed from: o.setCbSelect */
public class setCbSelect {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = setCbSelect.class.getName();

    public static String read(String str, String str2) {
        String str3 = MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("Operation = ");
        sb.append(str);
        Log.d(str3, sb.toString());
        String str4 = MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("subjectID = ");
        sb2.append(str2);
        Log.d(str4, sb2.toString());
        StringBuilder sb3 = new StringBuilder("<?xml version=\"1.0\"?>");
        sb3.append("<Actions>");
        sb3.append("<Action Name=\"REQUEST_TOKEN\">");
        sb3.append("<Token_Name>Once</Token_Name>");
        sb3.append("</Action>");
        sb3.append("<Action Name=\"SUBMIT_BIOMETRIC\">");
        sb3.append("<Encryption>Yes</Encryption>");
        sb3.append("<Submit_By>ePID</Submit_By>");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<Operation>");
        sb4.append(str);
        sb4.append("</Operation>");
        sb3.append(sb4.toString());
        sb3.append("<Subject>");
        sb3.append("<Subject_ID>ADMINISTRATOR</Subject_ID>");
        sb3.append("<Subject_Category>Officer</Subject_Category>");
        sb3.append("</Subject>");
        sb3.append("<Subject>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<Subject_ID>");
        sb5.append(str2);
        sb5.append("</Subject_ID>");
        sb3.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("<Subject_Biographic>{\"entryPoint\":\"UPD\",\"tokenId\":\"\",\"tokenCounter\":\"\",\"transactionType\":\"UPDATE\",\"transactionStatus\":\"PENDING_DEDUP\",\"transactionStage\":\"DATA_CAPTURE\",\"externalId\":\"MB-");
        sb6.append(str2);
        sb6.append(",\"institution\":\"MB\",\"cif\":");
        sb6.append(str2);
        sb6.append(",\"bioTypeFR\":\"\",\"fpNo\":\"FINGERPRINT\",\"_s_token\":\"1U1C2V2Y1KMQVHHLSVTXUFFDM-CTKKYKJSCZAC_C1479708858890\"}</Subject_Biographic>");
        sb3.append(sb6.toString());
        sb3.append("<FR>");
        sb3.append("<Image_Data>Yes,JPG,inClear</Image_Data>");
        sb3.append("<Image_Buffer_Type>Binary</Image_Buffer_Type>");
        sb3.append("<Image_Buffer>Memory</Image_Buffer>");
        sb3.append("<Template_Data>No </Template_Data>");
        sb3.append("</FR>");
        sb3.append("</Subject>");
        sb3.append("<Caller_Info>MOBILE-ANDROID </Caller_Info>");
        sb3.append("</Action>");
        sb3.append("</Actions>");
        System.out.println(sb3.toString());
        return sb3.toString();
    }
}

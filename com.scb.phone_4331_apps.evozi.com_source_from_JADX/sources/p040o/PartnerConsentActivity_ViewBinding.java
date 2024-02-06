package p040o;

import com.prolificinteractive.materialcalendarview.BuildConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: o.PartnerConsentActivity_ViewBinding */
public final class PartnerConsentActivity_ViewBinding {
    private static final rsnAllocationResize1D MediaBrowserCompat$CustomActionResultReceiver = new rsnAllocationResize1D("-._~");

    public static String write(String str) {
        return str == null ? "" : MediaBrowserCompat$CustomActionResultReceiver.write(str);
    }

    private static String IconCompatParcelizer(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static onAllowClick read(String str) {
        String str2;
        String str3;
        onAllowClick onallowclick = new onAllowClick();
        if (str == null || str.length() == 0) {
            return onallowclick;
        }
        for (String str4 : str.split("\\&")) {
            int indexOf = str4.indexOf(61);
            if (indexOf < 0) {
                str3 = IconCompatParcelizer(str4);
                str2 = null;
            } else {
                String IconCompatParcelizer = IconCompatParcelizer(str4.substring(0, indexOf));
                str2 = IconCompatParcelizer(str4.substring(indexOf + 1));
                str3 = IconCompatParcelizer;
            }
            onallowclick.write(str3, str2, false);
        }
        return onallowclick;
    }

    public static onAllowClick write(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb.append(readLine);
        }
        return read(sb.toString());
    }

    public static String IconCompatParcelizer(String str, String str2) {
        String str3 = "?";
        if (str.contains(str3)) {
            str3 = "&";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str3);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(str2);
        return sb2.toString();
    }

    public static onAllowClick MediaBrowserCompat$ItemReceiver(String str) {
        onAllowClick onallowclick = new onAllowClick();
        if (str != null && str.startsWith("OAuth ")) {
            for (String split : str.substring(6).split(",")) {
                String[] split2 = split.split("=");
                onallowclick.write(split2[0].trim(), split2[1].replace("\"", "").trim(), false);
            }
        }
        return onallowclick;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (System.getProperty(BuildConfig.BUILD_TYPE) != null) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("[SIGNPOST] ");
            sb.append(str);
            sb.append(": ");
            sb.append(str2);
            printStream.println(sb.toString());
        }
    }
}

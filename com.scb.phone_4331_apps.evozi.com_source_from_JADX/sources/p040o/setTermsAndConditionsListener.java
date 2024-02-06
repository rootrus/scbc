package p040o;

import android.text.TextUtils;
import android.util.Log;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Enumeration;

/* renamed from: o.setTermsAndConditionsListener */
public class setTermsAndConditionsListener {
    private static final String read = setTermsAndConditionsListener.class.getName();
    private static String write = "sha";

    public static String MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (t.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = t.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception unused) {
            return "02:00:00:00:00:00";
        }
    }

    public static String write() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress()) {
                            return nextElement.getHostAddress().toString();
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            Log.e("IP Address", e.toString());
            return null;
        }
    }

    public static String MediaBrowserCompat$ItemReceiver(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance(write);
        instance.reset();
        instance.update(bArr);
        byte[] digest = instance.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("0");
                sb.append(hexString);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append(hexString);
            }
        }
        return stringBuffer.toString().toUpperCase();
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static byte[] MediaBrowserCompat$CustomActionResultReceiver(byte b, byte[] bArr) {
        byte[] bArr2 = new byte[(bArr.length + 4)];
        bArr2[0] = b;
        System.arraycopy(CustomCardApplyViewComponent_ViewBinding.IconCompatParcelizer(bArr.length, 3, ByteOrder.BIG_ENDIAN), 0, bArr2, 1, 3);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return bArr2;
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        if (TextUtils.isEmpty(setRemark.write("HTTP_URL")) && (TextUtils.isEmpty(setRemark.write("HTTPS_HOST")) || TextUtils.isEmpty(setRemark.write("HTTPS_FILE")))) {
            setRecipients.MediaMetadataCompat().setChecked = true;
            setRecipients.MediaMetadataCompat();
            setRecipients.MediaBrowserCompat$ItemReceiver("gis.nec.com.sg");
            setRecipients.MediaMetadataCompat();
            setRecipients.read(443);
            setRecipients.MediaMetadataCompat();
            setRecipients.IconCompatParcelizer("/bdo/epid-webservices/api/epidService?wsdl");
        } else if (!TextUtils.isEmpty(setRemark.write("HTTP_URL"))) {
            setRecipients.MediaMetadataCompat().setChecked = false;
            setRecipients.MediaMetadataCompat().AbsActionBarView = setRemark.write("HTTP_URL");
        } else if (!TextUtils.isEmpty(setRemark.write("HTTPS_HOST")) && !TextUtils.isEmpty(setRemark.write("HTTPS_FILE"))) {
            if (setRemark.MediaBrowserCompat$CustomActionResultReceiver("HTTPS_PORT") != -1) {
                setRecipients.MediaMetadataCompat();
                setRecipients.read(setRemark.MediaBrowserCompat$CustomActionResultReceiver("HTTPS_PORT"));
            } else {
                setRecipients.MediaMetadataCompat();
                setRecipients.read(443);
            }
            setRecipients.MediaMetadataCompat();
            setRecipients.MediaBrowserCompat$ItemReceiver(setRemark.write("HTTPS_HOST"));
            setRecipients.MediaMetadataCompat();
            setRecipients.IconCompatParcelizer(setRemark.write("HTTPS_FILE"));
        }
        Log.d(read, "------------------------------ CHECK URL ------------------------------------------");
        String str = read;
        StringBuilder sb = new StringBuilder();
        sb.append("ePIDModel.getInstance().getHttpsHost() = ");
        setRecipients.MediaMetadataCompat();
        sb.append(setRecipients.write());
        Log.d(str, sb.toString());
        String str2 = read;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ePIDModel.getInstance().getHttpsPort() = ");
        setRecipients.MediaMetadataCompat();
        sb2.append(setRecipients.RatingCompat());
        Log.d(str2, sb2.toString());
        String str3 = read;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("ePIDModel.getInstance().getHttpsFile() = ");
        setRecipients.MediaMetadataCompat();
        sb3.append(setRecipients.IconCompatParcelizer());
        Log.d(str3, sb3.toString());
        Log.d(read, "------------------------------ END CHECK URL ---------------------------------------");
    }

    public static void write(String str) {
        setRemark.MediaBrowserCompat$ItemReceiver("URL_SECURE", str);
        try {
            URL url = new URL(str);
            if (url.getProtocol().contains("https")) {
                setRecipients.MediaMetadataCompat().setChecked = true;
                setRemark.MediaBrowserCompat$ItemReceiver("HTTPS_HOST", url.getHost());
                setRemark.MediaBrowserCompat$ItemReceiver("HTTPS_FILE", url.getFile());
                setRemark.MediaBrowserCompat$ItemReceiver("HTTPS_PORT", url.getPort());
                setRemark.MediaBrowserCompat$ItemReceiver("HTTP_URL", (String) null);
            } else {
                setRemark.MediaBrowserCompat$ItemReceiver("HTTPS_HOST", (String) null);
                setRemark.MediaBrowserCompat$ItemReceiver("HTTPS_FILE", (String) null);
                setRemark.MediaBrowserCompat$ItemReceiver("HTTPS_PORT", -1);
                setRemark.MediaBrowserCompat$ItemReceiver("HTTP_URL", str);
                setRecipients.MediaMetadataCompat().setChecked = false;
            }
            Log.d(read, "------------------------------ SAVE URL ------------------------------------------");
            String str2 = read;
            StringBuilder sb = new StringBuilder();
            sb.append("ePIDModel.getInstance().getHttpsHost() = ");
            sb.append(str);
            Log.d(str2, sb.toString());
            Log.d(read, "------------------------------ END SAVE URL ---------------------------------------");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

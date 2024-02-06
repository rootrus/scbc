package p040o;

import java.util.Map;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerGuidelinesFragment */
public final class FragmentBuilder_BindHmlBusinessOwnerGuidelinesFragment {
    private static Map<Integer, String> MediaBrowserCompat$ItemReceiver = new setTextAppearance();
    private static Map<Integer, String> read = new setTextAppearance();

    static {
        read.put(7, "No registered regions");
        MediaBrowserCompat$ItemReceiver.put(7, "No regions have been registered for this view. Region or element tracking can only be enabled for registered regions.");
        read.put(2, "Connection Error");
        MediaBrowserCompat$ItemReceiver.put(2, "Please check your internet connection and try again.");
        read.put(19, "Request timed out");
        MediaBrowserCompat$ItemReceiver.put(19, "Please check your internet connection and try again.");
        read.put(17, "Something went wrong");
        MediaBrowserCompat$ItemReceiver.put(17, "Unknown request. Please check and try again.");
        read.put(3, "Session expired");
        MediaBrowserCompat$ItemReceiver.put(3, "Your session has expired. Please log in to continue.");
        read.put(4, "Authentication error");
        MediaBrowserCompat$ItemReceiver.put(4, "Incorrect username or password.");
        read.put(6, "Authorization error");
        MediaBrowserCompat$ItemReceiver.put(6, "You do not have permission to perform this task. Contact your administrator.");
        read.put(18, "Something went wrong");
        MediaBrowserCompat$ItemReceiver.put(18, "Your request has timed out. Please try again.");
        read.put(8, "Request conflict");
        MediaBrowserCompat$ItemReceiver.put(8, "Your request could not be processed because of a conflict in the request.");
        read.put(9, "ONE is unavailable");
        MediaBrowserCompat$ItemReceiver.put(9, "ONE is currently experiencing difficulties but should be back soon. If you continue to have problems, contact your administrator");
        read.put(16, "ONE is unavailable");
        MediaBrowserCompat$ItemReceiver.put(16, "ONE is currently being serviced and will be available again shortly. ");
        read.put(20, "Something went wrong");
        MediaBrowserCompat$ItemReceiver.put(20, "Unable to retrieve workspace ID. Please review the information and retry.");
    }

    public static String read(int i) {
        String str = MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i));
        return str == null ? "Unknown error" : str;
    }
}

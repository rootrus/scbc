package p040o;

import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver */
public class clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver {
    public setTextAppearance<String, String> MediaBrowserCompat$ItemReceiver;
    public boolean read;

    private clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver = new setTextAppearance<>();
    }

    public /* synthetic */ clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        if (str2 != null) {
            String trim = str2.trim();
            if (!(trim == null || trim.length() == 0)) {
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                StringBuilder sb = new StringBuilder();
                sb.append("Data captured: element ");
                sb.append(str);
                sb.append(" data ");
                sb.append(str2);
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                this.MediaBrowserCompat$ItemReceiver.put(str, str2.trim());
            }
        }
    }
}

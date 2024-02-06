package p039io.github.inflationx.calligraphy3;

import android.content.Context;
import android.view.View;
import p040o.C1165x6a840f83;
import p040o.ContactUsActivity;
import p040o.ContactUsActivity$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

/* renamed from: io.github.inflationx.calligraphy3.CalligraphyInterceptor */
public class CalligraphyInterceptor implements ContactUsActivity.CustomActionBar_ViewBinding {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public ContactUsActivity intercept(C1165x6a840f83 contactUsActivity$CustomActionBar_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) {
        ContactUsActivity write = contactUsActivity$CustomActionBar_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.write(contactUsActivity$CustomActionBar_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.read());
        View onViewCreated = this.calligraphy.onViewCreated(write.read, write.IconCompatParcelizer, write.write);
        ContactUsActivity$MediaBrowserCompat$ItemReceiver contactUsActivity$MediaBrowserCompat$ItemReceiver = new ContactUsActivity$MediaBrowserCompat$ItemReceiver(write);
        contactUsActivity$MediaBrowserCompat$ItemReceiver.write = onViewCreated;
        String str = contactUsActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (str != null) {
            View view = contactUsActivity$MediaBrowserCompat$ItemReceiver.write;
            if (view == null) {
                view = null;
            } else if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) view.getClass().getName())) {
                StringBuilder sb = new StringBuilder();
                sb.append("name (");
                sb.append(str);
                sb.append(") must be the view's fully qualified name (");
                sb.append(view.getClass().getName());
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
            }
            Context context = contactUsActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            if (context != null) {
                return new ContactUsActivity(view, str, context, contactUsActivity$MediaBrowserCompat$ItemReceiver.read);
            }
            throw new IllegalStateException("context == null");
        }
        throw new IllegalStateException("name == null".toString());
    }
}

package p040o;

import android.view.View;
import p040o.ContactUsActivity;

/* renamed from: o.onTwitterClick */
public final class onTwitterClick implements ContactUsActivity.CustomActionBar_ViewBinding {
    public final ContactUsActivity intercept(C1165x6a840f83 contactUsActivity$CustomActionBar_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) {
        String str;
        Class<?> cls;
        onGetStartedClick.write((Object) contactUsActivity$CustomActionBar_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "chain");
        ThirdPartyWebActivity read = contactUsActivity$CustomActionBar_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.read();
        View IconCompatParcelizer = read.read.IconCompatParcelizer(read.MediaBrowserCompat$ItemReceiver, read.IconCompatParcelizer, read.MediaBrowserCompat$CustomActionResultReceiver, read.write);
        if (IconCompatParcelizer == null || (cls = IconCompatParcelizer.getClass()) == null || (str = cls.getName()) == null) {
            str = read.IconCompatParcelizer;
        }
        return new ContactUsActivity(IconCompatParcelizer, str, read.MediaBrowserCompat$CustomActionResultReceiver, read.write);
    }
}

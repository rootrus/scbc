package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: o.ContactUsActivity$MediaBrowserCompat$ItemReceiver */
public final class ContactUsActivity$MediaBrowserCompat$ItemReceiver {
    public String IconCompatParcelizer;
    public Context MediaBrowserCompat$ItemReceiver;
    public AttributeSet read;
    public View write;

    public ContactUsActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public ContactUsActivity$MediaBrowserCompat$ItemReceiver(ContactUsActivity contactUsActivity) {
        onGetStartedClick.write((Object) contactUsActivity, "result");
        this.write = contactUsActivity.read;
        this.IconCompatParcelizer = contactUsActivity.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = contactUsActivity.IconCompatParcelizer;
        this.read = contactUsActivity.write;
    }
}

package com.scb.phone.view.activity.contactus;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ContactUsActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ContactUsActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View write;

    public ContactUsActivity_ViewBinding(final ContactUsActivity contactUsActivity, View view) {
        super(contactUsActivity, view);
        this.IconCompatParcelizer = contactUsActivity;
        contactUsActivity.toolbar = (Toolbar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toolbar, "field 'toolbar'", Toolbar.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.rl_call_us, "method 'onCallUsClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ContactUsActivity.this.onCallUsClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.rl_email_us, "method 'onEmailUsClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ContactUsActivity.this.onEmailUsClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.twitter, "method 'onTwitterClick'");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ContactUsActivity.this.onTwitterClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.messenger, "method 'onFacebookMessengerClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ContactUsActivity.this.onFacebookMessengerClick();
            }
        });
    }

    public final void read() {
        ContactUsActivity contactUsActivity = this.IconCompatParcelizer;
        if (contactUsActivity != null) {
            this.IconCompatParcelizer = null;
            contactUsActivity.toolbar = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

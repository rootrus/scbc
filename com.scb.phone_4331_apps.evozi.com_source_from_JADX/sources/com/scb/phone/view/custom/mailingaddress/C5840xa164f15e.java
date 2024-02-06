package com.scb.phone.view.custom.mailingaddress;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.onGetStartedClick;
import p040o.setLength;

/* renamed from: com.scb.phone.view.custom.mailingaddress.MailingAddressAccountDetailsCustomItem$MediaBrowserCompat$ItemReceiver */
final class C5840xa164f15e implements View.OnClickListener {
    private /* synthetic */ setLength IconCompatParcelizer;
    private /* synthetic */ boolean read;
    private /* synthetic */ MailingAddressAccountDetailsCustomItem write;

    C5840xa164f15e(MailingAddressAccountDetailsCustomItem mailingAddressAccountDetailsCustomItem, setLength setlength, boolean z) {
        this.write = mailingAddressAccountDetailsCustomItem;
        this.IconCompatParcelizer = setlength;
        this.read = z;
    }

    public final void onClick(View view) {
        Group group;
        if (this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver) {
            group = this.write.groupAccountAddressError;
            if (group == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupAccountAddressError");
            }
        } else {
            group = this.write.groupAddressDetails;
            if (group == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupAddressDetails");
            }
        }
        if (this.IconCompatParcelizer.MediaBrowserCompat$MediaItem) {
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(group);
        } else {
            FragmentBuilder_BindDeejungPlansFragment.write(group);
            TextView textView = this.write.addressText;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("addressText");
            }
            textView.setText("");
            if (this.read || this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver) {
                this.write.read(this.IconCompatParcelizer, this.read);
            } else {
                MailingAddressAccountDetailsCustomItem.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.IconCompatParcelizer);
            }
        }
        setLength setlength = this.IconCompatParcelizer;
        setlength.MediaBrowserCompat$MediaItem = !setlength.MediaBrowserCompat$MediaItem;
        this.write.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$MediaItem);
    }
}

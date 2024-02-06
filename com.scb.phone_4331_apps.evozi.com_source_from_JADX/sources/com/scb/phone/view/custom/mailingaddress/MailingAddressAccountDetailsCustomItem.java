package com.scb.phone.view.custom.mailingaddress;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.C7108xec65684e;
import p040o.onGetStartedClick;
import p040o.setLength;

public final class MailingAddressAccountDetailsCustomItem extends MailingAddressSelectAccountItem {
    @BindView
    public TextView accountText;
    @BindView
    public TextView accountType;
    @BindView
    public TextView addressText;
    @BindView
    public ImageView expandIcon;
    @BindView
    public Group groupAccountAddressError;
    @BindView
    public Group groupAddressDetails;
    @BindView
    public LinearLayout loading;
    @BindView
    public ImageView reloadAddress;
    @BindView
    public CheckBox selectorCheckBox;
    @BindView
    public View separator;
    @BindView
    public Space spaceSeparator;
    /* access modifiers changed from: private */
    public C7108xec65684e write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountDetailsCustomItem(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84132131493639, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountDetailsCustomItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84132131493639, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountDetailsCustomItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84132131493639, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setAccountText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.accountText = textView;
    }

    public final void setAccountType(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.accountType = textView;
    }

    public final void setAddressText(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.addressText = textView;
    }

    public final void setSelectorCheckBox(CheckBox checkBox) {
        onGetStartedClick.write((Object) checkBox, "<set-?>");
        this.selectorCheckBox = checkBox;
    }

    public final void setSeparator(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.separator = view;
    }

    public final void setExpandIcon(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.expandIcon = imageView;
    }

    public final void setLoading(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.loading = linearLayout;
    }

    public final void setGroupAddressDetails(Group group) {
        onGetStartedClick.write((Object) group, "<set-?>");
        this.groupAddressDetails = group;
    }

    public final void setGroupAccountAddressError(Group group) {
        onGetStartedClick.write((Object) group, "<set-?>");
        this.groupAccountAddressError = group;
    }

    public final void setReloadAddress(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.reloadAddress = imageView;
    }

    public final void setSpaceSeparator(Space space) {
        onGetStartedClick.write((Object) space, "<set-?>");
        this.spaceSeparator = space;
    }

    public final void setListener(C7108xec65684e getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver) {
        this.write = getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver;
    }

    public final void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        setLength setlength = (setLength) builder;
        TextView textView = this.accountText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountText");
        }
        textView.setText(setlength.MediaBrowserCompat$ItemReceiver);
        TextView textView2 = this.accountType;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountType");
        }
        textView2.setText(setlength.ParcelableVolumeInfo);
        boolean z = !TextUtils.isEmpty(setlength.MediaMetadataCompat);
        LinearLayout linearLayout = this.loading;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loading");
        }
        int i = 8;
        linearLayout.setVisibility(8);
        if (setlength.MediaBrowserCompat$MediaItem) {
            read(setlength, z);
        } else {
            Group group = this.groupAddressDetails;
            if (group == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupAddressDetails");
            }
            group.setVisibility(8);
            Group group2 = this.groupAccountAddressError;
            if (group2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupAccountAddressError");
            }
            group2.setVisibility(8);
        }
        MediaBrowserCompat$ItemReceiver(setlength.MediaBrowserCompat$MediaItem);
        ImageView imageView = this.reloadAddress;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reloadAddress");
        }
        imageView.setOnClickListener((View.OnClickListener) null);
        ImageView imageView2 = this.reloadAddress;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reloadAddress");
        }
        imageView2.setOnClickListener(new C5839x433d0c4f(this, setlength));
        ImageView imageView3 = this.expandIcon;
        if (imageView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("expandIcon");
        }
        imageView3.setOnClickListener((View.OnClickListener) null);
        ImageView imageView4 = this.expandIcon;
        if (imageView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("expandIcon");
        }
        imageView4.setOnClickListener(new C5840xa164f15e(this, setlength, z));
        CheckBox checkBox = this.selectorCheckBox;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectorCheckBox");
        }
        checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        CheckBox checkBox2 = this.selectorCheckBox;
        if (checkBox2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectorCheckBox");
        }
        checkBox2.setChecked(setlength.MediaSessionCompat$ResultReceiverWrapper);
        CheckBox checkBox3 = this.selectorCheckBox;
        if (checkBox3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectorCheckBox");
        }
        checkBox3.setOnCheckedChangeListener(new read(this, setlength));
        Space space = this.spaceSeparator;
        if (space == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spaceSeparator");
        }
        if (!setlength.MediaDescriptionCompat()) {
            i = 0;
        }
        space.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public final void read(setLength setlength, boolean z) {
        Group group = this.groupAddressDetails;
        if (group == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupAddressDetails");
        }
        int i = 0;
        group.setVisibility(z ? 0 : 8);
        TextView textView = this.addressText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addressText");
        }
        textView.setVisibility(z ? 0 : 8);
        Group group2 = this.groupAccountAddressError;
        if (group2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupAccountAddressError");
        }
        if (!setlength.MediaBrowserCompat$SearchResultReceiver) {
            i = 8;
        }
        group2.setVisibility(i);
        if (z) {
            String str = setlength.MediaMetadataCompat;
            TextView textView2 = this.addressText;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("addressText");
            }
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
        }
    }

    static final class read implements CompoundButton.OnCheckedChangeListener {
        private /* synthetic */ MailingAddressAccountDetailsCustomItem IconCompatParcelizer;
        private /* synthetic */ setLength write;

        read(MailingAddressAccountDetailsCustomItem mailingAddressAccountDetailsCustomItem, setLength setlength) {
            this.IconCompatParcelizer = mailingAddressAccountDetailsCustomItem;
            this.write = setlength;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C7108xec65684e MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.write;
            if (MediaBrowserCompat$ItemReceiver != null) {
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write, z);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        int i = z ? R.drawable.ic_expand_less_black_24dp : R.drawable.ic_expand_more_black_24dp;
        ImageView imageView = this.expandIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("expandIcon");
        }
        imageView.setImageResource(i);
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(MailingAddressAccountDetailsCustomItem mailingAddressAccountDetailsCustomItem, setLength setlength) {
        LinearLayout linearLayout = mailingAddressAccountDetailsCustomItem.loading;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loading");
        }
        linearLayout.setVisibility(0);
        C7108xec65684e getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver = mailingAddressAccountDetailsCustomItem.write;
        if (getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver != null) {
            getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver.write(setlength);
        }
    }
}

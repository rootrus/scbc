package com.scb.phone.view.fragment.mailingaddress;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.mailingaddress.BulletThaiTextView;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.C9777xebbb7ee1;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.LinkedListMultimap;
import p040o.getBackException;
import p040o.getEnvLanguage;
import p040o.getEnvLanguage$MediaBrowserCompat$ItemReceiver;
import p040o.getEnvLanguage$MediaBrowserCompat$MediaItem;
import p040o.getEnvLanguage$MediaBrowserCompat$SearchResultReceiver;
import p040o.onGetStartedClick;
import p040o.readElement;
import p040o.replaceFrom$MediaBrowserCompat$ItemReceiver;
import p040o.ringWrite;
import p040o.writeUInt64NoTag;

public final class MailingAddressReviewFragment extends BaseFragment implements getBackException {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private MailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public Button btnNext;
    @BindView
    public LinearLayout llRelatedAccount;
    @BindView
    public LinearLayout llRemarks;
    @HmlPinActivity
    public getEnvLanguage presenter;
    @BindView
    public TextView tvNewAddress;
    @BindView
    public TextView tvNewAddressUsage;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver)) {
            activity = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (MailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver) activity;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86132131493840, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(\n      …rKnife.bind(this, view) }");
        return inflate;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEnvLanguage getenvlanguage = this.presenter;
        if (getenvlanguage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getenvlanguage.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("PARCELABLE_TOKEN_ID");
            getenvlanguage.IconCompatParcelizer = string;
            writeUInt64NoTag.IconCompatParcelizer getenvlanguage_mediabrowsercompat_searchresultreceiver = new getEnvLanguage$MediaBrowserCompat$SearchResultReceiver(getenvlanguage);
            boolean z = true;
            if (getenvlanguage.RatingCompat != null) {
                getenvlanguage_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(getenvlanguage.RatingCompat);
            }
            if (string != null) {
                if (getenvlanguage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getenvlanguage.RatingCompat.AlertController$RecycleListView();
                }
                LinkedListMultimap.MultisetView.C35811 r2 = getenvlanguage.MediaBrowserCompat$ItemReceiver;
                getEnvLanguage getenvlanguage2 = getenvlanguage;
                FundFactSheetActivity mediaMetadataCompat = new getEnvLanguage.MediaMetadataCompat(getenvlanguage2);
                FundFactSheetActivity getenvlanguage_mediabrowsercompat_mediaitem = new getEnvLanguage$MediaBrowserCompat$MediaItem(getenvlanguage2);
                onGetStartedClick.write((Object) string, "tokenId");
                onGetStartedClick.write((Object) mediaMetadataCompat, "onSuccess");
                onGetStartedClick.write((Object) getenvlanguage_mediabrowsercompat_mediaitem, "onError");
                r2.MediaBrowserCompat$ItemReceiver(r2.read, mediaMetadataCompat, getenvlanguage_mediabrowsercompat_mediaitem, new replaceFrom$MediaBrowserCompat$ItemReceiver(string), new LinkedListMultimap.MultisetView.C35811.read(r2));
                return;
            }
            getenvlanguage.read(Iterables$3$MediaBrowserCompat$MediaItem.error_default_title, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) getEnvLanguage.MediaDescriptionCompat.read);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        getEnvLanguage getenvlanguage = this.presenter;
        if (getenvlanguage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getenvlanguage.onDestroy();
    }

    public final void read() {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<String> list) {
        onGetStartedClick.write((Object) list, "remarks");
        for (String str : list) {
            Context context = getContext();
            if (context != null) {
                LinearLayout linearLayout = this.llRemarks;
                if (linearLayout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("llRemarks");
                }
                onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                BulletThaiTextView bulletThaiTextView = new BulletThaiTextView(context);
                bulletThaiTextView.setText(str);
                linearLayout.addView(bulletThaiTextView);
            }
        }
    }

    public final void read(ringWrite ringwrite) {
        onGetStartedClick.write((Object) ringwrite, "addressReview");
        TextView textView = this.tvNewAddressUsage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNewAddressUsage");
        }
        textView.setText(ringwrite.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView2 = this.tvNewAddress;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNewAddress");
        }
        textView2.setText(ringwrite.IconCompatParcelizer);
        for (String str : ringwrite.MediaBrowserCompat$ItemReceiver) {
            Context context = getContext();
            if (context != null) {
                LinearLayout linearLayout = this.llRelatedAccount;
                if (linearLayout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("llRelatedAccount");
                }
                onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                BulletThaiTextView bulletThaiTextView = new BulletThaiTextView(context);
                bulletThaiTextView.setText(str);
                linearLayout.addView(bulletThaiTextView);
            }
        }
    }

    public final void write(readElement readelement) {
        onGetStartedClick.write((Object) readelement, "params");
        MailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver mailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver != null) {
            mailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(readelement);
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        MailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver mailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver != null) {
            mailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver.write(str);
        }
    }

    @OnClick
    public final void onNextClick() {
        getEnvLanguage getenvlanguage = this.presenter;
        if (getenvlanguage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getenvlanguage.RatingCompat != null) {
            getenvlanguage.RatingCompat.AlertController$RecycleListView();
        }
        String str = getenvlanguage.IconCompatParcelizer;
        if (str == null) {
            str = "";
        }
        C9777xebbb7ee1 linkedListMultimap$MultisetView$1$MediaBrowserCompat$ItemReceiver = new C9777xebbb7ee1((String) null, (String) null, str);
        LinkedListMultimap.MultisetView.C35811 r1 = getenvlanguage.MediaBrowserCompat$ItemReceiver;
        getEnvLanguage getenvlanguage2 = getenvlanguage;
        r1.MediaBrowserCompat$CustomActionResultReceiver(linkedListMultimap$MultisetView$1$MediaBrowserCompat$ItemReceiver, new getEnvLanguage$MediaBrowserCompat$ItemReceiver(getenvlanguage2), new getEnvLanguage.IconCompatParcelizer(getenvlanguage2));
    }
}

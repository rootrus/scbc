package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.data.network.service.CCContentService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import p040o.CardView;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.PointDouble;
import p040o.SyncServiceCallback;
import p040o.TextRecognizer;
import p040o.ZSYR2K;
import p040o.immediateFailedCheckedFuture;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setReadOnly;
import p040o.setReadOnly$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setReadOnly$MediaBrowserCompat$ItemReceiver;
import p040o.setReadOnly$MediaBrowserCompat$MediaItem;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzfe;

public abstract class HmlBaseConsentActivity extends BaseActivity implements FragmentBuilder_BindCustomizeYourPageFragment, PointDouble {
    private String MediaBrowserCompat$MediaItem;
    private immediateFailedFuture MediaBrowserCompat$SearchResultReceiver;
    public zzfe.zza MediaDescriptionCompat;

    public void MediaBrowserCompat$ItemReceiver() {
    }

    public void MediaBrowserCompat$ItemReceiver(boolean z) {
    }

    public abstract setReadOnly<?> MediaSessionCompat$QueueItem();

    public abstract void MediaSessionCompat$ResultReceiverWrapper();

    public String MediaSessionCompat$Token() {
        return "etb";
    }

    public void read() {
    }

    public void write() {
    }

    public static final class read {
        public CCContentService IconCompatParcelizer;

        private read() {
        }

        @HmlPinActivity
        public read(CCContentService cCContentService) {
            this.IconCompatParcelizer = cCContentService;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Serializable serializableExtra = getIntent().getSerializableExtra("HML_CONSENT_TYPE");
        if (serializableExtra != null) {
            this.MediaDescriptionCompat = (zzfe.zza) serializableExtra;
            this.MediaBrowserCompat$SearchResultReceiver = (immediateFailedFuture) getIntent().getParcelableExtra("HML_TERM_AND_CONDITION_DISPLAY");
            this.MediaBrowserCompat$MediaItem = getIntent().getStringExtra("HML_SUB_CONSENT_TYPE");
            super.setStackedBackground();
            MediaSessionCompat$QueueItem(m2899x50fd9e4a());
            setTabContainer();
            setReadOnly<?> MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
            MediaSessionCompat$ResultReceiverWrapper();
            zzfe.zza zza = this.MediaDescriptionCompat;
            if (zza == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
            }
            String str = this.MediaBrowserCompat$MediaItem;
            immediateFailedFuture immediatefailedfuture = this.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.write((Object) zza, "type");
            boolean z = true;
            if (immediatefailedfuture != null) {
                writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new setReadOnly.MediaDescriptionCompat(immediatefailedfuture);
                if (MediaSessionCompat$QueueItem.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    mediaDescriptionCompat.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
                    return;
                }
                return;
            }
            setReadOnly setreadonly = MediaSessionCompat$QueueItem;
            setreadonly.MediaDescriptionCompat = zza;
            setreadonly.MediaBrowserCompat$ItemReceiver = str;
            if (setreadonly.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setreadonly.RatingCompat.AlertController$RecycleListView();
            }
            TextRecognizer textRecognizer = setreadonly.IconCompatParcelizer;
            textRecognizer.MediaBrowserCompat$ItemReceiver(zza, str);
            textRecognizer.IconCompatParcelizer(new setReadOnly$MediaBrowserCompat$MediaItem(setreadonly, zza));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.hml.HmlConsent");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(m2899x50fd9e4a());
        setTabContainer();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final String m2899x50fd9e4a() {
        String str;
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
        }
        switch (SyncServiceCallback.MediaBrowserCompat$ItemReceiver[zza.ordinal()]) {
            case 1:
                str = getString(R.string.hml_consent_ncb_consent);
                break;
            case 2:
                str = getString(R.string.hml_consent_model_consent);
                break;
            case 3:
                str = getString(R.string.hml_consent_cross_sell_consent);
                break;
            case 4:
                str = getString(R.string.hml_consent_terms_and_conditions);
                break;
            case 5:
                str = getString(R.string.hml_consent_product_details);
                break;
            case 6:
                str = getString(R.string.hml_consent_terms_and_conditions);
                break;
            case 7:
                str = getString(R.string.hml_consent_sensitive);
                break;
            case 8:
                str = getString(R.string.auto_privacy_notice_title);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        onGetStartedClick.IconCompatParcelizer((Object) str, "when (consentType) {\n   …ivacy_notice_title)\n    }");
        return str;
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "tag");
        setReadOnly<?> MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
        }
        onGetStartedClick.write((Object) zza, "type");
        boolean z = true;
        if (zza == zzfe.zza.NCB_CONSENT) {
            writeUInt64NoTag.IconCompatParcelizer write = new setReadOnly.write(MediaSessionCompat$QueueItem);
            if (MediaSessionCompat$QueueItem.RatingCompat == null) {
                z = false;
            }
            if (z) {
                write.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setReadOnly$MediaBrowserCompat$CustomActionResultReceiver.write;
        if (MediaSessionCompat$QueueItem.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "tag");
        setReadOnly<?> MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
        }
        onGetStartedClick.write((Object) zza, "type");
        boolean z = true;
        if (zza == zzfe.zza.NCB_CONSENT) {
            writeUInt64NoTag.IconCompatParcelizer setreadonly_mediabrowsercompat_itemreceiver = new setReadOnly$MediaBrowserCompat$ItemReceiver(MediaSessionCompat$QueueItem);
            if (MediaSessionCompat$QueueItem.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setreadonly_mediabrowsercompat_itemreceiver.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setReadOnly.read.read;
        if (MediaSessionCompat$QueueItem.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
        }
    }

    public final void setContentView() {
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "termsAndConsInfoDisplay");
        CardView read2 = getSupportFragmentManager().read();
        TermsAndConditionsFragment.write write = TermsAndConditionsFragment.IconCompatParcelizer;
        read2.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void MediaBrowserCompat$ItemReceiver(immediateFailedCheckedFuture immediatefailedcheckedfuture, zzct.zza zza) {
        onGetStartedClick.write((Object) immediatefailedcheckedfuture, "termsAndConditionsDisplay");
        onGetStartedClick.write((Object) zza, "customerType");
        MediaBrowserCompat$CustomActionResultReceiver(immediatefailedcheckedfuture, new C5600xda92199e(this));
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ HmlBaseConsentActivity MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(HmlBaseConsentActivity hmlBaseConsentActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseConsentActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            HmlBaseConsentActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem().IconCompatParcelizer();
        }
    }

    public final void read(immediateFailedCheckedFuture immediatefailedcheckedfuture, zzct.zza zza) {
        onGetStartedClick.write((Object) immediatefailedcheckedfuture, "termsAndConditionsDisplay");
        onGetStartedClick.write((Object) zza, "customerType");
        MediaBrowserCompat$CustomActionResultReceiver(immediatefailedcheckedfuture, new IconCompatParcelizer(this));
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(immediateFailedCheckedFuture immediatefailedcheckedfuture, DialogInterface.OnClickListener onClickListener) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String str = immediatefailedcheckedfuture.IconCompatParcelizer;
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(str);
        }
        String str2 = immediatefailedcheckedfuture.MediaBrowserCompat$CustomActionResultReceiver;
        if (true ^ (str2 == null || str2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(str2);
        }
        IconCompatParcelizer2.IconCompatParcelizer(immediatefailedcheckedfuture.read, onClickListener).MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture.MediaBrowserCompat$ItemReceiver, HmlBaseConsentActivity$MediaBrowserCompat$ItemReceiver.read).show();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(HmlBaseConsentActivity hmlBaseConsentActivity) {
        zzfe.zza zza = hmlBaseConsentActivity.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
        }
        if (zza == zzfe.zza.NCB_CONSENT) {
            hmlBaseConsentActivity.scbAnalytics.write("p10x1_consent", new ZSYR2K("user_type", hmlBaseConsentActivity.MediaSessionCompat$Token()), new ZSYR2K("button", "deny"));
            return;
        }
        zzfe.zza zza2 = hmlBaseConsentActivity.MediaDescriptionCompat;
        if (zza2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
        }
        if (zza2 == zzfe.zza.SENSITIVE_CONSENT) {
            hmlBaseConsentActivity.scbAnalytics.write("p10x1_sensitive_consent", new ZSYR2K("user_type", hmlBaseConsentActivity.MediaSessionCompat$Token()), new ZSYR2K("button", "deny"), new ZSYR2K("loan_type", "consumer"));
        }
    }
}

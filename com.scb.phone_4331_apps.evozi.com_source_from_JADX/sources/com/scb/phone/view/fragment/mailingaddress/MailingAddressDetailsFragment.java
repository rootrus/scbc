package com.scb.phone.view.fragment.mailingaddress;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C7144hz;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ZTBSV;
import p040o.addAllImpl;
import p040o.addAllImpl$MediaBrowserCompat$ItemReceiver;
import p040o.forEachSrcIn;
import p040o.getEnvDeviceID;
import p040o.getEnvDeviceID$MediaBrowserCompat$MediaItem;
import p040o.getEnvDeviceID$MediaBrowserCompat$SearchResultReceiver;
import p040o.getEnvDeviceID$MediaSessionCompat$Token;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.remainingBytes;
import p040o.standardSubList;
import p040o.trimAndCollapseFrom;
import p040o.trimAndCollapseFrom$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

public final class MailingAddressDetailsFragment extends BaseFragment implements C7144hz {
    public static final MailingAddressDetailsFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new MailingAddressDetailsFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    private C6087x2ddfc176 MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    @BindView
    public ConstraintLayout btnCurrentAddress;
    @BindView
    public RadioButton btnCurrentAddressIcon;
    @BindView
    public RadioButton btnNewAddressIcon;
    @BindView
    public Button btnNext;
    @HmlPinActivity
    public getEnvDeviceID presenter;
    @BindView
    public TextView tvAddressDetails;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public MailingAddressDetailsFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C6087x2ddfc176)) {
            activity = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (C6087x2ddfc176) activity;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86122131493839, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(\n      …rKnife.bind(this, view) }");
        return inflate;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getEnvDeviceID getenvdeviceid = this.presenter;
        if (getenvdeviceid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getenvdeviceid.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("PARCELABLE_TOKEN_ID");
            CharSequence charSequence = string;
            boolean z = false;
            if (!(charSequence == null || GoodToKnowActivity.read(charSequence))) {
                getenvdeviceid.write = string;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getEnvDeviceID$MediaBrowserCompat$SearchResultReceiver.write;
                if (getenvdeviceid.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getenvdeviceid.RatingCompat);
                }
                addAllImpl addallimpl = getenvdeviceid.IconCompatParcelizer;
                getEnvDeviceID getenvdeviceid2 = getenvdeviceid;
                FundFactSheetActivity mediaDescriptionCompat = new getEnvDeviceID.MediaDescriptionCompat(getenvdeviceid2);
                FundFactSheetActivity mediaMetadataCompat = new getEnvDeviceID.MediaMetadataCompat(getenvdeviceid2);
                onGetStartedClick.write((Object) mediaDescriptionCompat, "onSuccess");
                onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
                addallimpl.MediaBrowserCompat$ItemReceiver(addallimpl.IconCompatParcelizer, mediaDescriptionCompat, mediaMetadataCompat, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), new addAllImpl$MediaBrowserCompat$ItemReceiver(addallimpl));
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        getEnvDeviceID getenvdeviceid = this.presenter;
        if (getenvdeviceid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getenvdeviceid.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(remainingBytes remainingbytes) {
        onGetStartedClick.write((Object) remainingbytes, "addressDetails");
        TextView textView = this.tvAddressDetails;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddressDetails");
        }
        textView.setText(remainingbytes.IconCompatParcelizer);
    }

    public final void write() {
        ConstraintLayout constraintLayout = this.btnCurrentAddress;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnCurrentAddress");
        }
        constraintLayout.setVisibility(8);
    }

    public final void read() {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(true);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        C6087x2ddfc176 mailingAddressDetailsFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mailingAddressDetailsFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mailingAddressDetailsFragment$MediaBrowserCompat$CustomActionResultReceiver.write(str);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        C6087x2ddfc176 mailingAddressDetailsFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mailingAddressDetailsFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
            mailingAddressDetailsFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
        }
    }

    @OnClick
    public final void onNextClick() {
        getEnvDeviceID getenvdeviceid = this.presenter;
        if (getenvdeviceid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Boolean bool = getenvdeviceid.MediaBrowserCompat$ItemReceiver;
        String str = getenvdeviceid.write;
        if (!(bool == null || str == null)) {
            boolean booleanValue = bool.booleanValue();
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getEnvDeviceID$MediaBrowserCompat$MediaItem.write;
            if (getenvdeviceid.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getenvdeviceid.RatingCompat);
            }
            addAllImpl addallimpl = getenvdeviceid.IconCompatParcelizer;
            getEnvDeviceID getenvdeviceid2 = getenvdeviceid;
            FundFactSheetActivity getenvdeviceid_mediasessioncompat_token = new getEnvDeviceID$MediaSessionCompat$Token(getenvdeviceid2);
            FundFactSheetActivity parcelableVolumeInfo = new getEnvDeviceID.ParcelableVolumeInfo(getenvdeviceid2);
            onGetStartedClick.write((Object) str, "tokenId");
            onGetStartedClick.write((Object) getenvdeviceid_mediasessioncompat_token, "onSuccess");
            onGetStartedClick.write((Object) parcelableVolumeInfo, "onError");
            trimAndCollapseFrom trimandcollapsefrom = addallimpl.read;
            String str2 = !booleanValue ? null : DiskLruCache.VERSION_1;
            if (str2 == null) {
                str2 = "0";
            }
            trimandcollapsefrom.IconCompatParcelizer(getenvdeviceid_mediasessioncompat_token, parcelableVolumeInfo, new trimAndCollapseFrom$MediaBrowserCompat$ItemReceiver(new standardSubList(str, str2)), addallimpl.MediaBrowserCompat$ItemReceiver);
        }
        ((forEachSrcIn) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).read("change_mailing_address");
        forEachSrcIn foreachsrcin = (forEachSrcIn) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        RadioButton radioButton = this.btnCurrentAddressIcon;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnCurrentAddressIcon");
        }
        foreachsrcin.read("mailing_address_selected", radioButton.isChecked() ? "rm_address" : "add_new_address");
        ZTBSV ztbsv = (forEachSrcIn) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "change_mailing_address_address_source");
        }
    }

    @OnClick
    public final void onRadioButtonCheckChanged(View view) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        int id = view.getId();
        boolean z = true;
        if (id == R.id.radioButton_current_address) {
            RadioButton radioButton = this.btnNewAddressIcon;
            if (radioButton == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNewAddressIcon");
            }
            radioButton.setChecked(false);
            RadioButton radioButton2 = this.btnCurrentAddressIcon;
            if (radioButton2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnCurrentAddressIcon");
            }
            radioButton2.setChecked(true);
            getEnvDeviceID getenvdeviceid = this.presenter;
            if (getenvdeviceid == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getenvdeviceid.MediaBrowserCompat$ItemReceiver = Boolean.TRUE;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getEnvDeviceID.write.read;
            if (getenvdeviceid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getenvdeviceid.RatingCompat);
            }
        } else if (id == R.id.radioButton_new_address) {
            RadioButton radioButton3 = this.btnNewAddressIcon;
            if (radioButton3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNewAddressIcon");
            }
            radioButton3.setChecked(true);
            RadioButton radioButton4 = this.btnCurrentAddressIcon;
            if (radioButton4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnCurrentAddressIcon");
            }
            radioButton4.setChecked(false);
            getEnvDeviceID getenvdeviceid2 = this.presenter;
            if (getenvdeviceid2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getenvdeviceid2.MediaBrowserCompat$ItemReceiver = Boolean.FALSE;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getEnvDeviceID.RatingCompat.write;
            if (getenvdeviceid2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getenvdeviceid2.RatingCompat);
            }
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachSrcIn> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachSrcIn();
        }
    }
}

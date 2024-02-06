package com.scb.phone.view.fragment.mailingaddress;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.view.custom.common.CustomAddressInput;
import p040o.CheckEligibilityActivity;
import p040o.ForwardingListIterator;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LinkedListMultimap;
import p040o.addDelayedShutdownHook;
import p040o.bothNullOrEqual;
import p040o.bothNullOrEqual$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.bothNullOrEqual$MediaBrowserCompat$ItemReceiver;
import p040o.forEachSrcIn;
import p040o.onGetStartedClick;
import p040o.standardContainsKey;
import p040o.standardContainsValue;
import p040o.standardEntrySet;
import p040o.standardHashCode;
import p040o.standardLastIndexOf;
import p040o.trimFrom$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.trimLeadingFrom;
import p040o.wrapPosition;
import p040o.writeUInt64NoTag;

public final class MailingAddressInputFragment extends BaseMailingAddressFragment {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private write MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$SearchResultReceiver = "";
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private String RatingCompat = "";
    @HmlPinActivity
    public bothNullOrEqual mailingAddressInputPresenter;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(wrapPosition wrapposition, addDelayedShutdownHook adddelayedshutdownhook, String str, String str2);

        void MediaSessionCompat$ResultReceiverWrapper();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public MailingAddressInputFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        FragmentActivity activity = getActivity();
        if (!(activity instanceof write)) {
            activity = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (write) activity;
        bothNullOrEqual bothnullorequal = this.mailingAddressInputPresenter;
        if (bothnullorequal == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mailingAddressInputPresenter");
        }
        bothnullorequal.MediaBrowserCompat$ItemReceiver(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [o.configDsExpFilePath] */
    /* JADX WARNING: type inference failed for: r0v20, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x007d
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "EXTRA_MAILING_ADDRESS_SUB_DISTRICT_DISPLAY"
            if (r0 == 0) goto L_0x0016
            r0.containsKey(r1)
        L_0x0016:
            android.os.Bundle r0 = r3.getArguments()
            r2 = 0
            if (r0 == 0) goto L_0x0024
            android.os.Parcelable r0 = r0.getParcelable(r1)
            o.addDelayedShutdownHook r0 = (p040o.addDelayedShutdownHook) r0
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            r3.write((p040o.addDelayedShutdownHook) r0)
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "EXTRA_INPUT_LOCALE"
            if (r0 == 0) goto L_0x0033
            r0.containsKey(r1)
        L_0x0033:
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r0.getString(r1)
            goto L_0x003f
        L_0x003e:
            r0 = r2
        L_0x003f:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.MediaBrowserCompat$SearchResultReceiver = r0
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "TOKEN_ID"
            if (r0 == 0) goto L_0x0050
            r0.containsKey(r1)
        L_0x0050:
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.getString(r1)
            goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.RatingCompat = r0
            android.os.Bundle r0 = r3.getArguments()
            java.lang.String r1 = "EXTRA_MAILING_ADDRESS_DISPLAY"
            if (r0 == 0) goto L_0x006d
            r0.containsKey(r1)
        L_0x006d:
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x007a
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2 = r0
            o.wrapPosition r2 = (p040o.wrapPosition) r2
        L_0x007a:
            r3.MediaBrowserCompat$ItemReceiver((p040o.wrapPosition) r2)
        L_0x007d:
            super.onViewCreated(r4, r5)
            r3.AppCompatDialogFragment()
            o.AppStatsDataStore$b r4 = r3.presenter
            if (r4 != 0) goto L_0x008c
            java.lang.String r5 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r5)
        L_0x008c:
            o.wrapPosition r5 = r3.mo38654x50fd9e4a()
            o.addDelayedShutdownHook r0 = r3.setContentView()
            java.lang.String r1 = r3.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r2 = "passedLocale"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)
            r4.write = r5
            r4.MediaBrowserCompat$MediaItem = r0
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r5 = r4.MediaBrowserCompat$ItemReceiver
            java.lang.String r5 = r5.setCheckable()
            java.lang.String r0 = "getLocale()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)
            r4.IconCompatParcelizer = r1
            o.wrapPosition r5 = r4.write
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x00c8
            o.AppStatsDataStore$b$AppCompatDialogFragment r5 = new o.AppStatsDataStore$b$AppCompatDialogFragment
            r5.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r2 = r4.RatingCompat
            if (r2 == 0) goto L_0x00bf
            r2 = r0
            goto L_0x00c0
        L_0x00bf:
            r2 = r1
        L_0x00c0:
            if (r2 == 0) goto L_0x00e4
            T r2 = r4.RatingCompat
            r5.IconCompatParcelizer(r2)
            goto L_0x00e4
        L_0x00c8:
            o.AppStatsDataStore$b$setBackgroundResource r5 = p040o.AppStatsDataStore.C3032b.setBackgroundResource.MediaBrowserCompat$CustomActionResultReceiver
            o.FundFactSheetActivity r5 = (p040o.FundFactSheetActivity) r5
            if (r5 == 0) goto L_0x00d4
            o.configDsExpFilePath r2 = new o.configDsExpFilePath
            r2.<init>(r5)
            r5 = r2
        L_0x00d4:
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r2 = r4.RatingCompat
            if (r2 == 0) goto L_0x00dc
            r2 = r0
            goto L_0x00dd
        L_0x00dc:
            r2 = r1
        L_0x00dd:
            if (r2 == 0) goto L_0x00e4
            T r2 = r4.RatingCompat
            r5.IconCompatParcelizer(r2)
        L_0x00e4:
            o.AppStatsDataStore$b$setContentView r5 = new o.AppStatsDataStore$b$setContentView
            r5.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r2 = r4.RatingCompat
            if (r2 == 0) goto L_0x00f1
            r2 = r0
            goto L_0x00f2
        L_0x00f1:
            r2 = r1
        L_0x00f2:
            if (r2 == 0) goto L_0x00f9
            T r2 = r4.RatingCompat
            r5.IconCompatParcelizer(r2)
        L_0x00f9:
            o.AppStatsDataStore$b$AppCompatActivity r5 = new o.AppStatsDataStore$b$AppCompatActivity
            r5.<init>(r4)
            o.writeUInt64NoTag$IconCompatParcelizer r5 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r5
            T r2 = r4.RatingCompat
            if (r2 == 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r0 = r1
        L_0x0106:
            if (r0 == 0) goto L_0x010d
            T r4 = r4.RatingCompat
            r5.IconCompatParcelizer(r4)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.mailingaddress.MailingAddressInputFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @OnClick
    public final void onNextButtonClick() {
        standardHashCode standardhashcode;
        AppCompatActivity();
        CustomAddressInput customAddressInput = this.houseNo;
        if (customAddressInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("houseNo");
        }
        String trim = customAddressInput.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim, "houseNo.text");
        CustomAddressInput customAddressInput2 = this.unit;
        if (customAddressInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        String trim2 = customAddressInput2.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim2, "unit.text");
        CustomAddressInput customAddressInput3 = this.floor;
        if (customAddressInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        String trim3 = customAddressInput3.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim3, "floor.text");
        CustomAddressInput customAddressInput4 = this.village;
        if (customAddressInput4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        String trim4 = customAddressInput4.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim4, "village.text");
        CustomAddressInput customAddressInput5 = this.moo;
        if (customAddressInput5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        String trim5 = customAddressInput5.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim5, "moo.text");
        CustomAddressInput customAddressInput6 = this.road;
        if (customAddressInput6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        String trim6 = customAddressInput6.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim6, "road.text");
        CustomAddressInput customAddressInput7 = this.alley;
        if (customAddressInput7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        String trim7 = customAddressInput7.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim7, "alley.text");
        TextView textView = this.districtLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("districtLabel");
        }
        String obj = textView.getText().toString();
        TextView textView2 = this.subDistrictLabel;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("subDistrictLabel");
        }
        String obj2 = textView2.getText().toString();
        TextView textView3 = this.provinceLabel;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("provinceLabel");
        }
        String obj3 = textView3.getText().toString();
        TextView textView4 = this.postalCodeLabel;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("postalCodeLabel");
        }
        wrapPosition wrapposition = new wrapPosition(trim, trim2, trim3, trim4, trim5, trim6, trim7, obj, obj2, obj3, textView4.getText().toString(), MediaSessionCompat$Token());
        bothNullOrEqual bothnullorequal = this.mailingAddressInputPresenter;
        if (bothnullorequal == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mailingAddressInputPresenter");
        }
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) wrapposition, "mailingAddressDisplay");
        onGetStartedClick.write((Object) str, "language");
        if (bothnullorequal.RatingCompat != null) {
            bothnullorequal.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.MultisetView.C35822.C35831 r4 = bothnullorequal.read;
        standardLastIndexOf standardlastindexof = new standardLastIndexOf(wrapposition.MediaBrowserCompat$SearchResultReceiver, wrapposition.ParcelableVolumeInfo, wrapposition.RatingCompat, wrapposition.MediaBrowserCompat$MediaItem, wrapposition.MediaBrowserCompat$CustomActionResultReceiver, wrapposition.MediaMetadataCompat, wrapposition.MediaSessionCompat$QueueItem, wrapposition.MediaBrowserCompat$ItemReceiver, wrapposition.IconCompatParcelizer, wrapposition.read, wrapposition.MediaDescriptionCompat);
        if ("en".equals(str)) {
            standardhashcode = new standardHashCode(standardlastindexof, (standardLastIndexOf) null, 2);
        } else {
            standardhashcode = new standardHashCode((standardLastIndexOf) null, standardlastindexof, 1);
        }
        standardEntrySet standardentryset = new standardEntrySet(standardhashcode);
        FundFactSheetActivity iconCompatParcelizer = new bothNullOrEqual.IconCompatParcelizer(bothnullorequal);
        FundFactSheetActivity bothnullorequal_mediabrowsercompat_itemreceiver = new bothNullOrEqual$MediaBrowserCompat$ItemReceiver(bothnullorequal);
        onGetStartedClick.write((Object) standardentryset, "request");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onSuccess");
        onGetStartedClick.write((Object) bothnullorequal_mediabrowsercompat_itemreceiver, "onError");
        r4.IconCompatParcelizer(r4.IconCompatParcelizer, iconCompatParcelizer, bothnullorequal_mediabrowsercompat_itemreceiver, new trimLeadingFrom.IconCompatParcelizer(standardentryset));
        MediaBrowserCompat$ItemReceiver(wrapposition);
    }

    public final void RatingCompat() {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.MediaBrowserCompat$CustomActionResultReceiver(mo38654x50fd9e4a(), setContentView(), this.MediaBrowserCompat$SearchResultReceiver, "INPUT_CONFIRM");
        }
    }

    public final void MediaDescriptionCompat() {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachSrcIn> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachSrcIn();
        }
    }

    @OnClick
    public final void onConfirmButtonClick() {
        String str;
        CustomAddressInput customAddressInput = this.houseNo;
        if (customAddressInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("houseNo");
        }
        String trim = customAddressInput.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim, "houseNo.text");
        CustomAddressInput customAddressInput2 = this.unit;
        if (customAddressInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("unit");
        }
        String trim2 = customAddressInput2.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim2, "unit.text");
        CustomAddressInput customAddressInput3 = this.floor;
        if (customAddressInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("floor");
        }
        String trim3 = customAddressInput3.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim3, "floor.text");
        CustomAddressInput customAddressInput4 = this.village;
        if (customAddressInput4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("village");
        }
        String trim4 = customAddressInput4.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim4, "village.text");
        CustomAddressInput customAddressInput5 = this.moo;
        if (customAddressInput5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moo");
        }
        String trim5 = customAddressInput5.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim5, "moo.text");
        CustomAddressInput customAddressInput6 = this.road;
        if (customAddressInput6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("road");
        }
        String trim6 = customAddressInput6.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim6, "road.text");
        CustomAddressInput customAddressInput7 = this.alley;
        if (customAddressInput7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("alley");
        }
        String trim7 = customAddressInput7.inputTextField.getText().toString().trim();
        onGetStartedClick.IconCompatParcelizer((Object) trim7, "alley.text");
        TextView textView = this.districtLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("districtLabel");
        }
        String obj = textView.getText().toString();
        TextView textView2 = this.subDistrictLabel;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("subDistrictLabel");
        }
        String obj2 = textView2.getText().toString();
        TextView textView3 = this.provinceLabel;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("provinceLabel");
        }
        String obj3 = textView3.getText().toString();
        TextView textView4 = this.postalCodeLabel;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("postalCodeLabel");
        }
        MediaBrowserCompat$CustomActionResultReceiver(new wrapPosition(trim, trim2, trim3, trim4, trim5, trim6, trim7, obj, obj2, obj3, textView4.getText().toString(), MediaSessionCompat$Token()));
        bothNullOrEqual bothnullorequal = this.mailingAddressInputPresenter;
        if (bothnullorequal == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mailingAddressInputPresenter");
        }
        wrapPosition MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo38654x50fd9e4a();
        addDelayedShutdownHook contentView = setContentView();
        wrapPosition MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        String str3 = this.RatingCompat;
        onGetStartedClick.write((Object) str2, "passedLocale");
        onGetStartedClick.write((Object) str3, "tokenId");
        bothnullorequal.IconCompatParcelizer = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        bothnullorequal.MediaBrowserCompat$SearchResultReceiver = contentView;
        bothnullorequal.MediaDescriptionCompat = str2;
        bothnullorequal.write = MediaSessionCompat$ResultReceiverWrapper;
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) "en")) {
            bothnullorequal.MediaBrowserCompat$ItemReceiver = bothnullorequal.IconCompatParcelizer();
            bothnullorequal.MediaMetadataCompat = bothnullorequal.read();
        } else {
            bothnullorequal.MediaBrowserCompat$ItemReceiver = bothnullorequal.read();
            bothnullorequal.MediaMetadataCompat = bothnullorequal.IconCompatParcelizer();
        }
        ForwardingListIterator forwardingListIterator = bothnullorequal.MediaBrowserCompat$ItemReceiver;
        ForwardingListIterator forwardingListIterator2 = bothnullorequal.MediaMetadataCompat;
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
            str = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.write;
        } else {
            str = null;
        }
        standardContainsValue standardcontainsvalue = new standardContainsValue(str3, new standardContainsKey(forwardingListIterator, forwardingListIterator2, str));
        writeUInt64NoTag.IconCompatParcelizer bothnullorequal_mediabrowsercompat_customactionresultreceiver = new bothNullOrEqual$MediaBrowserCompat$CustomActionResultReceiver(standardcontainsvalue);
        if (bothnullorequal.RatingCompat == null) {
            z = false;
        }
        if (z) {
            bothnullorequal_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(bothnullorequal.RatingCompat);
        }
        LinkedListMultimap.MultisetView.C35822.C35831 r2 = bothnullorequal.read;
        FundFactSheetActivity write2 = new bothNullOrEqual.write(bothnullorequal);
        FundFactSheetActivity read2 = new bothNullOrEqual.read(bothnullorequal);
        onGetStartedClick.write((Object) standardcontainsvalue, "request");
        onGetStartedClick.write((Object) write2, "onSuccess");
        onGetStartedClick.write((Object) read2, "onError");
        r2.IconCompatParcelizer(r2.MediaMetadataCompat, write2, read2, new trimFrom$MediaBrowserCompat$CustomActionResultReceiver(standardcontainsvalue));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        r5 = r5.write;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.standardContainsKey r5) {
        /*
            r4 = this;
            o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.forEachSrcIn r0 = (p040o.forEachSrcIn) r0
            java.lang.String r1 = "change_mailing_address"
            r0.read(r1)
            o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.forEachSrcIn r0 = (p040o.forEachSrcIn) r0
            r1 = 0
            if (r5 == 0) goto L_0x001f
            o.ForwardingListIterator r2 = r5.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            java.lang.String r3 = "EN_province"
            r0.read(r3, r2)
            o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.forEachSrcIn r0 = (p040o.forEachSrcIn) r0
            if (r5 == 0) goto L_0x0036
            o.ForwardingListIterator r2 = r5.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x0036
            java.lang.String r2 = r2.MediaBrowserCompat$ItemReceiver
            goto L_0x0037
        L_0x0036:
            r2 = r1
        L_0x0037:
            java.lang.String r3 = "EN_postalCode"
            r0.read(r3, r2)
            o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.forEachSrcIn r0 = (p040o.forEachSrcIn) r0
            if (r5 == 0) goto L_0x004d
            o.ForwardingListIterator r2 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x004e
        L_0x004d:
            r2 = r1
        L_0x004e:
            java.lang.String r3 = "TH_province"
            r0.read(r3, r2)
            o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.forEachSrcIn r0 = (p040o.forEachSrcIn) r0
            if (r5 == 0) goto L_0x0063
            o.ForwardingListIterator r2 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x0063
            java.lang.String r1 = r2.MediaBrowserCompat$ItemReceiver
        L_0x0063:
            java.lang.String r2 = "TH_postalCode"
            r0.read(r2, r1)
            o.HmlVerifyEmailActivity r0 = r4.MediaDescriptionCompat
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.forEachSrcIn r0 = (p040o.forEachSrcIn) r0
            if (r5 == 0) goto L_0x0082
            java.lang.String r5 = r5.write
            if (r5 == 0) goto L_0x0082
            java.lang.String r1 = "O"
            boolean r5 = r5.equals(r1)
            r1 = 1
            if (r5 != r1) goto L_0x0082
            java.lang.String r5 = "office_address"
            goto L_0x0084
        L_0x0082:
            java.lang.String r5 = "home_address"
        L_0x0084:
            java.lang.String r1 = "type_of_new_address"
            r0.read(r1, r5)
            o.HmlVerifyEmailActivity r5 = r4.MediaDescriptionCompat
            java.lang.Object r5 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            o.forEachSrcIn r5 = (p040o.forEachSrcIn) r5
            o.ZTBSV r5 = (p040o.ZTBSV) r5
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x00a6
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            com.scb.phone.view.activity.BaseActivity r0 = (com.scb.phone.view.activity.BaseActivity) r0
            o.getKernelIDDst r0 = r0.scbAnalytics
            java.lang.String r1 = "change_mailing_address_new_address"
            r5.MediaBrowserCompat$ItemReceiver(r0, r1)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.mailingaddress.MailingAddressInputFragment.MediaBrowserCompat$ItemReceiver(o.standardContainsKey):void");
    }
}

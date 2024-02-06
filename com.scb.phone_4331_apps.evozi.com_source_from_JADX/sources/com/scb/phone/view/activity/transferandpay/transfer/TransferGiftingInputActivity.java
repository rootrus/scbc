package com.scb.phone.view.activity.transferandpay.transfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.sme.gifting.GiftPreviewActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingMoneyReviewActivity;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.gift.GiftMoneySelectThemeFragment;
import com.scb.phone.view.fragment.gift.GiftMoneySelectThemeFragment$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.CardView;
import p040o.CrashlyticsReport;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.Ints;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.SquareCap;
import p040o.animateCameraWithCallback;
import p040o.getICheckDeserializerRtti;
import p040o.inject_parameters;
import p040o.inject_parameters$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.inject_parameters$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.parseNdkPayload;
import p040o.removeDependent;
import p040o.removeIfFromRandomAccessList;
import p040o.reportFromJson;
import p040o.reportToJson;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.tryExpireEntries;
import p040o.writeUInt64NoTag;

public final class TransferGiftingInputActivity extends BaseActivity implements ServerProjectProvider.C12918 {
    private static IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);
    @BindView
    public NoteEditText noteEditText;
    @HmlPinActivity
    public inject_parameters presenter;

    public static final void MediaBrowserCompat$ItemReceiver(Context context, reportToJson reporttojson) {
        onGetStartedClick.write((Object) reporttojson, "display");
        if (context != null) {
            Intent intent = new Intent(context, TransferGiftingInputActivity.class);
            intent.putExtra("TRANSFER_GIFTING_INPUT", reporttojson);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80182131493243);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.transfer_gifting_input_title);
        setTabContainer();
        inject_parameters inject_parameters = this.presenter;
        if (inject_parameters == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        inject_parameters.MediaBrowserCompat$ItemReceiver(this);
        NoteEditText noteEditText2 = this.noteEditText;
        if (noteEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("noteEditText");
        }
        noteEditText2.setErrorMessage(getString(R.string.transfer_gifting_invalid_error));
        mo13676d_("transfer_gifting_input");
        if (((reportToJson) getIntent().getParcelableExtra("TRANSFER_GIFTING_INPUT")) != null) {
            inject_parameters inject_parameters2 = this.presenter;
            if (inject_parameters2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            Parcelable parcelableExtra = getIntent().getParcelableExtra("TRANSFER_GIFTING_INPUT");
            onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(TRANSFER_GIFTING_INPUT)");
            reportToJson reporttojson = (reportToJson) parcelableExtra;
            onGetStartedClick.write((Object) reporttojson, "transferGiftingInputDisplay");
            inject_parameters2.write = reporttojson;
            inject_parameters inject_parameters3 = this.presenter;
            if (inject_parameters3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (inject_parameters3.RatingCompat != null) {
                inject_parameters3.RatingCompat.AlertController$RecycleListView();
            }
            inject_parameters3.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            inject_parameters3.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new inject_parameters$MediaBrowserCompat$CustomActionResultReceiver(inject_parameters3));
            return;
        }
        finish();
    }

    @OnClick
    public final void onPreviewButtonClicked() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.fm_layout_card_selection);
        if (findFragmentById instanceof GiftMoneySelectThemeFragment) {
            inject_parameters inject_parameters = this.presenter;
            if (inject_parameters == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            NoteEditText noteEditText2 = this.noteEditText;
            if (noteEditText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("noteEditText");
            }
            String obj = noteEditText2.mNoteEditText.getText().toString();
            AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r0 = ((GiftMoneySelectThemeFragment) findFragmentById).IconCompatParcelizer;
            if (r0 != null) {
                writeUInt64NoTag.IconCompatParcelizer inject_parameters_mediabrowsercompat_itemreceiver = new inject_parameters$MediaBrowserCompat$ItemReceiver(inject_parameters, r0, obj);
                if (inject_parameters.RatingCompat != null) {
                    inject_parameters_mediabrowsercompat_itemreceiver.IconCompatParcelizer(inject_parameters.RatingCompat);
                }
            }
        }
    }

    @OnClick
    public final void onSendGiftButtonClicked() {
        AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder;
        String str;
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.fm_layout_card_selection);
        if (findFragmentById instanceof GiftMoneySelectThemeFragment) {
            inject_parameters inject_parameters = this.presenter;
            if (inject_parameters == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            NoteEditText noteEditText2 = this.noteEditText;
            if (noteEditText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("noteEditText");
            }
            String obj = noteEditText2.mNoteEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "noteEditText.note");
            AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r0 = ((GiftMoneySelectThemeFragment) findFragmentById).IconCompatParcelizer;
            onGetStartedClick.write((Object) obj, "note");
            if (r0 != null) {
                boolean z = false;
                if (TextUtils.isEmpty(obj) || Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@:;<>!^\\-]+$").matcher(obj).matches()) {
                    if (inject_parameters.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        inject_parameters.RatingCompat.AlertController$RecycleListView();
                    }
                    reportToJson reporttojson = inject_parameters.write;
                    if (reporttojson == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("transferGiftingInputDisplay");
                    }
                    if (reporttojson.read != null) {
                        CrashlyticsReport.Session.Event.Application.Builder builder2 = new CrashlyticsReport.Session.Event.Application.Builder();
                        builder2.setCheckable = reporttojson.RatingCompat.name();
                        String str2 = reporttojson.write;
                        if (str2 == null) {
                            animateCameraWithCallback animatecamerawithcallback = reporttojson.MediaDescriptionCompat;
                            if (animatecamerawithcallback != null) {
                                str2 = animatecamerawithcallback.name();
                            } else {
                                str2 = null;
                            }
                        }
                        builder2.AppCompatActivity = str2;
                        CrashlyticsReport.Session.Event.Application.Builder MediaBrowserCompat$CustomActionResultReceiver = builder2.MediaBrowserCompat$CustomActionResultReceiver(reporttojson.read);
                        if (IGoogleMapDelegate.PROMPTPAY == reporttojson.RatingCompat) {
                            str = reporttojson.MediaBrowserCompat$MediaItem;
                        } else {
                            str = reporttojson.IconCompatParcelizer;
                        }
                        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = str;
                        builder = Ints.write(MediaBrowserCompat$CustomActionResultReceiver);
                        onGetStartedClick.IconCompatParcelizer((Object) builder, "giftTransferInputMapper.…e(favouriteTargetDisplay)");
                    } else {
                        if (IGoogleMapDelegate.PROMPTPAY != reporttojson.RatingCompat) {
                            builder = Ints.MediaBrowserCompat$ItemReceiver(reporttojson.IconCompatParcelizer, reporttojson.write);
                        } else if (animateCameraWithCallback.CID == reporttojson.MediaDescriptionCompat) {
                            Ints ints = inject_parameters.read;
                            parseNdkPayload parsendkpayload = new parseNdkPayload();
                            parsendkpayload.MediaBrowserCompat$ItemReceiver = reporttojson.MediaBrowserCompat$MediaItem;
                            builder = ints.write((removeDependent) parsendkpayload);
                        } else {
                            Ints ints2 = inject_parameters.read;
                            reportFromJson reportfromjson = new reportFromJson();
                            reportfromjson.MediaBrowserCompat$ItemReceiver = reporttojson.MediaBrowserCompat$MediaItem;
                            builder = ints2.write((removeDependent) reportfromjson);
                        }
                        onGetStartedClick.IconCompatParcelizer((Object) builder, "if (TransferType.PROMPTP…ountToBankCode)\n        }");
                    }
                    SquareCap squareCap = inject_parameters.MediaBrowserCompat$ItemReceiver;
                    reportToJson reporttojson2 = inject_parameters.write;
                    if (reporttojson2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("transferGiftingInputDisplay");
                    }
                    tryExpireEntries MediaBrowserCompat$CustomActionResultReceiver2 = tryExpireEntries.MediaBrowserCompat$CustomActionResultReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = reporttojson2.MediaBrowserCompat$ItemReceiver;
                    MediaBrowserCompat$CustomActionResultReceiver2.read = removeIfFromRandomAccessList.read(reporttojson2.MediaBrowserCompat$CustomActionResultReceiver);
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat = builder.MediaBrowserCompat$MediaItem;
                    MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = String.valueOf(r0.RatingCompat);
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem = obj;
                    if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(IGoogleMapDelegate.PROMPTPAY), builder.MediaBrowserCompat$MediaItem, true)) {
                        MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = builder.MediaBrowserCompat$ItemReceiver;
                        MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat = builder.MediaDescriptionCompat;
                    } else {
                        MediaBrowserCompat$CustomActionResultReceiver2.write = builder.MediaBrowserCompat$ItemReceiver;
                        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = builder.MediaBrowserCompat$CustomActionResultReceiver;
                    }
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "giftMoneyVerificationRequest");
                    squareCap.read(MediaBrowserCompat$CustomActionResultReceiver2);
                    inject_parameters.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new inject_parameters.IconCompatParcelizer(builder, inject_parameters, obj, r0));
                    return;
                }
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = inject_parameters.write.IconCompatParcelizer;
                if (inject_parameters.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(inject_parameters.RatingCompat);
                }
            }
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.transfer_gifting_input_title);
        setTabContainer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list) {
        onGetStartedClick.write((Object) list, "giftMoneySelectionDisplays");
        CardView read = getSupportFragmentManager().read();
        GiftMoneySelectThemeFragment$MediaBrowserCompat$ItemReceiver giftMoneySelectThemeFragment$MediaBrowserCompat$ItemReceiver = GiftMoneySelectThemeFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) list, "giftMoneyDisplayList");
        GiftMoneySelectThemeFragment giftMoneySelectThemeFragment = new GiftMoneySelectThemeFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("EXTRA_GIFT_MONEY_LIST", (ArrayList) list);
        giftMoneySelectThemeFragment.setArguments(bundle);
        read.MediaBrowserCompat$ItemReceiver(R.id.fm_layout_card_selection, giftMoneySelectThemeFragment).write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        NoteEditText noteEditText2 = this.noteEditText;
        if (noteEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("noteEditText");
        }
        noteEditText2.write();
    }

    public final void write(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_User, "giftDisplay");
        Intent intent = new Intent(this, GiftPreviewActivity.class);
        intent.putExtra("EXTRA_GIFT_STATUS_SELECTED", autoValue_CrashlyticsReport_Session_User);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        onGetStartedClick.write((Object) setuuidfromutf8bytes, "reviewDisplay");
        GiftingMoneyReviewActivity.MediaBrowserCompat$ItemReceiver(this, setuuidfromutf8bytes);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }
}

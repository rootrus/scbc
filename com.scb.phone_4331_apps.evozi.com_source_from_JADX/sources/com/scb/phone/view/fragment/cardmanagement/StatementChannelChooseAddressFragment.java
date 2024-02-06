package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelCommonActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.custom.cardmanagement.CustomStatementChannelViewComponent;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.ExtractorResponse;
import p040o.ExtractorResponse$MediaBrowserCompat$ItemReceiver;
import p040o.FirebaseVisionFace;
import p040o.FirebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.FirebaseVisionFace$MediaBrowserCompat$ItemReceiver;
import p040o.FirebaseVisionFace$MediaBrowserCompat$MediaItem;
import p040o.FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver;
import p040o.GoogleMap;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class StatementChannelChooseAddressFragment extends BaseFragment implements ExtractorResponse.IconCompatParcelizer, CustomStatementChannelViewComponent.IconCompatParcelizer {
    public static final C5871x29f73915 IconCompatParcelizer = new C5871x29f73915((byte) 0);
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private ArrayList<chain> MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat;
    private chain MediaMetadataCompat;
    private String RatingCompat;
    @BindView
    public Button btnNext;
    @HmlPinActivity
    public FirebaseVisionFace presenter;
    @BindView
    public CustomStatementChannelViewComponent viewAddNewAddress;
    @BindView
    public CustomStatementChannelViewComponent viewAddress;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    private static final /* synthetic */ void read(Context context, Intent intent) {
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onResume() {
        String str;
        String str2;
        super.onResume();
        FirebaseVisionFace firebaseVisionFace = this.presenter;
        if (firebaseVisionFace == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str3 = firebaseVisionFace.read;
        if (str3 != null) {
            String MediaMetadataCompat2 = firebaseVisionFace.MediaMetadataCompat.write.MediaMetadataCompat();
            String str4 = "";
            if (MediaMetadataCompat2 == null) {
                MediaMetadataCompat2 = str4;
            }
            boolean z = false;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) MediaMetadataCompat2)) {
                Boolean bool = firebaseVisionFace.MediaDescriptionCompat;
                GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = firebaseVisionFace.IconCompatParcelizer.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
                if (AppCompatDelegateImpl$ListMenuDecorView != null) {
                    str2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$SearchResultReceiver;
                } else {
                    str2 = null;
                }
                if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) DiskLruCache.VERSION_1)))) {
                    writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new FirebaseVisionFace.ParcelableVolumeInfo(firebaseVisionFace);
                    if (firebaseVisionFace.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        parcelableVolumeInfo.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
                    }
                }
            } else {
                GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView2 = firebaseVisionFace.IconCompatParcelizer.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
                if (AppCompatDelegateImpl$ListMenuDecorView2 != null) {
                    str = AppCompatDelegateImpl$ListMenuDecorView2.MediaBrowserCompat$SearchResultReceiver;
                } else {
                    str = null;
                }
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1)) {
                    writeUInt64NoTag.IconCompatParcelizer ratingCompat = new FirebaseVisionFace.RatingCompat(firebaseVisionFace);
                    if (firebaseVisionFace.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        ratingCompat.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
                    }
                } else {
                    String MediaMetadataCompat3 = firebaseVisionFace.MediaMetadataCompat.write.MediaMetadataCompat();
                    if (MediaMetadataCompat3 != null) {
                        str4 = MediaMetadataCompat3;
                    }
                    if (str4.length() > 0) {
                        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new FirebaseVisionFace.MediaMetadataCompat(firebaseVisionFace);
                        if (firebaseVisionFace.RatingCompat != null) {
                            mediaMetadataCompat.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
                        }
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FirebaseVisionFace$MediaBrowserCompat$SearchResultReceiver.write;
                        if (firebaseVisionFace.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
                        }
                    } else {
                        writeUInt64NoTag.IconCompatParcelizer firebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver = new FirebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver(firebaseVisionFace);
                        if (firebaseVisionFace.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            firebaseVisionFace$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
                        }
                    }
                }
            }
            firebaseVisionFace.read = null;
            firebaseVisionFace.MediaDescriptionCompat = null;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f89972131494224, viewGroup, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.RatingCompat = AlertController$RecycleListView.write(arguments, "EXTRA_CHANNEL_KEY");
            this.MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.write(arguments, "EXTRA_ADDRESS_KEY");
            chain chain = (chain) arguments.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaMetadataCompat = chain;
            }
            ArrayList<chain> parcelableArrayList = arguments.getParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_KEY_LIST");
            if (parcelableArrayList != null) {
                onGetStartedClick.IconCompatParcelizer((Object) parcelableArrayList, "arrayCreditCard");
                this.MediaBrowserCompat$MediaItem = parcelableArrayList;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        FirebaseVisionFace firebaseVisionFace = this.presenter;
        if (firebaseVisionFace == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        firebaseVisionFace.MediaBrowserCompat$ItemReceiver(this);
        chain chain = this.MediaMetadataCompat;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        ArrayList<chain> arrayList = this.MediaBrowserCompat$MediaItem;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        firebaseVisionFace.MediaBrowserCompat$ItemReceiver = chain;
        firebaseVisionFace.write = arrayList;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FirebaseVisionFace$MediaBrowserCompat$MediaItem.read;
        boolean z = true;
        if (firebaseVisionFace.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer firebaseVisionFace$MediaBrowserCompat$ItemReceiver = new FirebaseVisionFace$MediaBrowserCompat$ItemReceiver(firebaseVisionFace);
        if (firebaseVisionFace.RatingCompat != null) {
            firebaseVisionFace$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = FirebaseVisionFace.read.read;
        if (firebaseVisionFace.RatingCompat != null) {
            iconCompatParcelizer2.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new FirebaseVisionFace.MediaDescriptionCompat(firebaseVisionFace);
        if (firebaseVisionFace.RatingCompat == null) {
            z = false;
        }
        if (z) {
            mediaDescriptionCompat.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        MediaBrowserCompat$CustomActionResultReceiver("EXTRA_SELECT_ADD_NEW_ADDRESS_KEY");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        MediaBrowserCompat$CustomActionResultReceiver("EXTRA_SELECT_ADDRESS_KEY");
    }

    @OnClick
    public final void onClickNext() {
        FirebaseVisionFace firebaseVisionFace = this.presenter;
        if (firebaseVisionFace == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.MediaDescriptionCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("userSelect");
        }
        onGetStartedClick.write((Object) str, "userSelect");
        writeUInt64NoTag.IconCompatParcelizer write2 = new FirebaseVisionFace.write(firebaseVisionFace, str);
        if (firebaseVisionFace.RatingCompat != null) {
            write2.IconCompatParcelizer(firebaseVisionFace.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(chain chain, ArrayList<chain> arrayList, String str) {
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        onGetStartedClick.write((Object) str, "address");
        Context context = getContext();
        if (context != null) {
            StatementChannelCommonActivity.write write2 = StatementChannelCommonActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            String str2 = this.RatingCompat;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("channel");
            }
            Intent IconCompatParcelizer2 = StatementChannelCommonActivity.write.IconCompatParcelizer(context, chain, arrayList, str2, str);
            IntentTidInjectionContextAspect.aspectOf();
            read(context, IconCompatParcelizer2);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "key");
        this.MediaDescriptionCompat = str;
        CustomStatementChannelViewComponent customStatementChannelViewComponent = this.viewAddress;
        if (customStatementChannelViewComponent == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewAddress");
        }
        RadioButton radioButton = customStatementChannelViewComponent.cbSelect;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbSelect");
        }
        radioButton.setChecked(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "EXTRA_SELECT_ADDRESS_KEY"));
        CustomStatementChannelViewComponent customStatementChannelViewComponent2 = this.viewAddNewAddress;
        if (customStatementChannelViewComponent2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewAddNewAddress");
        }
        RadioButton radioButton2 = customStatementChannelViewComponent2.cbSelect;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbSelect");
        }
        radioButton2.setChecked(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "EXTRA_SELECT_ADD_NEW_ADDRESS_KEY"));
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, String str) {
        onGetStartedClick.write((Object) str, "address");
        CustomStatementChannelViewComponent customStatementChannelViewComponent = this.viewAddress;
        if (customStatementChannelViewComponent == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewAddress");
        }
        customStatementChannelViewComponent.setKey("EXTRA_SELECT_ADDRESS_KEY");
        int i = 0;
        customStatementChannelViewComponent.IconCompatParcelizer(false);
        customStatementChannelViewComponent.setTitle(str);
        String string = getString(R.string.ccr_email_already_verified_in_easy);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.ccr_e…already_verified_in_easy)");
        customStatementChannelViewComponent.setRemark(string);
        customStatementChannelViewComponent.setListener(this);
        if (!z) {
            i = 8;
        }
        customStatementChannelViewComponent.setVisibility(i);
    }

    public final void IconCompatParcelizer() {
        CustomStatementChannelViewComponent customStatementChannelViewComponent = this.viewAddNewAddress;
        if (customStatementChannelViewComponent == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewAddNewAddress");
        }
        customStatementChannelViewComponent.setKey("EXTRA_SELECT_ADD_NEW_ADDRESS_KEY");
        customStatementChannelViewComponent.IconCompatParcelizer(true);
        String string = getString(R.string.ccr_add_new_email);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.ccr_add_new_email)");
        customStatementChannelViewComponent.setTitle(string);
        String string2 = getString(R.string.ccr_add_new_email_remark);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.ccr_add_new_email_remark)");
        customStatementChannelViewComponent.setRemark(string2);
        customStatementChannelViewComponent.setListener(this);
        customStatementChannelViewComponent.setVisibility(0);
    }

    public final void onDestroy() {
        FirebaseVisionFace firebaseVisionFace = this.presenter;
        if (firebaseVisionFace == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        firebaseVisionFace.read = null;
        firebaseVisionFace.MediaDescriptionCompat = null;
        FirebaseVisionFace firebaseVisionFace2 = this.presenter;
        if (firebaseVisionFace2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        firebaseVisionFace2.onDestroy();
        super.onDestroy();
    }

    public final void read() {
        String str;
        FirebaseVisionFace firebaseVisionFace = this.presenter;
        if (firebaseVisionFace == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String MediaMetadataCompat2 = firebaseVisionFace.MediaMetadataCompat.write.MediaMetadataCompat();
        if (MediaMetadataCompat2 == null) {
            MediaMetadataCompat2 = "";
        }
        firebaseVisionFace.read = MediaMetadataCompat2;
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = firebaseVisionFace.IconCompatParcelizer.IconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView();
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            str = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = null;
        }
        firebaseVisionFace.MediaDescriptionCompat = Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1));
        Context context = getContext();
        if (context != null) {
            Intent IconCompatParcelizer2 = ManageEmailLandingActivity.IconCompatParcelizer(context);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(IconCompatParcelizer2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(IconCompatParcelizer2, 119);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaMetadataCompat() {
        Context context = getContext();
        if (context != null) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(context);
            IconCompatParcelizer2.setCancelable(false);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver((int) R.string.confirm_to_receive_e_statements_via_new_email).IconCompatParcelizer((int) R.string.confirm_to_receive_e_statements_via_new_email_desc);
            IconCompatParcelizer3.IconCompatParcelizer(IconCompatParcelizer3.read.getString(R.string.ok), new write(this)).show();
        }
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ StatementChannelChooseAddressFragment MediaBrowserCompat$CustomActionResultReceiver;

        write(StatementChannelChooseAddressFragment statementChannelChooseAddressFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = statementChannelChooseAddressFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            StatementChannelChooseAddressFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(ExtractorResponse$MediaBrowserCompat$ItemReceiver extractorResponse$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) extractorResponse$MediaBrowserCompat$ItemReceiver, "callback");
        Context context = getContext();
        if (context != null) {
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(context).MediaBrowserCompat$ItemReceiver((int) R.string.ccr_email_verification_title).IconCompatParcelizer((int) R.string.change_statement_not_verify_email_desc);
            CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.ccr_email_verification_cancel_btn), new C5870x7aa007c6(extractorResponse$MediaBrowserCompat$ItemReceiver));
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ccr_email_verification_ok_btn), new read(extractorResponse$MediaBrowserCompat$ItemReceiver)).show();
        }
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ ExtractorResponse$MediaBrowserCompat$ItemReceiver read;

        read(ExtractorResponse$MediaBrowserCompat$ItemReceiver extractorResponse$MediaBrowserCompat$ItemReceiver) {
            this.read = extractorResponse$MediaBrowserCompat$ItemReceiver;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.read.read();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(StatementChannelChooseAddressFragment statementChannelChooseAddressFragment) {
        chain chain = statementChannelChooseAddressFragment.MediaMetadataCompat;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        ArrayList<chain> arrayList = statementChannelChooseAddressFragment.MediaBrowserCompat$MediaItem;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        String str = statementChannelChooseAddressFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("address");
        }
        statementChannelChooseAddressFragment.IconCompatParcelizer(chain, arrayList, str);
    }

    public final void write() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("change_stmt_channel_chooseemail", zsyr2kArr);
        }
    }
}

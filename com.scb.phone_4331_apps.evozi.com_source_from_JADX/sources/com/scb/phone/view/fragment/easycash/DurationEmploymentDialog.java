package com.scb.phone.view.fragment.easycash;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomTwoPicker;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Auth;
import p040o.C10838getFieldId;
import p040o.C5425xff02711e;
import p040o.ConnectionTracker;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardCoachMarkActivity;
import p040o.DebitCardMarketConductActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.DepositTransactionAdapter$ChildViewHolder;
import p040o.FragmentBuilder_BindPreregisteredMobileFragment;
import p040o.FragmentBuilder_BindTransferTabFragment;
import p040o.HideFirstParty;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.HmlPinActivity;
import p040o.IFragmentWrapper;
import p040o.ISprintService;
import p040o.SafeParcelable;
import p040o.UserRecoverableNotifiedException;
import p040o.addWorkAccount;
import p040o.clearTileCache;
import p040o.createDoubleList;
import p040o.dispatchTransaction;
import p040o.ensureAtEnd;
import p040o.failOverNotificationUserLog;
import p040o.fromDataField;
import p040o.getFadeIn;
import p040o.getRadius;
import p040o.getStrokePattern;
import p040o.getTile;
import p040o.getTransparency;
import p040o.hasPrevious;
import p040o.hn$MediaBrowserCompat$ItemReceiver;
import p040o.isMutable;
import p040o.newValueReference;
import p040o.onGetStartedClick;
import p040o.parseHexLong;
import p040o.processPendingNotifications;
import p040o.putIfAbsent;
import p040o.putOpenGift;
import p040o.reclaimKey;
import p040o.setFadeIn;
import p040o.setOnMarkerDragListener;
import p040o.setPoints;
import p040o.setStrokePattern;
import p040o.tryCrossOverAndBubbleUp;
import p040o.zabr;
import p040o.zzbz;
import p040o.zzdp;
import p040o.zzdu;
import p040o.zzfh;
import p040o.zzfw;

public final class DurationEmploymentDialog extends Dialog implements putOpenGift, DialogInterface.OnShowListener {
    public read IconCompatParcelizer;
    private final failOverNotificationUserLog MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver = "-";
    @BindView
    public Button positiveButton;
    private final failOverNotificationUserLog read;
    @BindView
    public CustomTwoPicker twoPickerView;
    public String write = "-";

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DurationEmploymentDialog(Context context) {
        super(context);
        Context context2 = context;
        onGetStartedClick.write((Object) context2, "context");
        String[] strArr = {"-", "0", DiskLruCache.VERSION_1, "2", "3", "4", "5", "6", "7", "8", "9", "10", ">10"};
        String string = context2.getString(R.string.auto_scbone_occupation_picker_column_year_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "context.getString(R.stri…picker_column_year_title)");
        this.read = new failOverNotificationUserLog("YEAR", strArr, string);
        String[] strArr2 = {"-", "0", DiskLruCache.VERSION_1, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String string2 = context2.getString(R.string.auto_scbone_occupation_picker_column_month_title);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "context.getString(R.stri…icker_column_month_title)");
        this.MediaBrowserCompat$CustomActionResultReceiver = new failOverNotificationUserLog("MONTH", strArr2, string2);
    }

    public static final class write implements fromDataField {
        public FragmentBuilder_BindPreregisteredMobileFragment IconCompatParcelizer;
        private final hn$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
        private final tryCrossOverAndBubbleUp.write MediaBrowserCompat$ItemReceiver;
        private final Auth.AuthCredentialsOptions MediaBrowserCompat$SearchResultReceiver;
        private final dispatchTransaction MediaDescriptionCompat;
        private addWorkAccount MediaMetadataCompat;
        private final C5425xff02711e RatingCompat;
        private final UserRecoverableNotifiedException read;
        private final FragmentBuilder_BindTransferTabFragment write;

        private write() {
        }

        @HmlPinActivity
        public write(hn$MediaBrowserCompat$ItemReceiver hn_mediabrowsercompat_itemreceiver, C5425xff02711e synchronizedsetmultimap_mediabrowsercompat_customactionresultreceiver, tryCrossOverAndBubbleUp.write write2, FragmentBuilder_BindTransferTabFragment fragmentBuilder_BindTransferTabFragment, Auth.AuthCredentialsOptions authCredentialsOptions, dispatchTransaction dispatchtransaction, addWorkAccount addworkaccount, UserRecoverableNotifiedException userRecoverableNotifiedException, FragmentBuilder_BindPreregisteredMobileFragment fragmentBuilder_BindPreregisteredMobileFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hn_mediabrowsercompat_itemreceiver;
            this.RatingCompat = synchronizedsetmultimap_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$ItemReceiver = write2;
            this.write = fragmentBuilder_BindTransferTabFragment;
            this.MediaBrowserCompat$SearchResultReceiver = authCredentialsOptions;
            this.MediaDescriptionCompat = dispatchtransaction;
            this.MediaMetadataCompat = addworkaccount;
            this.read = userRecoverableNotifiedException;
            this.IconCompatParcelizer = fragmentBuilder_BindPreregisteredMobileFragment;
        }

        public final DebitCardResetOtpActivity<setPoints> read(String str, String str2, putIfAbsent putifabsent) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.activateDebitCard(str, str2, putifabsent).map(isMutable.MediaBrowserCompat$ItemReceiver).map(new zzbz(this.read));
        }

        public final DebitCardResetOtpActivity<clearTileCache> MediaBrowserCompat$ItemReceiver(String str, String str2, newValueReference newvaluereference) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.confirmDebitCard(str, str2, newvaluereference).map(zzdp.write).map(new zzfw(this.MediaMetadataCompat));
        }

        public final DebitCardResetOtpActivity<setPoints> write() {
            return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.IconCompatParcelizer);
        }

        public final DebitCardResetOtpActivity<setFadeIn> read() {
            return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.write);
        }

        public final DebitCardResetOtpActivity<clearTileCache> IconCompatParcelizer() {
            return DebitCardResetOtpActivity.create(new C10838getFieldId(this));
        }

        public final DebitCardResetOtpActivity<DepositTransactionAdapter$ChildViewHolder> MediaBrowserCompat$CustomActionResultReceiver() {
            setStrokePattern setstrokepattern = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            reclaimKey reclaimkey = this.IconCompatParcelizer.RatingCompat;
            getTile gettile = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            return DebitCardResetOtpActivity.just(new DepositTransactionAdapter$ChildViewHolder(setstrokepattern, reclaimkey));
        }

        public final DebitCardResetOtpActivity<List<getFadeIn>> read(CustomConcurrentHashMap.C32852 r3) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.getDebitCardActivationLandingData(r3).map(zzdu.MediaBrowserCompat$ItemReceiver).map(new parseHexLong(this.MediaBrowserCompat$ItemReceiver));
        }

        public final DebitCardResetOtpActivity<getRadius> MediaBrowserCompat$ItemReceiver(CustomConcurrentHashMap.C32852 r3) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.getDebitCardLandingData(r3).map(zzfh.MediaBrowserCompat$CustomActionResultReceiver).map(new SafeParcelable(this.RatingCompat));
        }

        public final DebitCardResetOtpActivity<setOnMarkerDragListener> MediaBrowserCompat$ItemReceiver() {
            return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.MediaMetadataCompat);
        }

        public final DebitCardResetOtpActivity<getStrokePattern> MediaBrowserCompat$MediaItem() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.getProductCatalog().map(new HideFirstParty(this.MediaDescriptionCompat));
        }

        public final void MediaBrowserCompat$ItemReceiver(setPoints setpoints) {
            this.IconCompatParcelizer.IconCompatParcelizer = setpoints;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(setFadeIn setfadein) {
            this.IconCompatParcelizer.write = setfadein;
        }

        public final DebitCardCoachMarkActivity read(clearTileCache cleartilecache) {
            this.IconCompatParcelizer.read = cleartilecache;
            return DebitCardCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver((DebitCardMarketConductActivity) createDoubleList.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final void write(getTile gettile) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = gettile;
        }

        public final void write(setOnMarkerDragListener setonmarkerdraglistener) {
            this.IconCompatParcelizer.MediaMetadataCompat = setonmarkerdraglistener;
        }

        public final DebitCardResetOtpActivity<setStrokePattern> read(reclaimKey reclaimkey) {
            this.IconCompatParcelizer.RatingCompat = reclaimkey;
            hn$MediaBrowserCompat$ItemReceiver hn_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            zabr.IconCompatParcelizer("9003");
            return hn_mediabrowsercompat_itemreceiver.write.verifyDebitCard(reclaimkey).map(new IFragmentWrapper.Stub(this.MediaBrowserCompat$SearchResultReceiver)).doOnNext(new ensureAtEnd(this));
        }

        public final DebitCardResetOtpActivity<getTransparency> MediaBrowserCompat$ItemReceiver(processPendingNotifications processpendingnotifications) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.write.verifyDebitCardActivation(processpendingnotifications).map(hasPrevious.MediaBrowserCompat$CustomActionResultReceiver).map(new ConnectionTracker(this.write));
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f85382131493765);
        ButterKnife.write((Dialog) this);
        Button button = this.positiveButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("positiveButton");
        }
        button.setOnClickListener(new IconCompatParcelizer(this));
        setOnShowListener(this);
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "yearValue");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "11") ? ">10" : str;
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ DurationEmploymentDialog MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(DurationEmploymentDialog durationEmploymentDialog) {
            this.MediaBrowserCompat$ItemReceiver = durationEmploymentDialog;
        }

        public final void onClick(View view) {
            DurationEmploymentDialog durationEmploymentDialog = this.MediaBrowserCompat$ItemReceiver;
            String write = DurationEmploymentDialog.write(durationEmploymentDialog, durationEmploymentDialog.write);
            String write2 = DurationEmploymentDialog.write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
            read write3 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (write3 != null) {
                write3.MediaBrowserCompat$CustomActionResultReceiver(write, write2);
            }
            this.MediaBrowserCompat$ItemReceiver.dismiss();
        }
    }

    private final void write(boolean z) {
        if (z) {
            this.MediaBrowserCompat$ItemReceiver = "0";
            CustomTwoPicker customTwoPicker = this.twoPickerView;
            if (customTwoPicker == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
            }
            customTwoPicker.setSelected(1, "MONTH");
        }
        CustomTwoPicker customTwoPicker2 = this.twoPickerView;
        if (customTwoPicker2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
        }
        customTwoPicker2.setEnable(!z, "MONTH");
    }

    private final boolean read() {
        CharSequence charSequence = this.MediaBrowserCompat$ItemReceiver;
        return (charSequence == null || charSequence.length() == 0) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) "-") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) "0");
    }

    public static final /* synthetic */ String write(String str) {
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "-")) {
            return null;
        }
        return str;
    }

    public static final /* synthetic */ String write(DurationEmploymentDialog durationEmploymentDialog, String str) {
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "-")) {
            return null;
        }
        String[] strArr = durationEmploymentDialog.read.write;
        String[] strArr2 = durationEmploymentDialog.read.write;
        onGetStartedClick.write((Object) strArr2, "$this$lastIndex");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) strArr[strArr2.length + -1]) ? "11" : str;
    }

    public final void write(ISprintService iSprintService) {
        onGetStartedClick.write((Object) iSprintService, "data");
        String str = iSprintService.IconCompatParcelizer;
        this.write = str;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "0") && read()) {
            this.MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1;
            CustomTwoPicker customTwoPicker = this.twoPickerView;
            if (customTwoPicker == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
            }
            customTwoPicker.setSelected(2, "MONTH");
        }
        write(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ">10"));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ISprintService iSprintService) {
        onGetStartedClick.write((Object) iSprintService, "data");
        this.MediaBrowserCompat$ItemReceiver = iSprintService.IconCompatParcelizer;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) "0") && read()) {
            this.MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1;
            CustomTwoPicker customTwoPicker = this.twoPickerView;
            if (customTwoPicker == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
            }
            customTwoPicker.setSelected(2, "MONTH");
        } else if (read()) {
            this.MediaBrowserCompat$ItemReceiver = "0";
            CustomTwoPicker customTwoPicker2 = this.twoPickerView;
            if (customTwoPicker2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
            }
            customTwoPicker2.setSelected(1, "MONTH");
        }
    }

    public final void onShow(DialogInterface dialogInterface) {
        CustomTwoPicker customTwoPicker = this.twoPickerView;
        if (customTwoPicker == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
        }
        customTwoPicker.MediaBrowserCompat$CustomActionResultReceiver(this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
        customTwoPicker.setOnSelectedLister(this);
        boolean z = false;
        CustomTwoPicker.setSelected$default(customTwoPicker, 0, (String) null, 2, (Object) null);
        CharSequence charSequence = this.write;
        if ((charSequence == null || charSequence.length() == 0) || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) "11")) {
            CharSequence charSequence2 = this.write;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                int MediaBrowserCompat$ItemReceiver2 = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver((T[]) this.read.write, this.write);
                CustomTwoPicker customTwoPicker2 = this.twoPickerView;
                if (customTwoPicker2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
                }
                customTwoPicker2.setSelected(MediaBrowserCompat$ItemReceiver2, "YEAR");
            }
        } else {
            String[] strArr = this.read.write;
            onGetStartedClick.write((Object) strArr, "$this$lastIndex");
            int length = strArr.length - 1;
            CustomTwoPicker customTwoPicker3 = this.twoPickerView;
            if (customTwoPicker3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
            }
            customTwoPicker3.setSelected(length, "YEAR");
            write(true);
        }
        CharSequence charSequence3 = this.MediaBrowserCompat$ItemReceiver;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z = true;
        }
        if (!z) {
            int MediaBrowserCompat$ItemReceiver3 = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver((T[]) this.MediaBrowserCompat$CustomActionResultReceiver.write, this.MediaBrowserCompat$ItemReceiver);
            CustomTwoPicker customTwoPicker4 = this.twoPickerView;
            if (customTwoPicker4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("twoPickerView");
            }
            customTwoPicker4.setSelected(MediaBrowserCompat$ItemReceiver3, "MONTH");
        }
    }
}

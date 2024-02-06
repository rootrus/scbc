package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.kofax.kmc.kut.utilities.Licensing;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.additionaldocument.HmlApiBasedDocumentInstructionsActivity;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.submission.C5634xbe8cfba3;
import com.scb.phone.view.activity.hml.submission.HmlCropDocumentActivity;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionTutorialsActivity;
import com.scb.phone.view.adapter.hml.HmlDocumentListAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.additionaldocument.C5852xbeaee965;
import com.scb.phone.view.fragment.additionaldocument.PictureSelectionBottomEntryFragment;
import com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.eac.EACTags;
import org.jmrtd.lds.ImageInfo;
import p040o.ActivityBuilder_BindDiscoverSearchActivity;
import p040o.CheckEligibilityActivity;
import p040o.CheckSCBSEligibilityActivity;
import p040o.CrashlyticsController;
import p040o.FragmentBuilder_BindBaseGiftTransferInputFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IBoundingRectCalculator;
import p040o.InvestmentFundDetailsActivity;
import p040o.JuristicService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ProcessingParameters_Factory;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.createBinaryImageJson;
import p040o.getCustomerIndividualsTitles;
import p040o.getSharingMomentConfig;
import p040o.getSharingMomentConfig$MediaBrowserCompat$ItemReceiver;
import p040o.md5Hash;
import p040o.md5Hash$AlertController$RecycleListView;
import p040o.md5Hash$AppCompatDelegateImpl$ListMenuDecorView;
import p040o.md5Hash$MediaBrowserCompat$MediaItem;
import p040o.md5Hash$MediaSessionCompat$QueueItem;
import p040o.onGetStartedClick;
import p040o.setChildDrawingOrderCallback;
import p040o.setCompatElevationResource;
import p040o.setRevealInfo;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.writeUInt64NoTag;
import p040o.zzby;
import p040o.zzfe;
import p040o.zzfy;
import p040o.zzvb;
import p040o.zzwd;
import p040o.zzwe;
import p040o.zzwf;

public class HmlDocumentListFragment extends BaseTakePhotoFragment implements ProcessingParameters_Factory, C5852xbeaee965 {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private IBoundingRectCalculator MediaBrowserCompat$MediaItem;
    private HmlDocumentListAdapter MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private IconCompatParcelizer f3084x50fd9e4a;
    private PictureSelectionBottomEntryFragment MediaDescriptionCompat;
    private final HmlVerifyEmailActivity MediaSessionCompat$Token;
    private final HmlVerifyEmailActivity ParcelableVolumeInfo;
    private zzwf RatingCompat = zzwf.KOFAX;
    @BindView
    public Button documentListAddButton;
    @BindView
    public TextView documentListMaxReachedTextView;
    @BindView
    public RecyclerView documentListRecyclerView;
    @BindView
    public TextView documentListResubmitReasonTextView;
    @BindView
    public LinearLayout documentsEmptyListLinearLayout;
    @BindView
    public LinearLayout documentsResubmitReasonLinearLayout;
    @HmlPinActivity
    public md5Hash presenter;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$ItemReceiver(boolean z);
    }

    static final class MediaMetadataCompat implements DialogInterface.OnClickListener {
        public static final MediaMetadataCompat MediaBrowserCompat$ItemReceiver = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        RatingCompat(HmlDocumentListFragment hmlDocumentListFragment) {
            super(1, hmlDocumentListFragment);
        }

        public final String getName() {
            return "showDeleteDialog";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(HmlDocumentListFragment.class);
        }

        public final String getSignature() {
            return "showDeleteDialog(Ljava/lang/String;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "p1");
            HmlDocumentListFragment hmlDocumentListFragment = (HmlDocumentListFragment) this.receiver;
            onGetStartedClick.write((Object) str, "documentId");
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(hmlDocumentListFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.hml_document_list_delete_photo_title).IconCompatParcelizer((int) R.string.hml_document_list_delete_photo_subtitle);
            CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.document_upload_delete_dialog_cancel), MediaMetadataCompat.MediaBrowserCompat$ItemReceiver);
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.document_upload_delete_dialog_accept), new MediaDescriptionCompat(hmlDocumentListFragment, str)).show();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public HmlDocumentListFragment() {
        FundActionsSuccessActivity write2 = new write(this);
        onGetStartedClick.write((Object) write2, "initializer");
        this.MediaSessionCompat$Token = new HmlVerifyPhoneTermsConditionsActivity(write2);
        FundActionsSuccessActivity hmlDocumentListFragment$MediaBrowserCompat$ItemReceiver = new HmlDocumentListFragment$MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.write((Object) hmlDocumentListFragment$MediaBrowserCompat$ItemReceiver, "initializer");
        this.ParcelableVolumeInfo = new HmlVerifyPhoneTermsConditionsActivity(hmlDocumentListFragment$MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(zzwd zzwd, String str) {
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        onGetStartedClick.write((Object) str, "docCode");
        Context context = getContext();
        if (context != null) {
            HmlApiBasedDocumentInstructionsActivity.IconCompatParcelizer iconCompatParcelizer = HmlApiBasedDocumentInstructionsActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            Intent write2 = HmlApiBasedDocumentInstructionsActivity.IconCompatParcelizer.write(context, true, zzwd, str);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    write2 = setTapText.write(activity, write2).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(write2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivityForResult(write2, 321);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87822131494009, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        md5Hash md5hash = this.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        md5hash.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_RELOAD_DOCUMENT_LIST")).subscribe(new C5983x1065c8dd(this), HmlDocumentListFragment$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        md5Hash md5hash = this.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setRevealInfo setrevealinfo = md5hash.MediaBrowserCompat$SearchResultReceiver;
        zzby.zza.read read2 = zzby.zza.read.NO_REUPLOADED;
        onGetStartedClick.write((Object) read2, "status");
        setrevealinfo.MediaBrowserCompat$CustomActionResultReceiver.write(read2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Set<? extends createBinaryImageJson> set) {
        onGetStartedClick.write((Object) set, "uploadMethods");
        PictureSelectionBottomEntryFragment MediaBrowserCompat$CustomActionResultReceiver = PictureSelectionBottomEntryFragment.MediaBrowserCompat$CustomActionResultReceiver(set);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "PictureSelectionBottomEn…ewInstance(uploadMethods)");
        this.MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(zzfy.zzd zzd, zzfe.zzc zzc) {
        onGetStartedClick.write((Object) zzd, "submitted");
        if (zzc != null) {
            ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb"), new ZSYR2K("feature", "your_loan"), new ZSYR2K("document_type", zzc.name()), new ZSYR2K("document_status", zzd.name())};
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write("document_list", zsyr2kArr);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        zzwe.read read2;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver();
        if (fileNameContainsFilter != null && (read2 = (zzwe.read) this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver()) != null) {
            md5Hash md5hash = this.presenter;
            if (md5hash == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) fileNameContainsFilter, "hmlSelectedSubmissionDocument");
            onGetStartedClick.write((Object) read2, "fileUploadValidationLimit");
            md5hash.MediaDescriptionCompat = fileNameContainsFilter;
            md5hash.MediaBrowserCompat$ItemReceiver = read2;
            writeUInt64NoTag.IconCompatParcelizer setshortcut = new md5Hash.setShortcut(fileNameContainsFilter);
            if (md5hash.RatingCompat != null) {
                setshortcut.IconCompatParcelizer(md5hash.RatingCompat);
            }
            md5hash.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void IconCompatParcelizer(String str) {
        Button button = this.documentListAddButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListAddButton");
        }
        button.setText(getString(R.string.hml_document_list_add_button, str));
    }

    public final void read(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = new HmlDocumentListAdapter(new RatingCompat(this), z);
        RecyclerView recyclerView = this.documentListRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListRecyclerView");
        }
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = this.documentListRecyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListRecyclerView");
        }
        HmlDocumentListAdapter hmlDocumentListAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (hmlDocumentListAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        recyclerView2.setAdapter(hmlDocumentListAdapter);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [o.convertIntToHexChar] */
    /* JADX WARNING: Multi-variable type inference failed */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAddNewButtonClicked() {
        /*
            r3 = this;
            o.md5Hash r0 = r3.presenter
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            boolean r1 = r0.ParcelableVolumeInfo
            if (r1 == 0) goto L_0x0029
            o.md5Hash$read r1 = p040o.md5Hash.read.write
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
            if (r1 == 0) goto L_0x0019
            o.convertIntToHexChar r2 = new o.convertIntToHexChar
            r2.<init>(r1)
            r1 = r2
        L_0x0019:
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0021
            r2 = 1
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 == 0) goto L_0x0029
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlDocumentListFragment.onAddNewButtonClicked():void");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo37625x50fd9e4a() {
        getChildFragmentManager().IconCompatParcelizer();
        PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment = this.MediaDescriptionCompat;
        if (pictureSelectionBottomEntryFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
        }
        if (!pictureSelectionBottomEntryFragment.isAdded()) {
            PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment2 = this.MediaDescriptionCompat;
            if (pictureSelectionBottomEntryFragment2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
            }
            setTitleMarginStart childFragmentManager = getChildFragmentManager();
            PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment3 = this.MediaDescriptionCompat;
            if (pictureSelectionBottomEntryFragment3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
            }
            pictureSelectionBottomEntryFragment2.show(childFragmentManager, pictureSelectionBottomEntryFragment3.getTag());
        }
    }

    public final void MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, "reason");
        LinearLayout linearLayout = this.documentsResubmitReasonLinearLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentsResubmitReasonLinearLayout");
        }
        boolean z = false;
        linearLayout.setVisibility(0);
        CharSequence charSequence = str;
        if (charSequence.length() > 0) {
            z = true;
        }
        if (z) {
            TextView textView = this.documentListResubmitReasonTextView;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListResubmitReasonTextView");
            }
            textView.setText(charSequence);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        LinearLayout linearLayout = this.documentsEmptyListLinearLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentsEmptyListLinearLayout");
        }
        HmlDocumentListAdapter hmlDocumentListAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (hmlDocumentListAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        linearLayout.setVisibility(hmlDocumentListAdapter.write.isEmpty() ? 0 : 8);
    }

    public void onDestroyView() {
        md5Hash md5hash = this.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        md5hash.onDestroy();
        this.MediaBrowserCompat$MediaItem = null;
        super.onDestroyView();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttach(android.content.Context r4) {
        /*
            r3 = this;
            super.onAttach(r4)
            boolean r0 = r4 instanceof p040o.IBoundingRectCalculator
            if (r0 == 0) goto L_0x000c
            r0 = r4
            o.IBoundingRectCalculator r0 = (p040o.IBoundingRectCalculator) r0
            r3.MediaBrowserCompat$MediaItem = r0
        L_0x000c:
            androidx.fragment.app.Fragment r0 = r3.getParentFragment()
            r1 = 1
            if (r4 == 0) goto L_0x0016
            boolean r2 = r4 instanceof com.scb.phone.view.fragment.hml.HmlDocumentListFragment.IconCompatParcelizer
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            if (r2 != 0) goto L_0x0022
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0 instanceof com.scb.phone.view.fragment.hml.HmlDocumentListFragment.IconCompatParcelizer
        L_0x001d:
            if (r1 == 0) goto L_0x0021
            r4 = r0
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            com.scb.phone.view.fragment.hml.HmlDocumentListFragment$IconCompatParcelizer r4 = (com.scb.phone.view.fragment.hml.HmlDocumentListFragment.IconCompatParcelizer) r4
            r3.f3084x50fd9e4a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlDocumentListFragment.onAttach(android.content.Context):void");
    }

    public void onDetach() {
        super.onDetach();
        this.MediaBrowserCompat$MediaItem = null;
    }

    public final void setShortcut() {
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter;
        String str;
        IBoundingRectCalculator iBoundingRectCalculator;
        Context context = getContext();
        if (context != null && (fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver()) != null && (str = fileNameContainsFilter.IconCompatParcelizer) != null && (iBoundingRectCalculator = this.MediaBrowserCompat$MediaItem) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            Intent MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, "", str, iBoundingRectCalculator.MediaBrowserCompat$CustomActionResultReceiver(), iBoundingRectCalculator.write());
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void setItemInvoker() {
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter;
        String str;
        IBoundingRectCalculator iBoundingRectCalculator;
        Context context = getContext();
        if (context != null && (fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver()) != null && (str = fileNameContainsFilter.IconCompatParcelizer) != null && (iBoundingRectCalculator = this.MediaBrowserCompat$MediaItem) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            Intent read2 = read(context, "", str, iBoundingRectCalculator.MediaBrowserCompat$CustomActionResultReceiver(), iBoundingRectCalculator.write());
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read2 = setTapText.write(activity, read2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void setPopupCallback() {
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter;
        String str;
        IBoundingRectCalculator iBoundingRectCalculator;
        Context context = getContext();
        if (context != null && (fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver()) != null && (str = fileNameContainsFilter.IconCompatParcelizer) != null && (iBoundingRectCalculator = this.MediaBrowserCompat$MediaItem) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            Intent MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(context, "", str, iBoundingRectCalculator.MediaBrowserCompat$CustomActionResultReceiver(), iBoundingRectCalculator.write());
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver hmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver = HmlCaptureDocumentActivity.MediaMetadataCompat;
        return HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(context, str, str2, str3, str4);
    }

    public Intent read(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        C5634xbe8cfba3 hmlDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlDocumentSubmissionTutorialsActivity.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        Intent MediaBrowserCompat$ItemReceiver = C5634xbe8cfba3.MediaBrowserCompat$ItemReceiver(context, str, str2, str3, str4);
        MediaBrowserCompat$ItemReceiver.putExtra("STEP_TAG", "KOFAX_INSTRUCTION_STEP");
        return MediaBrowserCompat$ItemReceiver;
    }

    public Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        C5634xbe8cfba3 hmlDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlDocumentSubmissionTutorialsActivity.MediaBrowserCompat$SearchResultReceiver;
        return C5634xbe8cfba3.write(context, str, str2, str3, str4);
    }

    public final void setTitle() {
        String[] strArr = {ImageInfo.JPEG_MIME_TYPE, "image/png", "image/jpg", "image/heic", "image/heif"};
        Intent type = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI).setType("image/*");
        onGetStartedClick.IconCompatParcelizer((Object) type, "Intent(Intent.ACTION_PIC… .setType(IMAGE_TYPE_ALL)");
        type.putExtra("android.intent.extra.MIME_TYPES", strArr);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                type = setTapText.write(activity, type).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(type.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(type, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setIcon() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/pdf");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(intent, EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(zzwf zzwf) {
        onGetStartedClick.write((Object) zzwf, "cameraType");
        if (zzwf == zzwf.KOFAX) {
            ActivityBuilder_BindDiscoverSearchActivity.IconCompatParcelizer(this);
        } else {
            JuristicService.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    public final void read() {
        ActivityBuilder_BindDiscoverSearchActivity.write(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ActivityBuilder_BindDiscoverSearchActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final void IconCompatParcelizer() {
        ActivityBuilder_BindDiscoverSearchActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ActivityBuilder_BindDiscoverSearchActivity.read(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onGetStartedClick.write((Object) strArr, "permissions");
        onGetStartedClick.write((Object) iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ActivityBuilder_BindDiscoverSearchActivity.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [o.zzfe$zzc] */
    /* JADX WARNING: type inference failed for: r1v6, types: [o.zzfe$zzc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            java.lang.String r0 = "path"
            r1 = 0
            r2 = -1
            java.lang.String r3 = "presenter"
            r4 = 0
            r5 = 1
            r6 = 123(0x7b, float:1.72E-43)
            if (r8 != r6) goto L_0x00c8
            if (r9 != r2) goto L_0x00c8
            if (r10 == 0) goto L_0x01b6
            android.net.Uri r8 = r10.getData()
            if (r8 == 0) goto L_0x01b6
            android.content.Context r9 = r7.getContext()
            java.lang.String r8 = p040o.FragmentBuilder_BindDepositSelectorFragment.read((android.content.Context) r9, (android.net.Uri) r8)
            if (r8 == 0) goto L_0x01b6
            o.zzwf r9 = r7.RatingCompat
            o.zzwf r10 = p040o.zzwf.KOFAX
            if (r9 != r10) goto L_0x009c
            o.md5Hash r9 = r7.presenter
            if (r9 != 0) goto L_0x0030
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0030:
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            java.lang.String r10 = "jpeg"
            java.lang.String r0 = "jpg"
            java.lang.String r1 = "png"
            java.lang.String r2 = "HEIC"
            java.lang.String[] r10 = new java.lang.String[]{r10, r0, r1, r2}
            java.lang.String r0 = "elements"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.util.Set r10 = p040o.HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(r10)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0058
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0058
            goto L_0x0074
        L_0x0058:
            java.util.Iterator r10 = r10.iterator()
        L_0x005c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = p040o.md5Hash.IconCompatParcelizer((java.lang.String) r8)
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r1, r5)
            if (r0 == 0) goto L_0x005c
            r10 = r5
            goto L_0x0075
        L_0x0074:
            r10 = r4
        L_0x0075:
            if (r10 == 0) goto L_0x008b
            o.md5Hash$MediaSessionCompat$Token r10 = new o.md5Hash$MediaSessionCompat$Token
            r10.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r10 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r10
            T r8 = r9.RatingCompat
            if (r8 == 0) goto L_0x0083
            r4 = r5
        L_0x0083:
            if (r4 == 0) goto L_0x008a
            T r8 = r9.RatingCompat
            r10.IconCompatParcelizer(r8)
        L_0x008a:
            return
        L_0x008b:
            o.md5Hash$MediaSessionCompat$ResultReceiverWrapper r8 = p040o.md5Hash$MediaSessionCompat$ResultReceiverWrapper.write
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r10 = r9.RatingCompat
            if (r10 == 0) goto L_0x0094
            r4 = r5
        L_0x0094:
            if (r4 == 0) goto L_0x009b
            T r9 = r9.RatingCompat
            r8.IconCompatParcelizer(r9)
        L_0x009b:
            return
        L_0x009c:
            o.md5Hash r9 = r7.presenter
            if (r9 != 0) goto L_0x00a3
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x00a3:
            android.content.Context r10 = r7.getContext()
            o.HmlVerifyEmailActivity r0 = r7.MediaSessionCompat$Token
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.CrashlyticsController$FileNameContainsFilter r0 = (p040o.CrashlyticsController.FileNameContainsFilter) r0
            if (r0 == 0) goto L_0x00b3
            o.zzfe$zzc r1 = r0.MediaBrowserCompat$ItemReceiver
        L_0x00b3:
            o.zzfe$zzc r0 = p040o.zzfe.zzc.BUSINESS_STORE_2
            if (r1 == r0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r4 = r5
        L_0x00b9:
            o.BScanCNotificationDeepLinkActivity r8 = p040o.FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((android.content.Context) r10, (java.lang.String) r8, (boolean) r4)
            java.lang.String r10 = "ImageUtilities.processIm…                        )"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r8, (java.lang.String) r10)
            o.zzwd r10 = p040o.zzwd.GALLERY
            r9.write((p040o.BScanCNotificationDeepLinkActivity<p040o.zzvb>) r8, (p040o.zzwd) r10)
            return
        L_0x00c8:
            r6 = 321(0x141, float:4.5E-43)
            if (r8 != r6) goto L_0x0134
            if (r9 != r2) goto L_0x0134
            if (r10 == 0) goto L_0x01b6
            o.md5Hash r8 = r7.presenter
            if (r8 != 0) goto L_0x00d7
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x00d7:
            java.lang.String r9 = "UPLOAD_METHOD"
            java.io.Serializable r9 = r10.getSerializableExtra(r9)
            if (r9 == 0) goto L_0x012c
            o.zzwd r9 = (p040o.zzwd) r9
            java.lang.String r10 = "uploadMethod"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r10)
            int[] r10 = p040o.CryptoService.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r5) goto L_0x0118
            r10 = 2
            if (r9 == r10) goto L_0x0107
            r10 = 3
            if (r9 != r10) goto L_0x012b
            o.md5Hash$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.md5Hash$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r10 = r8.RatingCompat
            if (r10 == 0) goto L_0x00ff
            r4 = r5
        L_0x00ff:
            if (r4 == 0) goto L_0x0106
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
        L_0x0106:
            return
        L_0x0107:
            o.md5Hash$MediaBrowserCompat$ItemReceiver r9 = p040o.md5Hash$MediaBrowserCompat$ItemReceiver.write
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r10 = r8.RatingCompat
            if (r10 == 0) goto L_0x0110
            r4 = r5
        L_0x0110:
            if (r4 == 0) goto L_0x0117
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
        L_0x0117:
            return
        L_0x0118:
            o.md5Hash$write r9 = new o.md5Hash$write
            r9.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r10 = r8.RatingCompat
            if (r10 == 0) goto L_0x0124
            r4 = r5
        L_0x0124:
            if (r4 == 0) goto L_0x012b
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
        L_0x012b:
            return
        L_0x012c:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.UploadMethod"
            r8.<init>(r9)
            throw r8
        L_0x0134:
            r6 = 124(0x7c, float:1.74E-43)
            if (r8 != r6) goto L_0x017f
            if (r9 != r2) goto L_0x017f
            o.md5Hash r8 = r7.presenter
            if (r8 != 0) goto L_0x0141
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0141:
            if (r10 == 0) goto L_0x0147
            android.net.Uri r1 = r10.getData()
        L_0x0147:
            java.lang.String r9 = r7.MediaBrowserCompat$CustomActionResultReceiver((android.net.Uri) r1)
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            java.lang.String r10 = p040o.md5Hash.IconCompatParcelizer((java.lang.String) r9)
            java.lang.String r0 = "pdf"
            boolean r10 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r10, r5)
            if (r10 == 0) goto L_0x016e
            o.md5Hash$MediaMetadataCompat r10 = new o.md5Hash$MediaMetadataCompat
            r10.<init>(r9)
            o.writeUInt64NoTag$IconCompatParcelizer r10 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r10
            T r9 = r8.RatingCompat
            if (r9 == 0) goto L_0x0166
            r4 = r5
        L_0x0166:
            if (r4 == 0) goto L_0x016d
            T r8 = r8.RatingCompat
            r10.IconCompatParcelizer(r8)
        L_0x016d:
            return
        L_0x016e:
            o.md5Hash$MediaBrowserCompat$SearchResultReceiver r9 = p040o.md5Hash$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r10 = r8.RatingCompat
            if (r10 == 0) goto L_0x0177
            r4 = r5
        L_0x0177:
            if (r4 == 0) goto L_0x017e
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
        L_0x017e:
            return
        L_0x017f:
            r10 = 10003(0x2713, float:1.4017E-41)
            if (r8 != r10) goto L_0x01b6
            if (r9 != r2) goto L_0x01b6
            o.md5Hash r8 = r7.presenter
            if (r8 != 0) goto L_0x018c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x018c:
            android.content.Context r9 = r7.getContext()
            java.lang.String r10 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.HmlVerifyEmailActivity r0 = r7.MediaSessionCompat$Token
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.CrashlyticsController$FileNameContainsFilter r0 = (p040o.CrashlyticsController.FileNameContainsFilter) r0
            if (r0 == 0) goto L_0x019e
            o.zzfe$zzc r1 = r0.MediaBrowserCompat$ItemReceiver
        L_0x019e:
            o.zzfe$zzc r0 = p040o.zzfe.zzc.BUSINESS_STORE_2
            if (r1 != r0) goto L_0x01a3
            r4 = r5
        L_0x01a3:
            o.BScanCNotificationDeepLinkActivity r9 = p040o.FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((android.content.Context) r9, (java.lang.String) r10, (boolean) r4)
            java.lang.String r10 = "ImageUtilities.processIm…istType.BUSINESS_STORE_2)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r10)
            java.lang.String r10 = "emitter"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r10)
            o.zzwd r10 = p040o.zzwd.CAMERA
            r8.write((p040o.BScanCNotificationDeepLinkActivity<p040o.zzvb>) r9, (p040o.zzwd) r10)
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlDocumentListFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0097, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = r0.getContentResolver();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String MediaBrowserCompat$CustomActionResultReceiver(android.net.Uri r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x009e
            android.content.Context r0 = r9.getContext()     // Catch:{ FileNotFoundException -> 0x0098 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0098 }
            if (r0 == 0) goto L_0x0014
            java.io.InputStream r0 = r0.openInputStream(r10)     // Catch:{ FileNotFoundException -> 0x0098 }
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            java.lang.String r2 = "_display_name"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch:{ FileNotFoundException -> 0x0098 }
            android.content.Context r2 = r9.getContext()     // Catch:{ FileNotFoundException -> 0x0098 }
            if (r2 == 0) goto L_0x0030
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0098 }
            if (r3 == 0) goto L_0x0030
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ FileNotFoundException -> 0x0098 }
            goto L_0x0031
        L_0x0030:
            r10 = r1
        L_0x0031:
            if (r10 == 0) goto L_0x0044
            int r2 = r10.getCount()     // Catch:{ FileNotFoundException -> 0x0098 }
            if (r2 == 0) goto L_0x0044
            r10.moveToFirst()     // Catch:{ FileNotFoundException -> 0x0098 }
            r2 = 0
            java.lang.String r2 = r10.getString(r2)     // Catch:{ FileNotFoundException -> 0x0098 }
            if (r2 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            java.lang.String r2 = "temp.pdf"
        L_0x0046:
            if (r10 == 0) goto L_0x004b
            r10.close()     // Catch:{ FileNotFoundException -> 0x0098 }
        L_0x004b:
            java.lang.String r10 = "java.io.tmpdir"
            java.lang.String r10 = java.lang.System.getProperty(r10)     // Catch:{ FileNotFoundException -> 0x0098 }
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0098 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0098 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0098 }
            r4.append(r10)     // Catch:{ FileNotFoundException -> 0x0098 }
            r10 = 47
            r4.append(r10)     // Catch:{ FileNotFoundException -> 0x0098 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0098 }
            java.lang.String r10 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0098 }
            r3.<init>(r10)     // Catch:{ FileNotFoundException -> 0x0098 }
            r10 = r0
            java.io.Closeable r10 = (java.io.Closeable) r10     // Catch:{ FileNotFoundException -> 0x0098 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            r2.<init>(r3)     // Catch:{ all -> 0x0091 }
            r4 = r2
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ all -> 0x0091 }
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ all -> 0x008a }
            com.google.android.gms.common.util.IOUtils.copyStream(r0, r2)     // Catch:{ all -> 0x008a }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0091 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r10, (java.lang.Throwable) r1)     // Catch:{ FileNotFoundException -> 0x0098 }
            java.lang.String r10 = r3.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0098 }
            java.lang.String r0 = "file.absolutePath"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r10, (java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x0098 }
            goto L_0x00a0
        L_0x008a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0091 }
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r1 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r10, (java.lang.Throwable) r0)     // Catch:{ FileNotFoundException -> 0x0098 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0098 }
        L_0x0098:
            r10 = move-exception
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            p040o.onCheckBoxClick.IconCompatParcelizer(r10)
        L_0x009e:
            java.lang.String r10 = ""
        L_0x00a0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlDocumentListFragment.MediaBrowserCompat$CustomActionResultReceiver(android.net.Uri):java.lang.String");
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "path");
        md5Hash md5hash = this.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(str);
        onGetStartedClick.write((Object) str, "path");
        writeUInt64NoTag.IconCompatParcelizer setcontentview = new md5Hash.setContentView(MediaBrowserCompat$ItemReceiver, str);
        if (md5hash.RatingCompat != null) {
            setcontentview.IconCompatParcelizer(md5hash.RatingCompat);
        }
    }

    public final void MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, "path");
        getSharingMomentConfig$MediaBrowserCompat$ItemReceiver getsharingmomentconfig_mediabrowsercompat_itemreceiver = getSharingMomentConfig.MediaBrowserCompat$ItemReceiver;
        Context context = getContext();
        String string = getString(R.string.hml_pdf_upload_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_pdf_upload_title)");
        String string2 = getString(R.string.hml_pdf_upload_text);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_pdf_upload_text)");
        String string3 = getString(R.string.hml_pdf_upload_hint);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(R.string.hml_pdf_upload_hint)");
        CustomInputDialog IconCompatParcelizer2 = getSharingMomentConfig$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(context, string, string2, string3);
        String string4 = getString(R.string.hml_pdf_upload_positive_button);
        DialogInterface.OnClickListener hmlDocumentListFragment$MediaSessionCompat$ResultReceiverWrapper = new HmlDocumentListFragment$MediaSessionCompat$ResultReceiverWrapper(this, str, IconCompatParcelizer2);
        if (string4 != null) {
            IconCompatParcelizer2.mPositiveButton.setText(string4);
            IconCompatParcelizer2.mPositiveButton.setOnClickListener(new getCustomerIndividualsTitles(IconCompatParcelizer2, hmlDocumentListFragment$MediaSessionCompat$ResultReceiverWrapper));
        }
        IconCompatParcelizer2.write(getString(R.string.hml_pdf_upload_negative_button), ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver);
        IconCompatParcelizer2.show();
    }

    static final class ParcelableVolumeInfo implements DialogInterface.OnClickListener {
        public static final ParcelableVolumeInfo MediaBrowserCompat$CustomActionResultReceiver = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    static final class Keep implements DialogInterface.OnClickListener {
        private /* synthetic */ HmlDocumentListFragment MediaBrowserCompat$CustomActionResultReceiver;

        Keep(HmlDocumentListFragment hmlDocumentListFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlDocumentListFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            md5Hash md5hash = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (md5hash == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer playbackStateCompat = new md5Hash.PlaybackStateCompat(md5hash);
            if (md5hash.RatingCompat != null) {
                playbackStateCompat.IconCompatParcelizer(md5hash.RatingCompat);
            }
        }
    }

    static final class setHasDecor implements DialogInterface.OnClickListener {
        public static final setHasDecor MediaBrowserCompat$ItemReceiver = new setHasDecor();

        setHasDecor() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.hml_pdf_upload_incorrect_password_title)).IconCompatParcelizer((int) R.string.hml_pdf_upload_incorrect_password_text).IconCompatParcelizer(getString(R.string.hml_pdf_upload_incorrect_password_positive), new Keep(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_pdf_upload_incorrect_password_negative), setHasDecor.MediaBrowserCompat$ItemReceiver).show();
    }

    public final void RatingCompat() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.hml_pdf_upload_password_protected_title)).IconCompatParcelizer((int) R.string.hml_pdf_upload_password_protected_text).IconCompatParcelizer(getString(R.string.hml_pdf_upload_password_protected_positive), new HmlDocumentListFragment$MediaSessionCompat$QueueItem(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_pdf_upload_password_protected_negative), HmlDocumentListFragment$MediaSessionCompat$Token.read).show();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.additional_document_error_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.additional_document_error_text)).IconCompatParcelizer(getString(R.string.additional_document_error_ok), HmlDocumentListFragment$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    public final void AppCompatActivity() {
        String str;
        md5Hash md5hash = this.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean isSdkLicensed = Licensing.isSdkLicensed(Licensing.LicenseType.IMAGE_CAPTURE);
        boolean z = true;
        if (md5hash.read != zzwf.KOFAX || isSdkLicensed) {
            String str2 = null;
            if (md5hash.MediaSessionCompat$QueueItem == 0) {
                CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = md5hash.MediaDescriptionCompat;
                if (fileNameContainsFilter != null) {
                    str = fileNameContainsFilter.IconCompatParcelizer;
                } else {
                    str = null;
                }
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "SALARY")) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = md5Hash.Keep.IconCompatParcelizer;
                    if (md5hash.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer.IconCompatParcelizer(md5hash.RatingCompat);
                    }
                }
            }
            if (md5hash.MediaSessionCompat$QueueItem != 0) {
                CrashlyticsController.FileNameContainsFilter fileNameContainsFilter2 = md5hash.MediaDescriptionCompat;
                if (fileNameContainsFilter2 != null) {
                    str2 = fileNameContainsFilter2.IconCompatParcelizer;
                }
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) "SALARY")) {
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = md5Hash$AppCompatDelegateImpl$ListMenuDecorView.read;
                    if (md5hash.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer2.IconCompatParcelizer(md5hash.RatingCompat);
                    }
                }
            }
            if (md5hash.MediaSessionCompat$QueueItem == 0 && md5hash.MediaMetadataCompat) {
                writeUInt64NoTag.IconCompatParcelizer appCompatDialogFragment = new md5Hash.AppCompatDialogFragment(md5hash);
                if (md5hash.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    appCompatDialogFragment.IconCompatParcelizer(md5hash.RatingCompat);
                }
            } else {
                writeUInt64NoTag.IconCompatParcelizer setbackgroundresource = new md5Hash.setBackgroundResource(md5hash);
                if (md5hash.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setbackgroundresource.IconCompatParcelizer(md5hash.RatingCompat);
                }
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = md5Hash$AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver;
            if (md5hash.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(md5hash.RatingCompat);
            }
        }
        setCompatElevationResource setcompatelevationresource = md5hash.MediaBrowserCompat$MediaItem;
        zzwd zzwd = zzwd.CAMERA;
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        setcompatelevationresource.read.write(zzwd);
        PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment = this.MediaDescriptionCompat;
        if (pictureSelectionBottomEntryFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
        }
        if (pictureSelectionBottomEntryFragment.isAdded()) {
            PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment2 = this.MediaDescriptionCompat;
            if (pictureSelectionBottomEntryFragment2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
            }
            pictureSelectionBottomEntryFragment2.dismiss();
        }
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        md5Hash md5hash = this.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (md5hash.MediaSessionCompat$QueueItem == 0 && md5hash.MediaMetadataCompat) {
            writeUInt64NoTag.IconCompatParcelizer md5hash_mediasessioncompat_queueitem = new md5Hash$MediaSessionCompat$QueueItem(md5hash);
            if (md5hash.RatingCompat == null) {
                z = false;
            }
            if (z) {
                md5hash_mediasessioncompat_queueitem.IconCompatParcelizer(md5hash.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = md5Hash.PlaybackStateCompat.CustomAction.MediaBrowserCompat$CustomActionResultReceiver;
            if (md5hash.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(md5hash.RatingCompat);
            }
        }
        PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment = this.MediaDescriptionCompat;
        if (pictureSelectionBottomEntryFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
        }
        if (pictureSelectionBottomEntryFragment.isAdded()) {
            PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment2 = this.MediaDescriptionCompat;
            if (pictureSelectionBottomEntryFragment2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
            }
            pictureSelectionBottomEntryFragment2.dismiss();
        }
    }

    public final void setContentView() {
        md5Hash md5hash = this.presenter;
        if (md5hash == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (md5hash.MediaSessionCompat$QueueItem == 0 && md5hash.MediaMetadataCompat) {
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new md5Hash.RatingCompat(md5hash);
            if (md5hash.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ratingCompat.IconCompatParcelizer(md5hash.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = md5Hash.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver;
            if (md5hash.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(md5hash.RatingCompat);
            }
        }
        PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment = this.MediaDescriptionCompat;
        if (pictureSelectionBottomEntryFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
        }
        if (pictureSelectionBottomEntryFragment.isAdded()) {
            PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment2 = this.MediaDescriptionCompat;
            if (pictureSelectionBottomEntryFragment2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
            }
            pictureSelectionBottomEntryFragment2.dismiss();
        }
    }

    public final void MediaMetadataCompat() {
        String string = getString(R.string.ok);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.ok)");
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = string;
        access_2300.read = access$2300.write.JUST_DISMISS;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.error_wrong_format_title);
        access_2200.IconCompatParcelizer = getString(R.string.error_wrong_format);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void MediaSessionCompat$QueueItem() {
        String string = getString(R.string.ok);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.ok)");
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = string;
        access_2300.read = access$2300.write.JUST_DISMISS;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.error_wrong_format_title);
        access_2200.IconCompatParcelizer = getString(R.string.error_wrong_format_pdf);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void read(String str) {
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter;
        String str2;
        IBoundingRectCalculator iBoundingRectCalculator;
        onGetStartedClick.write((Object) str, "path");
        Context context = getContext();
        if (context != null && (fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver()) != null && (str2 = fileNameContainsFilter.IconCompatParcelizer) != null && (iBoundingRectCalculator = this.MediaBrowserCompat$MediaItem) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            Intent MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, "", str, str2, iBoundingRectCalculator.MediaBrowserCompat$CustomActionResultReceiver(), iBoundingRectCalculator.write());
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "selectedDocumentCode");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        HmlCropDocumentActivity.write write2 = HmlCropDocumentActivity.MediaBrowserCompat$SearchResultReceiver;
        return HmlCropDocumentActivity.write.write(context, str, str2, str3, str4, str5, true);
    }

    public final void IconCompatParcelizer(List<Futures.ListenableFutureAdapter.C34161.read> list) {
        onGetStartedClick.write((Object) list, "uploads");
        HmlDocumentListAdapter hmlDocumentListAdapter = this.MediaBrowserCompat$SearchResultReceiver;
        if (hmlDocumentListAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        onGetStartedClick.write((Object) list, "list");
        hmlDocumentListAdapter.write.clear();
        hmlDocumentListAdapter.write.addAll(list);
        hmlDocumentListAdapter.IconCompatParcelizer.write();
    }

    static final class MediaDescriptionCompat implements DialogInterface.OnClickListener {
        private /* synthetic */ HmlDocumentListFragment MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String write;

        MediaDescriptionCompat(HmlDocumentListFragment hmlDocumentListFragment, String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlDocumentListFragment;
            this.write = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            md5Hash md5hash = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (md5hash == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str = this.write;
            onGetStartedClick.write((Object) str, "documentId");
            if (md5hash.RatingCompat != null) {
                md5hash.RatingCompat.AlertController$RecycleListView();
            }
            md5hash.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(str);
            md5hash.IconCompatParcelizer.IconCompatParcelizer(new md5Hash$MediaBrowserCompat$MediaItem(md5hash));
        }
    }

    public final void write() {
        Button button = this.documentListAddButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListAddButton");
        }
        button.setVisibility(8);
    }

    public final void MediaDescriptionCompat() {
        Button button = this.documentListAddButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListAddButton");
        }
        button.setEnabled(false);
        TextView textView = this.documentListMaxReachedTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListMaxReachedTextView");
        }
        textView.setText(getString(R.string.hml_document_list_max_reached));
        TextView textView2 = this.documentListMaxReachedTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListMaxReachedTextView");
        }
        textView2.setVisibility(0);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "maxQuantity");
        Button button = this.documentListAddButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListAddButton");
        }
        button.setEnabled(true);
        TextView textView = this.documentListMaxReachedTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListMaxReachedTextView");
        }
        textView.setText(getString(R.string.hml_document_list_max_files, str));
        TextView textView2 = this.documentListMaxReachedTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentListMaxReachedTextView");
        }
        textView2.setVisibility(0);
    }

    public final void MediaSessionCompat$Token() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.error_default_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.custom_empty_description)).IconCompatParcelizer(getString(R.string.additional_document_error_ok), new C5984x1deff5f6(this)).show();
    }

    public final void write(boolean z) {
        IconCompatParcelizer iconCompatParcelizer = this.f3084x50fd9e4a;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(z);
        }
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<CrashlyticsController.FileNameContainsFilter> {
        private /* synthetic */ HmlDocumentListFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(HmlDocumentListFragment hmlDocumentListFragment) {
            super(0);
            this.read = hmlDocumentListFragment;
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.read.getArguments();
            CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = arguments != null ? (CrashlyticsController.FileNameContainsFilter) arguments.getParcelable("HML_DOC_INFO") : null;
            if (!(fileNameContainsFilter instanceof CrashlyticsController.FileNameContainsFilter)) {
                return null;
            }
            return fileNameContainsFilter;
        }
    }

    public static final /* synthetic */ void read(HmlDocumentListFragment hmlDocumentListFragment) {
        if (hmlDocumentListFragment.getActivity() instanceof FragmentBuilder_BindBaseGiftTransferInputFragment) {
            ((FragmentBuilder_BindBaseGiftTransferInputFragment) hmlDocumentListFragment.getActivity()).AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    public final void IconCompatParcelizer(String str, String str2, String str3) {
        String str4;
        IBoundingRectCalculator iBoundingRectCalculator;
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "password");
        onGetStartedClick.write((Object) str3, "documentType");
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = (CrashlyticsController.FileNameContainsFilter) this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver();
        if (fileNameContainsFilter != null && (str4 = fileNameContainsFilter.IconCompatParcelizer) != null && (iBoundingRectCalculator = this.MediaBrowserCompat$MediaItem) != null) {
            md5Hash md5hash = this.presenter;
            if (md5hash == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String MediaBrowserCompat$CustomActionResultReceiver = iBoundingRectCalculator.MediaBrowserCompat$CustomActionResultReceiver();
            String write2 = iBoundingRectCalculator.write();
            onGetStartedClick.write((Object) str, "path");
            onGetStartedClick.write((Object) "documentFile", "key");
            onGetStartedClick.write((Object) str4, "documentType");
            onGetStartedClick.write((Object) "", "applicationId");
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "productType");
            onGetStartedClick.write((Object) write2, "flow");
            onGetStartedClick.write((Object) str2, "password");
            if (md5hash.RatingCompat != null) {
                md5hash.RatingCompat.AlertController$RecycleListView();
            }
            setCompatElevationResource setcompatelevationresource = md5hash.MediaBrowserCompat$MediaItem;
            zzwd zzwd = zzwd.FILE_STORAGE;
            onGetStartedClick.write((Object) zzwd, "uploadMethod");
            setcompatelevationresource.read.write(zzwd);
            md5hash.write.MediaBrowserCompat$CustomActionResultReceiver("documentFile", new zzvb(str, (String) null, (String) null, (String) null), str4, "", MediaBrowserCompat$CustomActionResultReceiver, write2, str2);
            md5hash.write.IconCompatParcelizer(new md5Hash.setIcon(md5hash, str));
        }
    }

    public final void write(zzfe.zze zze) {
        onGetStartedClick.write((Object) zze, "type");
        this.RatingCompat = zze.MediaBrowserCompat$CustomActionResultReceiver;
    }
}

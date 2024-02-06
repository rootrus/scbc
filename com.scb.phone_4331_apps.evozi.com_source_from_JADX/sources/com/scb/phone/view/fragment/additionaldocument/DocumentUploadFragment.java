package com.scb.phone.view.fragment.additionaldocument;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.additionaldocument.C5560x96251bfc;
import com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity;
import com.scb.phone.view.activity.additionaldocument.CropDocumentActivity;
import com.scb.phone.view.activity.additionaldocument.DocumentInstructionsActivity;
import com.scb.phone.view.custom.additionaldocument.C5799xe3757e5f;
import com.scb.phone.view.custom.additionaldocument.DocumentsUploadedSectionCustomView;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.MessageFormat;
import java.util.Set;
import org.bouncycastle.asn1.eac.EACTags;
import org.jmrtd.lds.ImageInfo;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindDealsBuyReviewFragment;
import p040o.FundFactSheetActivity;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.JuristicService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.access$2300;
import p040o.createBinaryImageJson;
import p040o.forEachClear;
import p040o.gePayeeName;
import p040o.getCustomerIndividualsTitles;
import p040o.getEkycOtpCode;
import p040o.getSettings;
import p040o.getSettings$AlertController$RecycleListView;
import p040o.getSettings$AppCompatDelegateImpl$ListMenuDecorView;
import p040o.getSettings$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getSettings$MediaBrowserCompat$SearchResultReceiver;
import p040o.getSharingMomentConfig;
import p040o.getSharingMomentConfig$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setAutoFocusEnabled;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.writeUInt64NoTag;
import p040o.zzvb;
import p040o.zzwd;

public class DocumentUploadFragment extends BaseTakePhotoFragment implements gePayeeName, C5852xbeaee965 {
    IOrientationGuidanceCalculator IconCompatParcelizer;
    private PictureSelectionBottomEntryFragment MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver = true;
    @BindView
    public TextView headerText;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public getSettings presenter;
    @BindView
    public LinearLayout sectionList;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final boolean setHasDecor() {
        return true;
    }

    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ DocumentUploadFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(DocumentUploadFragment documentUploadFragment) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = documentUploadFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer = (Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) obj;
            onGetStartedClick.write((Object) iconCompatParcelizer, "it");
            getSettings getsettings = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (getsettings == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) iconCompatParcelizer, "document");
            getsettings.MediaDescriptionCompat = iconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer getsettings_mediabrowsercompat_customactionresultreceiver = new getSettings$MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer);
            if (getsettings.RatingCompat != null) {
                getsettings_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getsettings.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Futures.ListenableFutureAdapter.C34161.read, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ DocumentUploadFragment write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(DocumentUploadFragment documentUploadFragment) {
            super(1);
            this.write = documentUploadFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Futures.ListenableFutureAdapter.C34161.read read = (Futures.ListenableFutureAdapter.C34161.read) obj;
            onGetStartedClick.write((Object) read, "it");
            getSettings getsettings = this.write.presenter;
            if (getsettings == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) read, "clickedDisplay");
            writeUInt64NoTag.IconCompatParcelizer getsettings_mediabrowsercompat_searchresultreceiver = new getSettings$MediaBrowserCompat$SearchResultReceiver(read);
            if (getsettings.RatingCompat != null) {
                getsettings_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(getsettings.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final String PlaybackStateCompat() {
        String string = getString(R.string.occupation_information_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.occupation_information_title)");
        return string;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86802131493907, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getSettings getsettings = this.presenter;
        if (getsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getsettings.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onResume() {
        super.onResume();
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            MediaMetadataCompat();
            this.MediaBrowserCompat$SearchResultReceiver = false;
        }
    }

    public void onDestroy() {
        getSettings getsettings = this.presenter;
        if (getsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getsettings.onDestroy();
        this.IconCompatParcelizer = null;
        super.onDestroy();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.IconCompatParcelizer = (IOrientationGuidanceCalculator) context;
        }
    }

    public final void MediaMetadataCompat() {
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator != null) {
            getSettings getsettings = this.presenter;
            if (getsettings == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String read2 = iOrientationGuidanceCalculator.read();
            String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
            if (getsettings.RatingCompat != null) {
                getsettings.RatingCompat.AlertController$RecycleListView();
            }
            getsettings.write.MediaBrowserCompat$ItemReceiver(read2, MediaBrowserCompat$SearchResultReceiver2);
            getsettings.write.IconCompatParcelizer(new getSettings.setIcon(getsettings));
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        String str2;
        onGetStartedClick.write((Object) str, "path");
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator != null) {
            getSettings getsettings = this.presenter;
            if (getsettings == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String read2 = iOrientationGuidanceCalculator.read();
            String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
            String write2 = iOrientationGuidanceCalculator.write();
            onGetStartedClick.write((Object) str, "imagePath");
            if (getsettings.RatingCompat != null) {
                getsettings.RatingCompat.AlertController$RecycleListView();
            }
            setAutoFocusEnabled setautofocusenabled = getsettings.read;
            Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer = getsettings.MediaDescriptionCompat;
            if (iconCompatParcelizer != null) {
                str2 = iconCompatParcelizer.read;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            setautofocusenabled.MediaBrowserCompat$CustomActionResultReceiver("documentFile", str, str2, read2, MediaBrowserCompat$SearchResultReceiver2, write2);
            getsettings.read.IconCompatParcelizer(new getSettings.write());
        }
    }

    public final void read(String str, String str2, String str3) {
        String str4;
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "password");
        onGetStartedClick.write((Object) str3, "documentType");
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator != null) {
            getSettings getsettings = this.presenter;
            if (getsettings == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String read2 = iOrientationGuidanceCalculator.read();
            String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
            String write2 = iOrientationGuidanceCalculator.write();
            onGetStartedClick.write((Object) str, "filePath");
            if (getsettings.RatingCompat != null) {
                getsettings.RatingCompat.AlertController$RecycleListView();
            }
            setAutoFocusEnabled setautofocusenabled = getsettings.read;
            zzvb zzvb = new zzvb(str);
            Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer = getsettings.MediaDescriptionCompat;
            if (iconCompatParcelizer != null) {
                str4 = iconCompatParcelizer.read;
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            setautofocusenabled.MediaBrowserCompat$CustomActionResultReceiver("documentFile", zzvb, str4, read2, MediaBrowserCompat$SearchResultReceiver2, write2, str2);
            getsettings.read.IconCompatParcelizer(new getSettings.write());
        }
    }

    public final void write(Futures.ListenableFutureAdapter.C34161 r18) {
        int i;
        Futures.ListenableFutureAdapter.C34161 r1 = r18;
        onGetStartedClick.write((Object) r1, "uploads");
        TextView textView = this.headerText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerText");
        }
        int i2 = 0;
        textView.setText(MessageFormat.format(getString(R.string.document_upload_required_count), new Object[]{String.valueOf(r1.read)}));
        LinearLayout linearLayout = this.sectionList;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("sectionList");
        }
        linearLayout.removeAllViews();
        Context context = getContext();
        if (context != null) {
            for (Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer : r1.MediaBrowserCompat$CustomActionResultReceiver) {
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                DocumentsUploadedSectionCustomView documentsUploadedSectionCustomView = new DocumentsUploadedSectionCustomView(context);
                int i3 = r1.read;
                String str = r1.MediaBrowserCompat$ItemReceiver;
                FundFactSheetActivity documentUploadFragment$MediaBrowserCompat$MediaItem = new DocumentUploadFragment$MediaBrowserCompat$MediaItem(this);
                FundFactSheetActivity mediaDescriptionCompat = new MediaDescriptionCompat(this);
                FundFactSheetActivity ratingCompat = new RatingCompat(this);
                onGetStartedClick.write((Object) iconCompatParcelizer, "document");
                onGetStartedClick.write((Object) str, "totalMaxQuantity");
                onGetStartedClick.write((Object) documentUploadFragment$MediaBrowserCompat$MediaItem, "onQuestionMarkClicked");
                onGetStartedClick.write((Object) mediaDescriptionCompat, "onAddClicked");
                onGetStartedClick.write((Object) ratingCompat, "onDeleteClicked");
                String str2 = iconCompatParcelizer.IconCompatParcelizer;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(" (");
                sb.append(iconCompatParcelizer.MediaSessionCompat$Token.size());
                sb.append(")");
                String obj = sb.toString();
                TextView textView2 = documentsUploadedSectionCustomView.label;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("label");
                }
                textView2.setText(obj);
                CharSequence charSequence = iconCompatParcelizer.RatingCompat;
                if (((charSequence == null || charSequence.length() == 0) ? 1 : i2) != 0) {
                    TextView textView3 = documentsUploadedSectionCustomView.tvRemark;
                    if (textView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                    }
                    textView3.setVisibility(8);
                } else {
                    TextView textView4 = documentsUploadedSectionCustomView.tvRemark;
                    if (textView4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                    }
                    textView4.setVisibility(i2);
                    TextView textView5 = documentsUploadedSectionCustomView.tvRemark;
                    if (textView5 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemark");
                    }
                    textView5.setText(iconCompatParcelizer.RatingCompat);
                }
                if (!iconCompatParcelizer.write) {
                    ImageView imageView = documentsUploadedSectionCustomView.questionMark;
                    if (imageView == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("questionMark");
                    }
                    imageView.setVisibility(8);
                } else {
                    ImageView imageView2 = documentsUploadedSectionCustomView.questionMark;
                    if (imageView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("questionMark");
                    }
                    imageView2.setOnClickListener(new C5799xe3757e5f(documentUploadFragment$MediaBrowserCompat$MediaItem, iconCompatParcelizer));
                }
                documentsUploadedSectionCustomView.read(iconCompatParcelizer, ratingCompat);
                Button button = documentsUploadedSectionCustomView.addButton;
                if (button == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("addButton");
                }
                button.setEnabled(true);
                if (i3 >= Integer.parseInt(str)) {
                    Button button2 = documentsUploadedSectionCustomView.addButton;
                    if (button2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("addButton");
                    }
                    i = 0;
                    button2.setEnabled(false);
                } else {
                    Integer num = iconCompatParcelizer.MediaMetadataCompat;
                    if (num == null || iconCompatParcelizer.MediaSessionCompat$Token.size() < num.intValue()) {
                        i = 0;
                    } else {
                        Button button3 = documentsUploadedSectionCustomView.addButton;
                        if (button3 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addButton");
                        }
                        i = 0;
                        button3.setEnabled(false);
                    }
                }
                Button button4 = documentsUploadedSectionCustomView.addButton;
                if (button4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("addButton");
                }
                button4.setOnClickListener(new DocumentsUploadedSectionCustomView.IconCompatParcelizer(mediaDescriptionCompat, iconCompatParcelizer));
                LinearLayout linearLayout2 = this.sectionList;
                if (linearLayout2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("sectionList");
                }
                linearLayout2.addView(documentsUploadedSectionCustomView);
                i2 = i;
            }
        }
        IconCompatParcelizer(r18);
        Button button5 = this.nextButton;
        if (button5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button5.setOnClickListener(new DocumentUploadFragment$MediaSessionCompat$ResultReceiverWrapper(this, r1));
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "documentId");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.document_upload_delete_dialog_title).IconCompatParcelizer((int) R.string.document_upload_delete_dialog_text);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.document_upload_delete_dialog_cancel), read.write);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.document_upload_delete_dialog_accept), new IconCompatParcelizer(this, str)).show();
    }

    static final class read implements DialogInterface.OnClickListener {
        public static final read write = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ DocumentUploadFragment MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ String write;

        IconCompatParcelizer(DocumentUploadFragment documentUploadFragment, String str) {
            this.MediaBrowserCompat$ItemReceiver = documentUploadFragment;
            this.write = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (iOrientationGuidanceCalculator != null) {
                getSettings getsettings = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (getsettings == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                String read = iOrientationGuidanceCalculator.read();
                String str = this.write;
                String write2 = iOrientationGuidanceCalculator.write();
                onGetStartedClick.write((Object) str, "documentId");
                if (getsettings.RatingCompat != null) {
                    getsettings.RatingCompat.AlertController$RecycleListView();
                }
                getsettings.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(read, str, write2);
                getsettings.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getSettings$AlertController$RecycleListView(getsettings, str));
            }
            dialogInterface.dismiss();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Set<? extends createBinaryImageJson> set) {
        onGetStartedClick.write((Object) set, "uploadMethods");
        getChildFragmentManager().IconCompatParcelizer();
        PictureSelectionBottomEntryFragment MediaBrowserCompat$CustomActionResultReceiver = PictureSelectionBottomEntryFragment.MediaBrowserCompat$CustomActionResultReceiver(set);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "PictureSelectionBottomEn…ewInstance(uploadMethods)");
        this.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver;
        setTitleMarginStart childFragmentManager = getChildFragmentManager();
        PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment = this.MediaBrowserCompat$MediaItem;
        if (pictureSelectionBottomEntryFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomSheetFragment");
        }
        MediaBrowserCompat$CustomActionResultReceiver.show(childFragmentManager, pictureSelectionBottomEntryFragment.getTag());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, zzwd zzwd) {
        Intent intent;
        onGetStartedClick.write((Object) str, "documentCode");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        Context context = getContext();
        if (context != null) {
            String upperCase = str.toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            String upperCase2 = "CID".toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase2, "(this as java.lang.String).toUpperCase()");
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase2)) {
                onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                intent = MediaBrowserCompat$ItemReceiver(context, true, zzwd);
            } else {
                String upperCase3 = "SALARY".toUpperCase();
                onGetStartedClick.IconCompatParcelizer((Object) upperCase3, "(this as java.lang.String).toUpperCase()");
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase3)) {
                    onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                    intent = MediaBrowserCompat$CustomActionResultReceiver(context, true, zzwd);
                } else {
                    String upperCase4 = "STATEMENT".toUpperCase();
                    onGetStartedClick.IconCompatParcelizer((Object) upperCase4, "(this as java.lang.String).toUpperCase()");
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase4)) {
                        onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                        intent = write(context, true, zzwd);
                    } else {
                        String upperCase5 = "CAR".toUpperCase();
                        onGetStartedClick.IconCompatParcelizer((Object) upperCase5, "(this as java.lang.String).toUpperCase()");
                        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase5)) {
                            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                            intent = IconCompatParcelizer(context, true, zzwd);
                        } else {
                            return;
                        }
                    }
                }
            }
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
                startActivityForResult(intent, 321);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(String str, zzwd zzwd) {
        Intent intent;
        onGetStartedClick.write((Object) str, "documentCode");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        Context context = getContext();
        if (context != null) {
            String upperCase = str.toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            String upperCase2 = "CID".toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase2, "(this as java.lang.String).toUpperCase()");
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase2)) {
                onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                intent = MediaBrowserCompat$ItemReceiver(context, false, zzwd);
            } else {
                String upperCase3 = "SALARY".toUpperCase();
                onGetStartedClick.IconCompatParcelizer((Object) upperCase3, "(this as java.lang.String).toUpperCase()");
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase3)) {
                    onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                    intent = MediaBrowserCompat$CustomActionResultReceiver(context, false, zzwd);
                } else {
                    String upperCase4 = "STATEMENT".toUpperCase();
                    onGetStartedClick.IconCompatParcelizer((Object) upperCase4, "(this as java.lang.String).toUpperCase()");
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase4)) {
                        onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                        intent = write(context, false, zzwd);
                    } else {
                        String upperCase5 = "CAR".toUpperCase();
                        onGetStartedClick.IconCompatParcelizer((Object) upperCase5, "(this as java.lang.String).toUpperCase()");
                        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) upperCase, (Object) upperCase5)) {
                            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
                            intent = IconCompatParcelizer(context, false, zzwd);
                        } else {
                            return;
                        }
                    }
                }
            }
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public Intent MediaBrowserCompat$ItemReceiver(Context context, boolean z, zzwd zzwd) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        C5560x96251bfc documentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver = DocumentInstructionsActivity.MediaMetadataCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        return C5560x96251bfc.write(context, z, FragmentBuilder_BindDealsBuyReviewFragment.CID.name(), zzwd);
    }

    public Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, boolean z, zzwd zzwd) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        C5560x96251bfc documentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver = DocumentInstructionsActivity.MediaMetadataCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        return C5560x96251bfc.write(context, z, FragmentBuilder_BindDealsBuyReviewFragment.PAYSLIP.name(), zzwd);
    }

    public Intent write(Context context, boolean z, zzwd zzwd) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        C5560x96251bfc documentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver = DocumentInstructionsActivity.MediaMetadataCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        return C5560x96251bfc.write(context, z, FragmentBuilder_BindDealsBuyReviewFragment.BANK.name(), zzwd);
    }

    private static Intent IconCompatParcelizer(Context context, boolean z, zzwd zzwd) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        C5560x96251bfc documentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver = DocumentInstructionsActivity.MediaMetadataCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        return C5560x96251bfc.write(context, z, FragmentBuilder_BindDealsBuyReviewFragment.CAR.name(), zzwd);
    }

    public final void MediaSessionCompat$QueueItem() {
        String str;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator;
        Context context = getContext();
        getSettings getsettings = this.presenter;
        if (getsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer = getsettings.MediaDescriptionCompat;
        if (iconCompatParcelizer != null) {
            str = iconCompatParcelizer.read;
        } else {
            str = null;
        }
        String str2 = str;
        if (context != null && str2 != null && (iOrientationGuidanceCalculator = this.IconCompatParcelizer) != null) {
            String read2 = iOrientationGuidanceCalculator.read();
            if (read2 == null) {
                read2 = "";
            }
            String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$SearchResultReceiver2, "it.productType");
            String write2 = iOrientationGuidanceCalculator.write();
            onGetStartedClick.IconCompatParcelizer((Object) write2, "it.flowType");
            Intent MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(context, read2, str2, MediaBrowserCompat$SearchResultReceiver2, write2);
            this.MediaBrowserCompat$SearchResultReceiver = true;
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo35905x50fd9e4a() {
        String[] strArr = {ImageInfo.JPEG_MIME_TYPE, "image/png", "image/jpg"};
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

    public final void MediaSessionCompat$Token() {
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

    public final void IconCompatParcelizer() {
        getEkycOtpCode.read(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        getEkycOtpCode.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        getEkycOtpCode.write(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onGetStartedClick.write((Object) strArr, "permissions");
        onGetStartedClick.write((Object) iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        getEkycOtpCode.IconCompatParcelizer(this, i, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x017e, code lost:
        r1 = r1.MediaBrowserCompat$SearchResultReceiver;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            java.lang.String r0 = "path"
            java.lang.String r1 = "ImageUtilities.processImage(context, imagePath)"
            r2 = -1
            java.lang.String r3 = "presenter"
            r4 = 0
            r5 = 1
            r6 = 123(0x7b, float:1.72E-43)
            if (r8 != r6) goto L_0x00c5
            if (r9 != r2) goto L_0x00c5
            if (r10 == 0) goto L_0x01be
            android.net.Uri r8 = r10.getData()
            if (r8 == 0) goto L_0x01be
            android.content.Context r9 = r7.getContext()
            java.lang.String r8 = p040o.FragmentBuilder_BindDepositSelectorFragment.read((android.content.Context) r9, (android.net.Uri) r8)
            if (r8 == 0) goto L_0x01be
            o.getSettings r9 = r7.presenter
            if (r9 != 0) goto L_0x002b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x002b:
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r9 = r9.MediaDescriptionCompat
            if (r9 == 0) goto L_0x0033
            o.Futures$ListenableFutureAdapter$1$MediaBrowserCompat$ItemReceiver r9 = r9.MediaBrowserCompat$ItemReceiver
            if (r9 != 0) goto L_0x0035
        L_0x0033:
            o.Futures$ListenableFutureAdapter$1$MediaBrowserCompat$ItemReceiver r9 = p040o.C3417xd12d9900.KOFAX
        L_0x0035:
            o.Futures$ListenableFutureAdapter$1$MediaBrowserCompat$ItemReceiver r10 = p040o.C3417xd12d9900.KOFAX
            if (r9 != r10) goto L_0x003b
            r9 = r5
            goto L_0x003c
        L_0x003b:
            r9 = r4
        L_0x003c:
            if (r9 == 0) goto L_0x00af
            o.getSettings r9 = r7.presenter
            if (r9 != 0) goto L_0x0045
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0045:
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            java.lang.String r10 = "jpeg"
            java.lang.String r0 = "jpg"
            java.lang.String r1 = "png"
            java.lang.String[] r10 = new java.lang.String[]{r10, r0, r1}
            java.lang.String r0 = "elements"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            java.util.Set r10 = p040o.HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(r10)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x006b
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x006b
            goto L_0x0087
        L_0x006b:
            java.util.Iterator r10 = r10.iterator()
        L_0x006f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = p040o.getSettings.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r8)
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r0, r1, r5)
            if (r0 == 0) goto L_0x006f
            r10 = r5
            goto L_0x0088
        L_0x0087:
            r10 = r4
        L_0x0088:
            if (r10 == 0) goto L_0x009e
            o.getSettings$MediaSessionCompat$QueueItem r10 = new o.getSettings$MediaSessionCompat$QueueItem
            r10.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r10 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r10
            T r8 = r9.RatingCompat
            if (r8 == 0) goto L_0x0096
            r4 = r5
        L_0x0096:
            if (r4 == 0) goto L_0x009d
            T r8 = r9.RatingCompat
            r10.IconCompatParcelizer(r8)
        L_0x009d:
            return
        L_0x009e:
            o.getSettings$ParcelableVolumeInfo r8 = p040o.getSettings.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r10 = r9.RatingCompat
            if (r10 == 0) goto L_0x00a7
            r4 = r5
        L_0x00a7:
            if (r4 == 0) goto L_0x00ae
            T r9 = r9.RatingCompat
            r8.IconCompatParcelizer(r9)
        L_0x00ae:
            return
        L_0x00af:
            o.getSettings r9 = r7.presenter
            if (r9 != 0) goto L_0x00b6
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x00b6:
            android.content.Context r10 = r7.getContext()
            o.BScanCNotificationDeepLinkActivity r8 = p040o.FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer((android.content.Context) r10, (java.lang.String) r8)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r8, (java.lang.String) r1)
            r9.write((p040o.BScanCNotificationDeepLinkActivity<p040o.zzvb>) r8)
            return
        L_0x00c5:
            r6 = 321(0x141, float:4.5E-43)
            if (r8 != r6) goto L_0x0121
            if (r9 != r2) goto L_0x0121
            if (r10 == 0) goto L_0x01be
            o.getSettings r8 = r7.presenter
            if (r8 != 0) goto L_0x00d4
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x00d4:
            java.lang.String r9 = "UPLOAD_METHOD"
            java.io.Serializable r9 = r10.getSerializableExtra(r9)
            if (r9 == 0) goto L_0x0119
            o.zzwd r9 = (p040o.zzwd) r9
            java.lang.String r10 = "uploadMethod"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r10)
            int[] r10 = p040o.buildInstanceIdentifierChanged.MediaBrowserCompat$CustomActionResultReceiver
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r5) goto L_0x0115
            r10 = 2
            if (r9 == r10) goto L_0x0104
            r10 = 3
            if (r9 != r10) goto L_0x0118
            o.getSettings$setHasDecor r9 = p040o.getSettings.setHasDecor.write
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r10 = r8.RatingCompat
            if (r10 == 0) goto L_0x00fc
            r4 = r5
        L_0x00fc:
            if (r4 == 0) goto L_0x0103
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
        L_0x0103:
            return
        L_0x0104:
            o.getSettings$PlaybackStateCompat$CustomAction r9 = p040o.getSettings.PlaybackStateCompat.CustomAction.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r9 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r9
            T r10 = r8.RatingCompat
            if (r10 == 0) goto L_0x010d
            r4 = r5
        L_0x010d:
            if (r4 == 0) goto L_0x0114
            T r8 = r8.RatingCompat
            r9.IconCompatParcelizer(r8)
        L_0x0114:
            return
        L_0x0115:
            r8.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x0118:
            return
        L_0x0119:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type com.scb.phone.domain.entity.additionaldocument.UploadMethod"
            r8.<init>(r9)
            throw r8
        L_0x0121:
            r6 = 10003(0x2713, float:1.4017E-41)
            if (r8 != r6) goto L_0x0144
            if (r9 != r2) goto L_0x0144
            o.getSettings r8 = r7.presenter
            if (r8 != 0) goto L_0x012e
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x012e:
            android.content.Context r9 = r7.getContext()
            java.lang.String r10 = r7.MediaBrowserCompat$CustomActionResultReceiver
            o.BScanCNotificationDeepLinkActivity r9 = p040o.FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer((android.content.Context) r9, (java.lang.String) r10)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r1)
            java.lang.String r10 = "emitter"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r10)
            r8.write((p040o.BScanCNotificationDeepLinkActivity<p040o.zzvb>) r9)
            return
        L_0x0144:
            r1 = 124(0x7c, float:1.74E-43)
            if (r8 != r1) goto L_0x01be
            if (r9 != r2) goto L_0x01be
            if (r10 == 0) goto L_0x01be
            android.net.Uri r8 = r10.getData()
            if (r8 == 0) goto L_0x01be
            o.FragmentBuilder_BindDepositSelectionFragment$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.FragmentBuilder_BindDepositSelectionFragment.MediaBrowserCompat$CustomActionResultReceiver
            android.content.Context r9 = r7.getContext()
            java.lang.String r8 = p040o.C6500x370bf97c.MediaBrowserCompat$ItemReceiver(r9, r8)
            if (r8 == 0) goto L_0x01be
            o.getSettings r9 = r7.presenter
            if (r9 != 0) goto L_0x0165
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0165:
            int r10 = p040o.FragmentBuilder_BindDepositSelectorFragment.write((java.lang.String) r8)
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            java.lang.String r0 = p040o.getSettings.MediaBrowserCompat$CustomActionResultReceiver((java.lang.String) r8)
            java.lang.String r1 = "pdf"
            boolean r0 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r1, r0, r5)
            if (r0 == 0) goto L_0x01ae
            r0 = 9437184(0x900000, float:1.3224311E-38)
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r1 = r9.MediaDescriptionCompat
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x018e
            int r1 = java.lang.Integer.parseInt(r1)
            r2 = 1048576(0x100000, float:1.469368E-39)
            int r1 = r1 * r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x018f
        L_0x018e:
            r1 = 0
        L_0x018f:
            if (r1 == 0) goto L_0x0195
            int r0 = r1.intValue()
        L_0x0195:
            if (r10 > r0) goto L_0x0199
            r10 = r5
            goto L_0x019a
        L_0x0199:
            r10 = r4
        L_0x019a:
            o.getSettings$setCheckable r0 = new o.getSettings$setCheckable
            r0.<init>(r10, r8)
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r8 = r9.RatingCompat
            if (r8 == 0) goto L_0x01a6
            r4 = r5
        L_0x01a6:
            if (r4 == 0) goto L_0x01ad
            T r8 = r9.RatingCompat
            r0.IconCompatParcelizer(r8)
        L_0x01ad:
            return
        L_0x01ae:
            o.getSettings$MediaDescriptionCompat r8 = p040o.getSettings.MediaDescriptionCompat.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r10 = r9.RatingCompat
            if (r10 == 0) goto L_0x01b7
            r4 = r5
        L_0x01b7:
            if (r4 == 0) goto L_0x01be
            T r9 = r9.RatingCompat
            r8.IconCompatParcelizer(r9)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX WARNING: type inference failed for: r1v15, types: [o.getAppSettings] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AppCompatActivity() {
        /*
            r8 = this;
            o.getSettings r0 = r8.presenter
            java.lang.String r1 = "presenter"
            if (r0 != 0) goto L_0x0009
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r0 = r0.MediaDescriptionCompat
            r2 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.read
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            if (r0 == 0) goto L_0x00a1
            o.getSettings r3 = r8.presenter
            if (r3 != 0) goto L_0x001b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x001b:
            com.kofax.kmc.kut.utilities.Licensing$LicenseType r1 = com.kofax.kmc.kut.utilities.Licensing.LicenseType.IMAGE_CAPTURE
            boolean r1 = com.kofax.kmc.kut.utilities.Licensing.isSdkLicensed(r1)
            java.lang.String r4 = "documentCode"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0046
            o.getSettings$setChecked r0 = p040o.getSettings.setChecked.IconCompatParcelizer
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0036
            o.getAppSettings r1 = new o.getAppSettings
            r1.<init>(r0)
            r0 = r1
        L_0x0036:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = r5
        L_0x003e:
            if (r4 == 0) goto L_0x0095
            T r1 = r3.RatingCompat
            r0.IconCompatParcelizer(r1)
            goto L_0x0095
        L_0x0046:
            o.Futures$ListenableFutureAdapter$1 r1 = r3.IconCompatParcelizer
            if (r1 != 0) goto L_0x004f
            java.lang.String r6 = "display"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x004f:
            java.util.List<o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer> r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0057:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x006d
            java.lang.Object r6 = r1.next()
            r7 = r6
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r7 = (p040o.Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) r7
            java.lang.String r7 = r7.read
            boolean r7 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 == 0) goto L_0x0057
            r2 = r6
        L_0x006d:
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r2 = (p040o.Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) r2
            if (r2 == 0) goto L_0x0095
            java.util.List<o.Futures$ListenableFutureAdapter$1$read> r1 = r2.MediaSessionCompat$Token
            int r1 = r1.size()
            boolean r1 = p040o.getSettings.read((java.lang.String) r0, (int) r1)
            if (r1 == 0) goto L_0x0092
            o.getSettings$setExpandedFormat r1 = new o.getSettings$setExpandedFormat
            r1.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r0 = r3.RatingCompat
            if (r0 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r4 = r5
        L_0x008a:
            if (r4 == 0) goto L_0x0095
            T r0 = r3.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x0095
        L_0x0092:
            r3.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x0095:
            com.scb.phone.view.fragment.additionaldocument.PictureSelectionBottomEntryFragment r0 = r8.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x009e
            java.lang.String r1 = "bottomSheetFragment"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x009e:
            r0.dismiss()
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment.AppCompatActivity():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX WARNING: type inference failed for: r1v17, types: [o.getAppSettings] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        /*
            r8 = this;
            o.getSettings r0 = r8.presenter
            java.lang.String r1 = "presenter"
            if (r0 != 0) goto L_0x0009
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r0 = r0.MediaDescriptionCompat
            r2 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.read
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            if (r0 == 0) goto L_0x00af
            o.getSettings r3 = r8.presenter
            if (r3 != 0) goto L_0x001b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x001b:
            com.kofax.kmc.kut.utilities.Licensing$LicenseType r1 = com.kofax.kmc.kut.utilities.Licensing.LicenseType.IMAGE_CAPTURE
            boolean r1 = com.kofax.kmc.kut.utilities.Licensing.isSdkLicensed(r1)
            java.lang.String r4 = "documentCode"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x0046
            o.getSettings$Keep r0 = p040o.getSettings.Keep.IconCompatParcelizer
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0036
            o.getAppSettings r1 = new o.getAppSettings
            r1.<init>(r0)
            r0 = r1
        L_0x0036:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = r5
        L_0x003e:
            if (r4 == 0) goto L_0x00a3
            T r1 = r3.RatingCompat
            r0.IconCompatParcelizer(r1)
            goto L_0x00a3
        L_0x0046:
            o.Futures$ListenableFutureAdapter$1 r1 = r3.IconCompatParcelizer
            if (r1 != 0) goto L_0x004f
            java.lang.String r6 = "display"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r6)
        L_0x004f:
            java.util.List<o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer> r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0057:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x006d
            java.lang.Object r6 = r1.next()
            r7 = r6
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r7 = (p040o.Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) r7
            java.lang.String r7 = r7.read
            boolean r7 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r7, (java.lang.Object) r0)
            if (r7 == 0) goto L_0x0057
            r2 = r6
        L_0x006d:
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r2 = (p040o.Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) r2
            if (r2 == 0) goto L_0x00a3
            java.util.List<o.Futures$ListenableFutureAdapter$1$read> r1 = r2.MediaSessionCompat$Token
            int r1 = r1.size()
            boolean r1 = p040o.getSettings.read((java.lang.String) r0, (int) r1)
            if (r1 == 0) goto L_0x0092
            o.getSettings$MediaSessionCompat$ResultReceiverWrapper r1 = new o.getSettings$MediaSessionCompat$ResultReceiverWrapper
            r1.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r0 = r3.RatingCompat
            if (r0 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r4 = r5
        L_0x008a:
            if (r4 == 0) goto L_0x00a3
            T r0 = r3.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x00a3
        L_0x0092:
            o.getSettings$PlaybackStateCompat r0 = p040o.getSettings.PlaybackStateCompat.read
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r4 = r5
        L_0x009c:
            if (r4 == 0) goto L_0x00a3
            T r1 = r3.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x00a3:
            com.scb.phone.view.fragment.additionaldocument.PictureSelectionBottomEntryFragment r0 = r8.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x00ac
            java.lang.String r1 = "bottomSheetFragment"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x00ac:
            r0.dismiss()
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment.AppCompatDelegateImpl$ListMenuDecorView():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setContentView() {
        /*
            r6 = this;
            o.getSettings r0 = r6.presenter
            java.lang.String r1 = "presenter"
            if (r0 != 0) goto L_0x0009
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r0 = r0.MediaDescriptionCompat
            r2 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.read
            goto L_0x0012
        L_0x0011:
            r0 = r2
        L_0x0012:
            if (r0 == 0) goto L_0x008b
            o.getSettings r3 = r6.presenter
            if (r3 != 0) goto L_0x001b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x001b:
            java.lang.String r1 = "documentCode"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            o.Futures$ListenableFutureAdapter$1 r1 = r3.IconCompatParcelizer
            if (r1 != 0) goto L_0x0029
            java.lang.String r4 = "display"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0029:
            java.util.List<o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer> r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0047
            java.lang.Object r4 = r1.next()
            r5 = r4
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r5 = (p040o.Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) r5
            java.lang.String r5 = r5.read
            boolean r5 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 == 0) goto L_0x0031
            r2 = r4
        L_0x0047:
            o.Futures$ListenableFutureAdapter$1$IconCompatParcelizer r2 = (p040o.Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) r2
            if (r2 == 0) goto L_0x007f
            java.util.List<o.Futures$ListenableFutureAdapter$1$read> r1 = r2.MediaSessionCompat$Token
            int r1 = r1.size()
            boolean r1 = p040o.getSettings.read((java.lang.String) r0, (int) r1)
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L_0x006e
            o.getSettings$MediaBrowserCompat$MediaItem r1 = new o.getSettings$MediaBrowserCompat$MediaItem
            r1.<init>(r0)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r0 = r3.RatingCompat
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r2 = r4
        L_0x0066:
            if (r2 == 0) goto L_0x007f
            T r0 = r3.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x007f
        L_0x006e:
            o.getSettings$RatingCompat r0 = p040o.getSettings.RatingCompat.MediaBrowserCompat$ItemReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r1 = r3.RatingCompat
            if (r1 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r2 = r4
        L_0x0078:
            if (r2 == 0) goto L_0x007f
            T r1 = r3.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x007f:
            com.scb.phone.view.fragment.additionaldocument.PictureSelectionBottomEntryFragment r0 = r6.MediaBrowserCompat$MediaItem
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = "bottomSheetFragment"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0088:
            r0.dismiss()
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment.setContentView():void");
    }

    public final void read() {
        if (this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashIssuerLandingFragment());
        }
    }

    public void write() {
        if (this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashContactInformationFragment.write());
        }
    }

    public final void write(String str) {
        String str2;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator;
        String str3;
        onGetStartedClick.write((Object) str, "path");
        Context context = getContext();
        getSettings getsettings = this.presenter;
        if (getsettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer = getsettings.MediaDescriptionCompat;
        if (iconCompatParcelizer != null) {
            str2 = iconCompatParcelizer.read;
        } else {
            str2 = null;
        }
        String str4 = str2;
        if (context != null && str4 != null && (iOrientationGuidanceCalculator = this.IconCompatParcelizer) != null) {
            String read2 = iOrientationGuidanceCalculator.read();
            if (read2 == null) {
                read2 = "";
            }
            String str5 = read2;
            String MediaBrowserCompat$SearchResultReceiver2 = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$SearchResultReceiver2, "it.productType");
            IOrientationGuidanceCalculator iOrientationGuidanceCalculator2 = this.IconCompatParcelizer;
            if (iOrientationGuidanceCalculator2 == null || (str3 = iOrientationGuidanceCalculator2.write()) == null) {
                str3 = setAutoFocusEnabled.IconCompatParcelizer.DEFAULT.name();
            }
            Intent MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(context, str5, str, str4, MediaBrowserCompat$SearchResultReceiver2, str3);
            this.MediaBrowserCompat$SearchResultReceiver = true;
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

    static final class write implements DialogInterface.OnClickListener {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.additional_document_error_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.additional_document_error_text)).IconCompatParcelizer(getString(R.string.additional_document_error_ok), write.MediaBrowserCompat$ItemReceiver).show();
    }

    public final void RatingCompat() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.additional_document_error_title);
        access_2200.IconCompatParcelizer = getString(R.string.invalid_image_processor_license);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2300.read = access$2300.write.JUST_DISMISS;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.error_wrong_format_title);
        access_2200.IconCompatParcelizer = getString(R.string.error_wrong_format_pdf);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2300.read = access$2300.write.JUST_DISMISS;
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.error_wrong_format_title);
        access_2200.IconCompatParcelizer = getString(R.string.error_wrong_format);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void read(String str) {
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
        DialogInterface.OnClickListener mediaMetadataCompat = new MediaMetadataCompat(this, str, IconCompatParcelizer2);
        if (string4 != null) {
            IconCompatParcelizer2.mPositiveButton.setText(string4);
            IconCompatParcelizer2.mPositiveButton.setOnClickListener(new getCustomerIndividualsTitles(IconCompatParcelizer2, mediaMetadataCompat));
        }
        IconCompatParcelizer2.write(getString(R.string.hml_pdf_upload_negative_button), DocumentUploadFragment$MediaBrowserCompat$SearchResultReceiver.read);
        IconCompatParcelizer2.show();
    }

    static final class MediaMetadataCompat implements DialogInterface.OnClickListener {
        private /* synthetic */ CustomInputDialog IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ DocumentUploadFragment write;

        MediaMetadataCompat(DocumentUploadFragment documentUploadFragment, String str, CustomInputDialog customInputDialog) {
            this.write = documentUploadFragment;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = customInputDialog;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            getSettings getsettings = this.write.presenter;
            if (getsettings == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str = this.MediaBrowserCompat$ItemReceiver;
            String valueOf = String.valueOf(this.IconCompatParcelizer.mEditTextView.getText());
            onGetStartedClick.IconCompatParcelizer((Object) valueOf, "passwordDialog.editTextString");
            onGetStartedClick.write((Object) str, "path");
            onGetStartedClick.write((Object) valueOf, "password");
            getsettings.MediaBrowserCompat$MediaItem = str;
            writeUInt64NoTag.IconCompatParcelizer getsettings_appcompatdelegateimpl_listmenudecorview = new getSettings$AppCompatDelegateImpl$ListMenuDecorView(str, valueOf);
            if (getsettings.RatingCompat != null) {
                getsettings_appcompatdelegateimpl_listmenudecorview.IconCompatParcelizer(getsettings.RatingCompat);
            }
        }
    }

    static final class ParcelableVolumeInfo implements DialogInterface.OnClickListener {
        public static final ParcelableVolumeInfo MediaBrowserCompat$ItemReceiver = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void read(String str, String str2) {
        onGetStartedClick.write((Object) str, "header");
        onGetStartedClick.write((Object) str2, C8183f.f4230JO);
        getSharingMomentConfig$MediaBrowserCompat$ItemReceiver getsharingmomentconfig_mediabrowsercompat_itemreceiver = getSharingMomentConfig.MediaBrowserCompat$ItemReceiver;
        Context context = getContext();
        String string = getString(R.string.hml_pdf_upload_hint);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_pdf_upload_hint)");
        CustomInputDialog IconCompatParcelizer2 = getSharingMomentConfig$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(context, str, str2, string);
        IconCompatParcelizer2.mEditTextView.setVisibility(8);
        String string2 = getString(R.string.hml_pdf_upload_incorrect_password_positive);
        DialogInterface.OnClickListener documentUploadFragment$MediaSessionCompat$QueueItem = new DocumentUploadFragment$MediaSessionCompat$QueueItem(this);
        if (string2 != null) {
            IconCompatParcelizer2.mPositiveButton.setText(string2);
            IconCompatParcelizer2.mPositiveButton.setOnClickListener(new getCustomerIndividualsTitles(IconCompatParcelizer2, documentUploadFragment$MediaSessionCompat$QueueItem));
        }
        IconCompatParcelizer2.write(getString(R.string.hml_pdf_upload_incorrect_password_negative), ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver).show();
    }

    public Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "selectedDocumentCode");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        CaptureDocumentActivity.IconCompatParcelizer iconCompatParcelizer = CaptureDocumentActivity.MediaDescriptionCompat;
        return CaptureDocumentActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(context, str, str2, str3, str4);
    }

    public Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "selectedDocumentCode");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        CropDocumentActivity.read read2 = CropDocumentActivity.MediaBrowserCompat$MediaItem;
        return CropDocumentActivity.read.read(context, str, str2, str3, str4, str5, true);
    }

    private final void IconCompatParcelizer(Futures.ListenableFutureAdapter.C34161 r4) {
        boolean z = true;
        for (Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer : r4.MediaBrowserCompat$CustomActionResultReceiver) {
            if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver && iconCompatParcelizer.MediaSessionCompat$Token.size() < iconCompatParcelizer.MediaDescriptionCompat) {
                z = false;
            }
        }
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setEnabled(z);
    }

    public final void MediaDescriptionCompat() {
        JuristicService.MediaBrowserCompat$ItemReceiver(this);
    }
}

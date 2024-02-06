package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.TermAndConditionStatementChannelActivity;
import com.scb.phone.view.custom.cardmanagement.CustomCardApplyViewComponent;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.C9738xc6b4f539;
import p040o.ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.FirebaseVisionImage;
import p040o.FirebaseVisionImage$MediaBrowserCompat$ItemReceiver;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UninterruptibleFuture;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ChangeChannelStatementApplyAllFragment extends BaseFragment implements ExtractorResponse$MediaBrowserCompat$CustomActionResultReceiver, CustomCardApplyViewComponent.IconCompatParcelizer {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    private String IconCompatParcelizer;
    private chain MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f3076x50fd9e4a;
    private List<UninterruptibleFuture> MediaDescriptionCompat;
    private ArrayList<chain> MediaMetadataCompat;
    private ArrayList<String> ParcelableVolumeInfo = new ArrayList<>();
    private boolean RatingCompat;
    @BindView
    public Button btnNext;
    @BindView
    public RadioButton ckbNo;
    @BindView
    public CheckBox ckbSelectAll;
    @BindView
    public LinearLayout ckbSelectAllLayout;
    @BindView
    public RadioButton ckbYes;
    @HmlPinActivity
    public FirebaseVisionImage presenter;
    @BindView
    public LinearLayout viewCardLayout;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    @OnClick
    public final void onClickNo() {
        MediaBrowserCompat$ItemReceiver();
    }

    private final void MediaBrowserCompat$ItemReceiver() {
        boolean z = false;
        this.RatingCompat = false;
        RadioButton radioButton = this.ckbNo;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbNo");
        }
        radioButton.setChecked(true);
        boolean z2 = this.RatingCompat;
        RadioButton radioButton2 = this.ckbYes;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbYes");
        }
        radioButton2.setChecked(z2);
        FirebaseVisionImage firebaseVisionImage = this.presenter;
        if (firebaseVisionImage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read = new FirebaseVisionImage.read(firebaseVisionImage);
        if (firebaseVisionImage.RatingCompat != null) {
            z = true;
        }
        if (z) {
            read.IconCompatParcelizer(firebaseVisionImage.RatingCompat);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f86102131493837, viewGroup, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$SearchResultReceiver = AlertController$RecycleListView.write(arguments, "EXTRA_CHANNEL_KEY");
            this.IconCompatParcelizer = AlertController$RecycleListView.write(arguments, "EXTRA_ADDRESS_KEY");
            this.f3076x50fd9e4a = AlertController$RecycleListView.write(arguments, "EXTRA_MASK_CARD_KEY");
            chain chain = (chain) arguments.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            if (chain != null) {
                onGetStartedClick.IconCompatParcelizer((Object) chain, "creditCard");
                this.MediaBrowserCompat$MediaItem = chain;
            }
            ArrayList<chain> parcelableArrayList = arguments.getParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY");
            if (parcelableArrayList != null) {
                onGetStartedClick.IconCompatParcelizer((Object) parcelableArrayList, "arrayCreditCard");
                this.MediaMetadataCompat = parcelableArrayList;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        FirebaseVisionImage firebaseVisionImage = this.presenter;
        if (firebaseVisionImage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        firebaseVisionImage.MediaBrowserCompat$ItemReceiver(this);
        FirebaseVisionImage firebaseVisionImage2 = this.presenter;
        if (firebaseVisionImage2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        chain chain = this.MediaBrowserCompat$MediaItem;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        ArrayList<chain> arrayList = this.MediaMetadataCompat;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        firebaseVisionImage2.IconCompatParcelizer = chain;
        firebaseVisionImage2.write = arrayList;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new FirebaseVisionImage.IconCompatParcelizer(firebaseVisionImage2);
        if (firebaseVisionImage2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(firebaseVisionImage2.RatingCompat);
        }
    }

    public final void onStart() {
        super.onStart();
        MediaBrowserCompat$ItemReceiver();
    }

    public final void IconCompatParcelizer(chain chain, ArrayList<chain> arrayList, String str, String str2, String str3, ArrayList<String> arrayList2) {
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) str2, "address");
        onGetStartedClick.write((Object) str3, "maskCard");
        onGetStartedClick.write((Object) arrayList2, "tempSelectCard");
        Context context = getContext();
        if (context != null) {
            TermAndConditionStatementChannelActivity.read read = TermAndConditionStatementChannelActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            Intent MediaBrowserCompat$ItemReceiver = TermAndConditionStatementChannelActivity.read.MediaBrowserCompat$ItemReceiver(context, "CHANGE_CHANNEL_STATEMENT", chain, arrayList, str, str2, str3, arrayList2);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
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
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(z);
    }

    public final void IconCompatParcelizer() {
        CheckBox checkBox = this.ckbSelectAll;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbSelectAll");
        }
        boolean z = false;
        checkBox.setChecked(false);
        FirebaseVisionImage firebaseVisionImage = this.presenter;
        if (firebaseVisionImage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new FirebaseVisionImage.write(firebaseVisionImage, false);
        if (firebaseVisionImage.RatingCompat != null) {
            z = true;
        }
        if (z) {
            write2.IconCompatParcelizer(firebaseVisionImage.RatingCompat);
        }
        write();
    }

    private final View MediaBrowserCompat$CustomActionResultReceiver(Context context, UninterruptibleFuture uninterruptibleFuture, boolean z, boolean z2, int i) {
        CustomCardApplyViewComponent customCardApplyViewComponent = new CustomCardApplyViewComponent(context, (AttributeSet) null, 0);
        customCardApplyViewComponent.setIndex(i);
        customCardApplyViewComponent.setKey(uninterruptibleFuture.MediaBrowserCompat$CustomActionResultReceiver);
        customCardApplyViewComponent.setTitle(uninterruptibleFuture.read);
        if (z) {
            View view = customCardApplyViewComponent.divider;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
            }
            view.setVisibility(4);
            customCardApplyViewComponent.MediaBrowserCompat$ItemReceiver(false);
        } else {
            View view2 = customCardApplyViewComponent.divider;
            if (view2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("divider");
            }
            view2.setVisibility(0);
            customCardApplyViewComponent.MediaBrowserCompat$ItemReceiver(true);
        }
        customCardApplyViewComponent.setSelect(z2);
        customCardApplyViewComponent.setListener(this);
        return customCardApplyViewComponent;
    }

    public final void write(int i, String str, boolean z) {
        UninterruptibleFuture uninterruptibleFuture;
        onGetStartedClick.write((Object) str, "key");
        List<UninterruptibleFuture> list = this.MediaDescriptionCompat;
        if (!(list == null || (uninterruptibleFuture = list.get(i)) == null)) {
            uninterruptibleFuture.IconCompatParcelizer = z;
        }
        List<UninterruptibleFuture> list2 = this.MediaDescriptionCompat;
        if (list2 != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list2) {
                if (!((UninterruptibleFuture) next).IconCompatParcelizer) {
                    arrayList.add(next);
                }
            }
            List list3 = (List) arrayList;
            CheckBox checkBox = this.ckbSelectAll;
            if (checkBox == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbSelectAll");
            }
            checkBox.setChecked(list3.isEmpty());
        }
        write();
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            LinearLayout linearLayout = this.ckbSelectAllLayout;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbSelectAllLayout");
            }
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.viewCardLayout;
            if (linearLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewCardLayout");
            }
            linearLayout2.setVisibility(0);
            return;
        }
        LinearLayout linearLayout3 = this.ckbSelectAllLayout;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbSelectAllLayout");
        }
        linearLayout3.setVisibility(8);
        LinearLayout linearLayout4 = this.viewCardLayout;
        if (linearLayout4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewCardLayout");
        }
        linearLayout4.setVisibility(8);
    }

    private final void write() {
        List<UninterruptibleFuture> list = this.MediaDescriptionCompat;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((UninterruptibleFuture) next).IconCompatParcelizer) {
                    arrayList.add(next);
                }
            }
            boolean z = !((List) arrayList).isEmpty();
            Button button = this.btnNext;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
            }
            button.setEnabled(z);
        }
    }

    @OnClick
    public final void onClickNext() {
        List<UninterruptibleFuture> list;
        this.ParcelableVolumeInfo.clear();
        if (this.RatingCompat && (list = this.MediaDescriptionCompat) != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((UninterruptibleFuture) next).IconCompatParcelizer) {
                    arrayList.add(next);
                }
            }
            Iterable<UninterruptibleFuture> iterable = (List) arrayList;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList2 = new ArrayList(((Collection) iterable).size());
            for (UninterruptibleFuture uninterruptibleFuture : iterable) {
                arrayList2.add(Boolean.valueOf(this.ParcelableVolumeInfo.add(uninterruptibleFuture.MediaBrowserCompat$CustomActionResultReceiver)));
            }
        }
        FirebaseVisionImage firebaseVisionImage = this.presenter;
        if (firebaseVisionImage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ArrayList<String> arrayList3 = this.ParcelableVolumeInfo;
        String str = this.MediaBrowserCompat$SearchResultReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("channel");
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("address");
        }
        String str3 = this.f3076x50fd9e4a;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("maskCard");
        }
        onGetStartedClick.write((Object) arrayList3, "tempSelectCard");
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) str2, "address");
        onGetStartedClick.write((Object) str3, "maskCard");
        chain chain = firebaseVisionImage.IconCompatParcelizer;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        boolean z = false;
        arrayList3.add(0, chain.MediaDescriptionCompat);
        writeUInt64NoTag.IconCompatParcelizer firebaseVisionImage$MediaBrowserCompat$CustomActionResultReceiver = new C9738xc6b4f539(firebaseVisionImage, str, str2, str3, arrayList3);
        if (firebaseVisionImage.RatingCompat != null) {
            z = true;
        }
        if (z) {
            firebaseVisionImage$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(firebaseVisionImage.RatingCompat);
        }
    }

    @OnClick
    public final void onClickSelectAll() {
        boolean z = true;
        this.RatingCompat = true;
        RadioButton radioButton = this.ckbNo;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbNo");
        }
        radioButton.setChecked(false);
        boolean z2 = this.RatingCompat;
        RadioButton radioButton2 = this.ckbYes;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbYes");
        }
        radioButton2.setChecked(z2);
        FirebaseVisionImage firebaseVisionImage = this.presenter;
        if (firebaseVisionImage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CheckBox checkBox = this.ckbSelectAll;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbSelectAll");
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new FirebaseVisionImage.write(firebaseVisionImage, checkBox.isChecked());
        if (firebaseVisionImage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write2.IconCompatParcelizer(firebaseVisionImage.RatingCompat);
        }
    }

    @OnClick
    public final void onClickYes() {
        boolean z = true;
        this.RatingCompat = true;
        RadioButton radioButton = this.ckbNo;
        if (radioButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbNo");
        }
        radioButton.setChecked(false);
        boolean z2 = this.RatingCompat;
        RadioButton radioButton2 = this.ckbYes;
        if (radioButton2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ckbYes");
        }
        radioButton2.setChecked(z2);
        FirebaseVisionImage firebaseVisionImage = this.presenter;
        if (firebaseVisionImage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FirebaseVisionImage$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (firebaseVisionImage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(firebaseVisionImage.RatingCompat);
        }
    }

    public final void read() {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("change_stmt_channel_applycard", zsyr2kArr);
        }
    }

    public final void IconCompatParcelizer(List<UninterruptibleFuture> list) {
        List<UninterruptibleFuture> list2;
        onGetStartedClick.write((Object) list, "cards");
        LinearLayout linearLayout = this.viewCardLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewCardLayout");
        }
        linearLayout.removeAllViews();
        this.MediaDescriptionCompat = list;
        Context context = getContext();
        if (context != null && (list2 = this.MediaDescriptionCompat) != null) {
            int i = 0;
            for (Object next : list2) {
                if (i >= 0) {
                    UninterruptibleFuture uninterruptibleFuture = (UninterruptibleFuture) next;
                    LinearLayout linearLayout2 = this.viewCardLayout;
                    if (linearLayout2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewCardLayout");
                    }
                    onGetStartedClick.IconCompatParcelizer((Object) context, "this");
                    linearLayout2.addView(MediaBrowserCompat$CustomActionResultReceiver(context, uninterruptibleFuture, i == list.size() - 1, false, i));
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, List<UninterruptibleFuture> list) {
        List<UninterruptibleFuture> list2;
        onGetStartedClick.write((Object) list, "cards");
        LinearLayout linearLayout = this.viewCardLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewCardLayout");
        }
        linearLayout.removeAllViews();
        this.MediaDescriptionCompat = list;
        Context context = getContext();
        if (context != null && (list2 = this.MediaDescriptionCompat) != null) {
            int i = 0;
            for (Object next : list2) {
                if (i >= 0) {
                    UninterruptibleFuture uninterruptibleFuture = (UninterruptibleFuture) next;
                    LinearLayout linearLayout2 = this.viewCardLayout;
                    if (linearLayout2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewCardLayout");
                    }
                    onGetStartedClick.IconCompatParcelizer((Object) context, "this");
                    linearLayout2.addView(MediaBrowserCompat$CustomActionResultReceiver(context, uninterruptibleFuture, i == list.size() - 1, z, i));
                    i++;
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
        }
    }
}

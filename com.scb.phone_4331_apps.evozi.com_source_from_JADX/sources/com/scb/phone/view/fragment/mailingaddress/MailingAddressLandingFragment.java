package com.scb.phone.view.fragment.mailingaddress;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.mailingaddress.MailingAddressDetailsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.C3978aP;
import p040o.C3982x5e5c07b5;
import p040o.C7108xec65684e;
import p040o.CharMatcher$12$MediaBrowserCompat$ItemReceiver;
import p040o.CheckEligibilityActivity;
import p040o.ForwardingListMultimap;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QueueFile;
import p040o.Tables;
import p040o.ZTBSV;
import p040o.aP$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.aP$MediaBrowserCompat$ItemReceiver;
import p040o.aP$MediaBrowserCompat$MediaItem;
import p040o.aP$MediaBrowserCompat$SearchResultReceiver;
import p040o.forEachSrcIn;
import p040o.getBusinessOwnerLoanOfferStatus;
import p040o.isProcessed;
import p040o.onGetStartedClick;
import p040o.setBits$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLength;
import p040o.setTapText;
import p040o.standardPutAll;
import p040o.writeHeader;
import p040o.writeUInt64NoTag;

public final class MailingAddressLandingFragment extends BaseFragment implements isProcessed {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    private getBusinessOwnerLoanOfferStatus MediaBrowserCompat$MediaItem;
    private final read MediaMetadataCompat = new read(this);
    @BindView
    public Button changeAddressButton;
    @BindView
    public LinearLayout layoutAccountList;
    @BindView
    public LinearLayout layoutEmptyAccount;
    @HmlPinActivity
    public C3978aP presenter;
    @BindView
    public RecyclerView recyclerView;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public MailingAddressLandingFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88302131494057, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C3978aP aPVar = this.presenter;
        if (aPVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        aPVar.MediaBrowserCompat$ItemReceiver(this);
        getBusinessOwnerLoanOfferStatus getbusinessownerloanofferstatus = new getBusinessOwnerLoanOfferStatus((byte) 0);
        this.MediaBrowserCompat$MediaItem = getbusinessownerloanofferstatus;
        getbusinessownerloanofferstatus.write = this.MediaMetadataCompat;
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView3 = this.recyclerView;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView3.setAdapter(this.MediaBrowserCompat$MediaItem);
        RecyclerView recyclerView4 = this.recyclerView;
        if (recyclerView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView4.setNestedScrollingEnabled(false);
        RecyclerView recyclerView5 = this.recyclerView;
        if (recyclerView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView5.setHasFixedSize(false);
        C3978aP aPVar2 = this.presenter;
        if (aPVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        aPVar2.write();
    }

    public final void onDestroy() {
        super.onDestroy();
        C3978aP aPVar = this.presenter;
        if (aPVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        aPVar.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        onGetStartedClick.write((Object) list, "displayList");
        LinearLayout linearLayout = this.layoutEmptyAccount;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmptyAccount");
        }
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = this.layoutAccountList;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutAccountList");
        }
        linearLayout2.setVisibility(0);
        getBusinessOwnerLoanOfferStatus getbusinessownerloanofferstatus = this.MediaBrowserCompat$MediaItem;
        if (getbusinessownerloanofferstatus != null) {
            getbusinessownerloanofferstatus.IconCompatParcelizer(list);
        }
    }

    public final void read(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        getBusinessOwnerLoanOfferStatus getbusinessownerloanofferstatus = this.MediaBrowserCompat$MediaItem;
        if (getbusinessownerloanofferstatus != null) {
            getbusinessownerloanofferstatus.MediaBrowserCompat$ItemReceiver(builder);
        }
    }

    public final void IconCompatParcelizer() {
        LinearLayout linearLayout = this.layoutEmptyAccount;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutEmptyAccount");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.layoutAccountList;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutAccountList");
        }
        linearLayout2.setVisibility(8);
    }

    public final void read(boolean z) {
        Button button = this.changeAddressButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("changeAddressButton");
        }
        button.setEnabled(z);
    }

    @OnClick
    public final void changeMailingAddress() {
        C3978aP aPVar = this.presenter;
        if (aPVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (aPVar.RatingCompat != null) {
            aPVar.RatingCompat.AlertController$RecycleListView();
        }
        standardPutAll standardputall = new standardPutAll(Tables.TransposeTable.C38381.write(aPVar.read, 3), Tables.TransposeTable.C38381.write(aPVar.read, 5), Tables.TransposeTable.C38381.write(aPVar.read, 14), Tables.TransposeTable.C38381.write(aPVar.read, 15), Tables.TransposeTable.C38381.write(aPVar.read, 2));
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C3978aP.IconCompatParcelizer(standardputall);
        if (aPVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(aPVar.RatingCompat);
        }
        LinkedListMultimap.MultisetView.C35822.C35831 r2 = aPVar.write;
        FundFactSheetActivity read2 = new C3978aP.read(aPVar);
        FundFactSheetActivity ap_mediabrowsercompat_customactionresultreceiver = new aP$MediaBrowserCompat$CustomActionResultReceiver(aPVar);
        onGetStartedClick.write((Object) standardputall, "request");
        onGetStartedClick.write((Object) read2, "onSuccess");
        onGetStartedClick.write((Object) ap_mediabrowsercompat_customactionresultreceiver, "onError");
        r2.IconCompatParcelizer(r2.MediaBrowserCompat$SearchResultReceiver, read2, ap_mediabrowsercompat_customactionresultreceiver, new setBits$MediaBrowserCompat$CustomActionResultReceiver(standardputall));
    }

    public static final class read implements C7108xec65684e {
        private /* synthetic */ MailingAddressLandingFragment MediaBrowserCompat$ItemReceiver;

        read(MailingAddressLandingFragment mailingAddressLandingFragment) {
            this.MediaBrowserCompat$ItemReceiver = mailingAddressLandingFragment;
        }

        public final void read(QueueFile.Element element, boolean z) {
            onGetStartedClick.write((Object) element, "selector");
            C3978aP aPVar = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (aPVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) element, "selector");
            element.MediaBrowserCompat$ItemReceiver = z;
            List<? extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list = aPVar.read;
            if (list != null) {
                for (AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder : list) {
                    if (!(builder instanceof setLength)) {
                        builder = null;
                    }
                    setLength setlength = (setLength) builder;
                    if (setlength != null) {
                        setlength.MediaSessionCompat$ResultReceiverWrapper = z;
                    }
                }
                writeUInt64NoTag.IconCompatParcelizer ap_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C3982x5e5c07b5(z);
                boolean z2 = true;
                if (aPVar.RatingCompat != null) {
                    ap_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver.IconCompatParcelizer(aPVar.RatingCompat);
                }
                writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new C3978aP.MediaDescriptionCompat(list);
                if (aPVar.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    mediaDescriptionCompat.IconCompatParcelizer(aPVar.RatingCompat);
                }
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(setLength setlength, boolean z) {
            QueueFile.Element element;
            Object obj;
            Object obj2;
            onGetStartedClick.write((Object) setlength, "item");
            C3978aP aPVar = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (aPVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setlength, "item");
            List<? extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list = aPVar.read;
            if (list != null) {
                Iterable iterable = list;
                Iterator it = iterable.iterator();
                while (true) {
                    element = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj, (Object) setlength)) {
                        break;
                    }
                }
                if (!(obj instanceof setLength)) {
                    obj = null;
                }
                setLength setlength2 = (setLength) obj;
                boolean z2 = true;
                if (setlength2 != null) {
                    setlength2.MediaSessionCompat$ResultReceiverWrapper = z;
                    writeUInt64NoTag.IconCompatParcelizer ap_mediabrowsercompat_searchresultreceiver = new aP$MediaBrowserCompat$SearchResultReceiver(setlength2);
                    if (aPVar.RatingCompat != null) {
                        ap_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(aPVar.RatingCompat);
                    }
                }
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (next instanceof setLength) {
                        arrayList.add(next);
                    }
                }
                int i = 0;
                int i2 = 0;
                for (setLength setlength3 : (List) arrayList) {
                    i2++;
                    if (setlength3.MediaSessionCompat$ResultReceiverWrapper) {
                        i++;
                    }
                }
                writeUInt64NoTag.IconCompatParcelizer ap_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C3982x5e5c07b5(i > 0);
                if (aPVar.RatingCompat != null) {
                    ap_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver.IconCompatParcelizer(aPVar.RatingCompat);
                }
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj2) instanceof QueueFile.Element) {
                        break;
                    }
                }
                if (obj2 instanceof QueueFile.Element) {
                    element = obj2;
                }
                QueueFile.Element element2 = element;
                if (element2 != null) {
                    element2.MediaBrowserCompat$ItemReceiver = i >= i2;
                    writeUInt64NoTag.IconCompatParcelizer ap_mediabrowsercompat_mediaitem = new aP$MediaBrowserCompat$MediaItem(element2);
                    if (aPVar.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        ap_mediabrowsercompat_mediaitem.IconCompatParcelizer(aPVar.RatingCompat);
                    }
                }
            }
        }

        public final void write() {
            C3978aP aPVar = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (aPVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            aPVar.write();
        }

        public final void write(setLength setlength) {
            onGetStartedClick.write((Object) setlength, "item");
            C3978aP aPVar = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (aPVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setlength, "item");
            LinkedListMultimap.MultisetView.C35822.C35831 r0 = aPVar.write;
            String str = setlength.IconCompatParcelizer;
            if (str == null) {
                str = "";
            }
            String str2 = setlength.write;
            String str3 = setlength.MediaDescriptionCompat;
            FundFactSheetActivity ap_mediabrowsercompat_itemreceiver = new aP$MediaBrowserCompat$ItemReceiver(aPVar, setlength);
            FundFactSheetActivity write = new C3978aP.write(aPVar, setlength);
            onGetStartedClick.write((Object) str, "applicationId");
            onGetStartedClick.write((Object) ap_mediabrowsercompat_itemreceiver, "onSuccess");
            onGetStartedClick.write((Object) write, "onError");
            r0.MediaDescriptionCompat.IconCompatParcelizer(ap_mediabrowsercompat_itemreceiver, write, new CharMatcher$12$MediaBrowserCompat$ItemReceiver(str, str2, str3), r0.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        Context context = getContext();
        if (context != null) {
            MailingAddressDetailsActivity.read read2 = MailingAddressDetailsActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "tokenId");
            Intent intent = new Intent(context, MailingAddressDetailsActivity.class);
            intent.putExtra("PARCELABLE_TOKEN_ID", str);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read3 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read3.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read3);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachSrcIn> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachSrcIn();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(writeHeader writeheader) {
        onGetStartedClick.write((Object) writeheader, "display");
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read("change_mailing_address");
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read("number_of_creditcard_speedycash_shown", String.valueOf(writeheader.MediaBrowserCompat$CustomActionResultReceiver.size()));
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read("number_of_debit_card_shown", String.valueOf(writeheader.write.size()));
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read("number_of_prepaid_card_shown", String.valueOf(writeheader.MediaBrowserCompat$ItemReceiver.size()));
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read("number_of_deposit_shown", String.valueOf(writeheader.IconCompatParcelizer.size()));
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read("number_of_loan_shown", String.valueOf(writeheader.read.size()));
        ZTBSV ztbsv = (forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "change_mailing_address_landing");
        }
    }

    public final void IconCompatParcelizer(standardPutAll standardputall) {
        String str;
        String str2;
        String str3;
        String str4;
        String valueOf;
        onGetStartedClick.write((Object) standardputall, "request");
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver();
        ((forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read("change_mailing_address");
        forEachSrcIn foreachsrcin = (forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        List<ForwardingListMultimap> list = standardputall.read;
        String str5 = "0";
        if (list == null || (str = String.valueOf(list.size())) == null) {
            str = str5;
        }
        foreachsrcin.read("number_of_creditcard_speedycash_selected", str);
        forEachSrcIn foreachsrcin2 = (forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        List<ForwardingListMultimap> list2 = standardputall.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 == null || (str2 = String.valueOf(list2.size())) == null) {
            str2 = str5;
        }
        foreachsrcin2.read("number_of_debit_card_selected", str2);
        forEachSrcIn foreachsrcin3 = (forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        List<ForwardingListMultimap> list3 = standardputall.IconCompatParcelizer;
        if (list3 == null || (str3 = String.valueOf(list3.size())) == null) {
            str3 = str5;
        }
        foreachsrcin3.read("number_of_prepaid_card_selected", str3);
        forEachSrcIn foreachsrcin4 = (forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        List<ForwardingListMultimap> list4 = standardputall.write;
        if (list4 == null || (str4 = String.valueOf(list4.size())) == null) {
            str4 = str5;
        }
        foreachsrcin4.read("number_of_deposit_selected", str4);
        forEachSrcIn foreachsrcin5 = (forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        List<ForwardingListMultimap> list5 = standardputall.MediaBrowserCompat$ItemReceiver;
        if (!(list5 == null || (valueOf = String.valueOf(list5.size())) == null)) {
            str5 = valueOf;
        }
        foreachsrcin5.read("number_of_loan_selected", str5);
        ZTBSV ztbsv = (forEachSrcIn) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "change_mailing_address_product_selected");
        }
    }
}

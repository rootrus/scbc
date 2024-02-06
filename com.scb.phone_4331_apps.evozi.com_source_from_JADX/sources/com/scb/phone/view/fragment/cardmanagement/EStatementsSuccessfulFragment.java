package com.scb.phone.view.fragment.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class EStatementsSuccessfulFragment extends BaseFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);
    private chain MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private ArrayList<String> MediaMetadataCompat = new ArrayList<>();
    @BindView
    public TextView textDescription;
    @BindView
    public CustomTransferAndPaySource viewAccount;
    @BindView
    public CustomNoteItem viewBillCycle;
    @BindView
    public CustomTransferAndPayItem viewSendTo;

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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f86892131493916, viewGroup, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (chain) arguments.getParcelable("CREDIT_CARD_DISPLAY_KEY");
            this.MediaBrowserCompat$MediaItem = arguments.getString("EMAIL_KEY");
            ArrayList<String> stringArrayList = arguments.getStringArrayList("LIST_BILLED_CYCLE_KEY");
            if (stringArrayList != null) {
                onGetStartedClick.IconCompatParcelizer((Object) stringArrayList, "data");
                this.MediaMetadataCompat = stringArrayList;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        CustomTransferAndPaySource customTransferAndPaySource = this.viewAccount;
        if (customTransferAndPaySource == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewAccount");
        }
        chain chain = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = null;
        if (chain != null) {
            str = chain.AppCompatViewInflater;
        } else {
            str = null;
        }
        customTransferAndPaySource.setSourceName(str);
        chain chain2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chain2 != null) {
            str2 = chain2.MediaSessionCompat$Token;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        customTransferAndPaySource.setAccountNumber(str2);
        customTransferAndPaySource.setText(getString(R.string.ccm_e_statement_successful_account));
        customTransferAndPaySource.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb).toString());
        customTransferAndPaySource.setDivider(false);
        CustomNoteItem customNoteItem = this.viewBillCycle;
        if (customNoteItem == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewBillCycle");
        }
        String string = getString(R.string.billed_cycle);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.billed_cycle)");
        if (string != null) {
            String upperCase = string.toUpperCase();
            onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            customNoteItem.setTitle(upperCase);
            Iterable<String> iterable = this.MediaMetadataCompat;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (String str4 : iterable) {
                if (str4 != null) {
                    String upperCase2 = str4.toUpperCase();
                    onGetStartedClick.IconCompatParcelizer((Object) upperCase2, "(this as java.lang.String).toUpperCase()");
                    arrayList.add(upperCase2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            customNoteItem.setText(AlertController$RecycleListView.write((List<String>) (List) arrayList, "\n"));
            customNoteItem.write();
            customNoteItem.bottomSpace.setVisibility(0);
            customNoteItem.divider.setVisibility(8);
            CustomTransferAndPayItem customTransferAndPayItem = this.viewSendTo;
            if (customTransferAndPayItem == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewSendTo");
            }
            customTransferAndPayItem.setText(getString(R.string.export_statement_successful_sent_to));
            String str5 = this.MediaBrowserCompat$MediaItem;
            if (str5 != null) {
                str3 = str5;
            }
            customTransferAndPayItem.setValue(str3);
            customTransferAndPayItem.setFullDivider(true);
            TextView textView = this.textDescription;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("textDescription");
            }
            textView.setText(getString(R.string.ccm_e_statement_successful_description));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @OnClick
    public final void onClickReturnButton() {
        Intent intent = new Intent(getContext(), CreditCardDetailActivity.class);
        intent.setFlags(603979776);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                intent = setTapText.write(activity2, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

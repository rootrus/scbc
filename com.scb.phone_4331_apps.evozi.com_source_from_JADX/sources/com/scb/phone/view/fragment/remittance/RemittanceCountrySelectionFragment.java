package com.scb.phone.view.fragment.remittance;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnTextChanged;
import com.scb.phone.R;
import com.scb.phone.view.adapter.remittance.RemittanceCountryListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.TypeCastException;
import p040o.BaseJuristicPinActivity_ViewBinding;
import p040o.C5081nz;
import p040o.FragmentBuilder_BindBillPaymentHistoryFragment;
import p040o.FragmentBuilder_BindCreditCardDetailFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.JuristicRequestFormActivity;
import p040o.JuristicSetupNewPinActivity;
import p040o.NTBPinLoginActivity_ViewBinding;
import p040o.addInput;
import p040o.getCode;
import p040o.getImportance;
import p040o.getTcpNoDelay;
import p040o.getTrafficClass;
import p040o.getZOrderOnTop;
import p040o.hasParent;
import p040o.nz$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.nz$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setFaceBottomPadding;
import p040o.validateGER;
import p040o.writeUInt64NoTag;

public final class RemittanceCountrySelectionFragment extends BaseFragment implements setFaceBottomPadding, FragmentBuilder_BindCreditCardDetailFragment {
    private validateGER IconCompatParcelizer;
    private RemittanceCountryListAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public FragmentBuilder_BindBillPaymentHistoryFragment MediaMetadataCompat;
    @BindView
    public View errorView;
    @BindView
    public EditText etCountryListSearch;
    @BindView
    public Group groupCountryList;
    @BindView
    public ImageView ivClear;
    @HmlPinActivity
    public C5081nz presenter;
    @BindView
    public RecyclerView rvCountryList;

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof FragmentBuilder_BindBillPaymentHistoryFragment) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                this.MediaMetadataCompat = (FragmentBuilder_BindBillPaymentHistoryFragment) parentFragment;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.listener.OnCountrySelectListener");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f89392131494166, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        C5081nz nzVar = this.presenter;
        if (nzVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nzVar.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void onActivityCreated(Bundle bundle) {
        InputFilter[] inputFilterArr;
        super.onActivityCreated(bundle);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.IconCompatParcelizer = new validateGER(bundle != null ? bundle.getParcelable("RecyclerViewExpandableItemManager") : null);
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        FundFactSheetActivity remittanceCountrySelectionFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6149xa607be71(this);
        validateGER validateger = this.IconCompatParcelizer;
        if (validateger == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemManager");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = new RemittanceCountryListAdapter(requireContext, remittanceCountrySelectionFragment$MediaBrowserCompat$CustomActionResultReceiver, validateger, this);
        validateGER validateger2 = this.IconCompatParcelizer;
        if (validateger2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemManager");
        }
        RemittanceCountryListAdapter remittanceCountryListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (remittanceCountryListAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryListAdapter");
        }
        RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> MediaBrowserCompat$ItemReceiver = validateger2.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) remittanceCountryListAdapter);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "itemManager.createWrappe…apter(countryListAdapter)");
        this.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$ItemReceiver;
        addInput addinput = new addInput();
        addinput.MediaSessionCompat$ResultReceiverWrapper = false;
        RecyclerView recyclerView = this.rvCountryList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCountryList");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> iconCompatParcelizer = this.MediaBrowserCompat$SearchResultReceiver;
        if (iconCompatParcelizer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("wrappedAdapter");
        }
        recyclerView.setAdapter(iconCompatParcelizer);
        recyclerView.setItemAnimator(addinput);
        recyclerView.setHasFixedSize(false);
        recyclerView.setNestedScrollingEnabled(false);
        validateGER validateger3 = this.IconCompatParcelizer;
        if (validateger3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemManager");
        }
        validateger3.IconCompatParcelizer(recyclerView);
        C5081nz nzVar = this.presenter;
        if (nzVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<getZOrderOnTop> read = nzVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.read();
        if (read != null) {
            Iterable<getZOrderOnTop> iterable = read;
            hasParent hasparent = nzVar.write;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (getZOrderOnTop MediaBrowserCompat$ItemReceiver2 : iterable) {
                arrayList.add(hasparent.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2));
            }
            List<? extends getImportance> list = (List) arrayList;
            writeUInt64NoTag.IconCompatParcelizer nz_mediabrowsercompat_itemreceiver = new nz$MediaBrowserCompat$ItemReceiver(list);
            if (nzVar.RatingCompat != null) {
                nz_mediabrowsercompat_itemreceiver.IconCompatParcelizer(nzVar.RatingCompat);
            }
            nzVar.IconCompatParcelizer = list;
        } else {
            C5081nz nzVar2 = nzVar;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C5081nz.read.read;
            if (nzVar2.RatingCompat != null) {
                iconCompatParcelizer2.IconCompatParcelizer(nzVar2.RatingCompat);
            }
        }
        FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment fragmentBuilder_BindEasycashFeaturesAccountDynamicFragment = new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("[^\\u0E01-\\u0E39\\u0E40-\\u0E4C]");
        EditText editText = this.etCountryListSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etCountryListSearch");
        }
        if (editText.getFilters() != null) {
            InputFilter[] filters = editText.getFilters();
            onGetStartedClick.IconCompatParcelizer((Object) filters, "filters");
            onGetStartedClick.write((Object) filters, "$this$toMutableList");
            onGetStartedClick.write((Object) filters, "$this$asCollection");
            List arrayList2 = new ArrayList(new NTBPinLoginActivity_ViewBinding(filters, false));
            arrayList2.add(fragmentBuilder_BindEasycashFeaturesAccountDynamicFragment);
            Object[] array = arrayList2.toArray(new InputFilter[0]);
            if (array != null) {
                inputFilterArr = (InputFilter[]) array;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            inputFilterArr = (InputFilter[]) new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment[]{fragmentBuilder_BindEasycashFeaturesAccountDynamicFragment};
        }
        editText.setFilters(inputFilterArr);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        onGetStartedClick.write((Object) bundle, "outState");
        super.onSaveInstanceState(bundle);
        validateGER validateger = this.IconCompatParcelizer;
        if (validateger == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("itemManager");
        }
        bundle.putParcelable("RecyclerViewExpandableItemManager", validateger.read());
    }

    public final void onDestroyView() {
        RecyclerView recyclerView = this.rvCountryList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCountryList");
        }
        recyclerView.setItemAnimator((RecyclerView.MediaMetadataCompat) null);
        RecyclerView recyclerView2 = this.rvCountryList;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCountryList");
        }
        recyclerView2.setAdapter((RecyclerView.IconCompatParcelizer) null);
        super.onDestroyView();
    }

    public final void onDestroy() {
        C5081nz nzVar = this.presenter;
        if (nzVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nzVar.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<? extends getImportance> list) {
        onGetStartedClick.write((Object) list, "result");
        Group group = this.groupCountryList;
        if (group == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupCountryList");
        }
        group.setVisibility(0);
        View view = this.errorView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("errorView");
        }
        view.setVisibility(8);
        RemittanceCountryListAdapter remittanceCountryListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (remittanceCountryListAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryListAdapter");
        }
        onGetStartedClick.write((Object) list, "list");
        remittanceCountryListAdapter.MediaBrowserCompat$ItemReceiver = list;
        remittanceCountryListAdapter.IconCompatParcelizer.write();
    }

    @OnTextChanged
    public final void onSearchTextChanged(CharSequence charSequence) {
        ImageView imageView = this.ivClear;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivClear");
        }
        boolean z = true;
        imageView.setVisibility(String.valueOf(charSequence).length() > 0 ? 0 : 8);
        C5081nz nzVar = this.presenter;
        if (nzVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String valueOf = String.valueOf(charSequence);
        onGetStartedClick.write((Object) valueOf, "input");
        Collection arrayList = new ArrayList();
        for (Object next : nzVar.IconCompatParcelizer) {
            if (next instanceof getCode) {
                arrayList.add(next);
            }
        }
        BaseJuristicPinActivity_ViewBinding MediaBrowserCompat$ItemReceiver = getTcpNoDelay.MediaBrowserCompat$ItemReceiver(new getTrafficClass(valueOf, (List) arrayList));
        FundFactSheetActivity fundFactSheetActivity = nz$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "$this$map");
        onGetStartedClick.write((Object) fundFactSheetActivity, "transform");
        BaseJuristicPinActivity_ViewBinding juristicSetupNewPinActivity = new JuristicSetupNewPinActivity(MediaBrowserCompat$ItemReceiver, fundFactSheetActivity);
        onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$toList");
        onGetStartedClick.write((Object) juristicSetupNewPinActivity, "$this$toMutableList");
        Collection write = HmlNTBBusinessURLInformationActivity.write((List) JuristicRequestFormActivity.read(juristicSetupNewPinActivity, new ArrayList()));
        if (write.isEmpty()) {
            write = Collections.singletonList(getImportance.read.write);
            onGetStartedClick.IconCompatParcelizer((Object) write, "java.util.Collections.singletonList(element)");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C5081nz.IconCompatParcelizer((List) write);
        if (nzVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(nzVar.RatingCompat);
        }
    }

    @OnEditorAction
    public final boolean onSearchEditAction(int i) {
        if (i != 3) {
            return false;
        }
        PlaybackStateCompat$CustomAction();
        return false;
    }

    @OnClick
    public final void onClearClicked() {
        EditText editText = this.etCountryListSearch;
        if (editText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("etCountryListSearch");
        }
        editText.setText("");
    }

    public final void IconCompatParcelizer(List<? extends getImportance> list) {
        onGetStartedClick.write((Object) list, "result");
        RemittanceCountryListAdapter remittanceCountryListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (remittanceCountryListAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("countryListAdapter");
        }
        onGetStartedClick.write((Object) list, "list");
        remittanceCountryListAdapter.MediaBrowserCompat$ItemReceiver = list;
        remittanceCountryListAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Group group = this.groupCountryList;
        if (group == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupCountryList");
        }
        group.setVisibility(8);
        View view = this.errorView;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("errorView");
        }
        view.setVisibility(0);
    }

    public final void write() {
        Context context = getContext();
        if (context != null) {
            View currentFocus = ((Activity) context).getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        PlaybackStateCompat$CustomAction();
    }
}

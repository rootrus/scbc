package com.scb.phone.view.fragment.prepaid.traveltab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.adapter.prepaid.PrepaidTransactionAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.HmlPinActivity;
import p040o.LocalProjectProvider_Factory;
import p040o.ZHER2K;
import p040o.addInput;
import p040o.getAddress1FieldName;
import p040o.getAddress1FieldName$MediaBrowserCompat$MediaItem;
import p040o.getModel;
import p040o.getModelClass;
import p040o.isSimulator;
import p040o.onGetStartedClick;
import p040o.setBaselineAligned;
import p040o.setCores;
import p040o.setLastBaselineToBottomHeight;
import p040o.setSimulator;
import p040o.validateGER;
import p040o.validateGER$MediaBrowserCompat$ItemReceiver;
import p040o.validateHERK;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelDetailTabFragment extends BaseFragment implements PrepaidDetailsActivity.read, LocalProjectProvider_Factory.IconCompatParcelizer {
    private getModelClass IconCompatParcelizer;
    private HashMap MediaBrowserCompat$CustomActionResultReceiver;
    private PrepaidTransactionAdapter RatingCompat;
    @HmlPinActivity
    public getAddress1FieldName presenter;

    public final View IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88952131494122, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        getAddress1FieldName getaddress1fieldname = this.presenter;
        if (getaddress1fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress1fieldname.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getParcelable("ARGS_PREPAID_CARD_DISPLAY");
            this.IconCompatParcelizer = (getModelClass) arguments.getParcelable("ARGS_PREPAID_CARD_SUMMARY_DISPLAY");
        }
        TextView textView = (TextView) view.findViewById(ZHER2K.write.tvTxnHeader);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "view.tvTxnHeader");
        textView.setText(getString(R.string.debit_transaction_label));
        validateGER validateger = new validateGER((Parcelable) null);
        validateGER$MediaBrowserCompat$ItemReceiver validateger_mediabrowsercompat_itemreceiver = PrepaidTravelDetailTabFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        validateHERK validateherk = validateger.MediaDescriptionCompat;
        if (validateherk != null) {
            validateherk.RatingCompat = validateger_mediabrowsercompat_itemreceiver;
        } else {
            validateger.MediaBrowserCompat$ItemReceiver = validateger_mediabrowsercompat_itemreceiver;
        }
        validateGER.write write = validateger;
        validateHERK validateherk2 = validateger.MediaDescriptionCompat;
        if (validateherk2 != null) {
            validateherk2.MediaMetadataCompat = write;
        } else {
            validateger.MediaBrowserCompat$CustomActionResultReceiver = write;
        }
        PrepaidTransactionAdapter prepaidTransactionAdapter = new PrepaidTransactionAdapter(getContext(), (byte) 0);
        this.RatingCompat = prepaidTransactionAdapter;
        RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver = validateger.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) prepaidTransactionAdapter);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "itemManager.createWrappe…apter(transactionAdapter)");
        addInput addinput = new addInput();
        addinput.MediaSessionCompat$ResultReceiverWrapper = false;
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView2, "rvTransactions");
        recyclerView2.setAdapter(MediaBrowserCompat$ItemReceiver);
        RecyclerView recyclerView3 = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView3, "rvTransactions");
        recyclerView3.setItemAnimator(addinput);
        RecyclerView recyclerView4 = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView4, "rvTransactions");
        recyclerView4.setNestedScrollingEnabled(false);
        ((RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions)).setHasFixedSize(false);
        validateger.IconCompatParcelizer((RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions));
    }

    public final void read(isSimulator issimulator) {
        String str;
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        getAddress1FieldName getaddress1fieldname = this.presenter;
        if (getaddress1fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getModelClass getmodelclass = this.IconCompatParcelizer;
        if (getmodelclass != null) {
            str = getmodelclass.read;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        onGetStartedClick.write((Object) str, "currentDate");
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        getaddress1fieldname.IconCompatParcelizer = str;
        getaddress1fieldname.MediaMetadataCompat = null;
        getaddress1fieldname.MediaBrowserCompat$MediaItem = issimulator;
        List<getModel> MediaBrowserCompat$CustomActionResultReceiver2 = getaddress1fieldname.MediaBrowserCompat$CustomActionResultReceiver();
        boolean z = true;
        if (!MediaBrowserCompat$CustomActionResultReceiver2.isEmpty()) {
            getaddress1fieldname.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver2.get(0);
            getaddress1fieldname.MediaDescriptionCompat.clear();
            getaddress1fieldname.read = true;
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new getAddress1FieldName.RatingCompat(MediaBrowserCompat$CustomActionResultReceiver2);
            if (getaddress1fieldname.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ratingCompat.IconCompatParcelizer(getaddress1fieldname.RatingCompat);
            }
            String str2 = issimulator.RatingCompat;
            String str3 = getaddress1fieldname.MediaMetadataCompat;
            getModel getmodel = getaddress1fieldname.MediaBrowserCompat$ItemReceiver;
            if (getmodel == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("durationFilter");
            }
            getaddress1fieldname.MediaBrowserCompat$CustomActionResultReceiver(str2, str3, getmodel);
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getAddress1FieldName$MediaBrowserCompat$MediaItem.write;
        if (getaddress1fieldname.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(getaddress1fieldname.RatingCompat);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15128x50fd9e4a() {
        getAddress1FieldName getaddress1fieldname = this.presenter;
        if (getaddress1fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) getaddress1fieldname.write)) {
            getaddress1fieldname.read = false;
            if (!getaddress1fieldname.MediaBrowserCompat$SearchResultReceiver) {
                isSimulator issimulator = getaddress1fieldname.MediaBrowserCompat$MediaItem;
                if (issimulator == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardDisplay");
                }
                String str = issimulator.RatingCompat;
                String str2 = getaddress1fieldname.MediaMetadataCompat;
                getModel getmodel = getaddress1fieldname.MediaBrowserCompat$ItemReceiver;
                if (getmodel == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("durationFilter");
                }
                getaddress1fieldname.MediaBrowserCompat$CustomActionResultReceiver(str, str2, getmodel);
            }
            getaddress1fieldname.MediaBrowserCompat$SearchResultReceiver = true;
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        if (!(recyclerView.ActionMenuItemView > 0)) {
            PrepaidTransactionAdapter prepaidTransactionAdapter = this.RatingCompat;
            if (prepaidTransactionAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionAdapter");
            }
            prepaidTransactionAdapter.write(true);
        }
    }

    public final void MediaMetadataCompat() {
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        if (!(recyclerView.ActionMenuItemView > 0)) {
            PrepaidTransactionAdapter prepaidTransactionAdapter = this.RatingCompat;
            if (prepaidTransactionAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionAdapter");
            }
            prepaidTransactionAdapter.write(false);
        }
    }

    public final void write(List<getModel> list) {
        onGetStartedClick.write((Object) list, "durationFilterDisplayList");
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            MediaBrowserCompat$CustomActionResultReceiver(context);
            Toolbar toolbar = (Toolbar) IconCompatParcelizer(ZHER2K.write.toolbarTxnHeader);
            onGetStartedClick.IconCompatParcelizer((Object) toolbar, "toolbarTxnHeader");
            Menu MediaBrowserCompat$CustomActionResultReceiver2 = toolbar.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver2.clear();
            for (getModel next : list) {
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2.add(next.write);
                }
            }
            ArrayList arrayList = new ArrayList();
            int size = MediaBrowserCompat$CustomActionResultReceiver2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2.getItem(i));
            }
            ((Toolbar) IconCompatParcelizer(ZHER2K.write.toolbarTxnHeader)).setOnMenuItemClickListener(new IconCompatParcelizer(arrayList, this));
        }
    }

    static final class IconCompatParcelizer implements Toolbar.IconCompatParcelizer {
        private /* synthetic */ PrepaidTravelDetailTabFragment IconCompatParcelizer;
        private /* synthetic */ ArrayList MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(ArrayList arrayList, PrepaidTravelDetailTabFragment prepaidTravelDetailTabFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
            this.IconCompatParcelizer = prepaidTravelDetailTabFragment;
        }

        public final boolean read(MenuItem menuItem) {
            onGetStartedClick.IconCompatParcelizer((Object) menuItem, "item");
            menuItem.getItemId();
            TextView textView = (TextView) this.IconCompatParcelizer.IconCompatParcelizer(ZHER2K.write.tvMonthHeader);
            onGetStartedClick.IconCompatParcelizer((Object) textView, "tvMonthHeader");
            textView.setText(menuItem.getTitle());
            int indexOf = this.MediaBrowserCompat$CustomActionResultReceiver.indexOf(menuItem);
            getAddress1FieldName getaddress1fieldname = this.IconCompatParcelizer.presenter;
            if (getaddress1fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getAddress1FieldName getaddress1fieldname2 = this.IconCompatParcelizer.presenter;
            if (getaddress1fieldname2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getModel getmodel = getaddress1fieldname2.MediaBrowserCompat$CustomActionResultReceiver().get(indexOf);
            onGetStartedClick.write((Object) getmodel, "durationFilterDisplay");
            getaddress1fieldname.MediaDescriptionCompat.clear();
            getaddress1fieldname.MediaMetadataCompat = null;
            getaddress1fieldname.MediaBrowserCompat$ItemReceiver = getmodel;
            getaddress1fieldname.read = true;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getAddress1FieldName.write.MediaBrowserCompat$CustomActionResultReceiver;
            if (getaddress1fieldname.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getaddress1fieldname.RatingCompat);
            }
            isSimulator issimulator = getaddress1fieldname.MediaBrowserCompat$MediaItem;
            if (issimulator == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardDisplay");
            }
            String str = issimulator.RatingCompat;
            String str2 = getaddress1fieldname.MediaMetadataCompat;
            getModel getmodel2 = getaddress1fieldname.MediaBrowserCompat$ItemReceiver;
            if (getmodel2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("durationFilter");
            }
            getaddress1fieldname.MediaBrowserCompat$CustomActionResultReceiver(str, str2, getmodel2);
            return true;
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.ic_filter_list_black_24dp);
        Drawable mutate = write != null ? write.mutate() : null;
        if (mutate != null) {
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(mutate, setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
            Toolbar toolbar = (Toolbar) IconCompatParcelizer(ZHER2K.write.toolbarTxnHeader);
            onGetStartedClick.IconCompatParcelizer((Object) toolbar, "toolbarTxnHeader");
            toolbar.setOverflowIcon(mutate);
        }
    }

    public final void RatingCompat() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(8);
        View IconCompatParcelizer3 = IconCompatParcelizer(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer3, "viewCustomError");
        IconCompatParcelizer3.setVisibility(8);
        TextView textView = (TextView) IconCompatParcelizer(ZHER2K.write.tvErrorMessage);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvErrorMessage");
        textView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        recyclerView.setVisibility(8);
        View IconCompatParcelizer4 = IconCompatParcelizer(ZHER2K.write.custom_error);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer4, "custom_error");
        IconCompatParcelizer4.setVisibility(0);
    }

    public final void MediaBrowserCompat$MediaItem() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(0);
        View IconCompatParcelizer3 = IconCompatParcelizer(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer3, "viewCustomError");
        IconCompatParcelizer3.setVisibility(8);
        TextView textView = (TextView) IconCompatParcelizer(ZHER2K.write.tvErrorMessage);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvErrorMessage");
        textView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        recyclerView.setVisibility(8);
        View IconCompatParcelizer4 = IconCompatParcelizer(ZHER2K.write.custom_error);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer4, "custom_error");
        IconCompatParcelizer4.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(8);
        View IconCompatParcelizer3 = IconCompatParcelizer(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer3, "viewCustomError");
        IconCompatParcelizer3.setVisibility(8);
        TextView textView = (TextView) IconCompatParcelizer(ZHER2K.write.tvErrorMessage);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvErrorMessage");
        textView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        recyclerView.setVisibility(0);
        View IconCompatParcelizer4 = IconCompatParcelizer(ZHER2K.write.custom_error);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer4, "custom_error");
        IconCompatParcelizer4.setVisibility(8);
    }

    public final void IconCompatParcelizer() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(8);
        View IconCompatParcelizer3 = IconCompatParcelizer(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer3, "viewCustomError");
        IconCompatParcelizer3.setVisibility(0);
        TextView textView = (TextView) IconCompatParcelizer(ZHER2K.write.tvErrorMessage);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvErrorMessage");
        textView.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        recyclerView.setVisibility(8);
        View IconCompatParcelizer4 = IconCompatParcelizer(ZHER2K.write.custom_error);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer4, "custom_error");
        IconCompatParcelizer4.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(8);
        View IconCompatParcelizer3 = IconCompatParcelizer(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer3, "viewCustomError");
        IconCompatParcelizer3.setVisibility(8);
        TextView textView = (TextView) IconCompatParcelizer(ZHER2K.write.tvErrorMessage);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvErrorMessage");
        textView.setText(getString(R.string.prepaid_travel_empty_no_transactions));
        TextView textView2 = (TextView) IconCompatParcelizer(ZHER2K.write.tvErrorMessage);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvErrorMessage");
        textView2.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvTransactions);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvTransactions");
        recyclerView.setVisibility(8);
        View IconCompatParcelizer4 = IconCompatParcelizer(ZHER2K.write.custom_error);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer4, "custom_error");
        IconCompatParcelizer4.setVisibility(8);
    }

    public final void write(setCores setcores, boolean z) {
        onGetStartedClick.write((Object) setcores, "transactionsDisplay");
        if (z) {
            PrepaidTransactionAdapter prepaidTransactionAdapter = this.RatingCompat;
            if (prepaidTransactionAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionAdapter");
            }
            List<setSimulator> list = setcores.MediaBrowserCompat$CustomActionResultReceiver;
            prepaidTransactionAdapter.read.clear();
            if (list != null) {
                prepaidTransactionAdapter.read.addAll(list);
            }
            prepaidTransactionAdapter.IconCompatParcelizer.write();
            return;
        }
        PrepaidTransactionAdapter prepaidTransactionAdapter2 = this.RatingCompat;
        if (prepaidTransactionAdapter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionAdapter");
        }
        List<setSimulator> list2 = setcores.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            prepaidTransactionAdapter2.read.addAll(list2);
        }
        prepaidTransactionAdapter2.IconCompatParcelizer.write();
    }

    public final void write() {
        PrepaidTransactionAdapter prepaidTransactionAdapter = this.RatingCompat;
        if (prepaidTransactionAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionAdapter");
        }
        prepaidTransactionAdapter.read.clear();
        PrepaidTransactionAdapter prepaidTransactionAdapter2 = this.RatingCompat;
        if (prepaidTransactionAdapter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionAdapter");
        }
        prepaidTransactionAdapter2.IconCompatParcelizer.write();
    }

    public final void MediaDescriptionCompat() {
        Toolbar toolbar = (Toolbar) IconCompatParcelizer(ZHER2K.write.toolbarTxnHeader);
        onGetStartedClick.IconCompatParcelizer((Object) toolbar, "toolbarTxnHeader");
        toolbar.setVisibility(0);
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            MediaBrowserCompat$CustomActionResultReceiver(context);
        }
        TextView textView = (TextView) IconCompatParcelizer(ZHER2K.write.tvMonthHeader);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvMonthHeader");
        textView.setVisibility(0);
        TextView textView2 = (TextView) IconCompatParcelizer(ZHER2K.write.tvMonthHeader);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvMonthHeader");
        textView2.setText(getString(R.string.deposit_detail_filter_this_month));
    }

    public final void read() {
        Toolbar toolbar = (Toolbar) IconCompatParcelizer(ZHER2K.write.toolbarTxnHeader);
        onGetStartedClick.IconCompatParcelizer((Object) toolbar, "toolbarTxnHeader");
        toolbar.MediaBrowserCompat$CustomActionResultReceiver().clear();
        Toolbar toolbar2 = (Toolbar) IconCompatParcelizer(ZHER2K.write.toolbarTxnHeader);
        onGetStartedClick.IconCompatParcelizer((Object) toolbar2, "toolbarTxnHeader");
        toolbar2.setOverflowIcon((Drawable) null);
        TextView textView = (TextView) IconCompatParcelizer(ZHER2K.write.tvMonthHeader);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvMonthHeader");
        textView.setVisibility(8);
    }

    public final void onDestroyView() {
        getAddress1FieldName getaddress1fieldname = this.presenter;
        if (getaddress1fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress1fieldname.onDestroy();
        super.onDestroyView();
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final PrepaidTravelDetailTabFragment MediaBrowserCompat$ItemReceiver(isSimulator issimulator, getModelClass getmodelclass) {
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        onGetStartedClick.write((Object) getmodelclass, "prepaidCardSummaryDisplay");
        PrepaidTravelDetailTabFragment prepaidTravelDetailTabFragment = new PrepaidTravelDetailTabFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_PREPAID_CARD_DISPLAY", issimulator);
        bundle.putParcelable("ARGS_PREPAID_CARD_SUMMARY_DISPLAY", getmodelclass);
        prepaidTravelDetailTabFragment.setArguments(bundle);
        return prepaidTravelDetailTabFragment;
    }
}

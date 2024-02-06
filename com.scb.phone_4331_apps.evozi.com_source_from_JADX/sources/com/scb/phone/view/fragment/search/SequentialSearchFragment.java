package com.scb.phone.view.fragment.search;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.adapter.search.SequentialSearchAdapter;
import com.scb.phone.view.custom.common.ClearableFullWidthEditText;
import com.scb.phone.view.custom.common.CustomNoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.C5184qk;
import p040o.FundFactSheetActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.ServerProjectProvider;
import p040o.WeekPagerAdapter;
import p040o.onGetStartedClick;
import p040o.qk$MediaBrowserCompat$ItemReceiver;
import p040o.setBatteryLevel;
import p040o.setRamUsed;
import p040o.writeUInt64NoTag;

public final class SequentialSearchFragment extends BaseFragment implements ServerProjectProvider.C706414 {
    public static final C6173xc68a8b64 MediaBrowserCompat$CustomActionResultReceiver = new C6173xc68a8b64((byte) 0);
    public WeekPagerAdapter IconCompatParcelizer;
    private SequentialSearchAdapter RatingCompat;
    @HmlPinActivity
    public C5184qk presenter;
    @BindView
    public RecyclerView recyclerView;
    @BindView
    public TextView textSearchHeader;
    @BindView
    public View viewNoItem;
    @BindView
    public ClearableFullWidthEditText viewSearchBox;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r1 != null) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            android.os.Bundle r11 = r10.getArguments()
            if (r11 == 0) goto L_0x00c7
            java.lang.String r0 = "EXTRA_PAGE_ITEM"
            android.os.Parcelable r0 = r11.getParcelable(r0)
            o.setRamUsed r0 = (p040o.setRamUsed) r0
            if (r0 == 0) goto L_0x00c7
            o.qk r1 = r10.presenter
            if (r1 != 0) goto L_0x001c
            java.lang.String r2 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x001c:
            java.lang.String r2 = "EXTRA_SEARCH_TYPE"
            java.io.Serializable r2 = r11.getSerializable(r2)
            if (r2 == 0) goto L_0x00bf
            o.AutoValue_CrashlyticsReport_Session_Event_Log r2 = (p040o.AutoValue_CrashlyticsReport_Session_Event_Log) r2
            java.lang.String r3 = "searchPageItemDisplay"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)
            java.lang.String r3 = "EXTRA_VALUE"
            java.lang.String r4 = ""
            java.lang.String r11 = r11.getString(r3, r4)
            java.lang.String r3 = "args.getString(EXTRA_VALUE, \"\")"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r11, (java.lang.String) r3)
            java.lang.String r3 = "searchType"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)
            java.lang.String r4 = "itemDisplay"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            java.lang.String r4 = "previousValue"
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r4)
            r1.MediaDescriptionCompat = r2
            r1.MediaBrowserCompat$ItemReceiver = r0
            r1.IconCompatParcelizer = r11
            T r11 = r1.RatingCompat
            if (r11 == 0) goto L_0x0053
            r11 = 1
            goto L_0x0054
        L_0x0053:
            r11 = 0
        L_0x0054:
            if (r11 == 0) goto L_0x005b
            T r11 = r1.RatingCompat
            r11.AlertController$RecycleListView()
        L_0x005b:
            o.MapConstraint r4 = r1.MediaMetadataCompat
            o.qk$IconCompatParcelizer r11 = new o.qk$IconCompatParcelizer
            r11.<init>(r1)
            r6 = r11
            o.FundFactSheetActivity r6 = (p040o.FundFactSheetActivity) r6
            o.qk$write r11 = new o.qk$write
            r11.<init>(r1)
            r7 = r11
            o.FundFactSheetActivity r7 = (p040o.FundFactSheetActivity) r7
            o.AutoValue_CrashlyticsReport_Session_Event_Log r11 = r1.MediaDescriptionCompat
            if (r11 != 0) goto L_0x0074
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r3)
        L_0x0074:
            o.setRamUsed r0 = r1.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x007d
            java.lang.String r1 = "searchPageItem"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x007d:
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.read
            if (r1 == 0) goto L_0x008e
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r0 = r0.IconCompatParcelizer
            java.lang.String r5 = "KEY_RESULT"
            r2.put(r5, r0)
            if (r1 == 0) goto L_0x008e
            goto L_0x0093
        L_0x008e:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0093:
            java.lang.String r0 = "onSuccess"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            java.lang.String r0 = "onError"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r3)
            java.lang.String r0 = "mapData"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r0)
            o.AbstractBiMap$ValueSet$1 r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r5 = r0
            o.frequency r5 = (p040o.frequency) r5
            java.lang.String r11 = r11.name()
            o.AbstractBiMap$ValueSet$1$write r0 = new o.AbstractBiMap$ValueSet$1$write
            r0.<init>(r11, r1)
            r8 = r0
            o.getLastInNonemptyList$MediaBrowserCompat$CustomActionResultReceiver r8 = (p040o.C4602xca7af99c) r8
            o.MapConstraint$MediaBrowserCompat$ItemReceiver r11 = p040o.MapConstraint$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer
            r9 = r11
            o.FundFactSheetActivity r9 = (p040o.FundFactSheetActivity) r9
            r4.MediaBrowserCompat$ItemReceiver(r5, r6, r7, r8, r9)
            return
        L_0x00bf:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type com.scb.phone.presentation.model.display.search.SequentialSearchType"
            r11.<init>(r0)
            throw r11
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.search.SequentialSearchFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f89872131494214, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String string;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C5184qk qkVar = this.presenter;
        if (qkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        qkVar.MediaBrowserCompat$ItemReceiver(this);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        this.RatingCompat = new SequentialSearchAdapter(new IconCompatParcelizer(this));
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        SequentialSearchAdapter sequentialSearchAdapter = this.RatingCompat;
        if (sequentialSearchAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        recyclerView2.setAdapter(sequentialSearchAdapter);
        MediaBrowserCompat$CustomActionResultReceiver();
        ClearableFullWidthEditText clearableFullWidthEditText = this.viewSearchBox;
        if (clearableFullWidthEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewSearchBox");
        }
        FundFactSheetActivity sequentialSearchFragment$MediaBrowserCompat$ItemReceiver = new SequentialSearchFragment$MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.write((Object) sequentialSearchFragment$MediaBrowserCompat$ItemReceiver, "f");
        CustomNoteEditText customNoteEditText = clearableFullWidthEditText.inputEditText;
        onGetStartedClick.IconCompatParcelizer((Object) customNoteEditText, "inputEditText");
        sequentialSearchFragment$MediaBrowserCompat$ItemReceiver.invoke(customNoteEditText);
        clearableFullWidthEditText.setEnabledEditTextIcon(true);
        clearableFullWidthEditText.setErrorVisible(false);
        clearableFullWidthEditText.inputEditText.addTextChangedListener(new read(this));
        C5184qk qkVar2 = this.presenter;
        if (qkVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setRamUsed setramused = qkVar2.MediaBrowserCompat$ItemReceiver;
        if (setramused == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchPageItem");
        }
        C5184qk qkVar3 = this.presenter;
        if (qkVar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str3 = qkVar3.IconCompatParcelizer;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("previousValue");
        }
        WeekPagerAdapter weekPagerAdapter = this.IconCompatParcelizer;
        if (weekPagerAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchInterface");
        }
        Context context = getContext();
        String str4 = "";
        if (context == null || (str = context.getString(setramused.MediaMetadataCompat)) == null) {
            str = str4;
        }
        weekPagerAdapter.IconCompatParcelizer(str);
        TextView textView = this.textSearchHeader;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textSearchHeader");
        }
        Context context2 = getContext();
        if (context2 == null || (str2 = context2.getString(setramused.MediaBrowserCompat$CustomActionResultReceiver, new Object[]{str3})) == null) {
            str2 = str4;
        }
        textView.setText(str2);
        ClearableFullWidthEditText clearableFullWidthEditText2 = this.viewSearchBox;
        if (clearableFullWidthEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewSearchBox");
        }
        Context context3 = getContext();
        if (!(context3 == null || (string = context3.getString(setramused.MediaBrowserCompat$ItemReceiver, new Object[]{str3})) == null)) {
            str4 = string;
        }
        clearableFullWidthEditText2.setHint(str4);
        C5184qk qkVar4 = this.presenter;
        if (qkVar4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        qkVar4.write();
    }

    public static final class read implements TextWatcher {
        private /* synthetic */ SequentialSearchFragment write;

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        read(SequentialSearchFragment sequentialSearchFragment) {
            this.write = sequentialSearchFragment;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            List<String> list;
            C5184qk qkVar = this.write.presenter;
            if (qkVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String valueOf = String.valueOf(charSequence);
            onGetStartedClick.write((Object) valueOf, "text");
            qkVar.write = valueOf;
            String str = qkVar.write;
            setBatteryLevel setbatterylevel = qkVar.read;
            List list2 = null;
            boolean z = false;
            if (!(setbatterylevel == null || (list = setbatterylevel.MediaBrowserCompat$CustomActionResultReceiver) == null)) {
                Collection arrayList = new ArrayList();
                for (Object next : list) {
                    String str2 = (String) next;
                    if (str2 != null) {
                        String lowerCase = str2.toLowerCase();
                        onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                        CharSequence charSequence2 = lowerCase;
                        if (str != null) {
                            String lowerCase2 = str.toLowerCase();
                            onGetStartedClick.IconCompatParcelizer((Object) lowerCase2, "(this as java.lang.String).toLowerCase()");
                            if (GoodToKnowActivity.read(charSequence2, lowerCase2, false)) {
                                arrayList.add(next);
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                list2 = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((List) arrayList);
            }
            Collection collection = list2;
            if (collection == null || collection.isEmpty()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = qk$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                if (qkVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(qkVar.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer read = new C5184qk.read(list2);
            if (qkVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                read.IconCompatParcelizer(qkVar.RatingCompat);
            }
        }
    }

    public static final class IconCompatParcelizer implements SequentialSearchAdapter.write {
        private /* synthetic */ SequentialSearchFragment read;

        IconCompatParcelizer(SequentialSearchFragment sequentialSearchFragment) {
            this.read = sequentialSearchFragment;
        }

        public final void write(String str) {
            onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            C5184qk qkVar = this.read.presenter;
            if (qkVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setRamUsed setramused = qkVar.MediaBrowserCompat$ItemReceiver;
            if (setramused == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchPageItem");
            }
            WeekPagerAdapter weekPagerAdapter = this.read.IconCompatParcelizer;
            if (weekPagerAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchInterface");
            }
            weekPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver(setramused.write, setramused.IconCompatParcelizer, str);
        }
    }

    public final void IconCompatParcelizer(List<String> list) {
        onGetStartedClick.write((Object) list, "listItem");
        MediaBrowserCompat$CustomActionResultReceiver();
        SequentialSearchAdapter sequentialSearchAdapter = this.RatingCompat;
        if (sequentialSearchAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        onGetStartedClick.write((Object) list, "listItem");
        sequentialSearchAdapter.read = list;
        sequentialSearchAdapter.IconCompatParcelizer.write();
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver() {
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setVisibility(0);
        View view = this.viewNoItem;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewNoItem");
        }
        view.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        View view = this.viewNoItem;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("viewNoItem");
        }
        view.setVisibility(0);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        recyclerView2.setVisibility(8);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof WeekPagerAdapter) {
            this.IconCompatParcelizer = (WeekPagerAdapter) context;
        }
    }

    public final void onDestroyView() {
        C5184qk qkVar = this.presenter;
        if (qkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        qkVar.onDestroy();
        super.onDestroyView();
    }

    public final void onDetach() {
        WeekPagerAdapter weekPagerAdapter = this.IconCompatParcelizer;
        if (weekPagerAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchInterface");
        }
        C5184qk qkVar = this.presenter;
        if (qkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setRamUsed setramused = qkVar.MediaBrowserCompat$ItemReceiver;
        if (setramused == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("searchPageItem");
        }
        weekPagerAdapter.write(setramused.IconCompatParcelizer);
        super.onDetach();
    }
}

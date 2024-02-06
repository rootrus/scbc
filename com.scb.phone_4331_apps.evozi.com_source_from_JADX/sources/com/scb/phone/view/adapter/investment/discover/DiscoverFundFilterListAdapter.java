package com.scb.phone.view.adapter.investment.discover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import p040o.captureReportData;
import p040o.loadInBackground;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.populateSessionOperatingSystemData;

public final class DiscoverFundFilterListAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    private LayoutInflater MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final loadInBackground MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public populateSessionOperatingSystemData read;
    private ArrayList<Object> write;

    public final class CheckListHolder_ViewBinding implements Unbinder {
        private CheckListHolder MediaBrowserCompat$CustomActionResultReceiver;

        public CheckListHolder_ViewBinding(CheckListHolder checkListHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = checkListHolder;
            checkListHolder.cbRiskLevel = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cbRiskLevel, "field 'cbRiskLevel'", CheckBox.class);
        }

        public final void read() {
            CheckListHolder checkListHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (checkListHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                checkListHolder.cbRiskLevel = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class SubTitleHolder_ViewBinding implements Unbinder {
        private SubTitleHolder write;

        public SubTitleHolder_ViewBinding(SubTitleHolder subTitleHolder, View view) {
            this.write = subTitleHolder;
            subTitleHolder.tvSubTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvSubTitle, "field 'tvSubTitle'", TextView.class);
        }

        public final void read() {
            SubTitleHolder subTitleHolder = this.write;
            if (subTitleHolder != null) {
                this.write = null;
                subTitleHolder.tvSubTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DiscoverFundFilterListAdapter(Context context, populateSessionOperatingSystemData populatesessionoperatingsystemdata, loadInBackground loadinbackground) {
        this.read = populatesessionoperatingsystemdata;
        this.MediaBrowserCompat$SearchResultReceiver = loadinbackground;
        LayoutInflater from = LayoutInflater.from(context);
        onGetStartedClick.IconCompatParcelizer((Object) from, "LayoutInflater.from(context)");
        this.MediaBrowserCompat$ItemReceiver = from;
        ArrayList<Object> arrayList = new ArrayList<>();
        this.write = arrayList;
        populateSessionOperatingSystemData populatesessionoperatingsystemdata2 = this.read;
        if (populatesessionoperatingsystemdata2 != null) {
            String str = populatesessionoperatingsystemdata2.MediaBrowserCompat$ItemReceiver;
            arrayList.add(str == null ? "" : str);
            List<captureReportData> list = populatesessionoperatingsystemdata2.IconCompatParcelizer;
            if (list != null) {
                this.write.addAll(list);
            }
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Object obj = this.write.get(i);
        if (obj instanceof String) {
            return 0;
        }
        if (obj instanceof captureReportData) {
            return 1;
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 1) {
            View inflate = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f90612131494288, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "mInflater.inflate(R.layo…heck_list, parent, false)");
            return new CheckListHolder(this, inflate);
        }
        View inflate2 = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f90632131494290, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate2, "mInflater.inflate(R.layo…_subtitle, parent, false)");
        return new SubTitleHolder(this, inflate2);
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r2 = r2.MediaBrowserCompat$CustomActionResultReceiver;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView.setContentView r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "viewHolder"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            int r0 = r4.MediaBrowserCompat$CustomActionResultReceiver((int) r6)
            java.lang.String r1 = "mData[position]"
            if (r0 != 0) goto L_0x003a
            com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter$SubTitleHolder r5 = (com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter.SubTitleHolder) r5
            android.view.View r0 = r5.write
            butterknife.ButterKnife.IconCompatParcelizer(r5, r0)
            com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter r0 = r5.Keep
            java.util.ArrayList<java.lang.Object> r0 = r0.write
            java.lang.Object r6 = r0.get(r6)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r1)
            if (r6 == 0) goto L_0x0032
            java.lang.String r6 = (java.lang.String) r6
            android.widget.TextView r5 = r5.tvSubTitle
            if (r5 != 0) goto L_0x002c
            java.lang.String r0 = "tvSubTitle"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x002c:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.setText(r6)
            return
        L_0x0032:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            r5.<init>(r6)
            throw r5
        L_0x003a:
            r2 = 1
            if (r0 != r2) goto L_0x009e
            com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter$CheckListHolder r5 = (com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter.CheckListHolder) r5
            android.view.View r0 = r5.write
            butterknife.ButterKnife.IconCompatParcelizer(r5, r0)
            com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter r0 = r5.setHasDecor
            java.util.ArrayList<java.lang.Object> r0 = r0.write
            java.lang.Object r6 = r0.get(r6)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r1)
            if (r6 == 0) goto L_0x0096
            o.captureReportData r6 = (p040o.captureReportData) r6
            android.widget.CheckBox r0 = r5.cbRiskLevel
            java.lang.String r1 = "cbRiskLevel"
            if (r0 != 0) goto L_0x005c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x005c:
            java.lang.String r3 = r6.read
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            r5.Keep = r2
            android.widget.CheckBox r0 = r5.cbRiskLevel
            if (r0 != 0) goto L_0x006c
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x006c:
            com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter r2 = r5.setHasDecor
            o.populateSessionOperatingSystemData r2 = r2.read
            r3 = 0
            if (r2 == 0) goto L_0x007e
            java.util.List<java.lang.String> r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r2 == 0) goto L_0x007e
            java.lang.String r6 = r6.IconCompatParcelizer
            boolean r6 = r2.contains(r6)
            goto L_0x007f
        L_0x007e:
            r6 = r3
        L_0x007f:
            r0.setChecked(r6)
            r5.Keep = r3
            android.widget.CheckBox r6 = r5.cbRiskLevel
            if (r6 != 0) goto L_0x008b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x008b:
            com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter$CheckListHolder$read r0 = new com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter$CheckListHolder$read
            r0.<init>(r5)
            android.widget.CompoundButton$OnCheckedChangeListener r0 = (android.widget.CompoundButton.OnCheckedChangeListener) r0
            r6.setOnCheckedChangeListener(r0)
            return
        L_0x0096:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r6 = "null cannot be cast to non-null type com.scb.phone.presentation.model.display.investment.discover.FundFilterItemDisplay"
            r5.<init>(r6)
            throw r5
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter.MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$setContentView, int):void");
    }

    public final class CheckListHolder extends RecyclerView.setContentView {
        /* access modifiers changed from: package-private */
        public boolean Keep;
        @BindView
        public CheckBox cbRiskLevel;
        final /* synthetic */ DiscoverFundFilterListAdapter setHasDecor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CheckListHolder(DiscoverFundFilterListAdapter discoverFundFilterListAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.setHasDecor = discoverFundFilterListAdapter;
        }

        static final class read implements CompoundButton.OnCheckedChangeListener {
            private /* synthetic */ CheckListHolder MediaBrowserCompat$ItemReceiver;

            read(CheckListHolder checkListHolder) {
                this.MediaBrowserCompat$ItemReceiver = checkListHolder;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i;
                List<String> list;
                if (this.MediaBrowserCompat$ItemReceiver.setHasDecor.MediaBrowserCompat$SearchResultReceiver != null && !this.MediaBrowserCompat$ItemReceiver.Keep) {
                    DiscoverFundFilterListAdapter discoverFundFilterListAdapter = this.MediaBrowserCompat$ItemReceiver.setHasDecor;
                    CheckListHolder checkListHolder = this.MediaBrowserCompat$ItemReceiver;
                    RecyclerView recyclerView = checkListHolder.MediaMetadataCompat;
                    if (recyclerView == null) {
                        i = -1;
                    } else {
                        i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) checkListHolder);
                    }
                    Object IconCompatParcelizer = DiscoverFundFilterListAdapter.IconCompatParcelizer(discoverFundFilterListAdapter, i);
                    if (IconCompatParcelizer != null) {
                        captureReportData capturereportdata = (captureReportData) IconCompatParcelizer;
                        populateSessionOperatingSystemData MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.setHasDecor.read;
                        if (MediaBrowserCompat$CustomActionResultReceiver != null && (list = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) != null) {
                            if (z) {
                                if (!list.contains(capturereportdata.IconCompatParcelizer)) {
                                    list.add(capturereportdata.IconCompatParcelizer);
                                }
                            } else if (list.contains(capturereportdata.IconCompatParcelizer)) {
                                list.remove(capturereportdata.IconCompatParcelizer);
                            }
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.investment.discover.FundFilterItemDisplay");
                    }
                }
            }
        }
    }

    public final class SubTitleHolder extends RecyclerView.setContentView {
        final /* synthetic */ DiscoverFundFilterListAdapter Keep;
        @BindView
        public TextView tvSubTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SubTitleHolder(DiscoverFundFilterListAdapter discoverFundFilterListAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.Keep = discoverFundFilterListAdapter;
        }
    }

    public static final /* synthetic */ Object IconCompatParcelizer(DiscoverFundFilterListAdapter discoverFundFilterListAdapter, int i) {
        Object obj = discoverFundFilterListAdapter.write.get(i);
        onGetStartedClick.IconCompatParcelizer(obj, "mData[position]");
        return obj;
    }
}

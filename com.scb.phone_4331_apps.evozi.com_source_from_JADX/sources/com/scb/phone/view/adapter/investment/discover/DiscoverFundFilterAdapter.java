package com.scb.phone.view.adapter.investment.discover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindBulkTransferReviewFragment;
import p040o.captureEventData;
import p040o.captureReportData;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.populateFramesList;
import p040o.populateSessionApplicationData;
import p040o.populateSignalData;

public final class DiscoverFundFilterAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    private final populateFramesList MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final FragmentBuilder_BindBulkTransferReviewFragment RatingCompat;
    public captureEventData read;
    private ArrayList<Object> write = new ArrayList<>();

    public enum write {
        TYPE_OF_FUNDS,
        BROKERS
    }

    public final class CheckListHolder_ViewBinding implements Unbinder {
        private CheckListHolder MediaBrowserCompat$ItemReceiver;

        public CheckListHolder_ViewBinding(CheckListHolder checkListHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = checkListHolder;
            checkListHolder.cbRiskLevel = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cbRiskLevel, "field 'cbRiskLevel'", CheckBox.class);
        }

        public final void read() {
            CheckListHolder checkListHolder = this.MediaBrowserCompat$ItemReceiver;
            if (checkListHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                checkListHolder.cbRiskLevel = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class SubTitleHolder_ViewBinding implements Unbinder {
        private SubTitleHolder MediaBrowserCompat$CustomActionResultReceiver;

        public SubTitleHolder_ViewBinding(SubTitleHolder subTitleHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = subTitleHolder;
            subTitleHolder.tvSubTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvSubTitle, "field 'tvSubTitle'", TextView.class);
        }

        public final void read() {
            SubTitleHolder subTitleHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (subTitleHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                subTitleHolder.tvSubTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class SelectListHolder_ViewBinding implements Unbinder {
        private SelectListHolder MediaBrowserCompat$CustomActionResultReceiver;

        public SelectListHolder_ViewBinding(SelectListHolder selectListHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = selectListHolder;
            selectListHolder.tvSelectList = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvSelectList, "field 'tvSelectList'", TextView.class);
            selectListHolder.layoutSelectListContainer = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutSelectListContainer, "field 'layoutSelectListContainer'", ViewGroup.class);
        }

        public final void read() {
            SelectListHolder selectListHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (selectListHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                selectListHolder.tvSelectList = null;
                selectListHolder.layoutSelectListContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DiscoverFundFilterAdapter(populateFramesList populateframeslist, captureEventData captureeventdata, FragmentBuilder_BindBulkTransferReviewFragment fragmentBuilder_BindBulkTransferReviewFragment) {
        this.MediaBrowserCompat$ItemReceiver = populateframeslist;
        this.read = captureeventdata;
        this.RatingCompat = fragmentBuilder_BindBulkTransferReviewFragment;
        write();
    }

    public final void write() {
        populateSessionApplicationData populatesessionapplicationdata;
        List<String> list;
        populateSignalData populatesignaldata;
        populateSignalData populatesignaldata2;
        List<String> list2;
        this.write = new ArrayList<>();
        populateFramesList populateframeslist = this.MediaBrowserCompat$ItemReceiver;
        List<String> list3 = null;
        boolean z = true;
        if (!(populateframeslist == null || (populatesignaldata2 = populateframeslist.write) == null)) {
            Collection collection = populatesignaldata2.read;
            if (!(collection == null || collection.isEmpty())) {
                this.write.add(new IconCompatParcelizer(populatesignaldata2.IconCompatParcelizer));
                ArrayList<Object> arrayList = this.write;
                write write2 = write.TYPE_OF_FUNDS;
                captureEventData captureeventdata = this.read;
                if (captureeventdata != null) {
                    list2 = captureeventdata.write;
                } else {
                    list2 = null;
                }
                arrayList.add(new C5760x53b8e5b6(write2, populatesignaldata2, list2));
            }
        }
        populateFramesList populateframeslist2 = this.MediaBrowserCompat$ItemReceiver;
        if (!(populateframeslist2 == null || (populatesignaldata = populateframeslist2.MediaBrowserCompat$ItemReceiver) == null)) {
            Collection collection2 = populatesignaldata.read;
            if (!(collection2 == null || collection2.isEmpty())) {
                this.write.add(new IconCompatParcelizer(populatesignaldata.IconCompatParcelizer));
                ArrayList<Object> arrayList2 = this.write;
                write write3 = write.BROKERS;
                captureEventData captureeventdata2 = this.read;
                if (captureeventdata2 != null) {
                    list3 = captureeventdata2.MediaBrowserCompat$CustomActionResultReceiver;
                }
                arrayList2.add(new C5760x53b8e5b6(write3, populatesignaldata, list3));
            }
        }
        populateFramesList populateframeslist3 = this.MediaBrowserCompat$ItemReceiver;
        if (populateframeslist3 != null && (populatesessionapplicationdata = populateframeslist3.read) != null) {
            Collection collection3 = populatesessionapplicationdata.IconCompatParcelizer;
            if (collection3 != null && !collection3.isEmpty()) {
                z = false;
            }
            if (!z) {
                this.write.add(new IconCompatParcelizer(populatesessionapplicationdata.write));
                List<captureReportData> list4 = populatesessionapplicationdata.IconCompatParcelizer;
                if (list4 != null) {
                    for (captureReportData capturereportdata : list4) {
                        captureEventData captureeventdata3 = this.read;
                        this.write.add(new read(capturereportdata, (captureeventdata3 == null || (list = captureeventdata3.MediaBrowserCompat$ItemReceiver) == null) ? false : list.contains(capturereportdata.IconCompatParcelizer)));
                    }
                }
            }
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        Object obj = this.write.get(i);
        if (obj instanceof IconCompatParcelizer) {
            return 1;
        }
        if (obj instanceof C5760x53b8e5b6) {
            return 2;
        }
        if (obj instanceof read) {
            return 3;
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        onGetStartedClick.IconCompatParcelizer((Object) from, "LayoutInflater.from(parent.context)");
        if (i == 2) {
            View inflate = from.inflate(R.layout.f90622131494289, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "mInflater.inflate(R.layo…lect_list, parent, false)");
            return new SelectListHolder(this, inflate);
        } else if (i != 3) {
            View inflate2 = from.inflate(R.layout.f90632131494290, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate2, "mInflater.inflate(R.layo…_subtitle, parent, false)");
            return new SubTitleHolder(this, inflate2);
        } else {
            View inflate3 = from.inflate(R.layout.f90612131494288, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate3, "mInflater.inflate(R.layo…heck_list, parent, false)");
            return new CheckListHolder(this, inflate3);
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        onGetStartedClick.write((Object) setcontentview, "viewHolder");
        int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i);
        if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
            SubTitleHolder subTitleHolder = (SubTitleHolder) setcontentview;
            ButterKnife.IconCompatParcelizer(subTitleHolder, subTitleHolder.write);
            Object obj = subTitleHolder.setHasDecor.write.get(i);
            onGetStartedClick.IconCompatParcelizer(obj, "mData[position]");
            if (obj != null) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                TextView textView = subTitleHolder.tvSubTitle;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSubTitle");
                }
                textView.setText(iconCompatParcelizer.IconCompatParcelizer);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter.SubTitleObject");
        } else if (MediaBrowserCompat$CustomActionResultReceiver == 2) {
            SelectListHolder selectListHolder = (SelectListHolder) setcontentview;
            ButterKnife.IconCompatParcelizer(selectListHolder, selectListHolder.write);
            Object obj2 = selectListHolder.setHasDecor.write.get(i);
            onGetStartedClick.IconCompatParcelizer(obj2, "mData[position]");
            if (obj2 != null) {
                C5760x53b8e5b6 discoverFundFilterAdapter$MediaBrowserCompat$CustomActionResultReceiver = (C5760x53b8e5b6) obj2;
                List<String> list = discoverFundFilterAdapter$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                populateSignalData populatesignaldata = discoverFundFilterAdapter$MediaBrowserCompat$CustomActionResultReceiver.read;
                if (i2 > 0) {
                    View view = selectListHolder.write;
                    onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
                    Context context = view.getContext();
                    if (context != null) {
                        String string = context.getString(R.string.investment_discover_items_selected, new Object[]{Integer.valueOf(i2)});
                        onGetStartedClick.IconCompatParcelizer((Object) string, "ctx.getString(R.string.i…ems_selected, selectSize)");
                        TextView textView2 = selectListHolder.tvSelectList;
                        if (textView2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSelectList");
                        }
                        textView2.setText(string);
                    }
                } else {
                    TextView textView3 = selectListHolder.tvSelectList;
                    if (textView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSelectList");
                    }
                    textView3.setText("");
                }
                TextView textView4 = selectListHolder.tvSelectList;
                if (textView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSelectList");
                }
                textView4.setHint(populatesignaldata.MediaBrowserCompat$ItemReceiver);
                ViewGroup viewGroup = selectListHolder.layoutSelectListContainer;
                if (viewGroup == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSelectListContainer");
                }
                viewGroup.setOnClickListener(new C5761xa64de9d(selectListHolder));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter.SelectListObject");
        } else if (MediaBrowserCompat$CustomActionResultReceiver == 3) {
            CheckListHolder checkListHolder = (CheckListHolder) setcontentview;
            ButterKnife.IconCompatParcelizer(checkListHolder, checkListHolder.write);
            Object obj3 = checkListHolder.Keep.write.get(i);
            onGetStartedClick.IconCompatParcelizer(obj3, "mData[position]");
            if (obj3 != null) {
                read read2 = (read) obj3;
                CheckBox checkBox = checkListHolder.cbRiskLevel;
                if (checkBox == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbRiskLevel");
                }
                checkBox.setText(read2.MediaBrowserCompat$ItemReceiver.read);
                checkListHolder.AlertController$RecycleListView = true;
                CheckBox checkBox2 = checkListHolder.cbRiskLevel;
                if (checkBox2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbRiskLevel");
                }
                checkBox2.setChecked(read2.IconCompatParcelizer);
                checkListHolder.AlertController$RecycleListView = false;
                CheckBox checkBox3 = checkListHolder.cbRiskLevel;
                if (checkBox3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("cbRiskLevel");
                }
                checkBox3.setOnCheckedChangeListener(new C5759x2c9a8f53(checkListHolder));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterAdapter.CheckboxListObject");
        }
    }

    public final class SelectListHolder extends RecyclerView.setContentView {
        @BindView
        public ViewGroup layoutSelectListContainer;
        final /* synthetic */ DiscoverFundFilterAdapter setHasDecor;
        @BindView
        public TextView tvSelectList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SelectListHolder(DiscoverFundFilterAdapter discoverFundFilterAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.setHasDecor = discoverFundFilterAdapter;
        }
    }

    public final class CheckListHolder extends RecyclerView.setContentView {
        /* access modifiers changed from: package-private */
        public boolean AlertController$RecycleListView;
        final /* synthetic */ DiscoverFundFilterAdapter Keep;
        @BindView
        public CheckBox cbRiskLevel;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CheckListHolder(DiscoverFundFilterAdapter discoverFundFilterAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.Keep = discoverFundFilterAdapter;
        }
    }

    public final class SubTitleHolder extends RecyclerView.setContentView {
        final /* synthetic */ DiscoverFundFilterAdapter setHasDecor;
        @BindView
        public TextView tvSubTitle;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SubTitleHolder(DiscoverFundFilterAdapter discoverFundFilterAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.setHasDecor = discoverFundFilterAdapter;
        }
    }

    public final class read {
        final boolean IconCompatParcelizer;
        final captureReportData MediaBrowserCompat$ItemReceiver;

        public read(captureReportData capturereportdata, boolean z) {
            onGetStartedClick.write((Object) capturereportdata, "checkboxDisplay");
            this.MediaBrowserCompat$ItemReceiver = capturereportdata;
            this.IconCompatParcelizer = z;
        }
    }

    public final class IconCompatParcelizer {
        final String IconCompatParcelizer;

        public IconCompatParcelizer(String str) {
            onGetStartedClick.write((Object) str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.IconCompatParcelizer = str;
        }
    }

    public static final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(DiscoverFundFilterAdapter discoverFundFilterAdapter, int i) {
        Object obj = discoverFundFilterAdapter.write.get(i);
        onGetStartedClick.IconCompatParcelizer(obj, "mData[position]");
        return obj;
    }
}

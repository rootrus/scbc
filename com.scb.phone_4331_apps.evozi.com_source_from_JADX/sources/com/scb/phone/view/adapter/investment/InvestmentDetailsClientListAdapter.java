package com.scb.phone.view.adapter.investment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import java.util.ArrayList;
import java.util.List;
import p040o.ExecutorUtils;
import p040o.FileBackedNativeSessionFile;
import p040o.FragmentBuilder_BindCalendarFragment;
import p040o.buildSingleThreadExecutorService;
import p040o.createAndStoreIid;
import p040o.formatId;
import p040o.generateTokenForDeejungTransfer;
import p040o.getNamedThreadFactory;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateSPMV;

public final class InvestmentDetailsClientListAdapter extends BaseExpandableRecycleViewAdapter {
    public FragmentBuilder_BindCalendarFragment MediaBrowserCompat$ItemReceiver;
    public List<buildSingleThreadExecutorService> read = new ArrayList();

    public class ExpandableChildViewHolder_ViewBinding implements Unbinder {
        private ExpandableChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ExpandableChildViewHolder_ViewBinding(ExpandableChildViewHolder expandableChildViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = expandableChildViewHolder;
            expandableChildViewHolder.textFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_fund_code, "field 'textFundCode'", TextView.class);
            expandableChildViewHolder.textBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_balance, "field 'textBalance'", TextView.class);
            expandableChildViewHolder.textNav = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_nav, "field 'textNav'", TextView.class);
            expandableChildViewHolder.textGain = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_gain, "field 'textGain'", TextView.class);
        }

        public final void read() {
            ExpandableChildViewHolder expandableChildViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (expandableChildViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                expandableChildViewHolder.textFundCode = null;
                expandableChildViewHolder.textBalance = null;
                expandableChildViewHolder.textNav = null;
                expandableChildViewHolder.textGain = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ExpandableGroupViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private ExpandableGroupViewHolder IconCompatParcelizer;

        public ExpandableGroupViewHolder_ViewBinding(ExpandableGroupViewHolder expandableGroupViewHolder, View view) {
            super(expandableGroupViewHolder, view);
            this.IconCompatParcelizer = expandableGroupViewHolder;
            expandableGroupViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            expandableGroupViewHolder.textSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'textSubtitle'", TextView.class);
            expandableGroupViewHolder.textNumberOfFunds = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_number_of_funds, "field 'textNumberOfFunds'", TextView.class);
            expandableGroupViewHolder.textTax = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_tax_indicator, "field 'textTax'", TextView.class);
        }

        public final void read() {
            ExpandableGroupViewHolder expandableGroupViewHolder = this.IconCompatParcelizer;
            if (expandableGroupViewHolder != null) {
                this.IconCompatParcelizer = null;
                expandableGroupViewHolder.textTitle = null;
                expandableGroupViewHolder.textSubtitle = null;
                expandableGroupViewHolder.textNumberOfFunds = null;
                expandableGroupViewHolder.textTax = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class FooterViewHolder_ViewBinding implements Unbinder {
        private FooterViewHolder write;

        public FooterViewHolder_ViewBinding(FooterViewHolder footerViewHolder, View view) {
            this.write = footerViewHolder;
            footerViewHolder.textBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_balance, "field 'textBalance'", TextView.class);
            footerViewHolder.textGain = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_gain, "field 'textGain'", TextView.class);
        }

        public final void read() {
            FooterViewHolder footerViewHolder = this.write;
            if (footerViewHolder != null) {
                this.write = null;
                footerViewHolder.textBalance = null;
                footerViewHolder.textGain = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class NoFundViewHolder_ViewBinding implements Unbinder {
        private NoFundViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public NoFundViewHolder_ViewBinding(NoFundViewHolder noFundViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = noFundViewHolder;
            noFundViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            noFundViewHolder.textSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'textSubtitle'", TextView.class);
            noFundViewHolder.textNumberOfFunds = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_number_of_funds, "field 'textNumberOfFunds'", TextView.class);
            noFundViewHolder.textTax = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_tax_indicator, "field 'textTax'", TextView.class);
        }

        public final void read() {
            NoFundViewHolder noFundViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (noFundViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                noFundViewHolder.textTitle = null;
                noFundViewHolder.textSubtitle = null;
                noFundViewHolder.textNumberOfFunds = null;
                noFundViewHolder.textTax = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class SingleViewHolder_ViewBinding implements Unbinder {
        private SingleViewHolder IconCompatParcelizer;

        public SingleViewHolder_ViewBinding(SingleViewHolder singleViewHolder, View view) {
            this.IconCompatParcelizer = singleViewHolder;
            singleViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            singleViewHolder.textSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'textSubtitle'", TextView.class);
            singleViewHolder.textNumberOfFunds = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_number_of_funds, "field 'textNumberOfFunds'", TextView.class);
            singleViewHolder.textTax = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_tax_indicator, "field 'textTax'", TextView.class);
            singleViewHolder.textFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_fund_code, "field 'textFundCode'", TextView.class);
            singleViewHolder.textBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_balance, "field 'textBalance'", TextView.class);
            singleViewHolder.textNav = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_nav, "field 'textNav'", TextView.class);
            singleViewHolder.textGain = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_gain, "field 'textGain'", TextView.class);
        }

        public final void read() {
            SingleViewHolder singleViewHolder = this.IconCompatParcelizer;
            if (singleViewHolder != null) {
                this.IconCompatParcelizer = null;
                singleViewHolder.textTitle = null;
                singleViewHolder.textSubtitle = null;
                singleViewHolder.textNumberOfFunds = null;
                singleViewHolder.textTax = null;
                singleViewHolder.textFundCode = null;
                singleViewHolder.textBalance = null;
                singleViewHolder.textNav = null;
                singleViewHolder.textGain = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public InvestmentDetailsClientListAdapter(Context context) {
        super(context);
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.read.size();
    }

    public final int read(int i) {
        buildSingleThreadExecutorService buildsinglethreadexecutorservice = this.read.get(i);
        if (buildsinglethreadexecutorservice instanceof getNamedThreadFactory) {
            return ((getNamedThreadFactory) buildsinglethreadexecutorservice).write.size();
        }
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int MediaMetadataCompat(int r7) {
        /*
            r6 = this;
            java.util.List<o.buildSingleThreadExecutorService> r0 = r6.read
            java.lang.Object r7 = r0.get(r7)
            o.buildSingleThreadExecutorService r7 = (p040o.buildSingleThreadExecutorService) r7
            java.lang.String r7 = r7.read
            int r0 = r7.hashCode()
            r1 = 0
            r2 = -1
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1966638998: goto L_0x0035;
                case -1600043241: goto L_0x002b;
                case 1141682019: goto L_0x0021;
                case 1983169940: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x003f
        L_0x0017:
            java.lang.String r0 = "MY_FUNDS_GROUP_VIEW_TYPE_NO_FUND"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r3
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "MY_FUNDS_VIEW_TYPE_EXPANDABLE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r1
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "MY_FUNDS_GROUP_VIEW_TYPE_SINGLE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r4
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "MY_FUNDS_GROUP_VIEW_TYPE_FOOTER"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x003f
            r7 = r5
            goto L_0x0040
        L_0x003f:
            r7 = r2
        L_0x0040:
            if (r7 == 0) goto L_0x004c
            if (r7 == r5) goto L_0x004b
            if (r7 == r3) goto L_0x004a
            if (r7 == r4) goto L_0x0049
            return r2
        L_0x0049:
            return r4
        L_0x004a:
            return r3
        L_0x004b:
            return r5
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter.MediaMetadataCompat(int):int");
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new ExpandableGroupViewHolder(from.inflate(R.layout.f83402131493566, viewGroup, false));
        }
        if (i == 1) {
            return new FooterViewHolder(from.inflate(R.layout.f83412131493567, viewGroup, false));
        }
        if (i == 2) {
            return new NoFundViewHolder(from.inflate(R.layout.f83432131493569, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new SingleViewHolder(from.inflate(R.layout.f83442131493570, viewGroup, false));
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ExpandableChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83392131493565, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        buildSingleThreadExecutorService buildsinglethreadexecutorservice = this.read.get(i);
        if ((buildsinglethreadexecutorservice instanceof getNamedThreadFactory) && (setcontentview instanceof ExpandableGroupViewHolder)) {
            ExpandableGroupViewHolder expandableGroupViewHolder = (ExpandableGroupViewHolder) setcontentview;
            createAndStoreIid createandstoreiid = ((getNamedThreadFactory) buildsinglethreadexecutorservice).IconCompatParcelizer;
            expandableGroupViewHolder.textTitle.setText(createandstoreiid.read);
            expandableGroupViewHolder.textSubtitle.setText(createandstoreiid.write);
            expandableGroupViewHolder.textNumberOfFunds.setText(createandstoreiid.MediaBrowserCompat$CustomActionResultReceiver);
            expandableGroupViewHolder.textTax.setText(createandstoreiid.IconCompatParcelizer);
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(expandableGroupViewHolder);
        } else if ((buildsinglethreadexecutorservice instanceof formatId) && (setcontentview instanceof FooterViewHolder)) {
            FooterViewHolder footerViewHolder = (FooterViewHolder) setcontentview;
            formatId formatid = (formatId) buildsinglethreadexecutorservice;
            int read2 = setLastBaselineToBottomHeight.read(footerViewHolder.write.getContext(), formatid.MediaBrowserCompat$ItemReceiver);
            footerViewHolder.textBalance.setText(formatid.IconCompatParcelizer);
            footerViewHolder.textBalance.setCompoundDrawablesWithIntrinsicBounds(formatid.MediaBrowserCompat$CustomActionResultReceiver, 0, 0, 0);
            footerViewHolder.textGain.setText(formatid.write);
            footerViewHolder.textGain.setTextColor(read2);
        } else if ((buildsinglethreadexecutorservice instanceof ExecutorUtils.C33402) && (setcontentview instanceof SingleViewHolder)) {
            SingleViewHolder singleViewHolder = (SingleViewHolder) setcontentview;
            ExecutorUtils.C33402 r2 = (ExecutorUtils.C33402) buildsinglethreadexecutorservice;
            createAndStoreIid createandstoreiid2 = r2.write;
            ExecutorUtils executorUtils = r2.MediaBrowserCompat$ItemReceiver;
            singleViewHolder.textTitle.setText(createandstoreiid2.read);
            singleViewHolder.textSubtitle.setText(createandstoreiid2.write);
            singleViewHolder.textNumberOfFunds.setText(createandstoreiid2.MediaBrowserCompat$CustomActionResultReceiver);
            singleViewHolder.textTax.setText(createandstoreiid2.IconCompatParcelizer);
            int read3 = setLastBaselineToBottomHeight.read(singleViewHolder.write.getContext(), executorUtils.write);
            singleViewHolder.textFundCode.setText(executorUtils.MediaBrowserCompat$CustomActionResultReceiver);
            singleViewHolder.textBalance.setText(executorUtils.MediaBrowserCompat$ItemReceiver);
            singleViewHolder.textBalance.setCompoundDrawablesWithIntrinsicBounds(executorUtils.read, 0, 0, 0);
            singleViewHolder.textNav.setText(executorUtils.MediaBrowserCompat$MediaItem);
            singleViewHolder.textGain.setText(executorUtils.IconCompatParcelizer);
            singleViewHolder.textGain.setTextColor(read3);
            setcontentview.write.setOnClickListener(new generateTokenForDeejungTransfer(this, buildsinglethreadexecutorservice));
        } else if ((buildsinglethreadexecutorservice instanceof FileBackedNativeSessionFile) && (setcontentview instanceof NoFundViewHolder)) {
            NoFundViewHolder noFundViewHolder = (NoFundViewHolder) setcontentview;
            FileBackedNativeSessionFile fileBackedNativeSessionFile = (FileBackedNativeSessionFile) buildsinglethreadexecutorservice;
            noFundViewHolder.textTitle.setText(fileBackedNativeSessionFile.write);
            noFundViewHolder.textSubtitle.setText(fileBackedNativeSessionFile.MediaBrowserCompat$ItemReceiver);
            noFundViewHolder.textNumberOfFunds.setText(fileBackedNativeSessionFile.MediaBrowserCompat$CustomActionResultReceiver);
            noFundViewHolder.textTax.setText(fileBackedNativeSessionFile.IconCompatParcelizer);
        }
    }

    class ExpandableGroupViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        TextView textNumberOfFunds;
        @BindView
        TextView textSubtitle;
        @BindView
        TextView textTax;
        @BindView
        TextView textTitle;

        ExpandableGroupViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.expandedDiamond = null;
            this.expandedLine = null;
        }
    }

    class NoFundViewHolder extends validateSPMV {
        @BindView
        TextView textNumberOfFunds;
        @BindView
        TextView textSubtitle;
        @BindView
        TextView textTax;
        @BindView
        TextView textTitle;

        NoFundViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    class ExpandableChildViewHolder extends validateSPMV {
        @BindView
        TextView textBalance;
        @BindView
        TextView textFundCode;
        @BindView
        TextView textGain;
        @BindView
        TextView textNav;

        ExpandableChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    class SingleViewHolder extends validateSPMV {
        @BindView
        TextView textBalance;
        @BindView
        TextView textFundCode;
        @BindView
        TextView textGain;
        @BindView
        TextView textNav;
        @BindView
        TextView textNumberOfFunds;
        @BindView
        TextView textSubtitle;
        @BindView
        TextView textTax;
        @BindView
        TextView textTitle;

        SingleViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    class FooterViewHolder extends validateSPMV {
        @BindView
        TextView textBalance;
        @BindView
        TextView textGain;

        FooterViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(androidx.recyclerview.widget.RecyclerView.setContentView r4, int r5, int r6) {
        /*
            r3 = this;
            java.util.List<o.buildSingleThreadExecutorService> r0 = r3.read
            java.lang.Object r0 = r0.get(r5)
            o.buildSingleThreadExecutorService r0 = (p040o.buildSingleThreadExecutorService) r0
            boolean r1 = r0 instanceof p040o.getNamedThreadFactory
            if (r1 == 0) goto L_0x001d
            o.getNamedThreadFactory r0 = (p040o.getNamedThreadFactory) r0
            java.util.List<o.ExecutorUtils$1$1> r0 = r0.write
            int r1 = r0.size()
            if (r6 >= r1) goto L_0x001d
            java.lang.Object r0 = r0.get(r6)
            o.ExecutorUtils$1$1 r0 = (p040o.ExecutorUtils.C33371.C33381) r0
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0067
            boolean r1 = r4 instanceof com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter.ExpandableChildViewHolder
            if (r1 == 0) goto L_0x0067
            android.view.View r1 = r4.write
            o.getAmortizationList r2 = new o.getAmortizationList
            r2.<init>(r3, r6, r5)
            r1.setOnClickListener(r2)
            com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter$ExpandableChildViewHolder r4 = (com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter.ExpandableChildViewHolder) r4
            o.ExecutorUtils r5 = r0.write
            android.view.View r6 = r4.write
            android.content.Context r6 = r6.getContext()
            int r0 = r5.write
            int r6 = p040o.setLastBaselineToBottomHeight.read(r6, r0)
            android.widget.TextView r0 = r4.textFundCode
            java.lang.String r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            r0.setText(r1)
            android.widget.TextView r0 = r4.textBalance
            java.lang.String r1 = r5.MediaBrowserCompat$ItemReceiver
            r0.setText(r1)
            android.widget.TextView r0 = r4.textBalance
            int r1 = r5.read
            r2 = 0
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r2, r2)
            android.widget.TextView r0 = r4.textNav
            java.lang.String r1 = r5.MediaBrowserCompat$MediaItem
            r0.setText(r1)
            android.widget.TextView r0 = r4.textGain
            java.lang.String r5 = r5.IconCompatParcelizer
            r0.setText(r5)
            android.widget.TextView r4 = r4.textGain
            r4.setTextColor(r6)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter.write(androidx.recyclerview.widget.RecyclerView$setContentView, int, int):void");
    }
}

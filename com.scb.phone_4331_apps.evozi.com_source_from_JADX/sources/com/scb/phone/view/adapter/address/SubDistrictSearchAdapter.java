package com.scb.phone.view.adapter.address;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.CrashlyticsReportJsonTransform$$Lambda$8;
import p040o.EasycashLoanTrackRepositoryModule;
import p040o.addDelayedShutdownHook;
import p040o.onStart;

public final class SubDistrictSearchAdapter extends RecyclerView.IconCompatParcelizer<ViewHolder> {
    public SubDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private CrashlyticsReportJsonTransform$$Lambda$8 read;
    public List<addDelayedShutdownHook> write;

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder MediaBrowserCompat$ItemReceiver;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = viewHolder;
            viewHolder.subDistrictText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_district_text, "field 'subDistrictText'", TextView.class);
        }

        public final void read() {
            ViewHolder viewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (viewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                viewHolder.subDistrictText = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        ViewHolder viewHolder = (ViewHolder) setcontentview;
        if (i < this.write.size()) {
            addDelayedShutdownHook adddelayedshutdownhook = this.write.get(i);
            int i2 = C57274.read[this.read.ordinal()];
            if (i2 == 1) {
                str = adddelayedshutdownhook.RatingCompat;
            } else if (i2 == 2) {
                str = adddelayedshutdownhook.read;
            } else if (i2 != 3) {
                str = i2 != 4 ? "" : adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                str = adddelayedshutdownhook.MediaDescriptionCompat;
            }
            viewHolder.subDistrictText.setText(str);
            viewHolder.write.setOnClickListener(new EasycashLoanTrackRepositoryModule(this, i));
        }
    }

    public SubDistrictSearchAdapter(List<addDelayedShutdownHook> list, CrashlyticsReportJsonTransform$$Lambda$8 crashlyticsReportJsonTransform$$Lambda$8) {
        this.write = list;
        this.read = crashlyticsReportJsonTransform$$Lambda$8;
    }

    /* renamed from: com.scb.phone.view.adapter.address.SubDistrictSearchAdapter$4 */
    static /* synthetic */ class C57274 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.CrashlyticsReportJsonTransform$$Lambda$8[] r0 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.PROVINCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.DISTRICT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.SUB_DISTRICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.POSTAL_CODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.address.SubDistrictSearchAdapter.C57274.<clinit>():void");
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    static class ViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView subDistrictText;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84902131493717, viewGroup, false));
    }
}

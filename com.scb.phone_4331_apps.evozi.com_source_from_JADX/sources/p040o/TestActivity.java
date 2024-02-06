package p040o;

import android.text.Spannable;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import java.util.ArrayList;
import p040o.TestActivity.read;

/* renamed from: o.TestActivity */
public abstract class TestActivity<T, VH extends read<T>> extends RecyclerView.IconCompatParcelizer<VH> {
    public TestActivity$MediaBrowserCompat$ItemReceiver<? super T> MediaBrowserCompat$ItemReceiver;
    public String read = "";
    public ArrayList<T> write = new ArrayList<>();

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        read read2 = (read) setcontentview;
        onGetStartedClick.write((Object) read2, "holder");
        read2.write(this.write.get(i), this.read, this.MediaBrowserCompat$ItemReceiver);
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    /* renamed from: o.TestActivity$read */
    public static abstract class read<T> extends RecyclerView.setContentView implements FragmentBuilder_BindEBillPaymentBillerListFragment {
        public abstract void write(T t, String str, TestActivity$MediaBrowserCompat$ItemReceiver<? super T> testActivity$MediaBrowserCompat$ItemReceiver);

        public final Spannable MediaBrowserCompat$ItemReceiver(String str, String str2, int i, MetricAffectingSpan metricAffectingSpan) {
            onGetStartedClick.write((Object) str, "fullWord");
            onGetStartedClick.write((Object) str2, "highlightWord");
            return C6504x8d64215a.MediaBrowserCompat$CustomActionResultReceiver(str, str2, i, (MetricAffectingSpan) null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82342131493460, viewGroup, false));
            onGetStartedClick.write((Object) viewGroup, "parent");
        }
    }
}

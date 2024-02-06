package p040o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import java.util.List;
import kotlin.TypeCastException;
import p040o.onNotNowClick;

/* renamed from: o.getOprRenew */
public final class getOprRenew extends RecyclerView.IconCompatParcelizer<read> {
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$ItemReceiver = -1;
    private final List<immediateCheckedFuture> read;
    /* access modifiers changed from: private */
    public final getOprRenew$MediaBrowserCompat$CustomActionResultReceiver write;

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81652131493391, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…osit_list, parent, false)");
        return new read(inflate);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        read read2 = (read) setcontentview;
        onGetStartedClick.write((Object) read2, "holder");
        onNotNowClick.read read3 = new onNotNowClick.read();
        read3.MediaBrowserCompat$ItemReceiver = (immediateCheckedFuture) this.read.get(i);
        boolean z = true;
        int i2 = 0;
        read2.AlertController$RecycleListView.setChecked(this.MediaBrowserCompat$ItemReceiver == i);
        read2.setHasDecor.setText(((immediateCheckedFuture) read3.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver);
        read2.setBackgroundResource.setText(((immediateCheckedFuture) read3.MediaBrowserCompat$ItemReceiver).AppCompatDialogFragment);
        read2.Keep.setText(((immediateCheckedFuture) read3.MediaBrowserCompat$ItemReceiver).PlaybackStateCompat);
        TextView textView = read2.Keep;
        CharSequence charSequence = ((immediateCheckedFuture) read3.MediaBrowserCompat$ItemReceiver).PlaybackStateCompat;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        read2.PlaybackStateCompat.setOnClickListener(new getOprRenew$MediaBrowserCompat$ItemReceiver(this, i, read3));
    }

    public getOprRenew(List<? extends immediateCheckedFuture> list, getOprRenew$MediaBrowserCompat$CustomActionResultReceiver getoprrenew_mediabrowsercompat_customactionresultreceiver) {
        onGetStartedClick.write((Object) list, "listDepositDisplay");
        onGetStartedClick.write((Object) getoprrenew_mediabrowsercompat_customactionresultreceiver, "onSelectListener");
        this.read = list;
        this.write = getoprrenew_mediabrowsercompat_customactionresultreceiver;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    /* renamed from: o.getOprRenew$read */
    public static final class read extends RecyclerView.setContentView {
        final RadioButton AlertController$RecycleListView;
        final TextView Keep;
        final RelativeLayout PlaybackStateCompat;
        final TextView setBackgroundResource;
        final TextView setHasDecor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.root_view);
            if (relativeLayout != null) {
                this.PlaybackStateCompat = relativeLayout;
                RadioButton radioButton = (RadioButton) view.findViewById(R.id.radio_button);
                if (radioButton != null) {
                    this.AlertController$RecycleListView = radioButton;
                    TextView textView = (TextView) view.findViewById(R.id.deposit_number);
                    if (textView != null) {
                        this.setHasDecor = textView;
                        TextView textView2 = (TextView) view.findViewById(R.id.deposit_type);
                        if (textView2 != null) {
                            this.setBackgroundResource = textView2;
                            TextView textView3 = (TextView) view.findViewById(R.id.deposit_nickname);
                            if (textView3 != null) {
                                this.Keep = textView3;
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.RadioButton");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
    }
}

package com.scb.phone.view.adapter.chequemanagement.chequestatus;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateDependencies;
import p040o.zzul;

public final class ChequeDetailListAdapter extends RecyclerView.IconCompatParcelizer {
    public List<validateDependencies> MediaBrowserCompat$ItemReceiver;
    private final Context MediaBrowserCompat$SearchResultReceiver;
    public boolean read;
    public int write;

    public class ChequeItemHolder_ViewBinding implements Unbinder {
        private ChequeItemHolder MediaBrowserCompat$ItemReceiver;

        public ChequeItemHolder_ViewBinding(ChequeItemHolder chequeItemHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = chequeItemHolder;
            chequeItemHolder.ivBank = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_bank_icon, "field 'ivBank'", ImageView.class);
            chequeItemHolder.tvChequeDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_date, "field 'tvChequeDate'", TextView.class);
            chequeItemHolder.tvChequeNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_number, "field 'tvChequeNumber'", TextView.class);
            chequeItemHolder.tvChequeMoney = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_moneny, "field 'tvChequeMoney'", TextView.class);
            chequeItemHolder.tvChequeStatus = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_status, "field 'tvChequeStatus'", TextView.class);
            chequeItemHolder.tvChequeRejectReason = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_cheque_reject_reason, "field 'tvChequeRejectReason'", TextView.class);
            chequeItemHolder.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
        }

        public final void read() {
            ChequeItemHolder chequeItemHolder = this.MediaBrowserCompat$ItemReceiver;
            if (chequeItemHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                chequeItemHolder.ivBank = null;
                chequeItemHolder.tvChequeDate = null;
                chequeItemHolder.tvChequeNumber = null;
                chequeItemHolder.tvChequeMoney = null;
                chequeItemHolder.tvChequeStatus = null;
                chequeItemHolder.tvChequeRejectReason = null;
                chequeItemHolder.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ChequeDetailListAdapter(Context context, List<validateDependencies> list) {
        this.MediaBrowserCompat$SearchResultReceiver = context;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        View view;
        if (i == 0) {
            return new ChequeItemHolder(this, LayoutInflater.from(this.MediaBrowserCompat$SearchResultReceiver).inflate(R.layout.f81272131493353, viewGroup, false), (byte) 0);
        }
        if (i != 1) {
            return null;
        }
        if (!this.read) {
            view = LayoutInflater.from(this.MediaBrowserCompat$SearchResultReceiver).inflate(R.layout.f80452131493270, viewGroup, false);
        } else {
            view = LayoutInflater.from(this.MediaBrowserCompat$SearchResultReceiver).inflate(R.layout.f80442131493269, viewGroup, false);
        }
        return new read(this, view);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof ChequeItemHolder) {
            ChequeItemHolder chequeItemHolder = (ChequeItemHolder) setcontentview;
            validateDependencies validatedependencies = this.MediaBrowserCompat$ItemReceiver.get(i);
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(ChequeDetailListAdapter.this.MediaBrowserCompat$SearchResultReceiver, setLastBaselineToBottomHeight.write(ChequeDetailListAdapter.this.MediaBrowserCompat$SearchResultReceiver, R.drawable.bankicon_place_holder), chequeItemHolder.ivBank, validatedependencies.ParcelableVolumeInfo, (int) ChequeDetailListAdapter.this.MediaBrowserCompat$SearchResultReceiver.getResources().getDimension(R.dimen.f72152131165308), setLastBaselineToBottomHeight.read(ChequeDetailListAdapter.this.MediaBrowserCompat$SearchResultReceiver, R.color.f66402131099796));
            if (i == ChequeDetailListAdapter.this.MediaBrowserCompat$ItemReceiver.size() - 1) {
                chequeItemHolder.divider.setVisibility(8);
            } else {
                chequeItemHolder.divider.setVisibility(0);
            }
            chequeItemHolder.tvChequeDate.setText(validatedependencies.RatingCompat);
            chequeItemHolder.tvChequeNumber.setText(validatedependencies.MediaBrowserCompat$CustomActionResultReceiver);
            chequeItemHolder.tvChequeMoney.setText(validatedependencies.MediaBrowserCompat$ItemReceiver);
            if (!validatedependencies.MediaBrowserCompat$SearchResultReceiver) {
                int parseColor = !TextUtils.isEmpty(validatedependencies.MediaSessionCompat$Token) ? Color.parseColor(validatedependencies.MediaSessionCompat$Token) : setLastBaselineToBottomHeight.read(ChequeDetailListAdapter.this.MediaBrowserCompat$SearchResultReceiver, R.color.f65322131099683);
                int parseColor2 = !TextUtils.isEmpty(validatedependencies.MediaMetadataCompat) ? Color.parseColor(validatedependencies.MediaMetadataCompat) : setLastBaselineToBottomHeight.read(ChequeDetailListAdapter.this.MediaBrowserCompat$SearchResultReceiver, R.color.f65322131099683);
                if (!TextUtils.isEmpty(validatedependencies.f2973x50fd9e4a)) {
                    chequeItemHolder.tvChequeRejectReason.setVisibility(0);
                    chequeItemHolder.tvChequeRejectReason.setText(validatedependencies.f2973x50fd9e4a);
                    chequeItemHolder.tvChequeRejectReason.setTextColor(parseColor);
                }
                chequeItemHolder.tvChequeStatus.setText(validatedependencies.MediaSessionCompat$QueueItem);
                chequeItemHolder.tvChequeStatus.setTextColor(parseColor2);
                return;
            }
            if (validatedependencies.MediaDescriptionCompat == zzul.RETURN) {
                chequeItemHolder.tvChequeRejectReason.setText(validatedependencies.f2973x50fd9e4a);
                chequeItemHolder.tvChequeRejectReason.setVisibility(0);
            } else {
                chequeItemHolder.tvChequeRejectReason.setVisibility(8);
            }
            TextView textView = chequeItemHolder.tvChequeStatus;
            zzul zzul = validatedependencies.MediaDescriptionCompat;
            String str = validatedependencies.MediaSessionCompat$QueueItem;
            textView.setTextColor(setLastBaselineToBottomHeight.read(textView.getContext(), ChequeItemHolder.read(zzul)));
            if (zzul.DEFAULT != zzul) {
                textView.setText(str);
            }
        }
    }

    public final int IconCompatParcelizer() {
        List<validateDependencies> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.size() + 1;
        }
        return 0;
    }

    class ChequeItemHolder extends RecyclerView.setContentView {
        @BindView
        View divider;
        @BindView
        ImageView ivBank;
        @BindView
        TextView tvChequeDate;
        @BindView
        TextView tvChequeMoney;
        @BindView
        TextView tvChequeNumber;
        @BindView
        TextView tvChequeRejectReason;
        @BindView
        TextView tvChequeStatus;

        /* synthetic */ ChequeItemHolder(ChequeDetailListAdapter chequeDetailListAdapter, View view, byte b) {
            this(view);
        }

        private ChequeItemHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static int read(zzul zzul) {
            int i = C57374.IconCompatParcelizer[zzul.ordinal()];
            if (i == 1) {
                return R.color.f65322131099683;
            }
            if (i == 2) {
                return R.color.f67212131099877;
            }
            if (i != 3) {
                return i != 4 ? R.color.f65322131099683 : R.color.f67252131099881;
            }
            return R.color.f67152131099871;
        }
    }

    /* renamed from: com.scb.phone.view.adapter.chequemanagement.chequestatus.ChequeDetailListAdapter$4 */
    static /* synthetic */ class C57374 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.zzul[] r0 = p040o.zzul.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.zzul r1 = p040o.zzul.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.zzul r1 = p040o.zzul.PAID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.zzul r1 = p040o.zzul.RETURN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.zzul r1 = p040o.zzul.PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.chequemanagement.chequestatus.ChequeDetailListAdapter.C57374.<clinit>():void");
        }
    }

    class read extends RecyclerView.setContentView {
        /* synthetic */ read(ChequeDetailListAdapter chequeDetailListAdapter, View view) {
            this(view);
        }

        private read(View view) {
            super(view);
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i == this.MediaBrowserCompat$ItemReceiver.size() ? 1 : 0;
    }
}

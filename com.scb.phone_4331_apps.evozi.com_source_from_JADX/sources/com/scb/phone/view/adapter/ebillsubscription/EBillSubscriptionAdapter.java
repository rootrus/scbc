package com.scb.phone.view.adapter.ebillsubscription;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment;
import p040o.access$1600;
import p040o.confirmPurchaseBond;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.verifyPurchaseBond;

public final class EBillSubscriptionAdapter extends RecyclerView.IconCompatParcelizer {
    private final Context MediaBrowserCompat$ItemReceiver;
    public C5753x4ef7ff3 read;
    public List<access$1600> write;

    public class EBillSubscriptionItemHolder_ViewBinding implements Unbinder {
        private EBillSubscriptionItemHolder MediaBrowserCompat$ItemReceiver;

        public EBillSubscriptionItemHolder_ViewBinding(EBillSubscriptionItemHolder eBillSubscriptionItemHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = eBillSubscriptionItemHolder;
            eBillSubscriptionItemHolder.mContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container, "field 'mContainer'", RelativeLayout.class);
            eBillSubscriptionItemHolder.mIconBiller = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_subscription_icon_image_view, "field 'mIconBiller'", ImageView.class);
            eBillSubscriptionItemHolder.mTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_subscription_title_text_view, "field 'mTitle'", TextView.class);
            eBillSubscriptionItemHolder.mCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_subscription_code_text_view, "field 'mCode'", TextView.class);
            eBillSubscriptionItemHolder.mReference = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_subscription_reference_text_view, "field 'mReference'", TextView.class);
            eBillSubscriptionItemHolder.mDivider = onStart.IconCompatParcelizer(view, R.id.ebill_subscription_divider, "field 'mDivider'");
            eBillSubscriptionItemHolder.mFullDivider = onStart.IconCompatParcelizer(view, R.id.ebill_subscription_full_divider, "field 'mFullDivider'");
            eBillSubscriptionItemHolder.mStatus = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_status_text_view, "field 'mStatus'", TextView.class);
        }

        public final void read() {
            EBillSubscriptionItemHolder eBillSubscriptionItemHolder = this.MediaBrowserCompat$ItemReceiver;
            if (eBillSubscriptionItemHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                eBillSubscriptionItemHolder.mContainer = null;
                eBillSubscriptionItemHolder.mIconBiller = null;
                eBillSubscriptionItemHolder.mTitle = null;
                eBillSubscriptionItemHolder.mCode = null;
                eBillSubscriptionItemHolder.mReference = null;
                eBillSubscriptionItemHolder.mDivider = null;
                eBillSubscriptionItemHolder.mFullDivider = null;
                eBillSubscriptionItemHolder.mStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public EBillSubscriptionAdapter(Context context, List<access$1600> list, C5753x4ef7ff3 eBillSubscriptionAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = eBillSubscriptionAdapter$MediaBrowserCompat$CustomActionResultReceiver;
        this.write = list;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof EBillSubscriptionItemHolder) {
            EBillSubscriptionItemHolder eBillSubscriptionItemHolder = (EBillSubscriptionItemHolder) setcontentview;
            access$1600 access_1600 = this.write.get(i);
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, (int) R.drawable.biller_place_holder, eBillSubscriptionItemHolder.mIconBiller, access_1600.read, this.MediaBrowserCompat$ItemReceiver.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, R.color.f66402131099796));
            eBillSubscriptionItemHolder.mTitle.setText(access_1600.RatingCompat);
            eBillSubscriptionItemHolder.mCode.setText(access_1600.MediaBrowserCompat$CustomActionResultReceiver);
            eBillSubscriptionItemHolder.mReference.setText(access_1600.MediaSessionCompat$Token);
            eBillSubscriptionItemHolder.mStatus.setText(access_1600.MediaBrowserCompat$SearchResultReceiver);
            verifyPurchaseBond IconCompatParcelizer = verifyPurchaseBond.IconCompatParcelizer(access_1600.MediaDescriptionCompat);
            int i2 = C57521.IconCompatParcelizer[(IconCompatParcelizer == null ? verifyPurchaseBond.DEFAULT : IconCompatParcelizer).ordinal()];
            int i3 = R.color.f65322131099683;
            if (i2 == 1) {
                i3 = R.color.f67252131099881;
            } else if (i2 == 2) {
                i3 = R.color.f67212131099877;
            } else if (i2 == 3) {
                i3 = R.color.f67152131099871;
            }
            eBillSubscriptionItemHolder.mStatus.setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$ItemReceiver, i3));
            if (verifyPurchaseBond.DEFAULT == IconCompatParcelizer) {
                eBillSubscriptionItemHolder.mStatus.setVisibility(4);
                eBillSubscriptionItemHolder.mStatus.setText(FragmentBuilder_BindEasycashReferralSendDfwFragment.DEFAULT_IDENTIFIER);
            }
            eBillSubscriptionItemHolder.mContainer.setOnClickListener(new confirmPurchaseBond(this, i));
        }
    }

    /* renamed from: com.scb.phone.view.adapter.ebillsubscription.EBillSubscriptionAdapter$1 */
    static /* synthetic */ class C57521 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.verifyPurchaseBond[] r0 = p040o.verifyPurchaseBond.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.verifyPurchaseBond r1 = p040o.verifyPurchaseBond.PENDING_SUBSCRIBE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.verifyPurchaseBond r1 = p040o.verifyPurchaseBond.SUBSCRIBE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.verifyPurchaseBond r1 = p040o.verifyPurchaseBond.REJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.verifyPurchaseBond r1 = p040o.verifyPurchaseBond.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.ebillsubscription.EBillSubscriptionAdapter.C57521.<clinit>():void");
        }
    }

    public final int IconCompatParcelizer() {
        List<access$1600> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class EBillSubscriptionItemHolder extends RecyclerView.setContentView {
        @BindView
        TextView mCode;
        @BindView
        RelativeLayout mContainer;
        @BindView
        View mDivider;
        @BindView
        View mFullDivider;
        @BindView
        ImageView mIconBiller;
        @BindView
        TextView mReference;
        @BindView
        TextView mStatus;
        @BindView
        TextView mTitle;

        public EBillSubscriptionItemHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new EBillSubscriptionItemHolder(LayoutInflater.from(this.MediaBrowserCompat$ItemReceiver).inflate(R.layout.f82692131493495, viewGroup, false));
    }
}

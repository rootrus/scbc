package com.scb.phone.view.adapter.debitatm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.Lazy;
import p040o.onActivityCreated;
import p040o.onStart;

public final class DebitCardDetailAdapter extends onActivityCreated {
    public List<? extends Lazy> MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class DebitCardHolder_ViewBinding implements Unbinder {
        private DebitCardHolder MediaBrowserCompat$ItemReceiver;

        public DebitCardHolder_ViewBinding(DebitCardHolder debitCardHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = debitCardHolder;
            debitCardHolder.tvDbLastNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'tvDbLastNumber'", TextView.class);
            debitCardHolder.tvDbFrontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'tvDbFrontNumber'", TextView.class);
            debitCardHolder.tvDbSecondFrontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'tvDbSecondFrontNumber'", TextView.class);
            debitCardHolder.tvDbPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point, "field 'tvDbPoint'", TextView.class);
            debitCardHolder.ivDbCard = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_card, "field 'ivDbCard'", ImageView.class);
            debitCardHolder.lloverlayContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_overlay_container, "field 'lloverlayContainer'", LinearLayout.class);
            debitCardHolder.ivDbThumb = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_thumb, "field 'ivDbThumb'", ImageView.class);
            debitCardHolder.tvDbOverlayDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_overlay_description, "field 'tvDbOverlayDescription'", TextView.class);
            debitCardHolder.tvNickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_nickname, "field 'tvNickName'", TextView.class);
        }

        public final void read() {
            DebitCardHolder debitCardHolder = this.MediaBrowserCompat$ItemReceiver;
            if (debitCardHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                debitCardHolder.tvDbLastNumber = null;
                debitCardHolder.tvDbFrontNumber = null;
                debitCardHolder.tvDbSecondFrontNumber = null;
                debitCardHolder.tvDbPoint = null;
                debitCardHolder.ivDbCard = null;
                debitCardHolder.lloverlayContainer = null;
                debitCardHolder.ivDbThumb = null;
                debitCardHolder.tvDbOverlayDescription = null;
                debitCardHolder.tvNickName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DebitCardDetailAdapter(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final int getCount() {
        List<? extends Lazy> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object instantiateItem(android.view.ViewGroup r13, int r14) {
        /*
            r12 = this;
            com.scb.phone.view.adapter.debitatm.DebitCardDetailAdapter$DebitCardHolder r0 = new com.scb.phone.view.adapter.debitatm.DebitCardDetailAdapter$DebitCardHolder
            java.lang.String r1 = r12.MediaBrowserCompat$ItemReceiver
            r0.<init>(r13, r1)
            java.util.List<? extends o.Lazy> r1 = r12.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r14 = r1.get(r14)
            o.Lazy r14 = (p040o.Lazy) r14
            android.widget.TextView r1 = r0.tvDbFrontNumber
            java.lang.String r2 = r14.MediaBrowserCompat$ItemReceiver
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            r4 = 4
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r6 = ""
            r7 = 0
            if (r2 == 0) goto L_0x002f
            if (r2 == 0) goto L_0x0029
            java.lang.String r2 = r2.substring(r7, r4)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x0029:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            r13.<init>(r5)
            throw r13
        L_0x002f:
            r2 = r6
        L_0x0030:
            r1.setText(r2)
            android.widget.TextView r1 = r0.tvDbSecondFrontNumber
            java.lang.String r2 = r14.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x004c
            if (r2 == 0) goto L_0x0046
            r8 = 6
            java.lang.String r2 = r2.substring(r4, r8)
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
            if (r2 == 0) goto L_0x004c
            goto L_0x004d
        L_0x0046:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            r13.<init>(r5)
            throw r13
        L_0x004c:
            r2 = r6
        L_0x004d:
            r1.setText(r2)
            android.widget.TextView r1 = r0.tvDbLastNumber
            java.lang.String r2 = r14.MediaBrowserCompat$ItemReceiver
            if (r2 == 0) goto L_0x0070
            int r3 = r2.length()
            if (r2 == 0) goto L_0x006a
            int r3 = r3 - r4
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
            if (r2 == 0) goto L_0x0070
            r6 = r2
            goto L_0x0070
        L_0x006a:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            r13.<init>(r5)
            throw r13
        L_0x0070:
            r1.setText(r6)
            java.lang.String r1 = r14.MediaDescriptionCompat
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 8
            if (r1 != 0) goto L_0x008a
            android.widget.TextView r1 = r0.tvNickName
            java.lang.String r3 = r14.MediaDescriptionCompat
            r1.setText(r3)
            android.widget.TextView r1 = r0.tvNickName
            r1.setVisibility(r7)
            goto L_0x008f
        L_0x008a:
            android.widget.TextView r1 = r0.tvNickName
            r1.setVisibility(r2)
        L_0x008f:
            java.lang.String[] r1 = r14.IconCompatParcelizer
            int r3 = r1.length
            r4 = r7
        L_0x0093:
            r5 = 1
            if (r4 >= r3) goto L_0x00ae
            r6 = r1[r4]
            java.lang.String[] r8 = r0.Keep
            int r9 = r8.length
            r10 = r7
        L_0x009c:
            if (r10 >= r9) goto L_0x00ab
            r11 = r8[r10]
            boolean r11 = r6.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x00a8
            r1 = r5
            goto L_0x00af
        L_0x00a8:
            int r10 = r10 + 1
            goto L_0x009c
        L_0x00ab:
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00ae:
            r1 = r7
        L_0x00af:
            android.widget.TextView r3 = r0.tvDbPoint
            r3.setVisibility(r2)
            android.widget.LinearLayout r3 = r0.lloverlayContainer
            r3.setVisibility(r7)
            if (r1 == 0) goto L_0x00cb
            android.widget.ImageView r1 = r0.ivDbThumb
            r2 = 2131231235(0x7f080203, float:1.8078545E38)
            r1.setImageResource(r2)
            android.widget.TextView r1 = r0.tvDbOverlayDescription
            java.lang.String r2 = r14.MediaMetadataCompat
            r1.setText(r2)
            goto L_0x013a
        L_0x00cb:
            java.lang.String r1 = r14.MediaMetadataCompat
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e3
            android.widget.ImageView r1 = r0.ivDbThumb
            r2 = 2131623939(0x7f0e0003, float:1.8875044E38)
            r1.setImageResource(r2)
            android.widget.TextView r1 = r0.tvDbOverlayDescription
            java.lang.String r2 = r14.MediaMetadataCompat
            r1.setText(r2)
            goto L_0x013a
        L_0x00e3:
            android.widget.LinearLayout r1 = r0.lloverlayContainer
            r1.setVisibility(r2)
            int r1 = r14.AlertController$RecycleListView
            if (r1 != 0) goto L_0x00f2
            android.widget.TextView r1 = r0.tvDbPoint
            r1.setVisibility(r2)
            goto L_0x013a
        L_0x00f2:
            java.lang.Throwable r1 = r14.f2750x50fd9e4a
            if (r1 == 0) goto L_0x010b
            android.widget.TextView r1 = r0.tvDbPoint
            r1.setVisibility(r7)
            android.widget.TextView r1 = r0.tvDbPoint
            java.lang.String r2 = r0.PlaybackStateCompat
            r1.setText(r2)
            android.widget.TextView r1 = r0.tvDbPoint
            r2 = 2131231725(0x7f0803ed, float:1.807954E38)
            r1.setBackgroundResource(r2)
            goto L_0x013a
        L_0x010b:
            o.CrashlyticsRegistrar r1 = r14.MediaBrowserCompat$SearchResultReceiver
            if (r1 != 0) goto L_0x0115
            android.widget.TextView r1 = r0.tvDbPoint
            r1.setVisibility(r2)
            goto L_0x013a
        L_0x0115:
            android.widget.TextView r1 = r0.tvDbPoint
            r1.setVisibility(r7)
            android.widget.TextView r1 = r0.tvDbPoint
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            o.CrashlyticsRegistrar r3 = r14.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r3 = r3.IconCompatParcelizer
            r2[r7] = r3
            java.lang.String r3 = r14.MediaSessionCompat$ResultReceiverWrapper
            r2[r5] = r3
            java.lang.String r3 = "%s %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.setText(r2)
            android.widget.TextView r1 = r0.tvDbPoint
            r2 = 2131231727(0x7f0803ef, float:1.8079543E38)
            r1.setBackgroundResource(r2)
        L_0x013a:
            com.squareup.picasso.Picasso r1 = com.squareup.picasso.Picasso.read()
            java.lang.String r14 = r14.MediaBrowserCompat$CustomActionResultReceiver
            o.FragmentBuilder_BindFundDetailSummaryFragment r14 = r1.write((java.lang.String) r14)
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            o.FragmentBuilder_BindFixedTransferInputFormFragment$read r2 = r14.MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == 0) goto L_0x0165
            r2.write = r1
            r1 = 2131231006(0x7f08011e, float:1.807808E38)
            o.FragmentBuilder_BindFundDetailSummaryFragment r14 = r14.IconCompatParcelizer((int) r1)
            o.FragmentBuilder_BindFundDetailSummaryFragment r14 = r14.MediaBrowserCompat$CustomActionResultReceiver((int) r1)
            android.widget.ImageView r1 = r0.ivDbCard
            r2 = 0
            r14.read(r1, r2)
            android.view.View r14 = r0.write
            r13.addView(r14)
            android.view.View r13 = r0.write
            return r13
        L_0x0165:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "config == null"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.debitatm.DebitCardDetailAdapter.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    public static class DebitCardHolder extends RecyclerView.setContentView {
        String[] Keep = {"OVERLAY_TEMP_LOCK", "OVERLAY_MCARD_UNABLE", "OVERLAY_OTHER_UNABLE"};
        final String PlaybackStateCompat;
        @BindView
        ImageView ivDbCard;
        @BindView
        ImageView ivDbThumb;
        @BindView
        LinearLayout lloverlayContainer;
        @BindView
        TextView tvDbFrontNumber;
        @BindView
        TextView tvDbLastNumber;
        @BindView
        TextView tvDbOverlayDescription;
        @BindView
        TextView tvDbPoint;
        @BindView
        TextView tvDbSecondFrontNumber;
        @BindView
        TextView tvNickName;

        public DebitCardHolder(ViewGroup viewGroup, String str) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90492131494276, viewGroup, false));
            this.PlaybackStateCompat = str;
            ButterKnife.IconCompatParcelizer(this, this.write);
        }
    }
}

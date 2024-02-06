package com.scb.phone.view.custom.item;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import p040o.C6497x60d98ad8;
import p040o.FragmentBuilder_BindDepositMarketConductFragment;
import p040o.FragmentBuilder_BindDeviceSettingsFragment;
import p040o.FragmentBuilder_BindEStatementsSuccessfulFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.FragmentBuilder_BindFundRedeemLandingFragment;
import p040o.awaitEvenIfOnMainThread;
import p040o.onCheckBoxClick;
import p040o.setLastBaselineToBottomHeight;

public class ItemIconCustom extends ItemCustom<awaitEvenIfOnMainThread> {
    @BindView
    TextView labelLeft;
    @BindView
    TextView labelRight;
    @BindView
    TextView labelRightExtra;
    @BindView
    TextView labelRightExtraWithPSL;
    @BindView
    public ConstraintLayout layoutCustomItemIcon;
    private FragmentBuilder_BindDepositMarketConductFragment write;

    public ItemIconCustom(Context context) {
        super(context);
    }

    public ItemIconCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIconCustom(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        LayoutInflater.from(context).inflate(R.layout.f81452131493371, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setUpWithDisplay(awaitEvenIfOnMainThread awaitevenifonmainthread) {
        this.write = new FragmentBuilder_BindDepositMarketConductFragment();
        this.labelLeft.setText(awaitevenifonmainthread.RatingCompat);
        boolean z = false;
        if (awaitevenifonmainthread.MediaBrowserCompat$ItemReceiver != null) {
            if (awaitevenifonmainthread.IconCompatParcelizer) {
                this.labelRightExtraWithPSL.setText(awaitevenifonmainthread.MediaBrowserCompat$ItemReceiver);
                this.labelRightExtraWithPSL.setVisibility(0);
            } else {
                this.labelRightExtra.setText(awaitevenifonmainthread.MediaBrowserCompat$ItemReceiver);
                this.labelRightExtra.setVisibility(0);
            }
        }
        final int i = R.drawable.bankicon_place_holder;
        if (awaitevenifonmainthread.read > 0) {
            i = awaitevenifonmainthread.read;
        }
        String str = awaitevenifonmainthread.MediaBrowserCompat$SearchResultReceiver;
        String str2 = awaitevenifonmainthread.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null || str2.isEmpty()) {
            this.labelRight.setText(str);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("   ");
            sb.append(str);
            final SpannableString spannableString = new SpannableString(sb.toString());
            this.labelRight.setText(spannableString);
            FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(str2).IconCompatParcelizer(i).MediaBrowserCompat$CustomActionResultReceiver(i).write();
            write2.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindEStatementsSuccessfulFragment(getContext().getResources().getDimensionPixelSize(R.dimen.f72242131165341), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796), getContext().getResources().getDimensionPixelSize(R.dimen.f74422131165882)));
            C58371 r4 = new C6497x60d98ad8<FragmentBuilder_BindDeviceSettingsFragment>() {
                public final /* synthetic */ Object read(Bitmap bitmap) {
                    return new FragmentBuilder_BindDeviceSettingsFragment(ItemIconCustom.this.getContext(), bitmap);
                }

                public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable) {
                    int dimensionPixelSize = ItemIconCustom.this.getContext().getResources().getDimensionPixelSize(R.dimen.f72252131165342);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    return new FragmentBuilder_BindDeviceSettingsFragment(drawable);
                }
            };
            C58385 r5 = new FragmentBuilder_BindDepositMarketConductFragment.IconCompatParcelizer<FragmentBuilder_BindDeviceSettingsFragment>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    spannableString.setSpan((FragmentBuilder_BindDeviceSettingsFragment) obj, 0, 1, 17);
                    ItemIconCustom.this.labelRight.setText(spannableString);
                }

                public final void IconCompatParcelizer() {
                    spannableString.setSpan(new FragmentBuilder_BindDeviceSettingsFragment(ItemIconCustom.this.getContext(), ItemIconCustom.this.IconCompatParcelizer(i)), 0, 1, 17);
                    ItemIconCustom.this.labelRight.setText(spannableString);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                z = true;
            }
            if (z) {
                write2.MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindFundRedeemLandingFragment) new FragmentBuilder_BindFundRedeemLandingFragment(r4) {
                    private /* synthetic */ C6497x60d98ad8 IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r2;
                    }

                    public final void read(Bitmap bitmap) {
                        IconCompatParcelizer.this.IconCompatParcelizer(this.IconCompatParcelizer.read(bitmap));
                    }

                    public final void write(Drawable drawable) {
                        IconCompatParcelizer.this.IconCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(drawable));
                    }

                    public final void MediaBrowserCompat$CustomActionResultReceiver(Drawable drawable) {
                        IconCompatParcelizer.this.IconCompatParcelizer(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(drawable));
                    }
                });
            } else {
                try {
                    r5.IconCompatParcelizer(r4.read(write2.MediaBrowserCompat$CustomActionResultReceiver()));
                } catch (IOException e) {
                    r5.IconCompatParcelizer();
                    onCheckBoxClick.IconCompatParcelizer(e);
                }
            }
        }
        boolean z2 = awaitevenifonmainthread.MediaSessionCompat$Token;
        boolean z3 = awaitevenifonmainthread.MediaDescriptionCompat;
        int dimension = (int) getResources().getDimension(R.dimen.f73452131165702);
        int dimension2 = (int) getResources().getDimension(R.dimen.f72472131165407);
        int i2 = z2 ? dimension : dimension2;
        if (z3) {
            dimension2 = dimension;
        }
        this.layoutCustomItemIcon.setPadding(dimension, i2, dimension, dimension2);
    }

    /* access modifiers changed from: private */
    public Bitmap IconCompatParcelizer(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), i);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f72252131165342);
        try {
            return Bitmap.createScaledBitmap(decodeResource, dimensionPixelSize, dimensionPixelSize, true);
        } catch (Exception unused) {
            return decodeResource;
        }
    }
}

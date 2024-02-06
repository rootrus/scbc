package p040o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.adapter.ccrredemption.ecoupon.MyECouponViewHolder;
import com.scb.phone.view.adapter.ccrredemption.ecoupon.MyECouponViewHolder$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: o.verifyOtp  reason: case insensitive filesystem */
public final class C10891verifyOtp extends postAddressesValidation {
    public verifyBusinessPin MediaBrowserCompat$ItemReceiver;
    private final verifyResetPin MediaBrowserCompat$MediaItem;
    public final ArrayList<isAlwaysEager> read = new ArrayList<>();
    public boolean write;

    public C10891verifyOtp(verifyResetPin verifyresetpin) {
        onGetStartedClick.write((Object) verifyresetpin, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.MediaBrowserCompat$MediaItem = verifyresetpin;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        if (setcontentview instanceof MyECouponViewHolder) {
            MyECouponViewHolder myECouponViewHolder = (MyECouponViewHolder) setcontentview;
            isAlwaysEager isalwayseager = this.read.get(i);
            onGetStartedClick.IconCompatParcelizer((Object) isalwayseager, "eCoupon");
            myECouponViewHolder.write.setOnClickListener(new write(this, isalwayseager));
            onGetStartedClick.write((Object) isalwayseager, "transaction");
            Drawable write2 = setLastBaselineToBottomHeight.write(myECouponViewHolder.setHasDecor.getContext(), R.drawable.shape_circle_lighter_gray);
            Context context = myECouponViewHolder.setHasDecor.getContext();
            ImageView imageView = myECouponViewHolder.ivIcon;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivIcon");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
            sb.append(isalwayseager.MediaMetadataCompat);
            String obj = sb.toString();
            Context context2 = myECouponViewHolder.setHasDecor.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context2, "view.context");
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, write2, imageView, obj, context2.getResources().getDimensionPixelOffset(R.dimen.f73252131165576), setLastBaselineToBottomHeight.read(myECouponViewHolder.setHasDecor.getContext(), R.color.f66462131099802));
            ImageView imageView2 = myECouponViewHolder.ivNotificationIcon;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivNotificationIcon");
            }
            imageView2.setVisibility(8);
            TextView textView = myECouponViewHolder.tvTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
            }
            textView.setText(isalwayseager.MediaBrowserCompat$MediaItem);
            if (myECouponViewHolder.PlaybackStateCompat) {
                Integer valueOf = Integer.valueOf(isalwayseager.read);
                if (valueOf == null || valueOf.intValue() == 0) {
                    if (isalwayseager.MediaBrowserCompat$CustomActionResultReceiver > 1.0d) {
                        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(isalwayseager.MediaBrowserCompat$CustomActionResultReceiver);
                        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "Utilities.amountDoubleWi…rator(myECoupon.diffDate)");
                        TextView textView2 = myECouponViewHolder.tvExpire;
                        if (textView2 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                        }
                        TextView textView3 = myECouponViewHolder.tvExpire;
                        if (textView3 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                        }
                        textView2.setTextColor(setLastBaselineToBottomHeight.read(textView3.getContext(), R.color.f65772131099731));
                        TextView textView4 = myECouponViewHolder.tvExpire;
                        if (textView4 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                        }
                        textView4.setText(myECouponViewHolder.setHasDecor.getResources().getString(R.string.my_e_coupon_expire_day, new Object[]{MediaBrowserCompat$CustomActionResultReceiver}));
                    } else if (!isalwayseager.RatingCompat) {
                        TextView textView5 = myECouponViewHolder.tvExpire;
                        if (textView5 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                        }
                        TextView textView6 = myECouponViewHolder.tvExpire;
                        if (textView6 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                        }
                        textView5.setTextColor(setLastBaselineToBottomHeight.read(textView6.getContext(), R.color.f65772131099731));
                        TextView textView7 = myECouponViewHolder.tvExpire;
                        if (textView7 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                        }
                        textView7.setText(myECouponViewHolder.setHasDecor.getResources().getString(R.string.my_e_coupon_expire_today));
                    }
                } else if (myECouponViewHolder.Keep == null) {
                    Date parse = MyECouponViewHolder.read().parse(isalwayseager.IconCompatParcelizer);
                    onGetStartedClick.IconCompatParcelizer((Object) parse, "getSimpleDateFormat().pa…  myECoupon.couponExpiry)");
                    long time = parse.getTime();
                    Date parse2 = MyECouponViewHolder.read().parse(MyECouponViewHolder.MediaBrowserCompat$ItemReceiver());
                    onGetStartedClick.IconCompatParcelizer((Object) parse2, "getSimpleDateFormat().parse(getDateNowFormat())");
                    myECouponViewHolder.Keep = new MyECouponViewHolder$MediaBrowserCompat$ItemReceiver(myECouponViewHolder, time - parse2.getTime()).start();
                }
            } else if (isalwayseager.MediaDescriptionCompat) {
                String str = isalwayseager.write;
                TextView textView8 = myECouponViewHolder.tvExpire;
                if (textView8 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                }
                TextView textView9 = myECouponViewHolder.tvExpire;
                if (textView9 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                }
                textView8.setTextColor(setLastBaselineToBottomHeight.read(textView9.getContext(), R.color.f67222131099878));
                TextView textView10 = myECouponViewHolder.tvExpire;
                if (textView10 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                }
                textView10.setText(myECouponViewHolder.setHasDecor.getResources().getString(R.string.my_e_coupon_redeemed, new Object[]{str}));
            } else if (isalwayseager.RatingCompat) {
                String str2 = isalwayseager.MediaBrowserCompat$ItemReceiver;
                TextView textView11 = myECouponViewHolder.tvExpire;
                if (textView11 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                }
                TextView textView12 = myECouponViewHolder.tvExpire;
                if (textView12 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                }
                textView11.setTextColor(setLastBaselineToBottomHeight.read(textView12.getContext(), R.color.f67222131099878));
                TextView textView13 = myECouponViewHolder.tvExpire;
                if (textView13 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvExpire");
                }
                textView13.setText(myECouponViewHolder.setHasDecor.getResources().getString(R.string.my_e_coupon_expired, new Object[]{str2}));
            }
            if (i == this.read.size() - 1) {
                View view = myECouponViewHolder.vwSeparatorMarginLeft;
                if (view == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwSeparatorMarginLeft");
                }
                view.setVisibility(8);
                View view2 = myECouponViewHolder.vwSeparatorFull;
                if (view2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwSeparatorFull");
                }
                view2.setVisibility(0);
                return;
            }
            View view3 = myECouponViewHolder.vwSeparatorMarginLeft;
            if (view3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwSeparatorMarginLeft");
            }
            view3.setVisibility(0);
            View view4 = myECouponViewHolder.vwSeparatorFull;
            if (view4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("vwSeparatorFull");
            }
            view4.setVisibility(8);
        }
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90732131494300, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return new MyECouponViewHolder(inflate, this.write, this.MediaBrowserCompat$MediaItem);
    }

    public final int write() {
        return this.read.size();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        super.MediaBrowserCompat$CustomActionResultReceiver(setcontentview);
        if (setcontentview instanceof MyECouponViewHolder) {
            MyECouponViewHolder myECouponViewHolder = (MyECouponViewHolder) setcontentview;
            CountDownTimer countDownTimer = myECouponViewHolder.Keep;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            myECouponViewHolder.Keep = null;
        }
    }

    /* renamed from: o.verifyOtp$write */
    static final class write implements View.OnClickListener {
        private /* synthetic */ C10891verifyOtp IconCompatParcelizer;
        private /* synthetic */ isAlwaysEager write;

        write(C10891verifyOtp verifyotp, isAlwaysEager isalwayseager) {
            this.IconCompatParcelizer = verifyotp;
            this.write = isalwayseager;
        }

        public final void onClick(View view) {
            verifyBusinessPin IconCompatParcelizer2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (IconCompatParcelizer2 != null) {
                IconCompatParcelizer2.write(this.write);
            }
        }
    }
}

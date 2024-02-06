package p040o;

import android.text.TextUtils;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C4885k;
import p040o.C5465y;
import p040o.ImmutableList;
import p040o.Multimaps;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.setImageOutListener */
public class setImageOutListener extends writeUInt64NoTag<getTopLeftCornerWidth.setForceShowIcon> {
    private final Multimaps.TransformedEntriesMultimap IconCompatParcelizer;
    private final ChequeInquiryDeepLinkActivity read = new ChequeInquiryDeepLinkActivity();
    /* access modifiers changed from: private */
    public final logEventNoInterceptor write;

    @HmlPinActivity
    public setImageOutListener(logEventNoInterceptor logeventnointerceptor, Multimaps.TransformedEntriesMultimap transformedEntriesMultimap, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = transformedEntriesMultimap;
        this.write = logeventnointerceptor;
    }

    static /* synthetic */ void read(getDeviceFile getdevicefile, getTopLeftCornerWidth.setForceShowIcon setforceshowicon) {
        setforceshowicon.IconCompatParcelizer(getdevicefile);
        setforceshowicon.mo18704G_();
    }

    public void onDestroy() {
        super.onDestroy();
        this.read.dispose();
    }

    public final void write() {
        boolean z = true;
        if (this.write.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
            C5167qM qMVar = C5167qM.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                qMVar.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        getFaceRectColor getfacerectcolor = getFaceRectColor.write;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getfacerectcolor.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setImageOutListener setimageoutlistener) {
        if (setimageoutlistener.RatingCompat != null) {
            setimageoutlistener.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void write(setImageOutListener setimageoutlistener) {
        if (setimageoutlistener.RatingCompat != null) {
            setimageoutlistener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setImageOutListener setimageoutlistener) {
        if (setimageoutlistener.RatingCompat != null) {
            setimageoutlistener.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(setImageOutListener setimageoutlistener) {
        if (setimageoutlistener.RatingCompat != null) {
            setimageoutlistener.RatingCompat.aj_();
        }
    }

    public final void read(getUuidUtf8Bytes getuuidutf8bytes) {
        if (getuuidutf8bytes.PlaybackStateCompat != null) {
            String str = getuuidutf8bytes.PlaybackStateCompat.AppCompatViewInflater;
            String str2 = getuuidutf8bytes.PlaybackStateCompat.setBackgroundResource;
            boolean z = true;
            if ("0".equalsIgnoreCase(str)) {
                C5257sd sdVar = C5257sd.MediaBrowserCompat$CustomActionResultReceiver;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    sdVar.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (DiskLruCache.VERSION_1.equalsIgnoreCase(str)) {
                if (str2 == null || str2.length() == 0) {
                    C5465y.C54661 r5 = C5465y.C54661.write;
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        r5.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                }
                C4885k.C4886a aVar = new C4885k.C4886a(str2);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    aVar.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }

    public final void write(getUuidUtf8Bytes getuuidutf8bytes, String str) {
        String str2;
        if (getuuidutf8bytes == null || getuuidutf8bytes.PlaybackStateCompat == null) {
            str2 = "";
        } else {
            str2 = getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat();
            if ("PURCHASE_TRANSFER_FUNCTION".equalsIgnoreCase(str2)) {
                str2 = "TRANSFER";
            } else if ("PURCHASE_TOPUP_FUNCTION".equalsIgnoreCase(str2)) {
                str2 = "TOPUP";
            } else if ("PURCHASE_BILL_PAYMENT_FUNCTION".equalsIgnoreCase(str2)) {
                str2 = "BILLPAYMENT";
            }
        }
        if (getuuidutf8bytes != null && getuuidutf8bytes.PlaybackStateCompat != null) {
            String str3 = getuuidutf8bytes.PlaybackStateCompat.setOverflowReserved;
            if (TextUtils.isEmpty(str3)) {
                str3 = "ALL";
            }
            ImmutableList.SerializedForm read2 = ImmutableList.SerializedForm.read();
            read2.ActionMenuItemView = str;
            read2.setCheckable = getuuidutf8bytes.PlaybackStateCompat.setSubtitle;
            read2.setIcon = getuuidutf8bytes.PlaybackStateCompat.ActionBarContextView;
            read2.setPadding = getuuidutf8bytes.PlaybackStateCompat.setHideOnContentScrollEnabled;
            read2.AppCompatDelegateImpl$ListMenuDecorView = getuuidutf8bytes.PlaybackStateCompat.AppCompatDialogFragment;
            read2.AppCompatViewInflater = str2;
            read2.setExpandedFormat = getuuidutf8bytes.PlaybackStateCompat.ExpandedMenuView;
            read2.setContentView = getuuidutf8bytes.PlaybackStateCompat.write();
            read2.setChecked = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(getuuidutf8bytes.PlaybackStateCompat.f2965x50fd9e4a.MediaBrowserCompat$ItemReceiver).doubleValue();
            read2.setShortcut = str3;
            char c = 65535;
            int hashCode = str2.hashCode();
            boolean z = false;
            if (hashCode != -486974465) {
                if (hashCode != 80008848) {
                    if (hashCode == 2063509483 && str2.equals("TRANSFER")) {
                        c = 0;
                    }
                } else if (str2.equals("TOPUP")) {
                    c = 1;
                }
            } else if (str2.equals("BILLPAYMENT")) {
                c = 2;
            }
            if (c == 0) {
                if (animateCameraWithCallback.CID.name().equals(str3) || animateCameraWithCallback.MOB.name().equals(str3)) {
                    read2.setShortcut = IGoogleMapDelegate.PROMPTPAY.name();
                    read2.setExpandedFormat = str3;
                }
                read2.setCheckable = null;
                read2.setIcon = null;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    this.RatingCompat.AlertController$RecycleListView();
                }
                this.write.MediaBrowserCompat$ItemReceiver(read2);
                this.write.IconCompatParcelizer(new C10147x7ce9e716(this, read2.ActionMenuItemView));
            } else if (c == 1) {
                read2.AppCompatDelegateImpl$ListMenuDecorView = null;
                read2.setIcon = null;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    this.RatingCompat.AlertController$RecycleListView();
                }
                this.write.IconCompatParcelizer(read2);
                this.write.IconCompatParcelizer(new C10147x7ce9e716(this, read2.ActionMenuItemView));
            } else if (c == 2) {
                read2.setChecked = 0.0d;
                read2.AppCompatDelegateImpl$ListMenuDecorView = null;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    this.RatingCompat.AlertController$RecycleListView();
                }
                this.write.MediaBrowserCompat$CustomActionResultReceiver(read2);
                this.write.IconCompatParcelizer(new C10147x7ce9e716(this, read2.ActionMenuItemView));
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getUuidUtf8Bytes getuuidutf8bytes) {
        boolean z = true;
        if (!(this.RatingCompat != null)) {
            return;
        }
        if (getuuidutf8bytes.PlaybackStateCompat == null || getuuidutf8bytes.PlaybackStateCompat.ActionMenuView == null) {
            isSupportFragmentClass MediaBrowserCompat$ItemReceiver = isSupportFragmentClass.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView());
            if (MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null) {
                IMessageListener iMessageListener = new IMessageListener(this.IconCompatParcelizer.write(MediaBrowserCompat$ItemReceiver));
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iMessageListener.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        Multimaps.TransformedEntriesMultimap transformedEntriesMultimap = this.IconCompatParcelizer;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = getuuidutf8bytes.PlaybackStateCompat;
        getDeviceFile read2 = getDeviceFile.read();
        read2.MediaBrowserCompat$ItemReceiver = transformedEntriesMultimap.mo26549c_(setuuidfromutf8bytes.ActionMenuView.MediaBrowserCompat$ItemReceiver);
        read2.read = transformedEntriesMultimap.mo26549c_(setuuidfromutf8bytes.ParcelableVolumeInfo);
        read2.IconCompatParcelizer = setuuidfromutf8bytes.ActionMenuView.MediaBrowserCompat$CustomActionResultReceiver;
        read2.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes.Keep;
        onTorchChange ontorchchange = new onTorchChange(read2);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ontorchchange.IconCompatParcelizer(this.RatingCompat);
        }
    }
}

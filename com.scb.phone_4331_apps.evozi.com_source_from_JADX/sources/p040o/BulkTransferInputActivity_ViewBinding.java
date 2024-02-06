package p040o;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.BulkTransferInputActivity_ViewBinding */
public final class BulkTransferInputActivity_ViewBinding {
    setDropDownBackgroundResource IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    setOnDismissListener MediaBrowserCompat$ItemReceiver;
    BulkTransferInputActivity MediaBrowserCompat$SearchResultReceiver;
    String MediaDescriptionCompat;
    Handler read;
    Context write;

    public BulkTransferInputActivity_ViewBinding(Context context, String str) {
        this.read = new Handler(Looper.getMainLooper());
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.IconCompatParcelizer = new Runnable() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(setOnDismissListener setondismisslistener) {
                BulkTransferInputActivity_ViewBinding.this.MediaBrowserCompat$ItemReceiver = setondismisslistener;
                BulkTransferInputActivity_ViewBinding.this.read.post(this);
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                BulkTransferInputActivity_ViewBinding.this.MediaBrowserCompat$ItemReceiver = null;
            }

            public final void run() {
                BulkTransferInputActivity_ViewBinding bulkTransferInputActivity_ViewBinding = BulkTransferInputActivity_ViewBinding.this;
                try {
                    if (bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$ItemReceiver == null) {
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Null custom tabs client was returned by the service");
                    } else {
                        Uri parse = Uri.parse(bulkTransferInputActivity_ViewBinding.MediaDescriptionCompat);
                        if (bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver) {
                            parse = FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.MediaBrowserCompat$CustomActionResultReceiver(parse);
                        }
                        if (parse != null) {
                            if (!bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.read()) {
                                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Custom tabs warmup failed");
                            } else {
                                AlertController$RecycleListView.RatingCompat MediaBrowserCompat$ItemReceiver = bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new IconCompatParcelizer((byte) 0));
                                if (MediaBrowserCompat$ItemReceiver == null) {
                                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Custom tabs session is null");
                                } else {
                                    boolean read = MediaBrowserCompat$ItemReceiver.read(parse);
                                    if (!read) {
                                        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Custom tabs mayLaunchUrl call returned success = ");
                                        sb.append(read);
                                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                                    } else {
                                        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.write;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Identity was transferred to ");
                                        sb2.append(bulkTransferInputActivity_ViewBinding.MediaDescriptionCompat);
                                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                                    }
                                    bulkTransferInputActivity_ViewBinding.write.unbindService(bulkTransferInputActivity_ViewBinding.IconCompatParcelizer);
                                    bulkTransferInputActivity_ViewBinding.IconCompatParcelizer = null;
                                    bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
                                    bulkTransferInputActivity_ViewBinding.write = null;
                                    BulkTransferInputActivity bulkTransferInputActivity = bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$SearchResultReceiver;
                                    if (bulkTransferInputActivity != null) {
                                        bulkTransferInputActivity.MediaBrowserCompat$CustomActionResultReceiver();
                                        return;
                                    } else {
                                        MyECouponActivity_ViewBinding.write("CustomTabsOneTidTransferHandler: trackingURLSentListener is null");
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    bulkTransferInputActivity_ViewBinding.write.unbindService(bulkTransferInputActivity_ViewBinding.IconCompatParcelizer);
                    bulkTransferInputActivity_ViewBinding.IconCompatParcelizer = null;
                    bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
                    bulkTransferInputActivity_ViewBinding.write = null;
                    BulkTransferInputActivity bulkTransferInputActivity2 = bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$SearchResultReceiver;
                    if (bulkTransferInputActivity2 != null) {
                        bulkTransferInputActivity2.MediaBrowserCompat$CustomActionResultReceiver();
                    } else {
                        MyECouponActivity_ViewBinding.write("CustomTabsOneTidTransferHandler: trackingURLSentListener is null");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    bulkTransferInputActivity_ViewBinding.write.unbindService(bulkTransferInputActivity_ViewBinding.IconCompatParcelizer);
                    bulkTransferInputActivity_ViewBinding.IconCompatParcelizer = null;
                    bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = null;
                    bulkTransferInputActivity_ViewBinding.write = null;
                    BulkTransferInputActivity bulkTransferInputActivity3 = bulkTransferInputActivity_ViewBinding.MediaBrowserCompat$SearchResultReceiver;
                    if (bulkTransferInputActivity3 != null) {
                        bulkTransferInputActivity3.MediaBrowserCompat$CustomActionResultReceiver();
                    } else {
                        MyECouponActivity_ViewBinding.write("CustomTabsOneTidTransferHandler: trackingURLSentListener is null");
                    }
                    throw th;
                }
            }
        };
        this.write = context;
        this.MediaDescriptionCompat = str;
    }

    BulkTransferInputActivity_ViewBinding(Context context, String str, BulkTransferInputActivity bulkTransferInputActivity) {
        this((Context) null, str);
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.MediaBrowserCompat$SearchResultReceiver = bulkTransferInputActivity;
    }

    public final void write() {
        boolean z;
        try {
            z = setOnDismissListener.IconCompatParcelizer(this.write, "com.android.chrome", this.IconCompatParcelizer);
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        if (!z) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Can't bind custom tabs service for com.android.chrome");
            BulkTransferInputActivity bulkTransferInputActivity = this.MediaBrowserCompat$SearchResultReceiver;
            if (bulkTransferInputActivity != null) {
                bulkTransferInputActivity.MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                MyECouponActivity_ViewBinding.write("CustomTabsOneTidTransferHandler: trackingURLSentListener is null");
            }
        }
    }

    /* renamed from: o.BulkTransferInputActivity_ViewBinding$IconCompatParcelizer */
    static class IconCompatParcelizer extends AlertController$RecycleListView.RatingCompat {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }
}

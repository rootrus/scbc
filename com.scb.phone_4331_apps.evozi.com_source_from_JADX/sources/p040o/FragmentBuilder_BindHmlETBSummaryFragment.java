package p040o;

import com.thunderhead.connectivity.GenericNetworkResponse;
import com.thunderhead.connectivity.OneRuntimeServiceApi;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindHmlETBSummaryFragment */
public abstract class FragmentBuilder_BindHmlETBSummaryFragment extends FragmentBuilder_BindHmlMobileListFragment implements FragmentBuilder_BindHmlEkycFragment, loadInBackground {
    public Boolean AlertController$RecycleListView;
    volatile boolean MediaBrowserCompat$MediaItem;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public List<FragmentBuilder_BindHmlLandingFragment> f3144x50fd9e4a = new ArrayList();
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public long MediaSessionCompat$ResultReceiverWrapper;
    public boolean MediaSessionCompat$Token = true;
    volatile C6550x270b6bf5 ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public String RatingCompat;
    public String setHasDecor;
    private AtomicBoolean write = new AtomicBoolean();

    /* access modifiers changed from: package-private */
    public abstract boolean MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream);

    /* access modifiers changed from: package-private */
    public abstract IconCompatParcelizer MediaMetadataCompat();

    static /* synthetic */ void read(FragmentBuilder_BindHmlETBSummaryFragment fragmentBuilder_BindHmlETBSummaryFragment) {
        synchronized (fragmentBuilder_BindHmlETBSummaryFragment) {
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Notification ");
            sb.append(fragmentBuilder_BindHmlETBSummaryFragment.hashCode());
            sb.append(", int. ");
            sb.append(fragmentBuilder_BindHmlETBSummaryFragment.RatingCompat);
            sb.append(" failed to load image asset");
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            if (fragmentBuilder_BindHmlETBSummaryFragment.ParcelableVolumeInfo != null) {
                fragmentBuilder_BindHmlETBSummaryFragment.ParcelableVolumeInfo.write(fragmentBuilder_BindHmlETBSummaryFragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void write() {
        this.MediaBrowserCompat$MediaItem = true;
        this.ParcelableVolumeInfo = null;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(C6550x270b6bf5 fragmentBuilder_BindHmlETBSummaryFragment$MediaBrowserCompat$ItemReceiver) {
        this.ParcelableVolumeInfo = fragmentBuilder_BindHmlETBSummaryFragment$MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$MediaItem() {
        synchronized (this) {
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Notification ");
            sb.append(hashCode());
            sb.append(", int. ");
            sb.append(this.RatingCompat);
            sb.append(" is ready");
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            this.write.set(true);
            if (this.ParcelableVolumeInfo != null) {
                this.ParcelableVolumeInfo.IconCompatParcelizer(this);
            }
        }
    }

    /* renamed from: o.FragmentBuilder_BindHmlETBSummaryFragment$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        MINI_NOTIFICATION_BOTTOM("mini-bottom"),
        MINI_NOTIFICATION_TOP("mini-top"),
        FULL("full");
        
        String textValue;

        private IconCompatParcelizer(String str) {
            this.textValue = str;
        }

        public final String toString() {
            return this.textValue;
        }
    }

    /* renamed from: o.FragmentBuilder_BindHmlETBSummaryFragment$write */
    class write extends Thread {
        private write() {
        }

        /* synthetic */ write(FragmentBuilder_BindHmlETBSummaryFragment fragmentBuilder_BindHmlETBSummaryFragment, byte b) {
            this();
        }

        public final void run() {
            super.run();
            OneRuntimeServiceApi padding = FragmentBuilder_BindHmlIssuerLandingFragment.setPadding();
            if (padding != null) {
                GenericNetworkResponse optimizationImageInputStream = padding.getOptimizationImageInputStream(FragmentBuilder_BindHmlETBSummaryFragment.this.MediaDescriptionCompat);
                try {
                    if (!optimizationImageInputStream.isSuccessful()) {
                        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Notification ");
                        sb.append(FragmentBuilder_BindHmlETBSummaryFragment.this.hashCode());
                        sb.append(", int. ");
                        sb.append(FragmentBuilder_BindHmlETBSummaryFragment.this.RatingCompat);
                        sb.append(" is failed to load image bitmap");
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                        MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Response: code ");
                        sb2.append(optimizationImageInputStream.getStatus());
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                        if (optimizationImageInputStream.getDataBody() != null) {
                            MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Body ");
                            sb3.append(optimizationImageInputStream.getDataBody().toString());
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb3.toString());
                        }
                        MyECouponActivity_ViewBinding.write("Failed to load an image asset for an optimization");
                        FragmentBuilder_BindHmlETBSummaryFragment.read(FragmentBuilder_BindHmlETBSummaryFragment.this);
                    } else if (!FragmentBuilder_BindHmlETBSummaryFragment.this.MediaBrowserCompat$CustomActionResultReceiver(optimizationImageInputStream.getBodyAsStream())) {
                        MyECouponActivity_ViewBinding.write write5 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Notification ");
                        sb4.append(FragmentBuilder_BindHmlETBSummaryFragment.this.hashCode());
                        sb4.append(", int. ");
                        sb4.append(FragmentBuilder_BindHmlETBSummaryFragment.this.RatingCompat);
                        sb4.append(" is failed to decode image bitmap");
                        MyECouponActivity_ViewBinding.IconCompatParcelizer(write5, sb4.toString());
                        MyECouponActivity_ViewBinding.write("Failed to decode an image asset for an optimization");
                        FragmentBuilder_BindHmlETBSummaryFragment.read(FragmentBuilder_BindHmlETBSummaryFragment.this);
                    } else if (!FragmentBuilder_BindHmlETBSummaryFragment.this.MediaBrowserCompat$MediaItem) {
                        FragmentBuilder_BindHmlETBSummaryFragment.this.MediaBrowserCompat$MediaItem();
                    } else {
                        optimizationImageInputStream.close();
                        return;
                    }
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.write("Failed to load an image asset for an optimization");
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(e);
                    FragmentBuilder_BindHmlETBSummaryFragment.read(FragmentBuilder_BindHmlETBSummaryFragment.this);
                } catch (OutOfMemoryError e2) {
                    MyECouponActivity_ViewBinding.write("Failed to decode an optimization image");
                    MyECouponActivity_ViewBinding.IconCompatParcelizer((Throwable) e2);
                    FragmentBuilder_BindHmlETBSummaryFragment.read(FragmentBuilder_BindHmlETBSummaryFragment.this);
                } catch (Throwable th) {
                    optimizationImageInputStream.close();
                    throw th;
                }
                optimizationImageInputStream.close();
            }
        }
    }
}

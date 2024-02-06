package p040o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.FragmentBuilder_BindFillInformationFragment;

/* renamed from: o.FragmentBuilder_BindEbillSubscriptionReviewFragment */
public final class FragmentBuilder_BindEbillSubscriptionReviewFragment implements Runnable {
    private static final AtomicInteger AlertController$RecycleListView = new AtomicInteger();
    private static final FragmentBuilder_BindFundInvestmentExperienceFragment Keep = new FragmentBuilder_BindFundInvestmentExperienceFragment() {
        public final boolean write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment) {
            return true;
        }

        public final C6534x586e8bf0 write(FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized type of request: ");
            sb.append(fragmentBuilder_BindFixedTransferInputFormFragment);
            throw new IllegalStateException(sb.toString());
        }
    };
    private static final Object PlaybackStateCompat = new Object();
    private static final ThreadLocal<StringBuilder> PlaybackStateCompat$CustomAction = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private int AppCompatDelegateImpl$ListMenuDecorView;
    Future<?> IconCompatParcelizer;
    final FragmentBuilder_BindFixedTransferInputFormFragment MediaBrowserCompat$CustomActionResultReceiver;
    public List<FragmentBuilder_BindEbillSubscriptionInputFragment> MediaBrowserCompat$ItemReceiver;
    final String MediaBrowserCompat$MediaItem;
    public Picasso.read MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    Picasso.IconCompatParcelizer f3138x50fd9e4a;
    public final Picasso MediaDescriptionCompat;
    int MediaMetadataCompat;
    final int MediaSessionCompat$QueueItem = AlertController$RecycleListView.incrementAndGet();
    public Bitmap MediaSessionCompat$ResultReceiverWrapper;
    final FragmentBuilder_BindFundInvestmentExperienceFragment MediaSessionCompat$Token;
    int ParcelableVolumeInfo;
    final int RatingCompat;
    public FragmentBuilder_BindEbillSubscriptionInputFragment read;
    private FragmentBuilder_BindEkycRouterActivity setBackgroundResource;
    private FragmentBuilder_BindFundAwaitingTransactionsTabFragment setContentView;
    private FragmentBuilder_BindEditFavouriteFragment setHasDecor;
    public Exception write;

    private static boolean read(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    private FragmentBuilder_BindEbillSubscriptionReviewFragment(Picasso picasso, FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity, FragmentBuilder_BindEditFavouriteFragment fragmentBuilder_BindEditFavouriteFragment, FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment, FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment, FragmentBuilder_BindFundInvestmentExperienceFragment fragmentBuilder_BindFundInvestmentExperienceFragment) {
        this.MediaDescriptionCompat = picasso;
        this.setBackgroundResource = fragmentBuilder_BindEkycRouterActivity;
        this.setHasDecor = fragmentBuilder_BindEditFavouriteFragment;
        this.setContentView = fragmentBuilder_BindFundAwaitingTransactionsTabFragment;
        this.read = fragmentBuilder_BindEbillSubscriptionInputFragment;
        this.MediaBrowserCompat$MediaItem = fragmentBuilder_BindEbillSubscriptionInputFragment.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat;
        this.f3138x50fd9e4a = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.MediaMetadataCompat;
        this.RatingCompat = fragmentBuilder_BindEbillSubscriptionInputFragment.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaMetadataCompat = fragmentBuilder_BindEbillSubscriptionInputFragment.MediaMetadataCompat;
        this.MediaSessionCompat$Token = fragmentBuilder_BindFundInvestmentExperienceFragment;
        this.ParcelableVolumeInfo = fragmentBuilder_BindFundInvestmentExperienceFragment.write();
    }

    public final void run() {
        String str;
        FragmentBuilder_BindFundOnboardingTermsAndConditionsFragment fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment;
        String str2;
        String str3 = "Picasso-Idle";
        try {
            FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            Uri uri = fragmentBuilder_BindFixedTransferInputFormFragment.AlertController$RecycleListView;
            if (uri != null) {
                str2 = String.valueOf(uri.getPath());
            } else {
                str2 = Integer.toHexString(fragmentBuilder_BindFixedTransferInputFormFragment.MediaBrowserCompat$SearchResultReceiver);
            }
            StringBuilder sb = PlaybackStateCompat$CustomAction.get();
            sb.ensureCapacity(str2.length() + 8);
            sb.replace(8, sb.length(), str2);
            Thread.currentThread().setName(sb.toString());
            if (this.MediaDescriptionCompat.RatingCompat) {
                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Hunter", "executing", FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(this));
            }
            Bitmap write2 = write();
            this.MediaSessionCompat$ResultReceiverWrapper = write2;
            if (write2 == null) {
                Handler handler = this.setBackgroundResource.IconCompatParcelizer;
                handler.sendMessage(handler.obtainMessage(6, this));
            } else {
                Handler handler2 = this.setBackgroundResource.IconCompatParcelizer;
                handler2.sendMessage(handler2.obtainMessage(4, this));
            }
        } catch (FragmentBuilder_BindFillInformationFragment.read e) {
            str = str3;
            if (!FragmentBuilder_BindFatcaLandingQuestionFragment.IconCompatParcelizer(e.write) || e.IconCompatParcelizer != 504) {
                this.write = e;
            }
            Handler handler3 = this.setBackgroundResource.IconCompatParcelizer;
            handler3.sendMessage(handler3.obtainMessage(6, this));
        } catch (IOException e2) {
            str = str3;
            this.write = e2;
            Handler handler4 = this.setBackgroundResource.IconCompatParcelizer;
            handler4.sendMessageDelayed(handler4.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e3) {
            StringWriter stringWriter = new StringWriter();
            FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment = this.setContentView;
            int write3 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.read.write();
            int RatingCompat2 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.read.RatingCompat();
            long j = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaBrowserCompat$ItemReceiver;
            long j2 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaMetadataCompat;
            long j3 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaBrowserCompat$SearchResultReceiver;
            long j4 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaSessionCompat$QueueItem;
            StringWriter stringWriter2 = stringWriter;
            long j5 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.f3142x50fd9e4a;
            str = str3;
            OutOfMemoryError outOfMemoryError = e3;
            long j6 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.IconCompatParcelizer;
            long j7 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaBrowserCompat$CustomActionResultReceiver;
            int i = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.MediaDescriptionCompat;
            long j8 = j4;
            int i2 = fragmentBuilder_BindFundAwaitingTransactionsTabFragment.RatingCompat;
            new FragmentBuilder_BindFundOnboardingTermsAndConditionsFragment(write3, RatingCompat2, j, j2, j3, j8, j5, fragmentBuilder_BindFundAwaitingTransactionsTabFragment.write, j6, j7, i, i2, fragmentBuilder_BindFundAwaitingTransactionsTabFragment.ParcelableVolumeInfo, System.currentTimeMillis());
            StringWriter stringWriter3 = stringWriter2;
            PrintWriter printWriter = new PrintWriter(stringWriter3);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            FragmentBuilder_BindFundOnboardingTermsAndConditionsFragment fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2 = fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment;
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaDescriptionCompat);
            printWriter.print("  Cache Size: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaBrowserCompat$SearchResultReceiver);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaBrowserCompat$SearchResultReceiver) / ((float) fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaDescriptionCompat)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.write);
            printWriter.print("  Cache Misses: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaBrowserCompat$CustomActionResultReceiver);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaBrowserCompat$MediaItem);
            printWriter.print("  Total Download Size: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.RatingCompat);
            printWriter.print("  Average Download Size: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.read);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaMetadataCompat);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaSessionCompat$Token);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.ParcelableVolumeInfo);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaSessionCompat$ResultReceiverWrapper);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.MediaBrowserCompat$ItemReceiver);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(fragmentBuilder_BindFundOnboardingTermsAndConditionsFragment2.IconCompatParcelizer);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            RuntimeException runtimeException = new RuntimeException(stringWriter3.toString(), outOfMemoryError);
            this.write = runtimeException;
            Handler handler5 = this.setBackgroundResource.IconCompatParcelizer;
            handler5.sendMessage(handler5.obtainMessage(6, this));
        } catch (Exception e4) {
            this.write = e4;
            Handler handler6 = this.setBackgroundResource.IconCompatParcelizer;
            handler6.sendMessage(handler6.obtainMessage(6, this));
        } catch (Throwable th) {
            th = th;
            str3 = str;
            Thread.currentThread().setName(str3);
            throw th;
        }
        str = str3;
        Thread.currentThread().setName(str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0308, code lost:
        r5 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030b, code lost:
        if (r5 == 2) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x030e, code lost:
        if (r5 == 7) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0311, code lost:
        if (r5 == 4) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0313, code lost:
        if (r5 == 5) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0315, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0317, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0318, code lost:
        if (r4 == 0) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x031a, code lost:
        r11 = r27;
        r11.preRotate((float) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0320, code lost:
        if (r4 == 90) goto L_0x0324;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0322, code lost:
        if (r4 != 270) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0324, code lost:
        r1 = 1;
        r29 = r15;
        r15 = r14;
        r14 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x032b, code lost:
        r11 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x032d, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x032e, code lost:
        if (r5 == r1) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0330, code lost:
        r11.postScale((float) r5, 1.0f);
     */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x041e A[Catch:{ all -> 0x02e0, all -> 0x0477 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x042b A[Catch:{ all -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x043e A[Catch:{ all -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0440 A[Catch:{ all -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0443 A[Catch:{ all -> 0x0475 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0136 A[SYNTHETIC, Splitter:B:82:0x0136] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap write() throws java.io.IOException {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.RatingCompat
            boolean r0 = p040o.FragmentBuilder_BindFatcaQuestionnaireFragment.MediaBrowserCompat$CustomActionResultReceiver(r0)
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0037
            o.FragmentBuilder_BindEditFavouriteFragment r0 = r1.setHasDecor
            java.lang.String r4 = r1.MediaBrowserCompat$MediaItem
            android.graphics.Bitmap r0 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4)
            if (r0 == 0) goto L_0x0038
            o.FragmentBuilder_BindFundAwaitingTransactionsTabFragment r2 = r1.setContentView
            android.os.Handler r2 = r2.MediaBrowserCompat$MediaItem
            r2.sendEmptyMessage(r3)
            com.squareup.picasso.Picasso$read r2 = com.squareup.picasso.Picasso.read.MEMORY
            r1.MediaBrowserCompat$SearchResultReceiver = r2
            com.squareup.picasso.Picasso r2 = r1.MediaDescriptionCompat
            boolean r2 = r2.RatingCompat
            if (r2 == 0) goto L_0x0036
            o.FragmentBuilder_BindFixedTransferInputFormFragment r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r2.write()
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "decoded"
            java.lang.String r5 = "from cache"
            p040o.FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(r3, r4, r2, r5)
        L_0x0036:
            return r0
        L_0x0037:
            r0 = r2
        L_0x0038:
            int r4 = r1.ParcelableVolumeInfo
            if (r4 != 0) goto L_0x0041
            o.FragmentBuilder_BindFatcaLandingQuestionFragment r4 = p040o.FragmentBuilder_BindFatcaLandingQuestionFragment.OFFLINE
            int r4 = r4.index
            goto L_0x0043
        L_0x0041:
            int r4 = r1.MediaMetadataCompat
        L_0x0043:
            r1.MediaMetadataCompat = r4
            o.FragmentBuilder_BindFundInvestmentExperienceFragment r5 = r1.MediaSessionCompat$Token
            o.FragmentBuilder_BindFixedTransferInputFormFragment r6 = r1.MediaBrowserCompat$CustomActionResultReceiver
            o.FragmentBuilder_BindFundInvestmentExperienceFragment$MediaBrowserCompat$CustomActionResultReceiver r4 = r5.write(r6, r4)
            r5 = 1
            if (r4 == 0) goto L_0x00e1
            com.squareup.picasso.Picasso$read r0 = r4.IconCompatParcelizer
            r1.MediaBrowserCompat$SearchResultReceiver = r0
            int r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r1.AppCompatDelegateImpl$ListMenuDecorView = r0
            android.graphics.Bitmap r0 = r4.read
            if (r0 != 0) goto L_0x00e1
            o.HowToAddAccountStep2Activity r4 = r4.MediaBrowserCompat$ItemReceiver
            o.FragmentBuilder_BindFixedTransferInputFormFragment r11 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00dc }
            o.NsipPartnerPaymentOtpActivity r0 = p040o.onSubmit.read((p040o.HowToAddAccountStep2Activity) r4)     // Catch:{ all -> 0x00dc }
            boolean r6 = p040o.FragmentBuilder_BindFundRedeemSearchListFragment.write((p040o.NsipPartnerPaymentOtpActivity) r0)     // Catch:{ all -> 0x00dc }
            boolean r7 = r11.MediaDescriptionCompat     // Catch:{ all -> 0x00dc }
            if (r7 == 0) goto L_0x0074
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00dc }
            r8 = 21
            if (r7 >= r8) goto L_0x0074
            r7 = r5
            goto L_0x0075
        L_0x0074:
            r7 = r3
        L_0x0075:
            android.graphics.BitmapFactory$Options r12 = p040o.FragmentBuilder_BindFundInvestmentExperienceFragment.read(r11)     // Catch:{ all -> 0x00dc }
            if (r12 == 0) goto L_0x0081
            boolean r8 = r12.inJustDecodeBounds     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x0081
            r8 = r5
            goto L_0x0082
        L_0x0081:
            r8 = r3
        L_0x0082:
            if (r6 != 0) goto L_0x00bd
            if (r7 != 0) goto L_0x00bd
            java.io.InputStream r0 = r0.MediaDescriptionCompat()     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x00ae
            o.FragmentBuilder_BindFindUsFragment r13 = new o.FragmentBuilder_BindFindUsFragment     // Catch:{ all -> 0x00dc }
            r13.<init>(r0)     // Catch:{ all -> 0x00dc }
            r13.IconCompatParcelizer = r3     // Catch:{ all -> 0x00dc }
            r0 = 1024(0x400, float:1.435E-42)
            long r14 = r13.MediaBrowserCompat$ItemReceiver(r0)     // Catch:{ all -> 0x00dc }
            android.graphics.BitmapFactory.decodeStream(r13, r2, r12)     // Catch:{ all -> 0x00dc }
            int r6 = r11.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x00dc }
            int r7 = r11.setHasDecor     // Catch:{ all -> 0x00dc }
            int r8 = r12.outWidth     // Catch:{ all -> 0x00dc }
            int r9 = r12.outHeight     // Catch:{ all -> 0x00dc }
            r10 = r12
            p040o.FragmentBuilder_BindFundInvestmentExperienceFragment.IconCompatParcelizer(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00dc }
            r13.write(r14)     // Catch:{ all -> 0x00dc }
            r13.IconCompatParcelizer = r5     // Catch:{ all -> 0x00dc }
            r0 = r13
        L_0x00ae:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0, r2, r12)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00b5
            goto L_0x00d8
        L_0x00b5:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = "Failed to decode stream."
            r0.<init>(r2)     // Catch:{ all -> 0x00dc }
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00bd:
            byte[] r0 = r0.RatingCompat()     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x00d3
            int r2 = r0.length     // Catch:{ all -> 0x00dc }
            android.graphics.BitmapFactory.decodeByteArray(r0, r3, r2, r12)     // Catch:{ all -> 0x00dc }
            int r6 = r11.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x00dc }
            int r7 = r11.setHasDecor     // Catch:{ all -> 0x00dc }
            int r8 = r12.outWidth     // Catch:{ all -> 0x00dc }
            int r9 = r12.outHeight     // Catch:{ all -> 0x00dc }
            r10 = r12
            p040o.FragmentBuilder_BindFundInvestmentExperienceFragment.IconCompatParcelizer(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00dc }
        L_0x00d3:
            int r2 = r0.length     // Catch:{ all -> 0x00dc }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r2, r12)     // Catch:{ all -> 0x00dc }
        L_0x00d8:
            r4.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00e0:
            throw r0
        L_0x00e1:
            if (r0 == 0) goto L_0x0481
            com.squareup.picasso.Picasso r2 = r1.MediaDescriptionCompat
            boolean r2 = r2.RatingCompat
            if (r2 == 0) goto L_0x00f6
            o.FragmentBuilder_BindFixedTransferInputFormFragment r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r2.write()
            java.lang.String r4 = "Hunter"
            java.lang.String r6 = "decoded"
            p040o.FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(r4, r6, r2)
        L_0x00f6:
            o.FragmentBuilder_BindFundAwaitingTransactionsTabFragment r2 = r1.setContentView
            int r4 = p040o.FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver((android.graphics.Bitmap) r0)
            android.os.Handler r2 = r2.MediaBrowserCompat$MediaItem
            r6 = 2
            android.os.Message r4 = r2.obtainMessage(r6, r4, r3)
            r2.sendMessage(r4)
            o.FragmentBuilder_BindFixedTransferInputFormFragment r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r2.PlaybackStateCompat$CustomAction
            if (r4 != 0) goto L_0x0112
            int r4 = r2.setHasDecor
            if (r4 != 0) goto L_0x0112
            r4 = r3
            goto L_0x0113
        L_0x0112:
            r4 = r5
        L_0x0113:
            r7 = 0
            if (r4 != 0) goto L_0x011e
            float r4 = r2.MediaSessionCompat$QueueItem
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x011e
            r4 = r3
            goto L_0x011f
        L_0x011e:
            r4 = r5
        L_0x011f:
            if (r4 != 0) goto L_0x012c
            java.util.List<o.FragmentBuilder_BindFundSelectAccountFragment> r2 = r2.Keep
            if (r2 == 0) goto L_0x0127
            r2 = r5
            goto L_0x0128
        L_0x0127:
            r2 = r3
        L_0x0128:
            if (r2 != 0) goto L_0x012c
            r2 = r3
            goto L_0x012d
        L_0x012c:
            r2 = r5
        L_0x012d:
            if (r2 != 0) goto L_0x0133
            int r2 = r1.AppCompatDelegateImpl$ListMenuDecorView
            if (r2 == 0) goto L_0x0481
        L_0x0133:
            java.lang.Object r2 = PlaybackStateCompat
            monitor-enter(r2)
            o.FragmentBuilder_BindFixedTransferInputFormFragment r4 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x047b }
            int r8 = r4.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x047b }
            if (r8 != 0) goto L_0x0142
            int r8 = r4.setHasDecor     // Catch:{ all -> 0x047b }
            if (r8 != 0) goto L_0x0142
            r8 = r3
            goto L_0x0143
        L_0x0142:
            r8 = r5
        L_0x0143:
            if (r8 != 0) goto L_0x014d
            float r4 = r4.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x047b }
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x014d
            r4 = r3
            goto L_0x014e
        L_0x014d:
            r4 = r5
        L_0x014e:
            if (r4 != 0) goto L_0x015b
            int r4 = r1.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ all -> 0x047b }
            if (r4 == 0) goto L_0x0155
            goto L_0x015b
        L_0x0155:
            r3 = r1
            r18 = r2
            r1 = r5
            goto L_0x0438
        L_0x015b:
            o.FragmentBuilder_BindFixedTransferInputFormFragment r4 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x047b }
            int r8 = r1.AppCompatDelegateImpl$ListMenuDecorView     // Catch:{ all -> 0x047b }
            int r9 = r0.getWidth()     // Catch:{ all -> 0x047b }
            int r10 = r0.getHeight()     // Catch:{ all -> 0x047b }
            boolean r11 = r4.RatingCompat     // Catch:{ all -> 0x047b }
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch:{ all -> 0x047b }
            r12.<init>()     // Catch:{ all -> 0x047b }
            int r14 = r4.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x047b }
            if (r14 != 0) goto L_0x0178
            int r14 = r4.setHasDecor     // Catch:{ all -> 0x047b }
            if (r14 != 0) goto L_0x0178
            r14 = r3
            goto L_0x0179
        L_0x0178:
            r14 = r5
        L_0x0179:
            if (r14 != 0) goto L_0x0183
            float r14 = r4.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x047b }
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0183
            r14 = r3
            goto L_0x0184
        L_0x0183:
            r14 = r5
        L_0x0184:
            if (r14 != 0) goto L_0x0192
            if (r8 != 0) goto L_0x0192
            r16 = r0
            r18 = r2
            r1 = r5
            r4 = r9
            r5 = r10
            r11 = r12
            goto L_0x040f
        L_0x0192:
            int r14 = r4.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x047b }
            int r15 = r4.setHasDecor     // Catch:{ all -> 0x047b }
            float r3 = r4.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x047b }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x02e5
            double r14 = (double) r3
            double r16 = java.lang.Math.toRadians(r14)     // Catch:{ all -> 0x02e0 }
            double r16 = java.lang.Math.cos(r16)     // Catch:{ all -> 0x02e0 }
            double r14 = java.lang.Math.toRadians(r14)     // Catch:{ all -> 0x02e0 }
            double r14 = java.lang.Math.sin(r14)     // Catch:{ all -> 0x02e0 }
            boolean r7 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x02e0 }
            if (r7 == 0) goto L_0x025a
            float r7 = r4.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x02e0 }
            float r13 = r4.ParcelableVolumeInfo     // Catch:{ all -> 0x02e0 }
            r12.setRotate(r3, r7, r13)     // Catch:{ all -> 0x02e0 }
            float r3 = r4.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x02e0 }
            double r5 = (double) r3     // Catch:{ all -> 0x02e0 }
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r18 = r18 - r16
            double r5 = r5 * r18
            float r3 = r4.ParcelableVolumeInfo     // Catch:{ all -> 0x02e0 }
            r20 = r8
            double r7 = (double) r3     // Catch:{ all -> 0x02e0 }
            double r7 = r7 * r14
            double r5 = r5 + r7
            float r3 = r4.ParcelableVolumeInfo     // Catch:{ all -> 0x02e0 }
            double r7 = (double) r3     // Catch:{ all -> 0x02e0 }
            double r7 = r7 * r18
            float r3 = r4.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x02e0 }
            r18 = r2
            double r1 = (double) r3
            double r1 = r1 * r14
            double r7 = r7 - r1
            int r1 = r4.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            double r1 = (double) r1     // Catch:{ all -> 0x0477 }
            double r1 = r1 * r16
            double r1 = r1 + r5
            int r3 = r4.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            r19 = r10
            r21 = r11
            double r10 = (double) r3     // Catch:{ all -> 0x0477 }
            double r10 = r10 * r14
            double r10 = r10 + r7
            int r3 = r4.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            r22 = r14
            double r13 = (double) r3     // Catch:{ all -> 0x0477 }
            double r13 = r13 * r16
            double r13 = r13 + r5
            int r3 = r4.setHasDecor     // Catch:{ all -> 0x0477 }
            r24 = r9
            r25 = r10
            double r9 = (double) r3     // Catch:{ all -> 0x0477 }
            double r9 = r9 * r22
            double r13 = r13 - r9
            int r3 = r4.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            double r9 = (double) r3     // Catch:{ all -> 0x0477 }
            double r9 = r9 * r22
            double r9 = r9 + r7
            int r3 = r4.setHasDecor     // Catch:{ all -> 0x0477 }
            r27 = r12
            double r11 = (double) r3     // Catch:{ all -> 0x0477 }
            double r11 = r11 * r16
            double r9 = r9 + r11
            int r3 = r4.setHasDecor     // Catch:{ all -> 0x0477 }
            double r11 = (double) r3     // Catch:{ all -> 0x0477 }
            double r11 = r11 * r22
            double r11 = r5 - r11
            int r3 = r4.setHasDecor     // Catch:{ all -> 0x0477 }
            r28 = r4
            double r3 = (double) r3     // Catch:{ all -> 0x0477 }
            double r3 = r3 * r16
            double r3 = r3 + r7
            r16 = r3
            double r3 = java.lang.Math.max(r5, r1)     // Catch:{ all -> 0x0477 }
            double r3 = java.lang.Math.max(r13, r3)     // Catch:{ all -> 0x0477 }
            double r3 = java.lang.Math.max(r11, r3)     // Catch:{ all -> 0x0477 }
            double r1 = java.lang.Math.min(r5, r1)     // Catch:{ all -> 0x0477 }
            double r1 = java.lang.Math.min(r13, r1)     // Catch:{ all -> 0x0477 }
            double r1 = java.lang.Math.min(r11, r1)     // Catch:{ all -> 0x0477 }
            r5 = r25
            double r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0477 }
            double r11 = java.lang.Math.max(r9, r11)     // Catch:{ all -> 0x0477 }
            r13 = r16
            double r11 = java.lang.Math.max(r13, r11)     // Catch:{ all -> 0x0477 }
            double r5 = java.lang.Math.min(r7, r5)     // Catch:{ all -> 0x0477 }
            double r5 = java.lang.Math.min(r9, r5)     // Catch:{ all -> 0x0477 }
            double r5 = java.lang.Math.min(r13, r5)     // Catch:{ all -> 0x0477 }
            double r3 = r3 - r1
            double r1 = java.lang.Math.floor(r3)     // Catch:{ all -> 0x0477 }
            int r14 = (int) r1     // Catch:{ all -> 0x0477 }
            double r11 = r11 - r5
            double r1 = java.lang.Math.floor(r11)     // Catch:{ all -> 0x0477 }
            int r15 = (int) r1     // Catch:{ all -> 0x0477 }
            r16 = r0
            r2 = r28
            goto L_0x02f4
        L_0x025a:
            r18 = r2
            r28 = r4
            r20 = r8
            r24 = r9
            r19 = r10
            r21 = r11
            r1 = r12
            r22 = r14
            r1.setRotate(r3)     // Catch:{ all -> 0x0477 }
            r2 = r28
            int r3 = r2.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            double r3 = (double) r3     // Catch:{ all -> 0x0477 }
            double r3 = r3 * r16
            int r5 = r2.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            double r5 = (double) r5     // Catch:{ all -> 0x0477 }
            double r5 = r5 * r22
            int r7 = r2.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            double r7 = (double) r7     // Catch:{ all -> 0x0477 }
            double r7 = r7 * r16
            int r9 = r2.setHasDecor     // Catch:{ all -> 0x0477 }
            double r9 = (double) r9     // Catch:{ all -> 0x0477 }
            double r9 = r9 * r22
            double r7 = r7 - r9
            int r9 = r2.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x0477 }
            double r9 = (double) r9     // Catch:{ all -> 0x0477 }
            double r9 = r9 * r22
            int r11 = r2.setHasDecor     // Catch:{ all -> 0x0477 }
            double r11 = (double) r11     // Catch:{ all -> 0x0477 }
            double r11 = r11 * r16
            double r9 = r9 + r11
            int r11 = r2.setHasDecor     // Catch:{ all -> 0x0477 }
            double r11 = (double) r11     // Catch:{ all -> 0x0477 }
            double r11 = r11 * r22
            double r11 = -r11
            int r13 = r2.setHasDecor     // Catch:{ all -> 0x0477 }
            double r13 = (double) r13     // Catch:{ all -> 0x0477 }
            double r13 = r13 * r16
            r16 = r0
            r27 = r1
            r0 = 0
            r22 = r13
            double r13 = java.lang.Math.max(r0, r3)     // Catch:{ all -> 0x0477 }
            double r13 = java.lang.Math.max(r7, r13)     // Catch:{ all -> 0x0477 }
            double r13 = java.lang.Math.max(r11, r13)     // Catch:{ all -> 0x0477 }
            double r3 = java.lang.Math.min(r0, r3)     // Catch:{ all -> 0x0477 }
            double r3 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0477 }
            double r3 = java.lang.Math.min(r11, r3)     // Catch:{ all -> 0x0477 }
            double r7 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x0477 }
            double r7 = java.lang.Math.max(r9, r7)     // Catch:{ all -> 0x0477 }
            r11 = r22
            double r7 = java.lang.Math.max(r11, r7)     // Catch:{ all -> 0x0477 }
            double r0 = java.lang.Math.min(r0, r5)     // Catch:{ all -> 0x0477 }
            double r0 = java.lang.Math.min(r9, r0)     // Catch:{ all -> 0x0477 }
            double r0 = java.lang.Math.min(r11, r0)     // Catch:{ all -> 0x0477 }
            double r13 = r13 - r3
            double r3 = java.lang.Math.floor(r13)     // Catch:{ all -> 0x0477 }
            int r14 = (int) r3     // Catch:{ all -> 0x0477 }
            double r7 = r7 - r0
            double r0 = java.lang.Math.floor(r7)     // Catch:{ all -> 0x0477 }
            int r15 = (int) r0     // Catch:{ all -> 0x0477 }
            goto L_0x02f4
        L_0x02e0:
            r0 = move-exception
            r18 = r2
            goto L_0x0478
        L_0x02e5:
            r16 = r0
            r18 = r2
            r2 = r4
            r20 = r8
            r24 = r9
            r19 = r10
            r21 = r11
            r27 = r12
        L_0x02f4:
            r0 = 5
            if (r20 == 0) goto L_0x0337
            r1 = 270(0x10e, float:3.78E-43)
            r3 = 90
            switch(r20) {
                case 3: goto L_0x0306;
                case 4: goto L_0x0306;
                case 5: goto L_0x0304;
                case 6: goto L_0x0304;
                case 7: goto L_0x0302;
                case 8: goto L_0x0302;
                default: goto L_0x02fe;
            }     // Catch:{ all -> 0x0477 }
        L_0x02fe:
            r5 = r20
            r4 = 0
            goto L_0x030a
        L_0x0302:
            r4 = r1
            goto L_0x0308
        L_0x0304:
            r4 = r3
            goto L_0x0308
        L_0x0306:
            r4 = 180(0xb4, float:2.52E-43)
        L_0x0308:
            r5 = r20
        L_0x030a:
            r6 = 2
            if (r5 == r6) goto L_0x0317
            r6 = 7
            if (r5 == r6) goto L_0x0317
            r6 = 4
            if (r5 == r6) goto L_0x0317
            if (r5 == r0) goto L_0x0317
            r5 = 1
            goto L_0x0318
        L_0x0317:
            r5 = -1
        L_0x0318:
            if (r4 == 0) goto L_0x032b
            float r6 = (float) r4     // Catch:{ all -> 0x0477 }
            r11 = r27
            r11.preRotate(r6)     // Catch:{ all -> 0x0477 }
            if (r4 == r3) goto L_0x0324
            if (r4 != r1) goto L_0x032d
        L_0x0324:
            r1 = 1
            r29 = r15
            r15 = r14
            r14 = r29
            goto L_0x032e
        L_0x032b:
            r11 = r27
        L_0x032d:
            r1 = 1
        L_0x032e:
            if (r5 == r1) goto L_0x033a
            float r3 = (float) r5     // Catch:{ all -> 0x0477 }
            r4 = 1065353216(0x3f800000, float:1.0)
            r11.postScale(r3, r4)     // Catch:{ all -> 0x0477 }
            goto L_0x033a
        L_0x0337:
            r11 = r27
            r1 = 1
        L_0x033a:
            boolean r3 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x03c4
            if (r14 == 0) goto L_0x0348
            float r3 = (float) r14     // Catch:{ all -> 0x0477 }
            r4 = r24
            float r5 = (float) r4     // Catch:{ all -> 0x0477 }
            float r3 = r3 / r5
            r5 = r19
            goto L_0x034f
        L_0x0348:
            r4 = r24
            float r3 = (float) r15     // Catch:{ all -> 0x0477 }
            r5 = r19
            float r6 = (float) r5     // Catch:{ all -> 0x0477 }
            float r3 = r3 / r6
        L_0x034f:
            if (r15 == 0) goto L_0x0354
            float r6 = (float) r15     // Catch:{ all -> 0x0477 }
            float r8 = (float) r5     // Catch:{ all -> 0x0477 }
            goto L_0x0356
        L_0x0354:
            float r6 = (float) r14     // Catch:{ all -> 0x0477 }
            float r8 = (float) r4     // Catch:{ all -> 0x0477 }
        L_0x0356:
            float r6 = r6 / r8
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0384
            float r0 = (float) r5     // Catch:{ all -> 0x0477 }
            float r6 = r6 / r3
            float r0 = r0 * r6
            double r8 = (double) r0     // Catch:{ all -> 0x0477 }
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ all -> 0x0477 }
            int r0 = (int) r8     // Catch:{ all -> 0x0477 }
            int r6 = r2.write     // Catch:{ all -> 0x0477 }
            r8 = 48
            r6 = r6 & r8
            if (r6 != r8) goto L_0x036d
            r10 = 0
            goto L_0x037b
        L_0x036d:
            int r2 = r2.write     // Catch:{ all -> 0x0477 }
            r6 = 80
            r2 = r2 & r6
            if (r2 != r6) goto L_0x0377
            int r10 = r5 - r0
            goto L_0x037b
        L_0x0377:
            int r10 = r5 - r0
            r2 = 2
            int r10 = r10 / r2
        L_0x037b:
            float r2 = (float) r15     // Catch:{ all -> 0x0477 }
            float r6 = (float) r0     // Catch:{ all -> 0x0477 }
            float r6 = r2 / r6
            r2 = r4
            r7 = r21
            r9 = 0
            goto L_0x03b6
        L_0x0384:
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x03af
            float r8 = (float) r4     // Catch:{ all -> 0x0477 }
            float r3 = r3 / r6
            float r8 = r8 * r3
            double r8 = (double) r8     // Catch:{ all -> 0x0477 }
            double r8 = java.lang.Math.ceil(r8)     // Catch:{ all -> 0x0477 }
            int r3 = (int) r8     // Catch:{ all -> 0x0477 }
            int r8 = r2.write     // Catch:{ all -> 0x0477 }
            r9 = 3
            r8 = r8 & r9
            if (r8 != r9) goto L_0x0399
            r9 = 0
            goto L_0x03a5
        L_0x0399:
            int r2 = r2.write     // Catch:{ all -> 0x0477 }
            r2 = r2 & r0
            if (r2 != r0) goto L_0x03a1
            int r9 = r4 - r3
            goto L_0x03a5
        L_0x03a1:
            int r9 = r4 - r3
            r0 = 2
            int r9 = r9 / r0
        L_0x03a5:
            float r0 = (float) r14     // Catch:{ all -> 0x0477 }
            float r2 = (float) r3     // Catch:{ all -> 0x0477 }
            float r0 = r0 / r2
            r2 = r3
            r7 = r21
            r10 = 0
            r3 = r0
            r0 = r5
            goto L_0x03b6
        L_0x03af:
            r2 = r4
            r0 = r5
            r3 = r6
            r7 = r21
            r9 = 0
            r10 = 0
        L_0x03b6:
            boolean r4 = read(r7, r4, r5, r14, r15)     // Catch:{ all -> 0x0477 }
            if (r4 == 0) goto L_0x03bf
            r11.preScale(r3, r6)     // Catch:{ all -> 0x0477 }
        L_0x03bf:
            r7 = r9
            r8 = r10
            r10 = r0
            r9 = r2
            goto L_0x0413
        L_0x03c4:
            r5 = r19
            r7 = r21
            r4 = r24
            boolean r0 = r2.read     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x03ee
            if (r14 == 0) goto L_0x03d3
            float r0 = (float) r14     // Catch:{ all -> 0x0477 }
            float r2 = (float) r4     // Catch:{ all -> 0x0477 }
            goto L_0x03d5
        L_0x03d3:
            float r0 = (float) r15     // Catch:{ all -> 0x0477 }
            float r2 = (float) r5     // Catch:{ all -> 0x0477 }
        L_0x03d5:
            float r0 = r0 / r2
            if (r15 == 0) goto L_0x03db
            float r2 = (float) r15     // Catch:{ all -> 0x0477 }
            float r3 = (float) r5     // Catch:{ all -> 0x0477 }
            goto L_0x03dd
        L_0x03db:
            float r2 = (float) r14     // Catch:{ all -> 0x0477 }
            float r3 = (float) r4     // Catch:{ all -> 0x0477 }
        L_0x03dd:
            float r2 = r2 / r3
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x03e3
            goto L_0x03e4
        L_0x03e3:
            r0 = r2
        L_0x03e4:
            boolean r2 = read(r7, r4, r5, r14, r15)     // Catch:{ all -> 0x0477 }
            if (r2 == 0) goto L_0x040f
            r11.preScale(r0, r0)     // Catch:{ all -> 0x0477 }
            goto L_0x040f
        L_0x03ee:
            if (r14 != 0) goto L_0x03f2
            if (r15 == 0) goto L_0x040f
        L_0x03f2:
            if (r14 != r4) goto L_0x03f6
            if (r15 == r5) goto L_0x040f
        L_0x03f6:
            if (r14 == 0) goto L_0x03fb
            float r0 = (float) r14     // Catch:{ all -> 0x0477 }
            float r2 = (float) r4     // Catch:{ all -> 0x0477 }
            goto L_0x03fd
        L_0x03fb:
            float r0 = (float) r15     // Catch:{ all -> 0x0477 }
            float r2 = (float) r5     // Catch:{ all -> 0x0477 }
        L_0x03fd:
            float r0 = r0 / r2
            if (r15 == 0) goto L_0x0403
            float r2 = (float) r15     // Catch:{ all -> 0x0477 }
            float r3 = (float) r5     // Catch:{ all -> 0x0477 }
            goto L_0x0405
        L_0x0403:
            float r2 = (float) r14     // Catch:{ all -> 0x0477 }
            float r3 = (float) r4     // Catch:{ all -> 0x0477 }
        L_0x0405:
            float r2 = r2 / r3
            boolean r3 = read(r7, r4, r5, r14, r15)     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x040f
            r11.preScale(r0, r2)     // Catch:{ all -> 0x0477 }
        L_0x040f:
            r9 = r4
            r10 = r5
            r7 = 0
            r8 = 0
        L_0x0413:
            r12 = 1
            r6 = r16
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0477 }
            r2 = r16
            if (r0 == r2) goto L_0x0422
            r2.recycle()     // Catch:{ all -> 0x0477 }
            goto L_0x0423
        L_0x0422:
            r0 = r2
        L_0x0423:
            r3 = r30
            com.squareup.picasso.Picasso r2 = r3.MediaDescriptionCompat     // Catch:{ all -> 0x0475 }
            boolean r2 = r2.RatingCompat     // Catch:{ all -> 0x0475 }
            if (r2 == 0) goto L_0x0438
            java.lang.String r2 = "Hunter"
            java.lang.String r4 = "transformed"
            o.FragmentBuilder_BindFixedTransferInputFormFragment r5 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0475 }
            java.lang.String r5 = r5.write()     // Catch:{ all -> 0x0475 }
            p040o.FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(r2, r4, r5)     // Catch:{ all -> 0x0475 }
        L_0x0438:
            o.FragmentBuilder_BindFixedTransferInputFormFragment r2 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0475 }
            java.util.List<o.FragmentBuilder_BindFundSelectAccountFragment> r2 = r2.Keep     // Catch:{ all -> 0x0475 }
            if (r2 == 0) goto L_0x0440
            r5 = r1
            goto L_0x0441
        L_0x0440:
            r5 = 0
        L_0x0441:
            if (r5 == 0) goto L_0x0460
            o.FragmentBuilder_BindFixedTransferInputFormFragment r1 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0475 }
            java.util.List<o.FragmentBuilder_BindFundSelectAccountFragment> r1 = r1.Keep     // Catch:{ all -> 0x0475 }
            android.graphics.Bitmap r0 = MediaBrowserCompat$ItemReceiver(r1, r0)     // Catch:{ all -> 0x0475 }
            com.squareup.picasso.Picasso r1 = r3.MediaDescriptionCompat     // Catch:{ all -> 0x0475 }
            boolean r1 = r1.RatingCompat     // Catch:{ all -> 0x0475 }
            if (r1 == 0) goto L_0x0460
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "transformed"
            o.FragmentBuilder_BindFixedTransferInputFormFragment r4 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0475 }
            java.lang.String r4 = r4.write()     // Catch:{ all -> 0x0475 }
            java.lang.String r5 = "from custom transformations"
            p040o.FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver(r1, r2, r4, r5)     // Catch:{ all -> 0x0475 }
        L_0x0460:
            monitor-exit(r18)
            if (r0 == 0) goto L_0x0484
            o.FragmentBuilder_BindFundAwaitingTransactionsTabFragment r1 = r3.setContentView
            int r2 = p040o.FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver((android.graphics.Bitmap) r0)
            android.os.Handler r1 = r1.MediaBrowserCompat$MediaItem
            r4 = 3
            r5 = 0
            android.os.Message r2 = r1.obtainMessage(r4, r2, r5)
            r1.sendMessage(r2)
            goto L_0x0484
        L_0x0475:
            r0 = move-exception
            goto L_0x047f
        L_0x0477:
            r0 = move-exception
        L_0x0478:
            r3 = r30
            goto L_0x047f
        L_0x047b:
            r0 = move-exception
            r3 = r1
            r18 = r2
        L_0x047f:
            monitor-exit(r18)
            throw r0
        L_0x0481:
            r2 = r0
            r3 = r1
            r0 = r2
        L_0x0484:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindEbillSubscriptionReviewFragment.write():android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment) {
        boolean z = this.MediaDescriptionCompat.RatingCompat;
        FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat;
        if (this.read == null) {
            this.read = fragmentBuilder_BindEbillSubscriptionInputFragment;
            if (z) {
                List<FragmentBuilder_BindEbillSubscriptionInputFragment> list = this.MediaBrowserCompat$ItemReceiver;
                if (list == null || list.isEmpty()) {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Hunter", "joined", fragmentBuilder_BindFixedTransferInputFormFragment.write(), "to empty hunter");
                } else {
                    FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Hunter", "joined", fragmentBuilder_BindFixedTransferInputFormFragment.write(), FragmentBuilder_BindFundRedeemSearchListFragment.write(this, "to "));
                }
            }
        } else {
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                this.MediaBrowserCompat$ItemReceiver = new ArrayList(3);
            }
            this.MediaBrowserCompat$ItemReceiver.add(fragmentBuilder_BindEbillSubscriptionInputFragment);
            if (z) {
                FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Hunter", "joined", fragmentBuilder_BindFixedTransferInputFormFragment.write(), FragmentBuilder_BindFundRedeemSearchListFragment.write(this, "to "));
            }
            Picasso.IconCompatParcelizer iconCompatParcelizer = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.MediaMetadataCompat;
            if (iconCompatParcelizer.ordinal() > this.f3138x50fd9e4a.ordinal()) {
                this.f3138x50fd9e4a = iconCompatParcelizer;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment) {
        boolean z;
        boolean z2 = true;
        if (this.read == fragmentBuilder_BindEbillSubscriptionInputFragment) {
            this.read = null;
            z = true;
        } else {
            List<FragmentBuilder_BindEbillSubscriptionInputFragment> list = this.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                z = list.remove(fragmentBuilder_BindEbillSubscriptionInputFragment);
            } else {
                z = false;
            }
        }
        if (z && fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.MediaMetadataCompat == this.f3138x50fd9e4a) {
            Picasso.IconCompatParcelizer iconCompatParcelizer = Picasso.IconCompatParcelizer.LOW;
            List<FragmentBuilder_BindEbillSubscriptionInputFragment> list2 = this.MediaBrowserCompat$ItemReceiver;
            boolean z3 = list2 != null && !list2.isEmpty();
            if (this.read == null && !z3) {
                z2 = false;
            }
            if (z2) {
                FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment2 = this.read;
                if (fragmentBuilder_BindEbillSubscriptionInputFragment2 != null) {
                    iconCompatParcelizer = fragmentBuilder_BindEbillSubscriptionInputFragment2.RatingCompat.MediaMetadataCompat;
                }
                if (z3) {
                    int size = this.MediaBrowserCompat$ItemReceiver.size();
                    for (int i = 0; i < size; i++) {
                        Picasso.IconCompatParcelizer iconCompatParcelizer2 = this.MediaBrowserCompat$ItemReceiver.get(i).RatingCompat.MediaMetadataCompat;
                        if (iconCompatParcelizer2.ordinal() > iconCompatParcelizer.ordinal()) {
                            iconCompatParcelizer = iconCompatParcelizer2;
                        }
                    }
                }
            }
            this.f3138x50fd9e4a = iconCompatParcelizer;
        }
        if (this.MediaDescriptionCompat.RatingCompat) {
            FragmentBuilder_BindFundRedeemSearchListFragment.MediaBrowserCompat$ItemReceiver("Hunter", "removed", fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat.write(), FragmentBuilder_BindFundRedeemSearchListFragment.write(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean read() {
        Future<?> future;
        if (this.read != null) {
            return false;
        }
        List<FragmentBuilder_BindEbillSubscriptionInputFragment> list = this.MediaBrowserCompat$ItemReceiver;
        if ((list == null || list.isEmpty()) && (future = this.IconCompatParcelizer) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    private static Bitmap MediaBrowserCompat$ItemReceiver(List<FragmentBuilder_BindFundSelectAccountFragment> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final FragmentBuilder_BindFundSelectAccountFragment fragmentBuilder_BindFundSelectAccountFragment = list.get(i);
            try {
                Bitmap write2 = fragmentBuilder_BindFundSelectAccountFragment.write(bitmap);
                if (write2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(fragmentBuilder_BindFundSelectAccountFragment.MediaBrowserCompat$ItemReceiver());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (FragmentBuilder_BindFundSelectAccountFragment MediaBrowserCompat$ItemReceiver2 : list) {
                        sb.append(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver());
                        sb.append(10);
                    }
                    Picasso.write.post(new Runnable() {
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (write2 == bitmap && bitmap.isRecycled()) {
                    Picasso.write.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Transformation ");
                            sb.append(fragmentBuilder_BindFundSelectAccountFragment.MediaBrowserCompat$ItemReceiver());
                            sb.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                } else if (write2 == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = write2;
                } else {
                    Picasso.write.post(new Runnable() {
                        public final void run() {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Transformation ");
                            sb.append(fragmentBuilder_BindFundSelectAccountFragment.MediaBrowserCompat$ItemReceiver());
                            sb.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(sb.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.write.post(new Runnable() {
                    public final void run() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Transformation ");
                        sb.append(fragmentBuilder_BindFundSelectAccountFragment.MediaBrowserCompat$ItemReceiver());
                        sb.append(" crashed with exception.");
                        throw new RuntimeException(sb.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    static FragmentBuilder_BindEbillSubscriptionReviewFragment MediaBrowserCompat$CustomActionResultReceiver(Picasso picasso, FragmentBuilder_BindEkycRouterActivity fragmentBuilder_BindEkycRouterActivity, FragmentBuilder_BindEditFavouriteFragment fragmentBuilder_BindEditFavouriteFragment, FragmentBuilder_BindFundAwaitingTransactionsTabFragment fragmentBuilder_BindFundAwaitingTransactionsTabFragment, FragmentBuilder_BindEbillSubscriptionInputFragment fragmentBuilder_BindEbillSubscriptionInputFragment) {
        FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment = fragmentBuilder_BindEbillSubscriptionInputFragment.RatingCompat;
        List<FragmentBuilder_BindFundInvestmentExperienceFragment> list = picasso.MediaBrowserCompat$SearchResultReceiver;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            FragmentBuilder_BindFundInvestmentExperienceFragment fragmentBuilder_BindFundInvestmentExperienceFragment = list.get(i);
            if (fragmentBuilder_BindFundInvestmentExperienceFragment.write(fragmentBuilder_BindFixedTransferInputFormFragment)) {
                return new FragmentBuilder_BindEbillSubscriptionReviewFragment(picasso, fragmentBuilder_BindEkycRouterActivity, fragmentBuilder_BindEditFavouriteFragment, fragmentBuilder_BindFundAwaitingTransactionsTabFragment, fragmentBuilder_BindEbillSubscriptionInputFragment, fragmentBuilder_BindFundInvestmentExperienceFragment);
            }
        }
        return new FragmentBuilder_BindEbillSubscriptionReviewFragment(picasso, fragmentBuilder_BindEkycRouterActivity, fragmentBuilder_BindEditFavouriteFragment, fragmentBuilder_BindFundAwaitingTransactionsTabFragment, fragmentBuilder_BindEbillSubscriptionInputFragment, Keep);
    }
}

package p040o;

import android.content.SharedPreferences;
import android.view.View;
import java.util.HashSet;
import java.util.Set;
import p040o.AbstractMultimap;
import p040o.setupDialog;

/* renamed from: o.BankingAgentSuccessActivity_ViewBinding */
public final class BankingAgentSuccessActivity_ViewBinding implements findValueIteratorAndKey {
    public static int MediaBrowserCompat$CustomActionResultReceiver;
    private final AbstractMultimap.write MediaBrowserCompat$ItemReceiver;

    public BankingAgentSuccessActivity_ViewBinding() {
    }

    public static void read(View view, boolean z, setTapIcon settapicon) {
        IconCompatParcelizer iconCompatParcelizer;
        if (view != null) {
            Object tag = view.getTag(MediaBrowserCompat$CustomActionResultReceiver);
            if (tag == null) {
                iconCompatParcelizer = new IconCompatParcelizer((byte) 0);
            } else {
                try {
                    iconCompatParcelizer = (IconCompatParcelizer) tag;
                } catch (ClassCastException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while trying to obtain view meta information: ");
                    sb.append(tag.getClass().getName());
                    sb.append(" can't be casted to ");
                    sb.append(IconCompatParcelizer.class.getSimpleName());
                    MyECouponActivity_ViewBinding.write(sb.toString());
                    return;
                }
            }
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = z;
            iconCompatParcelizer.write = settapicon;
            view.setTag(MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r3 = r3.getTag(MediaBrowserCompat$CustomActionResultReceiver);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean write(android.view.View r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r3 = r3.getTag(r1)
            if (r3 == 0) goto L_0x003c
            r1 = r3
            o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer r1 = (p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer) r1     // Catch:{ ClassCastException -> 0x0012 }
            boolean r3 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ ClassCastException -> 0x0012 }
            return r3
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while trying to obtain view meta information: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " can't be casted to "
            r1.append(r3)
            java.lang.Class<o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer> r3 = p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            p040o.MyECouponActivity_ViewBinding.write(r3)
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BankingAgentSuccessActivity_ViewBinding.write(android.view.View):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r3 = r3.getTag(MediaBrowserCompat$CustomActionResultReceiver);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean MediaBrowserCompat$ItemReceiver(android.view.View r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r3 = r3.getTag(r1)
            if (r3 == 0) goto L_0x003c
            r1 = r3
            o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer r1 = (p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer) r1     // Catch:{ ClassCastException -> 0x0012 }
            boolean r3 = r1.IconCompatParcelizer     // Catch:{ ClassCastException -> 0x0012 }
            return r3
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while trying to obtain view meta information: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " can't be casted to "
            r1.append(r3)
            java.lang.Class<o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer> r3 = p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            p040o.MyECouponActivity_ViewBinding.write(r3)
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BankingAgentSuccessActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(android.view.View):boolean");
    }

    public static void write(View view, boolean z, onSaveClick onsaveclick) {
        IconCompatParcelizer iconCompatParcelizer;
        if (view != null) {
            Object tag = view.getTag(MediaBrowserCompat$CustomActionResultReceiver);
            if (tag == null) {
                iconCompatParcelizer = new IconCompatParcelizer((byte) 0);
            } else {
                try {
                    iconCompatParcelizer = (IconCompatParcelizer) tag;
                } catch (ClassCastException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while trying to obtain view meta information: ");
                    sb.append(tag.getClass().getName());
                    sb.append(" can't be casted to ");
                    sb.append(IconCompatParcelizer.class.getSimpleName());
                    MyECouponActivity_ViewBinding.write(sb.toString());
                    return;
                }
            }
            iconCompatParcelizer.IconCompatParcelizer = z;
            iconCompatParcelizer.read = onsaveclick;
            view.setTag(MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r3 = r3.getTag(MediaBrowserCompat$CustomActionResultReceiver);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.onSaveClick read(android.view.View r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r3 = r3.getTag(r1)
            if (r3 == 0) goto L_0x003c
            r1 = r3
            o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer r1 = (p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer) r1     // Catch:{ ClassCastException -> 0x0012 }
            o.onSaveClick r3 = r1.read     // Catch:{ ClassCastException -> 0x0012 }
            return r3
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while trying to obtain view meta information: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " can't be casted to "
            r1.append(r3)
            java.lang.Class<o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer> r3 = p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            p040o.MyECouponActivity_ViewBinding.write(r3)
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BankingAgentSuccessActivity_ViewBinding.read(android.view.View):o.onSaveClick");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r3 = r3.getTag(MediaBrowserCompat$CustomActionResultReceiver);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.setTapIcon MediaBrowserCompat$CustomActionResultReceiver(android.view.View r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r3 = r3.getTag(r1)
            if (r3 == 0) goto L_0x003c
            r1 = r3
            o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer r1 = (p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer) r1     // Catch:{ ClassCastException -> 0x0012 }
            o.setTapIcon r3 = r1.write     // Catch:{ ClassCastException -> 0x0012 }
            return r3
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while trying to obtain view meta information: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " can't be casted to "
            r1.append(r3)
            java.lang.Class<o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer> r3 = p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            p040o.MyECouponActivity_ViewBinding.write(r3)
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BankingAgentSuccessActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(android.view.View):o.setTapIcon");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r3 = r3.getTag(MediaBrowserCompat$CustomActionResultReceiver);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.onClickEditSelectedPurchases IconCompatParcelizer(android.view.View r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r3 = r3.getTag(r1)
            if (r3 == 0) goto L_0x003c
            r1 = r3
            o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer r1 = (p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer) r1     // Catch:{ ClassCastException -> 0x0012 }
            o.onClickEditSelectedPurchases r3 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ ClassCastException -> 0x0012 }
            return r3
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error while trying to obtain view meta information: "
            r1.append(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " can't be casted to "
            r1.append(r3)
            java.lang.Class<o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer> r3 = p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer.class
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            p040o.MyECouponActivity_ViewBinding.write(r3)
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer(android.view.View):o.onClickEditSelectedPurchases");
    }

    /* renamed from: o.BankingAgentSuccessActivity_ViewBinding$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        boolean IconCompatParcelizer;
        public onClickEditSelectedPurchases MediaBrowserCompat$CustomActionResultReceiver;
        boolean MediaBrowserCompat$ItemReceiver;
        onSaveClick read;
        setTapIcon write;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    @HmlPinActivity
    public BankingAgentSuccessActivity_ViewBinding(AbstractMultimap.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final Set<String> read() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getStringSet("CREDIT_CARD_ALL_COACH_MARK_DONE_KEY", new HashSet());
    }

    public final Set<String> MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getStringSet("LIFE_STYLE_TUTORIAL_ALL_DONE_KEY", (Set) null);
    }

    public final boolean IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("ANNOTATION_TUTORIAL_DONE_KEY", false);
    }

    public final boolean write() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("BULK_TRANSFER_TUTORIAL_DONE_KEY", false);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("CARDLESS_ATM_TUTORIAL_DONE_KEY", false);
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("CREDIT_CARD_TUTORIAL_DONE_KEY", false);
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("GIFTING_TUTORIAL_DONE_KEY", false);
    }

    public final boolean RatingCompat() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("JURISTIC_LANDING_COACH_MARK_DONE_KEY", false);
    }

    public final boolean MediaMetadataCompat() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("LOAN_LANDING_BUSINESS_OWNER_COACH_MARK_DONE_KEY", false);
    }

    public final boolean MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("LOAN_LANDING_COACH_MARK_DONE_KEY", false);
    }

    public final boolean MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("NEW_TRANSACTION_TUTORIAL_DONE_KEY", false);
    }

    public final boolean MediaSessionCompat$QueueItem() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("ON_BOARDING_TUTORIAL_DONE_KEY", false);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo15922x50fd9e4a() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("PRE_LOGIN_TUTORIAL_DONE_KEY_AUX", false);
    }

    public final boolean MediaSessionCompat$Token() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("REQUEST_MONEY_TUTORIAL_DONE_KEY", false);
    }

    public final boolean ParcelableVolumeInfo() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("TOPUP_HISTORY_COACH_MARK_DONE_KEY", false);
    }

    public final boolean AlertController$RecycleListView() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.getBoolean("TRANSFER_HISTORY_COACH_MARK_DONE_KEY", false);
    }

    public final void setHasDecor() {
        AbstractMultimap.write write = this.MediaBrowserCompat$ItemReceiver;
        SharedPreferences.Editor edit = write.IconCompatParcelizer.edit();
        Set<String> stringSet = write.IconCompatParcelizer.getStringSet("LIFE_STYLE_TUTORIAL_ALL_DONE_KEY", (Set) null);
        if (write.IconCompatParcelizer.getBoolean("LIFE_STYLE_TUTORIAL_DONE_KEY", false)) {
            for (String contains : stringSet) {
                if (!contains.contains("QR_CODE_SECTION_TUTORIAL")) {
                    stringSet = AbstractMultimap.write.IconCompatParcelizer();
                } else {
                    return;
                }
            }
        } else {
            stringSet = AbstractMultimap.write.IconCompatParcelizer();
        }
        edit.putStringSet("LIFE_STYLE_TUTORIAL_ALL_DONE_KEY", stringSet).apply();
    }

    public final void PlaybackStateCompat$CustomAction() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("ANNOTATION_TUTORIAL_DONE_KEY", true).apply();
    }

    public final void PlaybackStateCompat() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("BULK_TRANSFER_TUTORIAL_DONE_KEY", true).apply();
    }

    public final void Keep() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("CARDLESS_ATM_TUTORIAL_DONE_KEY", true).apply();
    }

    public final void setBackgroundResource() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putStringSet("CREDIT_CARD_ALL_COACH_MARK_DONE_KEY", (Set) show.IconCompatParcelizer((T[]) new String[]{"CREDIT_CARD_COACH_MARK_FIRST_VERSION"}).write(new setupDialog.IconCompatParcelizer(new getArguments<Set<T>>() {
            public final /* synthetic */ Object read() {
                return new HashSet();
            }
        }, new ensureAnimationInfo<Set<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((Set) obj).add(obj2);
            }
        }))).apply();
    }

    public final void AppCompatActivity() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("GIFTING_TUTORIAL_DONE_KEY", true).apply();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("JURISTIC_LANDING_COACH_MARK_DONE_KEY", true).apply();
    }

    public final void AppCompatDialogFragment() {
        AbstractMultimap.write write = this.MediaBrowserCompat$ItemReceiver;
        Set<String> stringSet = write.IconCompatParcelizer.getStringSet("LIFE_STYLE_TUTORIAL_ALL_DONE_KEY", (Set) null);
        SharedPreferences.Editor edit = write.IconCompatParcelizer.edit();
        if (write.IconCompatParcelizer.getBoolean("LIFE_STYLE_TUTORIAL_DONE_KEY", false) && stringSet == null) {
            edit.putStringSet("LIFE_STYLE_TUTORIAL_ALL_DONE_KEY", (Set) show.IconCompatParcelizer((T[]) new String[]{"OLD_LIFE_STYLE_TUTORIAL"}).write(new setupDialog.IconCompatParcelizer(new getArguments<Set<T>>() {
                public final /* synthetic */ Object read() {
                    return new HashSet();
                }
            }, new ensureAnimationInfo<Set<T>, T>() {
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                    ((Set) obj).add(obj2);
                }
            }))).apply();
        }
    }

    public final void setContentView() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("LOAN_LANDING_BUSINESS_OWNER_COACH_MARK_DONE_KEY", true).apply();
    }

    public final void setChecked() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("LOAN_LANDING_COACH_MARK_DONE_KEY", true).apply();
    }

    public final void AppCompatViewInflater() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putStringSet("CREDIT_CARD_ALL_COACH_MARK_DONE_KEY", (Set) show.IconCompatParcelizer((T[]) new String[]{"CREDIT_CARD_COACH_MARK_FIRST_VERSION", "CREDIT_CARD_COACH_MARK_SECOND_VERSION", "CREDIT_CARD_COACH_MARK_JULY_VERSION", "CREDIT_CARD_COACH_MARK_JUNE_2019_VERSION", "CREDIT_CARD_COACH_MARK_NOVEMBER_2019_VERSION"}).write(new setupDialog.IconCompatParcelizer(new getArguments<Set<T>>() {
            public final /* synthetic */ Object read() {
                return new HashSet();
            }
        }, new ensureAnimationInfo<Set<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((Set) obj).add(obj2);
            }
        }))).apply();
    }

    public final void ActionMenuItemView() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("NEW_TRANSACTION_TUTORIAL_DONE_KEY", true).apply();
    }

    public final void setCheckable() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("ON_BOARDING_TUTORIAL_DONE_KEY", true).apply();
    }

    public final void setExpandedFormat() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("PRE_LOGIN_TUTORIAL_DONE_KEY_AUX", true).apply();
    }

    public final void setShortcut() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("REQUEST_MONEY_TUTORIAL_DONE_KEY", true).apply();
    }

    public final void setItemInvoker() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("TOPUP_HISTORY_COACH_MARK_DONE_KEY", true).apply();
    }

    public final void setIcon() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.edit().putBoolean("TRANSFER_HISTORY_COACH_MARK_DONE_KEY", true).apply();
    }
}

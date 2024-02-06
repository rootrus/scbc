package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p039io.beid.beidk.definitions.BeIDParams;

public final class zzmj extends zzhb {

    /* renamed from: ID */
    private static final String f45ID = zza.UNIVERSAL_ANALYTICS.toString();
    private static final List<String> zzamg = Arrays.asList(new String[]{ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, ProductAction.ACTION_PURCHASE, ProductAction.ACTION_REFUND});
    private static final Pattern zzamh = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzami = Pattern.compile("metric(\\d+)");
    private static final Set<String> zzasb = CollectionUtils.setOf("", "0", "false");
    private static final Map<String, String> zzasc = CollectionUtils.mapOf(BeIDParams.BEID_TRANSACTION_ID, "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");
    private static final Map<String, String> zzasd = CollectionUtils.mapOf("name", "&in", "sku", "&ic", "category", "&iv", "price", "&ip", "quantity", "&iq", "currency", "&cu");
    private final zzfj zzapc;
    private final zzgu zzase;
    private Map<String, Object> zzasf;

    public zzmj(Context context, zzfj zzfj) {
        this(new zzgu(context), zzfj);
    }

    private zzmj(zzgu zzgu, zzfj zzfj) {
        this.zzapc = zzfj;
        this.zzase = zzgu;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x023a, code lost:
        r5 = (java.util.Map) r5.get(r4);
        r0 = (java.util.List) r5.get("products");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0249, code lost:
        if (r0 == null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x024b, code lost:
        r6 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0253, code lost:
        if (r6.hasNext() == false) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r7.addProduct(zzj((java.util.Map) r6.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0263, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0270, code lost:
        if (r0.length() != 0) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0272, code lost:
        r0 = "Failed to extract a product from event data. ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0277, code lost:
        r0 = new java.lang.String("Failed to extract a product from event data. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x027c, code lost:
        com.google.android.gms.internal.gtm.zzev.zzav(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0284, code lost:
        if (r5.containsKey("actionField") == false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0286, code lost:
        r0 = (java.util.Map) r5.get("actionField");
        r2 = new com.google.android.gms.analytics.ecommerce.ProductAction(r4);
        r3 = r0.get(org.simpleframework.xml.strategy.Name.MARK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0295, code lost:
        if (r3 == null) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0297, code lost:
        r2.setTransactionId(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x029e, code lost:
        r3 = r0.get("affiliation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02a4, code lost:
        if (r3 == null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02a6, code lost:
        r2.setTransactionAffiliation(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02ad, code lost:
        r3 = r0.get("coupon");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02b3, code lost:
        if (r3 == null) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b5, code lost:
        r2.setTransactionCouponCode(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02bc, code lost:
        r3 = r0.get("list");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02c0, code lost:
        if (r3 == null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02c2, code lost:
        r2.setProductActionList(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c9, code lost:
        r3 = r0.get("option");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02cf, code lost:
        if (r3 == null) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02d1, code lost:
        r2.setCheckoutOptions(java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x02d8, code lost:
        r3 = r0.get("revenue");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02de, code lost:
        if (r3 == null) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02e0, code lost:
        r2.setTransactionRevenue(zzm(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02eb, code lost:
        r3 = r0.get("tax");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02f2, code lost:
        if (r3 == null) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02f4, code lost:
        r2.setTransactionTax(zzm(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02ff, code lost:
        r3 = r0.get("shipping");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0305, code lost:
        if (r3 == null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0307, code lost:
        r2.setTransactionShipping(zzm(r3).doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0312, code lost:
        r0 = r0.get("step");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0318, code lost:
        if (r0 == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x031a, code lost:
        r2.setCheckoutStep(zzn(r0).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0326, code lost:
        r2 = new com.google.android.gms.analytics.ecommerce.ProductAction(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x032b, code lost:
        r7.setProductAction(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x032f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r0 = java.lang.String.valueOf(r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x033c, code lost:
        if (r0.length() != 0) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x033e, code lost:
        r0 = "Failed to extract a product action from event data. ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0345, code lost:
        r0 = new java.lang.String("Failed to extract a product action from event data. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x034c, code lost:
        com.google.android.gms.internal.gtm.zzev.zzav(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0222 A[Catch:{ RuntimeException -> 0x0146, all -> 0x0492 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0358 A[Catch:{ RuntimeException -> 0x0146, all -> 0x0492 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a9 A[Catch:{ RuntimeException -> 0x0146, all -> 0x0492 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b8 A[Catch:{ RuntimeException -> 0x0146, all -> 0x0492 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da A[SYNTHETIC, Splitter:B:62:0x00da] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.zzoa<?> zza(com.google.android.gms.internal.gtm.zzfl r20, com.google.android.gms.internal.gtm.zzoa<?>... r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            java.lang.String r2 = "actionField"
            java.lang.String r3 = "promoView"
            java.lang.String r4 = "&cu"
            java.lang.String r5 = "&t"
            java.lang.String r6 = "promoClick"
            r7 = 1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r7)
            int r8 = r0.length
            r9 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            if (r8 <= 0) goto L_0x001c
            r8 = r7
            goto L_0x001d
        L_0x001c:
            r8 = r9
        L_0x001d:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r8)
            com.google.android.gms.internal.gtm.zzfj r11 = r1.zzapc     // Catch:{ all -> 0x0492 }
            com.google.android.gms.internal.gtm.zzee r11 = r11.zzkt()     // Catch:{ all -> 0x0492 }
            android.os.Bundle r11 = r11.zzkg()     // Catch:{ all -> 0x0492 }
            java.util.Map r11 = com.google.android.gms.internal.gtm.zzoo.zza(r11)     // Catch:{ all -> 0x0492 }
            r1.zzasf = r11     // Catch:{ all -> 0x0492 }
            r11 = r0[r9]     // Catch:{ all -> 0x0492 }
            int r12 = r0.length     // Catch:{ all -> 0x0492 }
            if (r12 <= r7) goto L_0x0038
            r12 = r0[r7]     // Catch:{ all -> 0x0492 }
            goto L_0x0041
        L_0x0038:
            com.google.android.gms.internal.gtm.zzod r12 = new com.google.android.gms.internal.gtm.zzod     // Catch:{ all -> 0x0492 }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0492 }
            r12.<init>(r13)     // Catch:{ all -> 0x0492 }
        L_0x0041:
            int r13 = r0.length     // Catch:{ all -> 0x0492 }
            r14 = 2
            if (r13 <= r14) goto L_0x0048
            r13 = r0[r14]     // Catch:{ all -> 0x0492 }
            goto L_0x004d
        L_0x0048:
            com.google.android.gms.internal.gtm.zzod r13 = new com.google.android.gms.internal.gtm.zzod     // Catch:{ all -> 0x0492 }
            r13.<init>(r10)     // Catch:{ all -> 0x0492 }
        L_0x004d:
            int r14 = r0.length     // Catch:{ all -> 0x0492 }
            r15 = 3
            if (r14 <= r15) goto L_0x0054
            r14 = r0[r15]     // Catch:{ all -> 0x0492 }
            goto L_0x0056
        L_0x0054:
            com.google.android.gms.internal.gtm.zzog r14 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ all -> 0x0492 }
        L_0x0056:
            int r15 = r0.length     // Catch:{ all -> 0x0492 }
            r7 = 4
            if (r15 <= r7) goto L_0x005d
            r7 = r0[r7]     // Catch:{ all -> 0x0492 }
            goto L_0x005f
        L_0x005d:
            com.google.android.gms.internal.gtm.zzog r7 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ all -> 0x0492 }
        L_0x005f:
            int r15 = r0.length     // Catch:{ all -> 0x0492 }
            r9 = 5
            if (r15 <= r9) goto L_0x0066
            r9 = r0[r9]     // Catch:{ all -> 0x0492 }
            goto L_0x006b
        L_0x0066:
            com.google.android.gms.internal.gtm.zzod r9 = new com.google.android.gms.internal.gtm.zzod     // Catch:{ all -> 0x0492 }
            r9.<init>(r10)     // Catch:{ all -> 0x0492 }
        L_0x006b:
            int r15 = r0.length     // Catch:{ all -> 0x0492 }
            r8 = 6
            if (r15 <= r8) goto L_0x0072
            r8 = r0[r8]     // Catch:{ all -> 0x0492 }
            goto L_0x0077
        L_0x0072:
            com.google.android.gms.internal.gtm.zzod r8 = new com.google.android.gms.internal.gtm.zzod     // Catch:{ all -> 0x0492 }
            r8.<init>(r10)     // Catch:{ all -> 0x0492 }
        L_0x0077:
            int r15 = r0.length     // Catch:{ all -> 0x0492 }
            r17 = r5
            r5 = 7
            if (r15 <= r5) goto L_0x0080
            r5 = r0[r5]     // Catch:{ all -> 0x0492 }
            goto L_0x0082
        L_0x0080:
            com.google.android.gms.internal.gtm.zzog r5 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ all -> 0x0492 }
        L_0x0082:
            int r15 = r0.length     // Catch:{ all -> 0x0492 }
            r18 = r13
            r13 = 8
            if (r15 <= r13) goto L_0x008c
            r0 = r0[r13]     // Catch:{ all -> 0x0492 }
            goto L_0x0091
        L_0x008c:
            com.google.android.gms.internal.gtm.zzod r0 = new com.google.android.gms.internal.gtm.zzod     // Catch:{ all -> 0x0492 }
            r0.<init>(r10)     // Catch:{ all -> 0x0492 }
        L_0x0091:
            boolean r10 = r11 instanceof com.google.android.gms.internal.gtm.zzok     // Catch:{ all -> 0x0492 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0492 }
            com.google.android.gms.internal.gtm.zzog r10 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ all -> 0x0492 }
            if (r14 == r10) goto L_0x00a1
            boolean r10 = r14 instanceof com.google.android.gms.internal.gtm.zzok     // Catch:{ all -> 0x0492 }
            if (r10 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r10 = 0
            goto L_0x00a2
        L_0x00a1:
            r10 = 1
        L_0x00a2:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0492 }
            com.google.android.gms.internal.gtm.zzog r10 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ all -> 0x0492 }
            if (r7 == r10) goto L_0x00b0
            boolean r10 = r7 instanceof com.google.android.gms.internal.gtm.zzok     // Catch:{ all -> 0x0492 }
            if (r10 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r10 = 0
            goto L_0x00b1
        L_0x00b0:
            r10 = 1
        L_0x00b1:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0492 }
            com.google.android.gms.internal.gtm.zzog r10 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ all -> 0x0492 }
            if (r5 == r10) goto L_0x00bf
            boolean r10 = r5 instanceof com.google.android.gms.internal.gtm.zzok     // Catch:{ all -> 0x0492 }
            if (r10 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r10 = 0
            goto L_0x00c0
        L_0x00bf:
            r10 = 1
        L_0x00c0:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0492 }
            com.google.android.gms.internal.gtm.zzgu r10 = r1.zzase     // Catch:{ all -> 0x0492 }
            java.lang.String r13 = "_GTM_DEFAULT_TRACKER_"
            com.google.android.gms.analytics.Tracker r10 = r10.zzbm(r13)     // Catch:{ all -> 0x0492 }
            boolean r0 = com.google.android.gms.internal.gtm.zzha.zza(r0)     // Catch:{ all -> 0x0492 }
            r10.enableAdvertisingIdCollection(r0)     // Catch:{ all -> 0x0492 }
            boolean r0 = com.google.android.gms.internal.gtm.zzha.zza(r9)     // Catch:{ all -> 0x0492 }
            java.lang.String r9 = "name"
            if (r0 == 0) goto L_0x0358
            com.google.android.gms.analytics.HitBuilders$ScreenViewBuilder r7 = new com.google.android.gms.analytics.HitBuilders$ScreenViewBuilder     // Catch:{ all -> 0x0492 }
            r7.<init>()     // Catch:{ all -> 0x0492 }
            java.util.Map r0 = zzi(r11)     // Catch:{ all -> 0x0492 }
            r7.setAll(r0)     // Catch:{ all -> 0x0492 }
            boolean r8 = com.google.android.gms.internal.gtm.zzha.zza(r8)     // Catch:{ all -> 0x0492 }
            if (r8 == 0) goto L_0x00f5
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.zzasf     // Catch:{ all -> 0x0492 }
            java.lang.String r8 = "ecommerce"
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x0492 }
            goto L_0x00fd
        L_0x00f5:
            com.google.android.gms.internal.gtm.zzoa r5 = com.google.android.gms.internal.gtm.zzoo.zzk((com.google.android.gms.internal.gtm.zzoa<?>) r5)     // Catch:{ all -> 0x0492 }
            java.lang.Object r5 = com.google.android.gms.internal.gtm.zzoo.zzj(r5)     // Catch:{ all -> 0x0492 }
        L_0x00fd:
            boolean r8 = r5 instanceof java.util.Map     // Catch:{ all -> 0x0492 }
            if (r8 == 0) goto L_0x034f
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x0492 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0492 }
            if (r0 != 0) goto L_0x0113
            java.lang.String r0 = "currencyCode"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0492 }
        L_0x0113:
            if (r0 == 0) goto L_0x0118
            r7.set(r4, r0)     // Catch:{ all -> 0x0492 }
        L_0x0118:
            java.lang.String r0 = "impressions"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0492 }
            boolean r4 = r0 instanceof java.util.List     // Catch:{ all -> 0x0492 }
            java.lang.String r8 = "list"
            java.lang.String r11 = "Failed to extract a product from event data. "
            if (r4 == 0) goto L_0x0163
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0492 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0492 }
        L_0x012c:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0492 }
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0492 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0492 }
            com.google.android.gms.analytics.ecommerce.Product r12 = zzj(r0)     // Catch:{ RuntimeException -> 0x0146 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ RuntimeException -> 0x0146 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x0146 }
            r7.addImpression(r12, r0)     // Catch:{ RuntimeException -> 0x0146 }
            goto L_0x012c
        L_0x0146:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0492 }
            int r12 = r0.length()     // Catch:{ all -> 0x0492 }
            if (r12 == 0) goto L_0x015a
            java.lang.String r0 = r11.concat(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x015f
        L_0x015a:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0492 }
            r0.<init>(r11)     // Catch:{ all -> 0x0492 }
        L_0x015f:
            com.google.android.gms.internal.gtm.zzev.zzav(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x012c
        L_0x0163:
            boolean r0 = r5.containsKey(r6)     // Catch:{ all -> 0x0492 }
            java.lang.String r4 = "promotions"
            if (r0 == 0) goto L_0x0178
            java.lang.Object r0 = r5.get(r6)     // Catch:{ all -> 0x0492 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0492 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0492 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0492 }
            goto L_0x018c
        L_0x0178:
            boolean r0 = r5.containsKey(r3)     // Catch:{ all -> 0x0492 }
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r5.get(r3)     // Catch:{ all -> 0x0492 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0492 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0492 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0492 }
            goto L_0x018c
        L_0x018b:
            r0 = 0
        L_0x018c:
            java.lang.String r3 = "id"
            if (r0 == 0) goto L_0x021e
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0492 }
        L_0x0194:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0492 }
            if (r0 == 0) goto L_0x0208
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0492 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0492 }
            com.google.android.gms.analytics.ecommerce.Promotion r12 = new com.google.android.gms.analytics.ecommerce.Promotion     // Catch:{ RuntimeException -> 0x01e9 }
            r12.<init>()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.Object r13 = r0.get(r3)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01e9 }
            if (r13 == 0) goto L_0x01b4
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ RuntimeException -> 0x01e9 }
            r12.setId(r13)     // Catch:{ RuntimeException -> 0x01e9 }
        L_0x01b4:
            java.lang.Object r13 = r0.get(r9)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01e9 }
            if (r13 == 0) goto L_0x01c3
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ RuntimeException -> 0x01e9 }
            r12.setName(r13)     // Catch:{ RuntimeException -> 0x01e9 }
        L_0x01c3:
            java.lang.String r13 = "creative"
            java.lang.Object r13 = r0.get(r13)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ RuntimeException -> 0x01e9 }
            if (r13 == 0) goto L_0x01d4
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ RuntimeException -> 0x01e9 }
            r12.setCreative(r13)     // Catch:{ RuntimeException -> 0x01e9 }
        L_0x01d4:
            java.lang.String r13 = "position"
            java.lang.Object r0 = r0.get(r13)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x01e9 }
            if (r0 == 0) goto L_0x01e5
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            r12.setPosition(r0)     // Catch:{ RuntimeException -> 0x01e9 }
        L_0x01e5:
            r7.addPromotion(r12)     // Catch:{ RuntimeException -> 0x01e9 }
            goto L_0x0194
        L_0x01e9:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0492 }
            int r12 = r0.length()     // Catch:{ all -> 0x0492 }
            java.lang.String r13 = "Failed to extract a promotion from event data. "
            if (r12 == 0) goto L_0x01ff
            java.lang.String r0 = r13.concat(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x0204
        L_0x01ff:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0492 }
            r0.<init>(r13)     // Catch:{ all -> 0x0492 }
        L_0x0204:
            com.google.android.gms.internal.gtm.zzev.zzav(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x0194
        L_0x0208:
            boolean r0 = r5.containsKey(r6)     // Catch:{ all -> 0x0492 }
            java.lang.String r4 = "&promoa"
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = "click"
            r7.set(r4, r0)     // Catch:{ all -> 0x0492 }
            r16 = 0
            goto L_0x0220
        L_0x0218:
            java.lang.String r0 = "view"
            r7.set(r4, r0)     // Catch:{ all -> 0x0492 }
        L_0x021e:
            r16 = 1
        L_0x0220:
            if (r16 == 0) goto L_0x034f
            java.util.List<java.lang.String> r0 = zzamg     // Catch:{ all -> 0x0492 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0492 }
        L_0x0228:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0492 }
            if (r4 == 0) goto L_0x034f
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0492 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0492 }
            boolean r6 = r5.containsKey(r4)     // Catch:{ all -> 0x0492 }
            if (r6 == 0) goto L_0x0228
            java.lang.Object r0 = r5.get(r4)     // Catch:{ all -> 0x0492 }
            r5 = r0
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = "products"
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0492 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0492 }
            if (r0 == 0) goto L_0x0280
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0492 }
        L_0x024f:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0492 }
            if (r0 == 0) goto L_0x0280
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x0492 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0492 }
            com.google.android.gms.analytics.ecommerce.Product r0 = zzj(r0)     // Catch:{ RuntimeException -> 0x0263 }
            r7.addProduct(r0)     // Catch:{ RuntimeException -> 0x0263 }
            goto L_0x024f
        L_0x0263:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0492 }
            int r9 = r0.length()     // Catch:{ all -> 0x0492 }
            if (r9 == 0) goto L_0x0277
            java.lang.String r0 = r11.concat(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x027c
        L_0x0277:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0492 }
            r0.<init>(r11)     // Catch:{ all -> 0x0492 }
        L_0x027c:
            com.google.android.gms.internal.gtm.zzev.zzav(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x024f
        L_0x0280:
            boolean r0 = r5.containsKey(r2)     // Catch:{ RuntimeException -> 0x032f }
            if (r0 == 0) goto L_0x0326
            java.lang.Object r0 = r5.get(r2)     // Catch:{ RuntimeException -> 0x032f }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ RuntimeException -> 0x032f }
            com.google.android.gms.analytics.ecommerce.ProductAction r2 = new com.google.android.gms.analytics.ecommerce.ProductAction     // Catch:{ RuntimeException -> 0x032f }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x032f }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x029e
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x032f }
            r2.setTransactionId(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x029e:
            java.lang.String r3 = "affiliation"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x02ad
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x032f }
            r2.setTransactionAffiliation(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x02ad:
            java.lang.String r3 = "coupon"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x02bc
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x032f }
            r2.setTransactionCouponCode(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x02bc:
            java.lang.Object r3 = r0.get(r8)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x02c9
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x032f }
            r2.setProductActionList(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x02c9:
            java.lang.String r3 = "option"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x02d8
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x032f }
            r2.setCheckoutOptions(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x02d8:
            java.lang.String r3 = "revenue"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x02eb
            java.lang.Double r3 = zzm(r3)     // Catch:{ RuntimeException -> 0x032f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x032f }
            r2.setTransactionRevenue(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x02eb:
            java.lang.String r3 = "tax"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x02ff
            java.lang.Double r3 = zzm(r3)     // Catch:{ RuntimeException -> 0x032f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x032f }
            r2.setTransactionTax(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x02ff:
            java.lang.String r3 = "shipping"
            java.lang.Object r3 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r3 == 0) goto L_0x0312
            java.lang.Double r3 = zzm(r3)     // Catch:{ RuntimeException -> 0x032f }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x032f }
            r2.setTransactionShipping(r3)     // Catch:{ RuntimeException -> 0x032f }
        L_0x0312:
            java.lang.String r3 = "step"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ RuntimeException -> 0x032f }
            if (r0 == 0) goto L_0x032b
            java.lang.Integer r0 = zzn(r0)     // Catch:{ RuntimeException -> 0x032f }
            int r0 = r0.intValue()     // Catch:{ RuntimeException -> 0x032f }
            r2.setCheckoutStep(r0)     // Catch:{ RuntimeException -> 0x032f }
            goto L_0x032b
        L_0x0326:
            com.google.android.gms.analytics.ecommerce.ProductAction r2 = new com.google.android.gms.analytics.ecommerce.ProductAction     // Catch:{ RuntimeException -> 0x032f }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x032f }
        L_0x032b:
            r7.setProductAction(r2)     // Catch:{ RuntimeException -> 0x032f }
            goto L_0x034f
        L_0x032f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0492 }
            int r2 = r0.length()     // Catch:{ all -> 0x0492 }
            if (r2 == 0) goto L_0x0345
            java.lang.String r2 = "Failed to extract a product action from event data. "
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x034c
        L_0x0345:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0492 }
            java.lang.String r2 = "Failed to extract a product action from event data. "
            r0.<init>(r2)     // Catch:{ all -> 0x0492 }
        L_0x034c:
            com.google.android.gms.internal.gtm.zzev.zzav(r0)     // Catch:{ all -> 0x0492 }
        L_0x034f:
            java.util.Map r0 = r7.build()     // Catch:{ all -> 0x0492 }
            r10.send(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x048c
        L_0x0358:
            boolean r0 = com.google.android.gms.internal.gtm.zzha.zza(r12)     // Catch:{ all -> 0x0492 }
            if (r0 == 0) goto L_0x0367
            java.util.Map r0 = zzi(r11)     // Catch:{ all -> 0x0492 }
            r10.send(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x048c
        L_0x0367:
            boolean r0 = com.google.android.gms.internal.gtm.zzha.zza(r18)     // Catch:{ all -> 0x0492 }
            if (r0 == 0) goto L_0x0487
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.zzasf     // Catch:{ all -> 0x0492 }
            java.lang.String r2 = "transactionId"
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0492 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0492 }
            if (r0 != 0) goto L_0x0381
            java.lang.String r0 = "Cannot find transactionId in data layer."
            com.google.android.gms.internal.gtm.zzev.zzav(r0)     // Catch:{ all -> 0x0492 }
            goto L_0x048c
        L_0x0381:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0492 }
            r2.<init>()     // Catch:{ all -> 0x0492 }
            java.util.Map r3 = zzi(r11)     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r4 = "transaction"
            r5 = r17
            r3.put(r5, r4)     // Catch:{ IllegalArgumentException -> 0x0480 }
            com.google.android.gms.internal.gtm.zzog r4 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r14 != r4) goto L_0x0399
            java.util.Map<java.lang.String, java.lang.String> r4 = zzasc     // Catch:{ IllegalArgumentException -> 0x0480 }
            goto L_0x039d
        L_0x0399:
            java.util.Map r4 = zzh(r14)     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x039d:
            java.util.Set r4 = r4.entrySet()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x03a5:
            boolean r6 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r6 == 0) goto L_0x03c9
            java.lang.Object r6 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Map<java.lang.String, java.lang.Object> r8 = r1.zzasf     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.Object r12 = r6.getKey()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r8 == 0) goto L_0x03a5
            java.lang.Object r6 = r6.getValue()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IllegalArgumentException -> 0x0480 }
            r3.put(r6, r8)     // Catch:{ IllegalArgumentException -> 0x0480 }
            goto L_0x03a5
        L_0x03c9:
            r2.add(r3)     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.zzasf     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r4 = "transactionProducts"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r3 != 0) goto L_0x03d9
            r3 = 0
            goto L_0x03fa
        L_0x03d9:
            boolean r4 = r3 instanceof java.util.List     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r4 == 0) goto L_0x0477
            java.util.List r3 = (java.util.List) r3     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x03e3:
            boolean r6 = r4.hasNext()     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r6 == 0) goto L_0x03fa
            java.lang.Object r6 = r4.next()     // Catch:{ IllegalArgumentException -> 0x0480 }
            boolean r6 = r6 instanceof java.util.Map     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r6 == 0) goto L_0x03f2
            goto L_0x03e3
        L_0x03f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r2 = "Each element of transactionProducts should be of type Map."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0480 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x03fa:
            if (r3 == 0) goto L_0x0462
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x0400:
            boolean r4 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r4 == 0) goto L_0x0462
            java.lang.Object r4 = r3.next()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.Object r6 = r4.get(r9)     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r6 != 0) goto L_0x0419
            java.lang.String r0 = "Unable to send transaction item hit due to missing 'name' field."
            com.google.android.gms.internal.gtm.zzev.zzav(r0)     // Catch:{ IllegalArgumentException -> 0x0480 }
            goto L_0x048c
        L_0x0419:
            java.util.Map r6 = zzi(r11)     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r8 = "item"
            r6.put(r5, r8)     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r8 = "&ti"
            r6.put(r8, r0)     // Catch:{ IllegalArgumentException -> 0x0480 }
            com.google.android.gms.internal.gtm.zzog r8 = com.google.android.gms.internal.gtm.zzog.zzaum     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r7 != r8) goto L_0x042e
            java.util.Map<java.lang.String, java.lang.String> r8 = zzasd     // Catch:{ IllegalArgumentException -> 0x0480 }
            goto L_0x0432
        L_0x042e:
            java.util.Map r8 = zzh(r7)     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x0432:
            java.util.Set r8 = r8.entrySet()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x043a:
            boolean r12 = r8.hasNext()     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r12 == 0) goto L_0x045e
            java.lang.Object r12 = r8.next()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.Object r13 = r4.get(r13)     // Catch:{ IllegalArgumentException -> 0x0480 }
            if (r13 == 0) goto L_0x043a
            java.lang.Object r12 = r12.getValue()     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r13 = r13.toString()     // Catch:{ IllegalArgumentException -> 0x0480 }
            r6.put(r12, r13)     // Catch:{ IllegalArgumentException -> 0x0480 }
            goto L_0x043a
        L_0x045e:
            r2.add(r6)     // Catch:{ IllegalArgumentException -> 0x0480 }
            goto L_0x0400
        L_0x0462:
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ IllegalArgumentException -> 0x0480 }
            int r0 = r2.size()     // Catch:{ IllegalArgumentException -> 0x0480 }
            r9 = 0
        L_0x0469:
            if (r9 >= r0) goto L_0x048c
            java.lang.Object r3 = r2.get(r9)     // Catch:{ IllegalArgumentException -> 0x0480 }
            int r9 = r9 + 1
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ IllegalArgumentException -> 0x0480 }
            r10.send(r3)     // Catch:{ IllegalArgumentException -> 0x0480 }
            goto L_0x0469
        L_0x0477:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0480 }
            java.lang.String r2 = "transactionProducts should be of type List."
            r0.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0480 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0480 }
        L_0x0480:
            r0 = move-exception
            java.lang.String r2 = "Unable to send transaction"
            com.google.android.gms.internal.gtm.zzev.zza(r2, r0)     // Catch:{ all -> 0x0492 }
            goto L_0x048c
        L_0x0487:
            java.lang.String r0 = "Ignoring unknown tag."
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ all -> 0x0492 }
        L_0x048c:
            r2 = 0
            r1.zzasf = r2
            com.google.android.gms.internal.gtm.zzog r0 = com.google.android.gms.internal.gtm.zzog.zzaum
            return r0
        L_0x0492:
            r0 = move-exception
            r2 = 0
            r1.zzasf = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzmj.zza(com.google.android.gms.internal.gtm.zzfl, com.google.android.gms.internal.gtm.zzoa[]):com.google.android.gms.internal.gtm.zzoa");
    }

    private static Product zzj(Map<String, Object> map) {
        Product product = new Product();
        Object obj = map.get(Name.MARK);
        if (obj != null) {
            product.setId(String.valueOf(obj));
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            product.setName(String.valueOf(obj2));
        }
        Object obj3 = map.get("brand");
        if (obj3 != null) {
            product.setBrand(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            product.setCategory(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            product.setVariant(String.valueOf(obj5));
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            product.setCouponCode(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            product.setPosition(zzn(obj7).intValue());
        }
        Object obj8 = map.get("price");
        if (obj8 != null) {
            product.setPrice(zzm(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            product.setQuantity(zzn(obj9).intValue());
        }
        for (String next : map.keySet()) {
            Matcher matcher = zzamh.matcher(next);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(next)));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(next);
                    zzev.zzac(valueOf.length() != 0 ? "illegal number in custom dimension value: ".concat(valueOf) : new String("illegal number in custom dimension value: "));
                }
            } else {
                Matcher matcher2 = zzami.matcher(next);
                if (matcher2.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher2.group(1)), zzn(map.get(next)).intValue());
                    } catch (NumberFormatException unused2) {
                        String valueOf2 = String.valueOf(next);
                        zzev.zzac(valueOf2.length() != 0 ? "illegal number in custom metric value: ".concat(valueOf2) : new String("illegal number in custom metric value: "));
                    }
                }
            }
        }
        return product;
    }

    private static Map<String, String> zzh(zzoa<?> zzoa) {
        Preconditions.checkNotNull(zzoa);
        Preconditions.checkArgument(zzoa instanceof zzok);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object zzj = zzoo.zzj(zzoo.zzk(zzoa));
        Preconditions.checkState(zzj instanceof Map);
        for (Map.Entry entry : ((Map) zzj).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private static Map<String, String> zzi(zzoa<?> zzoa) {
        Map<String, String> zzh = zzh(zzoa);
        String str = zzh.get("&aip");
        if (str != null && zzasb.contains(str.toLowerCase())) {
            zzh.remove("&aip");
        }
        return zzh;
    }

    private static Double zzm(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf) : new String("Cannot convert the object to Double: "));
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Double: ".concat(valueOf2) : new String("Cannot convert the object to Double: "));
        }
    }

    private static Integer zzn(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                throw new RuntimeException(valueOf.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf) : new String("Cannot convert the object to Integer: "));
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            throw new RuntimeException(valueOf2.length() != 0 ? "Cannot convert the object to Integer: ".concat(valueOf2) : new String("Cannot convert the object to Integer: "));
        }
    }
}

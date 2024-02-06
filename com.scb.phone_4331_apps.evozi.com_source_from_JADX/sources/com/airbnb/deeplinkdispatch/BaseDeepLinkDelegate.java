package com.airbnb.deeplinkdispatch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import p040o.Barrier;

public class BaseDeepLinkDelegate {
    protected static final String TAG = "DeepLinkDelegate";
    protected final List<? extends Parser> loaders;

    public BaseDeepLinkDelegate(List<? extends Parser> list) {
        this.loaders = list;
    }

    private DeepLinkEntry findEntry(String str) {
        for (Parser parseUri : this.loaders) {
            DeepLinkEntry parseUri2 = parseUri.parseUri(str);
            if (parseUri2 != null) {
                return parseUri2;
            }
        }
        return null;
    }

    public DeepLinkResult dispatchFrom(Activity activity) {
        if (activity != null) {
            return dispatchFrom(activity, activity.getIntent());
        }
        throw new NullPointerException("activity == null");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.content.Intent} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: o.setDropDownWidth} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0134, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r11 = r6.getMethod(r8.getMethod(), new java.lang.Class[]{android.content.Context.class, android.os.Bundle.class});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0152, code lost:
        if (r11.getReturnType().equals(p040o.setDropDownWidth.class) != false) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0154, code lost:
        r10 = r11.invoke(r6, new java.lang.Object[]{r0, r9});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0167, code lost:
        if (r10.MediaBrowserCompat$ItemReceiver.size() == 0) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0169, code lost:
        r4 = r8.getUriTemplate();
        r6 = new java.lang.StringBuilder();
        r6.append("Could not deep link to method: ");
        r6.append(r8.getMethod());
        r6.append(" intents length == 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0187, code lost:
        return createResultAndNotify(r0, false, r3, r4, r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0188, code lost:
        r11 = r10.MediaBrowserCompat$ItemReceiver.get(r10.MediaBrowserCompat$ItemReceiver.size() - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0199, code lost:
        r11 = r11.invoke(r6, new java.lang.Object[]{r0, r9});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ea, code lost:
        r1 = r8.getUriTemplate();
        r4 = new java.lang.StringBuilder();
        r4.append("Could not deep link to method: ");
        r4.append(r8.getMethod());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0205, code lost:
        return createResultAndNotify(r0, false, r3, r1, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0206, code lost:
        r1 = r8.getUriTemplate();
        r4 = new java.lang.StringBuilder();
        r4.append("Could not deep link to method: ");
        r4.append(r8.getMethod());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0221, code lost:
        return createResultAndNotify(r0, false, r3, r1, r4.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0135 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ac A[Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b9 A[Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d3 A[Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01da A[Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01de A[Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[ExcHandler: InvocationTargetException (unused java.lang.reflect.InvocationTargetException), SYNTHETIC, Splitter:B:27:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[ExcHandler: IllegalAccessException (unused java.lang.IllegalAccessException), SYNTHETIC, Splitter:B:27:0x00b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.airbnb.deeplinkdispatch.DeepLinkResult dispatchFrom(android.app.Activity r17, android.content.Intent r18) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = " intents length == 0"
            java.lang.String r2 = "Could not deep link to method: "
            if (r0 == 0) goto L_0x0264
            if (r18 == 0) goto L_0x025a
            android.net.Uri r3 = r18.getData()
            r4 = 0
            r5 = 0
            if (r3 != 0) goto L_0x0019
            java.lang.String r1 = "No Uri in given activity's intent."
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r5, r4, r4, r1)
            return r0
        L_0x0019:
            java.lang.String r6 = r3.toString()
            r7 = r16
            com.airbnb.deeplinkdispatch.DeepLinkEntry r8 = r7.findEntry(r6)
            if (r8 == 0) goto L_0x0240
            com.airbnb.deeplinkdispatch.DeepLinkUri r9 = com.airbnb.deeplinkdispatch.DeepLinkUri.parse(r6)
            java.util.Map r6 = r8.getParameters(r6)
            java.util.Set r10 = r9.queryParameterNames()
            java.util.Iterator r10 = r10.iterator()
        L_0x0035:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0075
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.List r12 = r9.queryParameterValues(r11)
            java.util.Iterator r12 = r12.iterator()
        L_0x0049:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0035
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = r6.containsKey(r11)
            if (r14 == 0) goto L_0x0071
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Duplicate parameter name in path and query param: "
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "DeepLinkDelegate"
            android.util.Log.w(r15, r14)
        L_0x0071:
            r6.put(r11, r13)
            goto L_0x0049
        L_0x0075:
            java.lang.String r9 = r3.toString()
            java.lang.String r10 = "deep_link_uri"
            r6.put(r10, r9)
            android.os.Bundle r9 = r18.getExtras()
            if (r9 == 0) goto L_0x008e
            android.os.Bundle r9 = new android.os.Bundle
            android.os.Bundle r10 = r18.getExtras()
            r9.<init>(r10)
            goto L_0x0093
        L_0x008e:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x0093:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x009b:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x00b7
            java.lang.Object r10 = r6.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.lang.String r10 = (java.lang.String) r10
            r9.putString(r11, r10)
            goto L_0x009b
        L_0x00b7:
            java.lang.Class r6 = r8.getActivityClass()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            com.airbnb.deeplinkdispatch.DeepLinkEntry$Type r10 = r8.getType()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            com.airbnb.deeplinkdispatch.DeepLinkEntry$Type r11 = com.airbnb.deeplinkdispatch.DeepLinkEntry.Type.CLASS     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r12 = 1
            if (r10 != r11) goto L_0x00ca
            android.content.Intent r1 = new android.content.Intent     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r1.<init>(r0, r6)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            goto L_0x0131
        L_0x00ca:
            java.lang.String r10 = r8.getMethod()     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            r11[r5] = r13     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.reflect.Method r10 = r6.getMethod(r10, r11)     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class r11 = r10.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class<o.setDropDownWidth> r13 = p040o.setDropDownWidth.class
            boolean r11 = r11.equals(r13)     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            if (r11 == 0) goto L_0x0126
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r11[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Object r10 = r10.invoke(r6, r11)     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            o.setDropDownWidth r10 = (p040o.setDropDownWidth) r10     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.util.ArrayList<android.content.Intent> r11 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            int r11 = r11.size()     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            if (r11 != 0) goto L_0x0115
            java.lang.String r11 = r8.getUriTemplate()     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r13.<init>()     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r13.append(r2)     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.String r14 = r8.getMethod()     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r13.append(r14)     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r13.append(r1)     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.String r13 = r13.toString()     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r5, r3, r11, r13)     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            return r0
        L_0x0115:
            java.util.ArrayList<android.content.Intent> r11 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            int r11 = r11.size()     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            int r11 = r11 - r12
            java.util.ArrayList<android.content.Intent> r13 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Object r11 = r13.get(r11)     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            android.content.Intent r11 = (android.content.Intent) r11     // Catch:{ NoSuchMethodException -> 0x0135, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            goto L_0x01a6
        L_0x0126:
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r11[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Object r10 = r10.invoke(r6, r11)     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            android.content.Intent r10 = (android.content.Intent) r10     // Catch:{ NoSuchMethodException -> 0x0134, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r1 = r10
        L_0x0131:
            r11 = r1
            r10 = r4
            goto L_0x01a6
        L_0x0134:
            r10 = r4
        L_0x0135:
            java.lang.String r11 = r8.getMethod()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r13 = 2
            java.lang.Class[] r14 = new java.lang.Class[r13]     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r14[r5] = r15     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class<android.os.Bundle> r15 = android.os.Bundle.class
            r14[r12] = r15     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.reflect.Method r11 = r6.getMethod(r11, r14)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class r14 = r11.getReturnType()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Class<o.setDropDownWidth> r15 = p040o.setDropDownWidth.class
            boolean r14 = r14.equals(r15)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            if (r14 == 0) goto L_0x0199
            java.lang.Object[] r10 = new java.lang.Object[r13]     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r10[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r10[r12] = r9     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Object r6 = r11.invoke(r6, r10)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r10 = r6
            o.setDropDownWidth r10 = (p040o.setDropDownWidth) r10     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.util.ArrayList<android.content.Intent> r6 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            int r6 = r6.size()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            if (r6 != 0) goto L_0x0188
            java.lang.String r4 = r8.getUriTemplate()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r6.<init>()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r6.append(r2)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.String r9 = r8.getMethod()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r6.append(r9)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r6.append(r1)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.String r1 = r6.toString()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r5, r3, r4, r1)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            return r0
        L_0x0188:
            java.util.ArrayList<android.content.Intent> r1 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            int r1 = r1.size()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            int r1 = r1 - r12
            java.util.ArrayList<android.content.Intent> r6 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Object r1 = r6.get(r1)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r11 = r1
            android.content.Intent r11 = (android.content.Intent) r11     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            goto L_0x01a6
        L_0x0199:
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r1[r5] = r0     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r1[r12] = r9     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.Object r1 = r11.invoke(r6, r1)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r11 = r1
            android.content.Intent r11 = (android.content.Intent) r11     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
        L_0x01a6:
            java.lang.String r1 = r11.getAction()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            if (r1 != 0) goto L_0x01b3
            java.lang.String r1 = r18.getAction()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r11.setAction(r1)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
        L_0x01b3:
            android.net.Uri r1 = r11.getData()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            if (r1 != 0) goto L_0x01c0
            android.net.Uri r1 = r18.getData()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            r11.setData(r1)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
        L_0x01c0:
            r11.putExtras(r9)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.String r1 = "is_deep_link_flag"
            r11.putExtra(r1, r12)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            java.lang.String r1 = "android.intent.extra.REFERRER"
            r11.putExtra(r1, r3)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            android.content.ComponentName r1 = r17.getCallingActivity()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            if (r1 == 0) goto L_0x01d8
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r11.setFlags(r1)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
        L_0x01d8:
            if (r10 == 0) goto L_0x01de
            r10.write()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            goto L_0x01e1
        L_0x01de:
            r0.startActivity(r11)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
        L_0x01e1:
            java.lang.String r1 = r8.getUriTemplate()     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r12, r3, r1, r4)     // Catch:{ NoSuchMethodException -> 0x0222, IllegalAccessException -> 0x0206, InvocationTargetException -> 0x01ea }
            return r0
        L_0x01ea:
            java.lang.String r1 = r8.getUriTemplate()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r8.getMethod()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r5, r3, r1, r2)
            return r0
        L_0x0206:
            java.lang.String r1 = r8.getUriTemplate()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r8.getMethod()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r5, r3, r1, r2)
            return r0
        L_0x0222:
            java.lang.String r1 = r8.getUriTemplate()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Deep link to non-existent method: "
            r2.append(r4)
            java.lang.String r4 = r8.getMethod()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r5, r3, r1, r2)
            return r0
        L_0x0240:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No registered entity to handle deep link: "
            r1.append(r2)
            java.lang.String r2 = r3.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.airbnb.deeplinkdispatch.DeepLinkResult r0 = createResultAndNotify(r0, r5, r3, r4, r1)
            return r0
        L_0x025a:
            r7 = r16
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "sourceIntent == null"
            r0.<init>(r1)
            throw r0
        L_0x0264:
            r7 = r16
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "activity == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate.dispatchFrom(android.app.Activity, android.content.Intent):com.airbnb.deeplinkdispatch.DeepLinkResult");
    }

    private static DeepLinkResult createResultAndNotify(Context context, boolean z, Uri uri, String str, String str2) {
        notifyListener(context, !z, uri, str, str2);
        return new DeepLinkResult(z, uri != null ? uri.toString() : null, str2);
    }

    private static void notifyListener(Context context, boolean z, Uri uri, String str, String str2) {
        String str3;
        Intent intent = new Intent();
        intent.setAction(DeepLinkHandler.ACTION);
        if (uri != null) {
            str3 = uri.toString();
        } else {
            str3 = "";
        }
        intent.putExtra(DeepLinkHandler.EXTRA_URI, str3);
        if (str == null) {
            str = "";
        }
        intent.putExtra(DeepLinkHandler.EXTRA_URI_TEMPLATE, str);
        intent.putExtra(DeepLinkHandler.EXTRA_SUCCESSFUL, !z);
        if (z) {
            intent.putExtra(DeepLinkHandler.EXTRA_ERROR_MESSAGE, str2);
        }
        Barrier.MediaBrowserCompat$CustomActionResultReceiver(context).MediaBrowserCompat$CustomActionResultReceiver(intent);
    }

    public boolean supportsUri(String str) {
        return findEntry(str) != null;
    }
}

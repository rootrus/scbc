package p043rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import p040o.AlertController$RecycleListView;

/* renamed from: rx.exceptions.OnErrorThrowable */
public final class OnErrorThrowable extends RuntimeException {

    /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue */
    public static class OnNextValue extends RuntimeException {
        final Object write;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public OnNextValue(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OnError while emitting onNext value: "
                r0.append(r1)
                if (r4 != 0) goto L_0x000f
                java.lang.String r1 = "null"
                goto L_0x0054
            L_0x000f:
                java.util.Set<java.lang.Class<?>> r1 = p043rx.exceptions.OnErrorThrowable.OnNextValue.read.IconCompatParcelizer
                java.lang.Class r2 = r4.getClass()
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L_0x0020
                java.lang.String r1 = r4.toString()
                goto L_0x0054
            L_0x0020:
                boolean r1 = r4 instanceof java.lang.String
                if (r1 == 0) goto L_0x0028
                r1 = r4
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x0054
            L_0x0028:
                boolean r1 = r4 instanceof java.lang.Enum
                if (r1 == 0) goto L_0x0034
                r1 = r4
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.String r1 = r1.name()
                goto L_0x0054
            L_0x0034:
                o.DocumentInstructionsDetailCustomView r1 = p040o.DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver()
                r1.MediaBrowserCompat$CustomActionResultReceiver()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Class r2 = r4.getClass()
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = ".class"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L_0x0054:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                r3.write = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p043rx.exceptions.OnErrorThrowable.OnNextValue.<init>(java.lang.Object):void");
        }

        /* renamed from: rx.exceptions.OnErrorThrowable$OnNextValue$read */
        static final class read {
            static final Set<Class<?>> IconCompatParcelizer;

            static {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                IconCompatParcelizer = hashSet;
            }
        }
    }

    public static Throwable write(Throwable th, Object obj) {
        int i = 0;
        Throwable th2 = th;
        while (true) {
            if (th2.getCause() == null) {
                break;
            } else if (i >= 25) {
                th2 = new RuntimeException("Stack too deep to get final cause");
                break;
            } else {
                th2 = th2.getCause();
                i++;
            }
        }
        if (th2 != null && (th2 instanceof OnNextValue) && ((OnNextValue) th2).write == obj) {
            return th;
        }
        AlertController$RecycleListView.write(th, (Throwable) new OnNextValue(obj));
        return th;
    }
}

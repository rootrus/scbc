package p040o;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.FragmentBuilder_BindEasycashReferralSendDfwFragment */
public class FragmentBuilder_BindEasycashReferralSendDfwFragment {
    public static final String DEFAULT_IDENTIFIER = "default";
    private final FragmentBuilder_BindEditAddressStatementChannelFragment enforcer;
    private final ThreadLocal<ConcurrentLinkedQueue<C6517x48288167>> eventsToDispatch;
    private final ConcurrentMap<Class<?>, Set<Class<?>>> flattenHierarchyCache;
    private final FragmentBuilder_BindEasycashSalesheetEmptyFragment handlerFinder;
    private final ConcurrentMap<Class<?>, Set<FragmentBuilder_BindEasycashWorkAddressFragment>> handlersByType;
    private final String identifier;
    private final ThreadLocal<Boolean> isDispatching;
    private final ConcurrentMap<Class<?>, FragmentBuilder_BindEasycashSuccessFragment> producersByType;

    public FragmentBuilder_BindEasycashReferralSendDfwFragment() {
        this(DEFAULT_IDENTIFIER);
    }

    public FragmentBuilder_BindEasycashReferralSendDfwFragment(String str) {
        this(FragmentBuilder_BindEditAddressStatementChannelFragment.read, str);
    }

    public FragmentBuilder_BindEasycashReferralSendDfwFragment(FragmentBuilder_BindEditAddressStatementChannelFragment fragmentBuilder_BindEditAddressStatementChannelFragment) {
        this(fragmentBuilder_BindEditAddressStatementChannelFragment, DEFAULT_IDENTIFIER);
    }

    public FragmentBuilder_BindEasycashReferralSendDfwFragment(FragmentBuilder_BindEditAddressStatementChannelFragment fragmentBuilder_BindEditAddressStatementChannelFragment, String str) {
        this(fragmentBuilder_BindEditAddressStatementChannelFragment, str, FragmentBuilder_BindEasycashSalesheetEmptyFragment.IconCompatParcelizer);
    }

    FragmentBuilder_BindEasycashReferralSendDfwFragment(FragmentBuilder_BindEditAddressStatementChannelFragment fragmentBuilder_BindEditAddressStatementChannelFragment, String str, FragmentBuilder_BindEasycashSalesheetEmptyFragment fragmentBuilder_BindEasycashSalesheetEmptyFragment) {
        this.handlersByType = new ConcurrentHashMap();
        this.producersByType = new ConcurrentHashMap();
        this.eventsToDispatch = new ThreadLocal<ConcurrentLinkedQueue<C6517x48288167>>() {
            /* access modifiers changed from: protected */
            public final /* synthetic */ Object initialValue() {
                return new ConcurrentLinkedQueue();
            }
        };
        this.isDispatching = new ThreadLocal<Boolean>() {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ Object initialValue() {
                return Boolean.FALSE;
            }
        };
        this.flattenHierarchyCache = new ConcurrentHashMap();
        this.enforcer = fragmentBuilder_BindEditAddressStatementChannelFragment;
        this.identifier = str;
        this.handlerFinder = fragmentBuilder_BindEasycashSalesheetEmptyFragment;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Bus \"");
        sb.append(this.identifier);
        sb.append("\"]");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        r2 = new java.util.concurrent.CopyOnWriteArraySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void register(java.lang.Object r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0121
            o.FragmentBuilder_BindEditAddressStatementChannelFragment r0 = r5.enforcer
            r0.MediaBrowserCompat$ItemReceiver(r5)
            o.FragmentBuilder_BindEasycashSalesheetEmptyFragment r0 = r5.handlerFinder
            java.util.Map r0 = r0.write(r6)
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r3 = r0.get(r2)
            o.FragmentBuilder_BindEasycashSuccessFragment r3 = (p040o.FragmentBuilder_BindEasycashSuccessFragment) r3
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, o.FragmentBuilder_BindEasycashSuccessFragment> r4 = r5.producersByType
            java.lang.Object r4 = r4.putIfAbsent(r2, r3)
            o.FragmentBuilder_BindEasycashSuccessFragment r4 = (p040o.FragmentBuilder_BindEasycashSuccessFragment) r4
            if (r4 != 0) goto L_0x0055
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<o.FragmentBuilder_BindEasycashWorkAddressFragment>> r4 = r5.handlersByType
            java.lang.Object r2 = r4.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0015
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0015
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0015
            java.lang.Object r4 = r2.next()
            o.FragmentBuilder_BindEasycashWorkAddressFragment r4 = (p040o.FragmentBuilder_BindEasycashWorkAddressFragment) r4
            r5.dispatchProducerResultToHandler(r4, r3)
            goto L_0x0045
        L_0x0055:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Producer method for type "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = " found on type "
            r6.append(r0)
            java.lang.Object r0 = r3.IconCompatParcelizer
            java.lang.Class r0 = r0.getClass()
            r6.append(r0)
            java.lang.String r0 = ", but already registered by type "
            r6.append(r0)
            java.lang.Object r0 = r4.IconCompatParcelizer
            java.lang.Class r0 = r0.getClass()
            r6.append(r0)
            java.lang.String r0 = "."
            r6.append(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x008d:
            o.FragmentBuilder_BindEasycashSalesheetEmptyFragment r0 = r5.handlerFinder
            java.util.Map r6 = r0.MediaBrowserCompat$CustomActionResultReceiver(r6)
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<o.FragmentBuilder_BindEasycashWorkAddressFragment>> r2 = r5.handlersByType
            java.lang.Object r2 = r2.get(r1)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x00c1
            java.util.concurrent.CopyOnWriteArraySet r2 = new java.util.concurrent.CopyOnWriteArraySet
            r2.<init>()
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<o.FragmentBuilder_BindEasycashWorkAddressFragment>> r3 = r5.handlersByType
            java.lang.Object r3 = r3.putIfAbsent(r1, r2)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 == 0) goto L_0x00c1
            r2 = r3
        L_0x00c1:
            java.lang.Object r1 = r6.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r2.addAll(r1)
            if (r1 == 0) goto L_0x00ce
            goto L_0x009b
        L_0x00ce:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Object already registered."
            r6.<init>(r0)
            throw r6
        L_0x00d6:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00de:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, o.FragmentBuilder_BindEasycashSuccessFragment> r2 = r5.producersByType
            java.lang.Object r1 = r2.get(r1)
            o.FragmentBuilder_BindEasycashSuccessFragment r1 = (p040o.FragmentBuilder_BindEasycashSuccessFragment) r1
            if (r1 == 0) goto L_0x00de
            boolean r2 = r1.write
            if (r2 == 0) goto L_0x00de
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0108:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r0.next()
            o.FragmentBuilder_BindEasycashWorkAddressFragment r2 = (p040o.FragmentBuilder_BindEasycashWorkAddressFragment) r2
            boolean r3 = r1.write
            if (r3 == 0) goto L_0x00de
            boolean r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 == 0) goto L_0x0108
            r5.dispatchProducerResultToHandler(r2, r1)
            goto L_0x0108
        L_0x0120:
            return
        L_0x0121:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Object to register must not be null."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindEasycashReferralSendDfwFragment.register(java.lang.Object):void");
    }

    private void dispatchProducerResultToHandler(FragmentBuilder_BindEasycashWorkAddressFragment fragmentBuilder_BindEasycashWorkAddressFragment, FragmentBuilder_BindEasycashSuccessFragment fragmentBuilder_BindEasycashSuccessFragment) {
        Object obj;
        try {
            obj = fragmentBuilder_BindEasycashSuccessFragment.read();
        } catch (InvocationTargetException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Producer ");
            sb.append(fragmentBuilder_BindEasycashSuccessFragment);
            sb.append(" threw an exception.");
            throwRuntimeException(sb.toString(), e);
            obj = null;
        }
        if (obj != null) {
            dispatch(obj, fragmentBuilder_BindEasycashWorkAddressFragment);
        }
    }

    public void unregister(Object obj) {
        if (obj != null) {
            this.enforcer.MediaBrowserCompat$ItemReceiver(this);
            for (Map.Entry next : this.handlerFinder.write(obj).entrySet()) {
                Class cls = (Class) next.getKey();
                FragmentBuilder_BindEasycashSuccessFragment producerForEventType = getProducerForEventType(cls);
                FragmentBuilder_BindEasycashSuccessFragment fragmentBuilder_BindEasycashSuccessFragment = (FragmentBuilder_BindEasycashSuccessFragment) next.getValue();
                if (fragmentBuilder_BindEasycashSuccessFragment == null || !fragmentBuilder_BindEasycashSuccessFragment.equals(producerForEventType)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Missing event producer for an annotated method. Is ");
                    sb.append(obj.getClass());
                    sb.append(" registered?");
                    throw new IllegalArgumentException(sb.toString());
                }
                ((FragmentBuilder_BindEasycashSuccessFragment) this.producersByType.remove(cls)).write = false;
            }
            for (Map.Entry next2 : this.handlerFinder.MediaBrowserCompat$CustomActionResultReceiver(obj).entrySet()) {
                Set<FragmentBuilder_BindEasycashWorkAddressFragment> handlersForEventType = getHandlersForEventType((Class) next2.getKey());
                Collection collection = (Collection) next2.getValue();
                if (handlersForEventType == null || !handlersForEventType.containsAll(collection)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Missing event handler for an annotated method. Is ");
                    sb2.append(obj.getClass());
                    sb2.append(" registered?");
                    throw new IllegalArgumentException(sb2.toString());
                }
                for (FragmentBuilder_BindEasycashWorkAddressFragment next3 : handlersForEventType) {
                    if (collection.contains(next3)) {
                        next3.MediaBrowserCompat$CustomActionResultReceiver = false;
                    }
                }
                handlersForEventType.removeAll(collection);
            }
            return;
        }
        throw new NullPointerException("Object to unregister must not be null.");
    }

    public void post(Object obj) {
        if (obj != null) {
            this.enforcer.MediaBrowserCompat$ItemReceiver(this);
            boolean z = false;
            for (Class<?> handlersForEventType : flattenHierarchy(obj.getClass())) {
                Set<FragmentBuilder_BindEasycashWorkAddressFragment> handlersForEventType2 = getHandlersForEventType(handlersForEventType);
                if (handlersForEventType2 != null && !handlersForEventType2.isEmpty()) {
                    for (FragmentBuilder_BindEasycashWorkAddressFragment enqueueEvent : handlersForEventType2) {
                        enqueueEvent(obj, enqueueEvent);
                    }
                    z = true;
                }
            }
            if (!z && !(obj instanceof FragmentBuilder_BindEasycashReferralSendProductFragment)) {
                post(new FragmentBuilder_BindEasycashReferralSendProductFragment());
            }
            dispatchQueuedEvents();
            return;
        }
        throw new NullPointerException("Event to post must not be null.");
    }

    /* access modifiers changed from: protected */
    public void enqueueEvent(Object obj, FragmentBuilder_BindEasycashWorkAddressFragment fragmentBuilder_BindEasycashWorkAddressFragment) {
        this.eventsToDispatch.get().offer(new C6517x48288167(obj, fragmentBuilder_BindEasycashWorkAddressFragment));
    }

    /* access modifiers changed from: protected */
    public void dispatchQueuedEvents() {
        if (!this.isDispatching.get().booleanValue()) {
            this.isDispatching.set(Boolean.TRUE);
            while (true) {
                try {
                    C6517x48288167 fragmentBuilder_BindEasycashReferralSendDfwFragment$MediaBrowserCompat$CustomActionResultReceiver = (C6517x48288167) this.eventsToDispatch.get().poll();
                    if (fragmentBuilder_BindEasycashReferralSendDfwFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
                        if (fragmentBuilder_BindEasycashReferralSendDfwFragment$MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$CustomActionResultReceiver) {
                            dispatch(fragmentBuilder_BindEasycashReferralSendDfwFragment$MediaBrowserCompat$CustomActionResultReceiver.read, fragmentBuilder_BindEasycashReferralSendDfwFragment$MediaBrowserCompat$CustomActionResultReceiver.write);
                        }
                    } else {
                        return;
                    }
                } finally {
                    this.isDispatching.set(Boolean.FALSE);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public FragmentBuilder_BindEasycashSuccessFragment getProducerForEventType(Class<?> cls) {
        return (FragmentBuilder_BindEasycashSuccessFragment) this.producersByType.get(cls);
    }

    /* access modifiers changed from: package-private */
    public Set<FragmentBuilder_BindEasycashWorkAddressFragment> getHandlersForEventType(Class<?> cls) {
        return (Set) this.handlersByType.get(cls);
    }

    /* access modifiers changed from: package-private */
    public Set<Class<?>> flattenHierarchy(Class<?> cls) {
        Set<Class<?>> set = (Set) this.flattenHierarchyCache.get(cls);
        if (set != null) {
            return set;
        }
        Set<Class<?>> classesFor = getClassesFor(cls);
        Set<Class<?>> putIfAbsent = this.flattenHierarchyCache.putIfAbsent(cls, classesFor);
        return putIfAbsent != null ? putIfAbsent : classesFor;
    }

    private Set<Class<?>> getClassesFor(Class<?> cls) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(cls);
        while (!linkedList.isEmpty()) {
            Class cls2 = (Class) linkedList.remove(0);
            hashSet.add(cls2);
            Class superclass = cls2.getSuperclass();
            if (superclass != null) {
                linkedList.add(superclass);
            }
        }
        return hashSet;
    }

    private static void throwRuntimeException(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": ");
            sb.append(cause.getMessage());
            throw new RuntimeException(sb.toString(), cause);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(": ");
        sb2.append(invocationTargetException.getMessage());
        throw new RuntimeException(sb2.toString(), invocationTargetException);
    }

    /* access modifiers changed from: protected */
    public void dispatch(Object obj, FragmentBuilder_BindEasycashWorkAddressFragment fragmentBuilder_BindEasycashWorkAddressFragment) {
        try {
            if (fragmentBuilder_BindEasycashWorkAddressFragment.MediaBrowserCompat$CustomActionResultReceiver) {
                fragmentBuilder_BindEasycashWorkAddressFragment.IconCompatParcelizer.invoke(fragmentBuilder_BindEasycashWorkAddressFragment.MediaBrowserCompat$ItemReceiver, new Object[]{obj});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(fragmentBuilder_BindEasycashWorkAddressFragment.toString());
            sb.append(" has been invalidated and can no longer handle events.");
            throw new IllegalStateException(sb.toString());
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not dispatch event: ");
            sb2.append(obj.getClass());
            sb2.append(" to handler ");
            sb2.append(fragmentBuilder_BindEasycashWorkAddressFragment);
            throwRuntimeException(sb2.toString(), e3);
        }
    }
}

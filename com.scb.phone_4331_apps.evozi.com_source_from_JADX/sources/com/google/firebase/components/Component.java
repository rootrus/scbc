package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Component<T> {
    private final Set<Dependency> dependencies;
    private final ComponentFactory<T> factory;
    private final int instantiation;
    private final Set<Class<? super T>> providedInterfaces;
    private final Set<Class<?>> publishedEvents;
    private final int type;

    static /* synthetic */ Object lambda$intoSet$2(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ Object lambda$of$1(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    private Component(Set<Class<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.providedInterfaces = Collections.unmodifiableSet(set);
        this.dependencies = Collections.unmodifiableSet(set2);
        this.instantiation = i;
        this.type = i2;
        this.factory = componentFactory;
        this.publishedEvents = Collections.unmodifiableSet(set3);
    }

    public final Set<Class<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public final Set<Dependency> getDependencies() {
        return this.dependencies;
    }

    public final ComponentFactory<T> getFactory() {
        return this.factory;
    }

    public final Set<Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public final boolean isAlwaysEager() {
        return this.instantiation == 1;
    }

    public final boolean isEagerInDefaultApp() {
        return this.instantiation == 2;
    }

    public final boolean isValue() {
        return this.type == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.providedInterfaces.toArray()));
        sb.append(">{");
        sb.append(this.instantiation);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.dependencies.toArray()));
        sb.append("}");
        return sb.toString();
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    @SafeVarargs
    /* renamed from: of */
    public static <T> Component<T> m97of(T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(Component$$Lambda$2.lambdaFactory$(t)).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).intoSet();
    }

    public static <T> Component<T> intoSet(T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(Component$$Lambda$3.lambdaFactory$(t)).build();
    }

    public static class Builder<T> {
        private final Set<Dependency> dependencies;
        private ComponentFactory<T> factory;
        private int instantiation;
        private final Set<Class<? super T>> providedInterfaces;
        private Set<Class<?>> publishedEvents;
        private int type;

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.providedInterfaces = new HashSet();
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            this.providedInterfaces.add(cls);
            for (Class<? super T> checkNotNull : clsArr) {
                Preconditions.checkNotNull(checkNotNull, "Null interface");
            }
            Collections.addAll(this.providedInterfaces, clsArr);
        }

        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            validateInterface(dependency.getInterface());
            this.dependencies.add(dependency);
            return this;
        }

        public Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        public Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        private Builder<T> setInstantiation(int i) {
            Preconditions.checkState(this.instantiation == 0, "Instantiation type has already been set.");
            this.instantiation = i;
            return this;
        }

        private void validateInterface(Class<?> cls) {
            Preconditions.checkArgument(!this.providedInterfaces.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.factory = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        /* access modifiers changed from: private */
        public Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        public Component<T> build() {
            Preconditions.checkState(this.factory != null, "Missing required property: factory.");
            return new Component(new HashSet(this.providedInterfaces), new HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents);
        }
    }
}

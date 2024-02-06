package com.google.firebase.components;

public final class Dependency {
    private final Class<?> anInterface;
    private final int injection;
    private final int type;

    private Dependency(Class<?> cls, int i, int i2) {
        this.anInterface = (Class) Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.type = i;
        this.injection = i2;
    }

    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency setOf(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public final Class<?> getInterface() {
        return this.anInterface;
    }

    public final boolean isRequired() {
        return this.type == 1;
    }

    public final boolean isSet() {
        return this.type == 2;
    }

    public final boolean isDirectInjection() {
        return this.injection == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Dependency)) {
            return false;
        }
        Dependency dependency = (Dependency) obj;
        if (this.anInterface == dependency.anInterface && this.type == dependency.type && this.injection == dependency.injection) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ this.type) * 1000003) ^ this.injection;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.anInterface);
        sb.append(", type=");
        int i = this.type;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.injection != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

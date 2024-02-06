package p040o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.rsnAllocationIoSend */
public @interface rsnAllocationIoSend {
    String write() default "##default";
}

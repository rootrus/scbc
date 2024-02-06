package p040o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: o.onClickPay */
public @interface onClickPay {
    String IconCompatParcelizer() default "";

    int[] MediaBrowserCompat$CustomActionResultReceiver() default {};

    String MediaBrowserCompat$ItemReceiver() default "";

    String read() default "";

    int write() default 1;
}

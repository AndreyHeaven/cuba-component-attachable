package de.diedavids.cuba.attachable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Attachable {
    String listComponent() default "";
    String buttonId() default "attachmentsBtn";
    String buttonsPanel() default "buttonsPanel";
}
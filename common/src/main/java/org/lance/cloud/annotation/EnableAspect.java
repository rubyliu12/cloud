package org.lance.cloud.annotation;

import org.lance.cloud.fixture.GlobalAspect;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import(GlobalAspect.class)
public @interface EnableAspect {
}

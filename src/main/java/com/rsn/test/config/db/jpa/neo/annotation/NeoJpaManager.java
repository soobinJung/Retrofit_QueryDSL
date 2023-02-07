package com.rsn.test.config.db.jpa.neo.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME) @Documented
@Qualifier("NeoJpaManager")
public @interface NeoJpaManager {
}

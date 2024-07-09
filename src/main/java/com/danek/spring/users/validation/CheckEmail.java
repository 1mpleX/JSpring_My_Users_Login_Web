package com.danek.spring.users.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    String[] value() default {"@gmail.com", "@yahoo.com", "@hotmail.com", "@outlook.com", "@aol.com",
            "@icloud.com", "@mail.com", "@yandex.ru", "@mail.ru", "@inbox.ru",
            "@list.ru", "@bk.ru", "@gmx.com", "@protonmail.com", "@zoho.com",
            "@live.com", "@me.com", "@qq.com", "@163.com", "@sina.com"};
    String message() default "Email must be type @xxx.xx";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

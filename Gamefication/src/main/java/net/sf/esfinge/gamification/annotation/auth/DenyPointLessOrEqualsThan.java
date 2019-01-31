package net.sf.esfinge.gamification.annotation.auth;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.esfinge.guardian.annotation.config.AuthorizerClass;

import net.sf.esfinge.gamification.guardian.auth.points.DenyPointLessThanAuthorizer;
import net.sf.esfinge.metadata.annotation.validator.NotNull;

/**
 * 
 * Annotation for validate a minimum quantity of points
 * 
 * @param quantity        minimum quantity for user access resources
 * @param achievementName achievement to listen
 *
 */

@Retention(RUNTIME)
@Target(METHOD)
@AuthorizerClass(DenyPointLessThanAuthorizer.class)
public @interface DenyPointLessOrEqualsThan {
	
	@NotNull int quantity();
	@NotNull String achievementName();

}

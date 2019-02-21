package net.sf.esfinge.gamification.annotation.auth.ranking;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.esfinge.guardian.annotation.config.AuthorizerClass;

import net.sf.esfinge.gamification.guardian.auth.ranking.DenyRankingOrLevelAuthorizer;
import net.sf.esfinge.metadata.annotation.validator.NotNull;

@Retention(RUNTIME)
@Target(METHOD)
@AuthorizerClass(DenyRankingOrLevelAuthorizer.class)
public @interface DenyRankingOrLevel {

	@NotNull String achievementName();
	@NotNull String level();

}

package net.sf.esfinge.gamification.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.sf.esfinge.gamification.processors.RemoveRewardProcessor;
import net.sf.esfinge.gamification.validate.annotation.ProhibitsGamification;
import net.sf.esfinge.metadata.annotation.validator.NotNull;
import net.sf.esfinge.metadata.annotation.validator.SearchInsideAnnotations;
import net.sf.esfinge.metadata.annotation.validator.SearchOnEnclosingElements;
@SearchOnEnclosingElements
@SearchInsideAnnotations
@Retention(RetentionPolicy.RUNTIME)
@ProhibitsGamification(RewardsToUser.class)
@Target({ElementType.METHOD,ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@GamificationProcessor(RemoveRewardProcessor.class)
public @interface RemoveReward {
	boolean used();
	@NotNull
	String name();
}

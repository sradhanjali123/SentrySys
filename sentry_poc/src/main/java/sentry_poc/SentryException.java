package sentry_poc;
import sentry_poc.*;
import io.sentry.*;
//import io.sentry.spring.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SentryException {
	@Bean
	public SentryServletContextInitializer sentryServletContextInitializer() {
	    return new SentryServletContextInitializer();
	}
	@Bean
	public SentryExceptionResolver  sentryExceptionResolver() {
	    return new SentryExceptionResolver();
	}

}
